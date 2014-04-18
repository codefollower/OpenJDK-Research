JAVA_TOOL_OPTIONS

通过 export JAVA_TOOL_OPTIONS=xxx设置
如export JAVA_TOOL_OPTIONS=-Da=b,-Dc=e

Prerequisite State for Calling Functions

总共31种事件类型，每种事件类型都有对应的事件回调函数
====================================================
Breakpoint
Class File Load Hook
Class Load
Class Prepare
Compiled Method Load
Compiled Method Unload
Data Dump Request
Dynamic Code Generated
Exception
Exception Catch
Field Access
Field Modification
Frame Pop
Garbage Collection Finish
Garbage Collection Start
Method Entry
Method Exit
Monitor Contended Enter
Monitor Contended Entered
Monitor Wait
Monitor Waited
Native Method Bind
Object Free
Resource Exhausted
Single Step
Thread End
Thread Start
VM Death Event
VM Initialization Event
VM Object Allocation
VM Start Event
====================================================

总共23种函数类型(155-16个RESERVED = 139个函数)
====================================================
Memory Management
Thread
Thread Group
Stack Frame
Force Early Return
Heap
Heap (1.0)
Local Variable
Breakpoint
Watched Field
Class
Object
Field
Method
Raw Monitor
JNI Function Interception
Event Management
Extension Mechanism
Capability
Timers
Class Loader Search
System Properties
General
====================================================

一般套路：
通过jvmtiCapabilities   capabilities来启用具体的功能，不过并不是所有的JVM都支持。
比如：capabilities.can_generate_garbage_collection_events = 1;
然后通过jvmtiEventCallbacks callbacks注册事件。
比如：callbacks.VMInit                  = &vmInit;（vmInit是一个函数指针，相当于是callbacks.VMInit的实现）

最后
(*jvmti)->SetEventCallbacks(jvmti, &callbacks, sizeof(callbacks))设置回调，
(*jvmti)->SetEventNotificationMode(jvmti, JVMTI_ENABLE, JVMTI_EVENT_VM_INIT, NULL)启用事件通知。


Agent_OnLoad方法的调用栈(my-test\jvmti\jdk-demo\versionCheck\versionCheck.c):
-------------------------------
 	myagent.dll!Agent_OnLoad(const JNIInvokeInterface_ * * vm, char * options, void * reserved) Line 101	C
	jvm.dll!Threads::create_vm_init_agents() Line 3825	C++
 	jvm.dll!Threads::create_vm(JavaVMInitArgs * args, bool * canTryAgain) Line 3385	C++
 	jvm.dll!JNI_CreateJavaVM(JavaVM_ * * vm, void * * penv, void * args) Line 5166	C++










