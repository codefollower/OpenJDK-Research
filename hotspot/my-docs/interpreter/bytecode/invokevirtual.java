invokevirtual  182 invokevirtual  [0x07f17d80, 0x07f17ee0]  352 bytes

  0x07f17d80: sub    $0x4,%esp
  0x07f17d83: fstps  (%esp)
  0x07f17d86: jmp    0x07f17da4
  0x07f17d8b: sub    $0x8,%esp
  0x07f17d8e: fstpl  (%esp)
  0x07f17d91: jmp    0x07f17da4
  0x07f17d96: push   %edx
  0x07f17d97: push   %eax
  0x07f17d98: jmp    0x07f17da4
  0x07f17d9d: push   %eax
  0x07f17d9e: jmp    0x07f17da4
  0x07f17da3: push   %eax

  0x07f17da4: mov    %esi,-0x1c(%ebp)
  0x07f17da7: movzwl 0x1(%esi),%edx
  0x07f17dab: mov    -0x14(%ebp),%ecx
  0x07f17dae: shl    $0x2,%edx
  0x07f17db1: mov    0x8(%ecx,%edx,4),%ebx
  0x07f17db5: shr    $0x18,%ebx //取ConstantPoolCacheEntry._indices字段中的b2
  0x07f17db8: and    $0xff,%ebx

  0x07f17dbe: cmp    $0xb6,%ebx
  0x07f17dc4: je     0x07f17e77

  0x07f17dca: mov    $0xb6,%ebx

  0x07f17dcf: call   0x07f17dd9
  0x07f17dd4: jmp    0x07f17e6d
  0x07f17dd9: push   %ebx
  0x07f17dda: lea    0x8(%esp),%eax
  0x07f17dde: cmpl   $0x0,-0x8(%ebp)
  0x07f17de5: je     0x07f17dfc
  0x07f17deb: push   $0x5926a9d4
  0x07f17df0: call   0x07f17df5
  0x07f17df5: pusha  
  0x07f17df6: call   0x58d2df50
  0x07f17dfb: hlt    
  0x07f17dfc: mov    %esi,-0x1c(%ebp)
  0x07f17dff: mov    %fs:0x0(,%eiz,1),%edi
  0x07f17e07: mov    -0xc(%edi),%edi
  0x07f17e0a: push   %edi
  0x07f17e0b: mov    %ebp,0x144(%edi)
  0x07f17e11: mov    %eax,0x13c(%edi)
  0x07f17e17: call   0x58fada20
  0x07f17e1c: add    $0x8,%esp
  0x07f17e1f: push   %eax
  0x07f17e20: mov    %fs:0x0(,%eiz,1),%eax
  0x07f17e28: mov    -0xc(%eax),%eax
  0x07f17e2b: cmp    %eax,%edi
  0x07f17e2d: je     0x07f17e44
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x07f17e33: push   $0x5926d0e8
  0x07f17e38: call   0x07f17e3d
  0x07f17e3d: pusha  
  0x07f17e3e: call   0x58d2df50
  0x07f17e43: hlt    
  0x07f17e44: pop    %eax
  0x07f17e45: movl   $0x0,0x13c(%edi)
  0x07f17e4f: movl   $0x0,0x144(%edi)
  0x07f17e59: cmpl   $0x0,0x4(%edi)
  0x07f17e60: jne    0x07f00380
  0x07f17e66: mov    -0x1c(%ebp),%esi
  0x07f17e69: mov    -0x18(%ebp),%edi
  0x07f17e6c: ret    

  0x07f17e6d: movzwl 0x1(%esi),%edx
  0x07f17e71: mov    -0x14(%ebp),%ecx
  0x07f17e74: shl    $0x2,%edx

  0x07f17e77: mov    0x10(%ecx,%edx,4),%ebx //取_f2
  0x07f17e7b: mov    0x14(%ecx,%edx,4),%edx //取flags_offset

  //if (load_receiver)
  0x07f17e7f: mov    %edx,%ecx
  0x07f17e81: and    $0xff,%ecx
  0x07f17e87: mov    -0x4(%esp,%ecx,4),%ecx

  0x07f17e8b: mov    %edx,%esi //save_flags
  0x07f17e8d: shr    $0x1c,%edx // compute return type
  0x07f17e90: mov    0x5959543c(,%edx,4),%edx // load return address
  0x07f17e97: push   %edx // push return address

  0x07f17e98: mov    %esi,%edx
  0x07f17e9a: mov    -0x1c(%ebp),%esi //restore_bcp

  //invokevirtual_helper
  0x07f17e9d: mov    %edx,%eax
  0x07f17e9f: and    $0x100000,%eax //is_vfinal 第21位
  0x07f17ea5: je     0x07f17eb7 //notFinal

  0x07f17eab: cmp    (%ecx),%eax //null_check

  //prepare_to_jump_from_interpreted
  0x07f17ead: lea    0x4(%esp),%esi // set sender sp
  0x07f17eb1: mov    %esi,-0x8(%ebp) // record last_sp
  0x07f17eb4: jmp    *0x34(%ebx) //Method._from_interpreted_entry 重新转到method entry point 

  // get receiver klass
  0x07f17eb7: mov    0x4(%ecx),%eax //load_klass
  0x07f17eba: mov    0x108(%eax,%ebx,4),%ebx //lookup_virtual_method

  0x07f17ec1: lea    0x4(%esp),%esi
  0x07f17ec5: mov    %esi,-0x8(%ebp)
  0x07f17ec8: jmp    *0x34(%ebx)

  0x07f17ecb: push   $0x59257db8
  0x07f17ed0: call   0x07f17ed5
  0x07f17ed5: pusha  
  0x07f17ed6: call   0x58d2df50
  0x07f17edb: hlt    
  0x07f17edc: int3   
  0x07f17edd: int3   
  0x07f17ede: int3   
  0x07f17edf: int3   
