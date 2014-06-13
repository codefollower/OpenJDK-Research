
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

