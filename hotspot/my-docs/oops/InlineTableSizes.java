以下是宏扩展后的代码
========================
	class InlineTableSizes : StackObj {
	  // declarations
	  int _localvariable_table_length;        
	  int _compressed_linenumber_size;        
	  int _exception_table_length;            
	  int _checked_exceptions_length;         
	  int _method_parameters_length;          
	  int _generic_signature_index;           
	  int _method_annotations_length;         
	  int _parameter_annotations_length;      
	  int _type_annotations_length;           
	  int _default_annotations_length;
	  int _end;

	 public:
	  InlineTableSizes(
		  int localvariable_table_length,        
		  int compressed_linenumber_size,        
		  int exception_table_length,            
		  int checked_exceptions_length,         
		  int method_parameters_length,          
		  int generic_signature_index,           
		  int method_annotations_length,         
		  int parameter_annotations_length,      
		  int type_annotations_length,           
		  int default_annotations_length,
		  int end) :
			  _localvariable_table_length(localvariable_table_length),        
			  _compressed_linenumber_size(compressed_linenumber_size),        
			  _exception_table_length(exception_table_length),            
			  _checked_exceptions_length(checked_exceptions_length),         
			  _method_parameters_length(method_parameters_length),          
			  _generic_signature_index(generic_signature_index),           
			  _method_annotations_length(method_annotations_length),         
			  _parameter_annotations_length(parameter_annotations_length),      
			  _type_annotations_length(type_annotations_length),           
			  _default_annotations_length(default_annotations_length),
			  _end(end) {}

	  // Default constructor for no inlined tables
	  InlineTableSizes() :
		  _localvariable_table_length(0),        
		  _compressed_linenumber_size(0),        
		  _exception_table_length(0),            
		  _checked_exceptions_length(0),         
		  _method_parameters_length(0),          
		  _generic_signature_index(0),           
		  _method_annotations_length(0),         
		  _parameter_annotations_length(0),      
		  _type_annotations_length(0),           
		  _default_annotations_length(0),
		  _end(0) {}

	  // Accessors
	  int localvariable_table_length() const { return _localvariable_table_length; }        
	  int compressed_linenumber_size() const { return _compressed_linenumber_size; }        
	  int exception_table_length() const { return _exception_table_length; }            
	  int checked_exceptions_length() const { return _checked_exceptions_length; }         
	  int method_parameters_length() const { return _method_parameters_length; }          
	  int generic_signature_index() const { return _generic_signature_index; }           
	  int method_annotations_length() const { return _method_annotations_length; }         
	  int parameter_annotations_length() const { return _parameter_annotations_length; }      
	  int type_annotations_length() const { return _type_annotations_length; }           
	  int default_annotations_length() const { return _default_annotations_length; }
	};

以下是宏扩展前的代码
========================
	// Class to collect the sizes of ConstMethod inline tables
	#define INLINE_TABLES_DO(do_element)            \
	  do_element(localvariable_table_length)        \
	  do_element(compressed_linenumber_size)        \
	  do_element(exception_table_length)            \
	  do_element(checked_exceptions_length)         \
	  do_element(method_parameters_length)          \
	  do_element(generic_signature_index)           \
	  do_element(method_annotations_length)         \
	  do_element(parameter_annotations_length)      \
	  do_element(type_annotations_length)           \
	  do_element(default_annotations_length)

	#define INLINE_TABLE_DECLARE(sym)    int _##sym;
	#define INLINE_TABLE_PARAM(sym)      int sym,
	#define INLINE_TABLE_INIT(sym)       _##sym(sym),
	#define INLINE_TABLE_NULL(sym)       _##sym(0),
	#define INLINE_TABLE_ACCESSOR(sym)   int sym() const { return _##sym; }

	class InlineTableSizes : StackObj {
	  // declarations
	  INLINE_TABLES_DO(INLINE_TABLE_DECLARE)
	  int _end;
	 public:
	  InlineTableSizes(
		  INLINE_TABLES_DO(INLINE_TABLE_PARAM)
		  int end) :
		  INLINE_TABLES_DO(INLINE_TABLE_INIT)
		  _end(end) {}

	  // Default constructor for no inlined tables
	  InlineTableSizes() :
		  INLINE_TABLES_DO(INLINE_TABLE_NULL)
		  _end(0) {}

	  // Accessors
	  INLINE_TABLES_DO(INLINE_TABLE_ACCESSOR)
	};
	#undef INLINE_TABLE_ACCESSOR
	#undef INLINE_TABLE_NULL
	#undef INLINE_TABLE_INIT
	#undef INLINE_TABLE_PARAM
	#undef INLINE_TABLE_DECLARE