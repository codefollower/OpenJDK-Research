getstatic  178 getstatic  [0x01cc4e20, 0x01cc4ff0]  464 bytes

  0x01cc4e20: sub    $0x4,%esp
  0x01cc4e23: fstps  (%esp)
  0x01cc4e26: jmp    0x01cc4e44
  0x01cc4e2b: sub    $0x8,%esp
  0x01cc4e2e: fstpl  (%esp)
  0x01cc4e31: jmp    0x01cc4e44
  0x01cc4e36: push   %edx
  0x01cc4e37: push   %eax
  0x01cc4e38: jmp    0x01cc4e44
  0x01cc4e3d: push   %eax
  0x01cc4e3e: jmp    0x01cc4e44
  0x01cc4e43: push   %eax

  0x01cc4e44: movzwl 0x1(%esi),%edx
  0x01cc4e48: mov    -0x14(%ebp),%ecx
  0x01cc4e4b: shl    $0x2,%edx

  0x01cc4e4e: mov    0x8(%ecx,%edx,4),%ebx
  0x01cc4e52: shr    $0x10,%ebx
  0x01cc4e55: and    $0xff,%ebx

  0x01cc4e5b: cmp    $0xb2,%ebx
  0x01cc4e61: je     0x01cc4f14
  0x01cc4e67: mov    $0xb2,%ebx

  0x01cc4e6c: call   0x01cc4e76
  0x01cc4e71: jmp    0x01cc4f0a
  0x01cc4e76: push   %ebx
  0x01cc4e77: lea    0x8(%esp),%eax
  0x01cc4e7b: cmpl   $0x0,-0x8(%ebp)
  0x01cc4e82: je     0x01cc4e99
  0x01cc4e88: push   $0x55310188
  0x01cc4e8d: call   0x01cc4e92
  0x01cc4e92: pusha  
  0x01cc4e93: call   0x54dedbf0
  0x01cc4e98: hlt    
  0x01cc4e99: mov    %esi,-0x1c(%ebp)
  0x01cc4e9c: mov    %fs:0x0(,%eiz,1),%edi
  0x01cc4ea4: mov    -0xc(%edi),%edi
  0x01cc4ea7: push   %edi
  0x01cc4ea8: mov    %ebp,0x144(%edi)
  0x01cc4eae: mov    %eax,0x13c(%edi)
  0x01cc4eb4: call   0x5505a590
  0x01cc4eb9: add    $0x8,%esp
  0x01cc4ebc: push   %eax
  0x01cc4ebd: mov    %fs:0x0(,%eiz,1),%eax
  0x01cc4ec5: mov    -0xc(%eax),%eax
  0x01cc4ec8: cmp    %eax,%edi
  0x01cc4eca: je     0x01cc4ee1
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x01cc4ed0: push   $0x55312af0
  0x01cc4ed5: call   0x01cc4eda
  0x01cc4eda: pusha  
  0x01cc4edb: call   0x54dedbf0
  0x01cc4ee0: hlt    
  0x01cc4ee1: pop    %eax
  0x01cc4ee2: movl   $0x0,0x13c(%edi)
  0x01cc4eec: movl   $0x0,0x144(%edi)
  0x01cc4ef6: cmpl   $0x0,0x4(%edi)
  0x01cc4efd: jne    0x01cb0340
  0x01cc4f03: mov    -0x1c(%ebp),%esi
  0x01cc4f06: mov    -0x18(%ebp),%edi
  0x01cc4f09: ret    

  0x01cc4f0a: movzwl 0x1(%esi),%edx
  0x01cc4f0e: mov    -0x14(%ebp),%ecx
  0x01cc4f11: shl    $0x2,%edx

  //---begin TemplateTable::load_field_cp_cache_entry
  0x01cc4f14: mov    0x10(%ecx,%edx,4),%ebx
  0x01cc4f18: mov    0x14(%ecx,%edx,4),%eax
  0x01cc4f1c: mov    0xc(%ecx,%edx,4),%ecx
  0x01cc4f20: mov    0x3c(%ecx),%ecx
  //---end   TemplateTable::load_field_cp_cache_entry

  0x01cc4f23: shr    $0x1c,%eax

  // btos
  0x01cc4f26: and    $0xf,%eax
  0x01cc4f29: jne    0x01cc4f39

  0x01cc4f2f: movsbl (%ecx,%ebx,1),%eax //load_signed_byte
  0x01cc4f33: push   %eax
  0x01cc4f34: jmp    0x01cc4fda

  // itos
  0x01cc4f39: cmp    $0x3,%eax
  0x01cc4f3c: jne    0x01cc4f4b
  0x01cc4f42: mov    (%ecx,%ebx,1),%eax
  0x01cc4f45: push   %eax
  0x01cc4f46: jmp    0x01cc4fda

  // atos
  0x01cc4f4b: cmp    $0x7,%eax
  0x01cc4f4e: jne    0x01cc4f5d
  0x01cc4f54: mov    (%ecx,%ebx,1),%eax
  0x01cc4f57: push   %eax
  0x01cc4f58: jmp    0x01cc4fda

  // ctos
  0x01cc4f5d: cmp    $0x1,%eax
  0x01cc4f60: jne    0x01cc4f70
  0x01cc4f66: movzwl (%ecx,%ebx,1),%eax
  0x01cc4f6a: push   %eax
  0x01cc4f6b: jmp    0x01cc4fda

  // stos
  0x01cc4f70: cmp    $0x2,%eax
  0x01cc4f73: jne    0x01cc4f83
  0x01cc4f79: movswl (%ecx,%ebx,1),%eax
  0x01cc4f7d: push   %eax
  0x01cc4f7e: jmp    0x01cc4fda

  // ltos
  0x01cc4f83: cmp    $0x4,%eax
  0x01cc4f86: jne    0x01cc4f9e
  0x01cc4f8c: fildll (%ecx,%ebx,1) // Must load atomically
  0x01cc4f8f: sub    $0x8,%esp // Make space for store
  0x01cc4f92: fistpll (%esp)
  0x01cc4f95: pop    %eax
  0x01cc4f96: pop    %edx
  0x01cc4f97: push   %edx
  0x01cc4f98: push   %eax
  0x01cc4f99: jmp    0x01cc4fda

  // ftos
  0x01cc4f9e: cmp    $0x5,%eax
  0x01cc4fa1: jne    0x01cc4fb5
  0x01cc4fa7: flds   (%ecx,%ebx,1)
  0x01cc4faa: sub    $0x4,%esp
  0x01cc4fad: fstps  (%esp)
  0x01cc4fb0: jmp    0x01cc4fda

  // dtos
  0x01cc4fb5: cmp    $0x6,%eax
  0x01cc4fb8: jne    0x01cc4fc9
  0x01cc4fbe: fldl   (%ecx,%ebx,1)
  0x01cc4fc1: sub    $0x8,%esp
  0x01cc4fc4: fstpl  (%esp)
  0x01cc4fc7: jmp    0x01cc4fda

  //stop("Bad state");
  0x01cc4fc9: push   $0x5531a644
  0x01cc4fce: call   0x01cc4fd3
  0x01cc4fd3: pusha  
  0x01cc4fd4: call   0x54dedbf0
  0x01cc4fd9: hlt    

  0x01cc4fda: movzbl 0x3(%esi),%ebx
  0x01cc4fde: add    $0x3,%esi
  0x01cc4fe1: jmp    *0x55629838(,%ebx,4)
  0x01cc4fe8: int3   
  0x01cc4fe9: int3   
  0x01cc4fea: int3   
  0x01cc4feb: int3   
  0x01cc4fec: int3   
  0x01cc4fed: int3   
  0x01cc4fee: int3   
  0x01cc4fef: int3   

