bipush  16 bipush  [0x01cbec20, 0x01cbec60]  64 bytes

  0x01cbec20: sub    $0x4,%esp
  0x01cbec23: fstps  (%esp)
  0x01cbec26: jmp    0x01cbec44
  0x01cbec2b: sub    $0x8,%esp
  0x01cbec2e: fstpl  (%esp)
  0x01cbec31: jmp    0x01cbec44
  0x01cbec36: push   %edx
  0x01cbec37: push   %eax
  0x01cbec38: jmp    0x01cbec44
  0x01cbec3d: push   %eax
  0x01cbec3e: jmp    0x01cbec44
  0x01cbec43: push   %eax

  0x01cbec44: movsbl 0x1(%esi),%eax //规范中的描述是: The immediate byte is sign-extended to an int value.

  //先获得下一条字节码的值，
  //然后更新esi指向一条字节码的内存地址，
  //然后跳到下一条字节码对应的汇编代码处
  //每条字节码大多数都有下面这三条汇编
  0x01cbec48: movzbl 0x2(%esi),%ebx
  0x01cbec4c: add    $0x2,%esi
  0x01cbec4f: jmp    *0x55628438(,%ebx,4)

  0x01cbec56: nop    
  0x01cbec57: nop    
  0x01cbec58: int3   
  0x01cbec59: int3   
  0x01cbec5a: int3   
  0x01cbec5b: int3   
  0x01cbec5c: int3   
  0x01cbec5d: int3   
  0x01cbec5e: int3   
  0x01cbec5f: int3   
