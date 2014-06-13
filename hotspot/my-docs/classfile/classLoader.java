share\vm\classfile\classLoader.hpp
--------------------------------------
	ClassLoader 继承自AllStatic

	AllStatic
	  它的子类的方法都是static，并且没有构造函数

	Call Stack
		jvm.dll!ClassLoader::initialize() Line 965	C++
		jvm.dll!classLoader_init() Line 1078	C++
		jvm.dll!init_globals() Line 98	C++
		jvm.dll!Threads::create_vm(JavaVMInitArgs * args, bool * canTryAgain) Line 3424	C++
		jvm.dll!JNI_CreateJavaVM(JavaVM_ * * vm, void * * penv, void * args) Line 5166	C++



	AllocatedObj
	  CHeapObj
		MetaIndex
		ClassPathEntry
		  ClassPathDirEntry
		  ClassPathZipEntry
		  LazyClassPathEntry

	PerfClassTraceTime

share\vm\classfile\classLoader.cpp
--------------------------------------

	PackageInfo: public BasicHashtableEntry<mtClass> share\vm\utilities\hashtable.hpp

	PackageHashtable : public BasicHashtable<mtClass> share\vm\utilities\hashtable.hpp

	AllocatedObj
	  CHeapObj
		BasicHashtableEntry
		  PackageInfo
		BasicHashtable
		  PackageHashtable


应用的类一般要经过jvm.cpp中的JVM_FindClassFromBootLoader，这是由java.lang.ClassLoader触发的
通过加-Xbootclasspath/a这样的参数，可以让应用的类由JVM内部的ClassLoader加载。

