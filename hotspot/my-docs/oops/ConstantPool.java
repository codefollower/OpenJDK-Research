Array<u1>*           _tags; //用来存放常量池的tag，0号下标不用，初始化时都是JVM_CONSTANT_Invalid

在ClassFileParser::parse_constant_pool_entries中完成第一遍解析时
会把_tags中原有的JVM_CONSTANT_Invalid替换为实际的tag，
但是有两个例外:
对于JVM_CONSTANT_String先用JVM_CONSTANT_StringIndex表示，
对于JVM_CONSTANT_Class 先用JVM_CONSTANT_ClassIndex表示

ConstantPool的内存布局:
====================
首先是header 占12个word，每个word是4字节(取决于HeapWordSize)

header由下面12个字段组成:
==========
	__vfptr 归属于Metadata，因为ConstantPool的超类是Metadata，而Metadata有虚函数，所以会有这个编译器自动生成的字段
	_valid  归属于Metadata，只在NOT_PRODUCT环境下才有
	_tags
	_cache
	_pool_holder
	_operands
	_resolved_references
	_reference_map
	_flags
	_length
	_saved //是一个union类型，要么是_resolved_reference_length，要么是_version
	_lock
	==========
	以上字段要么是指针要么是int类型，所以用一个word足够存放

接着是_tags.length个常量池对应的值，也是按word算，足够存放一个jint值或指针

