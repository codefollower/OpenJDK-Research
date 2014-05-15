invokestatic  184 invokestatic  [0x01cc58f0, 0x01cc5a20]  304 bytes

  0x01cc58f0: sub    $0x4,%esp
  0x01cc58f3: fstps  (%esp)
  0x01cc58f6: jmp    0x01cc5914
  0x01cc58fb: sub    $0x8,%esp
  0x01cc58fe: fstpl  (%esp)
  0x01cc5901: jmp    0x01cc5914
  0x01cc5906: push   %edx
  0x01cc5907: push   %eax
  0x01cc5908: jmp    0x01cc5914
  0x01cc590d: push   %eax
  0x01cc590e: jmp    0x01cc5914
  0x01cc5913: push   %eax

  //直接跳到这里
  0x01cc5914: mov    %esi,-0x1c(%ebp)
  0x01cc5917: movzwl 0x1(%esi),%edx
  0x01cc591b: mov    -0x14(%ebp),%ecx
  0x01cc591e: shl    $0x2,%edx
  0x01cc5921: mov    0x8(%ecx,%edx,4),%ebx
  0x01cc5925: shr    $0x10,%ebx
  0x01cc5928: and    $0xff,%ebx
  0x01cc592e: cmp    $0xb8,%ebx
  0x01cc5934: je     0x01cc59e7
  0x01cc593a: mov    $0xb8,%ebx
  0x01cc593f: call   0x01cc5949
  0x01cc5944: jmp    0x01cc59dd
  0x01cc5949: push   %ebx
  0x01cc594a: lea    0x8(%esp),%eax
  0x01cc594e: cmpl   $0x0,-0x8(%ebp)
  0x01cc5955: je     0x01cc596c
  0x01cc595b: push   $0x55310188
  0x01cc5960: call   0x01cc5965
  0x01cc5965: pusha  
  0x01cc5966: call   0x54dedbf0
  0x01cc596b: hlt    
  0x01cc596c: mov    %esi,-0x1c(%ebp)
  0x01cc596f: mov    %fs:0x0(,%eiz,1),%edi
  0x01cc5977: mov    -0xc(%edi),%edi
  0x01cc597a: push   %edi
  0x01cc597b: mov    %ebp,0x144(%edi)
  0x01cc5981: mov    %eax,0x13c(%edi)
  0x01cc5987: call   0x5505b0b0
  0x01cc598c: add    $0x8,%esp
  0x01cc598f: push   %eax
  0x01cc5990: mov    %fs:0x0(,%eiz,1),%eax
  0x01cc5998: mov    -0xc(%eax),%eax
  0x01cc599b: cmp    %eax,%edi
  0x01cc599d: je     0x01cc59b4
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x01cc59a3: push   $0x55312af0
  0x01cc59a8: call   0x01cc59ad
  0x01cc59ad: pusha  
  0x01cc59ae: call   0x54dedbf0
  0x01cc59b3: hlt    
  0x01cc59b4: pop    %eax
  0x01cc59b5: movl   $0x0,0x13c(%edi)
  0x01cc59bf: movl   $0x0,0x144(%edi)
  0x01cc59c9: cmpl   $0x0,0x4(%edi)
  0x01cc59d0: jne    0x01cb0340
  0x01cc59d6: mov    -0x1c(%ebp),%esi
  0x01cc59d9: mov    -0x18(%ebp),%edi
  0x01cc59dc: ret    
  0x01cc59dd: movzwl 0x1(%esi),%edx
  0x01cc59e1: mov    -0x14(%ebp),%ecx
  0x01cc59e4: shl    $0x2,%edx
  0x01cc59e7: mov    0xc(%ecx,%edx,4),%ebx
  0x01cc59eb: mov    0x14(%ecx,%edx,4),%edx
  0x01cc59ef: shr    $0x1c,%edx
  0x01cc59f2: mov    0x556277cc(,%edx,4),%edx
  0x01cc59f9: push   %edx
  0x01cc59fa: lea    0x4(%esp),%esi
  0x01cc59fe: mov    %esi,-0x8(%ebp)
  0x01cc5a01: jmp    *0x34(%ebx)
  0x01cc5a04: push   $0x552fd97c
  0x01cc5a09: call   0x01cc5a0e
  0x01cc5a0e: pusha  
  0x01cc5a0f: call   0x54dedbf0
  0x01cc5a14: hlt    
  0x01cc5a15: nop    
  0x01cc5a16: nop    
  0x01cc5a17: nop    
  0x01cc5a18: int3   
  0x01cc5a19: int3   
  0x01cc5a1a: int3   
  0x01cc5a1b: int3   
  0x01cc5a1c: int3   
  0x01cc5a1d: int3   
  0x01cc5a1e: int3   
  0x01cc5a1f: int3   

