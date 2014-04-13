DCmd是diagnostic Command的缩写

AllocatedObj
  ResourceObj
    DCmd                 share\vm\services\diagnosticFramework.hpp
	  DCmdWithParser     share\vm\services\diagnosticFramework.hpp
	    HelpDCmd
		PrintVMFlagsDCmd
		VMUptimeDCmd
		HeapDumpDCmd
		ClassHistogramDCmd
		ClassStatsDCmd
		ThreadDumpDCmd
		JMXStartRemoteDCmd
		NMTDCmd          share\vm\services\nmtDCmd.hpp (nmt是Native memory tracking的缩写)
	VersionDCmd
	CommandLineDCmd
	PrintSystemPropertiesDCmd
	SystemGCDCmd
	RunFinalizationDCmd
	JMXStartLocalDCmd
	JMXStopRemoteDCmd


share\vm\services\diagnosticFramework.hpp
--------------------------------------------
enum DCmdSource {
  DCmd_Source_Internal  = 0x01U,  // invocation from the JVM
  DCmd_Source_AttachAPI = 0x02U,  // invocation via the attachAPI
  DCmd_Source_MBean     = 0x04U   // invocation via a MBean
};

struct JavaPermission {
  const char* _class;
  const char* _name;
  const char* _action;
};

AllocatedObj
  StackObj
    CmdLine
	DCmdIter
	DCmdMark
  ResourceObj
    DCmdArgIter
	DCmdInfo
	DCmdArgumentInfo
	DCmd
	  DCmdWithParser
  CHeapObj
    DCmdFactory
	  DCmdFactoryImpl

DCmdParser


AllStatic
  DCmdRegistrant





在命令行窗口中输入：
jcmd <pid> command (jcmd用法见http://docs.oracle.com/javase/7/docs/technotes/tools/windows/jcmd.html)
就可以触发不同DCmd子类的execute方法

如: jcmd 2304 help
输出:
-------------------------
The following commands are available:
VM.native_memory
ManagementAgent.stop
ManagementAgent.start_local
ManagementAgent.start
Thread.print
GC.class_stats
GC.class_histogram
GC.heap_dump
GC.run_finalization
GC.run
VM.uptime
VM.flags
VM.system_properties
VM.command_line
VM.version
help

调用栈:
--------------------------------
>	jvm.dll!HelpDCmd::execute(DCmdSource source, Thread * __the_thread__) Line 83	C++
 	jvm.dll!DCmd::parse_and_execute(DCmdSource source, outputStream * out, const char * cmdline, char delim, Thread * __the_thread__) Line 403	C++
 	jvm.dll!jcmd(AttachOperation * op, outputStream * out) Line 160	C++
 	jvm.dll!attach_listener_thread_entry(JavaThread * thread, Thread * __the_thread__) Line 442	C++
 	jvm.dll!JavaThread::thread_main_inner() Line 1699	C++
 	jvm.dll!JavaThread::run() Line 1682	C++
 	jvm.dll!java_start(Thread * thread) Line 431	C++


