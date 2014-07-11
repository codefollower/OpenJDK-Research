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






http://hllvm.group.iteye.com/group/topic/37604

能解释下java层面调用native方法怎么找到本地库中对应的方法的吗

native lookup/invocation分好几步做。 

首先是VM启动阶段。InterpreterGenerator::generate_native_entry()生成native方法的解释器入口（下称native entry）。 

类加载的时候，ClassFileParser看到某个方法的修饰符里有ACC_NATIVE就会在该方法对应的Method的AccessFlags里同样记录下JVM_ACC_NATIVE。这样该method->is_native()就会是true。 
接下来到类的初始化阶段， 
instanceKlass::initialize() 
-> instanceKlass::initialize_impl() 
   -> instanceKlass::link_class() 
      -> instanceKlass::link_class_impl() 
         -> instanceKlass::rewrite_class() 
            -> Rewriter::rewrite() 
              -> Rewriter::Rewriter() 
                  -> methodOopDesc::link_method() 
                     -> Interpreter::entry_for_method() 
                        -> AbstractInterpreter::method_kind() 
这个路径上，methodOopDesc::link_method()找到了该方法对应的解释器入口后会设置到method的_i2i_entry和_from_interpreted_entry。这样这个method就跟最初VM初始化阶段生成的native方法解释器入口关联在一起了。 

然后是解释器里的链接阶段。通常在该方法第一次被调用的时候触发。invoke*字节码指令执行时要先检查调用目标是否已经resolve好了，没有的话就要做resolution。对应的代码由TemplateTable::resolve_cache_and_index()生成，调用InterpreterRuntime::resolve_invoke() 
-> LinkResolver::resolve_invoke() 
   -> ... 
     -> LinkResolver::resolve_method() 
这个路径会把某条invoke*字节码指令的参数的符号链接解析（resolve）为实际的method指针然后存在constant pool cache里。这样，接下来解释器就可以通过解析好的method指针找到from_interpreted_entry()进入native方法的解释器入口。 

当某个native方法真的被调用时，一开始它会从解释器进入。这就进到最初提到的generate_native_entry()所生成的代码——native entry处。 
它会调用 
InterpreterRuntime::prepare_native_call()来获取native函数真正的入口地址。这里会先检查Method的has_native_function()看之前是否已经在Method对象里记录下了native函数入口地址。如果已有地址的话可能是JNI库在JNI_OnLoad()的时候调用了RegisterNatives()来注册函数地址信息，这样就不需要后面的查找过程（也就不需要遵循Java native函数的命名规则了，例如说一定要"Java_"开头之类的）；也有可能这已经不是第一调用该native方法，于是已经经历过下面要说的查找过程了。 
如果没有记录下函数地址，就调用NativeLookup::lookup()来寻找native方法真正的目标在什么地方，然后把它记在Method里。其中在NativeLookup::lookup()里会通过NativeLookup::pure_jni_name()来构造出符合JNI规范的函数名，然后通过os::dll_lookup()在查找路径中能找到的动态链接库里去找这个名字对应的地址。 

Method里有方法调用次数的计数器，而native entry里有递增这个计数器的逻辑。当一个native方法被调用足够多次之后，HotSpot会为它生成专门的入口（替换掉原本通用的解释器入口）。这种入口叫做native wrapper。Signature相同的native方法共享同一个native wrapper。 
CompileBroker::compile_method() 
-> AdapterHandlerLibrary::create_native_wrapper() 
   -> SharedRuntime::generate_native_wrapper() 

---------------------------------------------------------- 

无论是解释器的native方法入口，还是后面生成出来的native wrapper，在调用native方法时要做的事情都差不多： 
1、先调整参数的位置，把所有参数向右挪一位（成员方法）或者两位（静态方法）。挪的过程中顺便分配JNI handle block，把对象指针（oop）参数打包成JNIHandle，以便GC能跟踪到传给native方法的对象指针。 
2、如果是static方法，把类的指针放到第二个参数的位置上。 
3、保持Java调用栈的一些信息（例如set_last_Java_frame()） 
4、如果是synchronized方法，则对合适的对象加锁（this或class） 
5、把JNIEnv参数放到第一个参数的位置上。 
6、把线程状态设置到_thread_in_native 
7、实际调用native方法 
8、从native方法返回后，修正某些寄存器的状态，把返回值挪到合适的地方 
9、把线程状态设置到_thread_in_native_trans 
10、执行一个membar来清理CPU cache 
11、检查是否要进入safepoint 
12、如果是synchronized方法，解锁 
13、还原Java调用栈的一些信息（例如reset_last_Java_frame()） 
14、释放JNI handle block 
15、如果有未处理的异常就抛异常，没异常就返回



