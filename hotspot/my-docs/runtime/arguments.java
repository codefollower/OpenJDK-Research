-XX参数要放在前面，放在运行的类名后面就没用了

-XX:+PrintFlagsWithComments -agentlib:hprof -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test -XX:Flags=E:\openjdk\git\hotspot\my-test\jvmFlagsFile.txt

-XX:Flags=E:\openjdk\git\hotspot\my-test\jvmFlagsFile.txt -agentlib:hprof -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test

-Xrunhprof:help-verbose:gc -agentlib:hprof -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test


-Xrunhprof:help -verbose:gc -agentlib:jdwp -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test


-Xrunhprof:help -verbose:gc -agentlib:jdwp -XX:-DumpSharedSpaces -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test


-XX:NativeMemoryTracking=detail -Xrunhprof:help -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test

-XX:NativeMemoryTracking=detail -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test


比较长的方法:
check_vm_args_consistency
parse_each_vm_init_arg
parse
apply_ergo

一些方法调用顺序
process_sun_java_launcher_properties -> init_system_properties -> init_version_specific_system_properties
-> parse -> apply_ergo -> adjust_after_os

SysClassPath如:
==================
D:\JavaSE1.8\jre\lib\resources.jar;D:\JavaSE1.8\jre\lib\rt.jar;D:\JavaSE1.8\jre\lib\sunrsasign.jar;D:\JavaSE1.8\jre\lib\jsse.jar;D:\JavaSE1.8\jre\lib\jce.jar;D:\JavaSE1.8\jre\lib\charsets.jar;D:\JavaSE1.8\jre\lib\jfr.jar;D:\JavaSE1.8\jre\classes

-XX:NativeMemoryTracking=detail -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test

//加-XX:+PrintMallocFree会出现错误：Internal Error at mutex.cpp:454
-XX:+PrintMallocFree -XX:NativeMemoryTracking=detail -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test

-XX:NativeMemoryTracking=detail -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test Test

-XX:NativeMemoryTracking=detail -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test\jni\corejava7-v2-ch11\Printf3Test -Djava.library.path=E:\openjdk\git\hotspot\my-test\jni\corejava7-v2-ch11\Printf3Test Printf3Test

-XX:+TraceJNICalls -XX:NativeMemoryTracking=detail -verbose:gc  -XX:-DumpSharedSpaces -XX:-VerifyDuringStartup -XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -cp E:\openjdk\git\hotspot\my-test\jni\corejava7-v2-ch11\Printf3Test -Djava.library.path=E:\openjdk\git\hotspot\my-test\jni\corejava7-v2-ch11\Printf3Test Printf3Test

-XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -Djava.library.path=E:\openjdk\git\hotspot\my-test\jvmti\jdk-demo\versionCheck -agentlib:myagent=help -version 

-XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -agentlib:myagent=help -version

-XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -Xbootclasspath/a:myagent.jar -agentlib:myagent=max=2 -version
 
-XX:+CompileTheWorld 会退出JVN


按代码运行顺序先后出现的参数:

