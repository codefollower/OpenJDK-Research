//要顺序执行下面的步骤:

//1. 生成动态库
//linux:
//gcc -fPIC -I$JAVA_HOME/include -I$JAVA_HOME/include/linux -shared -o libHelloWorld.so HelloWorld.c 

//windows:
//cl -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD HelloWorld.c -FeHelloWorld.dll

//2. 最后运行:
//java -agentlib:HelloWorld -version

#include <jvmti.h>
#include <stdio.h>
JNIEXPORT jint JNICALL 
Agent_OnLoad(JavaVM *vm, char *options, void *reserved)
{
    printf("Hello JVMTI World!\n");
    printf("options:%s\n\n",options);
    return 0;
}

JNIEXPORT void JNICALL 
Agent_OnUnload(JavaVM *vm)
{
    printf("Agent_OnUnload!\n");
}
