//ConstMethod的内存布局
/*
	偏移(10) 偏移(16)  字段                   类型
	----     ------    --------               --------------------
	0	     0         _fingerprint           volatile unsigned __int64，占了８个字节
    8        8         _constants             ConstantPool *
	12	     C         _stackmap_data         Array<unsigned char> *
	16	     10        _constMethod_size      int
	20	     14        _flags                 unsigned short
	22	     16        _code_size             unsigned short
	24	     18        _name_index            unsigned short
	26	     1A        _signature_index       unsigned short
	28	     1C        _method_idnum          unsigned short
	30	     1E        _max_stack             unsigned short
	32	     20        _max_locals            unsigned short
	34	     22        _size_of_parameters    unsigned short
*/

ConstMethod的内存布局:
====================
首先是header 占10个word，每个word是4字节(取决于HeapWordSize)

header由下面字段组成:
==========
		MetaspaceObj	{...}	MetaspaceObj
		_fingerprint	9223372036854775808	volatile unsigned __int64
+		_constants	0x00000000 	ConstantPool *
+		_stackmap_data	0x00000000  Array<unsigned char> *
		_constMethod_size	12	int
		_flags	1	unsigned short
		_code_size	1	unsigned short
		_name_index	0	unsigned short
		_signature_index	0	unsigned short
		_method_idnum	0	unsigned short
		_max_stack	0	unsigned short
		_max_locals	0	unsigned short
		_size_of_parameters	0	unsigned short

	==========
	以上字段要么是指针要么是int类型，两个short合并成一个word, 所以用一个word足够存放

