  enum WKID { //WKID 是well known id的缩写
    NO_WKID = 0,
	
    //69个
	//////////////////////////////////////////////
		Object_klass_knum,
		java_lang_Object_knum = Object_klass_knum,

		String_klass_knum,
		java_lang_String_knum = String_klass_knum,

		Class_klass_knum,
		java_lang_Class_knum = Class_klass_knum,

		Cloneable_klass_knum,
		java_lang_Cloneable_knum = Cloneable_klass_knum,

		ClassLoader_klass_knum,
		java_lang_ClassLoader_knum = ClassLoader_klass_knum,

		Serializable_klass_knum,
		java_io_Serializable_knum = Serializable_klass_knum,

		System_klass_knum,
		java_lang_System_knum = System_klass_knum,

		Throwable_klass_knum,
		java_lang_Throwable_knum = Throwable_klass_knum,

		Error_klass_knum,
		java_lang_Error_knum = Error_klass_knum,

		ThreadDeath_klass_knum,
		java_lang_ThreadDeath_knum = ThreadDeath_klass_knum,

		Exception_klass_knum,
		java_lang_Exception_knum = Exception_klass_knum,

		RuntimeException_klass_knum,
		java_lang_RuntimeException_knum = RuntimeException_klass_knum,

		SecurityManager_klass_knum,
		java_lang_SecurityManager_knum = SecurityManager_klass_knum,

		ProtectionDomain_klass_knum,
		java_security_ProtectionDomain_knum = ProtectionDomain_klass_knum,

		AccessControlContext_klass_knum,
		java_security_AccessControlContext_knum = AccessControlContext_klass_knum,

		ClassNotFoundException_klass_knum,
		java_lang_ClassNotFoundException_knum = ClassNotFoundException_klass_knum,

		NoClassDefFoundError_klass_knum,
		java_lang_NoClassDefFoundError_knum = NoClassDefFoundError_klass_knum,

		LinkageError_klass_knum,
		java_lang_LinkageError_knum = LinkageError_klass_knum,

		ClassCastException_klass_knum,
		java_lang_ClassCastException_knum = ClassCastException_klass_knum,

		ArrayStoreException_klass_knum,
		java_lang_ArrayStoreException_knum = ArrayStoreException_klass_knum,

		VirtualMachineError_klass_knum,
		java_lang_VirtualMachineError_knum = VirtualMachineError_klass_knum,

		OutOfMemoryError_klass_knum,
		java_lang_OutOfMemoryError_knum = OutOfMemoryError_klass_knum,

		StackOverflowError_klass_knum,
		java_lang_StackOverflowError_knum = StackOverflowError_klass_knum,

		IllegalMonitorStateException_klass_knum,
		java_lang_IllegalMonitorStateException_knum = IllegalMonitorStateException_klass_knum,

		Reference_klass_knum,
		java_lang_ref_Reference_knum = Reference_klass_knum,


		/*Preloadrefklassesandsetreferencetypes*/
		SoftReference_klass_knum,
		java_lang_ref_SoftReference_knum = SoftReference_klass_knum,

		WeakReference_klass_knum,
		java_lang_ref_WeakReference_knum = WeakReference_klass_knum,

		FinalReference_klass_knum,
		java_lang_ref_FinalReference_knum = FinalReference_klass_knum,

		PhantomReference_klass_knum,
		java_lang_ref_PhantomReference_knum = PhantomReference_klass_knum,

		Finalizer_klass_knum,
		java_lang_ref_Finalizer_knum = Finalizer_klass_knum,


		Thread_klass_knum,
		java_lang_Thread_knum = Thread_klass_knum,

		ThreadGroup_klass_knum,
		java_lang_ThreadGroup_knum = ThreadGroup_klass_knum,

		Properties_klass_knum,
		java_util_Properties_knum = Properties_klass_knum,

		reflect_AccessibleObject_klass_knum,
		java_lang_reflect_AccessibleObject_knum = reflect_AccessibleObject_klass_knum,

		reflect_Field_klass_knum,
		java_lang_reflect_Field_knum = reflect_Field_klass_knum,

		reflect_Parameter_klass_knum,
		java_lang_reflect_Parameter_knum = reflect_Parameter_klass_knum,

		reflect_Method_klass_knum,
		java_lang_reflect_Method_knum = reflect_Method_klass_knum,

		reflect_Constructor_klass_knum,
		java_lang_reflect_Constructor_knum = reflect_Constructor_klass_knum,


		/*NOTE:neededtooearlyinbootstrappingprocesstohavechecksbasedonJDKversion*/
		/*Universe::is_gte_jdk14x_version()isnotsetupbythispoint.*/
		/*It'sokayifthisturnsouttobeNULLinnon-1.4JDKs.*/
		reflect_MagicAccessorImpl_klass_knum,
		sun_reflect_MagicAccessorImpl_knum = reflect_MagicAccessorImpl_klass_knum,

		reflect_MethodAccessorImpl_klass_knum,
		sun_reflect_MethodAccessorImpl_knum = reflect_MethodAccessorImpl_klass_knum,

		reflect_ConstructorAccessorImpl_klass_knum,
		sun_reflect_ConstructorAccessorImpl_knum = reflect_ConstructorAccessorImpl_klass_knum,

		reflect_DelegatingClassLoader_klass_knum,
		sun_reflect_DelegatingClassLoader_knum = reflect_DelegatingClassLoader_klass_knum,

		reflect_ConstantPool_klass_knum,
		sun_reflect_ConstantPool_knum = reflect_ConstantPool_klass_knum,

		reflect_UnsafeStaticFieldAccessorImpl_klass_knum,
		sun_reflect_UnsafeStaticFieldAccessorImpl_knum = reflect_UnsafeStaticFieldAccessorImpl_klass_knum,

		reflect_CallerSensitive_klass_knum,
		sun_reflect_CallerSensitive_knum = reflect_CallerSensitive_klass_knum,


		/*supportfordynamictyping;it'sOKiftheseareNULLinearlierJDKs*/
		DirectMethodHandle_klass_knum,
		java_lang_invoke_DirectMethodHandle_knum = DirectMethodHandle_klass_knum,

		MethodHandle_klass_knum,
		java_lang_invoke_MethodHandle_knum = MethodHandle_klass_knum,

		MemberName_klass_knum,
		java_lang_invoke_MemberName_knum = MemberName_klass_knum,

		MethodHandleNatives_klass_knum,
		java_lang_invoke_MethodHandleNatives_knum = MethodHandleNatives_klass_knum,

		LambdaForm_klass_knum,
		java_lang_invoke_LambdaForm_knum = LambdaForm_klass_knum,

		MethodType_klass_knum,
		java_lang_invoke_MethodType_knum = MethodType_klass_knum,

		BootstrapMethodError_klass_knum,
		java_lang_BootstrapMethodError_knum = BootstrapMethodError_klass_knum,

		CallSite_klass_knum,
		java_lang_invoke_CallSite_knum = CallSite_klass_knum,

		ConstantCallSite_klass_knum,
		java_lang_invoke_ConstantCallSite_knum = ConstantCallSite_klass_knum,

		MutableCallSite_klass_knum,
		java_lang_invoke_MutableCallSite_knum = MutableCallSite_klass_knum,

		VolatileCallSite_klass_knum,
		java_lang_invoke_VolatileCallSite_knum = VolatileCallSite_klass_knum,

		/*Note:MethodHandlemustbefirst,
		andVolatileCallSitelastingroup*/

		StringBuffer_klass_knum,
		java_lang_StringBuffer_knum = StringBuffer_klass_knum,

		StringBuilder_klass_knum,
		java_lang_StringBuilder_knum = StringBuilder_klass_knum,

		misc_Unsafe_klass_knum,
		sun_misc_Unsafe_knum = misc_Unsafe_klass_knum,


		/*It'sNULLinnon-1.4JDKs.*/
		StackTraceElement_klass_knum,
		java_lang_StackTraceElement_knum = StackTraceElement_klass_knum,

		/*Universe::is_gte_jdk14x_version()isnotsetupbythispoint.*/
		/*It'sokayifthisturnsouttobeNULLinnon-1.4JDKs.*/
		nio_Buffer_klass_knum,
		java_nio_Buffer_knum = nio_Buffer_klass_knum,


		/*Preloadboxingklasses*/
		Boolean_klass_knum,
		java_lang_Boolean_knum = Boolean_klass_knum,

		Character_klass_knum,
		java_lang_Character_knum = Character_klass_knum,

		Float_klass_knum,
		java_lang_Float_knum = Float_klass_knum,

		Double_klass_knum,
		java_lang_Double_knum = Double_klass_knum,

		Byte_klass_knum,
		java_lang_Byte_knum = Byte_klass_knum,

		Short_klass_knum,
		java_lang_Short_knum = Short_klass_knum,

		Integer_klass_knum,
		java_lang_Integer_knum = Integer_klass_knum,

		Long_klass_knum,
		java_lang_Long_knum = Long_klass_knum,

    WKID_LIMIT,

    FIRST_WKID = NO_WKID + 1
  };
 

