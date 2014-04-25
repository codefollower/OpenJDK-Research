#include <jni.h>
#include <stdlib.h>

int main(int argc, char ** argv)
{  
  JavaVMOption options[100];
  JavaVMInitArgs vm_args;
  JavaVM *jvm;
  JNIEnv *env;
  long status;

  jclass class_Main;
  jclass class_String;
  jobjectArray args;
  jmethodID id_main;

  int i;

  options[0].optionString = "-Dsun.java.launcher=gamma";
  //argv[0]="launcher"
  for(i = 1; i < argc-1; i++)
    options[i].optionString = argv[i];

  memset(&vm_args, 0, sizeof(vm_args));
  vm_args.version = JNI_VERSION_1_2;
  vm_args.nOptions = argc-1;
  vm_args.options = options;

  status = JNI_CreateJavaVM(&jvm, (void**) &env, &vm_args);
  if (status == JNI_ERR)
  {  
    printf("Error creating VM\n");
    return 1;
  }

  class_Main = (*env)->FindClass(env, argv[argc-1]);
  id_main = (*env)->GetStaticMethodID(env, class_Main, "main", "([Ljava/lang/String;)V");

  class_String = (*env)->FindClass(env, "java/lang/String");
  args = (*env)->NewObjectArray(env, 0, class_String, NULL);
  (*env)->CallStaticVoidMethod(env, class_Main, id_main, args);

  (*jvm)->DestroyJavaVM(jvm);

  return 0;
}
