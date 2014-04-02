初始化过程
share\vm\runtime\init.cpp -> init_globals()
  share\vm\interpreter\interpreter.cpp -> interpreter_init()
    share\vm\interpreter\templateInterpreter.cpp -> initialize()
      share\vm\interpreter\interpreter.cpp -> initialize()
	  share\vm\interpreter\templateTable.cpp -> initialize()
	  share\vm\code\stubs.cpp -> StubQueue
	  cpu\x86\vm\templateInterpreter_x86_32.cpp -> InterpreterGenerator(StubQueue* code)
	    share\vm\interpreter\templateInterpreter.cpp -> generate_all()
		  share\vm\interpreter\interpreter.cpp -> generate_all()
      
      
      
      
支持的选项
-XX:+TraceBytecodes
-XX:+CountBytecodes
    


在interpreterRuntime.cpp中的方法是
>	jvm.dll!InterpreterRuntime::_new(JavaThread * thread, constantPoolOopDesc * pool, int index) Line 163	C++
 	01fd5051()	Unknown
 	[Frames below may be incorrect and/or missing]	
 	01fc043a()	Unknown
 	jvm.dll!JavaCalls::call_helper(JavaValue * result, methodHandle * m, JavaCallArguments * args, Thread * __the_thread__) Line 415	C++
 	jvm.dll!os::os_exception_wrapper(void (JavaValue *, methodHandle *, JavaCallArguments *, Thread *) * f, JavaValue * value, methodHandle * method, JavaCallArguments * args, Thread * thread) Line 113	C++
 	jvm.dll!JavaCalls::call(JavaValue * result, methodHandle method, JavaCallArguments * args, Thread * __the_thread__) Line 320	C++
 	jvm.dll!instanceKlass::call_class_initializer_impl(instanceKlassHandle this_oop, Thread * __the_thread__) Line 814	C++
 	jvm.dll!instanceKlass::call_class_initializer(Thread * __the_thread__) Line 789	C++
 	jvm.dll!instanceKlass::initialize_impl(instanceKlassHandle this_oop, Thread * __the_thread__) Line 528	C++
 	jvm.dll!instanceKlass::initialize(Thread * __the_thread__) Line 243	C++
 	jvm.dll!initialize_class(Symbol * class_name, Thread * __the_thread__) Line 965	C++
 	jvm.dll!Threads::create_vm(JavaVMInitArgs * args, bool * canTryAgain) Line 3450	C++
 	jvm.dll!JNI_CreateJavaVM(JavaVM_ * * vm, void * * penv, void * args) Line 5128	C++
 	hotspot.exe!_AddOption()	C
 	hotspot.exe!_JavaMain@4()	C



>	jvm.dll!LinkResolver::lookup_method_in_klasses(methodHandle & result, KlassHandle klass, Symbol * name, Symbol * signature, Thread * __the_thread__) Line 189	C++
 	jvm.dll!LinkResolver::resolve_method(methodHandle & resolved_method, KlassHandle resolved_klass, Symbol * method_name, Symbol * method_signature, KlassHandle current_klass, bool check_access, Thread * __the_thread__) Line 422	C++
 	jvm.dll!LinkResolver::linktime_resolve_special_method(methodHandle & resolved_method, KlassHandle resolved_klass, Symbol * method_name, Symbol * method_signature, KlassHandle current_klass, bool check_access, Thread * __the_thread__) Line 750	C++
 	jvm.dll!LinkResolver::resolve_special_call(CallInfo & result, KlassHandle resolved_klass, Symbol * method_name, Symbol * method_signature, KlassHandle current_klass, bool check_access, Thread * __the_thread__) Line 741	C++
 	jvm.dll!JavaCalls::call_special(JavaValue * result, KlassHandle klass, Symbol * name, Symbol * signature, JavaCallArguments * args, Thread * __the_thread__) Line 247	C++
 	jvm.dll!JavaCalls::call_special(JavaValue * result, Handle receiver, KlassHandle klass, Symbol * name, Symbol * signature, Handle arg1, Handle arg2, Thread * __the_thread__) Line 273	C++
 	jvm.dll!SystemDictionary::validate_protection_domain(instanceKlassHandle klass, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 402	C++
 	jvm.dll!SystemDictionary::resolve_instance_class_or_null(Symbol * name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 863	C++
 	jvm.dll!SystemDictionary::resolve_or_null(Symbol * class_name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 215	C++
 	jvm.dll!SystemDictionary::resolve_or_fail(Symbol * class_name, Handle class_loader, Handle protection_domain, bool throw_error, Thread * __the_thread__) Line 154	C++
 	jvm.dll!constantPoolOopDesc::klass_at_impl(constantPoolHandle this_oop, int which, Thread * __the_thread__) Line 102	C++
 	jvm.dll!constantPoolOopDesc::klass_at(int which, Thread * __the_thread__) Line 366	C++
 	jvm.dll!constantPoolOopDesc::klass_ref_at(int which, Thread * __the_thread__) Line 401	C++
 	jvm.dll!LinkResolver::resolve_klass(KlassHandle & result, constantPoolHandle pool, int index, Thread * __the_thread__) Line 172	C++
 	jvm.dll!LinkResolver::resolve_field(FieldAccessInfo & result, constantPoolHandle pool, int index, Bytecodes::Code byte, bool check_only, bool update_pool, Thread * __the_thread__) Line 602	C++
 	jvm.dll!LinkResolver::resolve_field(FieldAccessInfo & result, constantPoolHandle pool, int index, Bytecodes::Code byte, bool check_only, Thread * __the_thread__) Line 589	C++
 	jvm.dll!InterpreterRuntime::resolve_get_put(JavaThread * thread, Bytecodes::Code bytecode) Line 517	C++
 	01b73ec9()	Unknown
 	[Frames below may be incorrect and/or missing]	
 	01b6043a()	Unknown
 	jvm.dll!JavaCalls::call_helper(JavaValue * result, methodHandle * m, JavaCallArguments * args, Thread * __the_thread__) Line 415	C++
 	jvm.dll!os::os_exception_wrapper(void (JavaValue *, methodHandle *, JavaCallArguments *, Thread *) * f, JavaValue * value, methodHandle * method, JavaCallArguments * args, Thread * thread) Line 113	C++
 	jvm.dll!JavaCalls::call(JavaValue * result, methodHandle method, JavaCallArguments * args, Thread * __the_thread__) Line 320	C++
 	jvm.dll!jni_invoke_static(JNIEnv_ * env, JavaValue * result, _jobject * receiver, JNICallType call_type, _jmethodID * method_id, JNI_ArgumentPusher * args, Thread * __the_thread__) Line 1338	C++
 	jvm.dll!jni_CallStaticVoidMethod(JNIEnv_ * env, _jclass * cls, _jmethodID * methodID, ...) Line 2541	C++
 	hotspot.exe!_JavaMain@4()	C
