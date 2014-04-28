#include "jni.h"
#include "jvmti.h"
#include "agent_util.h"

#define CLASS_NAME "ApiTest"

static jvmtiEnv *jvmti;
static jint rc;
static jvmtiError err;
static jobject outLock;

void JNICALL SetWatchedField(JNIEnv* env) {
  jclass class_ApiTest;
  jfieldID f1;
  jfieldID f2;

  class_ApiTest = (*env)->FindClass(env, CLASS_NAME);
  f1 = (*env)->GetFieldID(env, class_ApiTest, "f1", "I");
  f2 = (*env)->GetFieldID(env, class_ApiTest, "f2", "I");

  err = (*jvmti)->SetFieldAccessWatch(jvmti, class_ApiTest, f1);
  check_jvmti_error(jvmti, err, "Set Field Access Watch");
  err = (*jvmti)->SetFieldModificationWatch(jvmti, class_ApiTest, f1);
  check_jvmti_error(jvmti, err, "Set Field Modification Watch");
  err = (*jvmti)->SetFieldAccessWatch(jvmti, class_ApiTest, f2);
  check_jvmti_error(jvmti, err, "Set Field Access Watch");
}

void JNICALL InitOutLock(JNIEnv* env) {
  jclass class_ApiTest = (*env)->FindClass(env, CLASS_NAME);
  jfieldID out = (*env)->GetStaticFieldID(env, class_ApiTest, "outLock", "Ljava/lang/Object;");
  if(out == NULL)
    check_jni_error(env, "GetStaticFieldID: outLock static field not found");
  outLock = (*env)->GetStaticObjectField(env, class_ApiTest, out);
}

void JNICALL
VMInit(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread) {
	printf("VMInit\n");
  InitOutLock(jni_env);
  SetWatchedField(jni_env);
}

void JNICALL
VMStart(jvmtiEnv *jvmti_env, JNIEnv* jni_env) {
	printf("VMStart\n");
}

void JNICALL
VMDeath(jvmtiEnv *jvmti_env, JNIEnv* jni_env) {
	printf("VMDeath\n");
}

void JNICALL
VMObjectAlloc(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jobject object, jclass object_klass, jlong size) {
	printf("VMObjectAlloc\n");
}

void JNICALL
SingleStep(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jlocation location) {
	printf("VMDeath\n");
}

void JNICALL
Breakpoint(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jlocation location)

{
	printf("Breakpoint\n");
}

void JNICALL
FieldAccess(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jlocation location, jclass field_klass,
		jobject object, jfieldID field)

{
	printf("FieldAccess\n");
}

void JNICALL
FieldModification(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jlocation location, jclass field_klass,
		jobject object, jfieldID field, char signature_type, jvalue new_value)

{
	printf("FieldModification\n");
}

void JNICALL
FramePop(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread, jmethodID method,
		jboolean was_popped_by_exception) {
	printf("FramePop\n");
}

void JNICALL
MethodEntry(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method) {
	printf("MethodEntry\n");
}

void JNICALL
MethodExit(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jboolean was_popped_by_exception, jvalue return_value) {
	printf("MethodExit\n");
}

void JNICALL
NativeMethodBind(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, void* address, void** new_address_ptr)

{
	printf("NativeMethodBind\n");
}
void JNICALL
Exception(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jlocation location, jobject exception,
		jmethodID catch_method, jlocation catch_location)

{
  jclass klass;
  char * source_name;

  printf("Exception\n");
  klass= (*jni_env)->GetObjectClass(jni_env, exception);

  err = (*jvmti)->GetSourceFileName(jvmti, klass, &source_name);
  check_jvmti_error(jvmti, err, "GetSourceFileName");
  printf("GetSourceFileName: %s\n", source_name);
}

void JNICALL
ExceptionCatch(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jmethodID method, jlocation location, jobject exception)

{
	printf("ExceptionCatch\n");
  if((*jni_env)->ExceptionCheck(jni_env)) {
    (*jni_env)->ExceptionDescribe(jni_env);
    (*jni_env)->ExceptionClear(jni_env);
  }
}

void JNICALL
ThreadStart(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread)

{
	printf("ThreadStart\n");
}

void JNICALL
ThreadEnd(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread)