对应VS中的Intel汇编格式
01F75914  mov         dword ptr [ebp-1Ch],esi  
01F75917  movzx       edx,word ptr [esi+1]  
01F7591B  mov         ecx,dword ptr [ebp-14h]  
01F7591E  shl         edx,2  
01F75921  mov         ebx,dword ptr [ecx+edx*4+8]  
01F75925  shr         ebx,10h  
01F75928  and         ebx,0FFh  
01F7592E  cmp         ebx,0B8h  
01F75934  je          01F759E7  
01F7593A  mov         ebx,0B8h  
01F7593F  call        01F75949  
01F75944  jmp         01F759DD  
01F75949  push        ebx  
01F7594A  lea         eax,[esp+8]  
01F7594E  cmp         dword ptr [ebp-8],0  
01F75955  je          01F7596C  
01F7595B  push        57CE0188h  
01F75960  call        01F75965  
01F75965  pushad  
01F75966  call        MacroAssembler::debug32 (577BDBF0h)  
01F7596B  hlt  
01F7596C  mov         dword ptr [ebp-1Ch],esi  
01F7596F  mov         edi,dword ptr fs:[0]  
01F75977  mov         edi,dword ptr [edi-0Ch]  
01F7597A  push        edi  
01F7597B  mov         dword ptr [edi+144h],ebp  
01F75981  mov         dword ptr [edi+13Ch],eax  
01F75987  call        InterpreterRuntime::resolve_invoke (57A2B0B0h)  
01F7598C  add         esp,8  
01F7598F  push        eax  
01F75990  mov         eax,dword ptr fs:[0]  
01F75998  mov         eax,dword ptr [eax-0Ch]  
01F7599B  cmp         edi,eax  
01F7599D  je          01F759B4  
01F759A3  push        57CE2AF0h  
01F759A8  call        01F759AD  
01F759AD  pushad  
01F759AE  call        MacroAssembler::debug32 (577BDBF0h)  
01F759B3  hlt  
01F759B4  pop         eax  
01F759B5  mov         dword ptr [edi+13Ch],0  
01F759BF  mov         dword ptr [edi+144h],0  
01F759C9  cmp         dword ptr [edi+4],0  
01F759D0  jne         01F60340  
01F759D6  mov         esi,dword ptr [ebp-1Ch]  
01F759D9  mov         edi,dword ptr [ebp-18h]  
01F759DC  ret  
01F759DD  movzx       edx,word ptr [esi+1]  
01F759E1  mov         ecx,dword ptr [ebp-14h]  
01F759E4  shl         edx,2  
01F759E7  mov         ebx,dword ptr [ecx+edx*4+0Ch]  
01F759EB  mov         edx,dword ptr [ecx+edx*4+14h]  
01F759EF  shr         edx,1Ch  
01F759F2  mov         edx,dword ptr [edx*4+57FF77CCh]  
01F759F9  push        edx  
01F759FA  lea         esi,[esp+4]  
01F759FE  mov         dword ptr [ebp-8],esi  
01F75A01  jmp         dword ptr [ebx+34h]  
01F75A04  push        57CCD97Ch  
01F75A09  call        01F75A0E  
01F75A0E  pushad  
01F75A0F  call        MacroAssembler::debug32 (577BDBF0h)  
01F75A14  hlt  
01F75A15  nop  
01F75A16  nop  
01F75A17  nop  
01F75A18  int         3  
01F75A19  int         3  
01F75A1A  int         3  
01F75A1B  int         3  
01F75A1C  int         3  
01F75A1D  int         3  
01F75A1E  int         3  
01F75A1F  int         3 
