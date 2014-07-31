monitorexit  195 monitorexit  [0x01cc67c0, 0x01cc6970]  432 bytes

  0x01cc67c0: pop    %eax
  0x01cc67c1: cmp    (%eax),%eax //null_check

  // find matching slot
  0x01cc67c3: mov    -0x20(%ebp),%edx
  0x01cc67c6: lea    -0x20(%ebp),%ebx
  0x01cc67c9: jmp    0x01cc67d7

  0x01cc67cb: cmp    0x4(%edx),%eax
  0x01cc67ce: je     0x01cc6889
  0x01cc67d4: add    $0x8,%edx

  0x01cc67d7: cmp    %ebx,%edx
  0x01cc67d9: jne    0x01cc67cb

  //---begin MacroAssembler::call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
	  0x01cc67db: call   0x01cc67e5
	  0x01cc67e0: jmp    0x01cc6878
	  0x01cc67e5: lea    0x4(%esp),%eax
	  0x01cc67e9: cmpl   $0x0,-0x8(%ebp)
	  0x01cc67f0: je     0x01cc6807
	  0x01cc67f6: push   $0x55310188
	  0x01cc67fb: call   0x01cc6800
	  0x01cc6800: pusha  
	  0x01cc6801: call   0x54dedbf0
	  0x01cc6806: hlt    
	  0x01cc6807: mov    %esi,-0x1c(%ebp)
	  0x01cc680a: mov    %fs:0x0(,%eiz,1),%edi
	  0x01cc6812: mov    -0xc(%edi),%edi
	  0x01cc6815: push   %edi
	  0x01cc6816: mov    %ebp,0x144(%edi)
	  0x01cc681c: mov    %eax,0x13c(%edi)
	  0x01cc6822: call   0x5505ad80
	  0x01cc6827: add    $0x4,%esp
	  0x01cc682a: push   %eax
	  0x01cc682b: mov    %fs:0x0(,%eiz,1),%eax
	  0x01cc6833: mov    -0xc(%eax),%eax
	  0x01cc6836: cmp    %eax,%edi
	  0x01cc6838: je     0x01cc684f
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x01cc683e: push   $0x55312af0
	  0x01cc6843: call   0x01cc6848
	  0x01cc6848: pusha  
	  0x01cc6849: call   0x54dedbf0
	  0x01cc684e: hlt    
	  0x01cc684f: pop    %eax
	  0x01cc6850: movl   $0x0,0x13c(%edi)
	  0x01cc685a: movl   $0x0,0x144(%edi)
	  0x01cc6864: cmpl   $0x0,0x4(%edi)
	  0x01cc686b: jne    0x01cb0340
	  0x01cc6871: mov    -0x1c(%ebp),%esi
	  0x01cc6874: mov    -0x18(%ebp),%edi
	  0x01cc6877: ret    
  //---end   MacroAssembler::call_VM InterpreterRuntime::throw_illegal_monitor_state_exception

  //stop("should not reach here")
  0x01cc6878: push   $0x552fd97c
  0x01cc687d: call   0x01cc6882
  0x01cc6882: pusha  
  0x01cc6883: call   0x54dedbf0
  0x01cc6888: hlt    

  0x01cc6889: push   %eax // make sure object is on stack (contract with oopMaps)

  //如果是同步方法, 对应的return字节码中的汇编也包含unlock_object
  //---begin InterpreterMacroAssembler::unlock_object
	  0x01cc688a: mov    %esi,-0x1c(%ebp) //save_bcp
	  // Convert from BasicObjectLock structure to object and BasicLock structure
	  // Store the BasicLock address into %rax,
	  0x01cc688d: lea    (%edx),%eax //直接把%edx中的值放到%eax

	  0x01cc688f: mov    0x4(%edx),%ecx // Load oop into obj_reg(%rcx)
	  0x01cc6892: movl   $0x0,0x4(%edx) // Free entry

	  //---begin MacroAssembler::biased_locking_exit
		  0x01cc6899: mov    (%ecx),%ebx
		  0x01cc689b: and    $0x7,%ebx
		  0x01cc689e: cmp    $0x5,%ebx
		  0x01cc68a1: je     0x01cc695c
	  //---end   MacroAssembler::biased_locking_exit

	  // Load the old header from BasicLock structure
	  0x01cc68a7: mov    (%eax),%ebx
	  // Test for recursion
	  0x01cc68a9: test   %ebx,%ebx
	  // zero for recursive case
	  0x01cc68ab: je     0x01cc695c
	  // Atomic swap back the old header
	  0x01cc68b1: lock cmpxchg %ebx,(%ecx)
	  // zero for recursive case
	  0x01cc68b5: je     0x01cc695c

	  0x01cc68bb: mov    %ecx,0x4(%edx) // restore obj

	  //---begin call_VM InterpreterRuntime::monitorexit
		  0x01cc68be: call   0x01cc68c8
		  0x01cc68c3: jmp    0x01cc695c
		  0x01cc68c8: push   %edx
		  0x01cc68c9: lea    0x8(%esp),%eax
		  0x01cc68cd: cmpl   $0x0,-0x8(%ebp)
		  0x01cc68d4: je     0x01cc68eb
		  0x01cc68da: push   $0x55310188
		  0x01cc68df: call   0x01cc68e4
		  0x01cc68e4: pusha  
		  0x01cc68e5: call   0x54dedbf0
		  0x01cc68ea: hlt    
		  0x01cc68eb: mov    %esi,-0x1c(%ebp)
		  0x01cc68ee: mov    %fs:0x0(,%eiz,1),%edi
		  0x01cc68f6: mov    -0xc(%edi),%edi
		  0x01cc68f9: push   %edi
		  0x01cc68fa: mov    %ebp,0x144(%edi)
		  0x01cc6900: mov    %eax,0x13c(%edi)
		  0x01cc6906: call   0x5505ab90
		  0x01cc690b: add    $0x8,%esp
		  0x01cc690e: push   %eax
		  0x01cc690f: mov    %fs:0x0(,%eiz,1),%eax
		  0x01cc6917: mov    -0xc(%eax),%eax
		  0x01cc691a: cmp    %eax,%edi
		  0x01cc691c: je     0x01cc6933
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x01cc6922: push   $0x55312af0
		  0x01cc6927: call   0x01cc692c
		  0x01cc692c: pusha  
		  0x01cc692d: call   0x54dedbf0
		  0x01cc6932: hlt    
		  0x01cc6933: pop    %eax
		  0x01cc6934: movl   $0x0,0x13c(%edi)
		  0x01cc693e: movl   $0x0,0x144(%edi)
		  0x01cc6948: cmpl   $0x0,0x4(%edi)
		  0x01cc694f: jne    0x01cb0340
		  0x01cc6955: mov    -0x1c(%ebp),%esi
		  0x01cc6958: mov    -0x18(%ebp),%edi
		  0x01cc695b: ret    
	  //---end   call_VM InterpreterRuntime::monitorexit

	  0x01cc695c: mov    -0x1c(%ebp),%esi //restore_bcp
  //---end   InterpreterMacroAssembler::unlock_object

  0x01cc695f: pop    %eax // discard object

  0x01cc6960: movzbl 0x1(%esi),%ebx
  0x01cc6964: inc    %esi
  0x01cc6965: jmp    *0x55629838(,%ebx,4)
  0x01cc696c: int3   
  0x01cc696d: int3   
  0x01cc696e: int3   
  0x01cc696f: int3   

