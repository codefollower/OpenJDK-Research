在share\vm\oops\oopsHierarchy.hpp

oopDesc类继承关系
----------------------
	typedef class oopDesc*                            oop;
	typedef class   instanceOopDesc*            instanceOop;
	typedef class   methodOopDesc*                    methodOop;
	typedef class   constMethodOopDesc*            constMethodOop;
	typedef class   methodDataOopDesc*            methodDataOop;
	typedef class   arrayOopDesc*                    arrayOop;
	typedef class     objArrayOopDesc*            objArrayOop;
	typedef class     typeArrayOopDesc*            typeArrayOop;
	typedef class   constantPoolOopDesc*            constantPoolOop;
	typedef class   constantPoolCacheOopDesc*   constantPoolCacheOop;
	typedef class   klassOopDesc*                    klassOop;
	typedef class   markOopDesc*                    markOop;
	typedef class   compiledICHolderOopDesc*    compiledICHolderOop;

Klass类继承关系
----------------------
	class Klass;
	class   instanceKlass;
	class     instanceMirrorKlass;
	class     instanceRefKlass;
	class   methodKlass;
	class   constMethodKlass;
	class   methodDataKlass;
	class   klassKlass;
	class     instanceKlassKlass;
	class     arrayKlassKlass;
	class       objArrayKlassKlass;
	class       typeArrayKlassKlass;
	class   arrayKlass;
	class     objArrayKlass;
	class     typeArrayKlass;
	class   constantPoolKlass;
	class   constantPoolCacheKlass;
	class   compiledICHolderKlass;

在share\vm\classfile\classFileParser.cpp -> parseClassFile中解析class文件，
然后得到instanceKlassHandle，而instanceKlassHandle内部有instanceKlass，

share\vm\memory\oopFactory.cpp中的方法用来创建各种oop

