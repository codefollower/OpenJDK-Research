istore_1  60 istore_1  [0x01cbfbd0, 0x01cbfbe0]  16 bytes

  0x01cbfbd0: pop    %eax

  //直接跳到这里
  0x01cbfbd1: mov    %eax,-0x4(%edi)
  0x01cbfbd4: movzbl 0x1(%esi),%ebx
  0x01cbfbd8: inc    %esi
  0x01cbfbd9: jmp    *0x55629838(,%ebx,4)