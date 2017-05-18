/*
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

#import <JavaNativeFoundation/JavaNativeFoundation.h>

#import "java_awt_Font.h"
#import "sun_awt_PlatformFont.h"
#import "sun_awt_FontDescriptor.h"
#import "sun_font_CFont.h"
#import "sun_font_CFontManager.h"

#import "AWTFont.h"
#import "AWTStrike.h"
#import "CoreTextSupport.h"


#define DEBUG

@implementation AWTFont

- (id) initWithFont:(NSFont *)font isFakeItalic:(BOOL)isFakeItalic {
    self = [super init];
    if (self) {
        fIsFakeItalic = isFakeItalic;
        fFont = [font retain];
        fNativeCGFont = CTFontCopyGraphicsFont((CTFontRef)font, NULL);
    }
    return self;
}

- (void) dealloc {
    [fFont release];
    fFont = nil;

    if (fNativeCGFont) {
        CGFontRelease(fNativeCGFont);
    fNativeCGFont = NULL;
    }

    [super dealloc];
}

- (void) finalize {
    if (fNativeCGFont) {
        CGFontRelease(fNativeCGFont);
    fNativeCGFont = NULL;
    }
    [super finalize];
}

+ (AWTFont *) awtFontForName:(NSString *)name
                       style:(int)style
                isFakeItalic:(BOOL)isFakeItalic
{
    // create font with family & size
    NSFont *nsFont = [NSFont fontWithName:name size:1.0];

    if (nsFont == nil) {
        // if can't get font of that name, substitute system default font
        nsFont = [NSFont fontWithName:@"Lucida Grande" size:1.0];
#ifdef DEBUG
        NSLog(@"needed to substitute Lucida Grande for: %@", name);
#endif
    }

    // create an italic style (if one is installed)
    if (style & java_awt_Font_ITALIC) {
        nsFont = [[NSFontManager sharedFontManager] convertFont:nsFont toHaveTrait:NSItalicFontMask];
    }

    // create a bold style (if one is installed)
    if (style & java_awt_Font_BOLD) {
        nsFont = [[NSFontManager sharedFontManager] convertFont:nsFont toHaveTrait:NSBoldFontMask];
    }

    return [[[AWTFont alloc] initWithFont:nsFont isFakeItalic:isFakeItalic] autorelease];
}

+ (NSFont *) nsFontForJavaFont:(jobject)javaFont env:(JNIEnv *)env {
    if (javaFont == NULL) {
#ifdef DEBUG
        NSLog(@"nil font");
#endif
        return nil;
    }

    static JNF_CLASS_CACHE(jc_Font, "java/awt/Font");

    // obtain the Font2D
    static JNF_MEMBER_CACHE(jm_Font_getFont2D, jc_Font, "getFont2D", "()Lsun/font/Font2D;");
    jobject font2d = JNFCallObjectMethod(env, javaFont, jm_Font_getFont2D);
    if (font2d == NULL) {
#ifdef DEBUG
        NSLog(@"nil font2d");
#endif
        return nil;
    }

    // if it's not a CFont, it's likely one of TTF or OTF fonts
    // from the Sun rendering loops
    static JNF_CLASS_CACHE(jc_CFont, "sun/font/CFont");
    if (!JNFIsInstanceOf(env, font2d, &jc_CFont)) {
#ifdef DEBUG
        NSLog(@"font2d !instanceof CFont");
#endif
        return nil;
    }

    static JNF_MEMBER_CACHE(jm_CFont_getFontStrike, jc_CFont, "getStrike", "(Ljava/awt/Font;)Lsun/font/FontStrike;");
    jobject fontStrike = JNFCallObjectMethod(env, font2d, jm_CFont_getFontStrike, javaFont);

    static JNF_CLASS_CACHE(jc_CStrike, "sun/font/CStrike");
    if (!JNFIsInstanceOf(env, fontStrike, &jc_CStrike)) {
#ifdef DEBUG
        NSLog(@"fontStrike !instanceof CStrike");
#endif
        return nil;
    }

    static JNF_MEMBER_CACHE(jm_CStrike_nativeStrikePtr, jc_CStrike, "getNativeStrikePtr", "()J");
    jlong awtStrikePtr = JNFCallLongMethod(env, fontStrike, jm_CStrike_nativeStrikePtr);
    if (awtStrikePtr == 0L) {
#ifdef DEBUG
        NSLog(@"nil nativeFontPtr from CFont");
#endif
        return nil;
    }

    AWTStrike *strike = (AWTStrike *)jlong_to_ptr(awtStrikePtr);

    return [NSFont fontWithName:[strike->fAWTFont->fFont fontName] matrix:(CGFloat *)(&(strike->fAltTx))];
}

@end


#pragma mark --- Font Discovery and Loading ---

static NSArray* sFilteredFonts = nil;
static NSDictionary* sFontFamilyTable = nil;

static NSString*
GetFamilyNameForFontName(NSString* fontname)
{
    return [sFontFamilyTable objectForKey:fontname];
}

static NSArray*
GetFilteredFonts()
{
    if (sFilteredFonts == nil) {
        NSFontManager *fontManager = [NSFontManager sharedFontManager];
        NSUInteger fontCount = [[fontManager availableFonts] count];

        NSMutableArray *allFonts = [[NSMutableArray alloc] initWithCapacity:fontCount];
        NSMutableDictionary* fontFamilyTable = [[NSMutableDictionary alloc] initWithCapacity:fontCount];
        NSArray *allFamilies = [fontManager availableFontFamilies];

        NSUInteger familyCount = [allFamilies count];

        NSUInteger familyIndex;
        for (familyIndex = 0; familyIndex < familyCount; familyIndex++) {
            NSString *family = [allFamilies objectAtIndex:familyIndex];

            if ((family == nil) || [family characterAtIndex:0] == '.') {
                continue;
            }

            NSArray *fontFaces = [fontManager availableMembersOfFontFamily:family];
            NSUInteger faceCount = [fontFaces count];

            NSUInteger faceIndex;
            for (faceIndex = 0; faceIndex < faceCount; faceIndex++) {
                NSString* face = [[fontFaces objectAtIndex:faceIndex] objectAtIndex:0];
                if (face != nil) {
                    [allFonts addObject:face];
                    [fontFamilyTable setObject:family forKey:face];
                }
            }
        }

        sFilteredFonts = allFonts;
        sFontFamilyTable = fontFamilyTable;
    }

    return sFilteredFonts;
}

#pragma mark --- sun.font.CFontManager JNI ---

static OSStatus CreateFSRef(FSRef *myFSRefPtr, NSString *inPath)
{
    return FSPathMakeRef((UInt8 *)[inPath fileSystemRepresentation],
                         myFSRefPtr, NULL);
}

// /*
//  * Class:     sun_font_CFontManager
//  * Method:    loadFileFont
//  * Signature: (Ljava/lang/String;)Lsun/font/Font2D;
//  */
// JNIEXPORT /* sun.font.CFont */ jobject JNICALL
// Java_sun_font_CFontManager_loadFileFont
//     (JNIEnv *env, jclass obj, jstring fontpath)
// {
//     jobject result = NULL;
//
// JNF_COCOA_ENTER(env);
//
//     NSString *nsFilePath = JNFJavaToNSString(env, fontpath);
//     jstring javaFontName = NULL;
//
//     //
//     // Note: This API uses ATS and can therefore return Carbon error codes.
//     // These codes can be found at:
//     // http://developer.apple.com/techpubs/macosx/Carbon/Files/FileManager/File_Manager/ResultCodes/ResultCodes.html
//     //
//
//     FSRef iFile;
//     OSStatus status = CreateFSRef(&iFile, nsFilePath);
//
//     if (status == noErr) {
//         ATSFontContainerRef oContainer;
//         status = ATSFontActivateFromFileReference(&iFile, kATSFontContextLocal,
//                                                   kATSFontFormatUnspecified,
//                                                   NULL,
//                                                   kATSOptionFlagsUseDataFork,
//                                                   &oContainer);
//         if (status == noErr) {
//             ATSFontRef ioArray[1];
//             ItemCount oCount;
//             status = ATSFontFindFromContainer(oContainer,
//                                               kATSOptionFlagsUseDataFork,
//                                               1, ioArray, &oCount);
//
//             if (status == noErr) {
//                 CFStringRef oName;
//                 status = ATSFontGetPostScriptName(ioArray[0],
//                                                   kATSOptionFlagsUseDataFork,
//                                                   &oName);
//                 if (status == noErr) {
//                     javaFontName = JNFNSToJavaString(env, (NSString *)oName);
//                     CFRelease(oName);
//                 }
//             }
//         }
//     }
//
//     if (javaFontName != NULL) {
//         // create the CFont!
//         static JNF_CLASS_CACHE(sjc_CFont, "sun/font/CFont");
//         static JNF_CTOR_CACHE(sjf_CFont_ctor,
//                               sjc_CFont, "(Ljava/lang/String;)V");
//         result = JNFNewObject(env, sjf_CFont_ctor, javaFontName);
//     }
//
// JNF_COCOA_EXIT(env);
//
//     return result;
// }

