monitorenter  194 monitorenter  [0x07f18dc0, 0x07f18f90]  464 bytes

  0x07f18dc0: pop    %eax
  0x07f18dc1: cmp    (%eax),%eax
  0x07f18dc3: xor    %edx,%edx

  0x07f18dc5: mov    -0x20(%ebp),%ecx
  0x07f18dc8: lea    -0x20(%ebp),%ebx
  0x07f18dcb: jmp    0x07f18ddf
  0x07f18dcd: cmpl   $0x0,0x4(%ecx)
  0x07f18dd4: cmove  %ecx,%edx
  0x07f18dd7: cmp    0x4(%ecx),%eax
  0x07f18dda: je     0x07f18de3
  0x07f18ddc: add    $0x8,%ecx

  0x07f18ddf: cmp    %ebx,%ecx
  0x07f18de1: jne    0x07f18dcd
  0x07f18de3: test   %edx,%edx
  0x07f18de5: jne    0x07f18e06
  0x07f18de7: mov    -0x20(%ebp),%edx
  0x07f18dea: sub    $0x8,%esp
  0x07f18ded: sub    $0x8,%edx
  0x07f18df0: mov    %esp,%ecx
  0x07f18df2: mov    %edx,-0x20(%ebp)
  0x07f18df5: jmp    0x07f18e02
  0x07f18dfa: mov    0x8(%ecx),%ebx
  0x07f18dfd: mov    %ebx,(%ecx)
  0x07f18dff: add    $0x4,%ecx
  0x07f18e02: cmp    %edx,%ecx
  0x07f18e04: jne    0x07f18dfa
  0x07f18e06: inc    %esi
  0x07f18e07: mov    %eax,0x4(%edx)

  //  // -10 -0x28  [                      ] 
      // -9  -0x24  [ monitor对象地址      ] 
  	  //－－－－－－－－－－－－－－－－－－－－－－
	  // -8  -0x20  [ -0x28的位置          ] //reserve word for pointer to expression stack bottom
	  // -7  -0x1C  [ 第一个字节码内存地址 ]
	  // -6  -0x18  [ argument word 1 所在堆栈位置 ] <--- rdi
	  // -5  -0x14  [ ConstantPoolCache    ]
	  // -4  -0x10  [ 0                    ]
	  // -3  -0xC   [ method               ]
	  // -2  -0x8   [ 0                    ]
	  // -1  -0x4   [ argument word n 所在堆栈位置 ]
	  //      0     [ saved rbp,           ] <--- rbp,
	  //－－－－－－－－－－－－－－－－－－－－－－

  //在method entry point (kind = zerolocals_synchronized)中也同样用到lock_object
  //---begin lock_object
	  0x07f18e0a: mov    0x4(%edx),%ecx
	  //---begin MacroAssembler::biased_locking_enter
		  0x07f18e0d: mov    (%ecx),%eax
		  0x07f18e0f: push   %edx
		  0x07f18e10: mov    %eax,%edx
		  0x07f18e12: and    $0x7,%edx
		  0x07f18e15: cmp    $0x5,%edx
		  0x07f18e18: pop    %edx

		  0x07f18e19: jne    0x07f18ea9
		  0x07f18e1f: mov    %eax,(%edx)
		  0x07f18e21: push   %edx

		  0x07f18e22: mov    0x4(%ecx),%edx
		  0x07f18e25: mov    0x68(%edx),%edx
		  0x07f18e28: xor    %eax,%edx

		  0x07f18e2a: mov    %fs:0x0(,%eiz,1),%eax
		  0x07f18e32: mov    -0xc(%eax),%eax
		  0x07f18e35: xor    %edx,%eax

		  0x07f18e37: and    $0xffffff87,%eax
		  0x07f18e3a: pop    %edx
		  0x07f18e3b: je     0x07f18f6a
		  0x07f18e41: test   $0x7,%eax
		  0x07f18e46: jne    0x07f18e9b
		  0x07f18e48: test   $0x180,%eax
		  0x07f18e4d: jne    0x07f18e75
		  0x07f18e4f: mov    (%edx),%eax
		  0x07f18e51: and    $0x1ff,%eax
		  0x07f18e57: push   %edx
		  0x07f18e58: mov    %fs:0x0(,%eiz,1),%edx
		  0x07f18e60: mov    -0xc(%edx),%edx
		  0x07f18e63: or     %eax,%edx
		  0x07f18e65: lock cmpxchg %edx,(%ecx)
		  0x07f18e69: pop    %edx
		  0x07f18e6a: jne    0x07f18ecc
		  0x07f18e70: jmp    0x07f18f6a
		  0x07f18e75: push   %edx
		  0x07f18e76: mov    0x4(%ecx),%edx
		  0x07f18e79: mov    0x68(%edx),%edx
		  0x07f18e7c: mov    %fs:0x0(,%eiz,1),%eax
		  0x07f18e84: mov    -0xc(%eax),%eax
		  0x07f18e87: or     %eax,%edx
		  0x07f18e89: mov    (%edx),%eax
		  0x07f18e8b: lock cmpxchg %edx,(%ecx)
		  0x07f18e8f: pop    %edx
		  0x07f18e90: jne    0x07f18ecc
		  0x07f18e96: jmp    0x07f18f6a
		  0x07f18e9b: mov    (%edx),%eax
		  0x07f18e9d: push   %edx
		  0x07f18e9e: mov    0x4(%ecx),%edx
		  0x07f18ea1: mov    0x68(%edx),%edx
		  0x07f18ea4: lock cmpxchg %edx,(%ecx)
		  0x07f18ea8: pop    %edx
	  //---end   MacroAssembler::biased_locking_enter
	  0x07f18ea9: mov    $0x1,%eax
	  0x07f18eae: or     (%ecx),%eax
	  0x07f18eb0: mov    %eax,(%edx)
	  0x07f18eb2: lock cmpxchg %edx,(%ecx)
	  0x07f18eb6: je     0x07f18f6a
	  0x07f18ebc: sub    %esp,%eax
	  0x07f18ebe: and    $0xfffff003,%eax
	  0x07f18ec4: mov    %eax,(%edx)
	  0x07f18ec6: je     0x07f18f6a

	  //---begin MacroAssembler::call_VM InterpreterRuntime::monitorenter
		  0x07f18ecc: call   0x07f18ed6
		  0x07f18ed1: jmp    0x07f18f6a
		  0x07f18ed6: push   %edx
		  0x07f18ed7: lea    0x8(%esp),%eax
		  0x07f18edb: cmpl   $0x0,-0x8(%ebp)
		  0x07f18ee2: je     0x07f18ef9
		  0x07f18ee8: push   $0x5926a9d4
		  0x07f18eed: call   0x07f18ef2
		  0x07f18ef2: pusha  
		  0x07f18ef3: call   0x58d2df50
		  0x07f18ef8: hlt    
		  0x07f18ef9: mov    %esi,-0x1c(%ebp)
		  0x07f18efc: mov    %fs:0x0(,%eiz,1),%edi
		  0x07f18f04: mov    -0xc(%edi),%edi
		  0x07f18f07: push   %edi
		  0x07f18f08: mov    %ebp,0x144(%edi)
		  0x07f18f0e: mov    %eax,0x13c(%edi)
		  0x07f18f14: call   0x58fad2a0
		  0x07f18f19: add    $0x8,%esp
		  0x07f18f1c: push   %eax
		  0x07f18f1d: mov    %fs:0x0(,%eiz,1),%eax
		  0x07f18f25: mov    -0xc(%eax),%eax
		  0x07f18f28: cmp    %eax,%edi
		  0x07f18f2a: je     0x07f18f41
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x07f18f30: push   $0x5926d0e8
		  0x07f18f35: call   0x07f18f3a
		  0x07f18f3a: pusha  
		  0x07f18f3b: call   0x58d2df50
		  0x07f18f40: hlt    
		  0x07f18f41: pop    %eax
		  0x07f18f42: movl   $0x0,0x13c(%edi)
		  0x07f18f4c: movl   $0x0,0x144(%edi)
		  0x07f18f56: cmpl   $0x0,0x4(%edi)
		  0x07f18f5d: jne    0x07f00380
		  0x07f18f63: mov    -0x1c(%ebp),%esi
		  0x07f18f66: mov    -0x18(%ebp),%edi
		  0x07f18f69: ret   
	  //---end   MacroAssembler::call_VM InterpreterRuntime::monitorenter
  //---end   lock_object
  
  0x07f18f6a: mov    %esi,-0x1c(%ebp) //save_bcp
  0x07f18f6d: mov    %eax,-0x9000(%esp) //generate_stack_overflow_check

  //dispatch_next
  0x07f18f74: movzbl (%esi),%ebx
  0x07f18f77: jmp    *0x595974a8(,%ebx,4)
  0x07f18f7e: push   $0x59257db8
  0x07f18f83: call   0x07f18f88
  0x07f18f88: pusha  
  0x07f18f89: call   0x58d2df50
  0x07f18f8e: hlt    
  0x07f18f8f: nop    

