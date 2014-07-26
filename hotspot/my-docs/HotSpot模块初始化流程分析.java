JNI_CreateJavaVM  =>  src\share\vm\prims\jni.cpp
  Threads::create_vm
    Threads::is_supported_jni_version

	ostream_init()  =>  src\share\vm\utilities\ostream.cpp

	Arguments::process_sun_java_launcher_properties

	os::init

	Arguments::init_system_properties
	  os::init_system_properties_values

	  初始化下面这些系统属性:
	  --------------------------------------------------------------------------------------
	  属性名                                属性值                                是否可写
	  --------------------------------------------------------------------------------------
	  java.vm.specification.name            Java Virtual Machine Specification    false
	  java.vm.version                       25.0-b70-internal-debug               false
	  java.vm.name                          OpenJDK Client VM                     false
	  java.vm.info                          mixed mode, sharing                   true

	  java.ext.dirs                         D:\JavaSE1.8\jre\lib\ext;             true
	                                        C:\Windows\Sun\Java\lib\ext

	  java.endorsed.dirs                    D:\JavaSE1.8\jre\lib\endorsed         true
	  sun.boot.library.path                 D:\JavaSE1.8\jre\bin                  true

	  java.library.path                     C:\Windows\Sun\Java\bin;              true
	                                        C:\Windows\system32;
											C:\Windows;
											%path%;.

	  java.home                             D:\JavaSE1.8\jre                      true

	  sun.boot.class.path                   D:\JavaSE1.8\jre\lib\resources.jar;   true
	                                        D:\JavaSE1.8\jre\lib\rt.jar;
											D:\JavaSE1.8\jre\lib\sunrsasign.jar; //默认不存在
											D:\JavaSE1.8\jre\lib\jsse.jar;
											D:\JavaSE1.8\jre\lib\jce.jar;
											D:\JavaSE1.8\jre\lib\charsets.jar;
											D:\JavaSE1.8\jre\lib\jfr.jar;
											D:\JavaSE1.8\jre\classes //默认不存在

      java.class.path                       ""(空串)                              true



TODO



