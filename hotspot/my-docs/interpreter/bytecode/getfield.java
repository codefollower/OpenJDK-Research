getfield  180 getfield  [0x01cc5220, 0x01cc53f0]  464 bytes

  0x01cc5220: sub    $0x4,%esp
  0x01cc5223: fstps  (%esp)
  0x01cc5226: jmp    0x01cc5244
  0x01cc522b: sub    $0x8,%esp
  0x01cc522e: fstpl  (%esp)
  0x01cc5231: jmp    0x01cc5244
  0x01cc5236: push   %edx
  0x01cc5237: push   %eax
  0x01cc5238: jmp    0x01cc5244
  0x01cc523d: push   %eax
  0x01cc523e: jmp    0x01cc5244
  0x01cc5243: push   %eax

  0x01cc5244: movzwl 0x1(%esi),%edx
  0x01cc5248: mov    -0x14(%ebp),%ecx
  0x01cc524b: shl    $0x2,%edx

  0x01cc524e: mov    0x8(%ecx,%edx,4),%ebx
  0x01cc5252: shr    $0x10,%ebx
  0x01cc5255: and    $0xff,%ebx

  0x01cc525b: cmp    $0xb4,%ebx
  0x01cc5261: je     0x01cc5314
  0x01cc5267: mov    $0xb4,%ebx

  0x01cc526c: call   0x01cc5276
  0x01cc5271: jmp    0x01cc530a
  0x01cc5276: push   %ebx
  0x01cc5277: lea    0x8(%esp),%eax
  0x01cc527b: cmpl   $0x0,-0x8(%ebp)
  0x01cc5282: je     0x01cc5299
  0x01cc5288: push   $0x55310188
  0x01cc528d: call   0x01cc5292
  0x01cc5292: pusha  
  0x01cc5293: call   0x54dedbf0
  0x01cc5298: hlt    
  0x01cc5299: mov    %esi,-0x1c(%ebp)
  0x01cc529c: mov    %fs:0x0(,%eiz,1),%edi
  0x01cc52a4: mov    -0xc(%edi),%edi
  0x01cc52a7: push   %edi
  0x01cc52a8: mov    %ebp,0x144(%edi)
  0x01cc52ae: mov    %eax,0x13c(%edi)
  0x01cc52b4: call   0x5505a590
  0x01cc52b9: add    $0x8,%esp
  0x01cc52bc: push   %eax
  0x01cc52bd: mov    %fs:0x0(,%eiz,1),%eax
  0x01cc52c5: mov    -0xc(%eax),%eax
  0x01cc52c8: cmp    %eax,%edi
  0x01cc52ca: je     0x01cc52e1
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x01cc52d0: push   $0x55312af0
  0x01cc52d5: call   0x01cc52da
  0x01cc52da: pusha  
  0x01cc52db: call   0x54dedbf0
  0x01cc52e0: hlt    
  0x01cc52e1: pop    %eax
  0x01cc52e2: movl   $0x0,0x13c(%edi)
  0x01cc52ec: movl   $0x0,0x144(%edi)
  0x01cc52f6: cmpl   $0x0,0x4(%edi)
  0x01cc52fd: jne    0x01cb0340
  0x01cc5303: mov    -0x1c(%ebp),%esi
  0x01cc5306: mov    -0x18(%ebp),%edi
  0x01cc5309: ret    

  0x01cc530a: movzwl 0x1(%esi),%edx
  0x01cc530e: mov    -0x14(%ebp),%ecx
  0x01cc5311: shl    $0x2,%edx

  //---begin TemplateTable::load_field_cp_cache_entry
  0x01cc5314: mov    0x10(%ecx,%edx,4),%ebx
  0x01cc5318: mov    0x14(%ecx,%edx,4),%eax
  //---end   TemplateTable::load_field_cp_cache_entry

  //pop_and_check_object
  0x01cc531c: pop    %ecx
  0x01cc531d: cmp    (%ecx),%eax

  0x01cc531f: shr    $0x1c,%eax

  // btos
  0x01cc5322: and    $0xf,%eax
  0x01cc5325: jne    0x01cc5335
  0x01cc532b: movsbl (%ecx,%ebx,1),%eax
  0x01cc532f: push   %eax
  0x01cc5330: jmp    0x01cc53d6
  
  // itos
  0x01cc5335: cmp    $0x3,%eax
  0x01cc5338: jne    0x01cc5347
  0x01cc533e: mov    (%ecx,%ebx,1),%eax
  0x01cc5341: push   %eax
  0x01cc5342: jmp    0x01cc53d6

  // atos
  0x01cc5347: cmp    $0x7,%eax
  0x01cc534a: jne    0x01cc5359
  0x01cc5350: mov    (%ecx,%ebx,1),%eax
  0x01cc5353: push   %eax
  0x01cc5354: jmp    0x01cc53d6
  
  // ctos
  0x01cc5359: cmp    $0x1,%eax
  0x01cc535c: jne    0x01cc536c
  0x01cc5362: movzwl (%ecx,%ebx,1),%eax
  0x01cc5366: push   %eax
  0x01cc5367: jmp    0x01cc53d6
  
  // stos
  0x01cc536c: cmp    $0x2,%eax
  0x01cc536f: jne    0x01cc537f
  0x01cc5375: movswl (%ecx,%ebx,1),%eax
  0x01cc5379: push   %eax
  0x01cc537a: jmp    0x01cc53d6
  
  // ltos
  0x01cc537f: cmp    $0x4,%eax
  0x01cc5382: jne    0x01cc539a
  0x01cc5388: fildll (%ecx,%ebx,1)
  0x01cc538b: sub    $0x8,%esp
  0x01cc538e: fistpll (%esp)
  0x01cc5391: pop    %eax
  0x01cc5392: pop    %edx
  0x01cc5393: push   %edx
  0x01cc5394: push   %eax
  0x01cc5395: jmp    0x01cc53d6

  // ftos
  0x01cc539a: cmp    $0x5,%eax
  0x01cc539d: jne    0x01cc53b1
  0x01cc53a3: flds   (%ecx,%ebx,1)
  0x01cc53a6: sub    $0x4,%esp
  0x01cc53a9: fstps  (%esp)
  0x01cc53ac: jmp    0x01cc53d6

  // dtos
  0x01cc53b1: cmp    $0x6,%eax
  0x01cc53b4: jne    0x01cc53c5
  0x01cc53ba: fldl   (%ecx,%ebx,1)
  0x01cc53bd: sub    $0x8,%esp
  0x01cc53c0: fstpl  (%esp)
  0x01cc53c3: jmp    0x01cc53d6

  //stop("Bad state");
  0x01cc53c5: push   $0x5531a644
  0x01cc53ca: call   0x01cc53cf
  0x01cc53cf: pusha  
  0x01cc53d0: call   0x54dedbf0
  0x01cc53d5: hlt    

  0x01cc53d6: movzbl 0x3(%esi),%ebx
  0x01cc53da: add    $0x3,%esi
  0x01cc53dd: jmp    *0x55629838(,%ebx,4)
  0x01cc53e4: int3   
  0x01cc53e5: int3   
  0x01cc53e6: int3   
  0x01cc53e7: int3   
  0x01cc53e8: int3   
  0x01cc53e9: int3   
  0x01cc53ea: int3   
  0x01cc53eb: int3   
  0x01cc53ec: int3   
  0x01cc53ed: int3   
  0x01cc53ee: int3   
  0x01cc53ef: int3   

