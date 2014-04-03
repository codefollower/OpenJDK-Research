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