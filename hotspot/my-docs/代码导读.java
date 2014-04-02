启动流程
----------------
java.c -> JavaMain
  java.c -> InitializeJVM
    jni.cpp -> JNI_CreateJavaVM
      thread.cpp -> create_vm
      
  jni.cpp -> jni_GetStaticMethodID   
  jni.cpp -> jni_CallStaticVoidMethod
    jni.cpp -> jni_invoke_static
      javaCalls.cpp -> call
        os_linux.cpp -> os_exception_wrapper
          javaCalls.cpp -> call_helper


加载、链接、初始化
----------------
加载:   share\vm\classfile\classFileParser.cpp -> parseClassFile
链接:   share\vm\oops\instanceKlass.cpp -> link_class_impl
初始化: share\vm\oops\instanceKlass.cpp -> initialize_impl


创建对象(使用慢速分配):
----------------
share\vm\interpreter\interpreterRuntime.cpp -> _new


符号引入解析:
----------------
share\vm\interpreter\linkResolver.cpp -> 以resolve_开头的方法

Java方法调用:
----------------
share\vm\runtime\javaCalls.cpp -> call_helper