static Klass* Object_klass() { return check_klass_Pre(_well_known_klasses[Object_klass_knum]); } 
    static Klass** Object_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Object_klass_knum];           
    } 
  static Klass* String_klass() { return check_klass_Pre(_well_known_klasses[String_klass_knum]); } 
    static Klass** String_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::String_klass_knum];           
    } 
  static Klass* Class_klass() { return check_klass_Pre(_well_known_klasses[Class_klass_knum]); } 
    static Klass** Class_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Class_klass_knum];           
    } 
  static Klass* Cloneable_klass() { return check_klass_Pre(_well_known_klasses[Cloneable_klass_knum]); } 
    static Klass** Cloneable_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Cloneable_klass_knum];           
    } 
  static Klass* ClassLoader_klass() { return check_klass_Pre(_well_known_klasses[ClassLoader_klass_knum]); } 
    static Klass** ClassLoader_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ClassLoader_klass_knum];           
    } 
  static Klass* Serializable_klass() { return check_klass_Pre(_well_known_klasses[Serializable_klass_knum]); } 
    static Klass** Serializable_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Serializable_klass_knum];           
    } 
  static Klass* System_klass() { return check_klass_Pre(_well_known_klasses[System_klass_knum]); } 
    static Klass** System_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::System_klass_knum];           
    } 
  static Klass* Throwable_klass() { return check_klass_Pre(_well_known_klasses[Throwable_klass_knum]); } 
    static Klass** Throwable_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Throwable_klass_knum];           
    } 
  static Klass* Error_klass() { return check_klass_Pre(_well_known_klasses[Error_klass_knum]); } 
    static Klass** Error_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Error_klass_knum];           
    } 
  static Klass* ThreadDeath_klass() { return check_klass_Pre(_well_known_klasses[ThreadDeath_klass_knum]); } 
    static Klass** ThreadDeath_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ThreadDeath_klass_knum];           
    } 
  static Klass* Exception_klass() { return check_klass_Pre(_well_known_klasses[Exception_klass_knum]); } 
    static Klass** Exception_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Exception_klass_knum];           
    } 
  static Klass* RuntimeException_klass() { return check_klass_Pre(_well_known_klasses[RuntimeException_klass_knum]); } 
    static Klass** RuntimeException_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::RuntimeException_klass_knum];           
    } 
  static Klass* SecurityManager_klass() { return check_klass_Pre(_well_known_klasses[SecurityManager_klass_knum]); } 
    static Klass** SecurityManager_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::SecurityManager_klass_knum];           
    } 
  static Klass* ProtectionDomain_klass() { return check_klass_Pre(_well_known_klasses[ProtectionDomain_klass_knum]); } 
    static Klass** ProtectionDomain_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ProtectionDomain_klass_knum];           
    } 
  static Klass* AccessControlContext_klass() { return check_klass_Pre(_well_known_klasses[AccessControlContext_klass_knum]); } 
    static Klass** AccessControlContext_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::AccessControlContext_klass_knum];           
    } 
  static Klass* ClassNotFoundException_klass() { return check_klass_Pre(_well_known_klasses[ClassNotFoundException_klass_knum]); } 
    static Klass** ClassNotFoundException_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ClassNotFoundException_klass_knum];           
    } 
  static Klass* NoClassDefFoundError_klass() { return check_klass_Pre(_well_known_klasses[NoClassDefFoundError_klass_knum]); } 
    static Klass** NoClassDefFoundError_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::NoClassDefFoundError_klass_knum];           
    } 
  static Klass* LinkageError_klass() { return check_klass_Pre(_well_known_klasses[LinkageError_klass_knum]); } 
    static Klass** LinkageError_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::LinkageError_klass_knum];           
    } 
  static Klass* ClassCastException_klass() { return check_klass_Pre(_well_known_klasses[ClassCastException_klass_knum]); } 
    static Klass** ClassCastException_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ClassCastException_klass_knum];           
    } 
  static Klass* ArrayStoreException_klass() { return check_klass_Pre(_well_known_klasses[ArrayStoreException_klass_knum]); } 
    static Klass** ArrayStoreException_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ArrayStoreException_klass_knum];           
    } 
  static Klass* VirtualMachineError_klass() { return check_klass_Pre(_well_known_klasses[VirtualMachineError_klass_knum]); } 
    static Klass** VirtualMachineError_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::VirtualMachineError_klass_knum];           
    } 
  static Klass* OutOfMemoryError_klass() { return check_klass_Pre(_well_known_klasses[OutOfMemoryError_klass_knum]); } 
    static Klass** OutOfMemoryError_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::OutOfMemoryError_klass_knum];           
    } 
  static Klass* StackOverflowError_klass() { return check_klass_Pre(_well_known_klasses[StackOverflowError_klass_knum]); } 
    static Klass** StackOverflowError_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::StackOverflowError_klass_knum];           
    } 
  static Klass* IllegalMonitorStateException_klass() { return check_klass_Pre(_well_known_klasses[IllegalMonitorStateException_klass_knum]); } 
    static Klass** IllegalMonitorStateException_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::IllegalMonitorStateException_klass_knum];           
    } 
  static Klass* Reference_klass() { return check_klass_Pre(_well_known_klasses[Reference_klass_knum]); } 
    static Klass** Reference_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Reference_klass_knum];           
    } 
                                                                                                                         
  /* Preload ref klasses and set reference types */                                                                      
  static Klass* SoftReference_klass() { return check_klass_Pre(_well_known_klasses[SoftReference_klass_knum]); } 
    static Klass** SoftReference_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::SoftReference_klass_knum];           
    } 
  static Klass* WeakReference_klass() { return check_klass_Pre(_well_known_klasses[WeakReference_klass_knum]); } 
    static Klass** WeakReference_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::WeakReference_klass_knum];           
    } 
  static Klass* FinalReference_klass() { return check_klass_Pre(_well_known_klasses[FinalReference_klass_knum]); } 
    static Klass** FinalReference_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::FinalReference_klass_knum];           
    } 
  static Klass* PhantomReference_klass() { return check_klass_Pre(_well_known_klasses[PhantomReference_klass_knum]); } 
    static Klass** PhantomReference_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::PhantomReference_klass_knum];           
    } 
  static Klass* Finalizer_klass() { return check_klass_Pre(_well_known_klasses[Finalizer_klass_knum]); } 
    static Klass** Finalizer_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Finalizer_klass_knum];           
    } 
                                                                                                                         
  static Klass* Thread_klass() { return check_klass_Pre(_well_known_klasses[Thread_klass_knum]); } 
    static Klass** Thread_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Thread_klass_knum];           
    } 
  static Klass* ThreadGroup_klass() { return check_klass_Pre(_well_known_klasses[ThreadGroup_klass_knum]); } 
    static Klass** ThreadGroup_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ThreadGroup_klass_knum];           
    } 
  static Klass* Properties_klass() { return check_klass_Pre(_well_known_klasses[Properties_klass_knum]); } 
    static Klass** Properties_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Properties_klass_knum];           
    } 
  static Klass* reflect_AccessibleObject_klass() { return check_klass_Pre(_well_known_klasses[reflect_AccessibleObject_klass_knum]); } 
    static Klass** reflect_AccessibleObject_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_AccessibleObject_klass_knum];           
    } 
  static Klass* reflect_Field_klass() { return check_klass_Pre(_well_known_klasses[reflect_Field_klass_knum]); } 
    static Klass** reflect_Field_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_Field_klass_knum];           
    } 
  static Klass* reflect_Parameter_klass() { return check_klass_Opt(_well_known_klasses[reflect_Parameter_klass_knum]); } 
    static Klass** reflect_Parameter_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_Parameter_klass_knum];           
    } 
  static Klass* reflect_Method_klass() { return check_klass_Pre(_well_known_klasses[reflect_Method_klass_knum]); } 
    static Klass** reflect_Method_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_Method_klass_knum];           
    } 
  static Klass* reflect_Constructor_klass() { return check_klass_Pre(_well_known_klasses[reflect_Constructor_klass_knum]); } 
    static Klass** reflect_Constructor_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_Constructor_klass_knum];           
    } 
                                                                                                                         
  /* NOTE: needed too early in bootstrapping process to have checks based on JDK version */                              
  /* Universe::is_gte_jdk14x_version() is not set up by this point. */                                                   
  /* It's okay if this turns out to be NULL in non-1.4 JDKs. */                                                          
  static Klass* reflect_MagicAccessorImpl_klass() { return check_klass_Opt(_well_known_klasses[reflect_MagicAccessorImpl_klass_knum]); } 
    static Klass** reflect_MagicAccessorImpl_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_MagicAccessorImpl_klass_knum];           
    } 
  static Klass* reflect_MethodAccessorImpl_klass() { return check_klass_Opt_Only_JDK14NewRef(_well_known_klasses[reflect_MethodAccessorImpl_klass_knum]); } 
    static Klass** reflect_MethodAccessorImpl_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_MethodAccessorImpl_klass_knum];           
    } 
  static Klass* reflect_ConstructorAccessorImpl_klass() { return check_klass_Opt_Only_JDK14NewRef(_well_known_klasses[reflect_ConstructorAccessorImpl_klass_knum]); } 
    static Klass** reflect_ConstructorAccessorImpl_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_ConstructorAccessorImpl_klass_knum];           
    } 
  static Klass* reflect_DelegatingClassLoader_klass() { return check_klass_Opt(_well_known_klasses[reflect_DelegatingClassLoader_klass_knum]); } 
    static Klass** reflect_DelegatingClassLoader_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_DelegatingClassLoader_klass_knum];           
    } 
  static Klass* reflect_ConstantPool_klass() { return check_klass_Opt_Only_JDK15(_well_known_klasses[reflect_ConstantPool_klass_knum]); } 
    static Klass** reflect_ConstantPool_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_ConstantPool_klass_knum];           
    } 
  static Klass* reflect_UnsafeStaticFieldAccessorImpl_klass() { return check_klass_Opt_Only_JDK15(_well_known_klasses[reflect_UnsafeStaticFieldAccessorImpl_klass_knum]); } 
    static Klass** reflect_UnsafeStaticFieldAccessorImpl_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_UnsafeStaticFieldAccessorImpl_klass_knum];           
    } 
  static Klass* reflect_CallerSensitive_klass() { return check_klass_Opt(_well_known_klasses[reflect_CallerSensitive_klass_knum]); } 
    static Klass** reflect_CallerSensitive_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::reflect_CallerSensitive_klass_knum];           
    } 
                                                                                                                         
  /* support for dynamic typing; it's OK if these are NULL in earlier JDKs */                                            
  static Klass* DirectMethodHandle_klass() { return check_klass_Opt(_well_known_klasses[DirectMethodHandle_klass_knum]); } 
    static Klass** DirectMethodHandle_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::DirectMethodHandle_klass_knum];           
    } 
  static Klass* MethodHandle_klass() { return check_klass_Pre_JSR292(_well_known_klasses[MethodHandle_klass_knum]); } 
    static Klass** MethodHandle_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::MethodHandle_klass_knum];           
    } 
  static Klass* MemberName_klass() { return check_klass_Pre_JSR292(_well_known_klasses[MemberName_klass_knum]); } 
    static Klass** MemberName_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::MemberName_klass_knum];           
    } 
  static Klass* MethodHandleNatives_klass() { return check_klass_Pre_JSR292(_well_known_klasses[MethodHandleNatives_klass_knum]); } 
    static Klass** MethodHandleNatives_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::MethodHandleNatives_klass_knum];           
    } 
  static Klass* LambdaForm_klass() { return check_klass_Opt(_well_known_klasses[LambdaForm_klass_knum]); } 
    static Klass** LambdaForm_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::LambdaForm_klass_knum];           
    } 
  static Klass* MethodType_klass() { return check_klass_Pre_JSR292(_well_known_klasses[MethodType_klass_knum]); } 
    static Klass** MethodType_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::MethodType_klass_knum];           
    } 
  static Klass* BootstrapMethodError_klass() { return check_klass_Pre_JSR292(_well_known_klasses[BootstrapMethodError_klass_knum]); } 
    static Klass** BootstrapMethodError_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::BootstrapMethodError_klass_knum];           
    } 
  static Klass* CallSite_klass() { return check_klass_Pre_JSR292(_well_known_klasses[CallSite_klass_knum]); } 
    static Klass** CallSite_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::CallSite_klass_knum];           
    } 
  static Klass* ConstantCallSite_klass() { return check_klass_Pre_JSR292(_well_known_klasses[ConstantCallSite_klass_knum]); } 
    static Klass** ConstantCallSite_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::ConstantCallSite_klass_knum];           
    } 
  static Klass* MutableCallSite_klass() { return check_klass_Pre_JSR292(_well_known_klasses[MutableCallSite_klass_knum]); } 
    static Klass** MutableCallSite_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::MutableCallSite_klass_knum];           
    } 
  static Klass* VolatileCallSite_klass() { return check_klass_Pre_JSR292(_well_known_klasses[VolatileCallSite_klass_knum]); } 
    static Klass** VolatileCallSite_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::VolatileCallSite_klass_knum];           
    } 
  /* Note: MethodHandle must be first, and VolatileCallSite last in group */                                             
                                                                                                                         
  static Klass* StringBuffer_klass() { return check_klass_Pre(_well_known_klasses[StringBuffer_klass_knum]); } 
    static Klass** StringBuffer_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::StringBuffer_klass_knum];           
    } 
  static Klass* StringBuilder_klass() { return check_klass_Pre(_well_known_klasses[StringBuilder_klass_knum]); } 
    static Klass** StringBuilder_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::StringBuilder_klass_knum];           
    } 
  static Klass* misc_Unsafe_klass() { return check_klass_Pre(_well_known_klasses[misc_Unsafe_klass_knum]); } 
    static Klass** misc_Unsafe_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::misc_Unsafe_klass_knum];           
    } 
                                                                                                                         
  /* It's NULL in non-1.4 JDKs. */                                                                                       
  static Klass* StackTraceElement_klass() { return check_klass_Opt(_well_known_klasses[StackTraceElement_klass_knum]); } 
    static Klass** StackTraceElement_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::StackTraceElement_klass_knum];           
    } 
  /* Universe::is_gte_jdk14x_version() is not set up by this point. */                                                   
  /* It's okay if this turns out to be NULL in non-1.4 JDKs. */                                                          
  static Klass* nio_Buffer_klass() { return check_klass_Opt(_well_known_klasses[nio_Buffer_klass_knum]); } 
    static Klass** nio_Buffer_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::nio_Buffer_klass_knum];           
    } 
                                                                                                                         
  /* Preload boxing klasses */                                                                                           
  static Klass* Boolean_klass() { return check_klass_Pre(_well_known_klasses[Boolean_klass_knum]); } 
    static Klass** Boolean_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Boolean_klass_knum];           
    } 
  static Klass* Character_klass() { return check_klass_Pre(_well_known_klasses[Character_klass_knum]); } 
    static Klass** Character_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Character_klass_knum];           
    } 
  static Klass* Float_klass() { return check_klass_Pre(_well_known_klasses[Float_klass_knum]); } 
    static Klass** Float_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Float_klass_knum];           
    } 
  static Klass* Double_klass() { return check_klass_Pre(_well_known_klasses[Double_klass_knum]); } 
    static Klass** Double_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Double_klass_knum];           
    } 
  static Klass* Byte_klass() { return check_klass_Pre(_well_known_klasses[Byte_klass_knum]); } 
    static Klass** Byte_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Byte_klass_knum];           
    } 
  static Klass* Short_klass() { return check_klass_Pre(_well_known_klasses[Short_klass_knum]); } 
    static Klass** Short_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Short_klass_knum];           
    } 
  static Klass* Integer_klass() { return check_klass_Pre(_well_known_klasses[Integer_klass_knum]); } 
    static Klass** Integer_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Integer_klass_knum];           
    } 
  static Klass* Long_klass() { return check_klass_Pre(_well_known_klasses[Long_klass_knum]); } 
    static Klass** Long_klass_addr() {                                                                       
      return &SystemDictionary::_well_known_klasses[SystemDictionary::Long_klass_knum];           
    }



