- share\vm\utilities\exceptions.hpp

  #define CHECK  THREAD); if (HAS_PENDING_EXCEPTION) return       ; (void)(0

  对于CHECK这个宏，不能光看定义，要结合具体使用到的地方来分析，
  比如在share\vm\services\management.cpp的Management::init()方法中有这样的代码:
  _begin_vm_creation_time =
            PerfDataManager::create_variable(SUN_RT, "createVmBeginTime",
                                             PerfData::U_None, CHECK);

  因为在exceptions.hpp中有:
  #define THREAD __the_thread__
  #define HAS_PENDING_EXCEPTION (((ThreadShadow*)THREAD)->has_pending_exception())
  所以THREAD是__the_thread__，
  HAS_PENDING_EXCEPTION是(((ThreadShadow*)__the_thread__)->has_pending_exception())

  上面的create_variable代码片段展开后就是:
  //1. 用 “THREAD); if (HAS_PENDING_EXCEPTION) return       ; (void)(0” 替换CHECK
  _begin_vm_creation_time =
            PerfDataManager::create_variable(SUN_RT, "createVmBeginTime",
                                             PerfData::U_None, THREAD); if (HAS_PENDING_EXCEPTION) return       ; (void)(0);

  //2. 用“__the_thread__”替换THREAD
  _begin_vm_creation_time =
            PerfDataManager::create_variable(SUN_RT, "createVmBeginTime",
                                             PerfData::U_None, __the_thread__); if (HAS_PENDING_EXCEPTION) return ; (void)(0);

  //3. 用“(((ThreadShadow*)THREAD)->has_pending_exception())”替换HAS_PENDING_EXCEPTION
  _begin_vm_creation_time =
            PerfDataManager::create_variable(SUN_RT, "createVmBeginTime",
                                             PerfData::U_None, __the_thread__); 
											 if ((((ThreadShadow*)__the_thread__)->has_pending_exception())) return ; (void)(0);
											 


- share\vm\runtime\perfData.cpp

    //调用create_entry方法
	PerfLong::PerfLong(CounterNS ns, const char* namep, Units u, Variability v)
					 : PerfData(ns, namep, u, v) {

	  create_entry(T_LONG, sizeof(jlong)); //为什么少一个参数呢
	}

    //create_entry方法定义中vlen不是默认值
    void PerfData::create_entry(BasicType dtype, size_t dsize, size_t vlen)

	//但是create_entry方法的声明处是有默认值的，
	//所以在用vs看代码时如果迷惑了，要记得转到声明处看看。
    void create_entry(BasicType dtype, size_t dsize, size_t dlen = 0);