/*
 * Class:     sun_font_CFontManager
 * Method:    loadNativeFonts
 * Signature: ()V
 */
JNIEXPORT void JNICALL
Java_sun_font_CFontManager_loadNativeFonts
    (JNIEnv *env, jobject jthis)
{
    static JNF_CLASS_CACHE(jc_CFontManager,
                           "sun/font/CFontManager");
    static JNF_MEMBER_CACHE(jm_registerFont, jc_CFontManager,
                            "registerFont",
                            "(Ljava/lang/String;Ljava/lang/String;)V");

    jint num = 0;

JNF_COCOA_ENTER(env);

    NSArray *filteredFonts = GetFilteredFonts();
    num = (jint)[filteredFonts count];

    jint i;
    for (i = 0; i < num; i++) {
        NSString *fontname = [filteredFonts objectAtIndex:i];
        jobject jFontName = JNFNSToJavaString(env, fontname);
        jobject jFontFamilyName =
            JNFNSToJavaString(env, GetFamilyNameForFontName(fontname));

        JNFCallVoidMethod(env, jthis,
                          jm_registerFont, jFontName, jFontFamilyName);
    }

JNF_COCOA_EXIT(env);
}

/*
 * Class:     Java_sun_font_CFontManager_loadNativeDirFonts
 * Method:    loadNativeDirFonts
 * Signature: (Ljava/lang/String;)V;
 */
