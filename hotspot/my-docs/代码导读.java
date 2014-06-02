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


符号引用解析:
----------------
share\vm\interpreter\linkResolver.cpp -> 以resolve_开头的方法

Java方法调用:
----------------
share\vm\runtime\javaCalls.cpp -> call_helper




加载

>	jvm.dll!ClassFileParser::parseClassFile(Symbol * name, ClassLoaderData * loader_data, Handle protection_domain, KlassHandle host_klass, GrowableArray<Handle> * cp_patches, TempNewSymbol & parsed_name, bool verify, Thread * __the_thread__) Line 3667	C++
 	jvm.dll!ClassFileParser::parseClassFile(Symbol * name, ClassLoaderData * loader_data, Handle protection_domain, TempNewSymbol & parsed_name, bool verify, Thread * __the_thread__) Line 468	C++
 	jvm.dll!ClassLoader::load_classfile(Symbol * h_name, Thread * __the_thread__) Line 931	C++
 	jvm.dll!SystemDictionary::load_instance_class(Symbol * class_name, Handle class_loader, Thread * __the_thread__) Line 1304	C++
 	jvm.dll!SystemDictionary::resolve_instance_class_or_null(Symbol * name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 779	C++
 	jvm.dll!SystemDictionary::resolve_or_null(Symbol * class_name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 232	C++
 	jvm.dll!SystemDictionary::resolve_or_null(Symbol * class_name, Thread * __the_thread__) Line 237	C++
 	jvm.dll!JVM_FindClassFromBootLoader(JNIEnv_ * env, const char * name) Line 769	C++
 	java.dll!5cad1e8c()	Unknown
 	[Frames below may be incorrect and/or missing, no symbols loaded for java.dll]	
 	01ced8e3()	Unknown
 	01ce043a()	Unknown
 	jvm.dll!JavaCalls::call_helper(JavaValue * result, methodHandle * m, JavaCallArguments * args, Thread * __the_thread__) Line 402	C++
 	jvm.dll!os::os_exception_wrapper(void (JavaValue *, methodHandle *, JavaCallArguments *, Thread *) * f, JavaValue * value, methodHandle * method, JavaCallArguments * args, Thread * thread) Line 114	C++
 	jvm.dll!JavaCalls::call(JavaValue * result, methodHandle method, JavaCallArguments * args, Thread * __the_thread__) Line 307	C++
 	jvm.dll!JavaCalls::call_virtual(JavaValue * result, KlassHandle spec_klass, Symbol * name, Symbol * signature, JavaCallArguments * args, Thread * __the_thread__) Line 204	C++
 	jvm.dll!JavaCalls::call_virtual(JavaValue * result, Handle receiver, KlassHandle spec_klass, Symbol * name, Symbol * signature, Handle arg1, Thread * __the_thread__) Line 217	C++
 	jvm.dll!SystemDictionary::load_instance_class(Symbol * class_name, Handle class_loader, Thread * __the_thread__) Line 1366	C++
 	jvm.dll!SystemDictionary::resolve_instance_class_or_null(Symbol * name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 779	C++
 	jvm.dll!SystemDictionary::resolve_or_null(Symbol * class_name, Handle class_loader, Handle protection_domain, Thread * __the_thread__) Line 232	C++
 	jvm.dll!SystemDictionary::resolve_or_fail(Symbol * class_name, Handle class_loader, Handle protection_domain, bool throw_error, Thread * __the_thread__) Line 171	C++
 	jvm.dll!find_class_from_class_loader(JNIEnv_ * env, Symbol * name, unsigned char init, Handle loader, Handle protection_domain, unsigned char throwError, Thread * __the_thread__) Line 3963	C++
 	jvm.dll!jni_FindClass(JNIEnv_ * env, const char * name) Line 487	C++
 	launcher.exe!main(int argc, char * * argv) Line 75	C
 	launcher.exe!__tmainCRTStartup() Line 536	C
 	kernel32.dll!75591174()	Unknown
 	ntdll.dll!76f1b3f5()	Unknown
 	ntdll.dll!76f1b3c8()	Unknown

链接

>	jvm.dll!InstanceKlass::link_class_impl(instanceKlassHandle this_oop, bool throw_verifyerror, Thread * __the_thread__) Line 608	C++
 	jvm.dll!InstanceKlass::link_class(Thread * __the_thread__) Line 589	C++
 	jvm.dll!InstanceKlass::initialize_impl(instanceKlassHandle this_oop, Thread * __the_thread__) Line 780	C++
 	jvm.dll!InstanceKlass::initialize(Thread * __the_thread__) Line 557	C++
 	jvm.dll!find_class_from_class_loader(JNIEnv_ * env, Symbol * name, unsigned char init, Handle loader, Handle protection_domain, unsigned char throwError, Thread * __the_thread__) Line 3968	C++
 	jvm.dll!jni_FindClass(JNIEnv_ * env, const char * name) Line 487	C++
 	launcher.exe!main(int argc, char * * argv) Line 75	C
 	launcher.exe!__tmainCRTStartup() Line 536	C
 	kernel32.dll!75591174()	Unknown
 	[Frames below may be incorrect and/or missing, no symbols loaded for kernel32.dll]	
 	ntdll.dll!76f1b3f5()	Unknown
 	ntdll.dll!76f1b3c8()	Unknown

初始化

>	jvm.dll!InstanceKlass::initialize_impl(instanceKlassHandle this_oop, Thread * __the_thread__) Line 784	C++
 	jvm.dll!InstanceKlass::initialize(Thread * __the_thread__) Line 557	C++
 	jvm.dll!find_class_from_class_loader(JNIEnv_ * env, Symbol * name, unsigned char init, Handle loader, Handle protection_domain, unsigned char throwError, Thread * __the_thread__) Line 3968	C++
 	jvm.dll!jni_FindClass(JNIEnv_ * env, const char * name) Line 487	C++
 	launcher.exe!main(int argc, char * * argv) Line 75	C
 	launcher.exe!__tmainCRTStartup() Line 536	C
 	kernel32.dll!75591174()	Unknown
 	[Frames below may be incorrect and/or missing, no symbols loaded for kernel32.dll]	
 	ntdll.dll!76f1b3f5()	Unknown
 	ntdll.dll!76f1b3c8()	Unknown

符号引用解析

>	jvm.dll!LinkResolver::resolve_invokestatic(CallInfo & result, constantPoolHandle pool, int index, Thread * __the_thread__) Line 1508	C++
 	jvm.dll!LinkResolver::resolve_invoke(CallInfo & result, Handle recv, constantPoolHandle pool, int index, Bytecodes::Code byte, Thread * __the_thread__) Line 1481	C++
 	jvm.dll!InterpreterRuntime::resolve_invoke(JavaThread * thread, Bytecodes::Code bytecode) Line 669	C++
 	01cf598c()	Unknown
 	[Frames below may be incorrect and/or missing]	
 	01ce40a4()	Unknown
 	01ce40a4()	Unknown
 	01ce4144()	Unknown
 	01ce4144()	Unknown
 	01ce043a()	Unknown
 	jvm.dll!JavaCalls::call_helper(JavaValue * result, methodHandle * m, JavaCallArguments * args, Thread * __the_thread__) Line 402	C++
 	jvm.dll!os::os_exception_wrapper(void (JavaValue *, methodHandle *, JavaCallArguments *, Thread *) * f, JavaValue * value, methodHandle * method, JavaCallArguments * args, Thread * thread) Line 114	C++
 	jvm.dll!JavaCalls::call(JavaValue * result, methodHandle method, JavaCallArguments * args, Thread * __the_thread__) Line 307	C++
 	jvm.dll!jni_invoke_static(JNIEnv_ * env, JavaValue * result, _jobject * receiver, JNICallType call_type, _jmethodID * method_id, JNI_ArgumentPusher * args, Thread * __the_thread__) Line 1311	C++
 	jvm.dll!jni_CallStaticVoidMethod(JNIEnv_ * env, _jclass * cls, _jmethodID * methodID, ...) Line 2508	C++
 	launcher.exe!main(int argc, char * * argv) Line 81	C
 	launcher.exe!__tmainCRTStartup() Line 536	C
 	kernel32.dll!75591174()	Unknown
 	ntdll.dll!76f1b3f5()	Unknown
 	ntdll.dll!76f1b3c8()	Unknown


IRT_ENTRY(void, InterpreterRuntime::resolve_invoke(JavaThread* thread, Bytecodes::Code bytecode)) {
58E7B170  call        HandleMarkCleaner::HandleMarkCleaner (58BFFBE0h)  
58E7B175  mov         edx,dword ptr [thread]  
58E7B178  mov         dword ptr [__the_thread__],edx  
58E7B17B  call        os::verify_stack_alignment (58C55000h)  
58E7B180  lea         ecx,[__vew]  
58E7B183  call        VMEntryWrapper::VMEntryWrapper (58BFFDD0h)  
  // extract receiver from the outgoing argument list if necessary
  Handle receiver(thread, NULL);
58E7B188  push        0  
58E7B18A  mov         eax,dword ptr [thread]  
58E7B18D  push        eax  
58E7B18E  lea         ecx,[ebp-8]  
58E7B191  call        Handle::Handle (5900FC20h)  
  if (bytecode == Bytecodes::_invokevirtual || bytecode == Bytecodes::_invokeinterface) {
58E7B196  cmp         dword ptr [bytecode],0B6h  
58E7B19D  je          InterpreterRuntime::resolve_invoke+0FCh (58E7B1ACh)  
58E7B19F  cmp         dword ptr [bytecode],0B9h  
58E7B1A6  jne         InterpreterRuntime::resolve_invoke+23Eh (58E7B2EEh)  
    ResourceMark rm(thread);
58E7B1AC  mov         ecx,dword ptr [thread]  
58E7B1AF  push        ecx  
58E7B1B0  lea         ecx,[ebp-128h]  
58E7B1B6  call        ResourceMark::ResourceMark (58EC8BA0h)  
    methodHandle m (thread, method(thread));
58E7B1BB  mov         edx,dword ptr [thread]  
58E7B1BE  push        edx  
58E7B1BF  call        InterpreterRuntime::method (58E7F760h)  
58E7B1C4  add         esp,4  
58E7B1C7  push        eax  
58E7B1C8  mov         eax,dword ptr [thread]  
58E7B1CB  push        eax  
58E7B1CC  lea         ecx,[ebp-0A8h]  
58E7B1D2  call        methodHandle::methodHandle (58BFFF90h)  
    Bytecode_invoke call(m, bci(thread));
58E7B1D7  mov         ecx,dword ptr [thread]  
58E7B1DA  push        ecx  




下面的代码对应
cpu\x86\vm\templateInterpreter_x86_32.cpp的generate_normal_entry中那些以"__"开头的伪汇编

01FFBA60  mov         edx,dword ptr [ebx+8]  
01FFBA63  movzx       ecx,word ptr [edx+22h]  
01FFBA67  movzx       edx,word ptr [edx+20h]  
01FFBA6B  sub         edx,ecx  

//generate_stack_overflow_check
01FFBA6D  cmp         edx,3F6h  
01FFBA73  jbe         01FFBAF3  
01FFBA79  push        esi  

//__ get_thread(thread);
01FFBA7A  mov         esi,dword ptr fs:[0]  
01FFBA82  mov         esi,dword ptr [esi-0Ch]
	
// locals + overhead, in bytes
01FFBA85  lea         eax,[edx*4+28h]  

// verify that thread stack base is non-zero
01FFBA8C  cmp         dword ptr [esi+0D4h],0  
01FFBA96  jne         01FFBAAD  
//void MacroAssembler::stop(const char* msg) ==> cpu\x86\vm\macroAssembler_x86.cpp
01FFBA9C  push        580491C4h  
01FFBAA1  call        01FFBAA6  
01FFBAA6  pushad  
01FFBAA7  call        MacroAssembler::debug32 (57B1DBF0h)  
01FFBAAC  hlt  

// verify that thread stack size is non-zero
01FFBAAD  cmp         dword ptr [esi+0D8h],0  
01FFBAB7  jne         01FFBACE  
01FFBABD  push        580491D8h  
01FFBAC2  call        01FFBAC7  
01FFBAC7  pushad  
01FFBAC8  call        MacroAssembler::debug32 (57B1DBF0h)  
01FFBACD  hlt 

// Add stack base to locals and subtract stack size
01FFBACE  add         eax,dword ptr [esi+0D4h]  
01FFBAD4  sub         eax,dword ptr [esi+0D8h] 
	
// Use the maximum number of pages we might bang.
01FFBADA  add         eax,9000h  




对应E:\jcdl\git\jvm\src\cpu\x86\vm\stubGenerator_x86_32.cpp::generate_call_stub
//前两条对应 __ enter();
01D603B4  push        ebp  
01D603B5  mov         ebp,esp  
01D603B7  mov         ecx,dword ptr [ebp+20h]  
01D603BA  shl         ecx,2  
01D603BD  add         ecx,10h  
01D603C0  sub         esp,ecx  
01D603C2  and         esp,0FFFFFFF0h  

// save rdi, rsi, & rbx, according to C calling conventions
01D603C5  mov         dword ptr [ebp-4],edi  
01D603C8  mov         dword ptr [ebp-8],esi  
01D603CB  mov         dword ptr [ebp-0Ch],ebx  

// save and initialize %mxcsr
01D603CE  stmxcsr     dword ptr [ebp-10h]  
01D603D2  mov         eax,dword ptr [ebp-10h]  
01D603D5  and         eax,0FFC0h  
01D603DB  cmp         eax,dword ptr ds:[58005778h]  
01D603E1  je          01D603EE  
01D603E7  ldmxcsr     dword ptr ds:[58005778h]  

// make sure the control word is correct.
01D603EE  fldcw       word ptr ds:[58005768h] 

// make sure we have no pending exceptions
01D603F4  mov         ecx,dword ptr [ebp+24h]  
01D603F7  cmp         dword ptr [ecx+4],0  
01D603FE  je          01D60415  
01D60404  push        57CE7D38h  
01D60409  call        01D6040E  
01D6040E  pushad  
01D6040F  call        MacroAssembler::debug32 (577BDBF0h)  
01D60414  hlt  

// pass parameters if any
01D60415  mov         ecx,dword ptr [ebp+20h]  
01D60418  test        ecx,ecx  
01D6041A  je          01D60430  

01D60420  mov         edx,dword ptr [ebp+1Ch]   // parameter pointer
01D60423  xor         ebx,ebx  

// get parameter
01D60425  mov         eax,dword ptr [edx+ecx*4-4]  
01D60429  mov         dword ptr [esp+ebx*4],eax  
01D6042C  inc         ebx  
01D6042D  dec         ecx  
01D6042E  jne         01D60425  

// call Java function
01D60430  mov         ebx,dword ptr [ebp+14h]  // get Method*
01D60433  mov         eax,dword ptr [ebp+18h]  // get entry_point
01D60436  mov         esi,esp                  // set sender sp
01D60438  call        eax  

// store result depending on type
// (everything that is not T_LONG, T_FLOAT or T_DOUBLE is treated as T_INT)
01D6043A  mov         edi,dword ptr [ebp+0Ch]  
01D6043D  mov         esi,dword ptr [ebp+10h]  
01D60440  cmp         esi,0Bh  
01D60443  je          01D60472  
01D60449  cmp         esi,6  
01D6044C  je          01D60479  
01D60452  cmp         esi,7  
01D60455  je          01D6047F  

01D6045B  mov         dword ptr [edi],eax  

// pop parameters
01D6045D  lea         esp,[ebp-10h]  

// restore %mxcsr
01D60460  ldmxcsr     dword ptr [ebp-10h]  

// restore rdi, rsi and rbx,
01D60464  mov         ebx,dword ptr [ebp-0Ch]  
01D60467  mov         esi,dword ptr [ebp-8]  
01D6046A  mov         edi,dword ptr [ebp-4]  
01D6046D  add         esp,10h 
	
// return
01D60470  pop         ebp  
01D60471  ret  

// handle return types different from T_INT
01D60472  mov         dword ptr [edi],eax  
01D60474  mov         dword ptr [edi+4],edx  
01D60477  jmp         01D6045D  

// interpreter uses xmm0 for return values
01D60479  movss       dword ptr [edi],xmm0  
01D6047D  jmp         01D6045D  

// interpreter uses xmm0 for return values
01D6047F  movsd       mmword ptr [edi],xmm0  
01D60483  jmp         01D6045D  



01D60485  mov         ecx,dword ptr [ebp+24h]  
01D60488  mov         ebx,dword ptr fs:[0]  
01D60490  mov         ebx,dword ptr [ebx-0Ch]  
01D60493  cmp         ebx,ecx  
01D60495  je          01D604AC  
01D6049B  push        57CE7E24h  
01D604A0  call        01D604A5  
01D604A5  pushad  
01D604A6  call        MacroAssembler::debug32 (577BDBF0h)  
01D604AB  hlt  
01D604AC  mov         dword ptr [ecx+4],eax  
01D604AF  mov         dword ptr [ecx+8],57CE7C9Ch  
01D604B6  mov         dword ptr [ecx+0Ch],167h  
01D604BD  jmp         01D6043A  
01D604C2  push        edx  
01D604C3  mov         eax,dword ptr [esp+8]  
01D604C7  mov         edx,dword ptr [esp+0Ch]  
01D604CB  xchg        eax,dword ptr [edx]  
01D604CD  pop         edx  
01D604CE  ret  
01D604CF  push        0  
01D604D4  pushad  
01D604D5  call        handle_unsafe_access (577D72B0h)  
01D604DA  mov         dword ptr [esp+20h],eax  
01D604DE  popad  
01D604DF  ret  
01D604E0  ret  
01D604E1  ret  
01D604E2  sub         esp,8  
01D604E5  fstp        qword ptr [esp]  
01D604E8  push        ebx  
01D604E9  push        ecx  
01D604EA  push        esi  
01D604EB  push        edi  
01D604EC  push        ebp  
01D604ED  sub         esp,6Ch  
01D604F0  fnsave      [esp]  
01D604F3  wait  
01D604F4  fld         qword ptr [esp+80h]  
01D604FB  sub         esp,8  
01D604FE  fst         qword ptr [esp]  
01D60501  emms  
01D60503  call        SharedRuntime::d2i (57BE31D0h)  
01D60508  add         esp,8  
01D6050B  frstor      [esp]  
01D6050E  add         esp,6Ch  
01D60511  pop         ebp  
01D60512  pop         edi  
01D60513  pop         esi  
01D60514  pop         ecx  
01D60515  pop         ebx  
01D60516  add         esp,8  
01D60519  ret  
01D6051A  sub         esp,8  
01D6051D  fstp        qword ptr [esp]  
01D60520  push        ebx  
01D60521  push        ecx  
01D60522  push        esi  
01D60523  push        edi  
01D60524  push        ebp  
01D60525  sub         esp,6Ch  
01D60528  fnsave      [esp]  
01D6052B  wait  
01D6052C  fld         qword ptr [esp+80h]  
01D60533  sub         esp,8  
01D60536  fst         qword ptr [esp]  
01D60539  emms  
01D6053B  call        SharedRuntime::d2l (57BE3340h)  
01D60540  add         esp,8  
01D60543  frstor      [esp]  
01D60546  add         esp,6Ch  
01D60549  pop         ebp  
01D6054A  pop         edi  
01D6054B  pop         esi  
01D6054C  pop         ecx  
01D6054D  pop         ebx  
01D6054E  add         esp,8  
01D60551  ret  
01D60552  int         3  
01D60553  int         3  
01D60554  int         3  
01D60555  int         3  


