//  32 bits:
//  --------
//             hash:25 ------------>| age:4    biased_lock:1 lock:2 (normal object)
//             JavaThread*:23 epoch:2 age:4    biased_lock:1 lock:2 (biased object)
//             size:32 ------------------------------------------>| (CMS free block)
//             PromotedObject*:29 ---------->| promo_bits:3 ----->| (CMS promoted object)
//

//       31-9         8-7    6-3    2-0
//    [JavaThread* | epoch | age | 1 | 01]       lock is biased toward given thread
//    [0           | epoch | age | 1 | 01]       lock is anonymously biased
//                             
//biased_lock_mask_in_place = 7     二进制:0000 0000 0000 0000 0000 0000 0000 0111
//age_mask_in_place         = 120   二进制:0000 0000 0000 0000 0000 0000 0111 1000
//epoch_mask_in_place       = 384   二进制:0000 0000 0000 0000 0000 0001 1000 0000

//
//  - the two lock bits are used to describe three states: locked/unlocked and monitor.
//
//    [ptr             | 00]  locked             ptr points to real header on stack
//    [header      | 0 | 01]  unlocked           regular object header
//    [ptr             | 10]  monitor            inflated lock (header is wapped out)
//    [ptr             | 11]  marked             used by markSweep to mark an object
//                                               not valid at any other time



  static markOop encode(JavaThread* thread, uint age, int bias_epoch) {
    intptr_t tmp = (intptr_t) thread;
    assert(UseBiasedLocking && ((tmp & (epoch_mask_in_place | age_mask_in_place | biased_lock_mask_in_place)) == 0), "misaligned JavaThread pointer");
    assert(age <= max_age, "age too large");
    assert(bias_epoch <= max_bias_epoch, "bias epoch too large");
	//为什么tmp直接进行或运算是正确的，因为thread地址的最低10位确保为0(也就是按1024字节对齐)
	//而epoch、age、biased_lock_pattern只占最低的9位
	//见Thread::allocate(size_t size, bool throw_excpt, MEMFLAGS flags)中的
	//align_size_up((intptr_t) real_malloc_addr, alignment);
    return (markOop) (tmp | (bias_epoch << epoch_shift) | (age << age_shift) | biased_lock_pattern);
  }

 
  	jvm.dll!ObjectSynchronizer::inflate(Thread * Self, oopDesc * object) Line 1316	C++
 	jvm.dll!ObjectSynchronizer::inflate_helper(oopDesc * obj) Line 1186	C++
>	jvm.dll!SharedRuntime::OSR_migration_begin(JavaThread * thread) Line 2965	C++
 	07f1576f()	Unknown
 	[Frames below may be incorrect and/or missing]	
 	07f041f9()	Unknown
 	07f0047a()	Unknown
 	jvm.dll!JavaCalls::call_helper(JavaValue * result, methodHandle * m, JavaCallArguments * args, Thread * __the_thread__) Line 406	C++
 	jvm.dll!os::os_exception_wrapper(void (JavaValue *, methodHandle *, JavaCallArguments *, Thread *) * f, JavaValue * value, methodHandle * method, JavaCallArguments * args, Thread * thread) Line 114	C++
 	jvm.dll!JavaCalls::call(JavaValue * result, methodHandle method, JavaCallArguments * args, Thread * __the_thread__) Line 307	C++
 	jvm.dll!JavaCalls::call_virtual(JavaValue * result, KlassHandle spec_klass, Symbol * name, Symbol * signature, JavaCallArguments * args, Thread * __the_thread__) Line 204	C++
 	jvm.dll!JavaCalls::call_virtual(JavaValue * result, Handle receiver, KlassHandle spec_klass, Symbol * name, Symbol * signature, Thread * __the_thread__) Line 210	C++
 	jvm.dll!thread_entry(JavaThread * thread, Thread * __the_thread__) Line 2853	C++
 	jvm.dll!JavaThread::thread_main_inner() Line 1695	C++
 	jvm.dll!JavaThread::run() Line 1678	C++
 	jvm.dll!java_start(Thread * thread) Line 439	C++
 	msvcr110.dll!6b16f2e9()	Unknown
 	msvcr110.dll!6b16f2cd()	Unknown
 	kernel32.dll!76641174()	Unknown
 	ntdll.dll!76f0b3f5()	Unknown
 	ntdll.dll!76f0b3c8()	Unknown