JNIEXPORT void JNICALL
Java_sun_font_CFontManager_loadNativeDirFonts
(JNIEnv *env, jclass clz, jstring filename)
{
JNF_COCOA_ENTER(env);

    NSString *nsFilePath = JNFJavaToNSString(env, filename);

    FSRef iFile;
    OSStatus status = CreateFSRef(&iFile, nsFilePath);

    if (status == noErr) {
        ATSFontContainerRef oContainer;
        status = ATSFontActivateFromFileReference(&iFile, kATSFontContextLocal,
                                                  kATSFontFormatUnspecified,
                                                  NULL, kNilOptions,
                                                  &oContainer);
    }

JNF_COCOA_EXIT(env);
}

#pragma mark --- sun.font.CFont JNI ---

/*
 * Class:     sun_font_CFont
 * Method:    initNativeFont
 * Signature: (Ljava/lang/String;I)J
 */
JNIEXPORT jlong JNICALL
Java_sun_font_CFont_createNativeFont
    (JNIEnv *env, jclass clazz,
     jstring nativeFontName, jint style, jboolean isFakeItalic)
{
    AWTFont *awtFont = nil;

JNF_COCOA_ENTER(env);

    awtFont =
        [AWTFont awtFontForName:JNFJavaToNSString(env, nativeFontName)
         style:style
         isFakeItalic:isFakeItalic]; // autoreleased

    if (awtFont) {
        CFRetain(awtFont); // GC
    }

JNF_COCOA_EXIT(env);

    return ptr_to_jlong(awtFont);
}

/*
 * Class:     sun_font_CFont
 * Method:    disposeNativeFont
 * Signature: (J)V
 */
JNIEXPORT void JNICALL
Java_sun_font_CFont_disposeNativeFont
    (JNIEnv *env, jclass clazz, jlong awtFontPtr)
{
JNF_COCOA_ENTER(env);

    if (awtFontPtr) {
        CFRelease((AWTFont *)jlong_to_ptr(awtFontPtr)); // GC
    }

JNF_COCOA_EXIT(env);
}


#pragma mark --- Miscellaneous JNI ---

#ifndef HEADLESS
/*
 * Class:     sun_awt_PlatformFont
 * Method:    initIDs
 * Signature: ()V
 */
JNIEXPORT void JNICALL
Java_sun_awt_PlatformFont_initIDs
    (JNIEnv *env, jclass cls)
{
}

/*
 * Class:     sun_awt_FontDescriptor
 * Method:    initIDs
 * Signature: ()V
 */
JNIEXPORT void JNICALL
Java_sun_awt_FontDescriptor_initIDs
    (JNIEnv *env, jclass cls)
{
}
#endif
