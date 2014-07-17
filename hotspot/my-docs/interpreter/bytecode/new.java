new  187 new  [0x01cc5ee0, 0x01cc60e0]  512 bytes

  0x01cc5ee0: sub    $0x4,%esp
  0x01cc5ee3: fstps  (%esp)
  0x01cc5ee6: jmp    0x01cc5f04
  0x01cc5eeb: sub    $0x8,%esp
  0x01cc5eee: fstpl  (%esp)
  0x01cc5ef1: jmp    0x01cc5f04
  0x01cc5ef6: push   %edx
  0x01cc5ef7: push   %eax
  0x01cc5ef8: jmp    0x01cc5f04
  0x01cc5efd: push   %eax
  0x01cc5efe: jmp    0x01cc5f04
  0x01cc5f03: push   %eax

  //get_unsigned_2_byte_index_at_bc
  0x01cc5f04: movzwl 0x1(%esi),%edx
  0x01cc5f08: bswap  %edx
  0x01cc5f0a: shr    $0x10,%edx

  //get_cpool_and_tags
  0x01cc5f0d: mov    -0xc(%ebp),%ecx //Method *
  0x01cc5f10: mov    0x8(%ecx),%ecx //ConstMethod *
  0x01cc5f13: mov    0x8(%ecx),%ecx //ConstantPool *
  0x01cc5f16: mov    0x8(%ecx),%eax //ConstantPoolCache *

  0x01cc5f19: cmpb   $0x7,0x4(%eax,%edx,1)
  0x01cc5f1e: jne    0x01cc6003

  0x01cc5f24: mov    0x30(%ecx,%edx,4),%ecx // get InstanceKlass
  0x01cc5f28: push   %ecx  // save the contexts of klass for initializing the header

  0x01cc5f29: cmpb   $0x4,0xde(%ecx)
  0x01cc5f30: jne    0x01cc6002

  0x01cc5f36: mov    0x8(%ecx),%edx // get instance_size in InstanceKlass (scaled to a count of bytes)
  0x01cc5f39: test   $0x1,%edx
  0x01cc5f3f: jne    0x01cc6002

  //get_thread
  0x01cc5f45: mov    %fs:0x0(,%eiz,1),%ecx
  0x01cc5f4d: mov    -0xc(%ecx),%ecx

  0x01cc5f50: mov    0x44(%ecx),%eax
  0x01cc5f53: lea    (%eax,%edx,1),%ebx
  0x01cc5f56: cmp    0x4c(%ecx),%ebx
  0x01cc5f59: ja     0x01cc5f67
  0x01cc5f5f: mov    %ebx,0x44(%ecx)
  0x01cc5f62: jmp    0x01cc5f93 // initialize both the header and fields

  //allow_shared_alloc=true时
  0x01cc5f67: mov    0x3c0e10,%eax
  0x01cc5f6d: lea    (%eax,%edx,1),%ebx
  0x01cc5f70: cmp    0x3c0de0,%ebx
  0x01cc5f76: ja     0x01cc6002

  0x01cc5f7c: lock cmpxchg %ebx,0x3c0e10
  0x01cc5f84: jne    0x01cc5f67

  //incr_allocated_bytes
  0x01cc5f86: add    %edx,0x88(%ecx)
  0x01cc5f8c: adcl   $0x0,0x8c(%ecx)

  0x01cc5f93: sub    $0x8,%edx
  0x01cc5f96: je     0x01cc5fbe

  0x01cc5f9c: xor    %ecx,%ecx
  0x01cc5f9e: shr    $0x3,%edx

  0x01cc5fa1: jae    0x01cc5fb4

  //stop("object size is not multiple of 2 - adjust this code");
  0x01cc5fa3: push   $0x5531a138
  0x01cc5fa8: call   0x01cc5fad
  0x01cc5fad: pusha  
  0x01cc5fae: call   0x54dedbf0
  0x01cc5fb3: hlt    

  0x01cc5fb4: mov    %ecx,0x4(%eax,%edx,8)
  0x01cc5fb8: mov    %ecx,(%eax,%edx,8)
  0x01cc5fbb: dec    %edx
  0x01cc5fbc: jne    0x01cc5fb4

  //UseBiasedLocking=true
  0x01cc5fbe: pop    %ecx
  0x01cc5fbf: mov    0x68(%ecx),%ebx
  0x01cc5fc2: mov    %ebx,(%eax)

  0x01cc5fc4: mov    %ecx,0x4(%eax) //store_klass

  //SkipIfEqual skip_if(_masm, &DTraceAllocProbes, 0);
  0x01cc5fc7: cmpb   $0x0,0x55633e64
  0x01cc5fce: je     0x01cc5ffd

  
  0x01cc5fd4: push   %eax

  //---begin call_VM_leaf SharedRuntime::dtrace_object_alloc
	  0x01cc5fd5: push   %eax
	  0x01cc5fd6: cmpl   $0x0,-0x8(%ebp)
	  0x01cc5fdd: je     0x01cc5ff4
	  0x01cc5fe3: push   $0x55310148
	  0x01cc5fe8: call   0x01cc5fed
	  0x01cc5fed: pusha  
	  0x01cc5fee: call   0x54dedbf0
	  0x01cc5ff3: hlt    
	  0x01cc5ff4: call   0x55215560
	  0x01cc5ff9: add    $0x4,%esp
  //---end   call_VM_leaf SharedRuntime::dtrace_object_alloc

  0x01cc5ffc: pop    %eax
  0x01cc5ffd: jmp    0x01cc60c4

  // slow case
  0x01cc6002: pop    %ecx
  //get_constant_pool
  0x01cc6003: mov    -0xc(%ebp),%eax
  0x01cc6006: mov    0x8(%eax),%eax
  0x01cc6009: mov    0x8(%eax),%eax

  //get_constant_pool
  0x01cc600c: movzwl 0x1(%esi),%edx
  0x01cc6010: bswap  %edx
  0x01cc6012: shr    $0x10,%edx

  //---begin call_VM InterpreterRuntime::_new
	  0x01cc6015: call   0x01cc601f
	  0x01cc601a: jmp    0x01cc60c4
	  0x01cc601f: push   %edx
	  0x01cc6020: push   %eax
	  0x01cc6021: lea    0xc(%esp),%eax
	  0x01cc6025: cmpl   $0x0,-0x8(%ebp)
	  0x01cc602c: je     0x01cc6043
	  0x01cc6032: push   $0x55310188
	  0x01cc6037: call   0x01cc603c
	  0x01cc603c: pusha  
	  0x01cc603d: call   0x54dedbf0
	  0x01cc6042: hlt    
	  0x01cc6043: mov    %esi,-0x1c(%ebp)
	  0x01cc6046: mov    %fs:0x0(,%eiz,1),%edi
	  0x01cc604e: mov    -0xc(%edi),%edi
	  0x01cc6051: push   %edi
	  0x01cc6052: mov    %ebp,0x144(%edi)
	  0x01cc6058: mov    %eax,0x13c(%edi)
	  0x01cc605e: call   0x55058750
	  0x01cc6063: add    $0xc,%esp
	  0x01cc6066: push   %eax
	  0x01cc6067: mov    %fs:0x0(,%eiz,1),%eax
	  0x01cc606f: mov    -0xc(%eax),%eax
	  0x01cc6072: cmp    %eax,%edi
	  0x01cc6074: je     0x01cc608b
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x01cc607a: push   $0x55312af0
	  0x01cc607f: call   0x01cc6084
	  0x01cc6084: pusha  
	  0x01cc6085: call   0x54dedbf0
	  0x01cc608a: hlt    
	  0x01cc608b: pop    %eax
	  0x01cc608c: movl   $0x0,0x13c(%edi)
	  0x01cc6096: movl   $0x0,0x144(%edi)
	  0x01cc60a0: cmpl   $0x0,0x4(%edi)
	  0x01cc60a7: jne    0x01cb0340

      //得到thread._vm_result, 在InterpreterRuntime::_new中设置
	  0x01cc60ad: mov    0x16c(%edi),%eax
	  0x01cc60b3: movl   $0x0,0x16c(%edi)

	  0x01cc60bd: mov    -0x1c(%ebp),%esi
	  0x01cc60c0: mov    -0x18(%ebp),%edi
	  0x01cc60c3: ret    
  //---end   call_VM InterpreterRuntime::_new

  0x01cc60c4: movzbl 0x3(%esi),%ebx
  0x01cc60c8: add    $0x3,%esi
  0x01cc60cb: jmp    *0x55629438(,%ebx,4)

  0x01cc60d2: nop    
  0x01cc60d3: nop    
  0x01cc60d4: int3   
  0x01cc60d5: int3   
  0x01cc60d6: int3   
  0x01cc60d7: int3   
  0x01cc60d8: int3   
  0x01cc60d9: int3   
  0x01cc60da: int3   
  0x01cc60db: int3   
  0x01cc60dc: int3   
  0x01cc60dd: int3   
  0x01cc60de: int3   
  0x01cc60df: int3   

