加入-XX:NativeMemoryTracking=detail|summary|off启动Native Memory Tracking

AllocatedObj
  StackObj
    ThreadClosure                 share\vm\runtime\thread.hpp
	  SyncThreadRecorderClosure

AllStatic
  MemTracker



方法调用顺序
init_tracking_options -> bootstrap_single_thread -> bootstrap_multi_thread -> start -> start_worker










