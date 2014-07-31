return  177 return  [0x01cc4af0, 0x01cc4e10]  800 bytes

  0x01cc4af0: sub    $0x4,%esp
  0x01cc4af3: fstps  (%esp)
  0x01cc4af6: jmp    0x01cc4b14
  0x01cc4afb: sub    $0x8,%esp
  0x01cc4afe: fstpl  (%esp)
  0x01cc4b01: jmp    0x01cc4b14
  0x01cc4b06: push   %edx
  0x01cc4b07: push   %eax
  0x01cc4b08: jmp    0x01cc4b14
  0x01cc4b0d: push   %eax
  0x01cc4b0e: jmp    0x01cc4b14
  0x01cc4b13: push   %eax

  //直接跳到这里
  //---begin InterpreterMacroAssembler::remove_activation
	  //get_thread(rcx);
	  0x01cc4b14: mov    %fs:0x0(,%eiz,1),%ecx
	  0x01cc4b1c: mov    -0xc(%ecx),%ecx

	  //ebx的低8位
	  0x01cc4b1f: mov    0x1a1(%ecx),%bl //do_not_unlock_if_synchronized
	  0x01cc4b25: mov    %ebx,%edi
	  0x01cc4b27: movb   $0x0,0x1a1(%ecx) // reset the flag

	  0x01cc4b2e: mov    -0xc(%ebp),%ebx //method
	  0x01cc4b31: mov    0x14(%ebx),%ecx //method._access_flags
	  0x01cc4b34: test   $0x20,%ecx //JVM_ACC_SYNCHRONIZED
	  0x01cc4b3a: je     0x01cc4cde

      //方法是同步的
	  0x01cc4b40: mov    %edi,%ecx
	  0x01cc4b42: test   $0xff,%cl
	  0x01cc4b45: jne    0x01cc4dad //ZF=0时跳转

      //堆栈
	  //---------------------------------------------
	  //  -0x28  [                      ] //address of first monitor
	  //  -0x24  [                      ] //BasicObjectLock::obj_offset_in_bytes
	  //  -0x20  [ (%esp)               ] //reserve word for pointer to expression stack bottom
	  //  -0x1C  [ 第一个字节码内存地址 ]
	  //  -0x18  [ argument word 1 所在堆栈位置 ]
	  //  -0x14  [ ConstantPoolCache    ]
	  //  -0x10  [ 0                    ]
	  //  -0xC   [ method               ]
	  //  -0x8   [ 0                    ]
	  //  -0x4   [ argument word n 所在堆栈位置 ]
	  //  0      [ saved rbp,           ] <--- rbp,

	  0x01cc4b4b: lea    -0x28(%ebp),%edx // address of first monitor

	  0x01cc4b4e: mov    0x4(%edx),%eax //BasicObjectLock::obj_offset_in_bytes
	  0x01cc4b51: test   %eax,%eax
	  0x01cc4b53: jne    0x01cc4c09 //ZF=0时跳转，相当于%eax的值不为0

      //throw_monitor_exception为true
	  0x01cc4b59: emms   //empty_FPU_stack
	  
	  //---begin call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
		  0x01cc4b5b: call   0x01cc4b65
		  0x01cc4b60: jmp    0x01cc4bf8
		  0x01cc4b65: lea    0x4(%esp),%eax
		  0x01cc4b69: cmpl   $0x0,-0x8(%ebp)
		  0x01cc4b70: je     0x01cc4b87
		  0x01cc4b76: push   $0x55310188
		  0x01cc4b7b: call   0x01cc4b80
		  0x01cc4b80: pusha  
		  0x01cc4b81: call   0x54dedbf0
		  0x01cc4b86: hlt    
		  0x01cc4b87: mov    %esi,-0x1c(%ebp)
		  0x01cc4b8a: mov    %fs:0x0(,%eiz,1),%edi
		  0x01cc4b92: mov    -0xc(%edi),%edi
		  0x01cc4b95: push   %edi
		  0x01cc4b96: mov    %ebp,0x144(%edi)
		  0x01cc4b9c: mov    %eax,0x13c(%edi)
		  0x01cc4ba2: call   0x5505ad80
		  0x01cc4ba7: add    $0x4,%esp
		  0x01cc4baa: push   %eax
		  0x01cc4bab: mov    %fs:0x0(,%eiz,1),%eax
		  0x01cc4bb3: mov    -0xc(%eax),%eax
		  0x01cc4bb6: cmp    %eax,%edi
		  0x01cc4bb8: je     0x01cc4bcf
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x01cc4bbe: push   $0x55312af0
		  0x01cc4bc3: call   0x01cc4bc8
		  0x01cc4bc8: pusha  
		  0x01cc4bc9: call   0x54dedbf0
		  0x01cc4bce: hlt    
		  0x01cc4bcf: pop    %eax
		  0x01cc4bd0: movl   $0x0,0x13c(%edi)
		  0x01cc4bda: movl   $0x0,0x144(%edi)
		  0x01cc4be4: cmpl   $0x0,0x4(%edi)
		  0x01cc4beb: jne    0x01cb0340
		  0x01cc4bf1: mov    -0x1c(%ebp),%esi
		  0x01cc4bf4: mov    -0x18(%ebp),%edi
		  0x01cc4bf7: ret   
	  //---end   call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
	  
	  //stop("should not reach here")
	  0x01cc4bf8: push   $0x552fd97c
	  0x01cc4bfd: call   0x01cc4c02
	  0x01cc4c02: pusha  
	  0x01cc4c03: call   0x54dedbf0
	  0x01cc4c08: hlt    

      //monitorexit的汇编中也用到了
	  //---begin InterpreterMacroAssembler::unlock_object
	      //save_bcp();
		  0x01cc4c09: mov    %esi,-0x1c(%ebp) // Save in case of exception
		  
		  0x01cc4c0c: lea    (%edx),%eax //把address of first monitor放到eax

		  0x01cc4c0e: mov    0x4(%edx),%ecx //Load oop into obj_reg(%rcx)
		  0x01cc4c11: movl   $0x0,0x4(%edx) // Free entry
		  
		  //---begin MacroAssembler::biased_locking_exit
		  0x01cc4c18: mov    (%ecx),%ebx
		  0x01cc4c1a: and    $0x7,%ebx
		  0x01cc4c1d: cmp    $0x5,%ebx
		  0x01cc4c20: je     0x01cc4cdb
		  //---end   MacroAssembler::biased_locking_exit

		  0x01cc4c26: mov    (%eax),%ebx // Load the old header from BasicLock structure
		  0x01cc4c28: test   %ebx,%ebx // Test for recursion
		  0x01cc4c2a: je     0x01cc4cdb // zero for recursive case

		  // Atomic swap back the old header
		  0x01cc4c30: lock cmpxchg %ebx,(%ecx)

		  0x01cc4c34: je     0x01cc4cdb // zero for recursive case
		  0x01cc4c3a: mov    %ecx,0x4(%edx) // restore obj

		  //---begin call_VM InterpreterRuntime::monitorexit
			  0x01cc4c3d: call   0x01cc4c47
			  0x01cc4c42: jmp    0x01cc4cdb
			  0x01cc4c47: push   %edx
			  0x01cc4c48: lea    0x8(%esp),%eax
			  0x01cc4c4c: cmpl   $0x0,-0x8(%ebp)
			  0x01cc4c53: je     0x01cc4c6a
			  0x01cc4c59: push   $0x55310188
			  0x01cc4c5e: call   0x01cc4c63
			  0x01cc4c63: pusha  
			  0x01cc4c64: call   0x54dedbf0
			  0x01cc4c69: hlt    
			  0x01cc4c6a: mov    %esi,-0x1c(%ebp)
			  0x01cc4c6d: mov    %fs:0x0(,%eiz,1),%edi
			  0x01cc4c75: mov    -0xc(%edi),%edi
			  0x01cc4c78: push   %edi
			  0x01cc4c79: mov    %ebp,0x144(%edi)
			  0x01cc4c7f: mov    %eax,0x13c(%edi)
			  0x01cc4c85: call   0x5505ab90
			  0x01cc4c8a: add    $0x8,%esp
			  0x01cc4c8d: push   %eax
			  0x01cc4c8e: mov    %fs:0x0(,%eiz,1),%eax
			  0x01cc4c96: mov    -0xc(%eax),%eax
			  0x01cc4c99: cmp    %eax,%edi
			  0x01cc4c9b: je     0x01cc4cb2
			  ;; MacroAssembler::call_VM_base: rdi not callee saved?
			  0x01cc4ca1: push   $0x55312af0
			  0x01cc4ca6: call   0x01cc4cab
			  0x01cc4cab: pusha  
			  0x01cc4cac: call   0x54dedbf0
			  0x01cc4cb1: hlt    
			  0x01cc4cb2: pop    %eax
			  0x01cc4cb3: movl   $0x0,0x13c(%edi)
			  0x01cc4cbd: movl   $0x0,0x144(%edi)
			  0x01cc4cc7: cmpl   $0x0,0x4(%edi)
			  0x01cc4cce: jne    0x01cb0340
			  0x01cc4cd4: mov    -0x1c(%ebp),%esi
			  0x01cc4cd7: mov    -0x18(%ebp),%edi
			  0x01cc4cda: ret    
		  //---end   call_VM InterpreterRuntime::monitorexit

		  0x01cc4cdb: mov    -0x1c(%ebp),%esi //restore_bcp();
	  //---end   InterpreterMacroAssembler::unlock_object


	  // points to current entry, starting with top-most entry
	  0x01cc4cde: mov    -0x20(%ebp),%ecx
	  // points to word before bottom of monitor block
	  0x01cc4ce1: lea    -0x20(%ebp),%ebx
	  0x01cc4ce4: jmp    0x01cc4da9

	  //对应if (throw_monitor_exception) 
	  0x01cc4ce9: emms   //empty_FPU_stack
	  //---begin call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
		  0x01cc4ceb: call   0x01cc4cf5
		  0x01cc4cf0: jmp    0x01cc4d88
		  0x01cc4cf5: lea    0x4(%esp),%eax
		  0x01cc4cf9: cmpl   $0x0,-0x8(%ebp)
		  0x01cc4d00: je     0x01cc4d17
		  0x01cc4d06: push   $0x55310188
		  0x01cc4d0b: call   0x01cc4d10
		  0x01cc4d10: pusha  
		  0x01cc4d11: call   0x54dedbf0
		  0x01cc4d16: hlt    
		  0x01cc4d17: mov    %esi,-0x1c(%ebp)
		  0x01cc4d1a: mov    %fs:0x0(,%eiz,1),%edi
		  0x01cc4d22: mov    -0xc(%edi),%edi
		  0x01cc4d25: push   %edi
		  0x01cc4d26: mov    %ebp,0x144(%edi)
		  0x01cc4d2c: mov    %eax,0x13c(%edi)
		  0x01cc4d32: call   0x5505ad80
		  0x01cc4d37: add    $0x4,%esp
		  0x01cc4d3a: push   %eax
		  0x01cc4d3b: mov    %fs:0x0(,%eiz,1),%eax
		  0x01cc4d43: mov    -0xc(%eax),%eax
		  0x01cc4d46: cmp    %eax,%edi
		  0x01cc4d48: je     0x01cc4d5f
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x01cc4d4e: push   $0x55312af0
		  0x01cc4d53: call   0x01cc4d58
		  0x01cc4d58: pusha  
		  0x01cc4d59: call   0x54dedbf0
		  0x01cc4d5e: hlt    
		  0x01cc4d5f: pop    %eax
		  0x01cc4d60: movl   $0x0,0x13c(%edi)
		  0x01cc4d6a: movl   $0x0,0x144(%edi)
		  0x01cc4d74: cmpl   $0x0,0x4(%edi)
		  0x01cc4d7b: jne    0x01cb0340
		  0x01cc4d81: mov    -0x1c(%ebp),%esi
		  0x01cc4d84: mov    -0x18(%ebp),%edi
		  0x01cc4d87: ret    
	  //---end   call_VM InterpreterRuntime::throw_illegal_monitor_state_exception

	  //stop("should not reach here")
	  0x01cc4d88: push   $0x552fd97c
	  0x01cc4d8d: call   0x01cc4d92
	  0x01cc4d92: pusha  
	  0x01cc4d93: call   0x54dedbf0
	  0x01cc4d98: hlt    

	  0x01cc4d99: cmpl   $0x0,0x4(%ecx)
	  0x01cc4da0: jne    0x01cc4ce9

	  0x01cc4da6: add    $0x8,%ecx // otherwise advance to next entry
	  0x01cc4da9: cmp    %ebx,%ecx // check if bottom reached
	  0x01cc4dab: jne    0x01cc4d99 // if not at bottom then check this entry


	  //---begin InterpreterMacroAssembler::notify_method_exit
		  //SkipIfEqual skip_if(this, &DTraceMethodProbes, 0);
		  0x01cc4dad: cmpb   $0x0,0x55633e5f
		  0x01cc4db4: je     0x01cc4df0

		  0x01cc4dba: mov    %fs:0x0(,%eiz,1),%ebx
		  0x01cc4dc2: mov    -0xc(%ebx),%ebx

		  0x01cc4dc5: mov    -0xc(%ebp),%ecx

		  0x01cc4dc8: push   %ecx
		  0x01cc4dc9: push   %ebx
		  0x01cc4dca: cmpl   $0x0,-0x8(%ebp)
		  0x01cc4dd1: je     0x01cc4de8
		  0x01cc4dd7: push   $0x55310148
		  0x01cc4ddc: call   0x01cc4de1
		  0x01cc4de1: pusha  
		  0x01cc4de2: call   0x54dedbf0
		  0x01cc4de7: hlt    
		  0x01cc4de8: call   0x55215710
		  0x01cc4ded: add    $0x8,%esp
      //---end   InterpreterMacroAssembler::notify_method_exit
	  
	  
	  0x01cc4df0: mov    -0x4(%ebp),%ebx // remove activation

	  //MacroAssembler::leave
	  // remove frame anchor
	  0x01cc4df3: mov    %ebp,%esp
	  0x01cc4df5: pop    %ebp

	  0x01cc4df6: pop    %esi // get return address
	  0x01cc4df7: mov    %ebx,%esp // set sp to sender sp
  //---end   InterpreterMacroAssembler::remove_activation


  0x01cc4df9: jmp    *%esi

  0x01cc4dfb: push   $0x552fd97c
  0x01cc4e00: call   0x01cc4e05
  0x01cc4e05: pusha  
  0x01cc4e06: call   0x54dedbf0
  0x01cc4e0b: hlt    
  0x01cc4e0c: int3   
  0x01cc4e0d: int3   
  0x01cc4e0e: int3   
  0x01cc4e0f: int3   
