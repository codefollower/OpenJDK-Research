_ValueObj        share\vm\memory\allocation.hpp
  CodeBlob
    BufferBlob
	  AdapterBlob
	  MethodHandlesAdapterBlob
	RuntimeStub
	SingletonBlob
	  DeoptimizationBlob
	  UncommonTrapBlob  (COMPILER2)
	  ExceptionBlob     (COMPILER2)
	  SafepointBlob


RuntimeStub有下面这些，在创建VM的过程中通过share\vm\runtime\sharedRuntime.cpp的generate_stubs()生成:
  static RuntimeStub*        _wrong_method_blob;
  static RuntimeStub*        _wrong_method_abstract_blob;
  static RuntimeStub*        _ic_miss_blob;
  static RuntimeStub*        _resolve_opt_virtual_call_blob;
  static RuntimeStub*        _resolve_virtual_call_blob;
  static RuntimeStub*        _resolve_static_call_blob;



cpu\x86\vm\sharedRuntime_x86_32.cpp的generate_native_wrapper方法实现接近1000行
SharedRuntime::generate_deopt_blob() 名字中的deopt_blob就是DeoptimizationBlob

