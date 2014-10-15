----------------------------------------------------------------------
monitorexit  195 monitorexit  [0x07f26ed0, 0x07f271e0]  784 bytes

  0x07f26ed0: pop    %eax
  0x07f26ed1: cmp    (%eax),%eax
  0x07f26ed3: mov    -0x20(%ebp),%edx
  0x07f26ed6: lea    -0x20(%ebp),%ebx
  0x07f26ed9: jmp    0x07f26ee7
  0x07f26edb: cmp    0x4(%edx),%eax
  0x07f26ede: je     0x07f27048
  0x07f26ee4: add    $0x8,%edx
  0x07f26ee7: cmp    %ebx,%edx
  0x07f26ee9: jne    0x07f26edb
  //---begin MacroAssembler::call_VM InterpreterRuntime::throw_illegal_monitor_state_exception
	  0x07f26eeb: call   0x07f26ef5
	  0x07f26ef0: jmp    0x07f27037
	  0x07f26ef5: lea    0x4(%esp),%eax
	  0x07f26ef9: cmpl   $0x0,-0x8(%ebp)
	  0x07f26f00: je     0x07f26f17
	  0x07f26f06: push   $0x5847a9d4
	  0x07f26f0b: call   0x07f26f10
	  0x07f26f10: pusha  
	  0x07f26f11: call   0x57f3df50
	  0x07f26f16: hlt    
	  0x07f26f17: mov    %esi,-0x1c(%ebp)
	  0x07f26f1a: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26f22: mov    -0xc(%edi),%edi
	  0x07f26f25: push   %edi
	  0x07f26f26: mov    %ebp,0x144(%edi)
	  0x07f26f2c: mov    %eax,0x13c(%edi)
	  0x07f26f32: call   0x581bd710
	  0x07f26f37: add    $0x4,%esp
	  0x07f26f3a: push   %eax
	  0x07f26f3b: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f26f43: mov    -0xc(%eax),%eax
	  0x07f26f46: cmp    %eax,%edi
	  0x07f26f48: je     0x07f26f5f
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f26f4e: push   $0x5847d0e8
	  0x07f26f53: call   0x07f26f58
	  0x07f26f58: pusha  
	  0x07f26f59: call   0x57f3df50
	  0x07f26f5e: hlt    
	  0x07f26f5f: pop    %eax
	  0x07f26f60: movl   $0x0,0x13c(%edi)
	  0x07f26f6a: movl   $0x0,0x144(%edi)
	  0x07f26f74: mov    0x1c8(%edi),%edi
	  0x07f26f7a: test   $0x1,%edi
	  0x07f26f80: je     0x07f26fb7
	  0x07f26f86: test   $0x2,%edi
	  0x07f26f8c: jne    0x07f26fb7
	  0x07f26f92: cmpl   $0x0,-0x8(%ebp)
	  0x07f26f99: je     0x07f26fb0
	  0x07f26f9f: push   $0x5847a994
	  0x07f26fa4: call   0x07f26fa9
	  0x07f26fa9: pusha  
	  0x07f26faa: call   0x57f3df50
	  0x07f26faf: hlt    
	  0x07f26fb0: call   0x57f37180
	  0x07f26fb5: jmp    *%eax
	  0x07f26fb7: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26fbf: mov    -0xc(%edi),%edi
	  0x07f26fc2: mov    0x324(%edi),%edi
	  0x07f26fc8: test   %edi,%edi
	  0x07f26fca: je     0x07f27018
	  0x07f26fd0: mov    0x50(%edi),%edi
	  0x07f26fd3: cmp    $0x1,%edi
	  0x07f26fd6: jne    0x07f27018
	  0x07f26fdc: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26fe4: mov    -0xc(%edi),%edi
	  0x07f26fe7: mov    0x324(%edi),%edi
	  0x07f26fed: pushl  0x54(%edi)
	  0x07f26ff0: cmpl   $0x0,-0x8(%ebp)
	  0x07f26ff7: je     0x07f2700e
	  0x07f26ffd: push   $0x5847a994
	  0x07f27002: call   0x07f27007
	  0x07f27007: pusha  
	  0x07f27008: call   0x57f3df50
	  0x07f2700d: hlt    
	  0x07f2700e: call   0x57f37160
	  0x07f27013: add    $0x4,%esp
	  0x07f27016: jmp    *%eax
	  0x07f27018: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f27020: mov    -0xc(%edi),%edi
	  0x07f27023: cmpl   $0x0,0x4(%edi)
	  0x07f2702a: jne    0x07f00380
	  0x07f27030: mov    -0x1c(%ebp),%esi
	  0x07f27033: mov    -0x18(%ebp),%edi
	  0x07f27036: ret    
  //---end   MacroAssembler::call_VM InterpreterRuntime::throw_illegal_monitor_state_exception

  //stop("should not reach here")
  0x07f27037: push   $0x58467db8
  0x07f2703c: call   0x07f27041
  0x07f27041: pusha  
  0x07f27042: call   0x57f3df50
  0x07f27047: hlt    

  0x07f27048: push   %eax
  0x07f27049: mov    %esi,-0x1c(%ebp)
  0x07f2704c: lea    (%edx),%eax
  0x07f2704e: mov    0x4(%edx),%ecx
  0x07f27051: movl   $0x0,0x4(%edx)

  0x07f27058: mov    (%ecx),%ebx
  0x07f2705a: and    $0x7,%ebx
  0x07f2705d: cmp    $0x5,%ebx
  0x07f27060: je     0x07f271ca

  0x07f27066: mov    (%eax),%ebx
  0x07f27068: test   %ebx,%ebx
  0x07f2706a: je     0x07f271ca
  0x07f27070: lock cmpxchg %ebx,(%ecx)
  0x07f27074: je     0x07f271ca
  0x07f2707a: mov    %ecx,0x4(%edx)

  //---begin call_VM InterpreterRuntime::monitorexit
	  0x07f2707d: call   0x07f27087
	  0x07f27082: jmp    0x07f271ca
	  0x07f27087: push   %edx
	  0x07f27088: lea    0x8(%esp),%eax
	  0x07f2708c: cmpl   $0x0,-0x8(%ebp)
	  0x07f27093: je     0x07f270aa
	  0x07f27099: push   $0x5847a9d4
	  0x07f2709e: call   0x07f270a3
	  0x07f270a3: pusha  
	  0x07f270a4: call   0x57f3df50
	  0x07f270a9: hlt    
	  0x07f270aa: mov    %esi,-0x1c(%ebp)
	  0x07f270ad: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f270b5: mov    -0xc(%edi),%edi
	  0x07f270b8: push   %edi
	  0x07f270b9: mov    %ebp,0x144(%edi)
	  0x07f270bf: mov    %eax,0x13c(%edi)
	  0x07f270c5: call   0x581bd520
	  0x07f270ca: add    $0x8,%esp
	  0x07f270cd: push   %eax
	  0x07f270ce: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f270d6: mov    -0xc(%eax),%eax
	  0x07f270d9: cmp    %eax,%edi
	  0x07f270db: je     0x07f270f2
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f270e1: push   $0x5847d0e8
	  0x07f270e6: call   0x07f270eb
	  0x07f270eb: pusha  
	  0x07f270ec: call   0x57f3df50
	  0x07f270f1: hlt    
	  0x07f270f2: pop    %eax
	  0x07f270f3: movl   $0x0,0x13c(%edi)
	  0x07f270fd: movl   $0x0,0x144(%edi)
	  0x07f27107: mov    0x1c8(%edi),%edi
	  0x07f2710d: test   $0x1,%edi
	  0x07f27113: je     0x07f2714a
	  0x07f27119: test   $0x2,%edi
	  0x07f2711f: jne    0x07f2714a
	  0x07f27125: cmpl   $0x0,-0x8(%ebp)
	  0x07f2712c: je     0x07f27143
	  0x07f27132: push   $0x5847a994
	  0x07f27137: call   0x07f2713c
	  0x07f2713c: pusha  
	  0x07f2713d: call   0x57f3df50
	  0x07f27142: hlt    
	  0x07f27143: call   0x57f37180
	  0x07f27148: jmp    *%eax
	  0x07f2714a: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f27152: mov    -0xc(%edi),%edi
	  0x07f27155: mov    0x324(%edi),%edi
	  0x07f2715b: test   %edi,%edi
	  0x07f2715d: je     0x07f271ab
	  0x07f27163: mov    0x50(%edi),%edi
	  0x07f27166: cmp    $0x1,%edi
	  0x07f27169: jne    0x07f271ab
	  0x07f2716f: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f27177: mov    -0xc(%edi),%edi
	  0x07f2717a: mov    0x324(%edi),%edi
	  0x07f27180: pushl  0x54(%edi)
	  0x07f27183: cmpl   $0x0,-0x8(%ebp)
	  0x07f2718a: je     0x07f271a1
	  0x07f27190: push   $0x5847a994
	  0x07f27195: call   0x07f2719a
	  0x07f2719a: pusha  
	  0x07f2719b: call   0x57f3df50
	  0x07f271a0: hlt    
	  0x07f271a1: call   0x57f37160
	  0x07f271a6: add    $0x4,%esp
	  0x07f271a9: jmp    *%eax
	  0x07f271ab: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f271b3: mov    -0xc(%edi),%edi
	  0x07f271b6: cmpl   $0x0,0x4(%edi)
	  0x07f271bd: jne    0x07f00380
	  0x07f271c3: mov    -0x1c(%ebp),%esi
	  0x07f271c6: mov    -0x18(%ebp),%edi
	  0x07f271c9: ret
  //---end   call_VM InterpreterRuntime::monitorexit

  0x07f271ca: mov    -0x1c(%ebp),%esi
  0x07f271cd: pop    %eax
  0x07f271ce: movzbl 0x1(%esi),%ebx
  0x07f271d2: inc    %esi
  0x07f271d3: jmp    *0x587a74a8(,%ebx,4)
  0x07f271da: nop    
  0x07f271db: nop    
  0x07f271dc: int3   
  0x07f271dd: int3   
  0x07f271de: int3   
  0x07f271df: int3   