{
	printf("ThreadEnd\n");
}

void JNICALL
ClassLoad(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread, jclass klass)

{
	printf("ClassLoad\n");
}
void JNICALL
ClassPrepare(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread, jclass klass)

{
	printf("ClassPrepare\n");
}

void JNICALL
ClassFileLoadHook(jvmtiEnv *jvmti_env, JNIEnv* jni_env,
		jclass class_being_redefined, jobject loader, const char* name,
		jobject protection_domain, jint class_data_len,
		const unsigned char* class_data, jint* new_class_data_len,
		unsigned char** new_class_data)

{
	printf("ClassFileLoadHook\n");
}

void JNICALL
CompiledMethodLoad(jvmtiEnv *jvmti_env, jmethodID method, jint code_size,
		const void* code_addr, jint map_length, const jvmtiAddrLocationMap* map,
		const void* compile_info) {
	printf("CompiledMethodLoad\n");
}

void JNICALL
CompiledMethodUnload(jvmtiEnv *jvmti_env, jmethodID method,
		const void* code_addr)

{
	printf("CompiledMethodUnload\n");
}
void JNICALL
DynamicCodeGenerated(jvmtiEnv *jvmti_env, const char* name, const void* address,
		jint length)

{
	printf("DynamicCodeGenerated\n");
}
void JNICALL
DataDumpRequest(jvmtiEnv *jvmti_env) {
	printf("DataDumpRequest\n");
}

void JNICALL printThreadName(JNIEnv* jni_env, jthread thread, jobject object, char *eventName) {
  jvmtiThreadInfo info;
  //避免对outLock进行MonitorEnter时导致递归调用
  if((*jni_env)->IsSameObject(jni_env, outLock, object))
     return;
  err = (*jvmti)->GetThreadInfo(jvmti, thread, &info);
  check_jvmti_error(jvmti, err, "GetThreadInfo");

  //TODO
  //4个Monitor的回调会优先在VMInit之前运行吗？
  //全局的outLock变量直到VMInit时才初始化，
  //如果Monitor的回调优先运行那么就要判断outLock是否为NULL
  //if(outLock != NULL) {
    rc = (*jni_env)->MonitorEnter(jni_env, outLock);
    if(rc!=0)
      check_jni_error(jni_env, "MonitorEnter");
  //}
  printf("%-15s: %s\n", info.name, eventName);
  //if(outLock != NULL) {
    rc = (*jni_env)->MonitorExit(jni_env, outLock);
    if(rc!=0)
      check_jni_error(jni_env, "MonitorExit");
  //}
}

void JNICALL
MonitorContendedEnter(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jobject object)
{
	//printf("MonitorContendedEnter\n");
  printThreadName(jni_env, thread, object, "MonitorContendedEnter");
}

void JNICALL
MonitorContendedEntered(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jobject object)
{
	//printf("MonitorContendedEntered\n");
  printThreadName(jni_env, thread, object, "MonitorContendedEntered");
}

void JNICALL
MonitorWait(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jobject object, jlong timeout)
{
	//printf("MonitorWait\n");
  printThreadName(jni_env, thread, object, "MonitorWait");
}

void JNICALL
MonitorWaited(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jthread thread,
		jobject object, jboolean timed_out)
{
	//printf("MonitorWaited\n");
  printThreadName(jni_env, thread, object, "MonitorWaited");
}

void JNICALL
ResourceExhausted(jvmtiEnv *jvmti_env, JNIEnv* jni_env, jint flags,
		const void* reserved, const char* description)

{
	printf("ResourceExhausted\n");
}
void JNICALL
ObjectFree(jvmtiEnv *jvmti_env, jlong tag)

{
	printf("ObjectFree\n");
}

void JNICALL
GarbageCollectionStart(jvmtiEnv *jvmti_env)

{
	printf("GarbageCollectionStart\n");
}
void JNICALL
GarbageCollectionFinish(jvmtiEnv *jvmti_env)

{
	printf("GarbageCollectionFinish\n");
}

