putfield  181 putfield  [0x01cc5400, 0x01cc5620]  544 bytes

  0x01cc5400: sub    $0x4,%esp
  0x01cc5403: fstps  (%esp)
  0x01cc5406: jmp    0x01cc5424
  0x01cc540b: sub    $0x8,%esp
  0x01cc540e: fstpl  (%esp)
  0x01cc5411: jmp    0x01cc5424
  0x01cc5416: push   %edx
  0x01cc5417: push   %eax
  0x01cc5418: jmp    0x01cc5424
  0x01cc541d: push   %eax
  0x01cc541e: jmp    0x01cc5424
  0x01cc5423: push   %eax

  //---begin InterpreterMacroAssembler::get_cache_and_index_and_bytecode_at_bcp
  0x01cc5424: movzwl 0x1(%esi),%edx
  0x01cc5428: mov    -0x14(%ebp),%ecx
  0x01cc542b: shl    $0x2,%edx

  0x01cc542e: mov    0x8(%ecx,%edx,4),%ebx
  0x01cc5432: shr    $0x18,%ebx
  0x01cc5435: and    $0xff,%ebx
  //---end   InterpreterMacroAssembler::get_cache_and_index_and_bytecode_at_bcp

  0x01cc543b: cmp    $0xb5,%ebx
  0x01cc5441: je     0x01cc54f4

  0x01cc5447: mov    $0xb5,%ebx

  0x01cc544c: call   0x01cc5456
  0x01cc5451: jmp    0x01cc54ea
  0x01cc5456: push   %ebx
  0x01cc5457: lea    0x8(%esp),%eax
  0x01cc545b: cmpl   $0x0,-0x8(%ebp)
  0x01cc5462: je     0x01cc5479
  0x01cc5468: push   $0x55310188
  0x01cc546d: call   0x01cc5472
  0x01cc5472: pusha  
  0x01cc5473: call   0x54dedbf0
  0x01cc5478: hlt    
  0x01cc5479: mov    %esi,-0x1c(%ebp)
  0x01cc547c: mov    %fs:0x0(,%eiz,1),%edi
  0x01cc5484: mov    -0xc(%edi),%edi
  0x01cc5487: push   %edi
  0x01cc5488: mov    %ebp,0x144(%edi)
  0x01cc548e: mov    %eax,0x13c(%edi)
  0x01cc5494: call   0x5505a590
  0x01cc5499: add    $0x8,%esp
  0x01cc549c: push   %eax
  0x01cc549d: mov    %fs:0x0(,%eiz,1),%eax
  0x01cc54a5: mov    -0xc(%eax),%eax
  0x01cc54a8: cmp    %eax,%edi
  0x01cc54aa: je     0x01cc54c1
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x01cc54b0: push   $0x55312af0
  0x01cc54b5: call   0x01cc54ba
  0x01cc54ba: pusha  
  0x01cc54bb: call   0x54dedbf0
  0x01cc54c0: hlt    
  0x01cc54c1: pop    %eax
  0x01cc54c2: movl   $0x0,0x13c(%edi)
  0x01cc54cc: movl   $0x0,0x144(%edi)
  0x01cc54d6: cmpl   $0x0,0x4(%edi)
  0x01cc54dd: jne    0x01cb0340
  0x01cc54e3: mov    -0x1c(%ebp),%esi
  0x01cc54e6: mov    -0x18(%ebp),%edi
  0x01cc54e9: ret    

  0x01cc54ea: movzwl 0x1(%esi),%edx
  0x01cc54ee: mov    -0x14(%ebp),%ecx
  0x01cc54f1: shl    $0x2,%edx

  //如果通过JVMTI启用了字段访问就会多加下面这一段汇编，这里没有显示出来
  //---begin jvmti_post_field_mod(cache, index, is_static);
  //......
  //---end   jvmti_post_field_mod(cache, index, is_static);

  0x01cc54f4: mov    0x10(%ecx,%edx,4),%ebx // Field offset
  0x01cc54f8: mov    0x14(%ecx,%edx,4),%eax // Flags

  0x01cc54fc: mov    %eax,%edx
  0x01cc54fe: shr    $0x15,%edx
  0x01cc5501: and    $0x1,%edx //field is volatile

  0x01cc5504: shr    $0x1c,%eax //tos
  0x01cc5507: and    $0xf,%eax
  0x01cc550a: jne    0x01cc551c

  // btos
  0x01cc5510: pop    %eax //操作数
  
  //pop_and_check_object
  0x01cc5511: pop    %ecx
  0x01cc5512: cmp    (%ecx),%eax //null_check，%ecx为0时，就会出错

  0x01cc5514: mov    %al,(%ecx,%ebx,1)
  0x01cc5517: jmp    0x01cc55fe
  0x01cc551c: cmp    $0x3,%eax
  0x01cc551f: jne    0x01cc5531

  // itos
  0x01cc5525: pop    %eax
  0x01cc5526: pop    %ecx
  0x01cc5527: cmp    (%ecx),%eax
  0x01cc5529: mov    %eax,(%ecx,%ebx,1)
  0x01cc552c: jmp    0x01cc55fe
  0x01cc5531: cmp    $0x7,%eax
  0x01cc5534: jne    0x01cc5551

  // atos
  0x01cc553a: pop    %eax
  0x01cc553b: pop    %ecx
  0x01cc553c: cmp    (%ecx),%eax
  0x01cc553e: mov    %eax,(%ecx,%ebx,1)
  0x01cc5541: shr    $0x9,%ecx
  0x01cc5544: movb   $0x0,0x12c7000(,%ecx,1)
  0x01cc554c: jmp    0x01cc55fe
  0x01cc5551: cmp    $0x1,%eax
  0x01cc5554: jne    0x01cc5567

  // ctos
  0x01cc555a: pop    %eax
  0x01cc555b: pop    %ecx
  0x01cc555c: cmp    (%ecx),%eax
  0x01cc555e: mov    %ax,(%ecx,%ebx,1)
  0x01cc5562: jmp    0x01cc55fe
  0x01cc5567: cmp    $0x2,%eax
  0x01cc556a: jne    0x01cc557d

  // stos
  0x01cc5570: pop    %eax
  0x01cc5571: pop    %ecx
  0x01cc5572: cmp    (%ecx),%eax
  0x01cc5574: mov    %ax,(%ecx,%ebx,1)
  0x01cc5578: jmp    0x01cc55fe
  0x01cc557d: cmp    $0x4,%eax
  0x01cc5580: jne    0x01cc55b9

  // ltos
  0x01cc5586: test   %edx,%edx
  0x01cc5588: je     0x01cc55a8
  0x01cc558e: pop    %eax
  0x01cc558f: pop    %edx
  0x01cc5590: pop    %ecx
  0x01cc5591: cmp    (%ecx),%eax
  0x01cc5593: push   %edx
  0x01cc5594: push   %eax

  0x01cc5595: fildll (%esp)
  0x01cc5598: fistpll (%ecx,%ebx,1)
  0x01cc559b: add    $0x8,%esp

  0x01cc559e: lock addl $0x0,(%esp) //TemplateTable::volatile_barrier
  0x01cc55a3: jmp    0x01cc560b
  0x01cc55a8: pop    %eax
  0x01cc55a9: pop    %edx
  0x01cc55aa: pop    %ecx
  0x01cc55ab: cmp    (%ecx),%eax
  0x01cc55ad: mov    %edx,0x4(%ecx,%ebx,1)
  0x01cc55b1: mov    %eax,(%ecx,%ebx,1)
  0x01cc55b4: jmp    0x01cc560b
  0x01cc55b9: cmp    $0x5,%eax
  0x01cc55bc: jne    0x01cc55d3

  // ftos
  //下面两条在InterpreterMacroAssembler::pop_f()中
  0x01cc55c2: flds   (%esp)
  0x01cc55c5: add    $0x4,%esp

  0x01cc55c8: pop    %ecx
  0x01cc55c9: cmp    (%ecx),%eax

  0x01cc55cb: fstps  (%ecx,%ebx,1)
  0x01cc55ce: jmp    0x01cc55fe
  0x01cc55d3: cmp    $0x6,%eax
  0x01cc55d6: jne    0x01cc55ed

  // dtos
  0x01cc55dc: fldl   (%esp)
  0x01cc55df: add    $0x8,%esp
  0x01cc55e2: pop    %ecx
  0x01cc55e3: cmp    (%ecx),%eax
  0x01cc55e5: fstpl  (%ecx,%ebx,1)
  0x01cc55e8: jmp    0x01cc55fe

  //stop("Bad state");
  0x01cc55ed: push   $0x5531a870
  0x01cc55f2: call   0x01cc55f7
  0x01cc55f7: pusha  
  0x01cc55f8: call   0x54dedbf0
  0x01cc55fd: hlt    

  0x01cc55fe: test   %edx,%edx
  0x01cc5600: je     0x01cc560b

  0x01cc5606: lock addl $0x0,(%esp) //volatile_barrier

  0x01cc560b: movzbl 0x3(%esi),%ebx
  0x01cc560f: add    $0x3,%esi
  0x01cc5612: jmp    *0x55629838(,%ebx,4)
  0x01cc5619: nop    
  0x01cc561a: nop    
  0x01cc561b: nop    
  0x01cc561c: int3   
  0x01cc561d: int3   
  0x01cc561e: int3   
  0x01cc561f: int3   
