iconst_0  3 iconst_0  [0x01cbe810, 0x01cbe850]  64 bytes

  0x01cbe810: sub    $0x4,%esp
  0x01cbe813: fstps  (%esp)
  0x01cbe816: jmp    0x01cbe834
  0x01cbe81b: sub    $0x8,%esp
  0x01cbe81e: fstpl  (%esp)
  0x01cbe821: jmp    0x01cbe834
  0x01cbe826: push   %edx
  0x01cbe827: push   %eax
  0x01cbe828: jmp    0x01cbe834
  0x01cbe82d: push   %eax
  0x01cbe82e: jmp    0x01cbe834
  0x01cbe833: push   %eax

  //直接跳到这里
  0x01cbe834: xor    %eax,%eax //把%eax清0，%eax做为源操作数，在其它bytecode中会直接用它
  0x01cbe836: movzbl 0x1(%esi),%ebx //下一条bytecode的值
  0x01cbe83a: inc    %esi
  0x01cbe83b: jmp    *0x55628438(,%ebx,4)

  0x01cbe842: nop    
  0x01cbe843: nop    
  0x01cbe844: int3   
  0x01cbe845: int3   
  0x01cbe846: int3   
  0x01cbe847: int3   
  0x01cbe848: int3   
  0x01cbe849: int3   
  0x01cbe84a: int3   
  0x01cbe84b: int3   
  0x01cbe84c: int3   
  0x01cbe84d: int3   
  0x01cbe84e: int3   
  0x01cbe84f: int3   