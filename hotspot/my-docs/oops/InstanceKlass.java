
InstanceKlass的内存布局:
====================
首先是header 占66个word，每个word是4字节(取决于HeapWordSize)

header由下面字段组成:
==========
		Klass::instance_layout_helper returned	1	int
-		this	0x048b0e28 {_annotations=0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=...} ...}	InstanceKlass *
-		Klass	{_layout_helper=1 _super_check_offset=28 _name=0x00000000 {_body=0x00000008 <Error reading characters of string.> } ...}	Klass
	-		Metadata	{_valid=0 }	Metadata
			MetaspaceObj	{...}	MetaspaceObj
	+		__vfptr	0x572bde94 {jvm.dll!const InstanceKlass::`vftable'} {0x56f04100 {jvm.dll!Klass::is_klass(void)}, 0x56d1caf0 {jvm.dll!Metadata::is_method(void)}, ...}	void * *
			_valid	0	int
			_layout_helper	1	int
			_super_check_offset	28	unsigned int
	+		_name	0x00000000 {_body=0x00000008 <Error reading characters of string.> }	Symbol *
	+		_secondary_super_cache	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
	+		_secondary_supers	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<Klass *> *
	+		_primary_supers	0x048b0e44 {0x048b0e28 {_layout_helper=1 _super_check_offset=28 _name=0x00000000 {_body=0x00000008 <Error reading characters of string.> } ...}, ...}	Klass *[8]
	+		_java_mirror	0x00000000 {_mark=??? _metadata={_klass=??? _compressed_klass=??? } }	oopDesc *
	+		_super	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
	+		_subklass	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
	+		_next_sibling	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
	+		_next_link	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
	+		_class_loader_data	0x00000000 {_class_loader=??? _dependencies={_list_head=??? } _metaspace=??? ...}	ClassLoaderData *
			_modifier_flags	0	int
	+		_access_flags	{_flags=33 }	AccessFlags
			_last_biased_lock_bulk_revocation_time	0	__int64
	+		_prototype_header	0x00000001 {...}	markOopDesc *
			_biased_lock_revocation_count	0	int
			_modified_oops	0 '\0'	char
			_accumulated_modified_oops	0 '\0'	char
+		_annotations	0x00000000 {_class_annotations=??? _fields_annotations=??? _class_type_annotations=??? ...}	Annotations *
+		_array_klasses	0x00000000 {_layout_helper=??? _super_check_offset=??? _name=??? ...}	Klass *
+		_constants	0x00000000 {_tags=??? _cache=??? _pool_holder=??? ...}	ConstantPool *
+		_inner_classes	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<unsigned short> *
+		_source_debug_extension	0x00000000 <NULL>	char *
+		_array_name	0x00000000 {_body=0x00000008 <Error reading characters of string.> }	Symbol *
		_nonstatic_field_size	0	int
		_static_field_size	0	int
		_generic_signature_index	0	unsigned short
		_source_file_name_index	0	unsigned short
		_static_oop_field_count	0	unsigned short
		_java_fields_count	0	unsigned short
		_nonstatic_oop_map_size	0	int
		_is_marked_dependent	false	bool
		_misc_flags	0	unsigned short
		_minor_version	0	unsigned short
		_major_version	0	unsigned short
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
		_idnum_allocated_count	0	volatile unsigned short
		_init_state	0 '\0'	unsigned char
		_reference_type	0 '\0'	unsigned char
+		_jvmti_cached_class_field_map	0x00000000 {_field_map=??? }	JvmtiCachedClassFieldMap *
		_verify_count	0	int
+		_methods	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<Method *> *
+		_default_methods	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<Method *> *
+		_local_interfaces	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<Klass *> *
+		_transitive_interfaces	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<Klass *> *
+		_method_ordering	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<int> *
+		_default_vtable_indices	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<int> *
+		_fields	0x00000000 {_length=??? _data=0x00000004 {???} }	Array<unsigned short> *


