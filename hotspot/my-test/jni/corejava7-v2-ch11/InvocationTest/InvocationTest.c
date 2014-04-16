/**
   @version 1.10 1999-11-13
   @author Cay Horstmann
*/

#include <jni.h>
#include <stdlib.h>

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

   options[0].optionString = "-Djava.class.path=.";

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

   class_Welcome = (*env)->FindClass(env, "Welcome");
   id_main = (*env)->GetStaticMethodID(env, class_Welcome, "main", "([Ljava/lang/String;)V");

   class_String = (*env)->FindClass(env, "java/lang/String");
   args = (*env)->NewObjectArray(env, 0, class_String, NULL);
   (*env)->CallStaticVoidMethod(env, class_Welcome, id_main, args);

   (*jvm)->DestroyJavaVM(jvm);

   return 0;
}
