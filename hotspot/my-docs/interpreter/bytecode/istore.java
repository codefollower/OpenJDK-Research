istore  54 istore  [0x01cbfa00, 0x01cbfa40]  64 bytes

  0x01cbfa00: pop    %eax

  0x01cbfa01: movzbl 0x1(%esi),%ebx
  0x01cbfa05: neg    %ebx
  0x01cbfa07: mov    %eax,(%edi,%ebx,4)
  0x01cbfa0a: movzbl 0x2(%esi),%ebx
  0x01cbfa0e: add    $0x2,%esi
  0x01cbfa11: jmp    *0x55629838(,%ebx,4)
  0x01cbfa18: pop    %eax
  0x01cbfa19: movzwl 0x2(%esi),%ebx
  0x01cbfa1d: bswap  %ebx
  0x01cbfa1f: shr    $0x10,%ebx
  0x01cbfa22: neg    %ebx
  0x01cbfa24: mov    %eax,(%edi,%ebx,4)
  0x01cbfa27: movzbl 0x4(%esi),%ebx
  0x01cbfa2b: add    $0x4,%esi
  0x01cbfa2e: jmp    *0x55629838(,%ebx,4)
  0x01cbfa35: nop    
  0x01cbfa36: nop    
  0x01cbfa37: nop    
  0x01cbfa38: int3   
  0x01cbfa39: int3   
  0x01cbfa3a: int3   
  0x01cbfa3b: int3   
  0x01cbfa3c: int3   
  0x01cbfa3d: int3   
  0x01cbfa3e: int3   
  0x01cbfa3f: int3 