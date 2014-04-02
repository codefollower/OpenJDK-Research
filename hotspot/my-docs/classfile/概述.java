
>	jvm.dll!ClassFileParser::parseClassFile(Symbol * name, Handle class_loader, Handle protection_domain, KlassHandle host_klass, GrowableArray<Handle> * cp_patches, TempNewSymbol & parsed_name, bool verify, Thread * __the_thread__) Line 2937	C++
 	jvm.dll!ClassFileParser::parseClassFile(Symbol * name, Handle class_loader, Handle protection_domain, TempNewSymbol & parsed_name, bool verify, Thread * __the_thread__) Line 356	C++
 	jvm.dll!ClassLoader::load_classfile(Symbol * h_name, Thread * __the_thread__) Line 920	C++
 	jvm.dll!SystemDictionary::load_instance_class(Symbol * class_name, Handle class_loader, Thread * __the_thread__) Line 1267	C++
 	jvm.dll!SystemDictionary::resolve_instance_class_or_null(Symbol * name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 759	C++
 	jvm.dll!SystemDictionary::resolve_or_null(Symbol * class_name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 215	C++
 	jvm.dll!SystemDictionary::resolve_or_fail(Symbol * class_name, Handle class_loader, Handle protection_domain, bool throw_error, Thread * __the_thread__) Line 154	C++
 	jvm.dll!SystemDictionary::resolve_or_fail(Symbol * class_name, bool throw_error, Thread * __the_thread__) Line 195	C++
 	jvm.dll!SystemDictionary::initialize_wk_klass(SystemDictionary::WKID id, int init_opt, Thread * __the_thread__) Line 1824	C++
 	jvm.dll!SystemDictionary::initialize_wk_klasses_until(SystemDictionary::WKID limit_id, SystemDictionary::WKID & start_id, Thread * __the_thread__) Line 1840	C++
 	jvm.dll!SystemDictionary::initialize_wk_klasses_through(SystemDictionary::WKID end_id, SystemDictionary::WKID & start_id, Thread * __the_thread__) Line 415	C++
 	jvm.dll!SystemDictionary::initialize_preloaded_classes(Thread * __the_thread__) Line 1852	C++
 	jvm.dll!SystemDictionary::initialize(Thread * __the_thread__) Line 1801	C++
 	jvm.dll!Universe::genesis(Thread * __the_thread__) Line 353	C++
 	jvm.dll!universe2_init() Line 1038	C++
 	jvm.dll!init_globals() Line 114	C++
 	jvm.dll!Threads::create_vm(JavaVMInitArgs * args, bool * canTryAgain) Line 3376	C++
 	jvm.dll!JNI_CreateJavaVM(JavaVM_ * * vm, void * * penv, void * args) Line 5128	C++
 	hotspot.exe!_AddOption()	C
 	hotspot.exe!_JavaMain@4()	C
 	msvcr110.dll!6b31f2e9()	Unknown
 	[Frames below may be incorrect and/or missing, no symbols loaded for msvcr110.dll]	
 	msvcr110.dll!6b31f2cd()	Unknown
 	kernel32.dll!772d1174()	Unknown
 	ntdll.dll!773bb3f5()	Unknown
 	ntdll.dll!773bb3c8()	Unknown
