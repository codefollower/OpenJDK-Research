一些缩写词
----------------------------------------------
DefNew                Default New (就是Serial GC)
PSMarkSweep           Parallel Scavenge Mark Sweep
ParNew                Parallel New
ASParNewGeneration    Adaptive Size Parallel New Generation

另请参考:
http://hllvm.group.iteye.com/group/topic/37095
https://blogs.oracle.com/jonthecollector/entry/our_collectors


 	jvm.dll!GenMarkSweep::invoke_at_safepoint(int level, ReferenceProcessor * rp, bool clear_all_softrefs) Line 59	C++
>	jvm.dll!OneContigSpaceCardGeneration::collect(bool full, bool clear_all_soft_refs, unsigned int size, bool is_tlab) Line 643	C++
 	jvm.dll!TenuredGeneration::collect(bool full, bool clear_all_soft_refs, unsigned int size, bool is_tlab) Line 157	C++
 	jvm.dll!GenCollectedHeap::do_collection(bool full, bool clear_all_soft_refs, unsigned int size, bool is_tlab, int max_level) Line 492	C++
 	jvm.dll!GenCollectedHeap::do_full_collection(bool clear_all_soft_refs, int max_level) Line 795	C++
 	jvm.dll!VM_GenCollectFull::doit() Line 201	C++
 	jvm.dll!VM_Operation::evaluate() Line 61	C++
 	jvm.dll!VMThread::evaluate_operation(VM_Operation * op) Line 374	C++
 	jvm.dll!VMThread::loop() Line 501	C++
 	jvm.dll!VMThread::run() Line 279	C++
 	jvm.dll!java_start(Thread * thread) Line 431	C++

