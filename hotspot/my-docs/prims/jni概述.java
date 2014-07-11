jclass在HotSpot内部实际上是oop*
jmethodID在HotSpot内部实际上是Method**
jfieldID在HotSpot内部如果是实例字段则是uintptr_t，类字段(静态字段)则是JNIid*


Window平台
---------------
8个基本类型
typedef unsigned char   jboolean;
typedef unsigned short  jchar;
typedef short           jshort;
typedef float           jfloat;
typedef double          jdouble;

typedef int             jint;
typedef __int64         jlong;
typedef signed char     jbyte;

最后三个在cpu\x86\vm\jni_x86.h定义


  三个特殊的宏
  ---------------
  #define JNIEXPORT    __declspec(dllexport)
  #define JNIIMPORT    __declspec(dllimport)
  #define JNICALL      __stdcall

  也在cpu\x86\vm\jni_x86.h定义


_jobject
  _jclass
  _jthrowable
  _jstring
  _jarray
    _jbooleanArray
	_jbyteArray
	_jcharArray
	_jshortArray
	_jintArray
	_jlongArray
	_jfloatArray
	_jdoubleArray
	_jobjectArray

5个调用api
------------
	struct JNIInvokeInterface_ {
		void *reserved0;
		void *reserved1;
		void *reserved2;

		jint (JNICALL *DestroyJavaVM)(JavaVM *vm); //对于C++版的jni，JavaVM就是JNIInvokeInterface_

		jint (JNICALL *AttachCurrentThread)(JavaVM *vm, void **penv, void *args);

		jint (JNICALL *DetachCurrentThread)(JavaVM *vm);

		jint (JNICALL *GetEnv)(JavaVM *vm, void **penv, jint version);

		jint (JNICALL *AttachCurrentThreadAsDaemon)(JavaVM *vm, void **penv, void *args);
	};


5个其他api
------------
    //jni.cpp中把args转成了JDK1_1InitArgs，但是jni.h中已经删除了JDK1_1InitArgs，这个api没多大用
	_JNI_IMPORT_OR_EXPORT_ jint JNICALL
	JNI_GetDefaultJavaVMInitArgs(void *args);

	_JNI_IMPORT_OR_EXPORT_ jint JNICALL
	JNI_CreateJavaVM(JavaVM **pvm, void **penv, void *args);

    //HotSpot内部实际上只返回最多一个
	_JNI_IMPORT_OR_EXPORT_ jint JNICALL
	JNI_GetCreatedJavaVMs(JavaVM **, jsize, jsize *);

    //下面两个在调用System.loadLibrary的过程中回调，在本地代码中来实现，并不在jni.cpp中实现
	JNIEXPORT jint JNICALL
	JNI_OnLoad(JavaVM *vm, void *reserved); //在jdk\src\share\native\java\lang\ClassLoader.c的NativeLibrary_load中触发

	JNIEXPORT void JNICALL
	JNI_OnUnload(JavaVM *vm, void *reserved); //在jdk\src\share\native\java\lang\ClassLoader.c的NativeLibrary_unload中触发


