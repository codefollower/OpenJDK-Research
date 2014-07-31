astore_1  76 astore_1  [0x01cbfec0, 0x01cbff00]  64 bytes

  0x01cbfec0: sub    $0x4,%esp
  0x01cbfec3: fstps  (%esp)
  0x01cbfec6: jmp    0x01cbfee4
  0x01cbfecb: sub    $0x8,%esp
  0x01cbfece: fstpl  (%esp)
  0x01cbfed1: jmp    0x01cbfee4
  0x01cbfed6: push   %edx
  0x01cbfed7: push   %eax
  0x01cbfed8: jmp    0x01cbfee4
  0x01cbfedd: push   %eax
  0x01cbfede: jmp    0x01cbfee4
  0x01cbfee3: push   %eax

  0x01cbfee4: pop    %eax
  0x01cbfee5: mov    %eax,-0x4(%edi)
  0x01cbfee8: movzbl 0x1(%esi),%ebx
  0x01cbfeec: inc    %esi
  0x01cbfeed: jmp    *0x55629838(,%ebx,4)
  0x01cbfef4: int3   
  0x01cbfef5: int3   
  0x01cbfef6: int3   
  0x01cbfef7: int3   
  0x01cbfef8: int3   
  0x01cbfef9: int3   
  0x01cbfefa: int3   
  0x01cbfefb: int3   
  0x01cbfefc: int3   
  0x01cbfefd: int3   
  0x01cbfefe: int3   
  0x01cbfeff: int3   
