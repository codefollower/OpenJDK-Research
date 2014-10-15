monitorenter  194 monitorenter  [0x01cc65d0, 0x01cc67b0]  480 bytes

  0x01cc65d0: pop    %eax //monitor对象地址
  0x01cc65d1: cmp    (%eax),%eax //null_check
  0x01cc65d3: xor    %edx,%edx // points to free slot or NULL

  //此时的堆栈
  	  //－－－－－－－－－－－－－－－－－－－－－－
	  // -8  -0x20  [ (%esp)               ] //reserve word for pointer to expression stack bottom
	  // -7  -0x1C  [ 第一个字节码内存地址 ]
	  // -6  -0x18  [ argument word 1 所在堆栈位置 ] <--- rdi
	  // -5  -0x14  [ ConstantPoolCache    ]
	  // -4  -0x10  [ 0                    ]
	  // -3  -0xC   [ method               ]
	  // -2  -0x8   [ 0                    ]
	  // -1  -0x4   [ argument word n 所在堆栈位置 ]
	  //      0     [ saved rbp,           ] <--- rbp,
	  //－－－－－－－－－－－－－－－－－－－－－－
  0x01cc65d5: mov    -0x20(%ebp),%ecx // points to current entry, starting with top-most entry
  0x01cc65d8: lea    -0x20(%ebp),%ebx // points to word before bottom of monitor block
  0x01cc65db: jmp    0x01cc65ef

  0x01cc65dd: cmpl   $0x0,0x4(%ecx) //在monitorexit后会把monitor对象在堆栈那个位置设为0
  0x01cc65e4: cmove  %ecx,%edx //ZF=1时移动
  0x01cc65e7: cmp    0x4(%ecx),%eax
  0x01cc65ea: je     0x01cc65f3
  0x01cc65ec: add    $0x8,%ecx //已经到了下一个不同的monitor对象

  0x01cc65ef: cmp    %ebx,%ecx
  0x01cc65f1: jne    0x01cc65dd

  0x01cc65f3: test   %edx,%edx
  0x01cc65f5: jne    0x01cc6616

  //第一次
      // -10 -0x28  [                      ] 
      // -9  -0x24  [                      ] 
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

  //第二次
      // -12 -0x30  [                      ] 
      // -11 -0x2C  [                      ] 
      // -10 -0x28  [                      ] 
      // -9  -0x24  [                      ] 
  	  //－－－－－－－－－－－－－－－－－－－－－－
	  // -8  -0x20  [ -0x30的位置          ] //reserve word for pointer to expression stack bottom
	  // -7  -0x1C  [ 第一个字节码内存地址 ]
	  // -6  -0x18  [ argument word 1 所在堆栈位置 ] <--- rdi
	  // -5  -0x14  [ ConstantPoolCache    ]
	  // -4  -0x10  [ 0                    ]
	  // -3  -0xC   [ method               ]
	  // -2  -0x8   [ 0                    ]
	  // -1  -0x4   [ argument word n 所在堆栈位置 ]
	  //      0     [ saved rbp,           ] <--- rbp,
	  //－－－－－－－－－－－－－－－－－－－－－－

  //第三次
      // -14 -0x38  [                      ] 
      // -13 -0x34  [                      ] 
      // -12 -0x30  [                      ] 
      // -11 -0x2C  [                      ] 
      // -10 -0x28  [                      ] 
      // -9  -0x24  [                      ] 
  	  //－－－－－－－－－－－－－－－－－－－－－－
	  // -8  -0x20  [ -0x38的位置          ] //reserve word for pointer to expression stack bottom
	  // -7  -0x1C  [ 第一个字节码内存地址 ]
	  // -6  -0x18  [ argument word 1 所在堆栈位置 ] <--- rdi
	  // -5  -0x14  [ ConstantPoolCache    ]
	  // -4  -0x10  [ 0                    ]
	  // -3  -0xC   [ method               ]
	  // -2  -0x8   [ 0                    ]
	  // -1  -0x4   [ argument word n 所在堆栈位置 ]
	  //      0     [ saved rbp,           ] <--- rbp,
	  //－－－－－－－－－－－－－－－－－－－－－－

  // 1. compute new pointers  
  0x01cc65f7: mov    -0x20(%ebp),%edx
  0x01cc65fa: sub    $0x8,%esp
  0x01cc65fd: sub    $0x8,%edx
  0x01cc6600: mov    %esp,%ecx
  0x01cc6602: mov    %edx,-0x20(%ebp)
  0x01cc6605: jmp    0x01cc6612

  // 2. move expression stack contents
  0x01cc660a: mov    0x8(%ecx),%ebx
  0x01cc660d: mov    %ebx,(%ecx)
  0x01cc660f: add    $0x4,%ecx
  0x01cc6612: cmp    %edx,%ecx
  0x01cc6614: jne    0x01cc660a

  // Increment bcp to point to the next bytecode, so exception handling for async. exceptions work correctly.
  // The object has already been poped from the stack, so the expression stack looks correct.
  0x01cc6616: inc    %esi
  0x01cc6617: mov    %eax,0x4(%edx) // store object

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
	  0x01cc661a: mov    0x4(%edx),%ecx
	  //---begin MacroAssembler::biased_locking_enter
		  0x01cc661d: mov    (%ecx),%eax
		  0x01cc661f: push   %edx
		  0x01cc6620: mov    %eax,%edx
		  0x01cc6622: and    $0x7,%edx
		  0x01cc6625: cmp    $0x5,%edx
		  0x01cc6628: pop    %edx
		  0x01cc6629: jne    0x01cc66bd
		  0x01cc662f: mov    %eax,(%edx)
		  0x01cc6631: push   %edx
		  0x01cc6632: mov    %fs:0x0(,%eiz,1),%edx
		  0x01cc663a: mov    -0xc(%edx),%edx
		  0x01cc663d: xor    %edx,%eax
		  0x01cc663f: mov    0x4(%ecx),%edx
		  0x01cc6642: xor    0x68(%edx),%eax
		  0x01cc6645: and    $0xffffff87,%eax
		  0x01cc6648: pop    %edx
		  0x01cc6649: je     0x01cc677e
		  0x01cc664f: test   $0x7,%eax
		  0x01cc6654: jne    0x01cc66af
		  0x01cc665a: test   $0x180,%eax
		  0x01cc665f: jne    0x01cc668b
		  0x01cc6665: mov    (%edx),%eax
		  0x01cc6667: and    $0x1ff,%eax
		  0x01cc666d: push   %edx
		  0x01cc666e: mov    %fs:0x0(,%eiz,1),%edx
		  0x01cc6676: mov    -0xc(%edx),%edx
		  0x01cc6679: or     %eax,%edx
		  0x01cc667b: lock cmpxchg %edx,(%ecx)
		  0x01cc667f: pop    %edx
		  0x01cc6680: jne    0x01cc66e0
		  0x01cc6686: jmp    0x01cc677e
		  0x01cc668b: push   %edx
		  0x01cc668c: mov    %fs:0x0(,%eiz,1),%edx
		  0x01cc6694: mov    -0xc(%edx),%edx
		  0x01cc6697: mov    0x4(%ecx),%eax
		  0x01cc669a: or     0x68(%eax),%edx
		  0x01cc669d: mov    (%edx),%eax
		  0x01cc669f: lock cmpxchg %edx,(%ecx)
		  0x01cc66a3: pop    %edx
		  0x01cc66a4: jne    0x01cc66e0
		  0x01cc66aa: jmp    0x01cc677e
		  0x01cc66af: mov    (%edx),%eax
		  0x01cc66b1: push   %edx
		  0x01cc66b2: mov    0x4(%ecx),%edx
		  0x01cc66b5: mov    0x68(%edx),%edx
		  0x01cc66b8: lock cmpxchg %edx,(%ecx)
		  0x01cc66bc: pop    %edx
	  //---end   MacroAssembler::biased_locking_enter

	  0x01cc66bd: mov    $0x1,%eax
	  0x01cc66c2: or     (%ecx),%eax
	  0x01cc66c4: mov    %eax,(%edx)
	  0x01cc66c6: lock cmpxchg %edx,(%ecx)
	  0x01cc66ca: je     0x01cc677e
	  0x01cc66d0: sub    %esp,%eax
	  0x01cc66d2: and    $0xfffff003,%eax
	  0x01cc66d8: mov    %eax,(%edx)
	  0x01cc66da: je     0x01cc677e

	  //---begin MacroAssembler::call_VM InterpreterRuntime::monitorenter
		  0x01cc66e0: call   0x01cc66ea
		  0x01cc66e5: jmp    0x01cc677e
		  0x01cc66ea: push   %edx
		  0x01cc66eb: lea    0x8(%esp),%eax
		  0x01cc66ef: cmpl   $0x0,-0x8(%ebp)
		  0x01cc66f6: je     0x01cc670d
		  0x01cc66fc: push   $0x55310188
		  0x01cc6701: call   0x01cc6706
		  0x01cc6706: pusha  
		  0x01cc6707: call   0x54dedbf0
		  0x01cc670c: hlt    
		  0x01cc670d: mov    %esi,-0x1c(%ebp)
		  0x01cc6710: mov    %fs:0x0(,%eiz,1),%edi
		  0x01cc6718: mov    -0xc(%edi),%edi
		  0x01cc671b: push   %edi
		  0x01cc671c: mov    %ebp,0x144(%edi)
		  0x01cc6722: mov    %eax,0x13c(%edi)
		  0x01cc6728: call   0x5505a930
		  0x01cc672d: add    $0x8,%esp
		  0x01cc6730: push   %eax
		  0x01cc6731: mov    %fs:0x0(,%eiz,1),%eax
		  0x01cc6739: mov    -0xc(%eax),%eax
		  0x01cc673c: cmp    %eax,%edi
		  0x01cc673e: je     0x01cc6755
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x01cc6744: push   $0x55312af0
		  0x01cc6749: call   0x01cc674e
		  0x01cc674e: pusha  
		  0x01cc674f: call   0x54dedbf0
		  0x01cc6754: hlt    
		  0x01cc6755: pop    %eax
		  0x01cc6756: movl   $0x0,0x13c(%edi)
		  0x01cc6760: movl   $0x0,0x144(%edi)
		  0x01cc676a: cmpl   $0x0,0x4(%edi)
		  0x01cc6771: jne    0x01cb0340
		  0x01cc6777: mov    -0x1c(%ebp),%esi
		  0x01cc677a: mov    -0x18(%ebp),%edi
		  0x01cc677d: ret    
	  //---end   MacroAssembler::call_VM InterpreterRuntime::monitorenter
  //---end   lock_object

  0x01cc677e: mov    %esi,-0x1c(%ebp) //save_bcp
  0x01cc6781: mov    %eax,-0x9000(%esp) //generate_stack_overflow_check

  //dispatch_next
  0x01cc6788: movzbl (%esi),%ebx
  0x01cc678b: jmp    *0x55629838(,%ebx,4)
  0x01cc6792: push   $0x552fd97c
  0x01cc6797: call   0x01cc679c
  0x01cc679c: pusha  
  0x01cc679d: call   0x54dedbf0
  0x01cc67a2: hlt    
  0x01cc67a3: nop    
  0x01cc67a4: int3   
  0x01cc67a5: int3   
  0x01cc67a6: int3   
  0x01cc67a7: int3   
  0x01cc67a8: int3   
  0x01cc67a9: int3   
  0x01cc67aa: int3   
  0x01cc67ab: int3   
  0x01cc67ac: int3   
  0x01cc67ad: int3   
  0x01cc67ae: int3   
  0x01cc67af: int3   

if(mark word ==5) {
}