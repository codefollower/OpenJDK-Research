#include <jni.h>
#include <stdio.h>
#include <stdlib.h>

#define MAX_LINE 256

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
  char * class_name;

  options[0].optionString = "-Dsun.java.launcher=gamma";
  //argv[0]="launcher"

  if(argc==2 && argv[1][0]=='@') {
    FILE *fp;
    char* line;
    char* buf;

    int len;

    if((fp = fopen(&argv[1][1],"r")) == NULL)
    {
      printf("Error open file %s\n", argv[1]);
      return 1;
    } else {
      argc = 1;
      buf = (char *)malloc(MAX_LINE*sizeof(char));
      while(line = fgets(buf,MAX_LINE,fp)) {
        if(line[0] != '#') {
          len = strlen(line);
          if(len == 1)
            continue;
          if(line[len-1] == '\n')
            line[len-1] = '\0';
          options[argc++].optionString = line;
          buf = (char *)malloc(MAX_LINE*sizeof(char));
        }
      }
      free(buf);
      class_name = options[argc-1].optionString;
    }
    fclose(fp);
  } else {
    for(i = 1; i < argc-1; i++)
      options[i].optionString = argv[i];

    class_name = argv[argc-1];
  }

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

  class_Main = (*env)->FindClass(env, class_name);
  id_main = (*env)->GetStaticMethodID(env, class_Main, "main", "([Ljava/lang/String;)V");

  class_String = (*env)->FindClass(env, "java/lang/String");
  args = (*env)->NewObjectArray(env, 0, class_String, NULL);
  (*env)->CallStaticVoidMethod(env, class_Main, id_main, args);

  (*jvm)->DestroyJavaVM(jvm);

  return 0;
}
