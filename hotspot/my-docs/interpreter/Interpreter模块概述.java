初始化过程
-----------------
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
-----------------
-XX:+TraceBytecodes
-XX:+CountBytecodes
    

JVMTI相关
-----------------
interpreter.cpp -> interpreter_init()触发JVMTI的DynamicCodeGenerated回调