( ((int)vmSymbols::java_lang_Object_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_String_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Class_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Cloneable_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ClassLoader_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_io_Serializable_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_System_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Throwable_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Error_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ThreadDeath_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Exception_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_RuntimeException_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_SecurityManager_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_security_ProtectionDomain_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_security_AccessControlContext_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ClassNotFoundException_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_NoClassDefFoundError_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_LinkageError_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ClassCastException_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ArrayStoreException_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_VirtualMachineError_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_OutOfMemoryError_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_StackOverflowError_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_IllegalMonitorStateException_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ref_Reference_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
                                                                                                                         
  /* Preload ref klasses and set reference types */                                                                      
  ( ((int)vmSymbols::java_lang_ref_SoftReference_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ref_WeakReference_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ref_FinalReference_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ref_PhantomReference_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ref_Finalizer_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
                                                                                                                         
  ( ((int)vmSymbols::java_lang_Thread_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_ThreadGroup_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_util_Properties_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_reflect_AccessibleObject_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_reflect_Field_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_reflect_Parameter_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
  ( ((int)vmSymbols::java_lang_reflect_Method_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_reflect_Constructor_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
                                                                                                                         
  /* NOTE: needed too early in bootstrapping process to have checks based on JDK version */                              
  /* Universe::is_gte_jdk14x_version() is not set up by this point. */                                                   
  /* It's okay if this turns out to be NULL in non-1.4 JDKs. */                                                          
  ( ((int)vmSymbols::sun_reflect_MagicAccessorImpl_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
  ( ((int)vmSymbols::sun_reflect_MethodAccessorImpl_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt_Only_JDK14NewRef ), 
  ( ((int)vmSymbols::sun_reflect_ConstructorAccessorImpl_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt_Only_JDK14NewRef ), 
  ( ((int)vmSymbols::sun_reflect_DelegatingClassLoader_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
  ( ((int)vmSymbols::sun_reflect_ConstantPool_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt_Only_JDK15 ), 
  ( ((int)vmSymbols::sun_reflect_UnsafeStaticFieldAccessorImpl_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt_Only_JDK15 ), 
  ( ((int)vmSymbols::sun_reflect_CallerSensitive_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
                                                                                                                         
  /* support for dynamic typing; it's OK if these are NULL in earlier JDKs */                                            
  ( ((int)vmSymbols::java_lang_invoke_DirectMethodHandle_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
  ( ((int)vmSymbols::java_lang_invoke_MethodHandle_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_MemberName_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_MethodHandleNatives_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_LambdaForm_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
  ( ((int)vmSymbols::java_lang_invoke_MethodType_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_BootstrapMethodError_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_CallSite_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_ConstantCallSite_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_MutableCallSite_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  ( ((int)vmSymbols::java_lang_invoke_VolatileCallSite_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre_JSR292 ), 
  /* Note: MethodHandle must be first, and VolatileCallSite last in group */                                             
                                                                                                                         
  ( ((int)vmSymbols::java_lang_StringBuffer_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_StringBuilder_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::sun_misc_Unsafe_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
                                                                                                                         
  /* It's NULL in non-1.4 JDKs. */                                                                                       
  ( ((int)vmSymbols::java_lang_StackTraceElement_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
  /* Universe::is_gte_jdk14x_version() is not set up by this point. */                                                   
  /* It's okay if this turns out to be NULL in non-1.4 JDKs. */                                                          
  ( ((int)vmSymbols::java_nio_Buffer_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Opt ), 
                                                                                                                         
  /* Preload boxing klasses */                                                                                           
  ( ((int)vmSymbols::java_lang_Boolean_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Character_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Float_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Double_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Byte_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Short_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Integer_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ), 
  ( ((int)vmSymbols::java_lang_Long_enum 
          << SystemDictionary::CEIL_LG_OPTION_LIMIT) 
      | (int)SystemDictionary::Pre ),