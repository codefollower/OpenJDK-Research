dup  89 dup  [0x01cc02a0, 0x01cc02e0]  64 bytes

  0x01cc02a0: sub    $0x4,%esp
  0x01cc02a3: fstps  (%esp)
  0x01cc02a6: jmp    0x01cc02c4
  0x01cc02ab: sub    $0x8,%esp
  0x01cc02ae: fstpl  (%esp)
  0x01cc02b1: jmp    0x01cc02c4
  0x01cc02b6: push   %edx
  0x01cc02b7: push   %eax
  0x01cc02b8: jmp    0x01cc02c4
  0x01cc02bd: push   %eax
  0x01cc02be: jmp    0x01cc02c4
  0x01cc02c3: push   %eax

  0x01cc02c4: mov    (%esp),%eax
  0x01cc02c7: push   %eax
  0x01cc02c8: movzbl 0x1(%esi),%ebx
  0x01cc02cc: inc    %esi
  0x01cc02cd: jmp    *0x55629838(,%ebx,4)
  0x01cc02d4: int3   
  0x01cc02d5: int3   
  0x01cc02d6: int3   
  0x01cc02d7: int3   
  0x01cc02d8: int3   
  0x01cc02d9: int3   
  0x01cc02da: int3   
  0x01cc02db: int3   
  0x01cc02dc: int3   
  0x01cc02dd: int3   
  0x01cc02de: int3   
  0x01cc02df: int3   