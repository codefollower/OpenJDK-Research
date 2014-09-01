return  177 return  [0x07f14af0, 0x07f14e10]  800 bytes

  0x07f14af0: sub    $0x4,%esp
  0x07f14af3: fstps  (%esp)
  0x07f14af6: jmp    0x07f14b14
  0x07f14afb: sub    $0x8,%esp
  0x07f14afe: fstpl  (%esp)
  0x07f14b01: jmp    0x07f14b14
  0x07f14b06: push   %edx
  0x07f14b07: push   %eax
  0x07f14b08: jmp    0x07f14b14
  0x07f14b0d: push   %eax
  0x07f14b0e: jmp    0x07f14b14
  0x07f14b13: push   %eax

  //直接跳到这里
  //---begin InterpreterMacroAssembler::remove_activation
	  //get_thread(rcx);
	  0x07f14b14: mov    %fs:0x0(,%eiz,1),%ecx
	  0x07f14b1c: mov    -0xc(%ecx),%ecx

	  //ebx的低8位
	  0x07f14b1f: mov    0x1a1(%ecx),%bl //do_not_unlock_if_synchronized
	  0x07f14b25: mov    %ebx,%edi
	  0x07f14b27: movb   $0x0,0x1a1(%ecx) // reset the flag

	  0x07f14b2e: mov    -0xc(%ebp),%ebx //method
	  0x07f14b31: mov    0x14(%ebx),%ecx //method._access_flags
	  0x07f14b34: test   $0x20,%ecx //JVM_ACC_SYNCHRONIZED
	  0x07f14b3a: je     0x07f14cde

      //方法是同步的
	  0x07f14b40: mov    %edi,%ecx
	  0x07f14b42: test   $0xff,%cl
	  0x07f14b45: jne    0x07f14dad //ZF=0时跳转

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

	  0x07f14b4b: lea    -0x28(%ebp),%edx // address of first monitor

	  0x07f14b4e: mov    0x4(%edx),%eax //BasicObjectLock::obj_offset_in_bytes
	  0x07f14b51: test   %eax,%eax
	  0x07f14b53: jne    0x07f14c09 //ZF=0时跳转，相当于%eax的值不为0

      //throw_monitor_exception为true
	  0x07f14b59: emms   //empty_FPU_stack
	  
	  //---begin call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
		  0x07f14b5b: call   0x07f14b65
		  0x07f14b60: jmp    0x07f14bf8
		  0x07f14b65: lea    0x4(%esp),%eax
		  0x07f14b69: cmpl   $0x0,-0x8(%ebp)
		  0x07f14b70: je     0x07f14b87
		  0x07f14b76: push   $0x55310188
		  0x07f14b7b: call   0x07f14b80
		  0x07f14b80: pusha  
		  0x07f14b81: call   0x54dedbf0
		  0x07f14b86: hlt    
		  0x07f14b87: mov    %esi,-0x1c(%ebp)
		  0x07f14b8a: mov    %fs:0x0(,%eiz,1),%edi
		  0x07f14b92: mov    -0xc(%edi),%edi
		  0x07f14b95: push   %edi
		  0x07f14b96: mov    %ebp,0x144(%edi)
		  0x07f14b9c: mov    %eax,0x13c(%edi)
		  0x07f14ba2: call   0x5505ad80
		  0x07f14ba7: add    $0x4,%esp
		  0x07f14baa: push   %eax
		  0x07f14bab: mov    %fs:0x0(,%eiz,1),%eax
		  0x07f14bb3: mov    -0xc(%eax),%eax
		  0x07f14bb6: cmp    %eax,%edi
		  0x07f14bb8: je     0x07f14bcf
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x07f14bbe: push   $0x55312af0
		  0x07f14bc3: call   0x07f14bc8
		  0x07f14bc8: pusha  
		  0x07f14bc9: call   0x54dedbf0
		  0x07f14bce: hlt    
		  0x07f14bcf: pop    %eax
		  0x07f14bd0: movl   $0x0,0x13c(%edi)
		  0x07f14bda: movl   $0x0,0x144(%edi)
		  0x07f14be4: cmpl   $0x0,0x4(%edi)
		  0x07f14beb: jne    0x01cb0340
		  0x07f14bf1: mov    -0x1c(%ebp),%esi
		  0x07f14bf4: mov    -0x18(%ebp),%edi
		  0x07f14bf7: ret   
	  //---end   call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
	  
	  //stop("should not reach here")
	  0x07f14bf8: push   $0x552fd97c
	  0x07f14bfd: call   0x07f14c02
	  0x07f14c02: pusha  
	  0x07f14c03: call   0x54dedbf0
	  0x07f14c08: hlt    

      //monitorexit的汇编中也用到了
	  //---begin InterpreterMacroAssembler::unlock_object
	      //save_bcp();
		  0x07f14c09: mov    %esi,-0x1c(%ebp) // Save in case of exception
		  
		  0x07f14c0c: lea    (%edx),%eax //把address of first monitor放到eax

		  0x07f14c0e: mov    0x4(%edx),%ecx //Load oop into obj_reg(%rcx)
		  0x07f14c11: movl   $0x0,0x4(%edx) // Free entry
		  
		  //---begin MacroAssembler::biased_locking_exit
		  0x07f14c18: mov    (%ecx),%ebx
		  0x07f14c1a: and    $0x7,%ebx
		  0x07f14c1d: cmp    $0x5,%ebx
		  0x07f14c20: je     0x07f14cdb
		  //---end   MacroAssembler::biased_locking_exit

		  0x07f14c26: mov    (%eax),%ebx // Load the old header from BasicLock structure
		  0x07f14c28: test   %ebx,%ebx // Test for recursion
		  0x07f14c2a: je     0x07f14cdb // zero for recursive case

		  // Atomic swap back the old header
		  0x07f14c30: lock cmpxchg %ebx,(%ecx)

		  0x07f14c34: je     0x07f14cdb // zero for recursive case
		  0x07f14c3a: mov    %ecx,0x4(%edx) // restore obj

		  //---begin call_VM InterpreterRuntime::monitorexit
			  0x07f14c3d: call   0x07f14c47
			  0x07f14c42: jmp    0x07f14cdb
			  0x07f14c47: push   %edx
			  0x07f14c48: lea    0x8(%esp),%eax
			  0x07f14c4c: cmpl   $0x0,-0x8(%ebp)
			  0x07f14c53: je     0x07f14c6a
			  0x07f14c59: push   $0x55310188
			  0x07f14c5e: call   0x07f14c63
			  0x07f14c63: pusha  
			  0x07f14c64: call   0x54dedbf0
			  0x07f14c69: hlt    
			  0x07f14c6a: mov    %esi,-0x1c(%ebp)
			  0x07f14c6d: mov    %fs:0x0(,%eiz,1),%edi
			  0x07f14c75: mov    -0xc(%edi),%edi
			  0x07f14c78: push   %edi
			  0x07f14c79: mov    %ebp,0x144(%edi)
			  0x07f14c7f: mov    %eax,0x13c(%edi)
			  0x07f14c85: call   0x5505ab90
			  0x07f14c8a: add    $0x8,%esp
			  0x07f14c8d: push   %eax
			  0x07f14c8e: mov    %fs:0x0(,%eiz,1),%eax
			  0x07f14c96: mov    -0xc(%eax),%eax
			  0x07f14c99: cmp    %eax,%edi
			  0x07f14c9b: je     0x07f14cb2
			  ;; MacroAssembler::call_VM_base: rdi not callee saved?
			  0x07f14ca1: push   $0x55312af0
			  0x07f14ca6: call   0x07f14cab
			  0x07f14cab: pusha  
			  0x07f14cac: call   0x54dedbf0
			  0x07f14cb1: hlt    
			  0x07f14cb2: pop    %eax
			  0x07f14cb3: movl   $0x0,0x13c(%edi)
			  0x07f14cbd: movl   $0x0,0x144(%edi)
			  0x07f14cc7: cmpl   $0x0,0x4(%edi)
			  0x07f14cce: jne    0x01cb0340
			  0x07f14cd4: mov    -0x1c(%ebp),%esi
			  0x07f14cd7: mov    -0x18(%ebp),%edi
			  0x07f14cda: ret    
		  //---end   call_VM InterpreterRuntime::monitorexit

		  0x07f14cdb: mov    -0x1c(%ebp),%esi //restore_bcp();
	  //---end   InterpreterMacroAssembler::unlock_object


	  // points to current entry, starting with top-most entry
	  0x07f14cde: mov    -0x20(%ebp),%ecx
	  // points to word before bottom of monitor block
	  0x07f14ce1: lea    -0x20(%ebp),%ebx
	  0x07f14ce4: jmp    0x07f14da9

	  //对应if (throw_monitor_exception) 
	  0x07f14ce9: emms   //empty_FPU_stack
	  //---begin call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
		  0x07f14ceb: call   0x07f14cf5
		  0x07f14cf0: jmp    0x07f14d88
		  0x07f14cf5: lea    0x4(%esp),%eax
		  0x07f14cf9: cmpl   $0x0,-0x8(%ebp)
		  0x07f14d00: je     0x07f14d17
		  0x07f14d06: push   $0x55310188
		  0x07f14d0b: call   0x07f14d10
		  0x07f14d10: pusha  
		  0x07f14d11: call   0x54dedbf0
		  0x07f14d16: hlt    
		  0x07f14d17: mov    %esi,-0x1c(%ebp)
		  0x07f14d1a: mov    %fs:0x0(,%eiz,1),%edi
		  0x07f14d22: mov    -0xc(%edi),%edi
		  0x07f14d25: push   %edi
		  0x07f14d26: mov    %ebp,0x144(%edi)
		  0x07f14d2c: mov    %eax,0x13c(%edi)
		  0x07f14d32: call   0x5505ad80
		  0x07f14d37: add    $0x4,%esp
		  0x07f14d3a: push   %eax
		  0x07f14d3b: mov    %fs:0x0(,%eiz,1),%eax
		  0x07f14d43: mov    -0xc(%eax),%eax
		  0x07f14d46: cmp    %eax,%edi
		  0x07f14d48: je     0x07f14d5f
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x07f14d4e: push   $0x55312af0
		  0x07f14d53: call   0x07f14d58
		  0x07f14d58: pusha  
		  0x07f14d59: call   0x54dedbf0
		  0x07f14d5e: hlt    
		  0x07f14d5f: pop    %eax
		  0x07f14d60: movl   $0x0,0x13c(%edi)
		  0x07f14d6a: movl   $0x0,0x144(%edi)
		  0x07f14d74: cmpl   $0x0,0x4(%edi)
		  0x07f14d7b: jne    0x01cb0340
		  0x07f14d81: mov    -0x1c(%ebp),%esi
		  0x07f14d84: mov    -0x18(%ebp),%edi
		  0x07f14d87: ret    
	  //---end   call_VM InterpreterRuntime::throw_illegal_monitor_state_exception

	  //stop("should not reach here")
	  0x07f14d88: push   $0x552fd97c
	  0x07f14d8d: call   0x07f14d92
	  0x07f14d92: pusha  
	  0x07f14d93: call   0x54dedbf0
	  0x07f14d98: hlt    

	  0x07f14d99: cmpl   $0x0,0x4(%ecx)
	  0x07f14da0: jne    0x07f14ce9

	  0x07f14da6: add    $0x8,%ecx // otherwise advance to next entry
	  0x07f14da9: cmp    %ebx,%ecx // check if bottom reached
	  0x07f14dab: jne    0x07f14d99 // if not at bottom then check this entry


	  //---begin InterpreterMacroAssembler::notify_method_exit
		  //SkipIfEqual skip_if(this, &DTraceMethodProbes, 0);
		  0x07f14dad: cmpb   $0x0,0x55633e5f
		  0x07f14db4: je     0x07f14df0

		  0x07f14dba: mov    %fs:0x0(,%eiz,1),%ebx
		  0x07f14dc2: mov    -0xc(%ebx),%ebx

		  0x07f14dc5: mov    -0xc(%ebp),%ecx

		  0x07f14dc8: push   %ecx
		  0x07f14dc9: push   %ebx
		  0x07f14dca: cmpl   $0x0,-0x8(%ebp)
		  0x07f14dd1: je     0x07f14de8
		  0x07f14dd7: push   $0x55310148
		  0x07f14ddc: call   0x07f14de1
		  0x07f14de1: pusha  
		  0x07f14de2: call   0x54dedbf0
		  0x07f14de7: hlt    
		  0x07f14de8: call   0x55215710
		  0x07f14ded: add    $0x8,%esp
      //---end   InterpreterMacroAssembler::notify_method_exit
	  
	  
	  0x07f14df0: mov    -0x4(%ebp),%ebx // remove activation

	  //MacroAssembler::leave
	  // remove frame anchor
	  0x07f14df3: mov    %ebp,%esp
	  0x07f14df5: pop    %ebp

	  0x07f14df6: pop    %esi // get return address
	  0x07f14df7: mov    %ebx,%esp // set sp to sender sp
  //---end   InterpreterMacroAssembler::remove_activation


  0x07f14df9: jmp    *%esi

  0x07f14dfb: push   $0x552fd97c
  0x07f14e00: call   0x07f14e05
  0x07f14e05: pusha  
  0x07f14e06: call   0x54dedbf0
  0x07f14e0b: hlt    
  0x07f14e0c: int3   
  0x07f14e0d: int3   
  0x07f14e0e: int3   
  0x07f14e0f: int3   
