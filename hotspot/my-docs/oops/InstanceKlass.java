-		_value	0x03b611d8 {_annotations=0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=...} ...}	Klass *
-		[InstanceKlass]	{_annotations=0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=??? ...} ...}	InstanceKlass
-		Klass	{_layout_helper=8 _super_check_offset=28 _name=0x0032ca20 {_body=0x0032ca28 "java/lang/Object\xf" } ...}	Klass
-		Metadata	{_valid=0 }	Metadata
		MetaspaceObj	{...}	MetaspaceObj
+		__vfptr	0x56a9de94 {jvm.dll!const InstanceKlass::`vftable'} {0x566e4100 {jvm.dll!Klass::is_klass(void)}, 0x564fcaf0 {jvm.dll!Metadata::is_method(void)}, ...}	void * *
		_valid	0	int
		_layout_helper	8	int
		_super_check_offset	28	unsigned int
+		_name	0x0032ca20 {_body=0x0032ca28 "java/lang/Object\xf" }	Symbol *
+		_secondary_super_cache	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
+		_secondary_supers	0x03b60958 {_length=0 _data=0x03b6095c {0x00000000 {_layout_helper=??? _super_check_offset=??? _name=...}} }	Array<Klass *> *
+		_primary_supers	0x03b611f4 {0x03b611d8 {_layout_helper=8 _super_check_offset=28 _name=0x0032ca20 {_body=0x0032ca28 "java/lang/Object\xf" } ...}, ...}	Klass *[8]
+		_java_mirror	0x00000000 {_mark=??? _metadata={_klass=??? _compressed_klass=??? } }	oopDesc *
+		_super	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
+		_subklass	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
+		_next_sibling	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
+		_next_link	0x03b607f8 {_max_length=536870909 }	Klass *
+		_class_loader_data	0x00305508 {_class_loader=0x00000000 {_mark=??? _metadata={_klass=??? _compressed_klass=??? } } _dependencies=...}	ClassLoaderData *
		_modifier_flags	1	int
+		_access_flags	{_flags=553648161 }	AccessFlags
		_last_biased_lock_bulk_revocation_time	0	__int64
+		_prototype_header	0x00000001 {...}	markOopDesc *
		_biased_lock_revocation_count	0	int
		_modified_oops	0 '\0'	char
		_accumulated_modified_oops	0 '\0'	char
+		_annotations	0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=??? ...}	Annotations *
+		_array_klasses	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
+		_constants	0x03b609c0 {_tags=0x03b60968 {_length=79 _data=0x03b6096c "" } _cache=0x00000000 {_length=??? _constant_pool=...} ...}	ConstantPool *
+		_inner_classes	0x03b60938 {_length=0 _data=0x03b6093c {0} }	Array<unsigned short> *
+		_source_debug_extension	0x00000000 <NULL>	char *
+		_array_name	0x00000000 {_body=0x00000008 <Error reading characters of string.> }	Symbol *
		_nonstatic_field_size	0	int
		_static_field_size	0	int
		_generic_signature_index	0	unsigned short
		_source_file_name_index	78	unsigned short
		_static_oop_field_count	0	unsigned short
		_java_fields_count	0	unsigned short
		_nonstatic_oop_map_size	0	int
		_is_marked_dependent	false	bool
		_misc_flags	0	unsigned short
		_minor_version	0	unsigned short
		_major_version	52	unsigned short
+		_init_thread	0x00000000 {_real_malloc_address=??? _SR_lock=??? _suspend_flags=??? ...}	Thread *
		_vtable_len	5	int
		_itable_len	2	int
+		_oop_map_cache	0x00000000 {_array=??? _mut={...} }	OopMapCache * volatile
+		_member_names	0x00000000 {...}	MemberNameTable *
+		_jni_ids	0x00000000 {_holder=??? _next=??? _offset=??? ...}	JNIid *
+		_methods_jmethod_ids	0x00000000 {???}	_jmethodID * *
+		_dependencies	0x00000000 {_nmethod=??? _count=??? _next=??? }	nmethodBucket *
+		_osr_nmethods_head	0x00000000 {_method=??? _entry_bci=??? _jmethod_id=??? ...}	nmethod *
+		_breakpoints	0x00000000 {_orig_bytecode=??? _bci=??? _name_index=??? ...}	BreakpointInfo *
+		_previous_versions	0x00000000 {_data=??? }	GrowableArray<PreviousVersionNode *> *
+		_cached_class_file	0x00000000 {length=??? data=0x00000004 <Error reading characters of string.> }	JvmtiCachedClassFileData *
		_idnum_allocated_count	14	volatile unsigned short
		_init_state	0 '\0'	unsigned char
		_reference_type	0 '\0'	unsigned char
+		_jvmti_cached_class_field_map	0x00000000 {_field_map=??? }	JvmtiCachedClassFieldMap *
		_verify_count	0	int
+		_methods	0x03b60b40 {_length=14 _data=0x03b60b44 {0x03b60bb0 {_constMethod=0x03b60b80 {_fingerprint=9223372036854775808 ...} ...}} }	Array<Method *> *
+		_default_methods	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<Method *> *
+		_local_interfaces	0x03b60958 {_length=0 _data=0x03b6095c {0x00000000 {_layout_helper=??? _super_check_offset=??? _name=...}} }	Array<Klass *> *
+		_transitive_interfaces	0x03b60958 {_length=0 _data=0x03b6095c {0x00000000 {_layout_helper=??? _super_check_offset=??? _name=...}} }	Array<Klass *> *
+		_method_ordering	0x03b60928 {_length=0 _data=0x03b6092c {0} }	Array<int> *
+		_default_vtable_indices	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<int> *
+		_fields	0x03b60b30 {_length=0 _data=0x03b60b34 {0} }	Array<unsigned short> *



//InstanceKlass的内存布局(TODO)
/*
    偏移(10) 偏移(16)    字段                                       类型
    ----     ------      ---------------                            --------------------
    0         0          __vfptr                                    void * *   //在超类Metadata中有虚函数，所以会有这个指针
    4         4          _valid                                     int        //在超类Metadata中定义，NOT_PRODUCT环境才有
    
    以下是超类Klass的字段
    --------------------------
    8          8         _layout_helper                             int
    12         C         _super_check_offset                        unsigned int
    16         10        _name                                      Symbol *
    20         14        _secondary_super_cache                     Klass *
    24         18        _secondary_supers                          Array<Klass *> *
    28         1C        _primary_supers                            Klass *[0x00000008] //有8个元素
    30         1E        _java_mirror                               oopDesc *
    31         1F        _super                                     Klass *
    32         20        _subklass                                  Klass *
    33         21        _next_sibling                              Klass *
    34         22        _next_link                                 Klass *
    35         23        _class_loader_data                         ClassLoaderData *
    36         24        _modifier_flags                            int
    40         28        _access_flags                              AccessFlags
    44         2C        _last_biased_lock_bulk_revocation_time     __int64
    48         30        _prototype_header                          markOopDesc *
    52         34        _biased_lock_revocation_count              int
    56         38        _modified_oops                             char
    56         38        _accumulated_modified_oops                 char
	--------------------------

    以下是InstanceKlass的字段
    --------------------------
    8          8         _annotations                             int
    12         C         _array_klasses                        unsigned int
    16         10        _constants                                      Symbol *
    20         14        _inner_classes                     Klass *
    24         18        _source_debug_extension                          Array<Klass *> *
    28         1C        _array_name                            Klass *[0x00000008] //有8个元素

    30         1E        _nonstatic_field_size                               oopDesc *
    31         1F        _static_field_size                                     Klass *
    32         20        _generic_signature_index                                  Klass *
    33         21        _source_file_name_index                              Klass *
    34         22        _static_oop_field_count                                 Klass *
    35         23        _java_fields_count                         ClassLoaderData *
    36         24        _nonstatic_oop_map_size                            int
    40         28        _is_marked_dependent                              AccessFlags
    44         2C        _misc_flags     __int64
    48         30        _minor_version                          markOopDesc *
    52         34        _major_version              int
    56         38        _init_thread                             char
    56         38        _vtable_len                 char
	8          8         _itable_len                             int
    12         C         _oop_map_cache                        unsigned int
    16         10        _member_names                                      Symbol *
    20         14        _jni_ids                     Klass *
    24         18        _methods_jmethod_ids                          Array<Klass *> *
    28         1C        _dependencies                            Klass *[0x00000008] //有8个元素
    30         1E        _osr_nmethods_head                               oopDesc *
    31         1F        _breakpoints                                     Klass *
    32         20        _previous_versions                                  Klass *
    33         21        _cached_class_file                              Klass *
    34         22        _idnum_allocated_count                                 Klass *
    35         23        _init_state                         ClassLoaderData *
    36         24        _reference_type                            int
    40         28        _jvmti_cached_class_field_map                              AccessFlags
    44         2C        _verify_count     __int64
    48         30        _methods                          markOopDesc *
    52         34        _default_methods              int
    56         38        _local_interfaces                             char
    56         38        _transitive_interfaces                 char

	40         28        _method_ordering                              AccessFlags
    44         2C        _default_vtable_indices     __int64
    48         30        _fields                          markOopDesc *
	--------------------------

*/



InstanceKlass的内存布局:
====================
首先是header 占66个word，每个word是4字节(取决于HeapWordSize)

header由下面字段组成:
==========
        Klass::instance_layout_helper returned    1    int
-        this    0x048b0e28 {_annotations=0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=...} ...}    InstanceKlass *
-        Klass    {_layout_helper=1 _super_check_offset=28 _name=0x00000000 {_body=0x00000008 <Error reading characters of string.> } ...}    Klass
    -        Metadata    {_valid=0 }    Metadata
            MetaspaceObj    {...}    MetaspaceObj
    +        __vfptr    0x572bde94 {jvm.dll!const InstanceKlass::`vftable'} {0x56f04100 {jvm.dll!Klass::is_klass(void)}, 0x56d1caf0 {jvm.dll!Metadata::is_method(void)}, ...}    void * *
            _valid    0    int
            _layout_helper    1    int
            _super_check_offset    28    unsigned int
    +        _name    0x00000000 {_body=0x00000008 <Error reading characters of string.> }    Symbol *
    +        _secondary_super_cache    0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}    Klass *
    +        _secondary_supers    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<Klass *> *
    +        _primary_supers    0x048b0e44 {0x048b0e28 {_layout_helper=1 _super_check_offset=28 _name=0x00000000 {_body=0x00000008 <Error reading characters of string.> } ...}, ...}    Klass *[8]
    +        _java_mirror    0x00000000 {_mark=??? _metadata={_klass=??? _compressed_klass=??? } }    oopDesc *
    +        _super    0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}    Klass *
    +        _subklass    0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}    Klass *
    +        _next_sibling    0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}    Klass *
    +        _next_link    0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}    Klass *
    +        _class_loader_data    0x00000000 {_class_loader=??? _dependencies={_list_head=??? } _metaspace=??? ...}    ClassLoaderData *
            _modifier_flags    0    int
    +        _access_flags    {_flags=33 }    AccessFlags
            _last_biased_lock_bulk_revocation_time    0    __int64
    +        _prototype_header    0x00000001 {...}    markOopDesc *
            _biased_lock_revocation_count    0    int
            _modified_oops    0 '\0'    char
            _accumulated_modified_oops    0 '\0'    char
