init_globals()
  classLoader_init()
    ClassLoader::initialize() 
	  完成4件事: 
	    1. 初始化一些有关性能的计数器
		
		2.ClassLoader::load_zip_library()
		  加载D:\JavaSE1.8\jre\bin\zip.dll
		  初始化下面的
			static ZipOpen_t         ZipOpen            = NULL;
			static ZipClose_t        ZipClose           = NULL;
			static FindEntry_t       FindEntry          = NULL;
			static ReadEntry_t       ReadEntry          = NULL;
			static ReadMappedEntry_t ReadMappedEntry    = NULL; //这个在windows平台的zip.dll中不存在
			static GetNextEntry_t    GetNextEntry       = NULL;
			static canonicalize_fn_t CanonicalizeEntry  = NULL; //在D:\JavaSE1.8\jre\bin\java.dll
		  
		3. ClassLoader::setup_bootstrap_search_path()

			D:\JavaSE1.8\jre\lib\resources.jar;
			D:\JavaSE1.8\jre\lib\rt.jar;
			D:\JavaSE1.8\jre\lib\sunrsasign.jar;
			D:\JavaSE1.8\jre\lib\jsse.jar;
			D:\JavaSE1.8\jre\lib\jce.jar;
			D:\JavaSE1.8\jre\lib\charsets.jar;
			D:\JavaSE1.8\jre\lib\jfr.jar;
			D:\JavaSE1.8\jre\classes;
            
			每个jar或目录都对应一个LazyClassPathEntry
			通过_first_entry把它们串起来

		4. ClassLoader::setup_meta_index()
			D:\JavaSE1.8\jre\lib\meta-index 
			D:\JavaSE1.8\jre\lib\

			按meta-index文件中的内容建立相应的MetaIndex，
			然后用它来初始化LazyClassPathEntry的_meta_index字段。

			meta-index文件中的内容与上面的setup_bootstrap_search_path的jar文件相关，
			其中以@开头的那个jar会对应一个new MetaIndex(NULL, 0)


  codeCache_init()
    CodeCache::initialize()
	  建立ICache::flush_icache_stub
  

  VM_Version_init()
    VM_Version::initialize()
	  建立VM_Version::getPsrInfo_stub

  os_init_globals() //windows平台什么都不做

  stubRoutines_init1()
    StubRoutines::initialize1()
      生成下面9个stub:
	  ========================================
		forward exception
		call_stub
		catch_exception
		atomic_xchg
		handler_for_unsafe_access
		verify_mxcsr
		verify_spcw
		d2i_wrapper
		d2i_wrapper

  stubRoutines_init2()
    StubRoutines::initialize2()
	  生成下面35个stub:
	  ========================================
		verify_oop
		arrayof_jbyte_disjoint_arraycopy
		arrayof_jbyte_arraycopy
		jbyte_disjoint_arraycopy
		jbyte_arraycopy
		arrayof_jshort_disjoint_arraycopy
		arrayof_jshort_arraycopy
		jshort_disjoint_arraycopy
		jshort_arraycopy
		jint_disjoint_arraycopy
		jint_arraycopy
		oop_disjoint_arraycopy
		oop_arraycopy
		oop_disjoint_arraycopy_uninit
		oop_arraycopy_uninit
		jlong_disjoint_arraycopy
		jlong_arraycopy
		jbyte_fill
		jshort_fill
		jint_fill
		arrayof_jbyte_fill
		arrayof_jshort_fill
		arrayof_jint_fill
		checkcast_arraycopy
		checkcast_arraycopy_uninit
		unsafe_arraycopy
		generic_arraycopy
		log
		log10
		sin
		cos
		tan
		exp
		pow
		SafeFetch32

  
  universe_init()
    主要做下面几件事:
	GC堆初始化
	Metaspace初始化
	null_class_loader_data初始化
	创建SymbolTable、StringTable、PackageHashtable的实例








