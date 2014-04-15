/**
   @version 1.10 1999-11-13
   @author Cay Horstmann
*/

#include <jni.h>
#include <stdlib.h>
#include <memory.h>

//E:\openjdk\git\hotspot\my-test\myLauncher.exe

//D:\JavaSE1.8\bin\java.exe


//cd E:\openjdk\git\hotspot\my-test
//cl -I D:\JavaSE1.8\include -I D:\JavaSE1.8\include\win32 myLauncher.c D:\JavaSE1.8\lib\jvm.lib
//echo %path%
//set path=D:\JavaSE1.8\jre\bin\client\;%path%
//myLauncher
//
//cl /DEBUG -I D:\JavaSE1.8\include -I D:\JavaSE1.8\include\win32 myLauncher.c E:\openjdk\debug\build\vs-i486\compiler1\debug\jvm.lib

//set path=E:\openjdk\debug\build\vs-i486\compiler1\debug\;%path%
//
int main()
{  
   JavaVMOption options[2];
   JavaVMInitArgs vm_args;
   JavaVM *jvm;
   JNIEnv *env;
   long status;

   jclass class_Welcome;
   jclass class_String;
   jobjectArray args;
   jmethodID id_main;

   //options[0].optionString = "-Djava.class.path=.";
   options[0].optionString = "-Djava.class.path=E:\\openjdk\\git\\hotspot\\my-test";

   memset(&vm_args, 0, sizeof(vm_args));
   vm_args.version = JNI_VERSION_1_2;
   vm_args.nOptions = 1;
   vm_args.options = options;

   status = JNI_CreateJavaVM(&jvm, (void**) &env, &vm_args);
   if (status == JNI_ERR)
   {  
      printf("Error creating VM\n");
      return 1;
   }

   class_Welcome = (*env)->FindClass(env, "Test");
   id_main = (*env)->GetStaticMethodID(env, class_Welcome, "main", "([Ljava/lang/String;)V");

   class_String = (*env)->FindClass(env, "java/lang/String");
   args = (*env)->NewObjectArray(env, 0, class_String, NULL);
   (*env)->CallStaticVoidMethod(env, class_Welcome, id_main, args);

   (*jvm)->DestroyJavaVM(jvm);

   return 0;
}