+        _annotations    0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=??? ...}    Annotations *
+        _array_klasses    0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}    Klass *
+        _constants    0x00000000 {_tags=??? _cache=??? _pool_holder=??? ...}    ConstantPool *
+        _inner_classes    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<unsigned short> *
+        _source_debug_extension    0x00000000 <NULL>    char *
+        _array_name    0x00000000 {_body=0x00000008 <Error reading characters of string.> }    Symbol *
        _nonstatic_field_size    0    int
        _static_field_size    0    int
        _generic_signature_index    0    unsigned short
        _source_file_name_index    0    unsigned short
        _static_oop_field_count    0    unsigned short
        _java_fields_count    0    unsigned short
        _nonstatic_oop_map_size    0    int
        _is_marked_dependent    false    bool
        _misc_flags    0    unsigned short
        _minor_version    0    unsigned short
        _major_version    0    unsigned short
+        _init_thread    0x00000000 {_real_malloc_address=??? _SR_lock=??? _suspend_flags=??? ...}    Thread *
        _vtable_len    5    int
        _itable_len    2    int
+        _oop_map_cache    0x00000000 {_array=??? _mut={...} }    OopMapCache * volatile
+        _member_names    0x00000000 {...}    MemberNameTable *
+        _jni_ids    0x00000000 {_holder=??? _next=??? _offset=??? ...}    JNIid *
+        _methods_jmethod_ids    0x00000000 {???}    _jmethodID * *
+        _dependencies    0x00000000 {_nmethod=??? _count=??? _next=??? }    nmethodBucket *
+        _osr_nmethods_head    0x00000000 {_method=??? _entry_bci=??? _jmethod_id=??? ...}    nmethod *
+        _breakpoints    0x00000000 {_orig_bytecode=??? _bci=??? _name_index=??? ...}    BreakpointInfo *
+        _previous_versions    0x00000000 {_data=??? }    GrowableArray<PreviousVersionNode *> *
+        _cached_class_file    0x00000000 {length=??? data=0x00000004 <Error reading characters of string.> }    JvmtiCachedClassFileData *
        _idnum_allocated_count    0    volatile unsigned short
        _init_state    0 '\0'    unsigned char
        _reference_type    0 '\0'    unsigned char
+        _jvmti_cached_class_field_map    0x00000000 {_field_map=??? }    JvmtiCachedClassFieldMap *
        _verify_count    0    int
+        _methods    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<Method *> *
+        _default_methods    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<Method *> *
+        _local_interfaces    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<Klass *> *
+        _transitive_interfaces    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<Klass *> *
+        _method_ordering    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<int> *
+        _default_vtable_indices    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<int> *
+        _fields    0x00000000 {_length=??? _data=0x00000004 {???} }    Array<unsigned short> *