JNINativeInterface_
方法表(除前面4个保留外还有229个):
------------------------------------
    NULL,
    NULL,
    NULL,
    NULL,
    GetVersion,

    DefineClass,
    FindClass,

    FromReflectedMethod,
    FromReflectedField,
    ToReflectedMethod,

    GetSuperclass,
    IsAssignableFrom,

    ToReflectedField,

    Throw,
    ThrowNew,
    ExceptionOccurred,
    ExceptionDescribe,
    ExceptionClear,
    FatalError,

    PushLocalFrame,
    PopLocalFrame,

    NewGlobalRef,
    DeleteGlobalRef,
    DeleteLocalRef,
    IsSameObject,
    NewLocalRef,
    EnsureLocalCapacity,

    AllocObject,
    NewObject,
    NewObjectV,
    NewObjectA,

    GetObjectClass,
    IsInstanceOf,

    GetMethodID,

    CallObjectMethod,
    CallObjectMethodV,
    CallObjectMethodA,
    CallBooleanMethod,
    CallBooleanMethodV,
    CallBooleanMethodA,
    CallByteMethod,
    CallByteMethodV,
    CallByteMethodA,
    CallCharMethod,
    CallCharMethodV,
    CallCharMethodA,
    CallShortMethod,
    CallShortMethodV,
    CallShortMethodA,
    CallIntMethod,
    CallIntMethodV,
    CallIntMethodA,
    CallLongMethod,
    CallLongMethodV,
    CallLongMethodA,
    CallFloatMethod,
    CallFloatMethodV,
    CallFloatMethodA,
    CallDoubleMethod,
    CallDoubleMethodV,
    CallDoubleMethodA,
    CallVoidMethod,
    CallVoidMethodV,
    CallVoidMethodA,

    CallNonvirtualObjectMethod,
    CallNonvirtualObjectMethodV,
    CallNonvirtualObjectMethodA,
    CallNonvirtualBooleanMethod,
    CallNonvirtualBooleanMethodV,
    CallNonvirtualBooleanMethodA,
    CallNonvirtualByteMethod,
    CallNonvirtualByteMethodV,
    CallNonvirtualByteMethodA,
    CallNonvirtualCharMethod,
    CallNonvirtualCharMethodV,
    CallNonvirtualCharMethodA,
    CallNonvirtualShortMethod,
    CallNonvirtualShortMethodV,
    CallNonvirtualShortMethodA,
    CallNonvirtualIntMethod,
    CallNonvirtualIntMethodV,
    CallNonvirtualIntMethodA,
    CallNonvirtualLongMethod,
    CallNonvirtualLongMethodV,
    CallNonvirtualLongMethodA,
    CallNonvirtualFloatMethod,
    CallNonvirtualFloatMethodV,
    CallNonvirtualFloatMethodA,
    CallNonvirtualDoubleMethod,
    CallNonvirtualDoubleMethodV,
    CallNonvirtualDoubleMethodA,
    CallNonvirtualVoidMethod,
    CallNonvirtualVoidMethodV,
    CallNonvirtualVoidMethodA,

    GetFieldID,

    GetObjectField,
    GetBooleanField,
    GetByteField,
    GetCharField,
    GetShortField,
    GetIntField,
    GetLongField,
    GetFloatField,
    GetDoubleField,
    SetObjectField,
    SetBooleanField,
    SetByteField,
    SetCharField,
    SetShortField,
    SetIntField,
    SetLongField,
    SetFloatField,
    SetDoubleField,

    GetStaticMethodID,

    CallStaticObjectMethod,
    CallStaticObjectMethodV,
    CallStaticObjectMethodA,
    CallStaticBooleanMethod,
    CallStaticBooleanMethodV,
    CallStaticBooleanMethodA,
    CallStaticByteMethod,
    CallStaticByteMethodV,
    CallStaticByteMethodA,
    CallStaticCharMethod,
    CallStaticCharMethodV,
    CallStaticCharMethodA,
    CallStaticShortMethod,
    CallStaticShortMethodV,
    CallStaticShortMethodA,
    CallStaticIntMethod,
    CallStaticIntMethodV,
    CallStaticIntMethodA,
    CallStaticLongMethod,
    CallStaticLongMethodV,
    CallStaticLongMethodA,
    CallStaticFloatMethod,
    CallStaticFloatMethodV,
    CallStaticFloatMethodA,
    CallStaticDoubleMethod,
    CallStaticDoubleMethodV,
    CallStaticDoubleMethodA,
    CallStaticVoidMethod,
    CallStaticVoidMethodV,
    CallStaticVoidMethodA,

    GetStaticFieldID,

    GetStaticObjectField,
    GetStaticBooleanField,
    GetStaticByteField,
    GetStaticCharField,
    GetStaticShortField,
    GetStaticIntField,
    GetStaticLongField,
    GetStaticFloatField,
    GetStaticDoubleField,

    SetStaticObjectField,
    SetStaticBooleanField,
    SetStaticByteField,
    SetStaticCharField,
    SetStaticShortField,
    SetStaticIntField,
    SetStaticLongField,
    SetStaticFloatField,
    SetStaticDoubleField,

    NewString,

    GetStringLength,
    GetStringChars,
    ReleaseStringChars,

    NewStringUTF,
    GetStringUTFLength,
    GetStringUTFChars,
    ReleaseStringUTFChars,

    GetArrayLength,

    NewObjectArray,
    GetObjectArrayElement,
    SetObjectArrayElement,

    NewBooleanArray,
    NewByteArray,
    NewCharArray,
    NewShortArray,
    NewIntArray,
    NewLongArray,
    NewFloatArray,
    NewDoubleArray,

    GetBooleanArrayElements,
    GetByteArrayElements,
    GetCharArrayElements,
    GetShortArrayElements,
    GetIntArrayElements,
    GetLongArrayElements,
    GetFloatArrayElements,
    GetDoubleArrayElements,

    ReleaseBooleanArrayElements,
    ReleaseByteArrayElements,
    ReleaseCharArrayElements,
    ReleaseShortArrayElements,
    ReleaseIntArrayElements,
    ReleaseLongArrayElements,
    ReleaseFloatArrayElements,
    ReleaseDoubleArrayElements,

    GetBooleanArrayRegion,
    GetByteArrayRegion,
    GetCharArrayRegion,
    GetShortArrayRegion,
    GetIntArrayRegion,
    GetLongArrayRegion,
    GetFloatArrayRegion,
    GetDoubleArrayRegion,
    SetBooleanArrayRegion,
    SetByteArrayRegion,
    SetCharArrayRegion,
    SetShortArrayRegion,
    SetIntArrayRegion,
    SetLongArrayRegion,
    SetFloatArrayRegion,
    SetDoubleArrayRegion,

    RegisterNatives,
    UnregisterNatives,

    MonitorEnter,
    MonitorExit,

    GetJavaVM,

    GetStringRegion,
    GetStringUTFRegion,

    GetPrimitiveArrayCritical,
    ReleasePrimitiveArrayCritical,

    GetStringCritical,
    ReleaseStringCritical,

    NewWeakGlobalRef,
    DeleteWeakGlobalRef,

    ExceptionCheck,

    NewDirectByteBuffer,
    GetDirectBufferAddress,
    GetDirectBufferCapacity,

    GetObjectRefType