static void AddCapabilities(void) {

	jvmtiCapabilities capabilities;

	(void) memset(&capabilities, 0, sizeof(capabilities));

	capabilities.can_tag_objects = 1;
	capabilities.can_generate_field_modification_events = 1;
	capabilities.can_generate_field_access_events = 1;
	capabilities.can_get_bytecodes = 1;
	capabilities.can_get_synthetic_attribute = 1;
	capabilities.can_get_owned_monitor_info = 1;
	capabilities.can_get_current_contended_monitor = 1;
	capabilities.can_get_monitor_info = 1;
	capabilities.can_pop_frame = 1;
	capabilities.can_redefine_classes = 1;
	capabilities.can_signal_thread = 1;
	capabilities.can_get_source_file_name = 1;
	capabilities.can_get_line_numbers = 1;
	capabilities.can_get_source_debug_extension = 1;
	capabilities.can_access_local_variables = 1;
	capabilities.can_maintain_original_method_order = 1;
	capabilities.can_generate_single_step_events = 1;
	capabilities.can_generate_exception_events = 1;
	capabilities.can_generate_frame_pop_events = 1;
	capabilities.can_generate_breakpoint_events = 1;
	capabilities.can_suspend = 1;
	capabilities.can_redefine_any_class = 1;
	capabilities.can_get_current_thread_cpu_time = 1;
	capabilities.can_get_thread_cpu_time = 1;
	capabilities.can_generate_method_entry_events = 1;
	capabilities.can_generate_method_exit_events = 1;
	capabilities.can_generate_all_class_hook_events = 1;
	capabilities.can_generate_compiled_method_load_events = 1;
	capabilities.can_generate_monitor_events = 1;
	capabilities.can_generate_vm_object_alloc_events = 1;
	capabilities.can_generate_native_method_bind_events = 1;
	capabilities.can_generate_garbage_collection_events = 1;
	capabilities.can_generate_object_free_events = 1;
	capabilities.can_force_early_return = 1;
	capabilities.can_get_owned_monitor_stack_depth_info = 1;
	capabilities.can_get_constant_pool = 1;
	capabilities.can_set_native_method_prefix = 1;
	capabilities.can_retransform_classes = 1;
	capabilities.can_retransform_any_class = 1;
	capabilities.can_generate_resource_exhaustion_heap_events = 1;
	capabilities.can_generate_resource_exhaustion_threads_events = 1;
	err = (*jvmti)->AddCapabilities(jvmti, &capabilities);
	check_jvmti_error(jvmti, err, "add capabilities");
}

static void EnableEvent(jvmtiEvent event) {
	err = (*jvmti)->SetEventNotificationMode(jvmti, JVMTI_ENABLE, event, NULL);
	check_jvmti_error(jvmti, err, "set event notification");
}

