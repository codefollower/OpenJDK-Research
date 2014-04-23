/**
@version 1.10 1997-07-01
@author Cay Horstmann
*/

#include "ApiTest.h"
#include <string.h>
#include <stdlib.h>
#include <float.h>

void testJNI_GetDefaultJavaVMInitArgs() {
  JavaVMInitArgs vm_args;
  JavaVMOption options[1];// = new JavaVMOption[1];
  options[0].optionString = "xxx";
  memset(&vm_args, 0, sizeof(vm_args));
  vm_args.version = JNI_VERSION_1_1;
  vm_args.nOptions = 1;
  vm_args.options = options;
  //vm_args.ignoreUnrecognized = false;

  JNI_GetDefaultJavaVMInitArgs(&vm_args);
}

void testJNI_GetCreatedJavaVMs() {
  JavaVM *vmBuf;
  jsize bufLen;
  jsize nVMs;
  jint status;

  status = JNI_GetCreatedJavaVMs(&vmBuf, bufLen, &nVMs);
  if (status == JNI_ERR)
  {  
    printf("Error JNI_GetCreatedJavaVMs\n");
    return;
  } else {
    printf("nVMs = %d\n", nVMs);
  }
}

void testJNI_CreateJavaVM() {
  //TODO
}

void testDestroyJavaVM() {
  //TODO
}

void testAttachCurrentThread() {
  //TODO
}

void testDetachCurrentThread() {
  //TODO
}

void testGetEnv() {
  //TODO
}

void testAttachCurrentThreadAsDaemon() {
  //TODO
}

void testJNIInvokeInterface() {
  testJNI_GetDefaultJavaVMInitArgs();
  testJNI_GetCreatedJavaVMs();
}

void testGetVersion() {
  //TODO
}
jobjectArray testArrayOperations(JNIEnv *env,
                                 jclass cls,
                                 int size) {
                                   jobjectArray result;
                                   int i;
                                   jclass intArrCls = (*env)->FindClass(env, "[I");
                                   if (intArrCls == NULL) {
                                     return NULL; /* exception thrown */
                                   }
                                   result = (*env)->NewObjectArray(env, size, intArrCls,
                                     NULL);
                                   if (result == NULL) {
                                     return NULL; /* out of memory error thrown */
                                   }
                                   for (i = 0; i < size; i++) {
                                     jint tmp[256]; /* make sure it is large enough! */
                                     int j;
                                     jintArray iarr = (*env)->NewIntArray(env, size);
                                     if (iarr == NULL) {
                                       return NULL; /* out of memory error thrown */
                                     }
                                     for (j = 0; j < size; j++) {
                                       tmp[j] = i + j;
                                     }
                                     (*env)->SetIntArrayRegion(env, iarr, 0, size, tmp);
                                     (*env)->SetObjectArrayElement(env, result, i, iarr);
                                     (*env)->DeleteLocalRef(env, iarr);
                                   }
                                   return result;

}

void testJNINativeInterface() {
  testGetVersion();
  //testArrayOperations();
}

JNIEXPORT void JNICALL Java_ApiTest_nativeMainMethod(JNIEnv* env, jclass cl) {
  testJNIInvokeInterface();
  testJNINativeInterface();
}

JNIEXPORT jobjectArray JNICALL Java_ApiTest_initInt2DArray
  (JNIEnv *env,
  jclass cls,
  int size) {
    return testArrayOperations(env, cls, size);
}


/**
@param format a string containing a printf format specifier
(such as "%8.2f"). Substrings "%%" are skipped.
@return a pointer to the format specifier (skipping the '%')
or NULL if there wasn't a unique format specifier
*/
char* find_format(const char format[])
{  
  char* p;
  char* q;

  p = strchr(format, '%');
  while (p != NULL && *(p + 1) == '%') /* skip %% */
    p = strchr(p + 2, '%');
  if (p == NULL) return NULL;
  /* now check that % is unique */
  p++;
  q = strchr(p, '%');
  while (q != NULL && *(q + 1) == '%') /* skip %% */
    q = strchr(q + 2, '%');
  if (q != NULL) return NULL; /* % not unique */
  q = p + strspn(p, " -0+#"); /* skip past flags */
  q += strspn(q, "0123456789"); /* skip past field width */
  if (*q == '.') { q++; q += strspn(q, "0123456789"); }
  /* skip past precision */
  if (strchr("eEfFgG", *q) == NULL) return NULL;
  /* not a floating point format */
  return p;
}

JNIEXPORT void JNICALL Java_ApiTest_fprint(JNIEnv* env, jclass cl, 
                                           jobject out, jstring format, jdouble x)
{  
  const char* cformat;
  char* fmt;
  jclass class_PrintWriter;
  jmethodID id_print;
  char* cstr;
  int width;
  int i;

  if (format == NULL)
  {  
    (*env)->ThrowNew(env,
      (*env)->FindClass(env,
      "java/lang/NullPointerException"),
      "ApiTest.fprint: format is null");
    return;
  }

  cformat = (*env)->GetStringUTFChars(env, format, NULL);
  fmt = find_format(cformat);

  if (fmt == NULL)
  {  
    (*env)->ThrowNew(env,
      (*env)->FindClass(env,
      "java/lang/IllegalArgumentException"),
      "ApiTest.fprint: format is invalid");
    return;
  }

  width = atoi(fmt);
  if (width == 0) width = DBL_DIG + 10;
  cstr = (char*)malloc(strlen(cformat) + width);

  if (cstr == NULL)
  {  
    (*env)->ThrowNew(env,
      (*env)->FindClass(env, "java/lang/OutOfMemoryError"),
      "ApiTest.fprint: malloc failed");
    return;
  }

  sprintf(cstr, cformat, x);

  (*env)->ReleaseStringUTFChars(env, format, cformat);

  /* now call ps.print(str) */

  /* get the class */
  class_PrintWriter = (*env)->GetObjectClass(env, out);

  /* get the method ID */
  id_print = (*env)->GetMethodID(env, class_PrintWriter, "print", "(C)V");

  /* call the method */
  for (i = 0; cstr[i] != 0 && !(*env)->ExceptionOccurred(env); i++)
    (*env)->CallVoidMethod(env, out, id_print, cstr[i]);

  free(cstr);
}


//#ifdef __cplusplus
//extern "C" {
//#endif
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
  printf("JNI_OnLoad\n");
  return JNI_VERSION_1_8;
}

JNIEXPORT jint JNICALL JNI_OnLoad_ApiTest(JavaVM *vm, void *reserved) {
  printf("JNI_OnLoad_ApiTest\n");
  return JNI_VERSION_1_8;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
  printf("JNI_OnUnload\n");
}
//#ifdef __cplusplus
//} /* extern "C" */
//#endif /* __cplusplus */