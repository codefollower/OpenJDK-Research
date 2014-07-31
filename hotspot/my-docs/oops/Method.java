//Method的内存布局
/*
	偏移(10) 偏移(16)  字段                         类型
	----     ------    ---------------              --------------------
	0	     0         __vfptr                      void * *   //在超类Metadata中有虚函数，所以会有这个指针
    4        4         _valid                       int        //在超类Metadata中定义，NOT_PRODUCT环境才有
	8	     8         _constMethod                 ConstMethod *
	12	     C         _method_data                 MethodData *
	16	     10        _method_counters             MethodCounters *
	20	     14        _access_flags                AccessFlags
	24	     18        _vtable_index                int
	28	     1C        _method_size                 unsigned short //占两字节
	30	     1E        _intrinsic_id                unsigned char  //占1字节

	                   下面5个位字段占一字节
                       ---------------
	31	     1F        _jfr_towrite                 : 1,
	  	               _caller_sensitive            : 1,
	  	               _force_inline                : 1,
	  	               _hidden                      : 1,
	  	               _dont_inline                 : 1,
					                                : 3, //空的
	                   ---------------

	32	     20        _compiled_invocation_count   int
	36	     24        _i2i_entry                   unsigned char *
	40	     28        _adapter                     AdapterHandlerEntry *
	44	     2C        _from_compiled_entry         unsigned char * volatile
	48	     30        _code                        nmethod * volatile
	52	     34        _from_interpreted_entry      unsigned char * volatile
*/

Method的内存布局:
====================
首先是header 占14个word，每个word是4字节(取决于HeapWordSize)

header由下面字段组成:
==========
-		this	0x03c00bb0 {_constMethod=0x03c00b80 {_fingerprint=9223372036854775808 _constants=0x00000000 {_tags=??? ...} ...} ...}	Method *
-		Metadata	{_valid=0 }	Metadata
		MetaspaceObj	{...}	MetaspaceObj
+		__vfptr	0x563fe0a0 {jvm.dll!const Method::`vftable'} {0x55e5cae0 {jvm.dll!Metadata::is_klass(void)}, 0x56044180 {jvm.dll!Method::is_method(void)}, ...}	void * *
		_valid	0	int
+		_constMethod	0x03c00b80 {_fingerprint=9223372036854775808 _constants=0x00000000 {_tags=??? _cache=??? _pool_holder=...} ...}	ConstMethod *
+		_method_data	0x00000000 {_method=??? _size=??? _hint_di=??? ...}	MethodData *
+		_method_counters	0x00000000 {_interpreter_invocation_count=??? _interpreter_throwout_count=??? _number_of_breakpoints=...}	MethodCounters *
+		_access_flags	{_flags=1 }	AccessFlags
		_vtable_index	-3	int
		_method_size	14	unsigned short
		_intrinsic_id	0 '\0'	unsigned char
		_jfr_towrite	0 '\0'	unsigned char
		_caller_sensitive	0 '\0'	unsigned char
		_force_inline	0 '\0'	unsigned char
		_hidden	0 '\0'	unsigned char
		_dont_inline	0 '\0'	unsigned char
		_compiled_invocation_count	0	int
+		_i2i_entry	0x00000000 <NULL>	unsigned char *
+		_adapter	0x00000000 {_fingerprint=??? _i2c_entry=??? _c2i_entry=??? ...}	AdapterHandlerEntry *
+		_from_compiled_entry	0x00000000 <NULL>	unsigned char * volatile
+		_code	0x00000000 {_method=??? _entry_bci=??? _jmethod_id=??? ...}	nmethod * volatile
+		_from_interpreted_entry	0x00000000 <NULL>	unsigned char * volatile


	==========
	以上字段要么是指针要么是int类型，两个short合并成一个word, 所以用一个word足够存放

