invokespecial  183 invokespecial  [0x01cc57a0, 0x01cc58e0]  320 bytes

  0x01cc57a0: sub    $0x4,%esp
  0x01cc57a3: fstps  (%esp)
  0x01cc57a6: jmp    0x01cc57c4
  0x01cc57ab: sub    $0x8,%esp
  0x01cc57ae: fstpl  (%esp)
  0x01cc57b1: jmp    0x01cc57c4
  0x01cc57b6: push   %edx
  0x01cc57b7: push   %eax
  0x01cc57b8: jmp    0x01cc57c4
  0x01cc57bd: push   %eax
  0x01cc57be: jmp    0x01cc57c4
  0x01cc57c3: push   %eax

  0x01cc57c4: mov    %esi,-0x1c(%ebp)
  0x01cc57c7: movzwl 0x1(%esi),%edx
  0x01cc57cb: mov    -0x14(%ebp),%ecx
  0x01cc57ce: shl    $0x2,%edx
  0x01cc57d1: mov    0x8(%ecx,%edx,4),%ebx
  0x01cc57d5: shr    $0x10,%ebx //取ConstantPoolCacheEntry._indices字段中的index
  0x01cc57d8: and    $0xff,%ebx

  0x01cc57de: cmp    $0xb7,%ebx
  0x01cc57e4: je     0x01cc5897

  0x01cc57ea: mov    $0xb7,%ebx

  0x01cc57ef: call   0x01cc57f9
  0x01cc57f4: jmp    0x01cc588d
  0x01cc57f9: push   %ebx
  0x01cc57fa: lea    0x8(%esp),%eax
  0x01cc57fe: cmpl   $0x0,-0x8(%ebp)
  0x01cc5805: je     0x01cc581c
  0x01cc580b: push   $0x55310188
  0x01cc5810: call   0x01cc5815
  0x01cc5815: pusha  
  0x01cc5816: call   0x54dedbf0
  0x01cc581b: hlt    
  0x01cc581c: mov    %esi,-0x1c(%ebp)
  0x01cc581f: mov    %fs:0x0(,%eiz,1),%edi
  0x01cc5827: mov    -0xc(%edi),%edi
  0x01cc582a: push   %edi
  0x01cc582b: mov    %ebp,0x144(%edi)
  0x01cc5831: mov    %eax,0x13c(%edi)
  0x01cc5837: call   0x5505b0b0
  0x01cc583c: add    $0x8,%esp
  0x01cc583f: push   %eax
  0x01cc5840: mov    %fs:0x0(,%eiz,1),%eax
  0x01cc5848: mov    -0xc(%eax),%eax
  0x01cc584b: cmp    %eax,%edi
  0x01cc584d: je     0x01cc5864
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x01cc5853: push   $0x55312af0
  0x01cc5858: call   0x01cc585d
  0x01cc585d: pusha  
  0x01cc585e: call   0x54dedbf0
  0x01cc5863: hlt    
  0x01cc5864: pop    %eax
  0x01cc5865: movl   $0x0,0x13c(%edi)
  0x01cc586f: movl   $0x0,0x144(%edi)
  0x01cc5879: cmpl   $0x0,0x4(%edi)
  0x01cc5880: jne    0x01cb0340
  0x01cc5886: mov    -0x1c(%ebp),%esi
  0x01cc5889: mov    -0x18(%ebp),%edi
  0x01cc588c: ret    

  0x01cc588d: movzwl 0x1(%esi),%edx
  0x01cc5891: mov    -0x14(%ebp),%ecx
  0x01cc5894: shl    $0x2,%edx

  0x01cc5897: mov    0xc(%ecx,%edx,4),%ebx
  0x01cc589b: mov    0x14(%ecx,%edx,4),%edx
  0x01cc589f: mov    %edx,%ecx
  0x01cc58a1: and    $0xff,%ecx
  0x01cc58a7: mov    -0x4(%esp,%ecx,4),%ecx //this指针存放在堆栈的位置，总是这第一个参数
  0x01cc58ab: shr    $0x1c,%edx
  0x01cc58ae: mov    0x556277cc(,%edx,4),%edx
  0x01cc58b5: push   %edx

  //最初%eax的值是this指针，但是在TemplateTable::invokespecial的prepare_invoke中改变了eax的值
  //这应该是个bug，不过并不影响正确性
  0x01cc58b6: cmp    (%ecx),%eax //__ null_check(rcx);

  0x01cc58b8: lea    0x4(%esp),%esi
  0x01cc58bc: mov    %esi,-0x8(%ebp)
  0x01cc58bf: jmp    *0x34(%ebx)
  0x01cc58c2: push   $0x552fd97c
  0x01cc58c7: call   0x01cc58cc
  0x01cc58cc: pusha  
  0x01cc58cd: call   0x54dedbf0
  0x01cc58d2: hlt    
  0x01cc58d3: nop    
  0x01cc58d4: int3   
  0x01cc58d5: int3   
  0x01cc58d6: int3   
  0x01cc58d7: int3   
  0x01cc58d8: int3   
  0x01cc58d9: int3   
  0x01cc58da: int3   
  0x01cc58db: int3   
  0x01cc58dc: int3   
  0x01cc58dd: int3   
  0x01cc58de: int3   
  0x01cc58df: int3   
