----------------------------------------------------------------------
monitorenter  194 monitorenter  [0x07f26c30, 0x07f26eb0]  640 bytes

  0x07f26c30: pop    %eax
  0x07f26c31: cmp    (%eax),%eax
  0x07f26c33: xor    %edx,%edx
  0x07f26c35: mov    -0x20(%ebp),%ecx
  0x07f26c38: lea    -0x20(%ebp),%ebx
  0x07f26c3b: jmp    0x07f26c4f
  0x07f26c3d: cmpl   $0x0,0x4(%ecx)
  0x07f26c44: cmove  %ecx,%edx
  0x07f26c47: cmp    0x4(%ecx),%eax
  0x07f26c4a: je     0x07f26c53
  0x07f26c4c: add    $0x8,%ecx
  0x07f26c4f: cmp    %ebx,%ecx
  0x07f26c51: jne    0x07f26c3d
  0x07f26c53: test   %edx,%edx
  0x07f26c55: jne    0x07f26c76
  0x07f26c57: mov    -0x20(%ebp),%edx
  0x07f26c5a: sub    $0x8,%esp
  0x07f26c5d: sub    $0x8,%edx
  0x07f26c60: mov    %esp,%ecx
  0x07f26c62: mov    %edx,-0x20(%ebp)
  0x07f26c65: jmp    0x07f26c72
  0x07f26c6a: mov    0x8(%ecx),%ebx
  0x07f26c6d: mov    %ebx,(%ecx)
  0x07f26c6f: add    $0x4,%ecx
  0x07f26c72: cmp    %edx,%ecx
  0x07f26c74: jne    0x07f26c6a
  0x07f26c76: inc    %esi
  0x07f26c77: mov    %eax,0x4(%edx)

  0x07f26c7a: mov    0x4(%edx),%ecx
  //---begin MacroAssembler::biased_locking_enter
	  0x07f26c7d: mov    (%ecx),%eax
	  0x07f26c7f: push   %edx
	  0x07f26c80: mov    %eax,%edx
	  0x07f26c82: and    $0x7,%edx
	  0x07f26c85: cmp    $0x5,%edx
	  0x07f26c88: pop    %edx
	  0x07f26c89: jne    0x07f26d19 //后三位只要不是101就跳到CAS-based locking scheme

	  0x07f26c8f: mov    %eax,(%edx)
	  0x07f26c91: push   %edx
	  0x07f26c92: mov    0x4(%ecx),%edx
	  0x07f26c95: mov    0x68(%edx),%edx //Klass::prototype_header，也是一个markOop
	  0x07f26c98: xor    %eax,%edx
	  0x07f26c9a: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f26ca2: mov    -0xc(%eax),%eax
	  0x07f26ca5: xor    %edx,%eax
	  0x07f26ca7: and    $0xffffff87,%eax //屏蔽掉markOop中的age字段
	  0x07f26caa: pop    %edx
	  0x07f26cab: je     0x07f26e89 //退出锁，此时说明当前线程在重入

	  0x07f26cb1: test   $0x7,%eax
	  0x07f26cb6: jne    0x07f26d0b  //后三位只要有一位不为0则跳转
	  0x07f26cb8: test   $0x180,%eax //第7、8位只要有一位不为0则跳转，正好对应epoch
	  0x07f26cbd: jne    0x07f26ce5

	  0x07f26cbf: mov    (%edx),%eax
	  //$0x1ff对应:
	  //markOopDesc::biased_lock_mask_in_place | markOopDesc::age_mask_in_place | markOopDesc::epoch_mask_in_place
	  0x07f26cc1: and    $0x1ff,%eax
	  0x07f26cc7: push   %edx
	  0x07f26cc8: mov    %fs:0x0(,%eiz,1),%edx
	  0x07f26cd0: mov    -0xc(%edx),%edx
	  0x07f26cd3: or     %eax,%edx
	  0x07f26cd5: lock cmpxchg %edx,(%ecx)
	  0x07f26cd9: pop    %edx
	  0x07f26cda: jne    0x07f26d3c //InterpreterRuntime::monitorenter
	  0x07f26ce0: jmp    0x07f26e89 //退出锁，此时说明当前线程是第一个线程

      //try_rebias
	  0x07f26ce5: push   %edx
	  0x07f26ce6: mov    0x4(%ecx),%edx
	  0x07f26ce9: mov    0x68(%edx),%edx
	  0x07f26cec: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f26cf4: mov    -0xc(%eax),%eax
	  0x07f26cf7: or     %eax,%edx
	  0x07f26cf9: mov    (%edx),%eax
	  0x07f26cfb: lock cmpxchg %edx,(%ecx)
	  0x07f26cff: pop    %edx
	  0x07f26d00: jne    0x07f26d3c //cmpxchg失败了，跳到InterpreterRuntime::monitorenter
	  0x07f26d06: jmp    0x07f26e89 //cmpxchg成功了，退出锁
      
	  //try_revoke_bias
	  0x07f26d0b: mov    (%edx),%eax
	  0x07f26d0d: push   %edx
	  0x07f26d0e: mov    0x4(%ecx),%edx
	  0x07f26d11: mov    0x68(%edx),%edx
	  0x07f26d14: lock cmpxchg %edx,(%ecx)
	  0x07f26d18: pop    %edx
  //---end   MacroAssembler::biased_locking_enter

  //CAS-based locking scheme
  0x07f26d19: mov    $0x1,%eax
  0x07f26d1e: or     (%ecx),%eax
  0x07f26d20: mov    %eax,(%edx)
  0x07f26d22: lock cmpxchg %edx,(%ecx)
  0x07f26d26: je     0x07f26e89 //退出锁
  0x07f26d2c: sub    %esp,%eax
  0x07f26d2e: and    $0xfffff003,%eax
  0x07f26d34: mov    %eax,(%edx)
  0x07f26d36: je     0x07f26e89 //退出锁

  //---begin MacroAssembler::call_VM InterpreterRuntime::monitorenter
	  0x07f26d3c: call   0x07f26d46
	  0x07f26d41: jmp    0x07f26e89
	  0x07f26d46: push   %edx
	  0x07f26d47: lea    0x8(%esp),%eax
	  0x07f26d4b: cmpl   $0x0,-0x8(%ebp)
	  0x07f26d52: je     0x07f26d69
	  0x07f26d58: push   $0x5847a9d4
	  0x07f26d5d: call   0x07f26d62
	  0x07f26d62: pusha  
	  0x07f26d63: call   0x57f3df50
	  0x07f26d68: hlt    
	  0x07f26d69: mov    %esi,-0x1c(%ebp)
	  0x07f26d6c: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26d74: mov    -0xc(%edi),%edi
	  0x07f26d77: push   %edi
	  0x07f26d78: mov    %ebp,0x144(%edi)
	  0x07f26d7e: mov    %eax,0x13c(%edi)
	  0x07f26d84: call   0x581bd2a0
	  0x07f26d89: add    $0x8,%esp
	  0x07f26d8c: push   %eax
	  0x07f26d8d: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f26d95: mov    -0xc(%eax),%eax
	  0x07f26d98: cmp    %eax,%edi
	  0x07f26d9a: je     0x07f26db1
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f26da0: push   $0x5847d0e8
	  0x07f26da5: call   0x07f26daa
	  0x07f26daa: pusha  
	  0x07f26dab: call   0x57f3df50
	  0x07f26db0: hlt    
	  0x07f26db1: pop    %eax
	  0x07f26db2: movl   $0x0,0x13c(%edi)
	  0x07f26dbc: movl   $0x0,0x144(%edi)
	  0x07f26dc6: mov    0x1c8(%edi),%edi
	  0x07f26dcc: test   $0x1,%edi
	  0x07f26dd2: je     0x07f26e09
	  0x07f26dd8: test   $0x2,%edi
	  0x07f26dde: jne    0x07f26e09
	  0x07f26de4: cmpl   $0x0,-0x8(%ebp)
	  0x07f26deb: je     0x07f26e02
	  0x07f26df1: push   $0x5847a994
	  0x07f26df6: call   0x07f26dfb
	  0x07f26dfb: pusha  
	  0x07f26dfc: call   0x57f3df50
	  0x07f26e01: hlt    
	  0x07f26e02: call   0x57f37180
	  0x07f26e07: jmp    *%eax
	  0x07f26e09: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26e11: mov    -0xc(%edi),%edi
	  0x07f26e14: mov    0x324(%edi),%edi
	  0x07f26e1a: test   %edi,%edi
	  0x07f26e1c: je     0x07f26e6a
	  0x07f26e22: mov    0x50(%edi),%edi
	  0x07f26e25: cmp    $0x1,%edi
	  0x07f26e28: jne    0x07f26e6a
	  0x07f26e2e: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26e36: mov    -0xc(%edi),%edi
	  0x07f26e39: mov    0x324(%edi),%edi
	  0x07f26e3f: pushl  0x54(%edi)
	  0x07f26e42: cmpl   $0x0,-0x8(%ebp)
	  0x07f26e49: je     0x07f26e60
	  0x07f26e4f: push   $0x5847a994
	  0x07f26e54: call   0x07f26e59
	  0x07f26e59: pusha  
	  0x07f26e5a: call   0x57f3df50
	  0x07f26e5f: hlt    
	  0x07f26e60: call   0x57f37160
	  0x07f26e65: add    $0x4,%esp
	  0x07f26e68: jmp    *%eax
	  0x07f26e6a: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f26e72: mov    -0xc(%edi),%edi
	  0x07f26e75: cmpl   $0x0,0x4(%edi)
	  0x07f26e7c: jne    0x07f00380
	  0x07f26e82: mov    -0x1c(%ebp),%esi
	  0x07f26e85: mov    -0x18(%ebp),%edi
	  0x07f26e88: ret
  //---end   MacroAssembler::call_VM InterpreterRuntime::monitorenter

  0x07f26e89: mov    %esi,-0x1c(%ebp)
  0x07f26e8c: mov    %eax,-0x9000(%esp)

  0x07f26e93: movzbl (%esi),%ebx
  0x07f26e96: jmp    *0x587a74a8(,%ebx,4)
  0x07f26e9d: push   $0x58467db8
  0x07f26ea2: call   0x07f26ea7
  0x07f26ea7: pusha  
  0x07f26ea8: call   0x57f3df50
  0x07f26ead: hlt    
  0x07f26eae: nop    
  0x07f26eaf: nop    
