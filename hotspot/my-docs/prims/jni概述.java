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