-Dsun.java.launcher 
-Dsun.java.launcher.pid 在windows平台没用(os\windows\vm\os_windows.cpp在void os::init(void)方法中调用_getpid()就得到了

//在match_option方法中加上
bool p = false;
if(p) tty->print_cr("%s", name);
在Arguments::parse_each_vm_init_arg 设置p = true;
然后就可以打印下面参数

总共96个
三个特殊的-D选项:
-Djava.class.path
-Dsun.java.command
-Dsun.java.launcher
-verbose
-da
-ea
-disableassertions
-enableassertions
-dsa
-esa
-disablesystemassertions
-enablesystemassertions
-Xbootclasspath:
-Xbootclasspath/a:
-Xbootclasspath/p:
-Xrun
-agentlib:
-agentpath:
-javaagent:
-Xnoclassgc
-Xincgc
-Xnoincgc
-Xconcgc
-Xnoconcgc
-Xbatch
-Xmn
-Xms
-Xmx
-XX:MaxHeapSize=
-Xmaxf
-Xminf
-Xss
-Xoss
-XX:CodeCacheExpansionSize=
-Xmaxjitcodesize
-XX:ReservedCodeCacheSize=
-XX:IncreaseFirstTierCompileThresholdAt=
-green
-native
-Xsqnopause
-Xrs
-Xusealtsigs
-Xoptimize
-Xprof
-Xconcurrentio
-Xinternalversion
-Xprintflags
-D (-Dcom.sun.management)
-Xint
-Xmixed
-Xcomp
-Xshare:dump
-Xshare:on
-Xshare:auto
-Xshare:off
-Xverify
-Xdebug
-Xnoagent
-Xboundthreads
-Xloggc:
-Xcheck
vfprintf
exit
abort
-XX:+AggressiveHeap
-XX:+NeverTenure
-XX:+AlwaysTenure
-XX:+CMSPermGenSweepingEnabled
-XX:-CMSPermGenSweepingEnabled
-XX:+UseGCTimeLimit
-XX:-UseGCTimeLimit
-XX:MaxTLERatio=
-XX:+ResizeTLE
-XX:-ResizeTLE
-XX:+PrintTLE
-XX:-PrintTLE
-XX:TLEFragmentationRatio=
-XX:TLESize=
-XX:TLEThreadRatio=
-XX:+UseTLE
-XX:-UseTLE
-XX:+DisplayVMOutputToStderr
-XX:+DisplayVMOutputToStdout
-XX:+ExtendedDTraceProbes
-XX:+FullGCALot
-XX:CMSParPromoteBlocksToClaim=
-XX:ParCMSPromoteBlocksToClaim=
-XX:ParallelGCOldGenAllocBufferSize=
-XX:ParallelGCToSpaceAllocBufferSize=
-XX:CMSMarkStackSize=
-XX:G1MarkStackSize=
-XX:CMSMarkStackSizeMax=
-XX:ParallelMarkingThreads=
-XX:ParallelCMSThreads=
-XX:MaxDirectMemorySize=
-XX:+UseVMInterruptibleIO





-verbose等价于-verbose:class 
把TraceClassLoading和TraceClassUnloading都设为true

-verbose:gc把PrintGC设为true
-verbose:jni把PrintJNIResolving设为true





加 -XX:+PrintFlagsInitial
==================================(在share\vm\runtime\globals.hpp定义)
	[Global flags]
		uintx AdaptiveSizeDecrementScaleFactor          = 4               {product}
		uintx AdaptiveSizeMajorGCDecayTimeScale         = 10              {product}
		uintx AdaptiveSizePausePolicy                   = 0               {product}
		uintx AdaptiveSizePolicyCollectionCostMargin    = 50              {product}
		uintx AdaptiveSizePolicyInitializingSteps       = 20              {product}
		uintx AdaptiveSizePolicyOutputInterval          = 0               {product}
		uintx AdaptiveSizePolicyWeight                  = 10              {product}
		uintx AdaptiveSizeThroughPutPolicy              = 0               {product}
		uintx AdaptiveTimeWeight                        = 25              {product}
		 bool AdjustConcurrency                         = false           {product}
		 bool AggressiveOpts                            = false           {product}
		 intx AllocateInstancePrefetchLines             = 1               {product}
		 intx AllocatePrefetchDistance                  = -1              {product}
		 intx AllocatePrefetchInstr                     = 0               {product}
		 intx AllocatePrefetchLines                     = 3               {product}
		 intx AllocatePrefetchStepSize                  = 16              {product}
		 intx AllocatePrefetchStyle                     = 1               {product}
		 bool AllowJNIEnvProxy                          = false           {product}
		 bool AllowNonVirtualCalls                      = false           {product}
		 bool AllowParallelDefineClass                  = false           {product}
		 bool AllowUserSignalHandlers                   = false           {product}
		 bool AlwaysActAsServerClassMachine             = false           {product}
		 bool AlwaysCompileLoopMethods                  = false           {product}
		 bool AlwaysLockClassLoader                     = false           {product}
		 bool AlwaysPreTouch                            = false           {product}
		 bool AlwaysRestoreFPU                          = false           {product}
		 bool AlwaysTenure                              = false           {product}
		 bool AssertOnSuspendWaitFailure                = false           {product}
		 bool AssumeMP                                  = false           {product}
		uintx AutoGCSelectPauseMillis                   = 5000            {product}
		 intx BCEATraceLevel                            = 0               {product}
		 intx BackEdgeThreshold                         = 100000          {pd product}
		 bool BackgroundCompilation                     = true            {pd product}
		uintx BaseFootPrintEstimate                     = 268435456       {product}
		 intx BiasedLockingBulkRebiasThreshold          = 20              {product}
		 intx BiasedLockingBulkRevokeThreshold          = 40              {product}
		 intx BiasedLockingDecayTime                    = 25000           {product}
		 intx BiasedLockingStartupDelay                 = 4000            {product}
		 bool BindGCTaskThreadsToCPUs                   = false           {product}
		 bool BytecodeVerificationLocal                 = false           {product}
		 bool BytecodeVerificationRemote                = true            {product}
		 bool C1OptimizeVirtualCallProfiling            = true            {C1 product}
		 bool C1ProfileBranches                         = true            {C1 product}
		 bool C1ProfileCalls                            = true            {C1 product}
		 bool C1ProfileCheckcasts                       = true            {C1 product}
		 bool C1ProfileInlinedCalls                     = true            {C1 product}
		 bool C1ProfileVirtualCalls                     = true            {C1 product}
		 bool C1UpdateMethodData                        = false           {C1 product}
		 intx CICompilerCount                           = 1               {product}
		 bool CICompilerCountPerCPU                     = false           {product}
		 bool CITime                                    = false           {product}
		 bool CMSAbortSemantics                         = false           {product}
		uintx CMSAbortablePrecleanMinWorkPerIteration   = 100             {product}
		 intx CMSAbortablePrecleanWaitMillis            = 100             {manageable}
		uintx CMSBitMapYieldQuantum                     = 10485760        {product}
		uintx CMSBootstrapOccupancy                     = 50              {product}
		 bool CMSClassUnloadingEnabled                  = true            {product}
		uintx CMSClassUnloadingMaxInterval              = 0               {product}
		 bool CMSCleanOnEnter                           = true            {product}
		 bool CMSCompactWhenClearAllSoftRefs            = true            {product}
		uintx CMSConcMarkMultiple                       = 32              {product}
		 bool CMSConcurrentMTEnabled                    = true            {product}
		uintx CMSCoordinatorYieldSleepCount             = 10              {product}
		 bool CMSDumpAtPromotionFailure                 = false           {product}
		 bool CMSEdenChunksRecordAlways                 = true            {product}
		uintx CMSExpAvgFactor                           = 50              {product}
		 bool CMSExtrapolateSweep                       = false           {product}
		uintx CMSFullGCsBeforeCompaction                = 0               {product}
		uintx CMSIncrementalDutyCycle                   = 10              {product}
		uintx CMSIncrementalDutyCycleMin                = 0               {product}
		 bool CMSIncrementalMode                        = false           {product}
		uintx CMSIncrementalOffset                      = 0               {product}
		 bool CMSIncrementalPacing                      = true            {product}
		uintx CMSIncrementalSafetyFactor                = 10              {product}
		uintx CMSIndexedFreeListReplenish               = 4               {product}
		 intx CMSInitiatingOccupancyFraction            = -1              {product}
		uintx CMSIsTooFullPercentage                    = 98              {product}
	   double CMSLargeCoalSurplusPercent                = 0.950000        {product}
	   double CMSLargeSplitSurplusPercent               = 1.000000        {product}
		 bool CMSLoopWarn                               = false           {product}
		uintx CMSMaxAbortablePrecleanLoops              = 0               {product}
		 intx CMSMaxAbortablePrecleanTime               = 5000            {product}
		uintx CMSOldPLABMax                             = 1024            {product}
		uintx CMSOldPLABMin                             = 16              {product}
		uintx CMSOldPLABNumRefills                      = 4               {product}
		uintx CMSOldPLABReactivityFactor                = 2               {product}
		 bool CMSOldPLABResizeQuicker                   = false           {product}
		uintx CMSOldPLABToleranceFactor                 = 4               {product}
		 bool CMSPLABRecordAlways                       = true            {product}
		uintx CMSParPromoteBlocksToClaim                = 16              {product}
		 bool CMSParallelInitialMarkEnabled             = true            {product}
		 bool CMSParallelRemarkEnabled                  = true            {product}
		 bool CMSParallelSurvivorRemarkEnabled          = true            {product}
		uintx CMSPrecleanDenominator                    = 3               {product}
		uintx CMSPrecleanIter                           = 3               {product}
		uintx CMSPrecleanNumerator                      = 2               {product}
		 bool CMSPrecleanRefLists1                      = true            {product}
		 bool CMSPrecleanRefLists2                      = false           {product}
		 bool CMSPrecleanSurvivors1                     = false           {product}
		 bool CMSPrecleanSurvivors2                     = true            {product}
		uintx CMSPrecleanThreshold                      = 1000            {product}
		 bool CMSPrecleaningEnabled                     = true            {product}
		 bool CMSPrintChunksInDump                      = false           {product}
		 bool CMSPrintEdenSurvivorChunks                = false           {product}
		 bool CMSPrintObjectsInDump                     = false           {product}
		uintx CMSRemarkVerifyVariant                    = 1               {product}
		 bool CMSReplenishIntermediate                  = true            {product}
		uintx CMSRescanMultiple                         = 32              {product}
		uintx CMSSamplingGrain                          = 16384           {product}
		 bool CMSScavengeBeforeRemark                   = false           {product}
		uintx CMSScheduleRemarkEdenPenetration          = 50              {product}
		uintx CMSScheduleRemarkEdenSizeThreshold        = 2097152         {product}
		uintx CMSScheduleRemarkSamplingRatio            = 5               {product}
	   double CMSSmallCoalSurplusPercent                = 1.050000        {product}
	   double CMSSmallSplitSurplusPercent               = 1.100000        {product}
		 bool CMSSplitIndexedFreeListBlocks             = true            {product}
		uintx CMSTriggerRatio                           = 80              {product}
		 intx CMSWaitDuration                           = 2000            {manageable}
		uintx CMSWorkQueueDrainThreshold                = 10              {product}
		 bool CMSYield                                  = true            {product}
		uintx CMSYieldSleepCount                        = 0               {product}
		uintx CMSYoungGenPerWorker                      = 67108864        {pd product}
		uintx CMS_FLSPadding                            = 1               {product}
		uintx CMS_FLSWeight                             = 75              {product}
		uintx CMS_SweepPadding                          = 1               {product}
		uintx CMS_SweepTimerThresholdMillis             = 10              {product}
		uintx CMS_SweepWeight                           = 75              {product}
		 bool CheckJNICalls                             = false           {product}
		 bool ClassUnloading                            = true            {product}
		 intx ClearFPUAtPark                            = 0               {product}
		 bool ClipInlining                              = true            {product}
		uintx CodeCacheExpansionSize                    = 32768           {pd product}
		uintx CodeCacheMinimumFreeSpace                 = 512000          {product}
		 bool CollectGen0First                          = false           {product}
		 bool CompactFields                             = true            {product}
		 intx CompilationPolicyChoice                   = 0               {product}
		 intx CompilationRepeat                         = 0               {C1 product}
	ccstrlist CompileCommand                            =                 {product}
		ccstr CompileCommandFile                        =                 {product}
	ccstrlist CompileOnly                               =                 {product}
		 intx CompileThreshold                          = 1500            {pd product}
		 bool CompilerThreadHintNoPreempt               = true            {product}
		 intx CompilerThreadPriority                    = -1              {product}
		 intx CompilerThreadStackSize                   = 0               {pd product}
		uintx CompressedClassSpaceSize                  = 1073741824      {product}
		uintx ConcGCThreads                             = 0               {product}
		 intx ContendedPaddingWidth                     = 128             {product}
		 bool ConvertSleepToYield                       = true            {pd product}
		 bool ConvertYieldToSleep                       = false           {product}
		 bool CreateMinidumpOnCrash                     = false           {product}
		 bool CriticalJNINatives                        = true            {product}
		 bool DTraceAllocProbes                         = false           {product}
		 bool DTraceMethodProbes                        = false           {product}
		 bool DTraceMonitorProbes                       = false           {product}
		 bool Debugging                                 = false           {product}
		uintx DefaultMaxRAMFraction                     = 4               {product}
		 intx DefaultThreadPriority                     = -1              {product}
		 intx DeferPollingPageLoopCount                 = -1              {product}
		 intx DeferThrSuspendLoopCount                  = 4000            {product}
		 bool DeoptimizeRandom                          = false           {product}
		 bool DisableAttachMechanism                    = false           {product}
		 bool DisableExplicitGC                         = false           {product}
		 bool DisplayVMOutputToStderr                   = false           {product}
		 bool DisplayVMOutputToStdout                   = false           {product}
		 bool DontCompileHugeMethods                    = true            {product}
		 bool DontYieldALot                             = false           {pd product}
		 bool DumpReplayDataOnError                     = true            {product}
		 bool DumpSharedSpaces                          = false           {product}
		 bool EagerXrunInit                             = false           {product}
		 intx EmitSync                                  = 0               {product}
		 bool EnableContended                           = true            {product}
		 bool EnableTracing                             = false           {product}
		uintx ErgoHeapSizeLimit                         = 0               {product}
		ccstr ErrorFile                                 =                 {product}
		ccstr ErrorReportServer                         =                 {product}
		 bool EstimateArgEscape                         = true            {product}
		 bool ExplicitGCInvokesConcurrent               = false           {product}
		 bool ExplicitGCInvokesConcurrentAndUnloadsClasses  = false           {product}
		 bool ExtendedDTraceProbes                      = false           {product}
		 bool FLSAlwaysCoalesceLarge                    = false           {product}
		uintx FLSCoalescePolicy                         = 2               {product}
	   double FLSLargestBlockCoalesceProximity          = 0.990000        {product}
		 bool FailOverToOldVerifier                     = true            {product}
		 bool FastTLABRefill                            = true            {product}
		 intx FenceInstruction                          = 0               {ARCH product}
		 intx FieldsAllocationStyle                     = 1               {product}
		 bool FilterSpuriousWakeups                     = true            {product}
		 bool ForceNUMA                                 = false           {product}
		 bool ForceTimeHighResolution                   = false           {product}
		 intx FreqInlineSize                            = 325             {pd product}
	   double G1ConcMarkStepDurationMillis              = 10.000000       {product}
		uintx G1ConcRSHotCardLimit                      = 4               {product}
		uintx G1ConcRSLogCacheSize                      = 10              {product}
		 intx G1ConcRefinementGreenZone                 = 0               {product}
		 intx G1ConcRefinementRedZone                   = 0               {product}
		 intx G1ConcRefinementServiceIntervalMillis     = 300             {product}
		uintx G1ConcRefinementThreads                   = 0               {product}
		 intx G1ConcRefinementThresholdStep             = 0               {product}
		 intx G1ConcRefinementYellowZone                = 0               {product}
		uintx G1ConfidencePercent                       = 50              {product}
		uintx G1HeapRegionSize                          = 0               {product}
		uintx G1HeapWastePercent                        = 10              {product}
		uintx G1MixedGCCountTarget                      = 8               {product}
		 intx G1RSetRegionEntries                       = 0               {product}
		uintx G1RSetScanBlockSize                       = 64              {product}
		 intx G1RSetSparseRegionEntries                 = 0               {product}
		 intx G1RSetUpdatingPauseTimePercent            = 10              {product}
		 intx G1RefProcDrainInterval                    = 10              {product}
		uintx G1ReservePercent                          = 10              {product}
		uintx G1SATBBufferEnqueueingThresholdPercent    = 60              {product}
		 intx G1SATBBufferSize                          = 1024            {product}
		 intx G1UpdateBufferSize                        = 256             {product}
		 bool G1UseAdaptiveConcRefinement               = true            {product}
		uintx GCDrainStackTargetSize                    = 64              {product}
		uintx GCHeapFreeLimit                           = 2               {product}
		uintx GCLockerEdenExpansionPercent              = 5               {product}
		 bool GCLockerInvokesConcurrent                 = false           {product}
		uintx GCLogFileSize                             = 0               {product}
		uintx GCPauseIntervalMillis                     = 0               {product}
		uintx GCTaskTimeStampEntries                    = 200             {product}
		uintx GCTimeLimit                               = 98              {product}
		uintx GCTimeRatio                               = 99              {product}
		uintx HeapBaseMinAddress                        = 2147483648      {pd product}
		 bool HeapDumpAfterFullGC                       = false           {manageable}
		 bool HeapDumpBeforeFullGC                      = false           {manageable}
		 bool HeapDumpOnOutOfMemoryError                = false           {manageable}
		ccstr HeapDumpPath                              =                 {manageable}
		uintx HeapFirstMaximumCompactionCount           = 3               {product}
		uintx HeapMaximumCompactionInterval             = 20              {product}
		uintx HeapSizePerGCThread                       = 67108864        {product}
		 bool IgnoreUnrecognizedVMOptions               = false           {product}
		uintx IncreaseFirstTierCompileThresholdAt       = 50              {product}
		uintx InitialBootClassLoaderMetaspaceSize       = 2252800         {product}
		uintx InitialCodeCacheSize                      = 163840          {pd product}
		uintx InitialHeapSize                           = 0               {product}
		uintx InitialRAMFraction                        = 64              {product}
		uintx InitialSurvivorRatio                      = 8               {product}
		uintx InitialTenuringThreshold                  = 7               {product}
		uintx InitiatingHeapOccupancyPercent            = 45              {product}
		 bool Inline                                    = true            {product}
		 intx InlineSmallCode                           = 1000            {pd product}
		 bool InlineSynchronizedMethods                 = true            {C1 product}
		 intx InterpreterProfilePercentage              = 33              {product}
		 bool JNIDetachReleasesMonitors                 = true            {product}
		 bool JavaMonitorsInStackTrace                  = true            {product}
		 intx JavaPriority10_To_OSPriority              = -1              {product}
		 intx JavaPriority1_To_OSPriority               = -1              {product}
		 intx JavaPriority2_To_OSPriority               = -1              {product}
		 intx JavaPriority3_To_OSPriority               = -1              {product}
		 intx JavaPriority4_To_OSPriority               = -1              {product}
		 intx JavaPriority5_To_OSPriority               = -1              {product}
		 intx JavaPriority6_To_OSPriority               = -1              {product}
		 intx JavaPriority7_To_OSPriority               = -1              {product}
		 intx JavaPriority8_To_OSPriority               = -1              {product}
		 intx JavaPriority9_To_OSPriority               = -1              {product}
		 bool LIRFillDelaySlots                         = false           {C1 pd product}
		uintx LargePageHeapSizeThreshold                = 134217728       {product}
		uintx LargePageSizeInBytes                      = 0               {product}
		 bool LazyBootClassLoader                       = true            {product}
		 bool LogCommercialFeatures                     = false           {product}
		 bool ManagementServer                          = false           {product}
		uintx MarkStackSize                             = 32768           {product}
		uintx MarkStackSizeMax                          = 4194304         {product}
		uintx MarkSweepAlwaysCompactCount               = 4               {product}
		uintx MarkSweepDeadRatio                        = 5               {product}
		 intx MaxBCEAEstimateLevel                      = 5               {product}
		 intx MaxBCEAEstimateSize                       = 150             {product}
		uintx MaxDirectMemorySize                       = 0               {product}
		 bool MaxFDLimit                                = true            {product}
		uintx MaxGCMinorPauseMillis                     = 4294967295      {product}
		uintx MaxGCPauseMillis                          = 4294967295      {product}
		uintx MaxHeapFreeRatio                          = 70              {product}
		uintx MaxHeapSize                               = 100663296       {product}
		 intx MaxInlineLevel                            = 9               {product}
		 intx MaxInlineSize                             = 35              {product}
		 intx MaxJavaStackTraceDepth                    = 1024            {product}
		uintx MaxMetaspaceExpansion                     = 4194304         {product}
		uintx MaxMetaspaceFreeRatio                     = 70              {product}
		uintx MaxMetaspaceSize                          = 4294967295      {product}
		uintx MaxNewSize                                = 4294967295      {product}
	 uint64_t MaxRAM                                    = 1073741824      {pd product}
		uintx MaxRAMFraction                            = 4               {product}
		 intx MaxRecursiveInlineLevel                   = 1               {product}
		uintx MaxTenuringThreshold                      = 15              {product}
		 intx MaxTrivialSize                            = 6               {product}
		uintx MetaspaceSize                             = 12582912        {pd product}
		 bool MethodFlushing                            = true            {product}
		uintx MinHeapDeltaBytes                         = 131072          {product}
		uintx MinHeapFreeRatio                          = 40              {product}
		 intx MinInliningThreshold                      = 250             {product}
		uintx MinMetaspaceExpansion                     = 262144          {product}
		uintx MinMetaspaceFreeRatio                     = 40              {product}
		uintx MinRAMFraction                            = 2               {product}
		uintx MinSurvivorRatio                          = 3               {product}
		uintx MinTLABSize                               = 2048            {product}
		 intx MonitorBound                              = 0               {product}
		 bool MonitorInUseLists                         = false           {product}
		 bool MustCallLoadClassInternal                 = false           {product}
		uintx NUMAChunkResizeWeight                     = 20              {product}
		uintx NUMAInterleaveGranularity                 = 2097152         {product}
		uintx NUMAPageScanRate                          = 256             {product}
		uintx NUMASpaceResizeRate                       = 1073741824      {product}
		 bool NUMAStats                                 = false           {product}
		ccstr NativeMemoryTracking                      = off             {product}
		 intx NativeMonitorFlags                        = 0               {product}
		 intx NativeMonitorSpinLimit                    = 20              {product}
		 intx NativeMonitorTimeout                      = -1              {product}
		 bool NeedsDeoptSuspend                         = false           {pd product}
		 bool NeverActAsServerClassMachine              = true            {pd product}
		 bool NeverTenure                               = false           {product}
		uintx NewRatio                                  = 2               {product}
		uintx NewSize                                   = 1048576         {product}
		uintx NewSizeThreadIncrease                     = 4096            {pd product}
		 intx NmethodSweepActivity                      = 10              {product}
		 intx NmethodSweepCheckInterval                 = 5               {product}
		 intx NmethodSweepFraction                      = 16              {product}
		uintx NumberOfGCLogFiles                        = 0               {product}
		uintx OldPLABSize                               = 1024            {product}
		uintx OldPLABWeight                             = 50              {product}
		uintx OldSize                                   = 4194304         {product}
		 bool OmitStackTraceInFastThrow                 = true            {product}
	ccstrlist OnError                                   =                 {product}
	ccstrlist OnOutOfMemoryError                        =                 {product}
		 intx OnStackReplacePercentage                  = 933             {pd product}
		 intx OptoLoopAlignment                         = 16              {pd product}
		uintx PLABWeight                                = 75              {product}
		 bool PSChunkLargeArrays                        = true            {product}
		 intx ParGCArrayScanChunk                       = 50              {product}
		uintx ParGCDesiredObjsFromOverflowList          = 20              {product}
		 bool ParGCTrimOverflow                         = true            {product}
		 bool ParGCUseLocalOverflow                     = false           {product}
		uintx ParallelGCBufferWastePct                  = 10              {product}
		uintx ParallelGCThreads                         = 0               {product}
		 bool ParallelGCVerbose                         = false           {product}
		uintx ParallelOldDeadWoodLimiterMean            = 50              {product}
		uintx ParallelOldDeadWoodLimiterStdDev          = 80              {product}
		 bool ParallelRefProcBalancingEnabled           = true            {product}
		 bool ParallelRefProcEnabled                    = false           {product}
		uintx PausePadding                              = 1               {product}
		 intx PerBytecodeRecompilationCutoff            = 200             {product}
		 intx PerBytecodeTrapLimit                      = 4               {product}
		 intx PerMethodRecompilationCutoff              = 400             {product}
		 intx PerMethodTrapLimit                        = 100             {product}
		 bool PerfAllowAtExitRegistration               = false           {product}
		 bool PerfBypassFileSystemCheck                 = false           {product}
		 intx PerfDataMemorySize                        = 32768           {product}
		 intx PerfDataSamplingInterval                  = 50              {product}
		ccstr PerfDataSaveFile                          =                 {product}
		 bool PerfDataSaveToFile                        = false           {product}
		 bool PerfDisableSharedMem                      = false           {product}
		 intx PerfMaxStringConstLength                  = 1024            {product}
		 intx PreInflateSpin                            = 10              {pd product}
		 bool PreferInterpreterNativeStubs              = false           {pd product}
		 intx PrefetchCopyIntervalInBytes               = -1              {product}
		 intx PrefetchFieldsAhead                       = -1              {product}
		 intx PrefetchScanIntervalInBytes               = -1              {product}
		 bool PreserveAllAnnotations                    = false           {product}
		uintx PretenureSizeThreshold                    = 0               {product}
		 bool PrintAdaptiveSizePolicy                   = false           {product}
		 bool PrintCMSInitiationStatistics              = false           {product}
		 intx PrintCMSStatistics                        = 0               {product}
		 bool PrintClassHistogram                       = false           {manageable}
		 bool PrintClassHistogramAfterFullGC            = false           {manageable}
		 bool PrintClassHistogramBeforeFullGC           = false           {manageable}
		 bool PrintCodeCache                            = false           {product}
		 bool PrintCodeCacheOnCompilation               = false           {product}
		 bool PrintCommandLineFlags                     = false           {product}
		 bool PrintCompilation                          = false           {product}
		 bool PrintConcurrentLocks                      = false           {manageable}
		 intx PrintFLSCensus                            = 0               {product}
		 intx PrintFLSStatistics                        = 0               {product}
		 bool PrintFlagsFinal                           = false           {product}
		 bool PrintFlagsInitial                         = false           {product}
		 bool PrintGC                                   = false           {manageable}
		 bool PrintGCApplicationConcurrentTime          = false           {product}
		 bool PrintGCApplicationStoppedTime             = false           {product}
		 bool PrintGCCause                              = true            {product}
		 bool PrintGCDateStamps                         = false           {manageable}
		 bool PrintGCDetails                            = false           {manageable}
		 bool PrintGCTaskTimeStamps                     = false           {product}
		 bool PrintGCTimeStamps                         = false           {manageable}
		 bool PrintHeapAtGC                             = false           {product rw}
		 bool PrintHeapAtGCExtended                     = false           {product rw}
		 bool PrintHeapAtSIGBREAK                       = true            {product}
		 bool PrintJNIGCStalls                          = false           {product}
		 bool PrintJNIResolving                         = false           {product}
		 bool PrintOldPLAB                              = false           {product}
		 bool PrintOopAddress                           = false           {product}
		 bool PrintPLAB                                 = false           {product}
		 bool PrintParallelOldGCPhaseTimes              = false           {product}
		 bool PrintPromotionFailure                     = false           {product}
		 bool PrintReferenceGC                          = false           {product}
		 bool PrintSafepointStatistics                  = false           {product}
		 intx PrintSafepointStatisticsCount             = 300             {product}
		 intx PrintSafepointStatisticsTimeout           = -1              {product}
		 bool PrintSharedSpaces                         = false           {product}
		 bool PrintStringTableStatistics                = false           {product}
		 bool PrintTLAB                                 = false           {product}
		 bool PrintTenuringDistribution                 = false           {product}
		 bool PrintTieredEvents                         = false           {product}
		 bool PrintVMOptions                            = false           {product}
		 bool PrintVMQWaitTime                          = false           {product}
		 bool PrintWarnings                             = true            {product}
		uintx ProcessDistributionStride                 = 4               {product}
		 bool ProfileInterpreter                        = false           {pd product}
		 bool ProfileIntervals                          = false           {product}
		 intx ProfileIntervalsTicks                     = 100             {product}
		 intx ProfileMaturityPercentage                 = 20              {product}
		 bool ProfileVM                                 = false           {product}
		 bool ProfilerPrintByteCodeStatistics           = false           {product}
		 bool ProfilerRecordPC                          = false           {product}
		uintx PromotedPadding                           = 3               {product}
		uintx QueuedAllocationWarningCount              = 0               {product}
		 bool RangeCheckElimination                     = true            {product}
		 intx ReadPrefetchInstr                         = 0               {ARCH product}
		 bool ReduceSignalUsage                         = false           {product}
		 intx RefDiscoveryPolicy                        = 0               {product}
		 bool ReflectionWrapResolutionErrors            = true            {product}
		 bool RegisterFinalizersAtInit                  = true            {product}
		 bool RelaxAccessControlCheck                   = false           {product}
		ccstr ReplayDataFile                            =                 {product}
		 bool RequireSharedSpaces                       = false           {product}
		uintx ReservedCodeCacheSize                     = 33554432        {pd product}
		 bool ResizeOldPLAB                             = true            {product}
		 bool ResizePLAB                                = true            {product}
		 bool ResizeTLAB                                = true            {pd product}
		 bool RestoreMXCSROnJNICalls                    = false           {product}
		 bool RestrictContended                         = true            {product}
		 bool RewriteBytecodes                          = true            {pd product}
		 bool RewriteFrequentPairs                      = true            {pd product}
		 intx SafepointPollOffset                       = 256             {C1 pd product}
		 intx SafepointSpinBeforeYield                  = 2000            {product}
		 bool SafepointTimeout                          = false           {product}
		 intx SafepointTimeoutDelay                     = 10000           {product}
		 bool ScavengeBeforeFullGC                      = true            {product}
		 intx SelfDestructTimer                         = 0               {product}
		uintx SharedBaseAddress                         = 0               {product}
		uintx SharedMiscCodeSize                        = 122880          {product}
		uintx SharedMiscDataSize                        = 2097152         {product}
		uintx SharedReadOnlySize                        = 12582912        {product}
		uintx SharedReadWriteSize                       = 12582912        {product}
		 bool ShowMessageBoxOnError                     = false           {product}
		 intx SoftRefLRUPolicyMSPerMB                   = 1000            {product}
		 intx StackRedPages                             = 1               {pd product}
		 intx StackShadowPages                          = 4               {pd product}
		 bool StackTraceInThrowable                     = true            {product}
		 intx StackYellowPages                          = 3               {pd product}
		 bool StartAttachListener                       = false           {product}
		 intx StarvationMonitorInterval                 = 200             {product}
		 bool StressLdcRewrite                          = false           {product}
		uintx StringTableSize                           = 1009            {product}
		 bool SuppressFatalErrorMessage                 = false           {product}
		uintx SurvivorPadding                           = 3               {product}
		uintx SurvivorRatio                             = 8               {product}
		 intx SuspendRetryCount                         = 50              {product}
		 intx SuspendRetryDelay                         = 5               {product}
		 intx SyncFlags                                 = 0               {product}
		ccstr SyncKnobs                                 =                 {product}
		 intx SyncVerbose                               = 0               {product}
		uintx TLABAllocationWeight                      = 35              {product}
		uintx TLABRefillWasteFraction                   = 64              {product}
		uintx TLABSize                                  = 0               {product}
		 bool TLABStats                                 = true            {product}
		uintx TLABWasteIncrement                        = 4               {product}
		uintx TLABWasteTargetPercent                    = 1               {product}
		uintx TargetPLABWastePct                        = 10              {product}
		uintx TargetSurvivorRatio                       = 50              {product}
		uintx TenuredGenerationSizeIncrement            = 20              {product}
		uintx TenuredGenerationSizeSupplement           = 80              {product}
		uintx TenuredGenerationSizeSupplementDecay      = 2               {product}
		 intx ThreadPriorityPolicy                      = 0               {product}
		 bool ThreadPriorityVerbose                     = false           {product}
		uintx ThreadSafetyMargin                        = 52428800        {product}
		 intx ThreadStackSize                           = 0               {pd product}
		uintx ThresholdTolerance                        = 10              {product}
		 intx Tier0BackedgeNotifyFreqLog                = 10              {product}
		 intx Tier0InvokeNotifyFreqLog                  = 7               {product}
		 intx Tier0ProfilingStartPercentage             = 200             {product}
		 intx Tier23InlineeNotifyFreqLog                = 20              {product}
		 intx Tier2BackEdgeThreshold                    = 0               {product}
		 intx Tier2BackedgeNotifyFreqLog                = 14              {product}
		 intx Tier2CompileThreshold                     = 0               {product}
		 intx Tier2InvokeNotifyFreqLog                  = 11              {product}
		 intx Tier3BackEdgeThreshold                    = 60000           {product}
		 intx Tier3BackedgeNotifyFreqLog                = 13              {product}
		 intx Tier3CompileThreshold                     = 2000            {product}
		 intx Tier3DelayOff                             = 2               {product}
		 intx Tier3DelayOn                              = 5               {product}
		 intx Tier3InvocationThreshold                  = 200             {product}
		 intx Tier3InvokeNotifyFreqLog                  = 10              {product}
		 intx Tier3LoadFeedback                         = 5               {product}
		 intx Tier3MinInvocationThreshold               = 100             {product}
		 intx Tier4BackEdgeThreshold                    = 40000           {product}
		 intx Tier4CompileThreshold                     = 15000           {product}
		 intx Tier4InvocationThreshold                  = 5000            {product}
		 intx Tier4LoadFeedback                         = 3               {product}
		 intx Tier4MinInvocationThreshold               = 600             {product}
		 bool TieredCompilation                         = false           {pd product}
		 intx TieredCompileTaskTimeout                  = 50              {product}
		 intx TieredRateUpdateMaxTime                   = 25              {product}
		 intx TieredRateUpdateMinTime                   = 1               {product}
		 intx TieredStopAtLevel                         = 4               {product}
		 bool TimeLinearScan                            = false           {C1 product}
		 bool TraceBiasedLocking                        = false           {product}
		 bool TraceClassLoading                         = false           {product rw}
		 bool TraceClassLoadingPreorder                 = false           {product}
		 bool TraceClassResolution                      = false           {product}
		 bool TraceClassUnloading                       = false           {product rw}
		 bool TraceDynamicGCThreads                     = false           {product}
		 bool TraceGen0Time                             = false           {product}
		 bool TraceGen1Time                             = false           {product}
		ccstr TraceJVMTI                                =                 {product}
		 bool TraceLoaderConstraints                    = false           {product rw}
		 bool TraceMetadataHumongousAllocation          = false           {product}
		 bool TraceMonitorInflation                     = false           {product}
		 bool TraceParallelOldGCTasks                   = false           {product}
		 intx TraceRedefineClasses                      = 0               {product}
		 bool TraceSafepointCleanupTime                 = false           {product}
		 bool TraceSuspendWaitFailures                  = false           {product}
		 bool TransmitErrorReport                       = false           {product}
		 intx TypeProfileArgsLimit                      = 2               {product}
		uintx TypeProfileLevel                          = 111             {pd product}
		 intx TypeProfileParmsLimit                     = 2               {product}
		 intx TypeProfileWidth                          = 2               {product}
		 intx UnguardOnExecutionViolation               = 0               {product}
		 bool UnlinkSymbolsALot                         = false           {product}
		 bool Use486InstrsOnly                          = false           {ARCH product}
		 bool UseAES                                    = false           {product}
		 bool UseAESIntrinsics                          = false           {product}
		 intx UseAVX                                    = 99              {ARCH product}
		 bool UseAdaptiveGCBoundary                     = false           {product}
		 bool UseAdaptiveGenerationSizePolicyAtMajorCollection  = true            {product}
		 bool UseAdaptiveGenerationSizePolicyAtMinorCollection  = true            {product}
		 bool UseAdaptiveNUMAChunkSizing                = true            {product}
		 bool UseAdaptiveSizeDecayMajorGCCost           = true            {product}
		 bool UseAdaptiveSizePolicy                     = true            {product}
		 bool UseAdaptiveSizePolicyFootprintGoal        = true            {product}
		 bool UseAdaptiveSizePolicyWithSystemGC         = false           {product}
		 bool UseAddressNop                             = false           {ARCH product}
		 bool UseAltSigs                                = false           {product}
		 bool UseAutoGCSelectPolicy                     = false           {product}
		 bool UseBiasedLocking                          = true            {product}
		 bool UseBoundThreads                           = true            {product}
		 bool UseCLMUL                                  = false           {ARCH product}
		 bool UseCMSBestFit                             = true            {product}
		 bool UseCMSCollectionPassing                   = true            {product}
		 bool UseCMSCompactAtFullCollection             = true            {product}
		 bool UseCMSInitiatingOccupancyOnly             = false           {product}
		 bool UseCRC32Intrinsics                        = false           {product}
		 bool UseCodeCacheFlushing                      = true            {product}
		 bool UseCompiler                               = true            {product}
		 bool UseCompilerSafepoints                     = true            {product}
		 bool UseConcMarkSweepGC                        = false           {product}
		 bool UseCountLeadingZerosInstruction           = false           {ARCH product}
		 bool UseCounterDecay                           = true            {product}
		 bool UseDynamicNumberOfGCThreads               = false           {product}
		 bool UseFastAccessorMethods                    = true            {product}
		 bool UseFastEmptyMethods                       = true            {product}
		 bool UseFastJNIAccessors                       = true            {product}
		 bool UseFastStosb                              = false           {ARCH product}
		 bool UseG1GC                                   = false           {product}
		 bool UseGCLogFileRotation                      = false           {product}
		 bool UseGCOverheadLimit                        = true            {product}
		 bool UseGCTaskAffinity                         = false           {product}
		 bool UseHeavyMonitors                          = false           {product}
		 bool UseInlineCaches                           = true            {product}
		 bool UseInterpreter                            = true            {product}
		 bool UseLWPSynchronization                     = true            {product}
		 bool UseLargePages                             = false           {pd product}
		 bool UseLargePagesInMetaspace                  = false           {product}
		 bool UseLargePagesIndividualAllocation        := false           {pd product}
		 bool UseLockedTracing                          = false           {product}
		 bool UseLoopCounter                            = true            {product}
		 bool UseLoopInvariantCodeMotion                = true            {C1 product}
		 bool UseMaximumCompactionOnSystemGC            = true            {product}
		 bool UseMembar                                 = false           {pd product}
		 bool UseNUMA                                   = false           {product}
		 bool UseNUMAInterleaving                       = false           {product}
		 bool UseNewLongLShift                          = false           {ARCH product}
		 bool UseOSErrorReporting                       = false           {pd product}
		 bool UseOnStackReplacement                     = true            {pd product}
		 bool UsePPCLWSYNC                              = true            {product}
		 bool UsePSAdaptiveSurvivorSizePolicy           = true            {product}
		 bool UseParNewGC                               = false           {product}
		 bool UseParallelGC                             = false           {product}
		 bool UseParallelOldGC                          = false           {product}
		 bool UsePerfData                               = true            {product}
		 bool UsePopCountInstruction                    = false           {product}
		 intx UseSSE                                    = 99              {product}
		 bool UseSSE42Intrinsics                        = false           {product}
		 bool UseSerialGC                               = false           {product}
		 bool UseSharedSpaces                           = true            {product}
		 bool UseSignalChaining                         = true            {product}
		 bool UseStoreImmI16                            = true            {ARCH product}
		 bool UseTLAB                                   = true            {pd product}
		 bool UseThreadPriorities                       = true            {pd product}
		 bool UseTypeProfile                            = true            {product}
		 bool UseUTCFileTimestamp                       = true            {product}
		 bool UseUnalignedLoadStores                    = false           {ARCH product}
		 bool UseVMInterruptibleIO                      = false           {product}
		 bool UseXMMForArrayCopy                        = false           {product}
		 bool UseXmmI2D                                 = false           {ARCH product}
		 bool UseXmmI2F                                 = false           {ARCH product}
		 bool UseXmmLoadAndClearUpper                   = true            {ARCH product}
		 bool UseXmmRegToRegMoveAll                     = false           {ARCH product}
		 bool VMThreadHintNoPreempt                     = false           {product}
		 intx VMThreadPriority                          = -1              {product}
		 intx VMThreadStackSize                         = 0               {pd product}
		 intx ValueMapInitialSize                       = 11              {C1 product}
		 intx ValueMapMaxLoopSize                       = 8               {C1 product}
		 bool VerifyMergedCPBytecodes                   = true            {product}
		 intx WorkAroundNPTLTimedWaitHang               = 1               {product}
		uintx YoungGenerationSizeIncrement              = 20              {product}
		uintx YoungGenerationSizeSupplement             = 80              {product}
		uintx YoungGenerationSizeSupplementDecay        = 8               {product}
		uintx YoungPLABSize                             = 4096            {product}
		 bool ZeroTLAB                                  = false           {product}
		 intx hashCode                                  = 5               {product}