static void SetEventCallbacks(void) {
	jvmtiEventCallbacks callbacks;

	/* Set callbacks and enable event notifications */
	memset(&callbacks, 0, sizeof(callbacks));
	//31个回调方法
	callbacks.VMInit = &VMInit;
	callbacks.VMDeath = &VMDeath;
	callbacks.ThreadStart = &ThreadStart;
	callbacks.ThreadEnd = &ThreadEnd;
	callbacks.ClassFileLoadHook = &ClassFileLoadHook;
	callbacks.ClassLoad = &ClassLoad;
	callbacks.ClassPrepare = &ClassPrepare;
	callbacks.VMStart = &VMStart;
	callbacks.Exception = &Exception;
	callbacks.ExceptionCatch = &ExceptionCatch;
	callbacks.SingleStep = &SingleStep;
	callbacks.FramePop = &FramePop;
	callbacks.Breakpoint = &Breakpoint;
	callbacks.FieldAccess = &FieldAccess;
	callbacks.FieldModification = &FieldModification;
	callbacks.MethodEntry = &MethodEntry;
	callbacks.MethodExit = &MethodExit;
	callbacks.NativeMethodBind = &NativeMethodBind;
	callbacks.CompiledMethodLoad = &CompiledMethodLoad;
	callbacks.CompiledMethodUnload = &CompiledMethodUnload;
	callbacks.DynamicCodeGenerated = &DynamicCodeGenerated;
	callbacks.DataDumpRequest = &DataDumpRequest;
	callbacks.MonitorWait = &MonitorWait;
	callbacks.MonitorWaited = &MonitorWaited;
	callbacks.MonitorContendedEnter = &MonitorContendedEnter;
	callbacks.MonitorContendedEntered = &MonitorContendedEntered;
	callbacks.ResourceExhausted = &ResourceExhausted;
	callbacks.GarbageCollectionStart = &GarbageCollectionStart;
	callbacks.GarbageCollectionFinish = &GarbageCollectionFinish;
	callbacks.ObjectFree = &ObjectFree;
	callbacks.VMObjectAlloc = &VMObjectAlloc;

	err = (*jvmti)->SetEventCallbacks(jvmti, &callbacks, sizeof(callbacks));
	check_jvmti_error(jvmti, err, "set event callbacks");

	EnableEvent(JVMTI_EVENT_VM_INIT);
	//EnableEvent(JVMTI_EVENT_VM_DEATH);
	//EnableEvent(JVMTI_EVENT_THREAD_START);
	//EnableEvent(JVMTI_EVENT_THREAD_END);
	//EnableEvent(JVMTI_EVENT_CLASS_FILE_LOAD_HOOK); //触发回调次数非常多的
	//EnableEvent(JVMTI_EVENT_CLASS_LOAD); //触发回调次数非常多的
	//EnableEvent(JVMTI_EVENT_CLASS_PREPARE); //触发回调次数非常多的
	//EnableEvent(JVMTI_EVENT_VM_START);
	//EnableEvent(JVMTI_EVENT_EXCEPTION);
	//EnableEvent(JVMTI_EVENT_EXCEPTION_CATCH);
	//EnableEvent(JVMTI_EVENT_SINGLE_STEP); //用my-test\launcher执行时HotSpot VM会crash
	//EnableEvent(JVMTI_EVENT_FRAME_POP);
	//EnableEvent(JVMTI_EVENT_BREAKPOINT);
	//EnableEvent(JVMTI_EVENT_FIELD_ACCESS);
	//EnableEvent(JVMTI_EVENT_FIELD_MODIFICATION);
	//EnableEvent(JVMTI_EVENT_METHOD_ENTRY); //触发回调次数非常多的
	//EnableEvent(JVMTI_EVENT_METHOD_EXIT); //触发回调次数非常多的
	//EnableEvent(JVMTI_EVENT_NATIVE_METHOD_BIND); //触发回调次数非常多的
	//EnableEvent(JVMTI_EVENT_COMPILED_METHOD_LOAD);
	//EnableEvent(JVMTI_EVENT_COMPILED_METHOD_UNLOAD);
	//EnableEvent(JVMTI_EVENT_DYNAMIC_CODE_GENERATED);
	EnableEvent(JVMTI_EVENT_DATA_DUMP_REQUEST);
	EnableEvent(JVMTI_EVENT_MONITOR_WAIT);
	EnableEvent(JVMTI_EVENT_MONITOR_WAITED);
	EnableEvent(JVMTI_EVENT_MONITOR_CONTENDED_ENTER);
	EnableEvent(JVMTI_EVENT_MONITOR_CONTENDED_ENTERED);
	//EnableEvent(JVMTI_EVENT_RESOURCE_EXHAUSTED);
	//EnableEvent(JVMTI_EVENT_GARBAGE_COLLECTION_START);
	//EnableEvent(JVMTI_EVENT_GARBAGE_COLLECTION_FINISH);
	//EnableEvent(JVMTI_EVENT_OBJECT_FREE);
	//EnableEvent(JVMTI_EVENT_VM_OBJECT_ALLOC); //触发回调次数非常多的
}

JNIEXPORT jint JNICALL
Agent_OnLoad(JavaVM *vm, char *options, void *reserved) {
	printf("Agent_OnLoad\n");
	/* Get JVMTI environment */
	rc = (*vm)->GetEnv(vm, (void **) &jvmti, JVMTI_VERSION);
	if (rc != JNI_OK) {
		fatal_error("ERROR: Unable to create jvmtiEnv, rc=%d\n", rc);
		return -1;
	}
	AddCapabilities();
	SetEventCallbacks();
	return 0;
}

JNIEXPORT void JNICALL Agent_OnUnload(JavaVM *vm)
{
	printf("Agent_OnUnload\n");
}

