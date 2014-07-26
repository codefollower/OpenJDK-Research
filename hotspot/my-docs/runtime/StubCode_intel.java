ICache::flush_icache_stub [0x01dc0040, 0x01dc004a[ (10 bytes)
  0x01dc0040: lock add DWORD PTR [esp],0x0
  0x01dc0045: mov    eax,DWORD PTR [esp+0xc]
  0x01dc0049: ret    

VM_Version::getPsrInfo_stub [0x01dc00c0, 0x01dc0286[ (454 bytes)
  0x01dc00c0: push   ebp
  0x01dc00c1: mov    ebp,DWORD PTR [esp+0x8]
  0x01dc00c5: push   ebx
  0x01dc00c6: push   esi
  0x01dc00c7: pushf  
  0x01dc00c8: pop    eax
  0x01dc00c9: push   eax
  0x01dc00ca: mov    ecx,eax
  0x01dc00cc: xor    eax,0x40000
  0x01dc00d2: push   eax
  0x01dc00d3: popf   
  0x01dc00d4: pushf  
  0x01dc00d5: pop    eax
  0x01dc00d6: cmp    eax,ecx
  0x01dc00d8: jne    0x01dc00e7
  0x01dc00da: mov    eax,0x300
  0x01dc00df: mov    DWORD PTR [ebp+0x10],eax
  0x01dc00e2: jmp    0x01dc0281
  0x01dc00e7: mov    eax,ecx
  0x01dc00e9: xor    eax,0x200000
  0x01dc00ef: push   eax
  0x01dc00f0: popf   
  0x01dc00f1: pushf  
  0x01dc00f2: pop    eax
  0x01dc00f3: cmp    ecx,eax
  0x01dc00f5: jne    0x01dc0104
  0x01dc00f7: mov    eax,0x400
  0x01dc00fc: mov    DWORD PTR [ebp+0x10],eax
  0x01dc00ff: jmp    0x01dc0281
  0x01dc0104: xor    eax,eax
  0x01dc0106: cpuid  
  0x01dc0108: or     eax,eax
  0x01dc010a: je     0x01dc00f7
  0x01dc010c: lea    esi,[ebp+0x0]
  0x01dc010f: mov    DWORD PTR [esi],eax
  0x01dc0111: mov    DWORD PTR [esi+0x4],ebx
  0x01dc0114: mov    DWORD PTR [esi+0x8],ecx
  0x01dc0117: mov    DWORD PTR [esi+0xc],edx
  0x01dc011a: cmp    eax,0xa
  0x01dc011d: jbe    0x01dc0188
  0x01dc011f: mov    eax,0xb
  0x01dc0124: xor    ecx,ecx
  0x01dc0126: cpuid  
  0x01dc0128: lea    esi,[ebp+0x40]
  0x01dc012b: mov    DWORD PTR [esi],eax
  0x01dc012d: mov    DWORD PTR [esi+0x4],ebx
  0x01dc0130: mov    DWORD PTR [esi+0x8],ecx
  0x01dc0133: mov    DWORD PTR [esi+0xc],edx
  0x01dc0136: mov    eax,0xb
  0x01dc013b: mov    ecx,0x1
  0x01dc0140: cpuid  
  0x01dc0142: push   eax
  0x01dc0143: and    eax,0x1f
  0x01dc0146: or     eax,ebx
  0x01dc0148: and    eax,0xffff
  0x01dc014e: pop    eax
  0x01dc014f: je     0x01dc0188
  0x01dc0151: lea    esi,[ebp+0x50]
  0x01dc0154: mov    DWORD PTR [esi],eax
  0x01dc0156: mov    DWORD PTR [esi+0x4],ebx
  0x01dc0159: mov    DWORD PTR [esi+0x8],ecx
  0x01dc015c: mov    DWORD PTR [esi+0xc],edx
  0x01dc015f: mov    eax,0xb
  0x01dc0164: mov    ecx,0x2
  0x01dc0169: cpuid  
  0x01dc016b: push   eax
  0x01dc016c: and    eax,0x1f
  0x01dc016f: or     eax,ebx
  0x01dc0171: and    eax,0xffff
  0x01dc0177: pop    eax
  0x01dc0178: je     0x01dc0188
  0x01dc017a: lea    esi,[ebp+0x60]
  0x01dc017d: mov    DWORD PTR [esi],eax
  0x01dc017f: mov    DWORD PTR [esi+0x4],ebx
  0x01dc0182: mov    DWORD PTR [esi+0x8],ecx
  0x01dc0185: mov    DWORD PTR [esi+0xc],edx
  0x01dc0188: mov    eax,0x4
  0x01dc018d: cmp    eax,DWORD PTR [ebp+0x0]
  0x01dc0190: jg     0x01dc01ad
  0x01dc0192: xor    ecx,ecx
  0x01dc0194: cpuid  
  0x01dc0196: push   eax
  0x01dc0197: and    eax,0x1f
  0x01dc019a: or     eax,eax
  0x01dc019c: pop    eax
  0x01dc019d: je     0x01dc01ad
  0x01dc019f: lea    esi,[ebp+0x20]
  0x01dc01a2: mov    DWORD PTR [esi],eax
  0x01dc01a4: mov    DWORD PTR [esi+0x4],ebx
  0x01dc01a7: mov    DWORD PTR [esi+0x8],ecx
  0x01dc01aa: mov    DWORD PTR [esi+0xc],edx
  0x01dc01ad: mov    eax,0x1
  0x01dc01b2: cpuid  
  0x01dc01b4: lea    esi,[ebp+0x10]
  0x01dc01b7: mov    DWORD PTR [esi],eax
  0x01dc01b9: mov    DWORD PTR [esi+0x4],ebx
  0x01dc01bc: mov    DWORD PTR [esi+0x8],ecx
  0x01dc01bf: mov    DWORD PTR [esi+0xc],edx
  0x01dc01c2: and    ecx,0x18000000
  0x01dc01c8: cmp    ecx,0x18000000
  0x01dc01ce: jne    0x01dc01e0
  0x01dc01d0: xor    ecx,ecx
  0x01dc01d2: xgetbv 
  0x01dc01d5: lea    esi,[ebp+0xf0]
  0x01dc01db: mov    DWORD PTR [esi],eax
  0x01dc01dd: mov    DWORD PTR [esi+0x4],edx
  0x01dc01e0: mov    eax,0x7
  0x01dc01e5: cmp    eax,DWORD PTR [ebp+0x0]
  0x01dc01e8: jg     0x01dc01f6
  0x01dc01ea: xor    ecx,ecx
  0x01dc01ec: cpuid  
  0x01dc01ee: lea    esi,[ebp+0x30]
  0x01dc01f1: mov    DWORD PTR [esi],eax
  0x01dc01f3: mov    DWORD PTR [esi+0x4],ebx
  0x01dc01f6: mov    eax,0x80000000
  0x01dc01fb: cpuid  
  0x01dc01fd: cmp    eax,0x80000000
  0x01dc0203: jbe    0x01dc0281
  0x01dc0209: cmp    eax,0x80000004
  0x01dc020f: jbe    0x01dc0269
  0x01dc0211: cmp    eax,0x80000006
  0x01dc0217: jbe    0x01dc0251
  0x01dc0219: cmp    eax,0x80000007
  0x01dc021f: jbe    0x01dc0239
  0x01dc0221: mov    eax,0x80000008
  0x01dc0226: cpuid  
  0x01dc0228: lea    esi,[ebp+0xe0]
  0x01dc022e: mov    DWORD PTR [esi],eax
  0x01dc0230: mov    DWORD PTR [esi+0x4],ebx
  0x01dc0233: mov    DWORD PTR [esi+0x8],ecx
  0x01dc0236: mov    DWORD PTR [esi+0xc],edx
  0x01dc0239: mov    eax,0x80000007
  0x01dc023e: cpuid  
  0x01dc0240: lea    esi,[ebp+0xd0]
  0x01dc0246: mov    DWORD PTR [esi],eax
  0x01dc0248: mov    DWORD PTR [esi+0x4],ebx
  0x01dc024b: mov    DWORD PTR [esi+0x8],ecx
  0x01dc024e: mov    DWORD PTR [esi+0xc],edx
  0x01dc0251: mov    eax,0x80000005
  0x01dc0256: cpuid  
  0x01dc0258: lea    esi,[ebp+0xc0]
  0x01dc025e: mov    DWORD PTR [esi],eax
  0x01dc0260: mov    DWORD PTR [esi+0x4],ebx
  0x01dc0263: mov    DWORD PTR [esi+0x8],ecx
  0x01dc0266: mov    DWORD PTR [esi+0xc],edx
  0x01dc0269: mov    eax,0x80000001
  0x01dc026e: cpuid  
  0x01dc0270: lea    esi,[ebp+0x80]
  0x01dc0276: mov    DWORD PTR [esi],eax
  0x01dc0278: mov    DWORD PTR [esi+0x4],ebx
  0x01dc027b: mov    DWORD PTR [esi+0x8],ecx
  0x01dc027e: mov    DWORD PTR [esi+0xc],edx
  0x01dc0281: popf   
  0x01dc0282: pop    esi
  0x01dc0283: pop    ebx
  0x01dc0284: pop    ebp
  0x01dc0285: ret    

Decoding RuntimeStub - StackOverflowError throw_exception 0x01dc2848
  0x01dc2890: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01dc2898: mov    ebx,DWORD PTR [ebx-0xc]
  0x01dc289b: push   ebp
  0x01dc289c: mov    ebp,esp
  0x01dc289e: sub    esp,0xc
  0x01dc28a1: mov    DWORD PTR [esp],ebx
  0x01dc28a4: mov    DWORD PTR [ebx+0x144],ebp
  0x01dc28aa: mov    DWORD PTR [ebx+0x13c],esp
  ;; call runtime_entry
  0x01dc28b0: call   0x55214600
  0x01dc28b5: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01dc28bd: mov    ebx,DWORD PTR [ebx-0xc]
  0x01dc28c0: mov    DWORD PTR [ebx+0x13c],0x0
  0x01dc28ca: mov    DWORD PTR [ebx+0x144],0x0
  0x01dc28d4: mov    esp,ebp
  0x01dc28d6: pop    ebp
  0x01dc28d7: cmp    DWORD PTR [ebx+0x4],0x0
  0x01dc28de: jne    0x01dc28f5
  0x01dc28e4: push   0x552fd97c
  0x01dc28e9: call   0x01dc28ee
  0x01dc28ee: pusha  
  0x01dc28ef: call   0x54dedbf0
  0x01dc28f4: hlt    
  0x01dc28f5: jmp    0x01dc0340
  0x01dc28fa: hlt    
  0x01dc28fb: hlt    

StubRoutines::forward exception [0x01dc0340, 0x01dc03b4[ (116 bytes)
  0x01dc0340: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01dc0348: mov    ecx,DWORD PTR [ecx-0xc]
  0x01dc034b: cmp    DWORD PTR [ecx+0x4],0x0
  0x01dc0352: jne    0x01dc0369
  0x01dc0358: push   0x55317ef8
  0x01dc035d: call   0x01dc0362
  0x01dc0362: pusha  
  0x01dc0363: call   0x54dedbf0
  0x01dc0368: hlt    
  0x01dc0369: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01dc0371: mov    ecx,DWORD PTR [ecx-0xc]
  0x01dc0374: mov    edx,DWORD PTR [esp]
  ;; call exception_handler_for_return_address
  0x01dc0377: push   edx
  0x01dc0378: push   ecx
  0x01dc0379: call   0x55213a10
  0x01dc037e: add    esp,0x8
  0x01dc0381: mov    ebx,eax
  0x01dc0383: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01dc038b: mov    ecx,DWORD PTR [ecx-0xc]
  0x01dc038e: pop    edx
  0x01dc038f: mov    eax,DWORD PTR [ecx+0x4]
  0x01dc0392: mov    DWORD PTR [ecx+0x4],0x0
  0x01dc0399: test   eax,eax
  0x01dc039b: jne    0x01dc03b2
  0x01dc03a1: push   0x55317f60
  0x01dc03a6: call   0x01dc03ab
  0x01dc03ab: pusha  
  0x01dc03ac: call   0x54dedbf0
  0x01dc03b1: hlt    
  0x01dc03b2: jmp    ebx

StubRoutines::call_stub [0x01dc03b4, 0x01dc0485[ (209 bytes)
  0x01dc03b4: push   ebp
  0x01dc03b5: mov    ebp,esp
  0x01dc03b7: mov    ecx,DWORD PTR [ebp+0x20]
  0x01dc03ba: shl    ecx,0x2
  0x01dc03bd: add    ecx,0x10
  0x01dc03c0: sub    esp,ecx
  0x01dc03c2: and    esp,0xfffffff0
  0x01dc03c5: mov    DWORD PTR [ebp-0x4],edi
  0x01dc03c8: mov    DWORD PTR [ebp-0x8],esi
  0x01dc03cb: mov    DWORD PTR [ebp-0xc],ebx
  0x01dc03ce: stmxcsr DWORD PTR [ebp-0x10]
  0x01dc03d2: mov    eax,DWORD PTR [ebp-0x10]
  0x01dc03d5: and    eax,0xffc0
  0x01dc03db: cmp    eax,DWORD PTR ds:0x55635778
  0x01dc03e1: je     0x01dc03ee
  0x01dc03e7: ldmxcsr DWORD PTR ds:0x55635778
  0x01dc03ee: fldcw  WORD PTR ds:0x55635768
  0x01dc03f4: mov    ecx,DWORD PTR [ebp+0x24]
  0x01dc03f7: cmp    DWORD PTR [ecx+0x4],0x0
  0x01dc03fe: je     0x01dc0415
  0x01dc0404: push   0x55317d38
  0x01dc0409: call   0x01dc040e
  0x01dc040e: pusha  
  0x01dc040f: call   0x54dedbf0
  0x01dc0414: hlt    
  ;; pass parameters if any
  0x01dc0415: mov    ecx,DWORD PTR [ebp+0x20]
  0x01dc0418: test   ecx,ecx
  0x01dc041a: je     0x01dc0430
  0x01dc0420: mov    edx,DWORD PTR [ebp+0x1c]
  0x01dc0423: xor    ebx,ebx
  ;; loop:
  0x01dc0425: mov    eax,DWORD PTR [edx+ecx*4-0x4]
  0x01dc0429: mov    DWORD PTR [esp+ebx*4],eax
  0x01dc042c: inc    ebx
  0x01dc042d: dec    ecx
  0x01dc042e: jne    0x01dc0425
  ;; parameters_done:
  0x01dc0430: mov    ebx,DWORD PTR [ebp+0x14]
  0x01dc0433: mov    eax,DWORD PTR [ebp+0x18]
  0x01dc0436: mov    esi,esp
  ;; call Java function
  0x01dc0438: call   eax
  ;; call_stub_return_address:
  0x01dc043a: mov    edi,DWORD PTR [ebp+0xc]
  0x01dc043d: mov    esi,DWORD PTR [ebp+0x10]
  0x01dc0440: cmp    esi,0xb
  0x01dc0443: je     0x01dc0472
  0x01dc0449: cmp    esi,0x6
  0x01dc044c: je     0x01dc0479
  0x01dc0452: cmp    esi,0x7
  0x01dc0455: je     0x01dc047f
  0x01dc045b: mov    DWORD PTR [edi],eax
  ;; exit:
  0x01dc045d: lea    esp,[ebp-0x10]
  0x01dc0460: ldmxcsr DWORD PTR [ebp-0x10]
  0x01dc0464: mov    ebx,DWORD PTR [ebp-0xc]
  0x01dc0467: mov    esi,DWORD PTR [ebp-0x8]
  0x01dc046a: mov    edi,DWORD PTR [ebp-0x4]
  0x01dc046d: add    esp,0x10
  0x01dc0470: pop    ebp
  0x01dc0471: ret    
  ;; is_long:
  0x01dc0472: mov    DWORD PTR [edi],eax
  0x01dc0474: mov    DWORD PTR [edi+0x4],edx
  0x01dc0477: jmp    0x01dc045d
  ;; is_float:
  0x01dc0479: movss  DWORD PTR [edi],xmm0
  0x01dc047d: jmp    0x01dc045d
  ;; is_double:
  0x01dc047f: movsd  QWORD PTR [edi],xmm0
  0x01dc0483: jmp    0x01dc045d

StubRoutines::catch_exception [0x01dc0485, 0x01dc04c2[ (61 bytes)
  0x01dc0485: mov    ecx,DWORD PTR [ebp+0x24]
  0x01dc0488: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01dc0490: mov    ebx,DWORD PTR [ebx-0xc]
  0x01dc0493: cmp    ebx,ecx
  0x01dc0495: je     0x01dc04ac
  0x01dc049b: push   0x55317e24
  0x01dc04a0: call   0x01dc04a5
  0x01dc04a5: pusha  
  0x01dc04a6: call   0x54dedbf0
  0x01dc04ab: hlt    
  0x01dc04ac: mov    DWORD PTR [ecx+0x4],eax
  0x01dc04af: mov    DWORD PTR [ecx+0x8],0x55317c9c
  0x01dc04b6: mov    DWORD PTR [ecx+0xc],0x167
  0x01dc04bd: jmp    0x01dc043a

StubRoutines::atomic_xchg [0x01dc04c2, 0x01dc04cf[ (13 bytes)
  0x01dc04c2: push   edx
  0x01dc04c3: mov    eax,DWORD PTR [esp+0x8]
  0x01dc04c7: mov    edx,DWORD PTR [esp+0xc]
  0x01dc04cb: xchg   DWORD PTR [edx],eax
  0x01dc04cd: pop    edx
  0x01dc04ce: ret    

StubRoutines::handler_for_unsafe_access [0x01dc04cf, 0x01dc04e0[ (17 bytes)
  0x01dc04cf: push   0x0
  0x01dc04d4: pusha  
  ;; call handle_unsafe_access
  0x01dc04d5: call   0x54e072b0
  0x01dc04da: mov    DWORD PTR [esp+0x20],eax
  0x01dc04de: popa   
  0x01dc04df: ret    

StubRoutines::verify_mxcsr [0x01dc04e0, 0x01dc0527[ (71 bytes)
  0x01dc04e0: push   eax
  0x01dc04e1: sub    esp,0x4
  0x01dc04e4: stmxcsr DWORD PTR [esp]
  0x01dc04e8: mov    eax,DWORD PTR [esp]
  0x01dc04eb: and    eax,0xffc0
  0x01dc04f1: cmp    eax,DWORD PTR ds:0x55635778
  0x01dc04f7: je     0x01dc0522
  0x01dc04fd: pushf  
  0x01dc04fe: pusha  
  0x01dc04ff: sub    esp,0x6c
  0x01dc0502: fnsave [esp]
  0x01dc0505: fwait
  0x01dc0506: push   0x55317fb8
  0x01dc050b: call   0x55282690
  0x01dc0510: add    esp,0x4
  0x01dc0513: frstor [esp]
  0x01dc0516: add    esp,0x6c
  0x01dc0519: popa   
  0x01dc051a: popf   
  0x01dc051b: ldmxcsr DWORD PTR ds:0x55635778
  0x01dc0522: add    esp,0x4
  0x01dc0525: pop    eax
  0x01dc0526: ret    

StubRoutines::verify_spcw [0x01dc0527, 0x01dc056d[ (70 bytes)
  0x01dc0527: push   eax
  0x01dc0528: sub    esp,0x4
  0x01dc052b: fstcw  WORD PTR [esp]
  0x01dc052f: mov    eax,DWORD PTR [esp]
  0x01dc0532: and    eax,0xffff
  0x01dc0538: cmp    eax,DWORD PTR ds:0x55635768
  0x01dc053e: je     0x01dc0568
  0x01dc0544: pushf  
  0x01dc0545: pusha  
  0x01dc0546: sub    esp,0x6c
  0x01dc0549: fnsave [esp]
  0x01dc054c: fwait
  0x01dc054d: push   0x55317fe8
  0x01dc0552: call   0x55282690
  0x01dc0557: add    esp,0x4
  0x01dc055a: frstor [esp]
  0x01dc055d: add    esp,0x6c
  0x01dc0560: popa   
  0x01dc0561: popf   
  0x01dc0562: fldcw  WORD PTR ds:0x55635768
  0x01dc0568: add    esp,0x4
  0x01dc056b: pop    eax
  0x01dc056c: ret    

StubRoutines::d2i_wrapper [0x01dc056d, 0x01dc05a5[ (56 bytes)
  0x01dc056d: sub    esp,0x8
  0x01dc0570: fstp   QWORD PTR [esp]
  0x01dc0573: push   ebx
  0x01dc0574: push   ecx
  0x01dc0575: push   esi
  0x01dc0576: push   edi
  0x01dc0577: push   ebp
  0x01dc0578: sub    esp,0x6c
  0x01dc057b: fnsave [esp]
  0x01dc057e: fwait
  0x01dc057f: fld    QWORD PTR [esp+0x80]
  0x01dc0586: sub    esp,0x8
  0x01dc0589: fst    QWORD PTR [esp]
  0x01dc058c: emms   
  ;; SharedRuntime::d2i
  0x01dc058e: call   0x552131d0
  0x01dc0593: add    esp,0x8
  0x01dc0596: frstor [esp]
  0x01dc0599: add    esp,0x6c
  0x01dc059c: pop    ebp
  0x01dc059d: pop    edi
  0x01dc059e: pop    esi
  0x01dc059f: pop    ecx
  0x01dc05a0: pop    ebx
  0x01dc05a1: add    esp,0x8
  0x01dc05a4: ret    

StubRoutines::d2i_wrapper [0x01dc05a5, 0x01dc05dd[ (56 bytes)
  0x01dc05a5: sub    esp,0x8
  0x01dc05a8: fstp   QWORD PTR [esp]
  0x01dc05ab: push   ebx
  0x01dc05ac: push   ecx
  0x01dc05ad: push   esi
  0x01dc05ae: push   edi
  0x01dc05af: push   ebp
  0x01dc05b0: sub    esp,0x6c
  0x01dc05b3: fnsave [esp]
  0x01dc05b6: fwait
  0x01dc05b7: fld    QWORD PTR [esp+0x80]
  0x01dc05be: sub    esp,0x8
  0x01dc05c1: fst    QWORD PTR [esp]
  0x01dc05c4: emms   
  ;; SharedRuntime::d2l
  0x01dc05c6: call   0x55213340
  0x01dc05cb: add    esp,0x8
  0x01dc05ce: frstor [esp]
  0x01dc05d1: add    esp,0x6c
  0x01dc05d4: pop    ebp
  0x01dc05d5: pop    edi
  0x01dc05d6: pop    esi
  0x01dc05d7: pop    ecx
  0x01dc05d8: pop    ebx
  0x01dc05d9: add    esp,0x8
  0x01dc05dc: ret    

Decoding RuntimeStub - wrong_method_stub 0x01ea2e08
  0x01ea2e50: push   ebp
  0x01ea2e51: mov    ebp,esp
  0x01ea2e53: pusha  
  0x01ea2e54: pushf  
  0x01ea2e55: sub    esp,0xc8
  0x01ea2e5b: sub    esp,0x6c
  0x01ea2e5e: fnsave [esp]
  0x01ea2e61: fwait
  0x01ea2e62: cmp    WORD PTR [esp],0x27f
  0x01ea2e68: je     0x01ea2e7b
  0x01ea2e6a: push   0x553169bc
  0x01ea2e6f: call   0x01ea2e74
  0x01ea2e74: pusha  
  0x01ea2e75: call   0x54dedbf0
  0x01ea2e7a: hlt    
  0x01ea2e7b: mov    WORD PTR [esp],0x27f
  0x01ea2e81: frstor [esp]
  0x01ea2e84: fstp   QWORD PTR [esp+0x70]
  0x01ea2e88: fstp   QWORD PTR [esp+0x78]
  0x01ea2e8c: fstp   QWORD PTR [esp+0x80]
  0x01ea2e93: fstp   QWORD PTR [esp+0x88]
  0x01ea2e9a: fstp   QWORD PTR [esp+0x90]
  0x01ea2ea1: fstp   QWORD PTR [esp+0x98]
  0x01ea2ea8: fstp   QWORD PTR [esp+0xa0]
  0x01ea2eaf: fstp   QWORD PTR [esp+0xa8]
  0x01ea2eb6: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea2ebf: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea2ec8: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea2ed1: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea2eda: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea2ee3: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea2eec: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea2ef5: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea2efe: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea2f06: mov    edi,DWORD PTR [edi-0xc]
  0x01ea2f09: push   edi
  0x01ea2f0a: mov    DWORD PTR [edi+0x144],ebp
  0x01ea2f10: mov    DWORD PTR [edi+0x13c],esp
  0x01ea2f16: call   0x55218790
  0x01ea2f1b: add    esp,0x4
  0x01ea2f1e: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea2f28: mov    DWORD PTR [edi+0x144],0x0
  0x01ea2f32: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea2f39: jne    0x01ea2fb6
  0x01ea2f3f: mov    ebx,DWORD PTR [edi+0x170]
  0x01ea2f45: mov    DWORD PTR [edi+0x170],0x0
  0x01ea2f4f: mov    DWORD PTR [esp+0x148],ebx
  0x01ea2f56: mov    DWORD PTR [esp+0x154],eax
  0x01ea2f5d: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea2f66: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea2f6f: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea2f78: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea2f81: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea2f8a: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea2f93: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea2f9c: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea2fa5: frstor [esp]
  0x01ea2fa8: add    esp,0x6c
  0x01ea2fab: add    esp,0xc8
  0x01ea2fb1: popf   
  0x01ea2fb2: popa   
  0x01ea2fb3: pop    ebp
  0x01ea2fb4: jmp    eax
  0x01ea2fb6: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea2fbf: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea2fc8: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea2fd1: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea2fda: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea2fe3: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea2fec: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea2ff5: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea2ffe: frstor [esp]
  0x01ea3001: add    esp,0x6c
  0x01ea3004: add    esp,0xc8
  0x01ea300a: popf   
  0x01ea300b: popa   
  0x01ea300c: pop    ebp
  0x01ea300d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3015: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3018: mov    DWORD PTR [edi+0x16c],0x0
  0x01ea3022: mov    eax,DWORD PTR [edi+0x4]
  0x01ea3025: jmp    0x01dc0340
  0x01ea302a: hlt    
  0x01ea302b: hlt    

Decoding RuntimeStub - wrong_method_abstract_stub 0x01ea3048
  0x01ea3090: push   ebp
  0x01ea3091: mov    ebp,esp
  0x01ea3093: pusha  
  0x01ea3094: pushf  
  0x01ea3095: sub    esp,0xc8
  0x01ea309b: sub    esp,0x6c
  0x01ea309e: fnsave [esp]
  0x01ea30a1: fwait
  0x01ea30a2: cmp    WORD PTR [esp],0x27f
  0x01ea30a8: je     0x01ea30bb
  0x01ea30aa: push   0x553169bc
  0x01ea30af: call   0x01ea30b4
  0x01ea30b4: pusha  
  0x01ea30b5: call   0x54dedbf0
  0x01ea30ba: hlt    
  0x01ea30bb: mov    WORD PTR [esp],0x27f
  0x01ea30c1: frstor [esp]
  0x01ea30c4: fstp   QWORD PTR [esp+0x70]
  0x01ea30c8: fstp   QWORD PTR [esp+0x78]
  0x01ea30cc: fstp   QWORD PTR [esp+0x80]
  0x01ea30d3: fstp   QWORD PTR [esp+0x88]
  0x01ea30da: fstp   QWORD PTR [esp+0x90]
  0x01ea30e1: fstp   QWORD PTR [esp+0x98]
  0x01ea30e8: fstp   QWORD PTR [esp+0xa0]
  0x01ea30ef: fstp   QWORD PTR [esp+0xa8]
  0x01ea30f6: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea30ff: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea3108: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea3111: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea311a: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea3123: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea312c: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea3135: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea313e: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3146: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3149: push   edi
  0x01ea314a: mov    DWORD PTR [edi+0x144],ebp
  0x01ea3150: mov    DWORD PTR [edi+0x13c],esp
  0x01ea3156: call   0x55218a40
  0x01ea315b: add    esp,0x4
  0x01ea315e: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea3168: mov    DWORD PTR [edi+0x144],0x0
  0x01ea3172: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea3179: jne    0x01ea31f6
  0x01ea317f: mov    ebx,DWORD PTR [edi+0x170]
  0x01ea3185: mov    DWORD PTR [edi+0x170],0x0
  0x01ea318f: mov    DWORD PTR [esp+0x148],ebx
  0x01ea3196: mov    DWORD PTR [esp+0x154],eax
  0x01ea319d: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea31a6: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea31af: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea31b8: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea31c1: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea31ca: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea31d3: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea31dc: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea31e5: frstor [esp]
  0x01ea31e8: add    esp,0x6c
  0x01ea31eb: add    esp,0xc8
  0x01ea31f1: popf   
  0x01ea31f2: popa   
  0x01ea31f3: pop    ebp
  0x01ea31f4: jmp    eax
  0x01ea31f6: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea31ff: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3208: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3211: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea321a: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3223: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea322c: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3235: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea323e: frstor [esp]
  0x01ea3241: add    esp,0x6c
  0x01ea3244: add    esp,0xc8
  0x01ea324a: popf   
  0x01ea324b: popa   
  0x01ea324c: pop    ebp
  0x01ea324d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3255: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3258: mov    DWORD PTR [edi+0x16c],0x0
  0x01ea3262: mov    eax,DWORD PTR [edi+0x4]
  0x01ea3265: jmp    0x01dc0340
  0x01ea326a: hlt    
  0x01ea326b: hlt    

Decoding RuntimeStub - ic_miss_stub 0x01ea3288
  0x01ea32d0: push   ebp
  0x01ea32d1: mov    ebp,esp
  0x01ea32d3: pusha  
  0x01ea32d4: pushf  
  0x01ea32d5: sub    esp,0xc8
  0x01ea32db: sub    esp,0x6c
  0x01ea32de: fnsave [esp]
  0x01ea32e1: fwait
  0x01ea32e2: cmp    WORD PTR [esp],0x27f
  0x01ea32e8: je     0x01ea32fb
  0x01ea32ea: push   0x553169bc
  0x01ea32ef: call   0x01ea32f4
  0x01ea32f4: pusha  
  0x01ea32f5: call   0x54dedbf0
  0x01ea32fa: hlt    
  0x01ea32fb: mov    WORD PTR [esp],0x27f
  0x01ea3301: frstor [esp]
  0x01ea3304: fstp   QWORD PTR [esp+0x70]
  0x01ea3308: fstp   QWORD PTR [esp+0x78]
  0x01ea330c: fstp   QWORD PTR [esp+0x80]
  0x01ea3313: fstp   QWORD PTR [esp+0x88]
  0x01ea331a: fstp   QWORD PTR [esp+0x90]
  0x01ea3321: fstp   QWORD PTR [esp+0x98]
  0x01ea3328: fstp   QWORD PTR [esp+0xa0]
  0x01ea332f: fstp   QWORD PTR [esp+0xa8]
  0x01ea3336: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea333f: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea3348: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea3351: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea335a: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea3363: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea336c: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea3375: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea337e: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3386: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3389: push   edi
  0x01ea338a: mov    DWORD PTR [edi+0x144],ebp
  0x01ea3390: mov    DWORD PTR [edi+0x13c],esp
  0x01ea3396: call   0x55218b10
  0x01ea339b: add    esp,0x4
  0x01ea339e: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea33a8: mov    DWORD PTR [edi+0x144],0x0
  0x01ea33b2: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea33b9: jne    0x01ea3436
  0x01ea33bf: mov    ebx,DWORD PTR [edi+0x170]
  0x01ea33c5: mov    DWORD PTR [edi+0x170],0x0
  0x01ea33cf: mov    DWORD PTR [esp+0x148],ebx
  0x01ea33d6: mov    DWORD PTR [esp+0x154],eax
  0x01ea33dd: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea33e6: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea33ef: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea33f8: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3401: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea340a: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3413: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea341c: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3425: frstor [esp]
  0x01ea3428: add    esp,0x6c
  0x01ea342b: add    esp,0xc8
  0x01ea3431: popf   
  0x01ea3432: popa   
  0x01ea3433: pop    ebp
  0x01ea3434: jmp    eax
  0x01ea3436: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea343f: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3448: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3451: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea345a: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3463: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea346c: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3475: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea347e: frstor [esp]
  0x01ea3481: add    esp,0x6c
  0x01ea3484: add    esp,0xc8
  0x01ea348a: popf   
  0x01ea348b: popa   
  0x01ea348c: pop    ebp
  0x01ea348d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3495: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3498: mov    DWORD PTR [edi+0x16c],0x0
  0x01ea34a2: mov    eax,DWORD PTR [edi+0x4]
  0x01ea34a5: jmp    0x01dc0340
  0x01ea34aa: hlt    
  0x01ea34ab: hlt    

Decoding RuntimeStub - resolve_opt_virtual_call 0x01ea34c8
  0x01ea3510: push   ebp
  0x01ea3511: mov    ebp,esp
  0x01ea3513: pusha  
  0x01ea3514: pushf  
  0x01ea3515: sub    esp,0xc8
  0x01ea351b: sub    esp,0x6c
  0x01ea351e: fnsave [esp]
  0x01ea3521: fwait
  0x01ea3522: cmp    WORD PTR [esp],0x27f
  0x01ea3528: je     0x01ea353b
  0x01ea352a: push   0x553169bc
  0x01ea352f: call   0x01ea3534
  0x01ea3534: pusha  
  0x01ea3535: call   0x54dedbf0
  0x01ea353a: hlt    
  0x01ea353b: mov    WORD PTR [esp],0x27f
  0x01ea3541: frstor [esp]
  0x01ea3544: fstp   QWORD PTR [esp+0x70]
  0x01ea3548: fstp   QWORD PTR [esp+0x78]
  0x01ea354c: fstp   QWORD PTR [esp+0x80]
  0x01ea3553: fstp   QWORD PTR [esp+0x88]
  0x01ea355a: fstp   QWORD PTR [esp+0x90]
  0x01ea3561: fstp   QWORD PTR [esp+0x98]
  0x01ea3568: fstp   QWORD PTR [esp+0xa0]
  0x01ea356f: fstp   QWORD PTR [esp+0xa8]
  0x01ea3576: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea357f: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea3588: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea3591: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea359a: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea35a3: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea35ac: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea35b5: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea35be: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea35c6: mov    edi,DWORD PTR [edi-0xc]
  0x01ea35c9: push   edi
  0x01ea35ca: mov    DWORD PTR [edi+0x144],ebp
  0x01ea35d0: mov    DWORD PTR [edi+0x13c],esp
  0x01ea35d6: call   0x55218450
  0x01ea35db: add    esp,0x4
  0x01ea35de: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea35e8: mov    DWORD PTR [edi+0x144],0x0
  0x01ea35f2: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea35f9: jne    0x01ea3676
  0x01ea35ff: mov    ebx,DWORD PTR [edi+0x170]
  0x01ea3605: mov    DWORD PTR [edi+0x170],0x0
  0x01ea360f: mov    DWORD PTR [esp+0x148],ebx
  0x01ea3616: mov    DWORD PTR [esp+0x154],eax
  0x01ea361d: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3626: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea362f: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3638: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3641: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea364a: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3653: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea365c: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3665: frstor [esp]
  0x01ea3668: add    esp,0x6c
  0x01ea366b: add    esp,0xc8
  0x01ea3671: popf   
  0x01ea3672: popa   
  0x01ea3673: pop    ebp
  0x01ea3674: jmp    eax
  0x01ea3676: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea367f: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3688: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3691: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea369a: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea36a3: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea36ac: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea36b5: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea36be: frstor [esp]
  0x01ea36c1: add    esp,0x6c
  0x01ea36c4: add    esp,0xc8
  0x01ea36ca: popf   
  0x01ea36cb: popa   
  0x01ea36cc: pop    ebp
  0x01ea36cd: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea36d5: mov    edi,DWORD PTR [edi-0xc]
  0x01ea36d8: mov    DWORD PTR [edi+0x16c],0x0
  0x01ea36e2: mov    eax,DWORD PTR [edi+0x4]
  0x01ea36e5: jmp    0x01dc0340
  0x01ea36ea: hlt    
  0x01ea36eb: hlt    

Decoding RuntimeStub - resolve_virtual_call 0x01ea3708
  0x01ea3750: push   ebp
  0x01ea3751: mov    ebp,esp
  0x01ea3753: pusha  
  0x01ea3754: pushf  
  0x01ea3755: sub    esp,0xc8
  0x01ea375b: sub    esp,0x6c
  0x01ea375e: fnsave [esp]
  0x01ea3761: fwait
  0x01ea3762: cmp    WORD PTR [esp],0x27f
  0x01ea3768: je     0x01ea377b
  0x01ea376a: push   0x553169bc
  0x01ea376f: call   0x01ea3774
  0x01ea3774: pusha  
  0x01ea3775: call   0x54dedbf0
  0x01ea377a: hlt    
  0x01ea377b: mov    WORD PTR [esp],0x27f
  0x01ea3781: frstor [esp]
  0x01ea3784: fstp   QWORD PTR [esp+0x70]
  0x01ea3788: fstp   QWORD PTR [esp+0x78]
  0x01ea378c: fstp   QWORD PTR [esp+0x80]
  0x01ea3793: fstp   QWORD PTR [esp+0x88]
  0x01ea379a: fstp   QWORD PTR [esp+0x90]
  0x01ea37a1: fstp   QWORD PTR [esp+0x98]
  0x01ea37a8: fstp   QWORD PTR [esp+0xa0]
  0x01ea37af: fstp   QWORD PTR [esp+0xa8]
  0x01ea37b6: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea37bf: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea37c8: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea37d1: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea37da: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea37e3: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea37ec: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea37f5: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea37fe: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3806: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3809: push   edi
  0x01ea380a: mov    DWORD PTR [edi+0x144],ebp
  0x01ea3810: mov    DWORD PTR [edi+0x13c],esp
  0x01ea3816: call   0x55218290
  0x01ea381b: add    esp,0x4
  0x01ea381e: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea3828: mov    DWORD PTR [edi+0x144],0x0
  0x01ea3832: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea3839: jne    0x01ea38b6
  0x01ea383f: mov    ebx,DWORD PTR [edi+0x170]
  0x01ea3845: mov    DWORD PTR [edi+0x170],0x0
  0x01ea384f: mov    DWORD PTR [esp+0x148],ebx
  0x01ea3856: mov    DWORD PTR [esp+0x154],eax
  0x01ea385d: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3866: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea386f: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3878: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3881: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea388a: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3893: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea389c: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea38a5: frstor [esp]
  0x01ea38a8: add    esp,0x6c
  0x01ea38ab: add    esp,0xc8
  0x01ea38b1: popf   
  0x01ea38b2: popa   
  0x01ea38b3: pop    ebp
  0x01ea38b4: jmp    eax
  0x01ea38b6: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea38bf: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea38c8: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea38d1: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea38da: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea38e3: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea38ec: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea38f5: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea38fe: frstor [esp]
  0x01ea3901: add    esp,0x6c
  0x01ea3904: add    esp,0xc8
  0x01ea390a: popf   
  0x01ea390b: popa   
  0x01ea390c: pop    ebp
  0x01ea390d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3915: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3918: mov    DWORD PTR [edi+0x16c],0x0
  0x01ea3922: mov    eax,DWORD PTR [edi+0x4]
  0x01ea3925: jmp    0x01dc0340
  0x01ea392a: hlt    
  0x01ea392b: hlt    

Decoding RuntimeStub - resolve_static_call 0x01ea3948
  0x01ea3990: push   ebp
  0x01ea3991: mov    ebp,esp
  0x01ea3993: pusha  
  0x01ea3994: pushf  
  0x01ea3995: sub    esp,0xc8
  0x01ea399b: sub    esp,0x6c
  0x01ea399e: fnsave [esp]
  0x01ea39a1: fwait
  0x01ea39a2: cmp    WORD PTR [esp],0x27f
  0x01ea39a8: je     0x01ea39bb
  0x01ea39aa: push   0x553169bc
  0x01ea39af: call   0x01ea39b4
  0x01ea39b4: pusha  
  0x01ea39b5: call   0x54dedbf0
  0x01ea39ba: hlt    
  0x01ea39bb: mov    WORD PTR [esp],0x27f
  0x01ea39c1: frstor [esp]
  0x01ea39c4: fstp   QWORD PTR [esp+0x70]
  0x01ea39c8: fstp   QWORD PTR [esp+0x78]
  0x01ea39cc: fstp   QWORD PTR [esp+0x80]
  0x01ea39d3: fstp   QWORD PTR [esp+0x88]
  0x01ea39da: fstp   QWORD PTR [esp+0x90]
  0x01ea39e1: fstp   QWORD PTR [esp+0x98]
  0x01ea39e8: fstp   QWORD PTR [esp+0xa0]
  0x01ea39ef: fstp   QWORD PTR [esp+0xa8]
  0x01ea39f6: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea39ff: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea3a08: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea3a11: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea3a1a: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea3a23: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea3a2c: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea3a35: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea3a3e: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3a46: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3a49: push   edi
  0x01ea3a4a: mov    DWORD PTR [edi+0x144],ebp
  0x01ea3a50: mov    DWORD PTR [edi+0x13c],esp
  0x01ea3a56: call   0x552180d0
  0x01ea3a5b: add    esp,0x4
  0x01ea3a5e: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea3a68: mov    DWORD PTR [edi+0x144],0x0
  0x01ea3a72: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea3a79: jne    0x01ea3af6
  0x01ea3a7f: mov    ebx,DWORD PTR [edi+0x170]
  0x01ea3a85: mov    DWORD PTR [edi+0x170],0x0
  0x01ea3a8f: mov    DWORD PTR [esp+0x148],ebx
  0x01ea3a96: mov    DWORD PTR [esp+0x154],eax
  0x01ea3a9d: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3aa6: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3aaf: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3ab8: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3ac1: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3aca: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3ad3: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3adc: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3ae5: frstor [esp]
  0x01ea3ae8: add    esp,0x6c
  0x01ea3aeb: add    esp,0xc8
  0x01ea3af1: popf   
  0x01ea3af2: popa   
  0x01ea3af3: pop    ebp
  0x01ea3af4: jmp    eax
  0x01ea3af6: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3aff: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3b08: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3b11: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3b1a: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3b23: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3b2c: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3b35: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3b3e: frstor [esp]
  0x01ea3b41: add    esp,0x6c
  0x01ea3b44: add    esp,0xc8
  0x01ea3b4a: popf   
  0x01ea3b4b: popa   
  0x01ea3b4c: pop    ebp
  0x01ea3b4d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3b55: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3b58: mov    DWORD PTR [edi+0x16c],0x0
  0x01ea3b62: mov    eax,DWORD PTR [edi+0x4]
  0x01ea3b65: jmp    0x01dc0340
  0x01ea3b6a: hlt    
  0x01ea3b6b: hlt    

Decoding SafepointBlob 0x01ea3b88
  0x01ea3bd0: push   ebx
  0x01ea3bd1: push   ebp
  0x01ea3bd2: mov    ebp,esp
  0x01ea3bd4: pusha  
  0x01ea3bd5: pushf  
  0x01ea3bd6: sub    esp,0xc8
  0x01ea3bdc: sub    esp,0x6c
  0x01ea3bdf: fnsave [esp]
  0x01ea3be2: fwait
  0x01ea3be3: frstor [esp]
  0x01ea3be6: fldcw  WORD PTR ds:0x55635768
  0x01ea3bec: fstp   QWORD PTR [esp+0x70]
  0x01ea3bf0: fstp   QWORD PTR [esp+0x78]
  0x01ea3bf4: fstp   QWORD PTR [esp+0x80]
  0x01ea3bfb: fstp   QWORD PTR [esp+0x88]
  0x01ea3c02: fstp   QWORD PTR [esp+0x90]
  0x01ea3c09: fstp   QWORD PTR [esp+0x98]
  0x01ea3c10: fstp   QWORD PTR [esp+0xa0]
  0x01ea3c17: fstp   QWORD PTR [esp+0xa8]
  0x01ea3c1e: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea3c27: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea3c30: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea3c39: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea3c42: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea3c4b: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea3c54: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea3c5d: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea3c66: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3c6e: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3c71: push   edi
  0x01ea3c72: mov    DWORD PTR [edi+0x13c],esp
  0x01ea3c78: mov    eax,DWORD PTR [edi+0x190]
  0x01ea3c7e: mov    DWORD PTR [ebp+0x4],eax
  0x01ea3c81: call   0x55210c00
  0x01ea3c86: pop    ecx
  0x01ea3c87: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3c8f: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3c92: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea3c9c: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea3ca3: je     0x01ea3d05
  0x01ea3ca9: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3cb2: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3cbb: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3cc4: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3ccd: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3cd6: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3cdf: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3ce8: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3cf1: frstor [esp]
  0x01ea3cf4: add    esp,0x6c
  0x01ea3cf7: add    esp,0xc8
  0x01ea3cfd: popf   
  0x01ea3cfe: popa   
  0x01ea3cff: pop    ebp
  0x01ea3d00: jmp    0x01dc0340
  0x01ea3d05: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3d0e: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3d17: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3d20: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3d29: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3d32: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3d3b: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3d44: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3d4d: frstor [esp]
  0x01ea3d50: add    esp,0x6c
  0x01ea3d53: add    esp,0xc8
  0x01ea3d59: popf   
  0x01ea3d5a: popa   
  0x01ea3d5b: pop    ebp
  0x01ea3d5c: ret    
  0x01ea3d5d: hlt    
  0x01ea3d5e: hlt    
  0x01ea3d5f: hlt    

Decoding SafepointBlob 0x01ea3d88
  0x01ea3dd0: push   ebp
  0x01ea3dd1: mov    ebp,esp
  0x01ea3dd3: pusha  
  0x01ea3dd4: pushf  
  0x01ea3dd5: sub    esp,0xc8
  0x01ea3ddb: sub    esp,0x6c
  0x01ea3dde: fnsave [esp]
  0x01ea3de1: fwait
  0x01ea3de2: frstor [esp]
  0x01ea3de5: fldcw  WORD PTR ds:0x55635768
  0x01ea3deb: fstp   QWORD PTR [esp+0x70]
  0x01ea3def: fstp   QWORD PTR [esp+0x78]
  0x01ea3df3: fstp   QWORD PTR [esp+0x80]
  0x01ea3dfa: fstp   QWORD PTR [esp+0x88]
  0x01ea3e01: fstp   QWORD PTR [esp+0x90]
  0x01ea3e08: fstp   QWORD PTR [esp+0x98]
  0x01ea3e0f: fstp   QWORD PTR [esp+0xa0]
  0x01ea3e16: fstp   QWORD PTR [esp+0xa8]
  0x01ea3e1d: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea3e26: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea3e2f: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea3e38: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea3e41: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea3e4a: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea3e53: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea3e5c: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea3e65: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3e6d: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3e70: push   edi
  0x01ea3e71: mov    DWORD PTR [edi+0x13c],esp
  0x01ea3e77: call   0x55210c00
  0x01ea3e7c: pop    ecx
  0x01ea3e7d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea3e85: mov    edi,DWORD PTR [edi-0xc]
  0x01ea3e88: mov    DWORD PTR [edi+0x13c],0x0
  0x01ea3e92: cmp    DWORD PTR [edi+0x4],0x0
  0x01ea3e99: je     0x01ea3efb
  0x01ea3e9f: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3ea8: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3eb1: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3eba: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3ec3: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3ecc: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3ed5: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3ede: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3ee7: frstor [esp]
  0x01ea3eea: add    esp,0x6c
  0x01ea3eed: add    esp,0xc8
  0x01ea3ef3: popf   
  0x01ea3ef4: popa   
  0x01ea3ef5: pop    ebp
  0x01ea3ef6: jmp    0x01dc0340
  0x01ea3efb: movdqu xmm0,XMMWORD PTR [esp+0xb0]
  0x01ea3f04: movdqu xmm1,XMMWORD PTR [esp+0xc0]
  0x01ea3f0d: movdqu xmm2,XMMWORD PTR [esp+0xd0]
  0x01ea3f16: movdqu xmm3,XMMWORD PTR [esp+0xe0]
  0x01ea3f1f: movdqu xmm4,XMMWORD PTR [esp+0xf0]
  0x01ea3f28: movdqu xmm5,XMMWORD PTR [esp+0x100]
  0x01ea3f31: movdqu xmm6,XMMWORD PTR [esp+0x110]
  0x01ea3f3a: movdqu xmm7,XMMWORD PTR [esp+0x120]
  0x01ea3f43: frstor [esp]
  0x01ea3f46: add    esp,0x6c
  0x01ea3f49: add    esp,0xc8
  0x01ea3f4f: popf   
  0x01ea3f50: popa   
  0x01ea3f51: pop    ebp
  0x01ea3f52: ret    
  0x01ea3f53: hlt    

Decoding DeoptimizationBlob 0x01ea3f88
  0x01ea4000: push   ebp
  0x01ea4001: mov    ebp,esp
  0x01ea4003: pusha  
  0x01ea4004: pushf  
  0x01ea4005: sub    esp,0xc8
  0x01ea400b: sub    esp,0x6c
  0x01ea400e: fnsave [esp]
  0x01ea4011: fwait
  0x01ea4012: frstor [esp]
  0x01ea4015: fldcw  WORD PTR ds:0x55635768
  0x01ea401b: fstp   QWORD PTR [esp+0x70]
  0x01ea401f: fstp   QWORD PTR [esp+0x78]
  0x01ea4023: fstp   QWORD PTR [esp+0x80]
  0x01ea402a: fstp   QWORD PTR [esp+0x88]
  0x01ea4031: fstp   QWORD PTR [esp+0x90]
  0x01ea4038: fstp   QWORD PTR [esp+0x98]
  0x01ea403f: fstp   QWORD PTR [esp+0xa0]
  0x01ea4046: fstp   QWORD PTR [esp+0xa8]
  0x01ea404d: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea4056: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea405f: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea4068: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea4071: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea407a: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea4083: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea408c: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea4095: push   0x0
  0x01ea409a: jmp    0x01ea4234
  0x01ea409f: push   ebp
  0x01ea40a0: mov    ebp,esp
  0x01ea40a2: pusha  
  0x01ea40a3: pushf  
  0x01ea40a4: sub    esp,0xc8
  0x01ea40aa: sub    esp,0x6c
  0x01ea40ad: fnsave [esp]
  0x01ea40b0: fwait
  0x01ea40b1: frstor [esp]
  0x01ea40b4: fldcw  WORD PTR ds:0x55635768
  0x01ea40ba: fstp   QWORD PTR [esp+0x70]
  0x01ea40be: fstp   QWORD PTR [esp+0x78]
  0x01ea40c2: fstp   QWORD PTR [esp+0x80]
  0x01ea40c9: fstp   QWORD PTR [esp+0x88]
  0x01ea40d0: fstp   QWORD PTR [esp+0x90]
  0x01ea40d7: fstp   QWORD PTR [esp+0x98]
  0x01ea40de: fstp   QWORD PTR [esp+0xa0]
  0x01ea40e5: fstp   QWORD PTR [esp+0xa8]
  0x01ea40ec: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea40f5: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea40fe: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea4107: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea4110: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea4119: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea4122: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea412b: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea4134: push   0x3
  0x01ea4139: jmp    0x01ea4234
  0x01ea413e: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea4146: mov    edi,DWORD PTR [edi-0xc]
  0x01ea4149: mov    DWORD PTR [edi+0x1b0],edx
  0x01ea414f: mov    DWORD PTR [edi+0x1ac],eax
  0x01ea4155: push   0x0
  0x01ea415a: push   ebp
  0x01ea415b: mov    ebp,esp
  0x01ea415d: pusha  
  0x01ea415e: pushf  
  0x01ea415f: sub    esp,0xc8
  0x01ea4165: sub    esp,0x6c
  0x01ea4168: fnsave [esp]
  0x01ea416b: fwait
  0x01ea416c: frstor [esp]
  0x01ea416f: fldcw  WORD PTR ds:0x55635768
  0x01ea4175: fstp   QWORD PTR [esp+0x70]
  0x01ea4179: fstp   QWORD PTR [esp+0x78]
  0x01ea417d: fstp   QWORD PTR [esp+0x80]
  0x01ea4184: fstp   QWORD PTR [esp+0x88]
  0x01ea418b: fstp   QWORD PTR [esp+0x90]
  0x01ea4192: fstp   QWORD PTR [esp+0x98]
  0x01ea4199: fstp   QWORD PTR [esp+0xa0]
  0x01ea41a0: fstp   QWORD PTR [esp+0xa8]
  0x01ea41a7: movdqu XMMWORD PTR [esp+0xb0],xmm0
  0x01ea41b0: movdqu XMMWORD PTR [esp+0xc0],xmm1
  0x01ea41b9: movdqu XMMWORD PTR [esp+0xd0],xmm2
  0x01ea41c2: movdqu XMMWORD PTR [esp+0xe0],xmm3
  0x01ea41cb: movdqu XMMWORD PTR [esp+0xf0],xmm4
  0x01ea41d4: movdqu XMMWORD PTR [esp+0x100],xmm5
  0x01ea41dd: movdqu XMMWORD PTR [esp+0x110],xmm6
  0x01ea41e6: movdqu XMMWORD PTR [esp+0x120],xmm7
  0x01ea41ef: push   0x1
  0x01ea41f4: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01ea41fc: mov    edi,DWORD PTR [edi-0xc]
  0x01ea41ff: mov    edx,DWORD PTR [edi+0x1b0]
  0x01ea4205: mov    DWORD PTR [ebp+0x4],edx
  0x01ea4208: mov    DWORD PTR [edi+0x1b0],0x0
  0x01ea4212: mov    eax,DWORD PTR [edi+0x1ac]
  0x01ea4218: mov    eax,DWORD PTR [edi+0x4]
  0x01ea421b: test   eax,eax
  0x01ea421d: je     0x01ea4234
  0x01ea4223: push   0x55317288
  0x01ea4228: call   0x01ea422d
  0x01ea422d: pusha  
  0x01ea422e: call   0x54dedbf0
  0x01ea4233: hlt    
  0x01ea4234: emms   
  0x01ea4236: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01ea423e: mov    ecx,DWORD PTR [ecx-0xc]
  0x01ea4241: push   ecx
  0x01ea4242: mov    DWORD PTR [ecx+0x13c],esp
  0x01ea4248: call   0x551e1760
  0x01ea424d: pop    ecx
  0x01ea424e: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01ea4256: mov    ecx,DWORD PTR [ecx-0xc]
  0x01ea4259: mov    DWORD PTR [ecx+0x13c],0x0
  0x01ea4263: mov    edi,eax
  0x01ea4265: pop    eax
  0x01ea4266: mov    DWORD PTR [edi+0x30],eax
  0x01ea4269: cmp    eax,0x1
  0x01ea426c: jne    0x01ea42a0
  0x01ea4272: mov    eax,DWORD PTR [ecx+0x1ac]
  0x01ea4278: mov    edx,DWORD PTR [ecx+0x1b0]
  0x01ea427e: mov    DWORD PTR [ecx+0x1ac],0x0
  0x01ea4288: mov    DWORD PTR [ecx+0x1b0],0x0
  0x01ea4292: mov    DWORD PTR [esp+0x154],eax
  0x01ea4299: mov    DWORD PTR [esp+0x14c],edx
  0x01ea42a0: frstor [esp]
  0x01ea42a3: movsd  xmm0,QWORD PTR [esp+0xb0]
  0x01ea42ac: mov    eax,DWORD PTR [esp+0x154]
  0x01ea42b3: mov    edx,DWORD PTR [esp+0x14c]
  0x01ea42ba: add    esp,0x15c
  0x01ea42c0: fldcw  WORD PTR ds:0x55635768
  0x01ea42c6: add    esp,DWORD PTR [edi+0x4]
  0x01ea42c9: mov    ebp,DWORD PTR [edi+0x24]
  0x01ea42cc: mov    ebx,DWORD PTR [edi+0x10]
  0x01ea42cf: mov    ecx,esp
  0x01ea42d1: mov    DWORD PTR [ecx-0x1000],ebx
  0x01ea42d7: sub    ecx,0x1000
  0x01ea42dd: sub    ebx,0x1000
  0x01ea42e3: jg     0x01ea42d1
  0x01ea42e5: mov    DWORD PTR [ecx-0x1000],ebx
  0x01ea42eb: mov    DWORD PTR [ecx-0x2000],ebx
  0x01ea42f1: mov    DWORD PTR [ecx-0x3000],ebx
  0x01ea42f7: mov    DWORD PTR [ecx-0x4000],ebx
  0x01ea42fd: mov    DWORD PTR [ecx-0x5000],ebx
  0x01ea4303: mov    DWORD PTR [ecx-0x6000],ebx
  0x01ea4309: mov    DWORD PTR [ecx-0x7000],ebx
  0x01ea430f: mov    DWORD PTR [ecx-0x8000],ebx
  0x01ea4315: mov    DWORD PTR [ecx-0x9000],ebx
  0x01ea431b: mov    ecx,DWORD PTR [edi+0x18]
  0x01ea431e: pop    esi
  0x01ea431f: mov    esi,DWORD PTR [edi+0x14]
  0x01ea4322: mov    ebx,DWORD PTR [edi+0xc]
  0x01ea4325: mov    DWORD PTR [edi+0x2c],ebx
  0x01ea4328: mov    DWORD PTR [edi+0x34],esp
  0x01ea432b: mov    ebx,DWORD PTR [edi+0x8]
  0x01ea432e: sub    esp,ebx
  0x01ea4330: mov    ebx,DWORD PTR [esi]
  0x01ea4332: sub    ebx,0x8
  0x01ea4335: push   DWORD PTR [ecx]
  0x01ea4337: push   ebp
  0x01ea4338: mov    ebp,esp
  0x01ea433a: sub    esp,ebx
  0x01ea433c: mov    ebx,DWORD PTR [edi+0x34]
  0x01ea433f: mov    DWORD PTR [ebp-0x8],0x0
  0x01ea4346: mov    DWORD PTR [ebp-0x4],ebx
  0x01ea4349: mov    DWORD PTR [edi+0x34],esp
  0x01ea434c: add    esi,0x4
  0x01ea434f: add    ecx,0x4
  0x01ea4352: dec    DWORD PTR [edi+0x2c]
  0x01ea4355: jne    0x01ea4330
  0x01ea4357: push   DWORD PTR [ecx]
  0x01ea4359: push   ebp
  0x01ea435a: mov    ebp,esp
  0x01ea435c: sub    esp,0x158
  0x01ea4362: mov    DWORD PTR [esp+0x154],eax
  0x01ea4369: mov    DWORD PTR [esp+0x14c],edx
  0x01ea4370: fstp   QWORD PTR [esp+0x70]
  0x01ea4374: movsd  QWORD PTR [esp+0xb0],xmm0
  0x01ea437d: push   DWORD PTR [edi+0x30]
  0x01ea4380: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01ea4388: mov    ecx,DWORD PTR [ecx-0xc]
  0x01ea438b: push   ecx
  0x01ea438c: mov    DWORD PTR [ecx+0x144],ebp
  0x01ea4392: mov    DWORD PTR [ecx+0x13c],esp
  0x01ea4398: call   0x551e1840
  0x01ea439d: push   eax
  0x01ea439e: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01ea43a6: mov    ecx,DWORD PTR [ecx-0xc]
  0x01ea43a9: mov    DWORD PTR [ecx+0x13c],0x0
  0x01ea43b3: mov    eax,DWORD PTR [esp+0x160]
  0x01ea43ba: mov    edx,DWORD PTR [esp+0x158]
  0x01ea43c1: emms   
  0x01ea43c3: cmp    DWORD PTR [esp],0x7
  0x01ea43ca: je     0x01ea43eb
  0x01ea43d0: cmp    DWORD PTR [esp],0x6
  0x01ea43d7: jne    0x01ea43f4
  0x01ea43dd: movss  xmm0,DWORD PTR [esp+0xbc]
  0x01ea43e6: jmp    0x01ea43f4
  0x01ea43eb: movsd  xmm0,QWORD PTR [esp+0xbc]
  0x01ea43f4: mov    esp,ebp
  0x01ea43f6: pop    ebp
  0x01ea43f7: ret    

AHE@0x0422b92c: 0x i2c: 0x01dc2770 c2i: 0x01dc27f9 c2iUV: 0x01dc27d8
i2c argument handler #0 for: static ()V (207 bytes generated)
c2i argument handler starts at 01DC27F9
  0x01dc2770: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01dc2773: mov    edi,0x1dc2940
  0x01dc2778: cmp    eax,edi
  0x01dc277a: jbe    0x01dc278d
  0x01dc2780: mov    edi,0x1ea2940
  0x01dc2785: cmp    eax,edi
  0x01dc2787: jb     0x01dc27b8
  0x01dc278d: mov    edi,0x1dc0340
  0x01dc2792: cmp    eax,edi
  0x01dc2794: jbe    0x01dc27a7
  0x01dc279a: mov    edi,0x1dc2668
  0x01dc279f: cmp    eax,edi
  0x01dc27a1: jb     0x01dc27b8
  ;; i2c adapter must return to an interpreter frame
  0x01dc27a7: push   0x5531723c
  0x01dc27ac: call   0x01dc27b1
  0x01dc27b1: pusha  
  0x01dc27b2: call   0x54dedbf0
  0x01dc27b7: hlt    
  ;; } verify_i2ce 
  0x01dc27b8: mov    edi,esp
  0x01dc27ba: and    esp,0xfffffff0
  0x01dc27bd: push   eax
  0x01dc27be: mov    eax,edi
  0x01dc27c0: mov    edi,DWORD PTR [ebx+0x2c]
  0x01dc27c3: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01dc27cb: mov    eax,DWORD PTR [eax-0xc]
  0x01dc27ce: mov    DWORD PTR [eax+0x168],ebx
  0x01dc27d4: mov    eax,ebx
  0x01dc27d6: jmp    edi
  0x01dc27d8: mov    ebx,DWORD PTR [ecx+0x4]
  0x01dc27db: cmp    ebx,DWORD PTR [eax+0x8]
  0x01dc27de: mov    ebx,DWORD PTR [eax+0x4]
  0x01dc27e1: jne    0x01dc27f4
  0x01dc27e7: cmp    DWORD PTR [ebx+0x30],0x0
  0x01dc27ee: je     0x01dc2833
  0x01dc27f4: jmp    0x01ea32d0
  0x01dc27f9: cmp    DWORD PTR [ebx+0x30],0x0
  0x01dc2800: je     0x01dc2833
  0x01dc2806: mov    eax,DWORD PTR [esp]
  0x01dc2809: pusha  
  0x01dc280a: pushf  
  0x01dc280b: sub    esp,0x10
  0x01dc280e: movsd  QWORD PTR [esp],xmm0
  0x01dc2813: movsd  QWORD PTR [esp+0x8],xmm1
  0x01dc2819: push   eax
  0x01dc281a: push   ebx
  0x01dc281b: call   0x552179d0
  0x01dc2820: add    esp,0x8
  0x01dc2823: movsd  xmm0,QWORD PTR [esp]
  0x01dc2828: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01dc282e: add    esp,0x10
  0x01dc2831: popf   
  0x01dc2832: popa   
  0x01dc2833: pop    eax
  0x01dc2834: mov    esi,esp
  0x01dc2836: sub    esp,0x0
  0x01dc2839: mov    ecx,DWORD PTR [ebx+0x24]
  0x01dc283c: push   eax
  0x01dc283d: jmp    ecx

AHE@0x0422b958: 0xa0000000 i2c: 0x01ea2cf0 c2i: 0x01ea2d7c c2iUV: 0x01ea2d5b
i2c argument handler #1 for: receiver ()V (213 bytes generated)
c2i argument handler starts at 01EA2D7C
  0x01ea2cf0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ea2cf3: mov    edi,0x1dc2940
  0x01ea2cf8: cmp    eax,edi
  0x01ea2cfa: jbe    0x01ea2d0d
  0x01ea2d00: mov    edi,0x1ea2940
  0x01ea2d05: cmp    eax,edi
  0x01ea2d07: jb     0x01ea2d38
  0x01ea2d0d: mov    edi,0x1dc0340
  0x01ea2d12: cmp    eax,edi
  0x01ea2d14: jbe    0x01ea2d27
  0x01ea2d1a: mov    edi,0x1dc2668
  0x01ea2d1f: cmp    eax,edi
  0x01ea2d21: jb     0x01ea2d38
  ;; i2c adapter must return to an interpreter frame
  0x01ea2d27: push   0x5531723c
  0x01ea2d2c: call   0x01ea2d31
  0x01ea2d31: pusha  
  0x01ea2d32: call   0x54dedbf0
  0x01ea2d37: hlt    
  ;; } verify_i2ce 
  0x01ea2d38: mov    edi,esp
  0x01ea2d3a: and    esp,0xfffffff0
  0x01ea2d3d: push   eax
  0x01ea2d3e: mov    eax,edi
  0x01ea2d40: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ea2d43: mov    ecx,DWORD PTR [eax+0x4]
  0x01ea2d46: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ea2d4e: mov    eax,DWORD PTR [eax-0xc]
  0x01ea2d51: mov    DWORD PTR [eax+0x168],ebx
  0x01ea2d57: mov    eax,ebx
  0x01ea2d59: jmp    edi
  0x01ea2d5b: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ea2d5e: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ea2d61: mov    ebx,DWORD PTR [eax+0x4]
  0x01ea2d64: jne    0x01ea2d77
  0x01ea2d6a: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ea2d71: je     0x01ea2db6
  0x01ea2d77: jmp    0x01ea32d0
  0x01ea2d7c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ea2d83: je     0x01ea2db6
  0x01ea2d89: mov    eax,DWORD PTR [esp]
  0x01ea2d8c: pusha  
  0x01ea2d8d: pushf  
  0x01ea2d8e: sub    esp,0x10
  0x01ea2d91: movsd  QWORD PTR [esp],xmm0
  0x01ea2d96: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ea2d9c: push   eax
  0x01ea2d9d: push   ebx
  0x01ea2d9e: call   0x552179d0
  0x01ea2da3: add    esp,0x8
  0x01ea2da6: movsd  xmm0,QWORD PTR [esp]
  0x01ea2dab: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ea2db1: add    esp,0x10
  0x01ea2db4: popf   
  0x01ea2db5: popa   
  0x01ea2db6: pop    eax
  0x01ea2db7: mov    esi,esp
  0x01ea2db9: sub    esp,0x4
  0x01ea2dbc: mov    DWORD PTR [esp],ecx
  0x01ea2dbf: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ea2dc2: push   eax
  0x01ea2dc3: jmp    ecx

AHE@0x0422b984: 0xaa000000 i2c: 0x01ea2b70 c2i: 0x01ea2bff c2iUV: 0x01ea2bde
i2c argument handler #2 for: receiver (Ljava/lang/Object;)Z (220 bytes generated)
c2i argument handler starts at 01EA2BFF
  0x01ea2b70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ea2b73: mov    edi,0x1dc2940
  0x01ea2b78: cmp    eax,edi
  0x01ea2b7a: jbe    0x01ea2b8d
  0x01ea2b80: mov    edi,0x1ea2940
  0x01ea2b85: cmp    eax,edi
  0x01ea2b87: jb     0x01ea2bb8
  0x01ea2b8d: mov    edi,0x1dc0340
  0x01ea2b92: cmp    eax,edi
  0x01ea2b94: jbe    0x01ea2ba7
  0x01ea2b9a: mov    edi,0x1dc2668
  0x01ea2b9f: cmp    eax,edi
  0x01ea2ba1: jb     0x01ea2bb8
  ;; i2c adapter must return to an interpreter frame
  0x01ea2ba7: push   0x5531723c
  0x01ea2bac: call   0x01ea2bb1
  0x01ea2bb1: pusha  
  0x01ea2bb2: call   0x54dedbf0
  0x01ea2bb7: hlt    
  ;; } verify_i2ce 
  0x01ea2bb8: mov    edi,esp
  0x01ea2bba: and    esp,0xfffffff0
  0x01ea2bbd: push   eax
  0x01ea2bbe: mov    eax,edi
  0x01ea2bc0: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ea2bc3: mov    ecx,DWORD PTR [eax+0x8]
  0x01ea2bc6: mov    edx,DWORD PTR [eax+0x4]
  0x01ea2bc9: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ea2bd1: mov    eax,DWORD PTR [eax-0xc]
  0x01ea2bd4: mov    DWORD PTR [eax+0x168],ebx
  0x01ea2bda: mov    eax,ebx
  0x01ea2bdc: jmp    edi
  0x01ea2bde: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ea2be1: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ea2be4: mov    ebx,DWORD PTR [eax+0x4]
  0x01ea2be7: jne    0x01ea2bfa
  0x01ea2bed: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ea2bf4: je     0x01ea2c39
  0x01ea2bfa: jmp    0x01ea32d0
  0x01ea2bff: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ea2c06: je     0x01ea2c39
  0x01ea2c0c: mov    eax,DWORD PTR [esp]
  0x01ea2c0f: pusha  
  0x01ea2c10: pushf  
  0x01ea2c11: sub    esp,0x10
  0x01ea2c14: movsd  QWORD PTR [esp],xmm0
  0x01ea2c19: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ea2c1f: push   eax
  0x01ea2c20: push   ebx
  0x01ea2c21: call   0x552179d0
  0x01ea2c26: add    esp,0x8
  0x01ea2c29: movsd  xmm0,QWORD PTR [esp]
  0x01ea2c2e: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ea2c34: add    esp,0x10
  0x01ea2c37: popf   
  0x01ea2c38: popa   
  0x01ea2c39: pop    eax
  0x01ea2c3a: mov    esi,esp
  0x01ea2c3c: sub    esp,0x8
  0x01ea2c3f: mov    DWORD PTR [esp+0x4],ecx
  0x01ea2c43: mov    DWORD PTR [esp],edx
  0x01ea2c46: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ea2c49: push   eax
  0x01ea2c4a: jmp    ecx

AHE@0x0422b9b0: 0xabe00000 i2c: 0x01ea29f0 c2i: 0x01ea2a8d c2iUV: 0x01ea2a6c
i2c argument handler #3 for: receiver (J)V (246 bytes generated)
c2i argument handler starts at 01EA2A8D
  0x01ea29f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ea29f3: mov    edi,0x1dc2940
  0x01ea29f8: cmp    eax,edi
  0x01ea29fa: jbe    0x01ea2a0d
  0x01ea2a00: mov    edi,0x1ea2940
  0x01ea2a05: cmp    eax,edi
  0x01ea2a07: jb     0x01ea2a38
  0x01ea2a0d: mov    edi,0x1dc0340
  0x01ea2a12: cmp    eax,edi
  0x01ea2a14: jbe    0x01ea2a27
  0x01ea2a1a: mov    edi,0x1dc2668
  0x01ea2a1f: cmp    eax,edi
  0x01ea2a21: jb     0x01ea2a38
  ;; i2c adapter must return to an interpreter frame
  0x01ea2a27: push   0x5531723c
  0x01ea2a2c: call   0x01ea2a31
  0x01ea2a31: pusha  
  0x01ea2a32: call   0x54dedbf0
  0x01ea2a37: hlt    
  ;; } verify_i2ce 
  0x01ea2a38: mov    edi,esp
  0x01ea2a3a: sub    esp,0x8
  0x01ea2a3d: and    esp,0xfffffff0
  0x01ea2a40: push   eax
  0x01ea2a41: mov    eax,edi
  0x01ea2a43: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ea2a46: mov    ecx,DWORD PTR [eax+0xc]
  0x01ea2a49: mov    esi,DWORD PTR [eax+0x4]
  0x01ea2a4c: mov    DWORD PTR [esp+0x4],esi
  0x01ea2a50: mov    esi,DWORD PTR [eax+0x8]
  0x01ea2a53: mov    DWORD PTR [esp+0x8],esi
  0x01ea2a57: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ea2a5f: mov    eax,DWORD PTR [eax-0xc]
  0x01ea2a62: mov    DWORD PTR [eax+0x168],ebx
  0x01ea2a68: mov    eax,ebx
  0x01ea2a6a: jmp    edi
  0x01ea2a6c: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ea2a6f: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ea2a72: mov    ebx,DWORD PTR [eax+0x4]
  0x01ea2a75: jne    0x01ea2a88
  0x01ea2a7b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ea2a82: je     0x01ea2ac7
  0x01ea2a88: jmp    0x01ea32d0
  0x01ea2a8d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ea2a94: je     0x01ea2ac7
  0x01ea2a9a: mov    eax,DWORD PTR [esp]
  0x01ea2a9d: pusha  
  0x01ea2a9e: pushf  
  0x01ea2a9f: sub    esp,0x10
  0x01ea2aa2: movsd  QWORD PTR [esp],xmm0
  0x01ea2aa7: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ea2aad: push   eax
  0x01ea2aae: push   ebx
  0x01ea2aaf: call   0x552179d0
  0x01ea2ab4: add    esp,0x8
  0x01ea2ab7: movsd  xmm0,QWORD PTR [esp]
  0x01ea2abc: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ea2ac2: add    esp,0x10
  0x01ea2ac5: popf   
  0x01ea2ac6: popa   
  0x01ea2ac7: pop    eax
  0x01ea2ac8: mov    esi,esp
  0x01ea2aca: sub    esp,0xc
  0x01ea2acd: mov    DWORD PTR [esp+0x8],ecx
  0x01ea2ad1: mov    edi,DWORD PTR [esp+0xc]
  0x01ea2ad5: mov    DWORD PTR [esp],edi
  0x01ea2ad8: mov    edi,DWORD PTR [esp+0x10]
  0x01ea2adc: mov    DWORD PTR [esp+0x4],edi
  0x01ea2ae0: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ea2ae3: push   eax
  0x01ea2ae4: jmp    ecx

AHE@0x0422b9dc: 0xabea0000 i2c: 0x01eaacf0 c2i: 0x01eaad90 c2iUV: 0x01eaad6f
i2c argument handler #4 for: receiver (JI)V (253 bytes generated)
c2i argument handler starts at 01EAAD90
  0x01eaacf0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eaacf3: mov    edi,0x1dc2940
  0x01eaacf8: cmp    eax,edi
  0x01eaacfa: jbe    0x01eaad0d
  0x01eaad00: mov    edi,0x1ea2940
  0x01eaad05: cmp    eax,edi
  0x01eaad07: jb     0x01eaad38
  0x01eaad0d: mov    edi,0x1dc0340
  0x01eaad12: cmp    eax,edi
  0x01eaad14: jbe    0x01eaad27
  0x01eaad1a: mov    edi,0x1dc2668
  0x01eaad1f: cmp    eax,edi
  0x01eaad21: jb     0x01eaad38
  ;; i2c adapter must return to an interpreter frame
  0x01eaad27: push   0x5531723c
  0x01eaad2c: call   0x01eaad31
  0x01eaad31: pusha  
  0x01eaad32: call   0x54dedbf0
  0x01eaad37: hlt    
  ;; } verify_i2ce 
  0x01eaad38: mov    edi,esp
  0x01eaad3a: sub    esp,0x8
  0x01eaad3d: and    esp,0xfffffff0
  0x01eaad40: push   eax
  0x01eaad41: mov    eax,edi
  0x01eaad43: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eaad46: mov    ecx,DWORD PTR [eax+0x10]
  0x01eaad49: mov    esi,DWORD PTR [eax+0x8]
  0x01eaad4c: mov    DWORD PTR [esp+0x4],esi
  0x01eaad50: mov    esi,DWORD PTR [eax+0xc]
  0x01eaad53: mov    DWORD PTR [esp+0x8],esi
  0x01eaad57: mov    edx,DWORD PTR [eax+0x4]
  0x01eaad5a: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eaad62: mov    eax,DWORD PTR [eax-0xc]
  0x01eaad65: mov    DWORD PTR [eax+0x168],ebx
  0x01eaad6b: mov    eax,ebx
  0x01eaad6d: jmp    edi
  0x01eaad6f: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eaad72: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eaad75: mov    ebx,DWORD PTR [eax+0x4]
  0x01eaad78: jne    0x01eaad8b
  0x01eaad7e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaad85: je     0x01eaadca
  0x01eaad8b: jmp    0x01ea32d0
  0x01eaad90: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaad97: je     0x01eaadca
  0x01eaad9d: mov    eax,DWORD PTR [esp]
  0x01eaada0: pusha  
  0x01eaada1: pushf  
  0x01eaada2: sub    esp,0x10
  0x01eaada5: movsd  QWORD PTR [esp],xmm0
  0x01eaadaa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eaadb0: push   eax
  0x01eaadb1: push   ebx
  0x01eaadb2: call   0x552179d0
  0x01eaadb7: add    esp,0x8
  0x01eaadba: movsd  xmm0,QWORD PTR [esp]
  0x01eaadbf: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eaadc5: add    esp,0x10
  0x01eaadc8: popf   
  0x01eaadc9: popa   
  0x01eaadca: pop    eax
  0x01eaadcb: mov    esi,esp
  0x01eaadcd: sub    esp,0x10
  0x01eaadd0: mov    DWORD PTR [esp+0xc],ecx
  0x01eaadd4: mov    edi,DWORD PTR [esp+0x10]
  0x01eaadd8: mov    DWORD PTR [esp+0x4],edi
  0x01eaaddc: mov    edi,DWORD PTR [esp+0x14]
  0x01eaade0: mov    DWORD PTR [esp+0x8],edi
  0x01eaade4: mov    DWORD PTR [esp],edx
  0x01eaade7: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eaadea: push   eax
  0x01eaadeb: jmp    ecx

AHE@0x0422ba08: 0xaaaaaa00 i2c: 0x01eaae70 c2i: 0x01eaaf1e c2iUV: 0x01eaaefd
i2c argument handler #5 for: receiver (Ljava/lang/Throwable$PrintStreamOrWriter;[Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V (283 bytes generated)
c2i argument handler starts at 01EAAF1E
  0x01eaae70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eaae73: mov    edi,0x1dc2940
  0x01eaae78: cmp    eax,edi
  0x01eaae7a: jbe    0x01eaae8d
  0x01eaae80: mov    edi,0x1ea2940
  0x01eaae85: cmp    eax,edi
  0x01eaae87: jb     0x01eaaeb8
  0x01eaae8d: mov    edi,0x1dc0340
  0x01eaae92: cmp    eax,edi
  0x01eaae94: jbe    0x01eaaea7
  0x01eaae9a: mov    edi,0x1dc2668
  0x01eaae9f: cmp    eax,edi
  0x01eaaea1: jb     0x01eaaeb8
  ;; i2c adapter must return to an interpreter frame
  0x01eaaea7: push   0x5531723c
  0x01eaaeac: call   0x01eaaeb1
  0x01eaaeb1: pusha  
  0x01eaaeb2: call   0x54dedbf0
  0x01eaaeb7: hlt    
  ;; } verify_i2ce 
  0x01eaaeb8: mov    edi,esp
  0x01eaaeba: sub    esp,0x10
  0x01eaaebd: and    esp,0xfffffff0
  0x01eaaec0: push   eax
  0x01eaaec1: mov    eax,edi
  0x01eaaec3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eaaec6: mov    ecx,DWORD PTR [eax+0x18]
  0x01eaaec9: mov    edx,DWORD PTR [eax+0x14]
  0x01eaaecc: mov    esi,DWORD PTR [eax+0x10]
  0x01eaaecf: mov    DWORD PTR [esp+0x4],esi
  0x01eaaed3: mov    esi,DWORD PTR [eax+0xc]
  0x01eaaed6: mov    DWORD PTR [esp+0x8],esi
  0x01eaaeda: mov    esi,DWORD PTR [eax+0x8]
  0x01eaaedd: mov    DWORD PTR [esp+0xc],esi
  0x01eaaee1: mov    esi,DWORD PTR [eax+0x4]
  0x01eaaee4: mov    DWORD PTR [esp+0x10],esi
  0x01eaaee8: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eaaef0: mov    eax,DWORD PTR [eax-0xc]
  0x01eaaef3: mov    DWORD PTR [eax+0x168],ebx
  0x01eaaef9: mov    eax,ebx
  0x01eaaefb: jmp    edi
  0x01eaaefd: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eaaf00: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eaaf03: mov    ebx,DWORD PTR [eax+0x4]
  0x01eaaf06: jne    0x01eaaf19
  0x01eaaf0c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaaf13: je     0x01eaaf58
  0x01eaaf19: jmp    0x01ea32d0
  0x01eaaf1e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaaf25: je     0x01eaaf58
  0x01eaaf2b: mov    eax,DWORD PTR [esp]
  0x01eaaf2e: pusha  
  0x01eaaf2f: pushf  
  0x01eaaf30: sub    esp,0x10
  0x01eaaf33: movsd  QWORD PTR [esp],xmm0
  0x01eaaf38: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eaaf3e: push   eax
  0x01eaaf3f: push   ebx
  0x01eaaf40: call   0x552179d0
  0x01eaaf45: add    esp,0x8
  0x01eaaf48: movsd  xmm0,QWORD PTR [esp]
  0x01eaaf4d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eaaf53: add    esp,0x10
  0x01eaaf56: popf   
  0x01eaaf57: popa   
  0x01eaaf58: pop    eax
  0x01eaaf59: mov    esi,esp
  0x01eaaf5b: sub    esp,0x18
  0x01eaaf5e: mov    DWORD PTR [esp+0x14],ecx
  0x01eaaf62: mov    DWORD PTR [esp+0x10],edx
  0x01eaaf66: mov    edi,DWORD PTR [esp+0x18]
  0x01eaaf6a: mov    DWORD PTR [esp+0xc],edi
  0x01eaaf6e: mov    edi,DWORD PTR [esp+0x1c]
  0x01eaaf72: mov    DWORD PTR [esp+0x8],edi
  0x01eaaf76: mov    edi,DWORD PTR [esp+0x20]
  0x01eaaf7a: mov    DWORD PTR [esp+0x4],edi
  0x01eaaf7e: mov    edi,DWORD PTR [esp+0x24]
  0x01eaaf82: mov    DWORD PTR [esp],edi
  0x01eaaf85: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eaaf88: push   eax
  0x01eaaf89: jmp    ecx

AHE@0x0422ba34: 0xaaa00000 i2c: 0x01eab030 c2i: 0x01eab0c9 c2iUV: 0x01eab0a8
i2c argument handler #6 for: receiver (Ljava/lang/String;Ljava/lang/Throwable;)V (238 bytes generated)
c2i argument handler starts at 01EAB0C9
  0x01eab030: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab033: mov    edi,0x1dc2940
  0x01eab038: cmp    eax,edi
  0x01eab03a: jbe    0x01eab04d
  0x01eab040: mov    edi,0x1ea2940
  0x01eab045: cmp    eax,edi
  0x01eab047: jb     0x01eab078
  0x01eab04d: mov    edi,0x1dc0340
  0x01eab052: cmp    eax,edi
  0x01eab054: jbe    0x01eab067
  0x01eab05a: mov    edi,0x1dc2668
  0x01eab05f: cmp    eax,edi
  0x01eab061: jb     0x01eab078
  ;; i2c adapter must return to an interpreter frame
  0x01eab067: push   0x5531723c
  0x01eab06c: call   0x01eab071
  0x01eab071: pusha  
  0x01eab072: call   0x54dedbf0
  0x01eab077: hlt    
  ;; } verify_i2ce 
  0x01eab078: mov    edi,esp
  0x01eab07a: sub    esp,0x8
  0x01eab07d: and    esp,0xfffffff0
  0x01eab080: push   eax
  0x01eab081: mov    eax,edi
  0x01eab083: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eab086: mov    ecx,DWORD PTR [eax+0xc]
  0x01eab089: mov    edx,DWORD PTR [eax+0x8]
  0x01eab08c: mov    esi,DWORD PTR [eax+0x4]
  0x01eab08f: mov    DWORD PTR [esp+0x4],esi
  0x01eab093: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eab09b: mov    eax,DWORD PTR [eax-0xc]
  0x01eab09e: mov    DWORD PTR [eax+0x168],ebx
  0x01eab0a4: mov    eax,ebx
  0x01eab0a6: jmp    edi
  0x01eab0a8: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eab0ab: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eab0ae: mov    ebx,DWORD PTR [eax+0x4]
  0x01eab0b1: jne    0x01eab0c4
  0x01eab0b7: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab0be: je     0x01eab103
  0x01eab0c4: jmp    0x01ea32d0
  0x01eab0c9: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab0d0: je     0x01eab103
  0x01eab0d6: mov    eax,DWORD PTR [esp]
  0x01eab0d9: pusha  
  0x01eab0da: pushf  
  0x01eab0db: sub    esp,0x10
  0x01eab0de: movsd  QWORD PTR [esp],xmm0
  0x01eab0e3: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eab0e9: push   eax
  0x01eab0ea: push   ebx
  0x01eab0eb: call   0x552179d0
  0x01eab0f0: add    esp,0x8
  0x01eab0f3: movsd  xmm0,QWORD PTR [esp]
  0x01eab0f8: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eab0fe: add    esp,0x10
  0x01eab101: popf   
  0x01eab102: popa   
  0x01eab103: pop    eax
  0x01eab104: mov    esi,esp
  0x01eab106: sub    esp,0xc
  0x01eab109: mov    DWORD PTR [esp+0x8],ecx
  0x01eab10d: mov    DWORD PTR [esp+0x4],edx
  0x01eab111: mov    edi,DWORD PTR [esp+0xc]
  0x01eab115: mov    DWORD PTR [esp],edi
  0x01eab118: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eab11b: push   eax
  0x01eab11c: jmp    ecx

AHE@0x0422ba60: 0xaaaaa000 i2c: 0x01eab1b0 c2i: 0x01eab257 c2iUV: 0x01eab236
i2c argument handler #7 for: receiver (Ljava/lang/String;Ljava/lang/Throwable;ZZ)V (268 bytes generated)
c2i argument handler starts at 01EAB257
  0x01eab1b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab1b3: mov    edi,0x1dc2940
  0x01eab1b8: cmp    eax,edi
  0x01eab1ba: jbe    0x01eab1cd
  0x01eab1c0: mov    edi,0x1ea2940
  0x01eab1c5: cmp    eax,edi
  0x01eab1c7: jb     0x01eab1f8
  0x01eab1cd: mov    edi,0x1dc0340
  0x01eab1d2: cmp    eax,edi
  0x01eab1d4: jbe    0x01eab1e7
  0x01eab1da: mov    edi,0x1dc2668
  0x01eab1df: cmp    eax,edi
  0x01eab1e1: jb     0x01eab1f8
  ;; i2c adapter must return to an interpreter frame
  0x01eab1e7: push   0x5531723c
  0x01eab1ec: call   0x01eab1f1
  0x01eab1f1: pusha  
  0x01eab1f2: call   0x54dedbf0
  0x01eab1f7: hlt    
  ;; } verify_i2ce 
  0x01eab1f8: mov    edi,esp
  0x01eab1fa: sub    esp,0x10
  0x01eab1fd: and    esp,0xfffffff0
  0x01eab200: push   eax
  0x01eab201: mov    eax,edi
  0x01eab203: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eab206: mov    ecx,DWORD PTR [eax+0x14]
  0x01eab209: mov    edx,DWORD PTR [eax+0x10]
  0x01eab20c: mov    esi,DWORD PTR [eax+0xc]
  0x01eab20f: mov    DWORD PTR [esp+0x4],esi
  0x01eab213: mov    esi,DWORD PTR [eax+0x8]
  0x01eab216: mov    DWORD PTR [esp+0x8],esi
  0x01eab21a: mov    esi,DWORD PTR [eax+0x4]
  0x01eab21d: mov    DWORD PTR [esp+0xc],esi
  0x01eab221: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eab229: mov    eax,DWORD PTR [eax-0xc]
  0x01eab22c: mov    DWORD PTR [eax+0x168],ebx
  0x01eab232: mov    eax,ebx
  0x01eab234: jmp    edi
  0x01eab236: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eab239: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eab23c: mov    ebx,DWORD PTR [eax+0x4]
  0x01eab23f: jne    0x01eab252
  0x01eab245: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab24c: je     0x01eab291
  0x01eab252: jmp    0x01ea32d0
  0x01eab257: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab25e: je     0x01eab291
  0x01eab264: mov    eax,DWORD PTR [esp]
  0x01eab267: pusha  
  0x01eab268: pushf  
  0x01eab269: sub    esp,0x10
  0x01eab26c: movsd  QWORD PTR [esp],xmm0
  0x01eab271: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eab277: push   eax
  0x01eab278: push   ebx
  0x01eab279: call   0x552179d0
  0x01eab27e: add    esp,0x8
  0x01eab281: movsd  xmm0,QWORD PTR [esp]
  0x01eab286: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eab28c: add    esp,0x10
  0x01eab28f: popf   
  0x01eab290: popa   
  0x01eab291: pop    eax
  0x01eab292: mov    esi,esp
  0x01eab294: sub    esp,0x14
  0x01eab297: mov    DWORD PTR [esp+0x10],ecx
  0x01eab29b: mov    DWORD PTR [esp+0xc],edx
  0x01eab29f: mov    edi,DWORD PTR [esp+0x14]
  0x01eab2a3: mov    DWORD PTR [esp+0x8],edi
  0x01eab2a7: mov    edi,DWORD PTR [esp+0x18]
  0x01eab2ab: mov    DWORD PTR [esp+0x4],edi
  0x01eab2af: mov    edi,DWORD PTR [esp+0x1c]
  0x01eab2b3: mov    DWORD PTR [esp],edi
  0x01eab2b6: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eab2b9: push   eax
  0x01eab2ba: jmp    ecx

AHE@0x0422ba8c: 0xaabebea0 i2c: 0x01eab330 c2i: 0x01eab3e5 c2iUV: 0x01eab3c4
i2c argument handler #8 for: receiver (Ljava/lang/Object;JJB)V (298 bytes generated)
c2i argument handler starts at 01EAB3E5
  0x01eab330: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab333: mov    edi,0x1dc2940
  0x01eab338: cmp    eax,edi
  0x01eab33a: jbe    0x01eab34d
  0x01eab340: mov    edi,0x1ea2940
  0x01eab345: cmp    eax,edi
  0x01eab347: jb     0x01eab378
  0x01eab34d: mov    edi,0x1dc0340
  0x01eab352: cmp    eax,edi
  0x01eab354: jbe    0x01eab367
  0x01eab35a: mov    edi,0x1dc2668
  0x01eab35f: cmp    eax,edi
  0x01eab361: jb     0x01eab378
  ;; i2c adapter must return to an interpreter frame
  0x01eab367: push   0x5531723c
  0x01eab36c: call   0x01eab371
  0x01eab371: pusha  
  0x01eab372: call   0x54dedbf0
  0x01eab377: hlt    
  ;; } verify_i2ce 
  0x01eab378: mov    edi,esp
  0x01eab37a: sub    esp,0x18
  0x01eab37d: and    esp,0xfffffff0
  0x01eab380: push   eax
  0x01eab381: mov    eax,edi
  0x01eab383: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eab386: mov    ecx,DWORD PTR [eax+0x1c]
  0x01eab389: mov    edx,DWORD PTR [eax+0x18]
  0x01eab38c: mov    esi,DWORD PTR [eax+0x10]
  0x01eab38f: mov    DWORD PTR [esp+0x4],esi
  0x01eab393: mov    esi,DWORD PTR [eax+0x14]
  0x01eab396: mov    DWORD PTR [esp+0x8],esi
  0x01eab39a: mov    esi,DWORD PTR [eax+0x8]
  0x01eab39d: mov    DWORD PTR [esp+0xc],esi
  0x01eab3a1: mov    esi,DWORD PTR [eax+0xc]
  0x01eab3a4: mov    DWORD PTR [esp+0x10],esi
  0x01eab3a8: mov    esi,DWORD PTR [eax+0x4]
  0x01eab3ab: mov    DWORD PTR [esp+0x14],esi
  0x01eab3af: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eab3b7: mov    eax,DWORD PTR [eax-0xc]
  0x01eab3ba: mov    DWORD PTR [eax+0x168],ebx
  0x01eab3c0: mov    eax,ebx
  0x01eab3c2: jmp    edi
  0x01eab3c4: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eab3c7: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eab3ca: mov    ebx,DWORD PTR [eax+0x4]
  0x01eab3cd: jne    0x01eab3e0
  0x01eab3d3: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab3da: je     0x01eab41f
  0x01eab3e0: jmp    0x01ea32d0
  0x01eab3e5: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab3ec: je     0x01eab41f
  0x01eab3f2: mov    eax,DWORD PTR [esp]
  0x01eab3f5: pusha  
  0x01eab3f6: pushf  
  0x01eab3f7: sub    esp,0x10
  0x01eab3fa: movsd  QWORD PTR [esp],xmm0
  0x01eab3ff: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eab405: push   eax
  0x01eab406: push   ebx
  0x01eab407: call   0x552179d0
  0x01eab40c: add    esp,0x8
  0x01eab40f: movsd  xmm0,QWORD PTR [esp]
  0x01eab414: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eab41a: add    esp,0x10
  0x01eab41d: popf   
  0x01eab41e: popa   
  0x01eab41f: pop    eax
  0x01eab420: mov    esi,esp
  0x01eab422: sub    esp,0x1c
  0x01eab425: mov    DWORD PTR [esp+0x18],ecx
  0x01eab429: mov    DWORD PTR [esp+0x14],edx
  0x01eab42d: mov    edi,DWORD PTR [esp+0x1c]
  0x01eab431: mov    DWORD PTR [esp+0xc],edi
  0x01eab435: mov    edi,DWORD PTR [esp+0x20]
  0x01eab439: mov    DWORD PTR [esp+0x10],edi
  0x01eab43d: mov    edi,DWORD PTR [esp+0x24]
  0x01eab441: mov    DWORD PTR [esp+0x4],edi
  0x01eab445: mov    edi,DWORD PTR [esp+0x28]
  0x01eab449: mov    DWORD PTR [esp+0x8],edi
  0x01eab44d: mov    edi,DWORD PTR [esp+0x2c]
  0x01eab451: mov    DWORD PTR [esp],edi
  0x01eab454: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eab457: push   eax
  0x01eab458: jmp    ecx

AHE@0x0422bab8: 0xabebea00 i2c: 0x01eab4f0 c2i: 0x01eab59e c2iUV: 0x01eab57d
i2c argument handler #9 for: receiver (JJB)V (283 bytes generated)
c2i argument handler starts at 01EAB59E
  0x01eab4f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab4f3: mov    edi,0x1dc2940
  0x01eab4f8: cmp    eax,edi
  0x01eab4fa: jbe    0x01eab50d
  0x01eab500: mov    edi,0x1ea2940
  0x01eab505: cmp    eax,edi
  0x01eab507: jb     0x01eab538
  0x01eab50d: mov    edi,0x1dc0340
  0x01eab512: cmp    eax,edi
  0x01eab514: jbe    0x01eab527
  0x01eab51a: mov    edi,0x1dc2668
  0x01eab51f: cmp    eax,edi
  0x01eab521: jb     0x01eab538
  ;; i2c adapter must return to an interpreter frame
  0x01eab527: push   0x5531723c
  0x01eab52c: call   0x01eab531
  0x01eab531: pusha  
  0x01eab532: call   0x54dedbf0
  0x01eab537: hlt    
  ;; } verify_i2ce 
  0x01eab538: mov    edi,esp
  0x01eab53a: sub    esp,0x10
  0x01eab53d: and    esp,0xfffffff0
  0x01eab540: push   eax
  0x01eab541: mov    eax,edi
  0x01eab543: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eab546: mov    ecx,DWORD PTR [eax+0x18]
  0x01eab549: mov    esi,DWORD PTR [eax+0x10]
  0x01eab54c: mov    DWORD PTR [esp+0x4],esi
  0x01eab550: mov    esi,DWORD PTR [eax+0x14]
  0x01eab553: mov    DWORD PTR [esp+0x8],esi
  0x01eab557: mov    esi,DWORD PTR [eax+0x8]
  0x01eab55a: mov    DWORD PTR [esp+0xc],esi
  0x01eab55e: mov    esi,DWORD PTR [eax+0xc]
  0x01eab561: mov    DWORD PTR [esp+0x10],esi
  0x01eab565: mov    edx,DWORD PTR [eax+0x4]
  0x01eab568: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eab570: mov    eax,DWORD PTR [eax-0xc]
  0x01eab573: mov    DWORD PTR [eax+0x168],ebx
  0x01eab579: mov    eax,ebx
  0x01eab57b: jmp    edi
  0x01eab57d: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eab580: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eab583: mov    ebx,DWORD PTR [eax+0x4]
  0x01eab586: jne    0x01eab599
  0x01eab58c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab593: je     0x01eab5d8
  0x01eab599: jmp    0x01ea32d0
  0x01eab59e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab5a5: je     0x01eab5d8
  0x01eab5ab: mov    eax,DWORD PTR [esp]
  0x01eab5ae: pusha  
  0x01eab5af: pushf  
  0x01eab5b0: sub    esp,0x10
  0x01eab5b3: movsd  QWORD PTR [esp],xmm0
  0x01eab5b8: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eab5be: push   eax
  0x01eab5bf: push   ebx
  0x01eab5c0: call   0x552179d0
  0x01eab5c5: add    esp,0x8
  0x01eab5c8: movsd  xmm0,QWORD PTR [esp]
  0x01eab5cd: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eab5d3: add    esp,0x10
  0x01eab5d6: popf   
  0x01eab5d7: popa   
  0x01eab5d8: pop    eax
  0x01eab5d9: mov    esi,esp
  0x01eab5db: sub    esp,0x18
  0x01eab5de: mov    DWORD PTR [esp+0x14],ecx
  0x01eab5e2: mov    edi,DWORD PTR [esp+0x18]
  0x01eab5e6: mov    DWORD PTR [esp+0xc],edi
  0x01eab5ea: mov    edi,DWORD PTR [esp+0x1c]
  0x01eab5ee: mov    DWORD PTR [esp+0x10],edi
  0x01eab5f2: mov    edi,DWORD PTR [esp+0x20]
  0x01eab5f6: mov    DWORD PTR [esp+0x4],edi
  0x01eab5fa: mov    edi,DWORD PTR [esp+0x24]
  0x01eab5fe: mov    DWORD PTR [esp+0x8],edi
  0x01eab602: mov    DWORD PTR [esp],edx
  0x01eab605: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eab608: push   eax
  0x01eab609: jmp    ecx

AHE@0x0422bae4: 0xabebe000 i2c: 0x01eab6b0 c2i: 0x01eab75b c2iUV: 0x01eab73a
i2c argument handler #10 for: receiver (JJ)J (276 bytes generated)
c2i argument handler starts at 01EAB75B
  0x01eab6b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab6b3: mov    edi,0x1dc2940
  0x01eab6b8: cmp    eax,edi
  0x01eab6ba: jbe    0x01eab6cd
  0x01eab6c0: mov    edi,0x1ea2940
  0x01eab6c5: cmp    eax,edi
  0x01eab6c7: jb     0x01eab6f8
  0x01eab6cd: mov    edi,0x1dc0340
  0x01eab6d2: cmp    eax,edi
  0x01eab6d4: jbe    0x01eab6e7
  0x01eab6da: mov    edi,0x1dc2668
  0x01eab6df: cmp    eax,edi
  0x01eab6e1: jb     0x01eab6f8
  ;; i2c adapter must return to an interpreter frame
  0x01eab6e7: push   0x5531723c
  0x01eab6ec: call   0x01eab6f1
  0x01eab6f1: pusha  
  0x01eab6f2: call   0x54dedbf0
  0x01eab6f7: hlt    
  ;; } verify_i2ce 
  0x01eab6f8: mov    edi,esp
  0x01eab6fa: sub    esp,0x10
  0x01eab6fd: and    esp,0xfffffff0
  0x01eab700: push   eax
  0x01eab701: mov    eax,edi
  0x01eab703: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eab706: mov    ecx,DWORD PTR [eax+0x14]
  0x01eab709: mov    esi,DWORD PTR [eax+0xc]
  0x01eab70c: mov    DWORD PTR [esp+0x4],esi
  0x01eab710: mov    esi,DWORD PTR [eax+0x10]
  0x01eab713: mov    DWORD PTR [esp+0x8],esi
  0x01eab717: mov    esi,DWORD PTR [eax+0x4]
  0x01eab71a: mov    DWORD PTR [esp+0xc],esi
  0x01eab71e: mov    esi,DWORD PTR [eax+0x8]
  0x01eab721: mov    DWORD PTR [esp+0x10],esi
  0x01eab725: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eab72d: mov    eax,DWORD PTR [eax-0xc]
  0x01eab730: mov    DWORD PTR [eax+0x168],ebx
  0x01eab736: mov    eax,ebx
  0x01eab738: jmp    edi
  0x01eab73a: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eab73d: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eab740: mov    ebx,DWORD PTR [eax+0x4]
  0x01eab743: jne    0x01eab756
  0x01eab749: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab750: je     0x01eab795
  0x01eab756: jmp    0x01ea32d0
  0x01eab75b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab762: je     0x01eab795
  0x01eab768: mov    eax,DWORD PTR [esp]
  0x01eab76b: pusha  
  0x01eab76c: pushf  
  0x01eab76d: sub    esp,0x10
  0x01eab770: movsd  QWORD PTR [esp],xmm0
  0x01eab775: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eab77b: push   eax
  0x01eab77c: push   ebx
  0x01eab77d: call   0x552179d0
  0x01eab782: add    esp,0x8
  0x01eab785: movsd  xmm0,QWORD PTR [esp]
  0x01eab78a: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eab790: add    esp,0x10
  0x01eab793: popf   
  0x01eab794: popa   
  0x01eab795: pop    eax
  0x01eab796: mov    esi,esp
  0x01eab798: sub    esp,0x14
  0x01eab79b: mov    DWORD PTR [esp+0x10],ecx
  0x01eab79f: mov    edi,DWORD PTR [esp+0x14]
  0x01eab7a3: mov    DWORD PTR [esp+0x8],edi
  0x01eab7a7: mov    edi,DWORD PTR [esp+0x18]
  0x01eab7ab: mov    DWORD PTR [esp+0xc],edi
  0x01eab7af: mov    edi,DWORD PTR [esp+0x1c]
  0x01eab7b3: mov    DWORD PTR [esp],edi
  0x01eab7b6: mov    edi,DWORD PTR [esp+0x20]
  0x01eab7ba: mov    DWORD PTR [esp+0x4],edi
  0x01eab7be: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eab7c1: push   eax
  0x01eab7c2: jmp    ecx

AHE@0x0422bb10: 0xaaaa0000 i2c: 0x01eab870 c2i: 0x01eab910 c2iUV: 0x01eab8ef
i2c argument handler #11 for: receiver (Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class; (253 bytes generated)
c2i argument handler starts at 01EAB910
  0x01eab870: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab873: mov    edi,0x1dc2940
  0x01eab878: cmp    eax,edi
  0x01eab87a: jbe    0x01eab88d
  0x01eab880: mov    edi,0x1ea2940
  0x01eab885: cmp    eax,edi
  0x01eab887: jb     0x01eab8b8
  0x01eab88d: mov    edi,0x1dc0340
  0x01eab892: cmp    eax,edi
  0x01eab894: jbe    0x01eab8a7
  0x01eab89a: mov    edi,0x1dc2668
  0x01eab89f: cmp    eax,edi
  0x01eab8a1: jb     0x01eab8b8
  ;; i2c adapter must return to an interpreter frame
  0x01eab8a7: push   0x5531723c
  0x01eab8ac: call   0x01eab8b1
  0x01eab8b1: pusha  
  0x01eab8b2: call   0x54dedbf0
  0x01eab8b7: hlt    
  ;; } verify_i2ce 
  0x01eab8b8: mov    edi,esp
  0x01eab8ba: sub    esp,0x8
  0x01eab8bd: and    esp,0xfffffff0
  0x01eab8c0: push   eax
  0x01eab8c1: mov    eax,edi
  0x01eab8c3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eab8c6: mov    ecx,DWORD PTR [eax+0x10]
  0x01eab8c9: mov    edx,DWORD PTR [eax+0xc]
  0x01eab8cc: mov    esi,DWORD PTR [eax+0x8]
  0x01eab8cf: mov    DWORD PTR [esp+0x4],esi
  0x01eab8d3: mov    esi,DWORD PTR [eax+0x4]
  0x01eab8d6: mov    DWORD PTR [esp+0x8],esi
  0x01eab8da: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eab8e2: mov    eax,DWORD PTR [eax-0xc]
  0x01eab8e5: mov    DWORD PTR [eax+0x168],ebx
  0x01eab8eb: mov    eax,ebx
  0x01eab8ed: jmp    edi
  0x01eab8ef: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eab8f2: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eab8f5: mov    ebx,DWORD PTR [eax+0x4]
  0x01eab8f8: jne    0x01eab90b
  0x01eab8fe: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab905: je     0x01eab94a
  0x01eab90b: jmp    0x01ea32d0
  0x01eab910: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eab917: je     0x01eab94a
  0x01eab91d: mov    eax,DWORD PTR [esp]
  0x01eab920: pusha  
  0x01eab921: pushf  
  0x01eab922: sub    esp,0x10
  0x01eab925: movsd  QWORD PTR [esp],xmm0
  0x01eab92a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eab930: push   eax
  0x01eab931: push   ebx
  0x01eab932: call   0x552179d0
  0x01eab937: add    esp,0x8
  0x01eab93a: movsd  xmm0,QWORD PTR [esp]
  0x01eab93f: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eab945: add    esp,0x10
  0x01eab948: popf   
  0x01eab949: popa   
  0x01eab94a: pop    eax
  0x01eab94b: mov    esi,esp
  0x01eab94d: sub    esp,0x10
  0x01eab950: mov    DWORD PTR [esp+0xc],ecx
  0x01eab954: mov    DWORD PTR [esp+0x8],edx
  0x01eab958: mov    edi,DWORD PTR [esp+0x10]
  0x01eab95c: mov    DWORD PTR [esp+0x4],edi
  0x01eab960: mov    edi,DWORD PTR [esp+0x14]
  0x01eab964: mov    DWORD PTR [esp],edi
  0x01eab967: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eab96a: push   eax
  0x01eab96b: jmp    ecx

AHE@0x0422bb3c: 0xaaaaaaa0 i2c: 0x01eab9f0 c2i: 0x01eabaa5 c2iUV: 0x01eaba84
i2c argument handler #12 for: receiver (Ljava/lang/String;[BIILjava/lang/ClassLoader;Ljava/security/ProtectionDomain;)Ljava/lang/Class; (298 bytes generated)
c2i argument handler starts at 01EABAA5
  0x01eab9f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eab9f3: mov    edi,0x1dc2940
  0x01eab9f8: cmp    eax,edi
  0x01eab9fa: jbe    0x01eaba0d
  0x01eaba00: mov    edi,0x1ea2940
  0x01eaba05: cmp    eax,edi
  0x01eaba07: jb     0x01eaba38
  0x01eaba0d: mov    edi,0x1dc0340
  0x01eaba12: cmp    eax,edi
  0x01eaba14: jbe    0x01eaba27
  0x01eaba1a: mov    edi,0x1dc2668
  0x01eaba1f: cmp    eax,edi
  0x01eaba21: jb     0x01eaba38
  ;; i2c adapter must return to an interpreter frame
  0x01eaba27: push   0x5531723c
  0x01eaba2c: call   0x01eaba31
  0x01eaba31: pusha  
  0x01eaba32: call   0x54dedbf0
  0x01eaba37: hlt    
  ;; } verify_i2ce 
  0x01eaba38: mov    edi,esp
  0x01eaba3a: sub    esp,0x18
  0x01eaba3d: and    esp,0xfffffff0
  0x01eaba40: push   eax
  0x01eaba41: mov    eax,edi
  0x01eaba43: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eaba46: mov    ecx,DWORD PTR [eax+0x1c]
  0x01eaba49: mov    edx,DWORD PTR [eax+0x18]
  0x01eaba4c: mov    esi,DWORD PTR [eax+0x14]
  0x01eaba4f: mov    DWORD PTR [esp+0x4],esi
  0x01eaba53: mov    esi,DWORD PTR [eax+0x10]
  0x01eaba56: mov    DWORD PTR [esp+0x8],esi
  0x01eaba5a: mov    esi,DWORD PTR [eax+0xc]
  0x01eaba5d: mov    DWORD PTR [esp+0xc],esi
  0x01eaba61: mov    esi,DWORD PTR [eax+0x8]
  0x01eaba64: mov    DWORD PTR [esp+0x10],esi
  0x01eaba68: mov    esi,DWORD PTR [eax+0x4]
  0x01eaba6b: mov    DWORD PTR [esp+0x14],esi
  0x01eaba6f: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eaba77: mov    eax,DWORD PTR [eax-0xc]
  0x01eaba7a: mov    DWORD PTR [eax+0x168],ebx
  0x01eaba80: mov    eax,ebx
  0x01eaba82: jmp    edi
  0x01eaba84: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eaba87: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eaba8a: mov    ebx,DWORD PTR [eax+0x4]
  0x01eaba8d: jne    0x01eabaa0
  0x01eaba93: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaba9a: je     0x01eabadf
  0x01eabaa0: jmp    0x01ea32d0
  0x01eabaa5: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabaac: je     0x01eabadf
  0x01eabab2: mov    eax,DWORD PTR [esp]
  0x01eabab5: pusha  
  0x01eabab6: pushf  
  0x01eabab7: sub    esp,0x10
  0x01eababa: movsd  QWORD PTR [esp],xmm0
  0x01eababf: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eabac5: push   eax
  0x01eabac6: push   ebx
  0x01eabac7: call   0x552179d0
  0x01eabacc: add    esp,0x8
  0x01eabacf: movsd  xmm0,QWORD PTR [esp]
  0x01eabad4: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eabada: add    esp,0x10
  0x01eabadd: popf   
  0x01eabade: popa   
  0x01eabadf: pop    eax
  0x01eabae0: mov    esi,esp
  0x01eabae2: sub    esp,0x1c
  0x01eabae5: mov    DWORD PTR [esp+0x18],ecx
  0x01eabae9: mov    DWORD PTR [esp+0x14],edx
  0x01eabaed: mov    edi,DWORD PTR [esp+0x1c]
  0x01eabaf1: mov    DWORD PTR [esp+0x10],edi
  0x01eabaf5: mov    edi,DWORD PTR [esp+0x20]
  0x01eabaf9: mov    DWORD PTR [esp+0xc],edi
  0x01eabafd: mov    edi,DWORD PTR [esp+0x24]
  0x01eabb01: mov    DWORD PTR [esp+0x8],edi
  0x01eabb05: mov    edi,DWORD PTR [esp+0x28]
  0x01eabb09: mov    DWORD PTR [esp+0x4],edi
  0x01eabb0d: mov    edi,DWORD PTR [esp+0x2c]
  0x01eabb11: mov    DWORD PTR [esp],edi
  0x01eabb14: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eabb17: push   eax
  0x01eabb18: jmp    ecx

AHE@0x0422bb68: 0xaabea000 i2c: 0x01eabbb0 c2i: 0x01eabc57 c2iUV: 0x01eabc36
i2c argument handler #13 for: receiver (Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object; (268 bytes generated)
c2i argument handler starts at 01EABC57
  0x01eabbb0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eabbb3: mov    edi,0x1dc2940
  0x01eabbb8: cmp    eax,edi
  0x01eabbba: jbe    0x01eabbcd
  0x01eabbc0: mov    edi,0x1ea2940
  0x01eabbc5: cmp    eax,edi
  0x01eabbc7: jb     0x01eabbf8
  0x01eabbcd: mov    edi,0x1dc0340
  0x01eabbd2: cmp    eax,edi
  0x01eabbd4: jbe    0x01eabbe7
  0x01eabbda: mov    edi,0x1dc2668
  0x01eabbdf: cmp    eax,edi
  0x01eabbe1: jb     0x01eabbf8
  ;; i2c adapter must return to an interpreter frame
  0x01eabbe7: push   0x5531723c
  0x01eabbec: call   0x01eabbf1
  0x01eabbf1: pusha  
  0x01eabbf2: call   0x54dedbf0
  0x01eabbf7: hlt    
  ;; } verify_i2ce 
  0x01eabbf8: mov    edi,esp
  0x01eabbfa: sub    esp,0x10
  0x01eabbfd: and    esp,0xfffffff0
  0x01eabc00: push   eax
  0x01eabc01: mov    eax,edi
  0x01eabc03: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eabc06: mov    ecx,DWORD PTR [eax+0x14]
  0x01eabc09: mov    edx,DWORD PTR [eax+0x10]
  0x01eabc0c: mov    esi,DWORD PTR [eax+0x8]
  0x01eabc0f: mov    DWORD PTR [esp+0x4],esi
  0x01eabc13: mov    esi,DWORD PTR [eax+0xc]
  0x01eabc16: mov    DWORD PTR [esp+0x8],esi
  0x01eabc1a: mov    esi,DWORD PTR [eax+0x4]
  0x01eabc1d: mov    DWORD PTR [esp+0xc],esi
  0x01eabc21: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eabc29: mov    eax,DWORD PTR [eax-0xc]
  0x01eabc2c: mov    DWORD PTR [eax+0x168],ebx
  0x01eabc32: mov    eax,ebx
  0x01eabc34: jmp    edi
  0x01eabc36: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eabc39: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eabc3c: mov    ebx,DWORD PTR [eax+0x4]
  0x01eabc3f: jne    0x01eabc52
  0x01eabc45: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabc4c: je     0x01eabc91
  0x01eabc52: jmp    0x01ea32d0
  0x01eabc57: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabc5e: je     0x01eabc91
  0x01eabc64: mov    eax,DWORD PTR [esp]
  0x01eabc67: pusha  
  0x01eabc68: pushf  
  0x01eabc69: sub    esp,0x10
  0x01eabc6c: movsd  QWORD PTR [esp],xmm0
  0x01eabc71: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eabc77: push   eax
  0x01eabc78: push   ebx
  0x01eabc79: call   0x552179d0
  0x01eabc7e: add    esp,0x8
  0x01eabc81: movsd  xmm0,QWORD PTR [esp]
  0x01eabc86: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eabc8c: add    esp,0x10
  0x01eabc8f: popf   
  0x01eabc90: popa   
  0x01eabc91: pop    eax
  0x01eabc92: mov    esi,esp
  0x01eabc94: sub    esp,0x14
  0x01eabc97: mov    DWORD PTR [esp+0x10],ecx
  0x01eabc9b: mov    DWORD PTR [esp+0xc],edx
  0x01eabc9f: mov    edi,DWORD PTR [esp+0x14]
  0x01eabca3: mov    DWORD PTR [esp+0x4],edi
  0x01eabca7: mov    edi,DWORD PTR [esp+0x18]
  0x01eabcab: mov    DWORD PTR [esp+0x8],edi
  0x01eabcaf: mov    edi,DWORD PTR [esp+0x1c]
  0x01eabcb3: mov    DWORD PTR [esp],edi
  0x01eabcb6: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eabcb9: push   eax
  0x01eabcba: jmp    ecx

AHE@0x0422bb94: 0xaabebe00 i2c: 0x01eabd30 c2i: 0x01eabdde c2iUV: 0x01eabdbd
i2c argument handler #14 for: receiver (Ljava/lang/Object;JJ)J (283 bytes generated)
c2i argument handler starts at 01EABDDE
  0x01eabd30: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eabd33: mov    edi,0x1dc2940
  0x01eabd38: cmp    eax,edi
  0x01eabd3a: jbe    0x01eabd4d
  0x01eabd40: mov    edi,0x1ea2940
  0x01eabd45: cmp    eax,edi
  0x01eabd47: jb     0x01eabd78
  0x01eabd4d: mov    edi,0x1dc0340
  0x01eabd52: cmp    eax,edi
  0x01eabd54: jbe    0x01eabd67
  0x01eabd5a: mov    edi,0x1dc2668
  0x01eabd5f: cmp    eax,edi
  0x01eabd61: jb     0x01eabd78
  ;; i2c adapter must return to an interpreter frame
  0x01eabd67: push   0x5531723c
  0x01eabd6c: call   0x01eabd71
  0x01eabd71: pusha  
  0x01eabd72: call   0x54dedbf0
  0x01eabd77: hlt    
  ;; } verify_i2ce 
  0x01eabd78: mov    edi,esp
  0x01eabd7a: sub    esp,0x10
  0x01eabd7d: and    esp,0xfffffff0
  0x01eabd80: push   eax
  0x01eabd81: mov    eax,edi
  0x01eabd83: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eabd86: mov    ecx,DWORD PTR [eax+0x18]
  0x01eabd89: mov    edx,DWORD PTR [eax+0x14]
  0x01eabd8c: mov    esi,DWORD PTR [eax+0xc]
  0x01eabd8f: mov    DWORD PTR [esp+0x4],esi
  0x01eabd93: mov    esi,DWORD PTR [eax+0x10]
  0x01eabd96: mov    DWORD PTR [esp+0x8],esi
  0x01eabd9a: mov    esi,DWORD PTR [eax+0x4]
  0x01eabd9d: mov    DWORD PTR [esp+0xc],esi
  0x01eabda1: mov    esi,DWORD PTR [eax+0x8]
  0x01eabda4: mov    DWORD PTR [esp+0x10],esi
  0x01eabda8: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eabdb0: mov    eax,DWORD PTR [eax-0xc]
  0x01eabdb3: mov    DWORD PTR [eax+0x168],ebx
  0x01eabdb9: mov    eax,ebx
  0x01eabdbb: jmp    edi
  0x01eabdbd: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eabdc0: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eabdc3: mov    ebx,DWORD PTR [eax+0x4]
  0x01eabdc6: jne    0x01eabdd9
  0x01eabdcc: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabdd3: je     0x01eabe18
  0x01eabdd9: jmp    0x01ea32d0
  0x01eabdde: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabde5: je     0x01eabe18
  0x01eabdeb: mov    eax,DWORD PTR [esp]
  0x01eabdee: pusha  
  0x01eabdef: pushf  
  0x01eabdf0: sub    esp,0x10
  0x01eabdf3: movsd  QWORD PTR [esp],xmm0
  0x01eabdf8: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eabdfe: push   eax
  0x01eabdff: push   ebx
  0x01eabe00: call   0x552179d0
  0x01eabe05: add    esp,0x8
  0x01eabe08: movsd  xmm0,QWORD PTR [esp]
  0x01eabe0d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eabe13: add    esp,0x10
  0x01eabe16: popf   
  0x01eabe17: popa   
  0x01eabe18: pop    eax
  0x01eabe19: mov    esi,esp
  0x01eabe1b: sub    esp,0x18
  0x01eabe1e: mov    DWORD PTR [esp+0x14],ecx
  0x01eabe22: mov    DWORD PTR [esp+0x10],edx
  0x01eabe26: mov    edi,DWORD PTR [esp+0x18]
  0x01eabe2a: mov    DWORD PTR [esp+0x8],edi
  0x01eabe2e: mov    edi,DWORD PTR [esp+0x1c]
  0x01eabe32: mov    DWORD PTR [esp+0xc],edi
  0x01eabe36: mov    edi,DWORD PTR [esp+0x20]
  0x01eabe3a: mov    DWORD PTR [esp],edi
  0x01eabe3d: mov    edi,DWORD PTR [esp+0x24]
  0x01eabe41: mov    DWORD PTR [esp+0x4],edi
  0x01eabe45: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eabe48: push   eax
  0x01eabe49: jmp    ecx

AHE@0x0422bbc0: 0xaabeaa00 i2c: 0x01eabef0 c2i: 0x01eabf9e c2iUV: 0x01eabf7d
i2c argument handler #15 for: receiver (Ljava/lang/Object;JII)Z (283 bytes generated)
c2i argument handler starts at 01EABF9E
  0x01eabef0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eabef3: mov    edi,0x1dc2940
  0x01eabef8: cmp    eax,edi
  0x01eabefa: jbe    0x01eabf0d
  0x01eabf00: mov    edi,0x1ea2940
  0x01eabf05: cmp    eax,edi
  0x01eabf07: jb     0x01eabf38
  0x01eabf0d: mov    edi,0x1dc0340
  0x01eabf12: cmp    eax,edi
  0x01eabf14: jbe    0x01eabf27
  0x01eabf1a: mov    edi,0x1dc2668
  0x01eabf1f: cmp    eax,edi
  0x01eabf21: jb     0x01eabf38
  ;; i2c adapter must return to an interpreter frame
  0x01eabf27: push   0x5531723c
  0x01eabf2c: call   0x01eabf31
  0x01eabf31: pusha  
  0x01eabf32: call   0x54dedbf0
  0x01eabf37: hlt    
  ;; } verify_i2ce 
  0x01eabf38: mov    edi,esp
  0x01eabf3a: sub    esp,0x10
  0x01eabf3d: and    esp,0xfffffff0
  0x01eabf40: push   eax
  0x01eabf41: mov    eax,edi
  0x01eabf43: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eabf46: mov    ecx,DWORD PTR [eax+0x18]
  0x01eabf49: mov    edx,DWORD PTR [eax+0x14]
  0x01eabf4c: mov    esi,DWORD PTR [eax+0xc]
  0x01eabf4f: mov    DWORD PTR [esp+0x4],esi
  0x01eabf53: mov    esi,DWORD PTR [eax+0x10]
  0x01eabf56: mov    DWORD PTR [esp+0x8],esi
  0x01eabf5a: mov    esi,DWORD PTR [eax+0x8]
  0x01eabf5d: mov    DWORD PTR [esp+0xc],esi
  0x01eabf61: mov    esi,DWORD PTR [eax+0x4]
  0x01eabf64: mov    DWORD PTR [esp+0x10],esi
  0x01eabf68: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eabf70: mov    eax,DWORD PTR [eax-0xc]
  0x01eabf73: mov    DWORD PTR [eax+0x168],ebx
  0x01eabf79: mov    eax,ebx
  0x01eabf7b: jmp    edi
  0x01eabf7d: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eabf80: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eabf83: mov    ebx,DWORD PTR [eax+0x4]
  0x01eabf86: jne    0x01eabf99
  0x01eabf8c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabf93: je     0x01eabfd8
  0x01eabf99: jmp    0x01ea32d0
  0x01eabf9e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eabfa5: je     0x01eabfd8
  0x01eabfab: mov    eax,DWORD PTR [esp]
  0x01eabfae: pusha  
  0x01eabfaf: pushf  
  0x01eabfb0: sub    esp,0x10
  0x01eabfb3: movsd  QWORD PTR [esp],xmm0
  0x01eabfb8: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eabfbe: push   eax
  0x01eabfbf: push   ebx
  0x01eabfc0: call   0x552179d0
  0x01eabfc5: add    esp,0x8
  0x01eabfc8: movsd  xmm0,QWORD PTR [esp]
  0x01eabfcd: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eabfd3: add    esp,0x10
  0x01eabfd6: popf   
  0x01eabfd7: popa   
  0x01eabfd8: pop    eax
  0x01eabfd9: mov    esi,esp
  0x01eabfdb: sub    esp,0x18
  0x01eabfde: mov    DWORD PTR [esp+0x14],ecx
  0x01eabfe2: mov    DWORD PTR [esp+0x10],edx
  0x01eabfe6: mov    edi,DWORD PTR [esp+0x18]
  0x01eabfea: mov    DWORD PTR [esp+0x8],edi
  0x01eabfee: mov    edi,DWORD PTR [esp+0x1c]
  0x01eabff2: mov    DWORD PTR [esp+0xc],edi
  0x01eabff6: mov    edi,DWORD PTR [esp+0x20]
  0x01eabffa: mov    DWORD PTR [esp+0x4],edi
  0x01eabffe: mov    edi,DWORD PTR [esp+0x24]
  0x01eac002: mov    DWORD PTR [esp],edi
  0x01eac005: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac008: push   eax
  0x01eac009: jmp    ecx

AHE@0x0422bbec: 0xaabebebe i2c: 0x01eac0b0 c2i: 0x01eac16c c2iUV: 0x01eac14b
i2c argument handler #16 for: receiver (Ljava/lang/Object;JJJ)Z (313 bytes generated)
c2i argument handler starts at 01EAC16C
  0x01eac0b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac0b3: mov    edi,0x1dc2940
  0x01eac0b8: cmp    eax,edi
  0x01eac0ba: jbe    0x01eac0cd
  0x01eac0c0: mov    edi,0x1ea2940
  0x01eac0c5: cmp    eax,edi
  0x01eac0c7: jb     0x01eac0f8
  0x01eac0cd: mov    edi,0x1dc0340
  0x01eac0d2: cmp    eax,edi
  0x01eac0d4: jbe    0x01eac0e7
  0x01eac0da: mov    edi,0x1dc2668
  0x01eac0df: cmp    eax,edi
  0x01eac0e1: jb     0x01eac0f8
  ;; i2c adapter must return to an interpreter frame
  0x01eac0e7: push   0x5531723c
  0x01eac0ec: call   0x01eac0f1
  0x01eac0f1: pusha  
  0x01eac0f2: call   0x54dedbf0
  0x01eac0f7: hlt    
  ;; } verify_i2ce 
  0x01eac0f8: mov    edi,esp
  0x01eac0fa: sub    esp,0x18
  0x01eac0fd: and    esp,0xfffffff0
  0x01eac100: push   eax
  0x01eac101: mov    eax,edi
  0x01eac103: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eac106: mov    ecx,DWORD PTR [eax+0x20]
  0x01eac109: mov    edx,DWORD PTR [eax+0x1c]
  0x01eac10c: mov    esi,DWORD PTR [eax+0x14]
  0x01eac10f: mov    DWORD PTR [esp+0x4],esi
  0x01eac113: mov    esi,DWORD PTR [eax+0x18]
  0x01eac116: mov    DWORD PTR [esp+0x8],esi
  0x01eac11a: mov    esi,DWORD PTR [eax+0xc]
  0x01eac11d: mov    DWORD PTR [esp+0xc],esi
  0x01eac121: mov    esi,DWORD PTR [eax+0x10]
  0x01eac124: mov    DWORD PTR [esp+0x10],esi
  0x01eac128: mov    esi,DWORD PTR [eax+0x4]
  0x01eac12b: mov    DWORD PTR [esp+0x14],esi
  0x01eac12f: mov    esi,DWORD PTR [eax+0x8]
  0x01eac132: mov    DWORD PTR [esp+0x18],esi
  0x01eac136: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eac13e: mov    eax,DWORD PTR [eax-0xc]
  0x01eac141: mov    DWORD PTR [eax+0x168],ebx
  0x01eac147: mov    eax,ebx
  0x01eac149: jmp    edi
  0x01eac14b: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eac14e: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eac151: mov    ebx,DWORD PTR [eax+0x4]
  0x01eac154: jne    0x01eac167
  0x01eac15a: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac161: je     0x01eac1a6
  0x01eac167: jmp    0x01ea32d0
  0x01eac16c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac173: je     0x01eac1a6
  0x01eac179: mov    eax,DWORD PTR [esp]
  0x01eac17c: pusha  
  0x01eac17d: pushf  
  0x01eac17e: sub    esp,0x10
  0x01eac181: movsd  QWORD PTR [esp],xmm0
  0x01eac186: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eac18c: push   eax
  0x01eac18d: push   ebx
  0x01eac18e: call   0x552179d0
  0x01eac193: add    esp,0x8
  0x01eac196: movsd  xmm0,QWORD PTR [esp]
  0x01eac19b: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eac1a1: add    esp,0x10
  0x01eac1a4: popf   
  0x01eac1a5: popa   
  0x01eac1a6: pop    eax
  0x01eac1a7: mov    esi,esp
  0x01eac1a9: sub    esp,0x20
  0x01eac1ac: mov    DWORD PTR [esp+0x1c],ecx
  0x01eac1b0: mov    DWORD PTR [esp+0x18],edx
  0x01eac1b4: mov    edi,DWORD PTR [esp+0x20]
  0x01eac1b8: mov    DWORD PTR [esp+0x10],edi
  0x01eac1bc: mov    edi,DWORD PTR [esp+0x24]
  0x01eac1c0: mov    DWORD PTR [esp+0x14],edi
  0x01eac1c4: mov    edi,DWORD PTR [esp+0x28]
  0x01eac1c8: mov    DWORD PTR [esp+0x8],edi
  0x01eac1cc: mov    edi,DWORD PTR [esp+0x2c]
  0x01eac1d0: mov    DWORD PTR [esp+0xc],edi
  0x01eac1d4: mov    edi,DWORD PTR [esp+0x30]
  0x01eac1d8: mov    DWORD PTR [esp],edi
  0x01eac1db: mov    edi,DWORD PTR [esp+0x34]
  0x01eac1df: mov    DWORD PTR [esp+0x4],edi
  0x01eac1e3: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac1e6: push   eax
  0x01eac1e7: jmp    ecx

AHE@0x0422bc18: 0xaabe7e00 i2c: 0x01eac270 c2i: 0x01eac315 c2iUV: 0x01eac2f4
i2c argument handler #17 for: receiver (Ljava/lang/Object;JD)V (264 bytes generated)
c2i argument handler starts at 01EAC315
  0x01eac270: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac273: mov    edi,0x1dc2940
  0x01eac278: cmp    eax,edi
  0x01eac27a: jbe    0x01eac28d
  0x01eac280: mov    edi,0x1ea2940
  0x01eac285: cmp    eax,edi
  0x01eac287: jb     0x01eac2b8
  0x01eac28d: mov    edi,0x1dc0340
  0x01eac292: cmp    eax,edi
  0x01eac294: jbe    0x01eac2a7
  0x01eac29a: mov    edi,0x1dc2668
  0x01eac29f: cmp    eax,edi
  0x01eac2a1: jb     0x01eac2b8
  ;; i2c adapter must return to an interpreter frame
  0x01eac2a7: push   0x5531723c
  0x01eac2ac: call   0x01eac2b1
  0x01eac2b1: pusha  
  0x01eac2b2: call   0x54dedbf0
  0x01eac2b7: hlt    
  ;; } verify_i2ce 
  0x01eac2b8: mov    edi,esp
  0x01eac2ba: sub    esp,0x8
  0x01eac2bd: and    esp,0xfffffff0
  0x01eac2c0: push   eax
  0x01eac2c1: mov    eax,edi
  0x01eac2c3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eac2c6: mov    ecx,DWORD PTR [eax+0x18]
  0x01eac2c9: mov    edx,DWORD PTR [eax+0x14]
  0x01eac2cc: mov    esi,DWORD PTR [eax+0xc]
  0x01eac2cf: mov    DWORD PTR [esp+0x4],esi
  0x01eac2d3: mov    esi,DWORD PTR [eax+0x10]
  0x01eac2d6: mov    DWORD PTR [esp+0x8],esi
  0x01eac2da: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01eac2df: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eac2e7: mov    eax,DWORD PTR [eax-0xc]
  0x01eac2ea: mov    DWORD PTR [eax+0x168],ebx
  0x01eac2f0: mov    eax,ebx
  0x01eac2f2: jmp    edi
  0x01eac2f4: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eac2f7: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eac2fa: mov    ebx,DWORD PTR [eax+0x4]
  0x01eac2fd: jne    0x01eac310
  0x01eac303: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac30a: je     0x01eac34f
  0x01eac310: jmp    0x01ea32d0
  0x01eac315: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac31c: je     0x01eac34f
  0x01eac322: mov    eax,DWORD PTR [esp]
  0x01eac325: pusha  
  0x01eac326: pushf  
  0x01eac327: sub    esp,0x10
  0x01eac32a: movsd  QWORD PTR [esp],xmm0
  0x01eac32f: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eac335: push   eax
  0x01eac336: push   ebx
  0x01eac337: call   0x552179d0
  0x01eac33c: add    esp,0x8
  0x01eac33f: movsd  xmm0,QWORD PTR [esp]
  0x01eac344: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eac34a: add    esp,0x10
  0x01eac34d: popf   
  0x01eac34e: popa   
  0x01eac34f: pop    eax
  0x01eac350: mov    esi,esp
  0x01eac352: sub    esp,0x18
  0x01eac355: mov    DWORD PTR [esp+0x14],ecx
  0x01eac359: mov    DWORD PTR [esp+0x10],edx
  0x01eac35d: mov    edi,DWORD PTR [esp+0x18]
  0x01eac361: mov    DWORD PTR [esp+0x8],edi
  0x01eac365: mov    edi,DWORD PTR [esp+0x1c]
  0x01eac369: mov    DWORD PTR [esp+0xc],edi
  0x01eac36d: movsd  QWORD PTR [esp],xmm0
  0x01eac372: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac375: push   eax
  0x01eac376: jmp    ecx

AHE@0x0422bc44: 0xaabe0000 i2c: 0x01eac3f0 c2i: 0x01eac490 c2iUV: 0x01eac46f
i2c argument handler #18 for: receiver (Ljava/lang/Object;J)D (253 bytes generated)
c2i argument handler starts at 01EAC490
  0x01eac3f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac3f3: mov    edi,0x1dc2940
  0x01eac3f8: cmp    eax,edi
  0x01eac3fa: jbe    0x01eac40d
  0x01eac400: mov    edi,0x1ea2940
  0x01eac405: cmp    eax,edi
  0x01eac407: jb     0x01eac438
  0x01eac40d: mov    edi,0x1dc0340
  0x01eac412: cmp    eax,edi
  0x01eac414: jbe    0x01eac427
  0x01eac41a: mov    edi,0x1dc2668
  0x01eac41f: cmp    eax,edi
  0x01eac421: jb     0x01eac438
  ;; i2c adapter must return to an interpreter frame
  0x01eac427: push   0x5531723c
  0x01eac42c: call   0x01eac431
  0x01eac431: pusha  
  0x01eac432: call   0x54dedbf0
  0x01eac437: hlt    
  ;; } verify_i2ce 
  0x01eac438: mov    edi,esp
  0x01eac43a: sub    esp,0x8
  0x01eac43d: and    esp,0xfffffff0
  0x01eac440: push   eax
  0x01eac441: mov    eax,edi
  0x01eac443: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eac446: mov    ecx,DWORD PTR [eax+0x10]
  0x01eac449: mov    edx,DWORD PTR [eax+0xc]
  0x01eac44c: mov    esi,DWORD PTR [eax+0x4]
  0x01eac44f: mov    DWORD PTR [esp+0x4],esi
  0x01eac453: mov    esi,DWORD PTR [eax+0x8]
  0x01eac456: mov    DWORD PTR [esp+0x8],esi
  0x01eac45a: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eac462: mov    eax,DWORD PTR [eax-0xc]
  0x01eac465: mov    DWORD PTR [eax+0x168],ebx
  0x01eac46b: mov    eax,ebx
  0x01eac46d: jmp    edi
  0x01eac46f: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eac472: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eac475: mov    ebx,DWORD PTR [eax+0x4]
  0x01eac478: jne    0x01eac48b
  0x01eac47e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac485: je     0x01eac4ca
  0x01eac48b: jmp    0x01ea32d0
  0x01eac490: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac497: je     0x01eac4ca
  0x01eac49d: mov    eax,DWORD PTR [esp]
  0x01eac4a0: pusha  
  0x01eac4a1: pushf  
  0x01eac4a2: sub    esp,0x10
  0x01eac4a5: movsd  QWORD PTR [esp],xmm0
  0x01eac4aa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eac4b0: push   eax
  0x01eac4b1: push   ebx
  0x01eac4b2: call   0x552179d0
  0x01eac4b7: add    esp,0x8
  0x01eac4ba: movsd  xmm0,QWORD PTR [esp]
  0x01eac4bf: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eac4c5: add    esp,0x10
  0x01eac4c8: popf   
  0x01eac4c9: popa   
  0x01eac4ca: pop    eax
  0x01eac4cb: mov    esi,esp
  0x01eac4cd: sub    esp,0x10
  0x01eac4d0: mov    DWORD PTR [esp+0xc],ecx
  0x01eac4d4: mov    DWORD PTR [esp+0x8],edx
  0x01eac4d8: mov    edi,DWORD PTR [esp+0x10]
  0x01eac4dc: mov    DWORD PTR [esp],edi
  0x01eac4df: mov    edi,DWORD PTR [esp+0x14]
  0x01eac4e3: mov    DWORD PTR [esp+0x4],edi
  0x01eac4e7: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac4ea: push   eax
  0x01eac4eb: jmp    ecx

AHE@0x0422bc70: 0xaabe6000 i2c: 0x01eac570 c2i: 0x01eac615 c2iUV: 0x01eac5f4
i2c argument handler #19 for: receiver (Ljava/lang/Object;JF)V (264 bytes generated)
c2i argument handler starts at 01EAC615
  0x01eac570: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac573: mov    edi,0x1dc2940
  0x01eac578: cmp    eax,edi
  0x01eac57a: jbe    0x01eac58d
  0x01eac580: mov    edi,0x1ea2940
  0x01eac585: cmp    eax,edi
  0x01eac587: jb     0x01eac5b8
  0x01eac58d: mov    edi,0x1dc0340
  0x01eac592: cmp    eax,edi
  0x01eac594: jbe    0x01eac5a7
  0x01eac59a: mov    edi,0x1dc2668
  0x01eac59f: cmp    eax,edi
  0x01eac5a1: jb     0x01eac5b8
  ;; i2c adapter must return to an interpreter frame
  0x01eac5a7: push   0x5531723c
  0x01eac5ac: call   0x01eac5b1
  0x01eac5b1: pusha  
  0x01eac5b2: call   0x54dedbf0
  0x01eac5b7: hlt    
  ;; } verify_i2ce 
  0x01eac5b8: mov    edi,esp
  0x01eac5ba: sub    esp,0x8
  0x01eac5bd: and    esp,0xfffffff0
  0x01eac5c0: push   eax
  0x01eac5c1: mov    eax,edi
  0x01eac5c3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eac5c6: mov    ecx,DWORD PTR [eax+0x14]
  0x01eac5c9: mov    edx,DWORD PTR [eax+0x10]
  0x01eac5cc: mov    esi,DWORD PTR [eax+0x8]
  0x01eac5cf: mov    DWORD PTR [esp+0x4],esi
  0x01eac5d3: mov    esi,DWORD PTR [eax+0xc]
  0x01eac5d6: mov    DWORD PTR [esp+0x8],esi
  0x01eac5da: movss  xmm0,DWORD PTR [eax+0x4]
  0x01eac5df: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eac5e7: mov    eax,DWORD PTR [eax-0xc]
  0x01eac5ea: mov    DWORD PTR [eax+0x168],ebx
  0x01eac5f0: mov    eax,ebx
  0x01eac5f2: jmp    edi
  0x01eac5f4: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eac5f7: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eac5fa: mov    ebx,DWORD PTR [eax+0x4]
  0x01eac5fd: jne    0x01eac610
  0x01eac603: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac60a: je     0x01eac64f
  0x01eac610: jmp    0x01ea32d0
  0x01eac615: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac61c: je     0x01eac64f
  0x01eac622: mov    eax,DWORD PTR [esp]
  0x01eac625: pusha  
  0x01eac626: pushf  
  0x01eac627: sub    esp,0x10
  0x01eac62a: movsd  QWORD PTR [esp],xmm0
  0x01eac62f: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eac635: push   eax
  0x01eac636: push   ebx
  0x01eac637: call   0x552179d0
  0x01eac63c: add    esp,0x8
  0x01eac63f: movsd  xmm0,QWORD PTR [esp]
  0x01eac644: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eac64a: add    esp,0x10
  0x01eac64d: popf   
  0x01eac64e: popa   
  0x01eac64f: pop    eax
  0x01eac650: mov    esi,esp
  0x01eac652: sub    esp,0x14
  0x01eac655: mov    DWORD PTR [esp+0x10],ecx
  0x01eac659: mov    DWORD PTR [esp+0xc],edx
  0x01eac65d: mov    edi,DWORD PTR [esp+0x14]
  0x01eac661: mov    DWORD PTR [esp+0x4],edi
  0x01eac665: mov    edi,DWORD PTR [esp+0x18]
  0x01eac669: mov    DWORD PTR [esp+0x8],edi
  0x01eac66d: movss  DWORD PTR [esp],xmm0
  0x01eac672: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac675: push   eax
  0x01eac676: jmp    ecx

AHE@0x0422bc9c: 0xabe7e000 i2c: 0x01eac6f0 c2i: 0x01eac792 c2iUV: 0x01eac771
i2c argument handler #20 for: receiver (JD)V (257 bytes generated)
c2i argument handler starts at 01EAC792
  0x01eac6f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac6f3: mov    edi,0x1dc2940
  0x01eac6f8: cmp    eax,edi
  0x01eac6fa: jbe    0x01eac70d
  0x01eac700: mov    edi,0x1ea2940
  0x01eac705: cmp    eax,edi
  0x01eac707: jb     0x01eac738
  0x01eac70d: mov    edi,0x1dc0340
  0x01eac712: cmp    eax,edi
  0x01eac714: jbe    0x01eac727
  0x01eac71a: mov    edi,0x1dc2668
  0x01eac71f: cmp    eax,edi
  0x01eac721: jb     0x01eac738
  ;; i2c adapter must return to an interpreter frame
  0x01eac727: push   0x5531723c
  0x01eac72c: call   0x01eac731
  0x01eac731: pusha  
  0x01eac732: call   0x54dedbf0
  0x01eac737: hlt    
  ;; } verify_i2ce 
  0x01eac738: mov    edi,esp
  0x01eac73a: sub    esp,0x8
  0x01eac73d: and    esp,0xfffffff0
  0x01eac740: push   eax
  0x01eac741: mov    eax,edi
  0x01eac743: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eac746: mov    ecx,DWORD PTR [eax+0x14]
  0x01eac749: mov    esi,DWORD PTR [eax+0xc]
  0x01eac74c: mov    DWORD PTR [esp+0x4],esi
  0x01eac750: mov    esi,DWORD PTR [eax+0x10]
  0x01eac753: mov    DWORD PTR [esp+0x8],esi
  0x01eac757: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01eac75c: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eac764: mov    eax,DWORD PTR [eax-0xc]
  0x01eac767: mov    DWORD PTR [eax+0x168],ebx
  0x01eac76d: mov    eax,ebx
  0x01eac76f: jmp    edi
  0x01eac771: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eac774: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eac777: mov    ebx,DWORD PTR [eax+0x4]
  0x01eac77a: jne    0x01eac78d
  0x01eac780: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac787: je     0x01eac7cc
  0x01eac78d: jmp    0x01ea32d0
  0x01eac792: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac799: je     0x01eac7cc
  0x01eac79f: mov    eax,DWORD PTR [esp]
  0x01eac7a2: pusha  
  0x01eac7a3: pushf  
  0x01eac7a4: sub    esp,0x10
  0x01eac7a7: movsd  QWORD PTR [esp],xmm0
  0x01eac7ac: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eac7b2: push   eax
  0x01eac7b3: push   ebx
  0x01eac7b4: call   0x552179d0
  0x01eac7b9: add    esp,0x8
  0x01eac7bc: movsd  xmm0,QWORD PTR [esp]
  0x01eac7c1: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eac7c7: add    esp,0x10
  0x01eac7ca: popf   
  0x01eac7cb: popa   
  0x01eac7cc: pop    eax
  0x01eac7cd: mov    esi,esp
  0x01eac7cf: sub    esp,0x14
  0x01eac7d2: mov    DWORD PTR [esp+0x10],ecx
  0x01eac7d6: mov    edi,DWORD PTR [esp+0x14]
  0x01eac7da: mov    DWORD PTR [esp+0x8],edi
  0x01eac7de: mov    edi,DWORD PTR [esp+0x18]
  0x01eac7e2: mov    DWORD PTR [esp+0xc],edi
  0x01eac7e6: movsd  QWORD PTR [esp],xmm0
  0x01eac7eb: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac7ee: push   eax
  0x01eac7ef: jmp    ecx

AHE@0x0422bcc8: 0xaaa7e000 i2c: 0x01eac870 c2i: 0x01eac90e c2iUV: 0x01eac8ed
i2c argument handler #21 for: receiver (Ljava/lang/Object;ID)V (249 bytes generated)
c2i argument handler starts at 01EAC90E
  0x01eac870: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac873: mov    edi,0x1dc2940
  0x01eac878: cmp    eax,edi
  0x01eac87a: jbe    0x01eac88d
  0x01eac880: mov    edi,0x1ea2940
  0x01eac885: cmp    eax,edi
  0x01eac887: jb     0x01eac8b8
  0x01eac88d: mov    edi,0x1dc0340
  0x01eac892: cmp    eax,edi
  0x01eac894: jbe    0x01eac8a7
  0x01eac89a: mov    edi,0x1dc2668
  0x01eac89f: cmp    eax,edi
  0x01eac8a1: jb     0x01eac8b8
  ;; i2c adapter must return to an interpreter frame
  0x01eac8a7: push   0x5531723c
  0x01eac8ac: call   0x01eac8b1
  0x01eac8b1: pusha  
  0x01eac8b2: call   0x54dedbf0
  0x01eac8b7: hlt    
  ;; } verify_i2ce 
  0x01eac8b8: mov    edi,esp
  0x01eac8ba: sub    esp,0x8
  0x01eac8bd: and    esp,0xfffffff0
  0x01eac8c0: push   eax
  0x01eac8c1: mov    eax,edi
  0x01eac8c3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eac8c6: mov    ecx,DWORD PTR [eax+0x14]
  0x01eac8c9: mov    edx,DWORD PTR [eax+0x10]
  0x01eac8cc: mov    esi,DWORD PTR [eax+0xc]
  0x01eac8cf: mov    DWORD PTR [esp+0x4],esi
  0x01eac8d3: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01eac8d8: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eac8e0: mov    eax,DWORD PTR [eax-0xc]
  0x01eac8e3: mov    DWORD PTR [eax+0x168],ebx
  0x01eac8e9: mov    eax,ebx
  0x01eac8eb: jmp    edi
  0x01eac8ed: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eac8f0: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eac8f3: mov    ebx,DWORD PTR [eax+0x4]
  0x01eac8f6: jne    0x01eac909
  0x01eac8fc: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac903: je     0x01eac948
  0x01eac909: jmp    0x01ea32d0
  0x01eac90e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eac915: je     0x01eac948
  0x01eac91b: mov    eax,DWORD PTR [esp]
  0x01eac91e: pusha  
  0x01eac91f: pushf  
  0x01eac920: sub    esp,0x10
  0x01eac923: movsd  QWORD PTR [esp],xmm0
  0x01eac928: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eac92e: push   eax
  0x01eac92f: push   ebx
  0x01eac930: call   0x552179d0
  0x01eac935: add    esp,0x8
  0x01eac938: movsd  xmm0,QWORD PTR [esp]
  0x01eac93d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eac943: add    esp,0x10
  0x01eac946: popf   
  0x01eac947: popa   
  0x01eac948: pop    eax
  0x01eac949: mov    esi,esp
  0x01eac94b: sub    esp,0x14
  0x01eac94e: mov    DWORD PTR [esp+0x10],ecx
  0x01eac952: mov    DWORD PTR [esp+0xc],edx
  0x01eac956: mov    edi,DWORD PTR [esp+0x14]
  0x01eac95a: mov    DWORD PTR [esp+0x8],edi
  0x01eac95e: movsd  QWORD PTR [esp],xmm0
  0x01eac963: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eac966: push   eax
  0x01eac967: jmp    ecx

AHE@0x0422bcf4: 0xaaa60000 i2c: 0x01eac9f0 c2i: 0x01eaca8e c2iUV: 0x01eaca6d
i2c argument handler #22 for: receiver (Ljava/lang/Object;IF)V (249 bytes generated)
c2i argument handler starts at 01EACA8E
  0x01eac9f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eac9f3: mov    edi,0x1dc2940
  0x01eac9f8: cmp    eax,edi
  0x01eac9fa: jbe    0x01eaca0d
  0x01eaca00: mov    edi,0x1ea2940
  0x01eaca05: cmp    eax,edi
  0x01eaca07: jb     0x01eaca38
  0x01eaca0d: mov    edi,0x1dc0340
  0x01eaca12: cmp    eax,edi
  0x01eaca14: jbe    0x01eaca27
  0x01eaca1a: mov    edi,0x1dc2668
  0x01eaca1f: cmp    eax,edi
  0x01eaca21: jb     0x01eaca38
  ;; i2c adapter must return to an interpreter frame
  0x01eaca27: push   0x5531723c
  0x01eaca2c: call   0x01eaca31
  0x01eaca31: pusha  
  0x01eaca32: call   0x54dedbf0
  0x01eaca37: hlt    
  ;; } verify_i2ce 
  0x01eaca38: mov    edi,esp
  0x01eaca3a: sub    esp,0x8
  0x01eaca3d: and    esp,0xfffffff0
  0x01eaca40: push   eax
  0x01eaca41: mov    eax,edi
  0x01eaca43: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eaca46: mov    ecx,DWORD PTR [eax+0x10]
  0x01eaca49: mov    edx,DWORD PTR [eax+0xc]
  0x01eaca4c: mov    esi,DWORD PTR [eax+0x8]
  0x01eaca4f: mov    DWORD PTR [esp+0x4],esi
  0x01eaca53: movss  xmm0,DWORD PTR [eax+0x4]
  0x01eaca58: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eaca60: mov    eax,DWORD PTR [eax-0xc]
  0x01eaca63: mov    DWORD PTR [eax+0x168],ebx
  0x01eaca69: mov    eax,ebx
  0x01eaca6b: jmp    edi
  0x01eaca6d: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eaca70: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eaca73: mov    ebx,DWORD PTR [eax+0x4]
  0x01eaca76: jne    0x01eaca89
  0x01eaca7c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaca83: je     0x01eacac8
  0x01eaca89: jmp    0x01ea32d0
  0x01eaca8e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eaca95: je     0x01eacac8
  0x01eaca9b: mov    eax,DWORD PTR [esp]
  0x01eaca9e: pusha  
  0x01eaca9f: pushf  
  0x01eacaa0: sub    esp,0x10
  0x01eacaa3: movsd  QWORD PTR [esp],xmm0
  0x01eacaa8: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eacaae: push   eax
  0x01eacaaf: push   ebx
  0x01eacab0: call   0x552179d0
  0x01eacab5: add    esp,0x8
  0x01eacab8: movsd  xmm0,QWORD PTR [esp]
  0x01eacabd: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eacac3: add    esp,0x10
  0x01eacac6: popf   
  0x01eacac7: popa   
  0x01eacac8: pop    eax
  0x01eacac9: mov    esi,esp
  0x01eacacb: sub    esp,0x10
  0x01eacace: mov    DWORD PTR [esp+0xc],ecx
  0x01eacad2: mov    DWORD PTR [esp+0x8],edx
  0x01eacad6: mov    edi,DWORD PTR [esp+0x10]
  0x01eacada: mov    DWORD PTR [esp+0x4],edi
  0x01eacade: movss  DWORD PTR [esp],xmm0
  0x01eacae3: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eacae6: push   eax
  0x01eacae7: jmp    ecx

AHE@0x0422bd20: 0xabe60000 i2c: 0x01eacb70 c2i: 0x01eacc12 c2iUV: 0x01eacbf1
i2c argument handler #23 for: receiver (JF)V (257 bytes generated)
c2i argument handler starts at 01EACC12
  0x01eacb70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eacb73: mov    edi,0x1dc2940
  0x01eacb78: cmp    eax,edi
  0x01eacb7a: jbe    0x01eacb8d
  0x01eacb80: mov    edi,0x1ea2940
  0x01eacb85: cmp    eax,edi
  0x01eacb87: jb     0x01eacbb8
  0x01eacb8d: mov    edi,0x1dc0340
  0x01eacb92: cmp    eax,edi
  0x01eacb94: jbe    0x01eacba7
  0x01eacb9a: mov    edi,0x1dc2668
  0x01eacb9f: cmp    eax,edi
  0x01eacba1: jb     0x01eacbb8
  ;; i2c adapter must return to an interpreter frame
  0x01eacba7: push   0x5531723c
  0x01eacbac: call   0x01eacbb1
  0x01eacbb1: pusha  
  0x01eacbb2: call   0x54dedbf0
  0x01eacbb7: hlt    
  ;; } verify_i2ce 
  0x01eacbb8: mov    edi,esp
  0x01eacbba: sub    esp,0x8
  0x01eacbbd: and    esp,0xfffffff0
  0x01eacbc0: push   eax
  0x01eacbc1: mov    eax,edi
  0x01eacbc3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eacbc6: mov    ecx,DWORD PTR [eax+0x10]
  0x01eacbc9: mov    esi,DWORD PTR [eax+0x8]
  0x01eacbcc: mov    DWORD PTR [esp+0x4],esi
  0x01eacbd0: mov    esi,DWORD PTR [eax+0xc]
  0x01eacbd3: mov    DWORD PTR [esp+0x8],esi
  0x01eacbd7: movss  xmm0,DWORD PTR [eax+0x4]
  0x01eacbdc: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eacbe4: mov    eax,DWORD PTR [eax-0xc]
  0x01eacbe7: mov    DWORD PTR [eax+0x168],ebx
  0x01eacbed: mov    eax,ebx
  0x01eacbef: jmp    edi
  0x01eacbf1: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eacbf4: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eacbf7: mov    ebx,DWORD PTR [eax+0x4]
  0x01eacbfa: jne    0x01eacc0d
  0x01eacc00: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eacc07: je     0x01eacc4c
  0x01eacc0d: jmp    0x01ea32d0
  0x01eacc12: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eacc19: je     0x01eacc4c
  0x01eacc1f: mov    eax,DWORD PTR [esp]
  0x01eacc22: pusha  
  0x01eacc23: pushf  
  0x01eacc24: sub    esp,0x10
  0x01eacc27: movsd  QWORD PTR [esp],xmm0
  0x01eacc2c: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eacc32: push   eax
  0x01eacc33: push   ebx
  0x01eacc34: call   0x552179d0
  0x01eacc39: add    esp,0x8
  0x01eacc3c: movsd  xmm0,QWORD PTR [esp]
  0x01eacc41: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eacc47: add    esp,0x10
  0x01eacc4a: popf   
  0x01eacc4b: popa   
  0x01eacc4c: pop    eax
  0x01eacc4d: mov    esi,esp
  0x01eacc4f: sub    esp,0x10
  0x01eacc52: mov    DWORD PTR [esp+0xc],ecx
  0x01eacc56: mov    edi,DWORD PTR [esp+0x10]
  0x01eacc5a: mov    DWORD PTR [esp+0x4],edi
  0x01eacc5e: mov    edi,DWORD PTR [esp+0x14]
  0x01eacc62: mov    DWORD PTR [esp+0x8],edi
  0x01eacc66: movss  DWORD PTR [esp],xmm0
  0x01eacc6b: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eacc6e: push   eax
  0x01eacc6f: jmp    ecx

AHE@0x0422bd4c: 0xaaabe000 i2c: 0x01eaccf0 c2i: 0x01eacd97 c2iUV: 0x01eacd76
i2c argument handler #24 for: receiver (Ljava/lang/Object;IJ)V (268 bytes generated)
c2i argument handler starts at 01EACD97
  0x01eaccf0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eaccf3: mov    edi,0x1dc2940
  0x01eaccf8: cmp    eax,edi
  0x01eaccfa: jbe    0x01eacd0d
  0x01eacd00: mov    edi,0x1ea2940
  0x01eacd05: cmp    eax,edi
  0x01eacd07: jb     0x01eacd38
  0x01eacd0d: mov    edi,0x1dc0340
  0x01eacd12: cmp    eax,edi
  0x01eacd14: jbe    0x01eacd27
  0x01eacd1a: mov    edi,0x1dc2668
  0x01eacd1f: cmp    eax,edi
  0x01eacd21: jb     0x01eacd38
  ;; i2c adapter must return to an interpreter frame
  0x01eacd27: push   0x5531723c
  0x01eacd2c: call   0x01eacd31
  0x01eacd31: pusha  
  0x01eacd32: call   0x54dedbf0
  0x01eacd37: hlt    
  ;; } verify_i2ce 
  0x01eacd38: mov    edi,esp
  0x01eacd3a: sub    esp,0x10
  0x01eacd3d: and    esp,0xfffffff0
  0x01eacd40: push   eax
  0x01eacd41: mov    eax,edi
  0x01eacd43: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eacd46: mov    ecx,DWORD PTR [eax+0x14]
  0x01eacd49: mov    edx,DWORD PTR [eax+0x10]
  0x01eacd4c: mov    esi,DWORD PTR [eax+0xc]
  0x01eacd4f: mov    DWORD PTR [esp+0xc],esi
  0x01eacd53: mov    esi,DWORD PTR [eax+0x4]
  0x01eacd56: mov    DWORD PTR [esp+0x4],esi
  0x01eacd5a: mov    esi,DWORD PTR [eax+0x8]
  0x01eacd5d: mov    DWORD PTR [esp+0x8],esi
  0x01eacd61: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eacd69: mov    eax,DWORD PTR [eax-0xc]
  0x01eacd6c: mov    DWORD PTR [eax+0x168],ebx
  0x01eacd72: mov    eax,ebx
  0x01eacd74: jmp    edi
  0x01eacd76: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eacd79: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eacd7c: mov    ebx,DWORD PTR [eax+0x4]
  0x01eacd7f: jne    0x01eacd92
  0x01eacd85: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eacd8c: je     0x01eacdd1
  0x01eacd92: jmp    0x01ea32d0
  0x01eacd97: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eacd9e: je     0x01eacdd1
  0x01eacda4: mov    eax,DWORD PTR [esp]
  0x01eacda7: pusha  
  0x01eacda8: pushf  
  0x01eacda9: sub    esp,0x10
  0x01eacdac: movsd  QWORD PTR [esp],xmm0
  0x01eacdb1: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eacdb7: push   eax
  0x01eacdb8: push   ebx
  0x01eacdb9: call   0x552179d0
  0x01eacdbe: add    esp,0x8
  0x01eacdc1: movsd  xmm0,QWORD PTR [esp]
  0x01eacdc6: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eacdcc: add    esp,0x10
  0x01eacdcf: popf   
  0x01eacdd0: popa   
  0x01eacdd1: pop    eax
  0x01eacdd2: mov    esi,esp
  0x01eacdd4: sub    esp,0x14
  0x01eacdd7: mov    DWORD PTR [esp+0x10],ecx
  0x01eacddb: mov    DWORD PTR [esp+0xc],edx
  0x01eacddf: mov    edi,DWORD PTR [esp+0x1c]
  0x01eacde3: mov    DWORD PTR [esp+0x8],edi
  0x01eacde7: mov    edi,DWORD PTR [esp+0x14]
  0x01eacdeb: mov    DWORD PTR [esp],edi
  0x01eacdee: mov    edi,DWORD PTR [esp+0x18]
  0x01eacdf2: mov    DWORD PTR [esp+0x4],edi
  0x01eacdf6: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eacdf9: push   eax
  0x01eacdfa: jmp    ecx

AHE@0x0422bd78: 0xaabeabebe0000000 i2c: 0x01eace70 c2i: 0x01eacf33 c2iUV: 0x01eacf12
i2c argument handler #25 for: receiver (Ljava/lang/Object;JLjava/lang/Object;JJ)V (328 bytes generated)
c2i argument handler starts at 01EACF33
  0x01eace70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eace73: mov    edi,0x1dc2940
  0x01eace78: cmp    eax,edi
  0x01eace7a: jbe    0x01eace8d
  0x01eace80: mov    edi,0x1ea2940
  0x01eace85: cmp    eax,edi
  0x01eace87: jb     0x01eaceb8
  0x01eace8d: mov    edi,0x1dc0340
  0x01eace92: cmp    eax,edi
  0x01eace94: jbe    0x01eacea7
  0x01eace9a: mov    edi,0x1dc2668
  0x01eace9f: cmp    eax,edi
  0x01eacea1: jb     0x01eaceb8
  ;; i2c adapter must return to an interpreter frame
  0x01eacea7: push   0x5531723c
  0x01eaceac: call   0x01eaceb1
  0x01eaceb1: pusha  
  0x01eaceb2: call   0x54dedbf0
  0x01eaceb7: hlt    
  ;; } verify_i2ce 
  0x01eaceb8: mov    edi,esp
  0x01eaceba: sub    esp,0x20
  0x01eacebd: and    esp,0xfffffff0
  0x01eacec0: push   eax
  0x01eacec1: mov    eax,edi
  0x01eacec3: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eacec6: mov    ecx,DWORD PTR [eax+0x24]
  0x01eacec9: mov    edx,DWORD PTR [eax+0x20]
  0x01eacecc: mov    esi,DWORD PTR [eax+0x18]
  0x01eacecf: mov    DWORD PTR [esp+0x4],esi
  0x01eaced3: mov    esi,DWORD PTR [eax+0x1c]
  0x01eaced6: mov    DWORD PTR [esp+0x8],esi
  0x01eaceda: mov    esi,DWORD PTR [eax+0x14]
  0x01eacedd: mov    DWORD PTR [esp+0x1c],esi
  0x01eacee1: mov    esi,DWORD PTR [eax+0xc]
  0x01eacee4: mov    DWORD PTR [esp+0xc],esi
  0x01eacee8: mov    esi,DWORD PTR [eax+0x10]
  0x01eaceeb: mov    DWORD PTR [esp+0x10],esi
  0x01eaceef: mov    esi,DWORD PTR [eax+0x4]
  0x01eacef2: mov    DWORD PTR [esp+0x14],esi
  0x01eacef6: mov    esi,DWORD PTR [eax+0x8]
  0x01eacef9: mov    DWORD PTR [esp+0x18],esi
  0x01eacefd: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eacf05: mov    eax,DWORD PTR [eax-0xc]
  0x01eacf08: mov    DWORD PTR [eax+0x168],ebx
  0x01eacf0e: mov    eax,ebx
  0x01eacf10: jmp    edi
  0x01eacf12: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eacf15: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eacf18: mov    ebx,DWORD PTR [eax+0x4]
  0x01eacf1b: jne    0x01eacf2e
  0x01eacf21: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eacf28: je     0x01eacf6d
  0x01eacf2e: jmp    0x01ea32d0
  0x01eacf33: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eacf3a: je     0x01eacf6d
  0x01eacf40: mov    eax,DWORD PTR [esp]
  0x01eacf43: pusha  
  0x01eacf44: pushf  
  0x01eacf45: sub    esp,0x10
  0x01eacf48: movsd  QWORD PTR [esp],xmm0
  0x01eacf4d: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eacf53: push   eax
  0x01eacf54: push   ebx
  0x01eacf55: call   0x552179d0
  0x01eacf5a: add    esp,0x8
  0x01eacf5d: movsd  xmm0,QWORD PTR [esp]
  0x01eacf62: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eacf68: add    esp,0x10
  0x01eacf6b: popf   
  0x01eacf6c: popa   
  0x01eacf6d: pop    eax
  0x01eacf6e: mov    esi,esp
  0x01eacf70: sub    esp,0x24
  0x01eacf73: mov    DWORD PTR [esp+0x20],ecx
  0x01eacf77: mov    DWORD PTR [esp+0x1c],edx
  0x01eacf7b: mov    edi,DWORD PTR [esp+0x24]
  0x01eacf7f: mov    DWORD PTR [esp+0x14],edi
  0x01eacf83: mov    edi,DWORD PTR [esp+0x28]
  0x01eacf87: mov    DWORD PTR [esp+0x18],edi
  0x01eacf8b: mov    edi,DWORD PTR [esp+0x3c]
  0x01eacf8f: mov    DWORD PTR [esp+0x10],edi
  0x01eacf93: mov    edi,DWORD PTR [esp+0x2c]
  0x01eacf97: mov    DWORD PTR [esp+0x8],edi
  0x01eacf9b: mov    edi,DWORD PTR [esp+0x30]
  0x01eacf9f: mov    DWORD PTR [esp+0xc],edi
  0x01eacfa3: mov    edi,DWORD PTR [esp+0x34]
  0x01eacfa7: mov    DWORD PTR [esp],edi
  0x01eacfaa: mov    edi,DWORD PTR [esp+0x38]
  0x01eacfae: mov    DWORD PTR [esp+0x4],edi
  0x01eacfb2: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eacfb5: push   eax
  0x01eacfb6: jmp    ecx

AHE@0x0422bda4: 0xabebebe0 i2c: 0x01ead030 c2i: 0x01ead0e9 c2iUV: 0x01ead0c8
i2c argument handler #26 for: receiver (JJJ)V (306 bytes generated)
c2i argument handler starts at 01EAD0E9
  0x01ead030: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ead033: mov    edi,0x1dc2940
  0x01ead038: cmp    eax,edi
  0x01ead03a: jbe    0x01ead04d
  0x01ead040: mov    edi,0x1ea2940
  0x01ead045: cmp    eax,edi
  0x01ead047: jb     0x01ead078
  0x01ead04d: mov    edi,0x1dc0340
  0x01ead052: cmp    eax,edi
  0x01ead054: jbe    0x01ead067
  0x01ead05a: mov    edi,0x1dc2668
  0x01ead05f: cmp    eax,edi
  0x01ead061: jb     0x01ead078
  ;; i2c adapter must return to an interpreter frame
  0x01ead067: push   0x5531723c
  0x01ead06c: call   0x01ead071
  0x01ead071: pusha  
  0x01ead072: call   0x54dedbf0
  0x01ead077: hlt    
  ;; } verify_i2ce 
  0x01ead078: mov    edi,esp
  0x01ead07a: sub    esp,0x18
  0x01ead07d: and    esp,0xfffffff0
  0x01ead080: push   eax
  0x01ead081: mov    eax,edi
  0x01ead083: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ead086: mov    ecx,DWORD PTR [eax+0x1c]
  0x01ead089: mov    esi,DWORD PTR [eax+0x14]
  0x01ead08c: mov    DWORD PTR [esp+0x4],esi
  0x01ead090: mov    esi,DWORD PTR [eax+0x18]
  0x01ead093: mov    DWORD PTR [esp+0x8],esi
  0x01ead097: mov    esi,DWORD PTR [eax+0xc]
  0x01ead09a: mov    DWORD PTR [esp+0xc],esi
  0x01ead09e: mov    esi,DWORD PTR [eax+0x10]
  0x01ead0a1: mov    DWORD PTR [esp+0x10],esi
  0x01ead0a5: mov    esi,DWORD PTR [eax+0x4]
  0x01ead0a8: mov    DWORD PTR [esp+0x14],esi
  0x01ead0ac: mov    esi,DWORD PTR [eax+0x8]
  0x01ead0af: mov    DWORD PTR [esp+0x18],esi
  0x01ead0b3: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ead0bb: mov    eax,DWORD PTR [eax-0xc]
  0x01ead0be: mov    DWORD PTR [eax+0x168],ebx
  0x01ead0c4: mov    eax,ebx
  0x01ead0c6: jmp    edi
  0x01ead0c8: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ead0cb: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ead0ce: mov    ebx,DWORD PTR [eax+0x4]
  0x01ead0d1: jne    0x01ead0e4
  0x01ead0d7: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ead0de: je     0x01ead123
  0x01ead0e4: jmp    0x01ea32d0
  0x01ead0e9: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ead0f0: je     0x01ead123
  0x01ead0f6: mov    eax,DWORD PTR [esp]
  0x01ead0f9: pusha  
  0x01ead0fa: pushf  
  0x01ead0fb: sub    esp,0x10
  0x01ead0fe: movsd  QWORD PTR [esp],xmm0
  0x01ead103: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ead109: push   eax
  0x01ead10a: push   ebx
  0x01ead10b: call   0x552179d0
  0x01ead110: add    esp,0x8
  0x01ead113: movsd  xmm0,QWORD PTR [esp]
  0x01ead118: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ead11e: add    esp,0x10
  0x01ead121: popf   
  0x01ead122: popa   
  0x01ead123: pop    eax
  0x01ead124: mov    esi,esp
  0x01ead126: sub    esp,0x1c
  0x01ead129: mov    DWORD PTR [esp+0x18],ecx
  0x01ead12d: mov    edi,DWORD PTR [esp+0x1c]
  0x01ead131: mov    DWORD PTR [esp+0x10],edi
  0x01ead135: mov    edi,DWORD PTR [esp+0x20]
  0x01ead139: mov    DWORD PTR [esp+0x14],edi
  0x01ead13d: mov    edi,DWORD PTR [esp+0x24]
  0x01ead141: mov    DWORD PTR [esp+0x8],edi
  0x01ead145: mov    edi,DWORD PTR [esp+0x28]
  0x01ead149: mov    DWORD PTR [esp+0xc],edi
  0x01ead14d: mov    edi,DWORD PTR [esp+0x2c]
  0x01ead151: mov    DWORD PTR [esp],edi
  0x01ead154: mov    edi,DWORD PTR [esp+0x30]
  0x01ead158: mov    DWORD PTR [esp+0x4],edi
  0x01ead15c: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ead15f: push   eax
  0x01ead160: jmp    ecx

AHE@0x0422bdd0: 0xaaaaaaaaa0000000 i2c: 0x01ead1f0 c2i: 0x01ead2b3 c2iUV: 0x01ead292
i2c argument handler #27 for: receiver (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package; (328 bytes generated)
c2i argument handler starts at 01EAD2B3
  0x01ead1f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ead1f3: mov    edi,0x1dc2940
  0x01ead1f8: cmp    eax,edi
  0x01ead1fa: jbe    0x01ead20d
  0x01ead200: mov    edi,0x1ea2940
  0x01ead205: cmp    eax,edi
  0x01ead207: jb     0x01ead238
  0x01ead20d: mov    edi,0x1dc0340
  0x01ead212: cmp    eax,edi
  0x01ead214: jbe    0x01ead227
  0x01ead21a: mov    edi,0x1dc2668
  0x01ead21f: cmp    eax,edi
  0x01ead221: jb     0x01ead238
  ;; i2c adapter must return to an interpreter frame
  0x01ead227: push   0x5531723c
  0x01ead22c: call   0x01ead231
  0x01ead231: pusha  
  0x01ead232: call   0x54dedbf0
  0x01ead237: hlt    
  ;; } verify_i2ce 
  0x01ead238: mov    edi,esp
  0x01ead23a: sub    esp,0x20
  0x01ead23d: and    esp,0xfffffff0
  0x01ead240: push   eax
  0x01ead241: mov    eax,edi
  0x01ead243: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ead246: mov    ecx,DWORD PTR [eax+0x24]
  0x01ead249: mov    edx,DWORD PTR [eax+0x20]
  0x01ead24c: mov    esi,DWORD PTR [eax+0x1c]
  0x01ead24f: mov    DWORD PTR [esp+0x4],esi
  0x01ead253: mov    esi,DWORD PTR [eax+0x18]
  0x01ead256: mov    DWORD PTR [esp+0x8],esi
  0x01ead25a: mov    esi,DWORD PTR [eax+0x14]
  0x01ead25d: mov    DWORD PTR [esp+0xc],esi
  0x01ead261: mov    esi,DWORD PTR [eax+0x10]
  0x01ead264: mov    DWORD PTR [esp+0x10],esi
  0x01ead268: mov    esi,DWORD PTR [eax+0xc]
  0x01ead26b: mov    DWORD PTR [esp+0x14],esi
  0x01ead26f: mov    esi,DWORD PTR [eax+0x8]
  0x01ead272: mov    DWORD PTR [esp+0x18],esi
  0x01ead276: mov    esi,DWORD PTR [eax+0x4]
  0x01ead279: mov    DWORD PTR [esp+0x1c],esi
  0x01ead27d: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ead285: mov    eax,DWORD PTR [eax-0xc]
  0x01ead288: mov    DWORD PTR [eax+0x168],ebx
  0x01ead28e: mov    eax,ebx
  0x01ead290: jmp    edi
  0x01ead292: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ead295: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ead298: mov    ebx,DWORD PTR [eax+0x4]
  0x01ead29b: jne    0x01ead2ae
  0x01ead2a1: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ead2a8: je     0x01ead2ed
  0x01ead2ae: jmp    0x01ea32d0
  0x01ead2b3: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ead2ba: je     0x01ead2ed
  0x01ead2c0: mov    eax,DWORD PTR [esp]
  0x01ead2c3: pusha  
  0x01ead2c4: pushf  
  0x01ead2c5: sub    esp,0x10
  0x01ead2c8: movsd  QWORD PTR [esp],xmm0
  0x01ead2cd: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ead2d3: push   eax
  0x01ead2d4: push   ebx
  0x01ead2d5: call   0x552179d0
  0x01ead2da: add    esp,0x8
  0x01ead2dd: movsd  xmm0,QWORD PTR [esp]
  0x01ead2e2: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ead2e8: add    esp,0x10
  0x01ead2eb: popf   
  0x01ead2ec: popa   
  0x01ead2ed: pop    eax
  0x01ead2ee: mov    esi,esp
  0x01ead2f0: sub    esp,0x24
  0x01ead2f3: mov    DWORD PTR [esp+0x20],ecx
  0x01ead2f7: mov    DWORD PTR [esp+0x1c],edx
  0x01ead2fb: mov    edi,DWORD PTR [esp+0x24]
  0x01ead2ff: mov    DWORD PTR [esp+0x18],edi
  0x01ead303: mov    edi,DWORD PTR [esp+0x28]
  0x01ead307: mov    DWORD PTR [esp+0x14],edi
  0x01ead30b: mov    edi,DWORD PTR [esp+0x2c]
  0x01ead30f: mov    DWORD PTR [esp+0x10],edi
  0x01ead313: mov    edi,DWORD PTR [esp+0x30]
  0x01ead317: mov    DWORD PTR [esp+0xc],edi
  0x01ead31b: mov    edi,DWORD PTR [esp+0x34]
  0x01ead31f: mov    DWORD PTR [esp+0x8],edi
  0x01ead323: mov    edi,DWORD PTR [esp+0x38]
  0x01ead327: mov    DWORD PTR [esp+0x4],edi
  0x01ead32b: mov    edi,DWORD PTR [esp+0x3c]
  0x01ead32f: mov    DWORD PTR [esp],edi
  0x01ead332: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ead335: push   eax
  0x01ead336: jmp    ecx

Decoding RuntimeStub - AbstractMethodError throw_exception 0x01eb2b48
  0x01eb2b90: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2b98: mov    ebx,DWORD PTR [ebx-0xc]
  0x01eb2b9b: push   ebp
  0x01eb2b9c: mov    ebp,esp
  0x01eb2b9e: sub    esp,0xc
  0x01eb2ba1: mov    DWORD PTR [esp],ebx
  0x01eb2ba4: mov    DWORD PTR [ebx+0x144],ebp
  0x01eb2baa: mov    DWORD PTR [ebx+0x13c],esp
  ;; call runtime_entry
  0x01eb2bb0: call   0x552140b0
  0x01eb2bb5: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2bbd: mov    ebx,DWORD PTR [ebx-0xc]
  0x01eb2bc0: mov    DWORD PTR [ebx+0x13c],0x0
  0x01eb2bca: mov    DWORD PTR [ebx+0x144],0x0
  0x01eb2bd4: mov    esp,ebp
  0x01eb2bd6: pop    ebp
  0x01eb2bd7: cmp    DWORD PTR [ebx+0x4],0x0
  0x01eb2bde: jne    0x01eb2bf5
  0x01eb2be4: push   0x552fd97c
  0x01eb2be9: call   0x01eb2bee
  0x01eb2bee: pusha  
  0x01eb2bef: call   0x54dedbf0
  0x01eb2bf4: hlt    
  0x01eb2bf5: jmp    Stub::forward exception
  0x01eb2bfa: hlt    
  0x01eb2bfb: hlt    

Decoding RuntimeStub - IncompatibleClassChangeError throw_exception 0x01eb2c08
  0x01eb2c50: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2c58: mov    ebx,DWORD PTR [ebx-0xc]
  0x01eb2c5b: push   ebp
  0x01eb2c5c: mov    ebp,esp
  0x01eb2c5e: sub    esp,0xc
  0x01eb2c61: mov    DWORD PTR [esp],ebx
  0x01eb2c64: mov    DWORD PTR [ebx+0x144],ebp
  0x01eb2c6a: mov    DWORD PTR [ebx+0x13c],esp
  ;; call runtime_entry
  0x01eb2c70: call   0x552141c0
  0x01eb2c75: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2c7d: mov    ebx,DWORD PTR [ebx-0xc]
  0x01eb2c80: mov    DWORD PTR [ebx+0x13c],0x0
  0x01eb2c8a: mov    DWORD PTR [ebx+0x144],0x0
  0x01eb2c94: mov    esp,ebp
  0x01eb2c96: pop    ebp
  0x01eb2c97: cmp    DWORD PTR [ebx+0x4],0x0
  0x01eb2c9e: jne    0x01eb2cb5
  0x01eb2ca4: push   0x552fd97c
  0x01eb2ca9: call   0x01eb2cae
  0x01eb2cae: pusha  
  0x01eb2caf: call   0x54dedbf0
  0x01eb2cb4: hlt    
  0x01eb2cb5: jmp    Stub::forward exception
  0x01eb2cba: hlt    
  0x01eb2cbb: hlt    

Decoding RuntimeStub - NullPointerException at call throw_exception 0x01eb2cc8
  0x01eb2d10: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2d18: mov    ebx,DWORD PTR [ebx-0xc]
  0x01eb2d1b: push   ebp
  0x01eb2d1c: mov    ebp,esp
  0x01eb2d1e: sub    esp,0xc
  0x01eb2d21: mov    DWORD PTR [esp],ebx
  0x01eb2d24: mov    DWORD PTR [ebx+0x144],ebp
  0x01eb2d2a: mov    DWORD PTR [ebx+0x13c],esp
  ;; call runtime_entry
  0x01eb2d30: call   0x552144f0
  0x01eb2d35: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2d3d: mov    ebx,DWORD PTR [ebx-0xc]
  0x01eb2d40: mov    DWORD PTR [ebx+0x13c],0x0
  0x01eb2d4a: mov    DWORD PTR [ebx+0x144],0x0
  0x01eb2d54: mov    esp,ebp
  0x01eb2d56: pop    ebp
  0x01eb2d57: cmp    DWORD PTR [ebx+0x4],0x0
  0x01eb2d5e: jne    0x01eb2d75
  0x01eb2d64: push   0x552fd97c
  0x01eb2d69: call   0x01eb2d6e
  0x01eb2d6e: pusha  
  0x01eb2d6f: call   0x54dedbf0
  0x01eb2d74: hlt    
  0x01eb2d75: jmp    Stub::forward exception
  0x01eb2d7a: hlt    
  0x01eb2d7b: hlt    

StubRoutines::verify_oop [0x01ead380, 0x01ead3c9[ (73 bytes)
  0x01ead380: pushf  
  0x01ead381: inc    DWORD PTR ds:0x5563570c
  0x01ead387: push   edx
  0x01ead388: mov    eax,DWORD PTR [esp+0x10]
  0x01ead38c: test   eax,eax
  0x01ead38e: je     Stub::verify_oop+48 0x01EAD3B0
  0x01ead394: mov    edx,eax
  0x01ead396: and    edx,0xe0000007
  0x01ead39c: cmp    edx,0x0
  0x01ead39f: jne    Stub::verify_oop+57 0x01EAD3B9
  0x01ead3a5: mov    eax,DWORD PTR [eax+0x4]
  0x01ead3a8: test   eax,eax
  0x01ead3aa: je     Stub::verify_oop+57 0x01EAD3B9
  0x01ead3b0: mov    eax,DWORD PTR [esp+0x14]
  0x01ead3b4: pop    edx
  0x01ead3b5: popf   
  0x01ead3b6: ret    0xc
  0x01ead3b9: mov    eax,DWORD PTR [esp+0x14]
  0x01ead3bd: pop    edx
  0x01ead3be: popf   
  0x01ead3bf: pusha  
  ;; call MacroAssembler::debug
  0x01ead3c0: call   0x54dedbf0
  0x01ead3c5: popa   
  0x01ead3c6: ret    0xc

StubRoutines::arrayof_jbyte_disjoint_arraycopy [0x01ead3d0, 0x01ead483[ (179 bytes)
  0x01ead3d0: push   ebp
  0x01ead3d1: mov    ebp,esp
  0x01ead3d3: push   esi
  0x01ead3d4: push   edi
  0x01ead3d5: mov    esi,DWORD PTR [esp+0x10]
  0x01ead3d9: mov    edi,DWORD PTR [esp+0x14]
  0x01ead3dd: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead3e1: sub    edi,esi
  0x01ead3e3: cmp    ecx,0x8
  0x01ead3e6: jb     Stub::arrayof_jbyte_disjoint_arraycopy+118 0x01EAD446
  ;; L_copy_64_bytes:
  0x01ead3ec: mov    eax,ecx
  0x01ead3ee: shr    eax,0x3
  0x01ead3f1: jmp    Stub::arrayof_jbyte_disjoint_arraycopy+93 0x01EAD42D
  0x01ead3f3: nop    
  0x01ead3f4: nop    
  0x01ead3f5: nop    
  0x01ead3f6: nop    
  0x01ead3f7: nop    
  0x01ead3f8: nop    
  0x01ead3f9: nop    
  0x01ead3fa: nop    
  0x01ead3fb: nop    
  0x01ead3fc: nop    
  0x01ead3fd: nop    
  0x01ead3fe: nop    
  0x01ead3ff: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead400: movdqu xmm0,XMMWORD PTR [esi]
  0x01ead404: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01ead409: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01ead40e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01ead414: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01ead419: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01ead41f: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01ead424: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01ead42a: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01ead42d: sub    eax,0x8
  0x01ead430: jge    Stub::arrayof_jbyte_disjoint_arraycopy+48 0x01EAD400
  0x01ead432: add    eax,0x8
  0x01ead435: je     Stub::arrayof_jbyte_disjoint_arraycopy+118 0x01EAD446
  ;; L_copy_8_bytes:
  0x01ead437: movq   xmm0,QWORD PTR [esi]
  0x01ead43b: movq   QWORD PTR [esi+edi*1],xmm0
  0x01ead440: add    esi,0x8
  0x01ead443: dec    eax
  0x01ead444: jg     Stub::arrayof_jbyte_disjoint_arraycopy+103 0x01EAD437
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead446: test   ecx,0x4
  0x01ead44c: je     Stub::arrayof_jbyte_disjoint_arraycopy+134 0x01EAD456
  0x01ead44e: mov    eax,DWORD PTR [esi]
  0x01ead450: mov    DWORD PTR [esi+edi*1],eax
  0x01ead453: add    esi,0x4
  ;; L_copy_2_bytes:
  0x01ead456: test   ecx,0x2
  0x01ead45c: je     Stub::arrayof_jbyte_disjoint_arraycopy+152 0x01EAD468
  0x01ead45e: mov    ax,WORD PTR [esi]
  0x01ead461: mov    WORD PTR [esi+edi*1],ax
  0x01ead465: add    esi,0x2
  ;; L_copy_byte:
  0x01ead468: test   ecx,0x1
  0x01ead46e: je     Stub::arrayof_jbyte_disjoint_arraycopy+165 0x01EAD475
  0x01ead470: mov    al,BYTE PTR [esi]
  0x01ead472: mov    BYTE PTR [esi+edi*1],al
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead475: inc    DWORD PTR ds:0x55634944
  0x01ead47b: pop    edi
  0x01ead47c: pop    esi
  0x01ead47d: mov    esp,ebp
  0x01ead47f: pop    ebp
  0x01ead480: xor    eax,eax
  0x01ead482: ret    

StubRoutines::arrayof_jbyte_arraycopy [0x01ead490, 0x01ead554[ (196 bytes)
  0x01ead490: push   ebp
  0x01ead491: mov    ebp,esp
  0x01ead493: push   esi
  0x01ead494: push   edi
  0x01ead495: mov    eax,DWORD PTR [esp+0x10]
  0x01ead499: mov    edx,DWORD PTR [esp+0x14]
  0x01ead49d: mov    ecx,DWORD PTR [esp+0x18]
  0x01ead4a1: mov    esi,eax
  0x01ead4a3: mov    edi,edx
  0x01ead4a5: cmp    edx,eax
  0x01ead4a7: lea    eax,[eax+ecx*1]
  0x01ead4aa: jbe    Stub::arrayof_jbyte_disjoint_arraycopy+17 0x01EAD3E1
  0x01ead4b0: cmp    edx,eax
  0x01ead4b2: jae    Stub::arrayof_jbyte_disjoint_arraycopy+17 0x01EAD3E1
  0x01ead4b8: cmp    ecx,0x8
  0x01ead4bb: jb     Stub::arrayof_jbyte_arraycopy+130 0x01EAD512
  0x01ead4c1: lea    eax,[edx+ecx*1]
  0x01ead4c4: test   eax,0x1
  0x01ead4c9: je     Stub::arrayof_jbyte_arraycopy+66 0x01EAD4D2
  0x01ead4cb: dec    ecx
  0x01ead4cc: mov    dl,BYTE PTR [esi+ecx*1]
  0x01ead4cf: mov    BYTE PTR [edi+ecx*1],dl
  ;; L_skip_align1:
  0x01ead4d2: test   eax,0x2
  0x01ead4d7: je     Stub::arrayof_jbyte_arraycopy+84 0x01EAD4E4
  0x01ead4d9: sub    ecx,0x2
  0x01ead4dc: mov    dx,WORD PTR [esi+ecx*1]
  0x01ead4e0: mov    WORD PTR [edi+ecx*1],dx
  ;; L_skip_align2:
  0x01ead4e4: cmp    ecx,0x8
  0x01ead4e7: jb     Stub::arrayof_jbyte_arraycopy+130 0x01EAD512
  0x01ead4ed: test   eax,0x4
  0x01ead4f2: je     Stub::arrayof_jbyte_arraycopy+122 0x01EAD50A
  0x01ead4f4: sub    ecx,0x4
  0x01ead4f7: mov    edx,DWORD PTR [esi+ecx*1]
  0x01ead4fa: mov    DWORD PTR [edi+ecx*1],edx
  0x01ead4fd: jmp    Stub::arrayof_jbyte_arraycopy+122 0x01EAD50A
  0x01ead4ff: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead500: movq   xmm0,QWORD PTR [esi+ecx*1]
  0x01ead505: movq   QWORD PTR [edi+ecx*1],xmm0
  ;; L_copy_8_bytes:
  0x01ead50a: sub    ecx,0x8
  0x01ead50d: jge    Stub::arrayof_jbyte_arraycopy+112 0x01EAD500
  0x01ead50f: add    ecx,0x8
  ;; L_copy_4_bytes:
  0x01ead512: test   ecx,0x4
  0x01ead518: je     Stub::arrayof_jbyte_arraycopy+149 0x01EAD525
  0x01ead51a: mov    edx,DWORD PTR [esi+ecx*1-0x4]
  0x01ead51e: mov    DWORD PTR [edi+ecx*1-0x4],edx
  0x01ead522: sub    ecx,0x4
  ;; L_copy_2_bytes:
  0x01ead525: test   ecx,0x2
  0x01ead52b: je     Stub::arrayof_jbyte_arraycopy+170 0x01EAD53A
  0x01ead52d: mov    dx,WORD PTR [esi+ecx*1-0x2]
  0x01ead532: mov    WORD PTR [edi+ecx*1-0x2],dx
  0x01ead537: sub    ecx,0x2
  ;; L_copy_byte:
  0x01ead53a: test   ecx,0x1
  0x01ead540: je     Stub::arrayof_jbyte_arraycopy+182 0x01EAD546
  0x01ead542: mov    dl,BYTE PTR [esi]
  0x01ead544: mov    BYTE PTR [edi],dl
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead546: inc    DWORD PTR ds:0x55634944
  0x01ead54c: pop    edi
  0x01ead54d: pop    esi
  0x01ead54e: mov    esp,ebp
  0x01ead550: pop    ebp
  0x01ead551: xor    eax,eax
  0x01ead553: ret    

StubRoutines::jbyte_disjoint_arraycopy [0x01ead560, 0x01ead613[ (179 bytes)
  0x01ead560: push   ebp
  0x01ead561: mov    ebp,esp
  0x01ead563: push   esi
  0x01ead564: push   edi
  0x01ead565: mov    esi,DWORD PTR [esp+0x10]
  0x01ead569: mov    edi,DWORD PTR [esp+0x14]
  0x01ead56d: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead571: sub    edi,esi
  0x01ead573: cmp    ecx,0x8
  0x01ead576: jb     Stub::jbyte_disjoint_arraycopy+118 0x01EAD5D6
  ;; L_copy_64_bytes:
  0x01ead57c: mov    eax,ecx
  0x01ead57e: shr    eax,0x3
  0x01ead581: jmp    Stub::jbyte_disjoint_arraycopy+93 0x01EAD5BD
  0x01ead583: nop    
  0x01ead584: nop    
  0x01ead585: nop    
  0x01ead586: nop    
  0x01ead587: nop    
  0x01ead588: nop    
  0x01ead589: nop    
  0x01ead58a: nop    
  0x01ead58b: nop    
  0x01ead58c: nop    
  0x01ead58d: nop    
  0x01ead58e: nop    
  0x01ead58f: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead590: movdqu xmm0,XMMWORD PTR [esi]
  0x01ead594: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01ead599: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01ead59e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01ead5a4: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01ead5a9: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01ead5af: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01ead5b4: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01ead5ba: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01ead5bd: sub    eax,0x8
  0x01ead5c0: jge    Stub::jbyte_disjoint_arraycopy+48 0x01EAD590
  0x01ead5c2: add    eax,0x8
  0x01ead5c5: je     Stub::jbyte_disjoint_arraycopy+118 0x01EAD5D6
  ;; L_copy_8_bytes:
  0x01ead5c7: movq   xmm0,QWORD PTR [esi]
  0x01ead5cb: movq   QWORD PTR [esi+edi*1],xmm0
  0x01ead5d0: add    esi,0x8
  0x01ead5d3: dec    eax
  0x01ead5d4: jg     Stub::jbyte_disjoint_arraycopy+103 0x01EAD5C7
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead5d6: test   ecx,0x4
  0x01ead5dc: je     Stub::jbyte_disjoint_arraycopy+134 0x01EAD5E6
  0x01ead5de: mov    eax,DWORD PTR [esi]
  0x01ead5e0: mov    DWORD PTR [esi+edi*1],eax
  0x01ead5e3: add    esi,0x4
  ;; L_copy_2_bytes:
  0x01ead5e6: test   ecx,0x2
  0x01ead5ec: je     Stub::jbyte_disjoint_arraycopy+152 0x01EAD5F8
  0x01ead5ee: mov    ax,WORD PTR [esi]
  0x01ead5f1: mov    WORD PTR [esi+edi*1],ax
  0x01ead5f5: add    esi,0x2
  ;; L_copy_byte:
  0x01ead5f8: test   ecx,0x1
  0x01ead5fe: je     Stub::jbyte_disjoint_arraycopy+165 0x01EAD605
  0x01ead600: mov    al,BYTE PTR [esi]
  0x01ead602: mov    BYTE PTR [esi+edi*1],al
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead605: inc    DWORD PTR ds:0x55634944
  0x01ead60b: pop    edi
  0x01ead60c: pop    esi
  0x01ead60d: mov    esp,ebp
  0x01ead60f: pop    ebp
  0x01ead610: xor    eax,eax
  0x01ead612: ret    

StubRoutines::jbyte_arraycopy [0x01ead620, 0x01ead6e4[ (196 bytes)
  0x01ead620: push   ebp
  0x01ead621: mov    ebp,esp
  0x01ead623: push   esi
  0x01ead624: push   edi
  0x01ead625: mov    eax,DWORD PTR [esp+0x10]
  0x01ead629: mov    edx,DWORD PTR [esp+0x14]
  0x01ead62d: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead631: mov    esi,eax
  0x01ead633: mov    edi,edx
  0x01ead635: cmp    edx,eax
  0x01ead637: lea    eax,[eax+ecx*1]
  0x01ead63a: jbe    Stub::jbyte_disjoint_arraycopy+17 0x01EAD571
  0x01ead640: cmp    edx,eax
  0x01ead642: jae    Stub::jbyte_disjoint_arraycopy+17 0x01EAD571
  0x01ead648: cmp    ecx,0x8
  0x01ead64b: jb     Stub::jbyte_arraycopy+130 0x01EAD6A2
  0x01ead651: lea    eax,[edx+ecx*1]
  0x01ead654: test   eax,0x1
  0x01ead659: je     Stub::jbyte_arraycopy+66 0x01EAD662
  0x01ead65b: dec    ecx
  0x01ead65c: mov    dl,BYTE PTR [esi+ecx*1]
  0x01ead65f: mov    BYTE PTR [edi+ecx*1],dl
  ;; L_skip_align1:
  0x01ead662: test   eax,0x2
  0x01ead667: je     Stub::jbyte_arraycopy+84 0x01EAD674
  0x01ead669: sub    ecx,0x2
  0x01ead66c: mov    dx,WORD PTR [esi+ecx*1]
  0x01ead670: mov    WORD PTR [edi+ecx*1],dx
  ;; L_skip_align2:
  0x01ead674: cmp    ecx,0x8
  0x01ead677: jb     Stub::jbyte_arraycopy+130 0x01EAD6A2
  0x01ead67d: test   eax,0x4
  0x01ead682: je     Stub::jbyte_arraycopy+122 0x01EAD69A
  0x01ead684: sub    ecx,0x4
  0x01ead687: mov    edx,DWORD PTR [esi+ecx*1]
  0x01ead68a: mov    DWORD PTR [edi+ecx*1],edx
  0x01ead68d: jmp    Stub::jbyte_arraycopy+122 0x01EAD69A
  0x01ead68f: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead690: movq   xmm0,QWORD PTR [esi+ecx*1]
  0x01ead695: movq   QWORD PTR [edi+ecx*1],xmm0
  ;; L_copy_8_bytes:
  0x01ead69a: sub    ecx,0x8
  0x01ead69d: jge    Stub::jbyte_arraycopy+112 0x01EAD690
  0x01ead69f: add    ecx,0x8
  ;; L_copy_4_bytes:
  0x01ead6a2: test   ecx,0x4
  0x01ead6a8: je     Stub::jbyte_arraycopy+149 0x01EAD6B5
  0x01ead6aa: mov    edx,DWORD PTR [esi+ecx*1-0x4]
  0x01ead6ae: mov    DWORD PTR [edi+ecx*1-0x4],edx
  0x01ead6b2: sub    ecx,0x4
  ;; L_copy_2_bytes:
  0x01ead6b5: test   ecx,0x2
  0x01ead6bb: je     Stub::jbyte_arraycopy+170 0x01EAD6CA
  0x01ead6bd: mov    dx,WORD PTR [esi+ecx*1-0x2]
  0x01ead6c2: mov    WORD PTR [edi+ecx*1-0x2],dx
  0x01ead6c7: sub    ecx,0x2
  ;; L_copy_byte:
  0x01ead6ca: test   ecx,0x1
  0x01ead6d0: je     Stub::jbyte_arraycopy+182 0x01EAD6D6
  0x01ead6d2: mov    dl,BYTE PTR [esi]
  0x01ead6d4: mov    BYTE PTR [edi],dl
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead6d6: inc    DWORD PTR ds:0x55634944
  0x01ead6dc: pop    edi
  0x01ead6dd: pop    esi
  0x01ead6de: mov    esp,ebp
  0x01ead6e0: pop    ebp
  0x01ead6e1: xor    eax,eax
  0x01ead6e3: ret    

StubRoutines::arrayof_jshort_disjoint_arraycopy [0x01ead6f0, 0x01ead793[ (163 bytes)
  0x01ead6f0: push   ebp
  0x01ead6f1: mov    ebp,esp
  0x01ead6f3: push   esi
  0x01ead6f4: push   edi
  0x01ead6f5: mov    esi,DWORD PTR [esp+0x10]
  0x01ead6f9: mov    edi,DWORD PTR [esp+0x14]
  0x01ead6fd: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead701: sub    edi,esi
  0x01ead703: cmp    ecx,0x4
  0x01ead706: jb     Stub::arrayof_jshort_disjoint_arraycopy+118 0x01EAD766
  ;; L_copy_64_bytes:
  0x01ead70c: mov    eax,ecx
  0x01ead70e: shr    eax,0x2
  0x01ead711: jmp    Stub::arrayof_jshort_disjoint_arraycopy+93 0x01EAD74D
  0x01ead713: nop    
  0x01ead714: nop    
  0x01ead715: nop    
  0x01ead716: nop    
  0x01ead717: nop    
  0x01ead718: nop    
  0x01ead719: nop    
  0x01ead71a: nop    
  0x01ead71b: nop    
  0x01ead71c: nop    
  0x01ead71d: nop    
  0x01ead71e: nop    
  0x01ead71f: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead720: movdqu xmm0,XMMWORD PTR [esi]
  0x01ead724: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01ead729: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01ead72e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01ead734: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01ead739: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01ead73f: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01ead744: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01ead74a: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01ead74d: sub    eax,0x8
  0x01ead750: jge    Stub::arrayof_jshort_disjoint_arraycopy+48 0x01EAD720
  0x01ead752: add    eax,0x8
  0x01ead755: je     Stub::arrayof_jshort_disjoint_arraycopy+118 0x01EAD766
  ;; L_copy_8_bytes:
  0x01ead757: movq   xmm0,QWORD PTR [esi]
  0x01ead75b: movq   QWORD PTR [esi+edi*1],xmm0
  0x01ead760: add    esi,0x8
  0x01ead763: dec    eax
  0x01ead764: jg     Stub::arrayof_jshort_disjoint_arraycopy+103 0x01EAD757
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead766: test   ecx,0x2
  0x01ead76c: je     Stub::arrayof_jshort_disjoint_arraycopy+134 0x01EAD776
  0x01ead76e: mov    eax,DWORD PTR [esi]
  0x01ead770: mov    DWORD PTR [esi+edi*1],eax
  0x01ead773: add    esi,0x4
  ;; L_copy_2_bytes:
  0x01ead776: test   ecx,0x1
  0x01ead77c: je     Stub::arrayof_jshort_disjoint_arraycopy+149 0x01EAD785
  0x01ead77e: mov    ax,WORD PTR [esi]
  0x01ead781: mov    WORD PTR [esi+edi*1],ax
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead785: inc    DWORD PTR ds:0x5563494c
  0x01ead78b: pop    edi
  0x01ead78c: pop    esi
  0x01ead78d: mov    esp,ebp
  0x01ead78f: pop    ebp
  0x01ead790: xor    eax,eax
  0x01ead792: ret    

StubRoutines::arrayof_jshort_arraycopy [0x01ead7a0, 0x01ead855[ (181 bytes)
  0x01ead7a0: push   ebp
  0x01ead7a1: mov    ebp,esp
  0x01ead7a3: push   esi
  0x01ead7a4: push   edi
  0x01ead7a5: mov    eax,DWORD PTR [esp+0x10]
  0x01ead7a9: mov    edx,DWORD PTR [esp+0x14]
  0x01ead7ad: mov    ecx,DWORD PTR [esp+0x18]
  0x01ead7b1: mov    esi,eax
  0x01ead7b3: mov    edi,edx
  0x01ead7b5: cmp    edx,eax
  0x01ead7b7: lea    eax,[eax+ecx*2]
  0x01ead7ba: jbe    Stub::arrayof_jshort_disjoint_arraycopy+17 0x01EAD701
  0x01ead7c0: cmp    edx,eax
  0x01ead7c2: jae    Stub::arrayof_jshort_disjoint_arraycopy+17 0x01EAD701
  0x01ead7c8: cmp    ecx,0x4
  0x01ead7cb: jb     Stub::arrayof_jshort_arraycopy+130 0x01EAD822
  0x01ead7d1: lea    eax,[edx+ecx*2]
  0x01ead7d4: test   eax,0x2
  0x01ead7d9: je     Stub::arrayof_jshort_arraycopy+70 0x01EAD7E6
  0x01ead7db: sub    ecx,0x1
  0x01ead7de: mov    dx,WORD PTR [esi+ecx*2]
  0x01ead7e2: mov    WORD PTR [edi+ecx*2],dx
  ;; L_skip_align2:
  0x01ead7e6: cmp    ecx,0x4
  0x01ead7e9: jb     Stub::arrayof_jshort_arraycopy+130 0x01EAD822
  0x01ead7ef: test   eax,0x4
  0x01ead7f4: je     Stub::arrayof_jshort_arraycopy+122 0x01EAD81A
  0x01ead7f6: sub    ecx,0x2
  0x01ead7f9: mov    edx,DWORD PTR [esi+ecx*2]
  0x01ead7fc: mov    DWORD PTR [edi+ecx*2],edx
  0x01ead7ff: jmp    Stub::arrayof_jshort_arraycopy+122 0x01EAD81A
  0x01ead801: nop    
  0x01ead802: nop    
  0x01ead803: nop    
  0x01ead804: nop    
  0x01ead805: nop    
  0x01ead806: nop    
  0x01ead807: nop    
  0x01ead808: nop    
  0x01ead809: nop    
  0x01ead80a: nop    
  0x01ead80b: nop    
  0x01ead80c: nop    
  0x01ead80d: nop    
  0x01ead80e: nop    
  0x01ead80f: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead810: movq   xmm0,QWORD PTR [esi+ecx*2]
  0x01ead815: movq   QWORD PTR [edi+ecx*2],xmm0
  ;; L_copy_8_bytes:
  0x01ead81a: sub    ecx,0x4
  0x01ead81d: jge    Stub::arrayof_jshort_arraycopy+112 0x01EAD810
  0x01ead81f: add    ecx,0x4
  ;; L_copy_4_bytes:
  0x01ead822: test   ecx,0x2
  0x01ead828: je     Stub::arrayof_jshort_arraycopy+149 0x01EAD835
  0x01ead82a: mov    edx,DWORD PTR [esi+ecx*2-0x4]
  0x01ead82e: mov    DWORD PTR [edi+ecx*2-0x4],edx
  0x01ead832: sub    ecx,0x2
  ;; L_copy_2_bytes:
  0x01ead835: test   ecx,0x1
  0x01ead83b: je     Stub::arrayof_jshort_arraycopy+167 0x01EAD847
  0x01ead83d: mov    dx,WORD PTR [esi+ecx*2-0x2]
  0x01ead842: mov    WORD PTR [edi+ecx*2-0x2],dx
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead847: inc    DWORD PTR ds:0x5563494c
  0x01ead84d: pop    edi
  0x01ead84e: pop    esi
  0x01ead84f: mov    esp,ebp
  0x01ead851: pop    ebp
  0x01ead852: xor    eax,eax
  0x01ead854: ret    

StubRoutines::jshort_disjoint_arraycopy [0x01ead860, 0x01ead903[ (163 bytes)
  0x01ead860: push   ebp
  0x01ead861: mov    ebp,esp
  0x01ead863: push   esi
  0x01ead864: push   edi
  0x01ead865: mov    esi,DWORD PTR [esp+0x10]
  0x01ead869: mov    edi,DWORD PTR [esp+0x14]
  0x01ead86d: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead871: sub    edi,esi
  0x01ead873: cmp    ecx,0x4
  0x01ead876: jb     Stub::jshort_disjoint_arraycopy+118 0x01EAD8D6
  ;; L_copy_64_bytes:
  0x01ead87c: mov    eax,ecx
  0x01ead87e: shr    eax,0x2
  0x01ead881: jmp    Stub::jshort_disjoint_arraycopy+93 0x01EAD8BD
  0x01ead883: nop    
  0x01ead884: nop    
  0x01ead885: nop    
  0x01ead886: nop    
  0x01ead887: nop    
  0x01ead888: nop    
  0x01ead889: nop    
  0x01ead88a: nop    
  0x01ead88b: nop    
  0x01ead88c: nop    
  0x01ead88d: nop    
  0x01ead88e: nop    
  0x01ead88f: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead890: movdqu xmm0,XMMWORD PTR [esi]
  0x01ead894: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01ead899: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01ead89e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01ead8a4: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01ead8a9: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01ead8af: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01ead8b4: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01ead8ba: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01ead8bd: sub    eax,0x8
  0x01ead8c0: jge    Stub::jshort_disjoint_arraycopy+48 0x01EAD890
  0x01ead8c2: add    eax,0x8
  0x01ead8c5: je     Stub::jshort_disjoint_arraycopy+118 0x01EAD8D6
  ;; L_copy_8_bytes:
  0x01ead8c7: movq   xmm0,QWORD PTR [esi]
  0x01ead8cb: movq   QWORD PTR [esi+edi*1],xmm0
  0x01ead8d0: add    esi,0x8
  0x01ead8d3: dec    eax
  0x01ead8d4: jg     Stub::jshort_disjoint_arraycopy+103 0x01EAD8C7
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead8d6: test   ecx,0x2
  0x01ead8dc: je     Stub::jshort_disjoint_arraycopy+134 0x01EAD8E6
  0x01ead8de: mov    eax,DWORD PTR [esi]
  0x01ead8e0: mov    DWORD PTR [esi+edi*1],eax
  0x01ead8e3: add    esi,0x4
  ;; L_copy_2_bytes:
  0x01ead8e6: test   ecx,0x1
  0x01ead8ec: je     Stub::jshort_disjoint_arraycopy+149 0x01EAD8F5
  0x01ead8ee: mov    ax,WORD PTR [esi]
  0x01ead8f1: mov    WORD PTR [esi+edi*1],ax
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead8f5: inc    DWORD PTR ds:0x5563494c
  0x01ead8fb: pop    edi
  0x01ead8fc: pop    esi
  0x01ead8fd: mov    esp,ebp
  0x01ead8ff: pop    ebp
  0x01ead900: xor    eax,eax
  0x01ead902: ret    

StubRoutines::jshort_arraycopy [0x01ead910, 0x01ead9c5[ (181 bytes)
  0x01ead910: push   ebp
  0x01ead911: mov    ebp,esp
  0x01ead913: push   esi
  0x01ead914: push   edi
  0x01ead915: mov    eax,DWORD PTR [esp+0x10]
  0x01ead919: mov    edx,DWORD PTR [esp+0x14]
  0x01ead91d: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead921: mov    esi,eax
  0x01ead923: mov    edi,edx
  0x01ead925: cmp    edx,eax
  0x01ead927: lea    eax,[eax+ecx*2]
  0x01ead92a: jbe    Stub::jshort_disjoint_arraycopy+17 0x01EAD871
  0x01ead930: cmp    edx,eax
  0x01ead932: jae    Stub::jshort_disjoint_arraycopy+17 0x01EAD871
  0x01ead938: cmp    ecx,0x4
  0x01ead93b: jb     Stub::jshort_arraycopy+130 0x01EAD992
  0x01ead941: lea    eax,[edx+ecx*2]
  0x01ead944: test   eax,0x2
  0x01ead949: je     Stub::jshort_arraycopy+70 0x01EAD956
  0x01ead94b: sub    ecx,0x1
  0x01ead94e: mov    dx,WORD PTR [esi+ecx*2]
  0x01ead952: mov    WORD PTR [edi+ecx*2],dx
  ;; L_skip_align2:
  0x01ead956: cmp    ecx,0x4
  0x01ead959: jb     Stub::jshort_arraycopy+130 0x01EAD992
  0x01ead95f: test   eax,0x4
  0x01ead964: je     Stub::jshort_arraycopy+122 0x01EAD98A
  0x01ead966: sub    ecx,0x2
  0x01ead969: mov    edx,DWORD PTR [esi+ecx*2]
  0x01ead96c: mov    DWORD PTR [edi+ecx*2],edx
  0x01ead96f: jmp    Stub::jshort_arraycopy+122 0x01EAD98A
  0x01ead971: nop    
  0x01ead972: nop    
  0x01ead973: nop    
  0x01ead974: nop    
  0x01ead975: nop    
  0x01ead976: nop    
  0x01ead977: nop    
  0x01ead978: nop    
  0x01ead979: nop    
  0x01ead97a: nop    
  0x01ead97b: nop    
  0x01ead97c: nop    
  0x01ead97d: nop    
  0x01ead97e: nop    
  0x01ead97f: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead980: movq   xmm0,QWORD PTR [esi+ecx*2]
  0x01ead985: movq   QWORD PTR [edi+ecx*2],xmm0
  ;; L_copy_8_bytes:
  0x01ead98a: sub    ecx,0x4
  0x01ead98d: jge    Stub::jshort_arraycopy+112 0x01EAD980
  0x01ead98f: add    ecx,0x4
  ;; L_copy_4_bytes:
  0x01ead992: test   ecx,0x2
  0x01ead998: je     Stub::jshort_arraycopy+149 0x01EAD9A5
  0x01ead99a: mov    edx,DWORD PTR [esi+ecx*2-0x4]
  0x01ead99e: mov    DWORD PTR [edi+ecx*2-0x4],edx
  0x01ead9a2: sub    ecx,0x2
  ;; L_copy_2_bytes:
  0x01ead9a5: test   ecx,0x1
  0x01ead9ab: je     Stub::jshort_arraycopy+167 0x01EAD9B7
  0x01ead9ad: mov    dx,WORD PTR [esi+ecx*2-0x2]
  0x01ead9b2: mov    WORD PTR [edi+ecx*2-0x2],dx
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead9b7: inc    DWORD PTR ds:0x5563494c
  0x01ead9bd: pop    edi
  0x01ead9be: pop    esi
  0x01ead9bf: mov    esp,ebp
  0x01ead9c1: pop    ebp
  0x01ead9c2: xor    eax,eax
  0x01ead9c4: ret    

StubRoutines::jint_disjoint_arraycopy [0x01ead9d0, 0x01eada61[ (145 bytes)
  0x01ead9d0: push   ebp
  0x01ead9d1: mov    ebp,esp
  0x01ead9d3: push   esi
  0x01ead9d4: push   edi
  0x01ead9d5: mov    esi,DWORD PTR [esp+0x10]
  0x01ead9d9: mov    edi,DWORD PTR [esp+0x14]
  0x01ead9dd: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01ead9e1: sub    edi,esi
  0x01ead9e3: cmp    ecx,0x2
  0x01ead9e6: jb     Stub::jint_disjoint_arraycopy+118 0x01EADA46
  ;; L_copy_64_bytes:
  0x01ead9ec: mov    eax,ecx
  0x01ead9ee: shr    eax,0x1
  0x01ead9f1: jmp    Stub::jint_disjoint_arraycopy+93 0x01EADA2D
  0x01ead9f3: nop    
  0x01ead9f4: nop    
  0x01ead9f5: nop    
  0x01ead9f6: nop    
  0x01ead9f7: nop    
  0x01ead9f8: nop    
  0x01ead9f9: nop    
  0x01ead9fa: nop    
  0x01ead9fb: nop    
  0x01ead9fc: nop    
  0x01ead9fd: nop    
  0x01ead9fe: nop    
  0x01ead9ff: nop    
  ;; L_copy_64_bytes_loop:
  0x01eada00: movdqu xmm0,XMMWORD PTR [esi]
  0x01eada04: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01eada09: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01eada0e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01eada14: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01eada19: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01eada1f: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01eada24: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01eada2a: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01eada2d: sub    eax,0x8
  0x01eada30: jge    Stub::jint_disjoint_arraycopy+48 0x01EADA00
  0x01eada32: add    eax,0x8
  0x01eada35: je     Stub::jint_disjoint_arraycopy+118 0x01EADA46
  ;; L_copy_8_bytes:
  0x01eada37: movq   xmm0,QWORD PTR [esi]
  0x01eada3b: movq   QWORD PTR [esi+edi*1],xmm0
  0x01eada40: add    esi,0x8
  0x01eada43: dec    eax
  0x01eada44: jg     Stub::jint_disjoint_arraycopy+103 0x01EADA37
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01eada46: test   ecx,0x1
  0x01eada4c: je     Stub::jint_disjoint_arraycopy+131 0x01EADA53
  0x01eada4e: mov    eax,DWORD PTR [esi]
  0x01eada50: mov    DWORD PTR [esi+edi*1],eax
  ;; L_copy_2_bytes:
  ;; inc_counter SharedRuntime::_jint_array_copy_ctr
  0x01eada53: inc    DWORD PTR ds:0x55634950
  0x01eada59: pop    edi
  0x01eada5a: pop    esi
  0x01eada5b: mov    esp,ebp
  0x01eada5d: pop    ebp
  0x01eada5e: xor    eax,eax
  0x01eada60: ret    

StubRoutines::jint_arraycopy [0x01eada70, 0x01eadaf0[ (128 bytes)
  0x01eada70: push   ebp
  0x01eada71: mov    ebp,esp
  0x01eada73: push   esi
  0x01eada74: push   edi
  0x01eada75: mov    eax,DWORD PTR [esp+0x10]
  0x01eada79: mov    edx,DWORD PTR [esp+0x14]
  0x01eada7d: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01eada81: mov    esi,eax
  0x01eada83: mov    edi,edx
  0x01eada85: cmp    edx,eax
  0x01eada87: lea    eax,[eax+ecx*4]
  0x01eada8a: jbe    Stub::jint_disjoint_arraycopy+17 0x01EAD9E1
  0x01eada90: cmp    edx,eax
  0x01eada92: jae    Stub::jint_disjoint_arraycopy+17 0x01EAD9E1
  0x01eada98: cmp    ecx,0x2
  0x01eada9b: jb     Stub::jint_arraycopy+98 0x01EADAD2
  0x01eadaa1: test   eax,0x4
  0x01eadaa6: je     Stub::jint_arraycopy+90 0x01EADACA
  0x01eadaa8: sub    ecx,0x1
  0x01eadaab: mov    edx,DWORD PTR [esi+ecx*4]
  0x01eadaae: mov    DWORD PTR [edi+ecx*4],edx
  0x01eadab1: jmp    Stub::jint_arraycopy+90 0x01EADACA
  0x01eadab3: nop    
  0x01eadab4: nop    
  0x01eadab5: nop    
  0x01eadab6: nop    
  0x01eadab7: nop    
  0x01eadab8: nop    
  0x01eadab9: nop    
  0x01eadaba: nop    
  0x01eadabb: nop    
  0x01eadabc: nop    
  0x01eadabd: nop    
  0x01eadabe: nop    
  0x01eadabf: nop    
  ;; L_copy_8_bytes_loop:
  0x01eadac0: movq   xmm0,QWORD PTR [esi+ecx*4]
  0x01eadac5: movq   QWORD PTR [edi+ecx*4],xmm0
  ;; L_copy_8_bytes:
  0x01eadaca: sub    ecx,0x2
  0x01eadacd: jge    Stub::jint_arraycopy+80 0x01EADAC0
  0x01eadacf: add    ecx,0x2
  ;; L_copy_4_bytes:
  0x01eadad2: test   ecx,0x1
  0x01eadad8: je     Stub::jint_arraycopy+114 0x01EADAE2
  0x01eadada: mov    edx,DWORD PTR [esi+ecx*4-0x4]
  0x01eadade: mov    DWORD PTR [edi+ecx*4-0x4],edx
  ;; L_copy_2_bytes:
  ;; inc_counter SharedRuntime::_jint_array_copy_ctr
  0x01eadae2: inc    DWORD PTR ds:0x55634950
  0x01eadae8: pop    edi
  0x01eadae9: pop    esi
  0x01eadaea: mov    esp,ebp
  0x01eadaec: pop    ebp
  0x01eadaed: xor    eax,eax
  0x01eadaef: ret    

StubRoutines::oop_disjoint_arraycopy [0x01eadaf0, 0x01eadb9e[ (174 bytes)
  0x01eadaf0: push   ebp
  0x01eadaf1: mov    ebp,esp
  0x01eadaf3: push   esi
  0x01eadaf4: push   edi
  0x01eadaf5: mov    esi,DWORD PTR [esp+0x10]
  0x01eadaf9: mov    edi,DWORD PTR [esp+0x14]
  0x01eadafd: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01eadb01: test   ecx,ecx
  0x01eadb03: je     Stub::oop_disjoint_arraycopy+160 0x01EADB90
  0x01eadb09: mov    edx,edi
  0x01eadb0b: sub    edi,esi
  0x01eadb0d: cmp    ecx,0x2
  0x01eadb10: jb     Stub::oop_disjoint_arraycopy+118 0x01EADB66
  ;; L_copy_64_bytes:
  0x01eadb16: mov    eax,ecx
  0x01eadb18: shr    eax,0x1
  0x01eadb1b: jmp    Stub::oop_disjoint_arraycopy+93 0x01EADB4D
  0x01eadb1d: nop    
  0x01eadb1e: nop    
  0x01eadb1f: nop    
  ;; L_copy_64_bytes_loop:
  0x01eadb20: movdqu xmm0,XMMWORD PTR [esi]
  0x01eadb24: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01eadb29: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01eadb2e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01eadb34: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01eadb39: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01eadb3f: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01eadb44: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01eadb4a: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01eadb4d: sub    eax,0x8
  0x01eadb50: jge    Stub::oop_disjoint_arraycopy+48 0x01EADB20
  0x01eadb52: add    eax,0x8
  0x01eadb55: je     Stub::oop_disjoint_arraycopy+118 0x01EADB66
  ;; L_copy_8_bytes:
  0x01eadb57: movq   xmm0,QWORD PTR [esi]
  0x01eadb5b: movq   QWORD PTR [esi+edi*1],xmm0
  0x01eadb60: add    esi,0x8
  0x01eadb63: dec    eax
  0x01eadb64: jg     Stub::oop_disjoint_arraycopy+103 0x01EADB57
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01eadb66: test   ecx,0x1
  0x01eadb6c: je     Stub::oop_disjoint_arraycopy+131 0x01EADB73
  0x01eadb6e: mov    eax,DWORD PTR [esi]
  0x01eadb70: mov    DWORD PTR [esi+edi*1],eax
  ;; L_copy_2_bytes:
  0x01eadb73: mov    ecx,DWORD PTR [esp+0x18]
  0x01eadb77: mov    edi,edx
  0x01eadb79: lea    ecx,[edi+ecx*4-0x4]
  0x01eadb7d: shr    edi,0x9
  0x01eadb80: shr    ecx,0x9
  0x01eadb83: sub    ecx,edi
  ;; L_loop:
  0x01eadb85: mov    BYTE PTR [edi+ecx*1+0x1707000],0x0
  0x01eadb8d: dec    ecx
  0x01eadb8e: jge    Stub::oop_disjoint_arraycopy+149 0x01EADB85
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadb90: inc    DWORD PTR ds:0x55634958
  0x01eadb96: pop    edi
  0x01eadb97: pop    esi
  0x01eadb98: mov    esp,ebp
  0x01eadb9a: pop    ebp
  0x01eadb9b: xor    eax,eax
  0x01eadb9d: ret    

StubRoutines::oop_arraycopy [0x01eadba0, 0x01eadc3b[ (155 bytes)
  0x01eadba0: push   ebp
  0x01eadba1: mov    ebp,esp
  0x01eadba3: push   esi
  0x01eadba4: push   edi
  0x01eadba5: mov    eax,DWORD PTR [esp+0x10]
  0x01eadba9: mov    edx,DWORD PTR [esp+0x14]
  0x01eadbad: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01eadbb1: mov    esi,eax
  0x01eadbb3: mov    edi,edx
  0x01eadbb5: cmp    edx,eax
  0x01eadbb7: lea    eax,[eax+ecx*4]
  0x01eadbba: jbe    Stub::oop_disjoint_arraycopy+17 0x01EADB01
  0x01eadbc0: cmp    edx,eax
  0x01eadbc2: jae    Stub::oop_disjoint_arraycopy+17 0x01EADB01
  0x01eadbc8: test   ecx,ecx
  0x01eadbca: je     Stub::oop_arraycopy+141 0x01EADC2D
  0x01eadbd0: cmp    ecx,0x2
  0x01eadbd3: jb     Stub::oop_arraycopy+98 0x01EADC02
  0x01eadbd9: test   eax,0x4
  0x01eadbde: je     Stub::oop_arraycopy+90 0x01EADBFA
  0x01eadbe0: sub    ecx,0x1
  0x01eadbe3: mov    edx,DWORD PTR [esi+ecx*4]
  0x01eadbe6: mov    DWORD PTR [edi+ecx*4],edx
  0x01eadbe9: jmp    Stub::oop_arraycopy+90 0x01EADBFA
  0x01eadbeb: nop    
  0x01eadbec: nop    
  0x01eadbed: nop    
  0x01eadbee: nop    
  0x01eadbef: nop    
  ;; L_copy_8_bytes_loop:
  0x01eadbf0: movq   xmm0,QWORD PTR [esi+ecx*4]
  0x01eadbf5: movq   QWORD PTR [edi+ecx*4],xmm0
  ;; L_copy_8_bytes:
  0x01eadbfa: sub    ecx,0x2
  0x01eadbfd: jge    Stub::oop_arraycopy+80 0x01EADBF0
  0x01eadbff: add    ecx,0x2
  ;; L_copy_4_bytes:
  0x01eadc02: test   ecx,0x1
  0x01eadc08: je     Stub::oop_arraycopy+114 0x01EADC12
  0x01eadc0a: mov    edx,DWORD PTR [esi+ecx*4-0x4]
  0x01eadc0e: mov    DWORD PTR [edi+ecx*4-0x4],edx
  ;; L_copy_2_bytes:
  0x01eadc12: mov    ecx,DWORD PTR [esp+0x18]
  0x01eadc16: lea    ecx,[edi+ecx*4-0x4]
  0x01eadc1a: shr    edi,0x9
  0x01eadc1d: shr    ecx,0x9
  0x01eadc20: sub    ecx,edi
  ;; L_loop:
  0x01eadc22: mov    BYTE PTR [edi+ecx*1+0x1707000],0x0
  0x01eadc2a: dec    ecx
  0x01eadc2b: jge    Stub::oop_arraycopy+130 0x01EADC22
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadc2d: inc    DWORD PTR ds:0x55634958
  0x01eadc33: pop    edi
  0x01eadc34: pop    esi
  0x01eadc35: mov    esp,ebp
  0x01eadc37: pop    ebp
  0x01eadc38: xor    eax,eax
  0x01eadc3a: ret    

StubRoutines::oop_disjoint_arraycopy_uninit [0x01eadc40, 0x01eadcee[ (174 bytes)
  0x01eadc40: push   ebp
  0x01eadc41: mov    ebp,esp
  0x01eadc43: push   esi
  0x01eadc44: push   edi
  0x01eadc45: mov    esi,DWORD PTR [esp+0x10]
  0x01eadc49: mov    edi,DWORD PTR [esp+0x14]
  0x01eadc4d: mov    ecx,DWORD PTR [esp+0x18]
  ;; Entry:
  0x01eadc51: test   ecx,ecx
  0x01eadc53: je     Stub::oop_disjoint_arraycopy_uninit+160 0x01EADCE0
  0x01eadc59: mov    edx,edi
  0x01eadc5b: sub    edi,esi
  0x01eadc5d: cmp    ecx,0x2
  0x01eadc60: jb     Stub::oop_disjoint_arraycopy_uninit+118 0x01EADCB6
  ;; L_copy_64_bytes:
  0x01eadc66: mov    eax,ecx
  0x01eadc68: shr    eax,0x1
  0x01eadc6b: jmp    Stub::oop_disjoint_arraycopy_uninit+93 0x01EADC9D
  0x01eadc6d: nop    
  0x01eadc6e: nop    
  0x01eadc6f: nop    
  ;; L_copy_64_bytes_loop:
  0x01eadc70: movdqu xmm0,XMMWORD PTR [esi]
  0x01eadc74: movdqu XMMWORD PTR [esi+edi*1],xmm0
  0x01eadc79: movdqu xmm1,XMMWORD PTR [esi+0x10]
  0x01eadc7e: movdqu XMMWORD PTR [esi+edi*1+0x10],xmm1
  0x01eadc84: movdqu xmm2,XMMWORD PTR [esi+0x20]
  0x01eadc89: movdqu XMMWORD PTR [esi+edi*1+0x20],xmm2
  0x01eadc8f: movdqu xmm3,XMMWORD PTR [esi+0x30]
  0x01eadc94: movdqu XMMWORD PTR [esi+edi*1+0x30],xmm3
  0x01eadc9a: add    esi,0x40
  ;; L_copy_64_bytes:
  0x01eadc9d: sub    eax,0x8
  0x01eadca0: jge    Stub::oop_disjoint_arraycopy_uninit+48 0x01EADC70
  0x01eadca2: add    eax,0x8
  0x01eadca5: je     Stub::oop_disjoint_arraycopy_uninit+118 0x01EADCB6
  ;; L_copy_8_bytes:
  0x01eadca7: movq   xmm0,QWORD PTR [esi]
  0x01eadcab: movq   QWORD PTR [esi+edi*1],xmm0
  0x01eadcb0: add    esi,0x8
  0x01eadcb3: dec    eax
  0x01eadcb4: jg     Stub::oop_disjoint_arraycopy_uninit+103 0x01EADCA7
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01eadcb6: test   ecx,0x1
  0x01eadcbc: je     Stub::oop_disjoint_arraycopy_uninit+131 0x01EADCC3
  0x01eadcbe: mov    eax,DWORD PTR [esi]
  0x01eadcc0: mov    DWORD PTR [esi+edi*1],eax
  ;; L_copy_2_bytes:
  0x01eadcc3: mov    ecx,DWORD PTR [esp+0x18]
  0x01eadcc7: mov    edi,edx
  0x01eadcc9: lea    ecx,[edi+ecx*4-0x4]
  0x01eadccd: shr    edi,0x9
  0x01eadcd0: shr    ecx,0x9
  0x01eadcd3: sub    ecx,edi
  ;; L_loop:
  0x01eadcd5: mov    BYTE PTR [edi+ecx*1+0x1707000],0x0
  0x01eadcdd: dec    ecx
  0x01eadcde: jge    Stub::oop_disjoint_arraycopy_uninit+149 0x01EADCD5
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadce0: inc    DWORD PTR ds:0x55634958
  0x01eadce6: pop    edi
  0x01eadce7: pop    esi
  0x01eadce8: mov    esp,ebp
  0x01eadcea: pop    ebp
  0x01eadceb: xor    eax,eax
  0x01eadced: ret    

StubRoutines::oop_arraycopy_uninit [0x01eadcf0, 0x01eadd8b[ (155 bytes)
  0x01eadcf0: push   ebp
  0x01eadcf1: mov    ebp,esp
  0x01eadcf3: push   esi
  0x01eadcf4: push   edi
  0x01eadcf5: mov    eax,DWORD PTR [esp+0x10]
  0x01eadcf9: mov    edx,DWORD PTR [esp+0x14]
  0x01eadcfd: mov    ecx,DWORD PTR [esp+0x18]
  0x01eadd01: mov    esi,eax
  0x01eadd03: mov    edi,edx
  0x01eadd05: cmp    edx,eax
  0x01eadd07: lea    eax,[eax+ecx*4]
  0x01eadd0a: jbe    Stub::oop_disjoint_arraycopy_uninit+17 0x01EADC51
  0x01eadd10: cmp    edx,eax
  0x01eadd12: jae    Stub::oop_disjoint_arraycopy_uninit+17 0x01EADC51
  0x01eadd18: test   ecx,ecx
  0x01eadd1a: je     Stub::oop_arraycopy_uninit+141 0x01EADD7D
  0x01eadd20: cmp    ecx,0x2
  0x01eadd23: jb     Stub::oop_arraycopy_uninit+98 0x01EADD52
  0x01eadd29: test   eax,0x4
  0x01eadd2e: je     Stub::oop_arraycopy_uninit+90 0x01EADD4A
  0x01eadd30: sub    ecx,0x1
  0x01eadd33: mov    edx,DWORD PTR [esi+ecx*4]
  0x01eadd36: mov    DWORD PTR [edi+ecx*4],edx
  0x01eadd39: jmp    Stub::oop_arraycopy_uninit+90 0x01EADD4A
  0x01eadd3b: nop    
  0x01eadd3c: nop    
  0x01eadd3d: nop    
  0x01eadd3e: nop    
  0x01eadd3f: nop    
  ;; L_copy_8_bytes_loop:
  0x01eadd40: movq   xmm0,QWORD PTR [esi+ecx*4]
  0x01eadd45: movq   QWORD PTR [edi+ecx*4],xmm0
  ;; L_copy_8_bytes:
  0x01eadd4a: sub    ecx,0x2
  0x01eadd4d: jge    Stub::oop_arraycopy_uninit+80 0x01EADD40
  0x01eadd4f: add    ecx,0x2
  ;; L_copy_4_bytes:
  0x01eadd52: test   ecx,0x1
  0x01eadd58: je     Stub::oop_arraycopy_uninit+114 0x01EADD62
  0x01eadd5a: mov    edx,DWORD PTR [esi+ecx*4-0x4]
  0x01eadd5e: mov    DWORD PTR [edi+ecx*4-0x4],edx
  ;; L_copy_2_bytes:
  0x01eadd62: mov    ecx,DWORD PTR [esp+0x18]
  0x01eadd66: lea    ecx,[edi+ecx*4-0x4]
  0x01eadd6a: shr    edi,0x9
  0x01eadd6d: shr    ecx,0x9
  0x01eadd70: sub    ecx,edi
  ;; L_loop:
  0x01eadd72: mov    BYTE PTR [edi+ecx*1+0x1707000],0x0
  0x01eadd7a: dec    ecx
  0x01eadd7b: jge    Stub::oop_arraycopy_uninit+130 0x01EADD72
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadd7d: inc    DWORD PTR ds:0x55634958
  0x01eadd83: pop    edi
  0x01eadd84: pop    esi
  0x01eadd85: mov    esp,ebp
  0x01eadd87: pop    ebp
  0x01eadd88: xor    eax,eax
  0x01eadd8a: ret    

StubRoutines::jlong_disjoint_arraycopy [0x01eadd90, 0x01eade02[ (114 bytes)
  0x01eadd90: push   ebp
  0x01eadd91: mov    ebp,esp
  0x01eadd93: mov    eax,DWORD PTR [esp+0x8]
  0x01eadd97: mov    edx,DWORD PTR [esp+0xc]
  0x01eadd9b: mov    ecx,DWORD PTR [esp+0x10]
  ;; Entry:
  0x01eadd9f: sub    edx,eax
  0x01eadda1: jmp    Stub::jlong_disjoint_arraycopy+77 0x01EADDDD
  0x01eadda3: nop    
  0x01eadda4: nop    
  0x01eadda5: nop    
  0x01eadda6: nop    
  0x01eadda7: nop    
  0x01eadda8: nop    
  0x01eadda9: nop    
  0x01eaddaa: nop    
  0x01eaddab: nop    
  0x01eaddac: nop    
  0x01eaddad: nop    
  0x01eaddae: nop    
  0x01eaddaf: nop    
  ;; L_copy_64_bytes_loop:
  0x01eaddb0: movdqu xmm0,XMMWORD PTR [eax]
  0x01eaddb4: movdqu XMMWORD PTR [eax+edx*1],xmm0
  0x01eaddb9: movdqu xmm1,XMMWORD PTR [eax+0x10]
  0x01eaddbe: movdqu XMMWORD PTR [eax+edx*1+0x10],xmm1
  0x01eaddc4: movdqu xmm2,XMMWORD PTR [eax+0x20]
  0x01eaddc9: movdqu XMMWORD PTR [eax+edx*1+0x20],xmm2
  0x01eaddcf: movdqu xmm3,XMMWORD PTR [eax+0x30]
  0x01eaddd4: movdqu XMMWORD PTR [eax+edx*1+0x30],xmm3
  0x01eaddda: add    eax,0x40
  ;; L_copy_64_bytes:
  0x01eadddd: sub    ecx,0x8
  0x01eadde0: jge    Stub::jlong_disjoint_arraycopy+32 0x01EADDB0
  0x01eadde2: add    ecx,0x8
  0x01eadde5: je     Stub::jlong_disjoint_arraycopy+102 0x01EADDF6
  ;; L_copy_8_bytes:
  0x01eadde7: movq   xmm0,QWORD PTR [eax]
  0x01eaddeb: movq   QWORD PTR [eax+edx*1],xmm0
  0x01eaddf0: add    eax,0x8
  0x01eaddf3: dec    ecx
  0x01eaddf4: jg     Stub::jlong_disjoint_arraycopy+87 0x01EADDE7
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jlong_array_copy_ctr
  0x01eaddf6: inc    DWORD PTR ds:0x55634954
  0x01eaddfc: mov    esp,ebp
  0x01eaddfe: pop    ebp
  0x01eaddff: xor    eax,eax
  0x01eade01: ret    

StubRoutines::jlong_arraycopy [0x01eade10, 0x01eade59[ (73 bytes)
  0x01eade10: push   ebp
  0x01eade11: mov    ebp,esp
  0x01eade13: mov    eax,DWORD PTR [esp+0x8]
  0x01eade17: mov    edx,DWORD PTR [esp+0xc]
  0x01eade1b: mov    ecx,DWORD PTR [esp+0x10]
  ;; Entry:
  0x01eade1f: cmp    edx,eax
  0x01eade21: jbe    Stub::jlong_disjoint_arraycopy+15 0x01EADD9F
  0x01eade27: lea    eax,[eax+ecx*8]
  0x01eade2a: cmp    edx,eax
  0x01eade2c: mov    eax,DWORD PTR [esp+0x8]
  0x01eade30: jae    Stub::jlong_disjoint_arraycopy+15 0x01EADD9F
  0x01eade36: jmp    Stub::jlong_arraycopy+58 0x01EADE4A
  0x01eade38: nop    
  0x01eade39: nop    
  0x01eade3a: nop    
  0x01eade3b: nop    
  0x01eade3c: nop    
  0x01eade3d: nop    
  0x01eade3e: nop    
  0x01eade3f: nop    
  ;; L_copy_8_bytes_loop:
  0x01eade40: movq   xmm0,QWORD PTR [eax+ecx*8]
  0x01eade45: movq   QWORD PTR [edx+ecx*8],xmm0
  ;; L_copy_8_bytes:
  0x01eade4a: dec    ecx
  0x01eade4b: jge    Stub::jlong_arraycopy+48 0x01EADE40
  ;; inc_counter SharedRuntime::_jlong_array_copy_ctr
  0x01eade4d: inc    DWORD PTR ds:0x55634954
  0x01eade53: mov    esp,ebp
  0x01eade55: pop    ebp
  0x01eade56: xor    eax,eax
  0x01eade58: ret    

StubRoutines::jbyte_fill [0x01eade60, 0x01eadeef[ (143 bytes)
  ;; Entry:
  0x01eade60: push   ebp
  0x01eade61: mov    ebp,esp
  0x01eade63: push   esi
  0x01eade64: push   edi
  0x01eade65: mov    edi,DWORD PTR [esp+0x10]
  0x01eade69: mov    edx,DWORD PTR [esp+0x14]
  0x01eade6d: mov    esi,DWORD PTR [esp+0x18]
  0x01eade71: and    edx,0xff
  0x01eade77: mov    eax,edx
  0x01eade79: shl    eax,0x8
  0x01eade7c: or     edx,eax
  0x01eade7e: mov    eax,edx
  0x01eade80: shl    eax,0x10
  0x01eade83: or     edx,eax
  0x01eade85: cmp    esi,0x8
  0x01eade88: jb     Stub::jbyte_fill+100 0x01EADEC4
  ;; L_fill_32_bytes:
  0x01eade8e: movd   xmm0,edx
  0x01eade92: pshufd xmm0,xmm0,0x0
  0x01eade97: sub    esi,0x20
  0x01eade9a: jl     Stub::jbyte_fill+81 0x01EADEB1
  ;; L_fill_32_bytes_loop:
  0x01eadea0: movdqu XMMWORD PTR [edi],xmm0
  0x01eadea4: movdqu XMMWORD PTR [edi+0x10],xmm0
  0x01eadea9: add    edi,0x20
  0x01eadeac: sub    esi,0x20
  0x01eadeaf: jge    Stub::jbyte_fill+64 0x01EADEA0
  ;; L_check_fill_8_bytes:
  0x01eadeb1: add    esi,0x20
  0x01eadeb4: je     Stub::jbyte_fill+137 0x01EADEE9
  0x01eadeb6: jmp    Stub::jbyte_fill+95 0x01EADEBF
  ;; L_fill_8_bytes_loop:
  0x01eadeb8: movq   QWORD PTR [edi],xmm0
  0x01eadebc: add    edi,0x8
  ;; L_fill_8_bytes:
  0x01eadebf: sub    esi,0x8
  0x01eadec2: jge    Stub::jbyte_fill+88 0x01EADEB8
  ;; L_fill_4_bytes:
  0x01eadec4: test   esi,0x4
  0x01eadeca: je     Stub::jbyte_fill+113 0x01EADED1
  0x01eadecc: mov    DWORD PTR [edi],edx
  0x01eadece: add    edi,0x4
  ;; L_fill_2_bytes:
  0x01eaded1: test   esi,0x2
  0x01eaded7: je     Stub::jbyte_fill+127 0x01EADEDF
  0x01eaded9: mov    WORD PTR [edi],dx
  0x01eadedc: add    edi,0x2
  ;; L_fill_byte:
  0x01eadedf: test   esi,0x1
  0x01eadee5: je     Stub::jbyte_fill+137 0x01EADEE9
  0x01eadee7: mov    BYTE PTR [edi],dl
  ;; L_exit:
  0x01eadee9: pop    edi
  0x01eadeea: pop    esi
  0x01eadeeb: mov    esp,ebp
  0x01eadeed: pop    ebp
  0x01eadeee: ret    

StubRoutines::jshort_fill [0x01eadef0, 0x01eadf72[ (130 bytes)
  ;; Entry:
  0x01eadef0: push   ebp
  0x01eadef1: mov    ebp,esp
  0x01eadef3: push   esi
  0x01eadef4: push   edi
  0x01eadef5: mov    edi,DWORD PTR [esp+0x10]
  0x01eadef9: mov    edx,DWORD PTR [esp+0x14]
  0x01eadefd: mov    esi,DWORD PTR [esp+0x18]
  0x01eadf01: and    edx,0xffff
  0x01eadf07: mov    eax,edx
  0x01eadf09: shl    eax,0x10
  0x01eadf0c: or     edx,eax
  0x01eadf0e: cmp    esi,0x4
  0x01eadf11: jb     Stub::jshort_fill+100 0x01EADF54
  ;; L_fill_32_bytes:
  0x01eadf17: movd   xmm0,edx
  0x01eadf1b: pshufd xmm0,xmm0,0x0
  0x01eadf20: sub    esi,0x10
  0x01eadf23: jl     Stub::jshort_fill+81 0x01EADF41
  0x01eadf29: nop    
  0x01eadf2a: nop    
  0x01eadf2b: nop    
  0x01eadf2c: nop    
  0x01eadf2d: nop    
  0x01eadf2e: nop    
  0x01eadf2f: nop    
  ;; L_fill_32_bytes_loop:
  0x01eadf30: movdqu XMMWORD PTR [edi],xmm0
  0x01eadf34: movdqu XMMWORD PTR [edi+0x10],xmm0
  0x01eadf39: add    edi,0x20
  0x01eadf3c: sub    esi,0x10
  0x01eadf3f: jge    Stub::jshort_fill+64 0x01EADF30
  ;; L_check_fill_8_bytes:
  0x01eadf41: add    esi,0x10
  0x01eadf44: je     Stub::jshort_fill+124 0x01EADF6C
  0x01eadf46: jmp    Stub::jshort_fill+95 0x01EADF4F
  ;; L_fill_8_bytes_loop:
  0x01eadf48: movq   QWORD PTR [edi],xmm0
  0x01eadf4c: add    edi,0x8
  ;; L_fill_8_bytes:
  0x01eadf4f: sub    esi,0x4
  0x01eadf52: jge    Stub::jshort_fill+88 0x01EADF48
  ;; L_fill_4_bytes:
  0x01eadf54: test   esi,0x2
  0x01eadf5a: je     Stub::jshort_fill+113 0x01EADF61
  0x01eadf5c: mov    DWORD PTR [edi],edx
  0x01eadf5e: add    edi,0x4
  ;; L_fill_2_bytes:
  0x01eadf61: test   esi,0x1
  0x01eadf67: je     Stub::jshort_fill+124 0x01EADF6C
  0x01eadf69: mov    WORD PTR [edi],dx
  ;; L_fill_byte:
  ;; L_exit:
  0x01eadf6c: pop    edi
  0x01eadf6d: pop    esi
  0x01eadf6e: mov    esp,ebp
  0x01eadf70: pop    ebp
  0x01eadf71: ret    

StubRoutines::jint_fill [0x01eadf80, 0x01eadfe4[ (100 bytes)
  ;; Entry:
  0x01eadf80: push   ebp
  0x01eadf81: mov    ebp,esp
  0x01eadf83: push   esi
  0x01eadf84: push   edi
  0x01eadf85: mov    edi,DWORD PTR [esp+0x10]
  0x01eadf89: mov    edx,DWORD PTR [esp+0x14]
  0x01eadf8d: mov    esi,DWORD PTR [esp+0x18]
  0x01eadf91: cmp    esi,0x2
  0x01eadf94: jb     Stub::jint_fill+84 0x01EADFD4
  ;; L_fill_32_bytes:
  0x01eadf9a: movd   xmm0,edx
  0x01eadf9e: pshufd xmm0,xmm0,0x0
  0x01eadfa3: sub    esi,0x8
  0x01eadfa6: jl     Stub::jint_fill+65 0x01EADFC1
  0x01eadfac: nop    
  0x01eadfad: nop    
  0x01eadfae: nop    
  0x01eadfaf: nop    
  ;; L_fill_32_bytes_loop:
  0x01eadfb0: movdqu XMMWORD PTR [edi],xmm0
  0x01eadfb4: movdqu XMMWORD PTR [edi+0x10],xmm0
  0x01eadfb9: add    edi,0x20
  0x01eadfbc: sub    esi,0x8
  0x01eadfbf: jge    Stub::jint_fill+48 0x01EADFB0
  ;; L_check_fill_8_bytes:
  0x01eadfc1: add    esi,0x8
  0x01eadfc4: je     Stub::jint_fill+94 0x01EADFDE
  0x01eadfc6: jmp    Stub::jint_fill+79 0x01EADFCF
  ;; L_fill_8_bytes_loop:
  0x01eadfc8: movq   QWORD PTR [edi],xmm0
  0x01eadfcc: add    edi,0x8
  ;; L_fill_8_bytes:
  0x01eadfcf: sub    esi,0x2
  0x01eadfd2: jge    Stub::jint_fill+72 0x01EADFC8
  ;; L_fill_4_bytes:
  0x01eadfd4: test   esi,0x1
  0x01eadfda: je     Stub::jint_fill+94 0x01EADFDE
  0x01eadfdc: mov    DWORD PTR [edi],edx
  ;; L_fill_2_bytes:
  ;; L_exit:
  0x01eadfde: pop    edi
  0x01eadfdf: pop    esi
  0x01eadfe0: mov    esp,ebp
  0x01eadfe2: pop    ebp
  0x01eadfe3: ret    

StubRoutines::arrayof_jbyte_fill [0x01eadff0, 0x01eae07f[ (143 bytes)
  ;; Entry:
  0x01eadff0: push   ebp
  0x01eadff1: mov    ebp,esp
  0x01eadff3: push   esi
  0x01eadff4: push   edi
  0x01eadff5: mov    edi,DWORD PTR [esp+0x10]
  0x01eadff9: mov    edx,DWORD PTR [esp+0x14]
  0x01eadffd: mov    esi,DWORD PTR [esp+0x18]
  0x01eae001: and    edx,0xff
  0x01eae007: mov    eax,edx
  0x01eae009: shl    eax,0x8
  0x01eae00c: or     edx,eax
  0x01eae00e: mov    eax,edx
  0x01eae010: shl    eax,0x10
  0x01eae013: or     edx,eax
  0x01eae015: cmp    esi,0x8
  0x01eae018: jb     Stub::arrayof_jbyte_fill+100 0x01EAE054
  ;; L_fill_32_bytes:
  0x01eae01e: movd   xmm0,edx
  0x01eae022: pshufd xmm0,xmm0,0x0
  0x01eae027: sub    esi,0x20
  0x01eae02a: jl     Stub::arrayof_jbyte_fill+81 0x01EAE041
  ;; L_fill_32_bytes_loop:
  0x01eae030: movdqu XMMWORD PTR [edi],xmm0
  0x01eae034: movdqu XMMWORD PTR [edi+0x10],xmm0
  0x01eae039: add    edi,0x20
  0x01eae03c: sub    esi,0x20
  0x01eae03f: jge    Stub::arrayof_jbyte_fill+64 0x01EAE030
  ;; L_check_fill_8_bytes:
  0x01eae041: add    esi,0x20
  0x01eae044: je     Stub::arrayof_jbyte_fill+137 0x01EAE079
  0x01eae046: jmp    Stub::arrayof_jbyte_fill+95 0x01EAE04F
  ;; L_fill_8_bytes_loop:
  0x01eae048: movq   QWORD PTR [edi],xmm0
  0x01eae04c: add    edi,0x8
  ;; L_fill_8_bytes:
  0x01eae04f: sub    esi,0x8
  0x01eae052: jge    Stub::arrayof_jbyte_fill+88 0x01EAE048
  ;; L_fill_4_bytes:
  0x01eae054: test   esi,0x4
  0x01eae05a: je     Stub::arrayof_jbyte_fill+113 0x01EAE061
  0x01eae05c: mov    DWORD PTR [edi],edx
  0x01eae05e: add    edi,0x4
  ;; L_fill_2_bytes:
  0x01eae061: test   esi,0x2
  0x01eae067: je     Stub::arrayof_jbyte_fill+127 0x01EAE06F
  0x01eae069: mov    WORD PTR [edi],dx
  0x01eae06c: add    edi,0x2
  ;; L_fill_byte:
  0x01eae06f: test   esi,0x1
  0x01eae075: je     Stub::arrayof_jbyte_fill+137 0x01EAE079
  0x01eae077: mov    BYTE PTR [edi],dl
  ;; L_exit:
  0x01eae079: pop    edi
  0x01eae07a: pop    esi
  0x01eae07b: mov    esp,ebp
  0x01eae07d: pop    ebp
  0x01eae07e: ret    

StubRoutines::arrayof_jshort_fill [0x01eae080, 0x01eae102[ (130 bytes)
  ;; Entry:
  0x01eae080: push   ebp
  0x01eae081: mov    ebp,esp
  0x01eae083: push   esi
  0x01eae084: push   edi
  0x01eae085: mov    edi,DWORD PTR [esp+0x10]
  0x01eae089: mov    edx,DWORD PTR [esp+0x14]
  0x01eae08d: mov    esi,DWORD PTR [esp+0x18]
  0x01eae091: and    edx,0xffff
  0x01eae097: mov    eax,edx
  0x01eae099: shl    eax,0x10
  0x01eae09c: or     edx,eax
  0x01eae09e: cmp    esi,0x4
  0x01eae0a1: jb     Stub::arrayof_jshort_fill+100 0x01EAE0E4
  ;; L_fill_32_bytes:
  0x01eae0a7: movd   xmm0,edx
  0x01eae0ab: pshufd xmm0,xmm0,0x0
  0x01eae0b0: sub    esi,0x10
  0x01eae0b3: jl     Stub::arrayof_jshort_fill+81 0x01EAE0D1
  0x01eae0b9: nop    
  0x01eae0ba: nop    
  0x01eae0bb: nop    
  0x01eae0bc: nop    
  0x01eae0bd: nop    
  0x01eae0be: nop    
  0x01eae0bf: nop    
  ;; L_fill_32_bytes_loop:
  0x01eae0c0: movdqu XMMWORD PTR [edi],xmm0
  0x01eae0c4: movdqu XMMWORD PTR [edi+0x10],xmm0
  0x01eae0c9: add    edi,0x20
  0x01eae0cc: sub    esi,0x10
  0x01eae0cf: jge    Stub::arrayof_jshort_fill+64 0x01EAE0C0
  ;; L_check_fill_8_bytes:
  0x01eae0d1: add    esi,0x10
  0x01eae0d4: je     Stub::arrayof_jshort_fill+124 0x01EAE0FC
  0x01eae0d6: jmp    Stub::arrayof_jshort_fill+95 0x01EAE0DF
  ;; L_fill_8_bytes_loop:
  0x01eae0d8: movq   QWORD PTR [edi],xmm0
  0x01eae0dc: add    edi,0x8
  ;; L_fill_8_bytes:
  0x01eae0df: sub    esi,0x4
  0x01eae0e2: jge    Stub::arrayof_jshort_fill+88 0x01EAE0D8
  ;; L_fill_4_bytes:
  0x01eae0e4: test   esi,0x2
  0x01eae0ea: je     Stub::arrayof_jshort_fill+113 0x01EAE0F1
  0x01eae0ec: mov    DWORD PTR [edi],edx
  0x01eae0ee: add    edi,0x4
  ;; L_fill_2_bytes:
  0x01eae0f1: test   esi,0x1
  0x01eae0f7: je     Stub::arrayof_jshort_fill+124 0x01EAE0FC
  0x01eae0f9: mov    WORD PTR [edi],dx
  ;; L_fill_byte:
  ;; L_exit:
  0x01eae0fc: pop    edi
  0x01eae0fd: pop    esi
  0x01eae0fe: mov    esp,ebp
  0x01eae100: pop    ebp
  0x01eae101: ret    

StubRoutines::arrayof_jint_fill [0x01eae110, 0x01eae174[ (100 bytes)
  ;; Entry:
  0x01eae110: push   ebp
  0x01eae111: mov    ebp,esp
  0x01eae113: push   esi
  0x01eae114: push   edi
  0x01eae115: mov    edi,DWORD PTR [esp+0x10]
  0x01eae119: mov    edx,DWORD PTR [esp+0x14]
  0x01eae11d: mov    esi,DWORD PTR [esp+0x18]
  0x01eae121: cmp    esi,0x2
  0x01eae124: jb     Stub::arrayof_jint_fill+84 0x01EAE164
  ;; L_fill_32_bytes:
  0x01eae12a: movd   xmm0,edx
  0x01eae12e: pshufd xmm0,xmm0,0x0
  0x01eae133: sub    esi,0x8
  0x01eae136: jl     Stub::arrayof_jint_fill+65 0x01EAE151
  0x01eae13c: nop    
  0x01eae13d: nop    
  0x01eae13e: nop    
  0x01eae13f: nop    
  ;; L_fill_32_bytes_loop:
  0x01eae140: movdqu XMMWORD PTR [edi],xmm0
  0x01eae144: movdqu XMMWORD PTR [edi+0x10],xmm0
  0x01eae149: add    edi,0x20
  0x01eae14c: sub    esi,0x8
  0x01eae14f: jge    Stub::arrayof_jint_fill+48 0x01EAE140
  ;; L_check_fill_8_bytes:
  0x01eae151: add    esi,0x8
  0x01eae154: je     Stub::arrayof_jint_fill+94 0x01EAE16E
  0x01eae156: jmp    Stub::arrayof_jint_fill+79 0x01EAE15F
  ;; L_fill_8_bytes_loop:
  0x01eae158: movq   QWORD PTR [edi],xmm0
  0x01eae15c: add    edi,0x8
  ;; L_fill_8_bytes:
  0x01eae15f: sub    esi,0x2
  0x01eae162: jge    Stub::arrayof_jint_fill+72 0x01EAE158
  ;; L_fill_4_bytes:
  0x01eae164: test   esi,0x1
  0x01eae16a: je     Stub::arrayof_jint_fill+94 0x01EAE16E
  0x01eae16c: mov    DWORD PTR [edi],edx
  ;; L_fill_2_bytes:
  ;; L_exit:
  0x01eae16e: pop    edi
  0x01eae16f: pop    esi
  0x01eae170: mov    esp,ebp
  0x01eae172: pop    ebp
  0x01eae173: ret    

StubRoutines::checkcast_arraycopy [0x01eae180, 0x01eae243[ (195 bytes)
  0x01eae180: push   ebp
  0x01eae181: mov    ebp,esp
  0x01eae183: push   esi
  0x01eae184: push   edi
  0x01eae185: push   ebx
  0x01eae186: mov    eax,DWORD PTR [esp+0x14]
  0x01eae18a: mov    edx,DWORD PTR [esp+0x18]
  0x01eae18e: mov    ecx,DWORD PTR [esp+0x1c]
  ;; Entry:
  0x01eae192: lea    eax,[eax+ecx*4]
  0x01eae195: lea    edx,[edx+ecx*4]
  0x01eae198: neg    ecx
  0x01eae19a: jne    Stub::checkcast_arraycopy+54 0x01EAE1B6
  0x01eae19c: xor    eax,eax
  0x01eae19e: jmp    Stub::checkcast_arraycopy+182 0x01EAE236
  0x01eae1a3: nop    
  0x01eae1a4: nop    
  0x01eae1a5: nop    
  0x01eae1a6: nop    
  0x01eae1a7: nop    
  0x01eae1a8: nop    
  0x01eae1a9: nop    
  0x01eae1aa: nop    
  0x01eae1ab: nop    
  0x01eae1ac: nop    
  0x01eae1ad: nop    
  0x01eae1ae: nop    
  0x01eae1af: nop    
  ;; L_store_element:
  0x01eae1b0: mov    DWORD PTR [edx+ecx*4],edi
  0x01eae1b3: inc    ecx
  0x01eae1b4: je     Stub::checkcast_arraycopy+149 0x01EAE215
  ;; L_load_element:
  0x01eae1b6: mov    edi,DWORD PTR [eax+ecx*4]
  0x01eae1b9: test   edi,edi
  0x01eae1bb: je     Stub::checkcast_arraycopy+48 0x01EAE1B0
  0x01eae1bd: mov    esi,DWORD PTR [edi+0x4]
  ;; type_check:
  0x01eae1c0: cmp    esi,DWORD PTR [esp+0x24]
  0x01eae1c4: je     Stub::checkcast_arraycopy+48 0x01EAE1B0
  0x01eae1c6: mov    ebx,DWORD PTR [esp+0x20]
  0x01eae1ca: mov    ebx,DWORD PTR [esi+ebx*1]
  0x01eae1cd: cmp    ebx,DWORD PTR [esp+0x24]
  0x01eae1d1: je     Stub::checkcast_arraycopy+48 0x01EAE1B0
  0x01eae1d3: cmp    DWORD PTR [esp+0x20],0x14
  0x01eae1db: jne    Stub::checkcast_arraycopy+134 0x01EAE206
  0x01eae1e1: mov    ebx,DWORD PTR [esp+0x24]
  0x01eae1e5: push   eax
  0x01eae1e6: mov    eax,ebx
  0x01eae1e8: push   ecx
  0x01eae1e9: push   edi
  0x01eae1ea: inc    DWORD PTR ds:0x556349a0
  0x01eae1f0: mov    edi,DWORD PTR [esi+0x18]
  0x01eae1f3: mov    ecx,DWORD PTR [edi]
  0x01eae1f5: add    edi,0x4
  0x01eae1f8: test   eax,eax
  0x01eae1fa: repnz scas eax,DWORD PTR es:[edi]
  0x01eae1fc: pop    edi
  0x01eae1fd: pop    ecx
  0x01eae1fe: pop    eax
  0x01eae1ff: jne    Stub::checkcast_arraycopy+134 0x01EAE206
  0x01eae201: mov    DWORD PTR [esi+0x14],ebx
  0x01eae204: jmp    Stub::checkcast_arraycopy+48 0x01EAE1B0
  ;; L_failure:
  0x01eae206: add    ecx,DWORD PTR [esp+0x1c]
  0x01eae20a: mov    eax,ecx
  0x01eae20c: not    eax
  0x01eae20e: jne    Stub::checkcast_arraycopy+155 0x01EAE21B
  0x01eae210: jmp    Stub::checkcast_arraycopy+182 0x01EAE236
  ;; L_do_card_marks:
  0x01eae215: xor    eax,eax
  0x01eae217: mov    ecx,DWORD PTR [esp+0x1c]
  ;; L_post_barrier:
  0x01eae21b: mov    edx,DWORD PTR [esp+0x18]
  0x01eae21f: lea    ecx,[edx+ecx*4-0x4]
  0x01eae223: shr    edx,0x9
  0x01eae226: shr    ecx,0x9
  0x01eae229: sub    ecx,edx
  ;; L_loop:
  0x01eae22b: mov    BYTE PTR [edx+ecx*1+0x1707000],0x0
  0x01eae233: dec    ecx
  0x01eae234: jge    Stub::checkcast_arraycopy+171 0x01EAE22B
  ;; L_done:
  0x01eae236: pop    ebx
  0x01eae237: pop    edi
  0x01eae238: pop    esi
  ;; inc_counter SharedRuntime::_checkcast_array_copy_ctr
  0x01eae239: inc    DWORD PTR ds:0x5563495c
  0x01eae23f: mov    esp,ebp
  0x01eae241: pop    ebp
  0x01eae242: ret    

StubRoutines::checkcast_arraycopy_uninit [0x01eae250, 0x01eae313[ (195 bytes)
  0x01eae250: push   ebp
  0x01eae251: mov    ebp,esp
  0x01eae253: push   esi
  0x01eae254: push   edi
  0x01eae255: push   ebx
  0x01eae256: mov    eax,DWORD PTR [esp+0x14]
  0x01eae25a: mov    edx,DWORD PTR [esp+0x18]
  0x01eae25e: mov    ecx,DWORD PTR [esp+0x1c]
  0x01eae262: lea    eax,[eax+ecx*4]
  0x01eae265: lea    edx,[edx+ecx*4]
  0x01eae268: neg    ecx
  0x01eae26a: jne    Stub::checkcast_arraycopy_uninit+54 0x01EAE286
  0x01eae26c: xor    eax,eax
  0x01eae26e: jmp    Stub::checkcast_arraycopy_uninit+182 0x01EAE306
  0x01eae273: nop    
  0x01eae274: nop    
  0x01eae275: nop    
  0x01eae276: nop    
  0x01eae277: nop    
  0x01eae278: nop    
  0x01eae279: nop    
  0x01eae27a: nop    
  0x01eae27b: nop    
  0x01eae27c: nop    
  0x01eae27d: nop    
  0x01eae27e: nop    
  0x01eae27f: nop    
  ;; L_store_element:
  0x01eae280: mov    DWORD PTR [edx+ecx*4],edi
  0x01eae283: inc    ecx
  0x01eae284: je     Stub::checkcast_arraycopy_uninit+149 0x01EAE2E5
  ;; L_load_element:
  0x01eae286: mov    edi,DWORD PTR [eax+ecx*4]
  0x01eae289: test   edi,edi
  0x01eae28b: je     Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  0x01eae28d: mov    esi,DWORD PTR [edi+0x4]
  ;; type_check:
  0x01eae290: cmp    esi,DWORD PTR [esp+0x24]
  0x01eae294: je     Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  0x01eae296: mov    ebx,DWORD PTR [esp+0x20]
  0x01eae29a: mov    ebx,DWORD PTR [esi+ebx*1]
  0x01eae29d: cmp    ebx,DWORD PTR [esp+0x24]
  0x01eae2a1: je     Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  0x01eae2a3: cmp    DWORD PTR [esp+0x20],0x14
  0x01eae2ab: jne    Stub::checkcast_arraycopy_uninit+134 0x01EAE2D6
  0x01eae2b1: mov    ebx,DWORD PTR [esp+0x24]
  0x01eae2b5: push   eax
  0x01eae2b6: mov    eax,ebx
  0x01eae2b8: push   ecx
  0x01eae2b9: push   edi
  0x01eae2ba: inc    DWORD PTR ds:0x556349a0
  0x01eae2c0: mov    edi,DWORD PTR [esi+0x18]
  0x01eae2c3: mov    ecx,DWORD PTR [edi]
  0x01eae2c5: add    edi,0x4
  0x01eae2c8: test   eax,eax
  0x01eae2ca: repnz scas eax,DWORD PTR es:[edi]
  0x01eae2cc: pop    edi
  0x01eae2cd: pop    ecx
  0x01eae2ce: pop    eax
  0x01eae2cf: jne    Stub::checkcast_arraycopy_uninit+134 0x01EAE2D6
  0x01eae2d1: mov    DWORD PTR [esi+0x14],ebx
  0x01eae2d4: jmp    Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  ;; L_failure:
  0x01eae2d6: add    ecx,DWORD PTR [esp+0x1c]
  0x01eae2da: mov    eax,ecx
  0x01eae2dc: not    eax
  0x01eae2de: jne    Stub::checkcast_arraycopy_uninit+155 0x01EAE2EB
  0x01eae2e0: jmp    Stub::checkcast_arraycopy_uninit+182 0x01EAE306
  ;; L_do_card_marks:
  0x01eae2e5: xor    eax,eax
  0x01eae2e7: mov    ecx,DWORD PTR [esp+0x1c]
  ;; L_post_barrier:
  0x01eae2eb: mov    edx,DWORD PTR [esp+0x18]
  0x01eae2ef: lea    ecx,[edx+ecx*4-0x4]
  0x01eae2f3: shr    edx,0x9
  0x01eae2f6: shr    ecx,0x9
  0x01eae2f9: sub    ecx,edx
  ;; L_loop:
  0x01eae2fb: mov    BYTE PTR [edx+ecx*1+0x1707000],0x0
  0x01eae303: dec    ecx
  0x01eae304: jge    Stub::checkcast_arraycopy_uninit+171 0x01EAE2FB
  ;; L_done:
  0x01eae306: pop    ebx
  0x01eae307: pop    edi
  0x01eae308: pop    esi
  ;; inc_counter SharedRuntime::_checkcast_array_copy_ctr
  0x01eae309: inc    DWORD PTR ds:0x5563495c
  0x01eae30f: mov    esp,ebp
  0x01eae311: pop    ebp
  0x01eae312: ret    

StubRoutines::unsafe_arraycopy [0x01eae320, 0x01eae37f[ (95 bytes)
  0x01eae320: push   ebp
  0x01eae321: mov    ebp,esp
  0x01eae323: push   esi
  0x01eae324: push   edi
  0x01eae325: mov    eax,DWORD PTR [esp+0x10]
  0x01eae329: mov    edx,DWORD PTR [esp+0x14]
  0x01eae32d: mov    ecx,DWORD PTR [esp+0x18]
  ;; inc_counter SharedRuntime::_unsafe_array_copy_ctr
  0x01eae331: inc    DWORD PTR ds:0x55634960
  0x01eae337: mov    esi,eax
  0x01eae339: or     esi,edx
  0x01eae33b: or     esi,ecx
  0x01eae33d: test   esi,0x7
  0x01eae343: je     Stub::unsafe_arraycopy+81 0x01EAE371
  0x01eae345: test   esi,0x3
  0x01eae34b: je     Stub::unsafe_arraycopy+69 0x01EAE365
  0x01eae34d: test   esi,0x1
  0x01eae353: jne    Stub::jbyte_arraycopy+17 0x01EAD631
  ;; L_short_aligned:
  0x01eae359: shr    ecx,0x1
  0x01eae35c: mov    DWORD PTR [esp+0x18],ecx
  0x01eae360: jmp    Stub::jshort_arraycopy+17 0x01EAD921
  ;; L_int_aligned:
  0x01eae365: shr    ecx,0x2
  0x01eae368: mov    DWORD PTR [esp+0x18],ecx
  0x01eae36c: jmp    Stub::jint_arraycopy+17 0x01EADA81
  ;; L_long_aligned:
  0x01eae371: shr    ecx,0x3
  0x01eae374: mov    DWORD PTR [esp+0x18],ecx
  0x01eae378: pop    edi
  0x01eae379: pop    esi
  0x01eae37a: jmp    Stub::jlong_arraycopy+15 0x01EADE1F

StubRoutines::generic_arraycopy [0x01eae38b, 0x01eae57d[ (498 bytes)
  ;; L_failed_0:
  0x01eae38b: jmp    Stub::generic_arraycopy+253 0x01EAE488
  0x01eae390: push   ebp
  0x01eae391: mov    ebp,esp
  0x01eae393: push   esi
  0x01eae394: push   edi
  ;; inc_counter SharedRuntime::_generic_array_copy_ctr
  0x01eae395: inc    DWORD PTR ds:0x55634964
  0x01eae39b: mov    eax,DWORD PTR [esp+0x10]
  0x01eae39f: test   eax,eax
  0x01eae3a1: je     Stub::generic_arraycopy
  0x01eae3a3: mov    esi,DWORD PTR [esp+0x14]
  0x01eae3a7: test   esi,esi
  0x01eae3a9: js     Stub::generic_arraycopy
  0x01eae3ab: mov    edx,DWORD PTR [esp+0x18]
  0x01eae3af: test   edx,edx
  0x01eae3b1: je     Stub::generic_arraycopy
  0x01eae3b3: mov    edi,DWORD PTR [esp+0x1c]
  0x01eae3b7: test   edi,edi
  0x01eae3b9: js     Stub::generic_arraycopy
  0x01eae3bb: mov    ecx,DWORD PTR [esp+0x20]
  0x01eae3bf: test   ecx,ecx
  0x01eae3c1: js     Stub::generic_arraycopy
  0x01eae3c3: mov    ecx,DWORD PTR [eax+0x4]
  ;; assert klasses not null
  0x01eae3c6: test   ecx,ecx
  0x01eae3c8: jne    Stub::generic_arraycopy+80 0x01EAE3DB
  0x01eae3ca: push   0x55318468
  0x01eae3cf: call   Stub::generic_arraycopy+73 0x01EAE3D4
  0x01eae3d4: pusha  
  0x01eae3d5: call   0x54dedbf0
  0x01eae3da: hlt    
  0x01eae3db: cmp    DWORD PTR [edx+0x4],0x0
  0x01eae3e2: je     Stub::generic_arraycopy+63 0x01EAE3CA
  ;; assert done
  0x01eae3e4: cmp    DWORD PTR [ecx+0x8],0x800c0c02
  0x01eae3eb: je     Stub::generic_arraycopy+263 0x01EAE492
  0x01eae3f1: cmp    ecx,DWORD PTR [edx+0x4]
  0x01eae3f4: jne    Stub::generic_arraycopy
  0x01eae3f6: mov    ecx,DWORD PTR [ecx+0x8]
  0x01eae3f9: cmp    ecx,0x0
  0x01eae3fc: jge    Stub::generic_arraycopy
  0x01eae3fe: cmp    ecx,0xc0000000
  0x01eae404: jge    Stub::generic_arraycopy+144 0x01EAE41B
  0x01eae40a: push   0x553184bc
  0x01eae40f: call   Stub::generic_arraycopy+137 0x01EAE414
  0x01eae414: pusha  
  0x01eae415: call   0x54dedbf0
  0x01eae41a: hlt    
  ;; arraycopy_range_checks:
  0x01eae41b: add    esi,DWORD PTR [esp+0x20]
  0x01eae41f: add    edi,DWORD PTR [esp+0x20]
  0x01eae423: cmp    esi,DWORD PTR [eax+0x8]
  0x01eae426: ja     Stub::generic_arraycopy+253 0x01EAE488
  0x01eae42c: cmp    edi,DWORD PTR [edx+0x8]
  0x01eae42f: ja     Stub::generic_arraycopy+253 0x01EAE488
  ;; arraycopy_range_checks done
  0x01eae435: mov    esi,ecx
  0x01eae437: shr    esi,0x10
  0x01eae43a: and    esi,0xff
  0x01eae440: add    eax,esi
  0x01eae442: add    edx,esi
  0x01eae444: and    ecx,0x3f
  ;; scale indexes to element size
  0x01eae447: mov    esi,DWORD PTR [esp+0x14]
  0x01eae44b: shl    esi,cl
  0x01eae44d: add    eax,esi
  0x01eae44f: mov    edi,DWORD PTR [esp+0x1c]
  0x01eae453: shl    edi,cl
  0x01eae455: add    edx,edi
  0x01eae457: mov    DWORD PTR [esp+0x10],eax
  0x01eae45b: mov    edi,ecx
  0x01eae45d: mov    ecx,DWORD PTR [esp+0x20]
  ;; choose copy loop based on element size
  0x01eae461: cmp    edi,0x0
  0x01eae464: je     Stub::jbyte_arraycopy+17 0x01EAD631
  0x01eae46a: cmp    edi,0x1
  0x01eae46d: je     Stub::jshort_arraycopy+17 0x01EAD921
  0x01eae473: cmp    edi,0x2
  0x01eae476: je     Stub::jint_arraycopy+17 0x01EADA81
  0x01eae47c: cmp    edi,0x3
  0x01eae47f: jne    Stub::generic_arraycopy+253 0x01EAE488
  0x01eae481: pop    edi
  0x01eae482: pop    esi
  0x01eae483: jmp    Stub::jlong_arraycopy+15 0x01EADE1F
  ;; L_failed:
  0x01eae488: xor    eax,eax
  0x01eae48a: not    eax
  0x01eae48c: pop    edi
  0x01eae48d: pop    esi
  0x01eae48e: mov    esp,ebp
  0x01eae490: pop    ebp
  0x01eae491: ret    
  ;; L_objArray:
  0x01eae492: cmp    ecx,DWORD PTR [edx+0x4]
  0x01eae495: jne    Stub::generic_arraycopy+323 0x01EAE4CE
  ;; arraycopy_range_checks:
  0x01eae497: add    esi,DWORD PTR [esp+0x20]
  0x01eae49b: add    edi,DWORD PTR [esp+0x20]
  0x01eae49f: cmp    esi,DWORD PTR [eax+0x8]
  0x01eae4a2: ja     Stub::generic_arraycopy+253 0x01EAE488
  0x01eae4a4: cmp    edi,DWORD PTR [edx+0x8]
  0x01eae4a7: ja     Stub::generic_arraycopy+253 0x01EAE488
  ;; arraycopy_range_checks done
  ;; L_plain_copy:
  0x01eae4a9: mov    ecx,DWORD PTR [esp+0x20]
  0x01eae4ad: mov    esi,DWORD PTR [esp+0x14]
  0x01eae4b1: lea    eax,[eax+esi*4+0xc]
  0x01eae4b5: mov    edi,DWORD PTR [esp+0x1c]
  0x01eae4b9: lea    edx,[edx+edi*4+0xc]
  0x01eae4bd: mov    DWORD PTR [esp+0x10],eax
  0x01eae4c1: mov    DWORD PTR [esp+0x14],edx
  0x01eae4c5: mov    DWORD PTR [esp+0x18],ecx
  0x01eae4c9: jmp    Stub::oop_arraycopy+17 0x01EADBB1
  ;; L_checkcast_copy:
  0x01eae4ce: mov    esi,DWORD PTR [edx+0x4]
  0x01eae4d1: cmp    DWORD PTR [esi+0x8],0x800c0c02
  0x01eae4d8: jne    Stub::generic_arraycopy+253 0x01EAE488
  0x01eae4da: mov    esi,DWORD PTR [esp+0x14]
  ;; arraycopy_range_checks:
  0x01eae4de: add    esi,DWORD PTR [esp+0x20]
  0x01eae4e2: add    edi,DWORD PTR [esp+0x20]
  0x01eae4e6: cmp    esi,DWORD PTR [eax+0x8]
  0x01eae4e9: ja     Stub::generic_arraycopy+253 0x01EAE488
  0x01eae4eb: cmp    edi,DWORD PTR [edx+0x8]
  0x01eae4ee: ja     Stub::generic_arraycopy+253 0x01EAE488
  ;; arraycopy_range_checks done
  0x01eae4f0: push   ebx
  0x01eae4f1: mov    ebx,ecx
  0x01eae4f3: mov    esi,DWORD PTR [edx+0x4]
  ;; type_check:
  0x01eae4f6: cmp    ebx,DWORD PTR [edx+0x4]
  0x01eae4f9: je     Stub::generic_arraycopy+438 0x01EAE541
  0x01eae4ff: mov    edi,DWORD PTR [esi+0xc]
  0x01eae502: mov    edi,DWORD PTR [ebx+edi*1]
  0x01eae505: cmp    edi,DWORD PTR [edx+0x4]
  0x01eae508: je     Stub::generic_arraycopy+438 0x01EAE541
  0x01eae50e: cmp    DWORD PTR [esi+0xc],0x14
  0x01eae515: jne    Stub::generic_arraycopy+444 0x01EAE547
  0x01eae51b: mov    edi,DWORD PTR [edx+0x4]
  0x01eae51e: push   eax
  0x01eae51f: mov    eax,edi
  0x01eae521: push   ecx
  0x01eae522: push   edi
  0x01eae523: inc    DWORD PTR ds:0x556349a0
  0x01eae529: mov    edi,DWORD PTR [ebx+0x18]
  0x01eae52c: mov    ecx,DWORD PTR [edi]
  0x01eae52e: add    edi,0x4
  0x01eae531: test   eax,eax
  0x01eae533: repnz scas eax,DWORD PTR es:[edi]
  0x01eae535: pop    edi
  0x01eae536: pop    ecx
  0x01eae537: pop    eax
  0x01eae538: jne    Stub::generic_arraycopy+444 0x01EAE547
  0x01eae53e: mov    DWORD PTR [ebx+0x14],edi
  ;; L_success:
  0x01eae541: pop    ebx
  0x01eae542: jmp    Stub::generic_arraycopy+286 0x01EAE4A9
  ;; L_fail_array_check:
  0x01eae547: mov    ebx,DWORD PTR [esi+0x90]
  0x01eae54d: mov    ecx,DWORD PTR [esp+0x24]
  0x01eae551: mov    esi,DWORD PTR [esp+0x18]
  0x01eae555: mov    edi,DWORD PTR [esp+0x20]
  0x01eae559: mov    DWORD PTR [esp+0x24],ebx
  0x01eae55d: mov    ebx,DWORD PTR [ebx+0xc]
  0x01eae560: mov    DWORD PTR [esp+0x20],ebx
  0x01eae564: mov    DWORD PTR [esp+0x1c],ecx
  0x01eae568: lea    eax,[eax+esi*4+0xc]
  0x01eae56c: mov    DWORD PTR [esp+0x14],eax
  0x01eae570: lea    edx,[edx+edi*4+0xc]
  0x01eae574: mov    DWORD PTR [esp+0x18],edx
  0x01eae578: jmp    Stub::checkcast_arraycopy+18 0x01EAE192

StubRoutines::log [0x01eae57d, 0x01eae588[ (11 bytes)
  0x01eae57d: fld    QWORD PTR [esp+0x4]
  0x01eae581: fldln2 
  0x01eae583: fxch   st(1)
  0x01eae585: fyl2x  
  0x01eae587: ret    

StubRoutines::log10 [0x01eae588, 0x01eae593[ (11 bytes)
  0x01eae588: fld    QWORD PTR [esp+0x4]
  0x01eae58c: fldlg2 
  0x01eae58e: fxch   st(1)
  0x01eae590: fyl2x  
  0x01eae592: ret    

StubRoutines::sin [0x01eae593, 0x01eae62f[ (156 bytes)
  0x01eae593: fld    QWORD PTR [esp+0x4]
  0x01eae597: fld    QWORD PTR ds:0x55311630
  0x01eae59d: fld    st(1)
  0x01eae59f: fabs   
  0x01eae5a1: fucomip st,st(1)
  0x01eae5a3: ffree  st(0)
  0x01eae5a5: fincstp 
  0x01eae5a7: ja     Stub::sin+33 0x01EAE5B4
  0x01eae5ad: fsin   
  0x01eae5af: jmp    Stub::sin+155 0x01EAE62E
  0x01eae5b4: pusha  
  0x01eae5b5: sub    esp,0x80
  0x01eae5bb: movdqu XMMWORD PTR [esp],xmm0
  0x01eae5c0: movdqu XMMWORD PTR [esp+0x10],xmm1
  0x01eae5c6: movdqu XMMWORD PTR [esp+0x20],xmm2
  0x01eae5cc: movdqu XMMWORD PTR [esp+0x30],xmm3
  0x01eae5d2: movdqu XMMWORD PTR [esp+0x40],xmm4
  0x01eae5d8: movdqu XMMWORD PTR [esp+0x50],xmm5
  0x01eae5de: movdqu XMMWORD PTR [esp+0x60],xmm6
  0x01eae5e4: movdqu XMMWORD PTR [esp+0x70],xmm7
  0x01eae5ea: sub    esp,0x8
  0x01eae5ed: fstp   QWORD PTR [esp]
  0x01eae5f0: call   0x5521da10
  0x01eae5f5: add    esp,0x8
  0x01eae5f8: movdqu xmm0,XMMWORD PTR [esp]
  0x01eae5fd: movdqu xmm1,XMMWORD PTR [esp+0x10]
  0x01eae603: movdqu xmm2,XMMWORD PTR [esp+0x20]
  0x01eae609: movdqu xmm3,XMMWORD PTR [esp+0x30]
  0x01eae60f: movdqu xmm4,XMMWORD PTR [esp+0x40]
  0x01eae615: movdqu xmm5,XMMWORD PTR [esp+0x50]
  0x01eae61b: movdqu xmm6,XMMWORD PTR [esp+0x60]
  0x01eae621: movdqu xmm7,XMMWORD PTR [esp+0x70]
  0x01eae627: add    esp,0x80
  0x01eae62d: popa   
  0x01eae62e: ret    

StubRoutines::cos [0x01eae62f, 0x01eae6cb[ (156 bytes)
  0x01eae62f: fld    QWORD PTR [esp+0x4]
  0x01eae633: fld    QWORD PTR ds:0x55311630
  0x01eae639: fld    st(1)
  0x01eae63b: fabs   
  0x01eae63d: fucomip st,st(1)
  0x01eae63f: ffree  st(0)
  0x01eae641: fincstp 
  0x01eae643: ja     Stub::cos+33 0x01EAE650
  0x01eae649: fcos   
  0x01eae64b: jmp    Stub::cos+155 0x01EAE6CA
  0x01eae650: pusha  
  0x01eae651: sub    esp,0x80
  0x01eae657: movdqu XMMWORD PTR [esp],xmm0
  0x01eae65c: movdqu XMMWORD PTR [esp+0x10],xmm1
  0x01eae662: movdqu XMMWORD PTR [esp+0x20],xmm2
  0x01eae668: movdqu XMMWORD PTR [esp+0x30],xmm3
  0x01eae66e: movdqu XMMWORD PTR [esp+0x40],xmm4
  0x01eae674: movdqu XMMWORD PTR [esp+0x50],xmm5
  0x01eae67a: movdqu XMMWORD PTR [esp+0x60],xmm6
  0x01eae680: movdqu XMMWORD PTR [esp+0x70],xmm7
  0x01eae686: sub    esp,0x8
  0x01eae689: fstp   QWORD PTR [esp]
  0x01eae68c: call   0x5521dd30
  0x01eae691: add    esp,0x8
  0x01eae694: movdqu xmm0,XMMWORD PTR [esp]
  0x01eae699: movdqu xmm1,XMMWORD PTR [esp+0x10]
  0x01eae69f: movdqu xmm2,XMMWORD PTR [esp+0x20]
  0x01eae6a5: movdqu xmm3,XMMWORD PTR [esp+0x30]
  0x01eae6ab: movdqu xmm4,XMMWORD PTR [esp+0x40]
  0x01eae6b1: movdqu xmm5,XMMWORD PTR [esp+0x50]
  0x01eae6b7: movdqu xmm6,XMMWORD PTR [esp+0x60]
  0x01eae6bd: movdqu xmm7,XMMWORD PTR [esp+0x70]
  0x01eae6c3: add    esp,0x80
  0x01eae6c9: popa   
  0x01eae6ca: ret    

StubRoutines::tan [0x01eae6cb, 0x01eae769[ (158 bytes)
  0x01eae6cb: fld    QWORD PTR [esp+0x4]
  0x01eae6cf: fld    QWORD PTR ds:0x55311630
  0x01eae6d5: fld    st(1)
  0x01eae6d7: fabs   
  0x01eae6d9: fucomip st,st(1)
  0x01eae6db: ffree  st(0)
  0x01eae6dd: fincstp 
  0x01eae6df: ja     Stub::tan+35 0x01EAE6EE
  0x01eae6e5: fptan  
  0x01eae6e7: fstp   st(0)
  0x01eae6e9: jmp    Stub::tan+157 0x01EAE768
  0x01eae6ee: pusha  
  0x01eae6ef: sub    esp,0x80
  0x01eae6f5: movdqu XMMWORD PTR [esp],xmm0
  0x01eae6fa: movdqu XMMWORD PTR [esp+0x10],xmm1
  0x01eae700: movdqu XMMWORD PTR [esp+0x20],xmm2
  0x01eae706: movdqu XMMWORD PTR [esp+0x30],xmm3
  0x01eae70c: movdqu XMMWORD PTR [esp+0x40],xmm4
  0x01eae712: movdqu XMMWORD PTR [esp+0x50],xmm5
  0x01eae718: movdqu XMMWORD PTR [esp+0x60],xmm6
  0x01eae71e: movdqu XMMWORD PTR [esp+0x70],xmm7
  0x01eae724: sub    esp,0x8
  0x01eae727: fstp   QWORD PTR [esp]
  0x01eae72a: call   0x5521e050
  0x01eae72f: add    esp,0x8
  0x01eae732: movdqu xmm0,XMMWORD PTR [esp]
  0x01eae737: movdqu xmm1,XMMWORD PTR [esp+0x10]
  0x01eae73d: movdqu xmm2,XMMWORD PTR [esp+0x20]
  0x01eae743: movdqu xmm3,XMMWORD PTR [esp+0x30]
  0x01eae749: movdqu xmm4,XMMWORD PTR [esp+0x40]
  0x01eae74f: movdqu xmm5,XMMWORD PTR [esp+0x50]
  0x01eae755: movdqu xmm6,XMMWORD PTR [esp+0x60]
  0x01eae75b: movdqu xmm7,XMMWORD PTR [esp+0x70]
  0x01eae761: add    esp,0x80
  0x01eae767: popa   
  0x01eae768: ret    

StubRoutines::exp [0x01eae769, 0x01eae863[ (250 bytes)
  0x01eae769: fld    QWORD PTR [esp+0x4]
  0x01eae76d: fld    st(0)
  0x01eae76f: sub    esp,0x4
  0x01eae772: fstcw  WORD PTR [esp]
  0x01eae776: mov    eax,DWORD PTR [esp]
  0x01eae779: or     eax,0x300
  0x01eae77f: push   eax
  0x01eae780: fldcw  WORD PTR [esp]
  0x01eae783: pop    eax
  0x01eae784: fldl2e 
  0x01eae786: fmulp  st(1),st
  0x01eae788: sub    esp,0x8
  0x01eae78b: fld    st(0)
  0x01eae78d: frndint 
  0x01eae78f: fsubr  st(1),st
  0x01eae791: fistp  DWORD PTR [esp]
  0x01eae794: f2xm1  
  0x01eae796: fld1   
  0x01eae798: faddp  st(1),st
  0x01eae79a: mov    eax,DWORD PTR [esp]
  0x01eae79d: mov    ecx,0xfffff800
  0x01eae7a2: add    eax,0x3ff
  0x01eae7a8: mov    edx,eax
  0x01eae7aa: shl    eax,0x14
  0x01eae7ad: add    edx,0x1
  0x01eae7b0: cmove  eax,ecx
  0x01eae7b3: cmp    edx,0x1
  0x01eae7b6: cmove  eax,ecx
  0x01eae7b9: test   ecx,edx
  0x01eae7bb: cmovne eax,ecx
  0x01eae7be: mov    DWORD PTR [esp+0x4],eax
  0x01eae7c2: mov    DWORD PTR [esp],0x0
  0x01eae7c9: fmul   QWORD PTR [esp]
  0x01eae7cc: add    esp,0x8
  0x01eae7cf: fldcw  WORD PTR [esp]
  0x01eae7d2: add    esp,0x4
  0x01eae7d5: fucomi st,st(0)
  0x01eae7d7: jp     Stub::exp+123 0x01EAE7E4
  0x01eae7dd: ffree  st(1)
  0x01eae7df: jmp    Stub::exp+249 0x01EAE862
  0x01eae7e4: ffree  st(0)
  0x01eae7e6: fincstp 
  0x01eae7e8: pusha  
  0x01eae7e9: sub    esp,0x80
  0x01eae7ef: movdqu XMMWORD PTR [esp],xmm0
  0x01eae7f4: movdqu XMMWORD PTR [esp+0x10],xmm1
  0x01eae7fa: movdqu XMMWORD PTR [esp+0x20],xmm2
  0x01eae800: movdqu XMMWORD PTR [esp+0x30],xmm3
  0x01eae806: movdqu XMMWORD PTR [esp+0x40],xmm4
  0x01eae80c: movdqu XMMWORD PTR [esp+0x50],xmm5
  0x01eae812: movdqu XMMWORD PTR [esp+0x60],xmm6
  0x01eae818: movdqu XMMWORD PTR [esp+0x70],xmm7
  0x01eae81e: sub    esp,0x8
  0x01eae821: fstp   QWORD PTR [esp]
  0x01eae824: call   0x5521c000
  0x01eae829: add    esp,0x8
  0x01eae82c: movdqu xmm0,XMMWORD PTR [esp]
  0x01eae831: movdqu xmm1,XMMWORD PTR [esp+0x10]
  0x01eae837: movdqu xmm2,XMMWORD PTR [esp+0x20]
  0x01eae83d: movdqu xmm3,XMMWORD PTR [esp+0x30]
  0x01eae843: movdqu xmm4,XMMWORD PTR [esp+0x40]
  0x01eae849: movdqu xmm5,XMMWORD PTR [esp+0x50]
  0x01eae84f: movdqu xmm6,XMMWORD PTR [esp+0x60]
  0x01eae855: movdqu xmm7,XMMWORD PTR [esp+0x70]
  0x01eae85b: add    esp,0x80
  0x01eae861: popa   
  0x01eae862: ret    

StubRoutines::pow [0x01eae863, 0x01eaea4d[ (490 bytes)
  0x01eae863: fld    QWORD PTR [esp+0xc]
  0x01eae867: fld    QWORD PTR [esp+0x4]
  0x01eae86b: fldz   
  0x01eae86d: fucomip st,st(1)
  0x01eae86f: ja     Stub::pow+139 0x01EAE8EE
  0x01eae875: fld    st(1)
  0x01eae877: fld    st(1)
  0x01eae879: sub    esp,0x4
  0x01eae87c: fstcw  WORD PTR [esp]
  0x01eae880: mov    eax,DWORD PTR [esp]
  0x01eae883: or     eax,0x300
  0x01eae889: push   eax
  0x01eae88a: fldcw  WORD PTR [esp]
  0x01eae88d: pop    eax
  0x01eae88e: fyl2x  
  0x01eae890: sub    esp,0x8
  0x01eae893: fld    st(0)
  0x01eae895: frndint 
  0x01eae897: fsubr  st(1),st
  0x01eae899: fistp  DWORD PTR [esp]
  0x01eae89c: f2xm1  
  0x01eae89e: fld1   
  0x01eae8a0: faddp  st(1),st
  0x01eae8a2: mov    eax,DWORD PTR [esp]
  0x01eae8a5: mov    ecx,0xfffff800
  0x01eae8aa: add    eax,0x3ff
  0x01eae8b0: mov    edx,eax
  0x01eae8b2: shl    eax,0x14
  0x01eae8b5: add    edx,0x1
  0x01eae8b8: cmove  eax,ecx
  0x01eae8bb: cmp    edx,0x1
  0x01eae8be: cmove  eax,ecx
  0x01eae8c1: test   ecx,edx
  0x01eae8c3: cmovne eax,ecx
  0x01eae8c6: mov    DWORD PTR [esp+0x4],eax
  0x01eae8ca: mov    DWORD PTR [esp],0x0
  0x01eae8d1: fmul   QWORD PTR [esp]
  0x01eae8d4: add    esp,0x8
  0x01eae8d7: fldcw  WORD PTR [esp]
  0x01eae8da: add    esp,0x4
  0x01eae8dd: fucomi st,st(0)
  0x01eae8df: jp     Stub::pow+359 0x01EAE9CA
  0x01eae8e5: ffree  st(2)
  0x01eae8e7: ffree  st(1)
  0x01eae8e9: jmp    Stub::pow+489 0x01EAEA4C
  0x01eae8ee: fld    st(1)
  0x01eae8f0: frndint 
  0x01eae8f2: fucomi st,st(2)
  0x01eae8f4: jne    Stub::pow+359 0x01EAE9CA
  0x01eae8fa: sub    esp,0x8
  0x01eae8fd: fld1   
  0x01eae8ff: fadd   st,st(1)
  0x01eae901: fucomip st,st(1)
  0x01eae903: fistp  QWORD PTR [esp]
  0x01eae906: jne    Stub::pow+184 0x01EAE91B
  0x01eae90c: mov    DWORD PTR [esp],0x0
  0x01eae913: mov    DWORD PTR [esp+0x4],0x0
  0x01eae91b: fld    st(1)
  0x01eae91d: fld    st(1)
  0x01eae91f: fabs   
  0x01eae921: sub    esp,0x4
  0x01eae924: fstcw  WORD PTR [esp]
  0x01eae928: mov    eax,DWORD PTR [esp]
  0x01eae92b: or     eax,0x300
  0x01eae931: push   eax
  0x01eae932: fldcw  WORD PTR [esp]
  0x01eae935: pop    eax
  0x01eae936: fyl2x  
  0x01eae938: sub    esp,0x8
  0x01eae93b: fld    st(0)
  0x01eae93d: frndint 
  0x01eae93f: fsubr  st(1),st
  0x01eae941: fistp  DWORD PTR [esp]
  0x01eae944: f2xm1  
  0x01eae946: fld1   
  0x01eae948: faddp  st(1),st
  0x01eae94a: mov    eax,DWORD PTR [esp]
  0x01eae94d: mov    ecx,0xfffff800
  0x01eae952: add    eax,0x3ff
  0x01eae958: mov    edx,eax
  0x01eae95a: shl    eax,0x14
  0x01eae95d: add    edx,0x1
  0x01eae960: cmove  eax,ecx
  0x01eae963: cmp    edx,0x1
  0x01eae966: cmove  eax,ecx
  0x01eae969: test   ecx,edx
  0x01eae96b: cmovne eax,ecx
  0x01eae96e: mov    DWORD PTR [esp+0x4],eax
  0x01eae972: mov    DWORD PTR [esp],0x0
  0x01eae979: fmul   QWORD PTR [esp]
  0x01eae97c: add    esp,0x8
  0x01eae97f: fldcw  WORD PTR [esp]
  0x01eae982: add    esp,0x4
  0x01eae985: fucomi st,st(0)
  0x01eae987: pop    eax
  0x01eae988: pop    ecx
  0x01eae989: jp     Stub::pow+359 0x01EAE9CA
  0x01eae98f: test   eax,eax
  0x01eae991: jne    Stub::pow+337 0x01EAE9B4
  0x01eae997: cmp    ecx,0x80000000
  0x01eae99d: jne    Stub::pow+337 0x01EAE9B4
  ;; integer indefinite value shouldn't be seen here
  0x01eae9a3: push   0x55313a8c
  0x01eae9a8: call   Stub::pow+330 0x01EAE9AD
  0x01eae9ad: pusha  
  0x01eae9ae: call   0x54dedbf0
  0x01eae9b3: hlt    
  0x01eae9b4: ffree  st(2)
  0x01eae9b6: ffree  st(1)
  0x01eae9b8: test   eax,0x1
  0x01eae9bd: je     Stub::pow+489 0x01EAEA4C
  0x01eae9c3: fchs   
  0x01eae9c5: jmp    Stub::pow+489 0x01EAEA4C
  0x01eae9ca: ffree  st(0)
  0x01eae9cc: fincstp 
  0x01eae9ce: pusha  
  0x01eae9cf: sub    esp,0x80
  0x01eae9d5: movdqu XMMWORD PTR [esp],xmm0
  0x01eae9da: movdqu XMMWORD PTR [esp+0x10],xmm1
  0x01eae9e0: movdqu XMMWORD PTR [esp+0x20],xmm2
  0x01eae9e6: movdqu XMMWORD PTR [esp+0x30],xmm3
  0x01eae9ec: movdqu XMMWORD PTR [esp+0x40],xmm4
  0x01eae9f2: movdqu XMMWORD PTR [esp+0x50],xmm5
  0x01eae9f8: movdqu XMMWORD PTR [esp+0x60],xmm6
  0x01eae9fe: movdqu XMMWORD PTR [esp+0x70],xmm7
  0x01eaea04: sub    esp,0x10
  0x01eaea07: fstp   QWORD PTR [esp]
  0x01eaea0a: fstp   QWORD PTR [esp+0x8]
  0x01eaea0e: call   0x5521c0f0
  0x01eaea13: add    esp,0x10
  0x01eaea16: movdqu xmm0,XMMWORD PTR [esp]
  0x01eaea1b: movdqu xmm1,XMMWORD PTR [esp+0x10]
  0x01eaea21: movdqu xmm2,XMMWORD PTR [esp+0x20]
  0x01eaea27: movdqu xmm3,XMMWORD PTR [esp+0x30]
  0x01eaea2d: movdqu xmm4,XMMWORD PTR [esp+0x40]
  0x01eaea33: movdqu xmm5,XMMWORD PTR [esp+0x50]
  0x01eaea39: movdqu xmm6,XMMWORD PTR [esp+0x60]
  0x01eaea3f: movdqu xmm7,XMMWORD PTR [esp+0x70]
  0x01eaea45: add    esp,0x80
  0x01eaea4b: popa   
  0x01eaea4c: ret    

StubRoutines::SafeFetch32 [0x01eaea4d, 0x01eaea58[ (11 bytes)
  0x01eaea4d: mov    eax,DWORD PTR [esp+0x8]
  0x01eaea51: mov    ecx,DWORD PTR [esp+0x4]
  0x01eaea55: mov    eax,DWORD PTR [ecx]
  0x01eaea57: ret    

AHE@0x0422bdfc: 0x7e000000 i2c: 0x01eb2a30 c2i: 0x01eb2ad8 c2iUV: 0x01eb2ab7
i2c argument handler #28 for: static (D)Ljava/lang/String; (243 bytes generated)
c2i argument handler starts at 01EB2AD8
  0x01eb2a30: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eb2a33: mov    edi,0x1dc2940
  0x01eb2a38: cmp    eax,edi
  0x01eb2a3a: jbe    0x01eb2a4d
  0x01eb2a40: mov    edi,0x1ea2940
  0x01eb2a45: cmp    eax,edi
  0x01eb2a47: jb     0x01eb2a92
  0x01eb2a4d: mov    edi,0x1dc0340
  0x01eb2a52: cmp    eax,edi
  0x01eb2a54: jbe    0x01eb2a67
  0x01eb2a5a: mov    edi,0x1dc2668
  0x01eb2a5f: cmp    eax,edi
  0x01eb2a61: jb     0x01eb2a92
  0x01eb2a67: mov    edi,0x1ead380
  0x01eb2a6c: cmp    eax,edi
  0x01eb2a6e: jbe    0x01eb2a81
  0x01eb2a74: mov    edi,0x1eb2970
  0x01eb2a79: cmp    eax,edi
  0x01eb2a7b: jb     0x01eb2a92
  ;; i2c adapter must return to an interpreter frame
  0x01eb2a81: push   0x5531723c
  0x01eb2a86: call   0x01eb2a8b
  0x01eb2a8b: pusha  
  0x01eb2a8c: call   0x54dedbf0
  0x01eb2a91: hlt    
  ;; } verify_i2ce 
  0x01eb2a92: mov    edi,esp
  0x01eb2a94: and    esp,0xfffffff0
  0x01eb2a97: push   eax
  0x01eb2a98: mov    eax,edi
  0x01eb2a9a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eb2a9d: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01eb2aa2: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2aaa: mov    eax,DWORD PTR [eax-0xc]
  0x01eb2aad: mov    DWORD PTR [eax+0x168],ebx
  0x01eb2ab3: mov    eax,ebx
  0x01eb2ab5: jmp    edi
  0x01eb2ab7: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eb2aba: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eb2abd: mov    ebx,DWORD PTR [eax+0x4]
  0x01eb2ac0: jne    0x01eb2ad3
  0x01eb2ac6: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eb2acd: je     0x01eb2b12
  0x01eb2ad3: jmp    0x01ea32d0
  0x01eb2ad8: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eb2adf: je     0x01eb2b12
  0x01eb2ae5: mov    eax,DWORD PTR [esp]
  0x01eb2ae8: pusha  
  0x01eb2ae9: pushf  
  0x01eb2aea: sub    esp,0x10
  0x01eb2aed: movsd  QWORD PTR [esp],xmm0
  0x01eb2af2: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eb2af8: push   eax
  0x01eb2af9: push   ebx
  0x01eb2afa: call   0x552179d0
  0x01eb2aff: add    esp,0x8
  0x01eb2b02: movsd  xmm0,QWORD PTR [esp]
  0x01eb2b07: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eb2b0d: add    esp,0x10
  0x01eb2b10: popf   
  0x01eb2b11: popa   
  0x01eb2b12: pop    eax
  0x01eb2b13: mov    esi,esp
  0x01eb2b15: sub    esp,0x8
  0x01eb2b18: movsd  QWORD PTR [esp],xmm0
  0x01eb2b1d: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eb2b20: push   eax
  0x01eb2b21: jmp    ecx

AHE@0x0422be28: 0x60000000 i2c: 0x01eb2df0 c2i: 0x01eb2e98 c2iUV: 0x01eb2e77
i2c argument handler #29 for: static (F)Ljava/lang/String; (243 bytes generated)
c2i argument handler starts at 01EB2E98
  0x01eb2df0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eb2df3: mov    edi,0x1dc2940
  0x01eb2df8: cmp    eax,edi
  0x01eb2dfa: jbe    0x01eb2e0d
  0x01eb2e00: mov    edi,0x1ea2940
  0x01eb2e05: cmp    eax,edi
  0x01eb2e07: jb     0x01eb2e52
  0x01eb2e0d: mov    edi,0x1dc0340
  0x01eb2e12: cmp    eax,edi
  0x01eb2e14: jbe    0x01eb2e27
  0x01eb2e1a: mov    edi,0x1dc2668
  0x01eb2e1f: cmp    eax,edi
  0x01eb2e21: jb     0x01eb2e52
  0x01eb2e27: mov    edi,0x1ead380
  0x01eb2e2c: cmp    eax,edi
  0x01eb2e2e: jbe    0x01eb2e41
  0x01eb2e34: mov    edi,0x1eb2970
  0x01eb2e39: cmp    eax,edi
  0x01eb2e3b: jb     0x01eb2e52
  ;; i2c adapter must return to an interpreter frame
  0x01eb2e41: push   0x5531723c
  0x01eb2e46: call   0x01eb2e4b
  0x01eb2e4b: pusha  
  0x01eb2e4c: call   0x54dedbf0
  0x01eb2e51: hlt    
  ;; } verify_i2ce 
  0x01eb2e52: mov    edi,esp
  0x01eb2e54: and    esp,0xfffffff0
  0x01eb2e57: push   eax
  0x01eb2e58: mov    eax,edi
  0x01eb2e5a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eb2e5d: movss  xmm0,DWORD PTR [eax+0x4]
  0x01eb2e62: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2e6a: mov    eax,DWORD PTR [eax-0xc]
  0x01eb2e6d: mov    DWORD PTR [eax+0x168],ebx
  0x01eb2e73: mov    eax,ebx
  0x01eb2e75: jmp    edi
  0x01eb2e77: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eb2e7a: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eb2e7d: mov    ebx,DWORD PTR [eax+0x4]
  0x01eb2e80: jne    0x01eb2e93
  0x01eb2e86: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eb2e8d: je     0x01eb2ed2
  0x01eb2e93: jmp    0x01ea32d0
  0x01eb2e98: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eb2e9f: je     0x01eb2ed2
  0x01eb2ea5: mov    eax,DWORD PTR [esp]
  0x01eb2ea8: pusha  
  0x01eb2ea9: pushf  
  0x01eb2eaa: sub    esp,0x10
  0x01eb2ead: movsd  QWORD PTR [esp],xmm0
  0x01eb2eb2: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eb2eb8: push   eax
  0x01eb2eb9: push   ebx
  0x01eb2eba: call   0x552179d0
  0x01eb2ebf: add    esp,0x8
  0x01eb2ec2: movsd  xmm0,QWORD PTR [esp]
  0x01eb2ec7: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eb2ecd: add    esp,0x10
  0x01eb2ed0: popf   
  0x01eb2ed1: popa   
  0x01eb2ed2: pop    eax
  0x01eb2ed3: mov    esi,esp
  0x01eb2ed5: sub    esp,0x4
  0x01eb2ed8: movss  DWORD PTR [esp],xmm0
  0x01eb2edd: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eb2ee0: push   eax
  0x01eb2ee1: jmp    ecx

AHE@0x0422be54: 0xbe000000 i2c: 0x01eb2f70 c2i: 0x01eb3024 c2iUV: 0x01eb3003
i2c argument handler #30 for: static (J)Ljava/lang/String; (265 bytes generated)
c2i argument handler starts at 01EB3024
  0x01eb2f70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01eb2f73: mov    edi,0x1dc2940
  0x01eb2f78: cmp    eax,edi
  0x01eb2f7a: jbe    0x01eb2f8d
  0x01eb2f80: mov    edi,0x1ea2940
  0x01eb2f85: cmp    eax,edi
  0x01eb2f87: jb     0x01eb2fd2
  0x01eb2f8d: mov    edi,0x1dc0340
  0x01eb2f92: cmp    eax,edi
  0x01eb2f94: jbe    0x01eb2fa7
  0x01eb2f9a: mov    edi,0x1dc2668
  0x01eb2f9f: cmp    eax,edi
  0x01eb2fa1: jb     0x01eb2fd2
  0x01eb2fa7: mov    edi,0x1ead380
  0x01eb2fac: cmp    eax,edi
  0x01eb2fae: jbe    0x01eb2fc1
  0x01eb2fb4: mov    edi,0x1eb2970
  0x01eb2fb9: cmp    eax,edi
  0x01eb2fbb: jb     0x01eb2fd2
  ;; i2c adapter must return to an interpreter frame
  0x01eb2fc1: push   0x5531723c
  0x01eb2fc6: call   0x01eb2fcb
  0x01eb2fcb: pusha  
  0x01eb2fcc: call   0x54dedbf0
  0x01eb2fd1: hlt    
  ;; } verify_i2ce 
  0x01eb2fd2: mov    edi,esp
  0x01eb2fd4: sub    esp,0x8
  0x01eb2fd7: and    esp,0xfffffff0
  0x01eb2fda: push   eax
  0x01eb2fdb: mov    eax,edi
  0x01eb2fdd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01eb2fe0: mov    esi,DWORD PTR [eax+0x4]
  0x01eb2fe3: mov    DWORD PTR [esp+0x4],esi
  0x01eb2fe7: mov    esi,DWORD PTR [eax+0x8]
  0x01eb2fea: mov    DWORD PTR [esp+0x8],esi
  0x01eb2fee: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01eb2ff6: mov    eax,DWORD PTR [eax-0xc]
  0x01eb2ff9: mov    DWORD PTR [eax+0x168],ebx
  0x01eb2fff: mov    eax,ebx
  0x01eb3001: jmp    edi
  0x01eb3003: mov    ebx,DWORD PTR [ecx+0x4]
  0x01eb3006: cmp    ebx,DWORD PTR [eax+0x8]
  0x01eb3009: mov    ebx,DWORD PTR [eax+0x4]
  0x01eb300c: jne    0x01eb301f
  0x01eb3012: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eb3019: je     0x01eb305e
  0x01eb301f: jmp    0x01ea32d0
  0x01eb3024: cmp    DWORD PTR [ebx+0x30],0x0
  0x01eb302b: je     0x01eb305e
  0x01eb3031: mov    eax,DWORD PTR [esp]
  0x01eb3034: pusha  
  0x01eb3035: pushf  
  0x01eb3036: sub    esp,0x10
  0x01eb3039: movsd  QWORD PTR [esp],xmm0
  0x01eb303e: movsd  QWORD PTR [esp+0x8],xmm1
  0x01eb3044: push   eax
  0x01eb3045: push   ebx
  0x01eb3046: call   0x552179d0
  0x01eb304b: add    esp,0x8
  0x01eb304e: movsd  xmm0,QWORD PTR [esp]
  0x01eb3053: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01eb3059: add    esp,0x10
  0x01eb305c: popf   
  0x01eb305d: popa   
  0x01eb305e: pop    eax
  0x01eb305f: mov    esi,esp
  0x01eb3061: sub    esp,0x8
  0x01eb3064: mov    edi,DWORD PTR [esp+0x8]
  0x01eb3068: mov    DWORD PTR [esp],edi
  0x01eb306b: mov    edi,DWORD PTR [esp+0xc]
  0x01eb306f: mov    DWORD PTR [esp+0x4],edi
  0x01eb3073: mov    ecx,DWORD PTR [ebx+0x24]
  0x01eb3076: push   eax
  0x01eb3077: jmp    ecx

AHE@0x0422be80: 0xbea00000 i2c: 0x01ebb570 c2i: 0x01ebb627 c2iUV: 0x01ebb606
i2c argument handler #31 for: static (JI)V (272 bytes generated)
c2i argument handler starts at 01EBB627
  0x01ebb570: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebb573: mov    edi,0x1dc2940
  0x01ebb578: cmp    eax,edi
  0x01ebb57a: jbe    0x01ebb58d
  0x01ebb580: mov    edi,0x1ea2940
  0x01ebb585: cmp    eax,edi
  0x01ebb587: jb     0x01ebb5d2
  0x01ebb58d: mov    edi,0x1dc0340
  0x01ebb592: cmp    eax,edi
  0x01ebb594: jbe    0x01ebb5a7
  0x01ebb59a: mov    edi,0x1dc2668
  0x01ebb59f: cmp    eax,edi
  0x01ebb5a1: jb     0x01ebb5d2
  0x01ebb5a7: mov    edi,0x1ead380
  0x01ebb5ac: cmp    eax,edi
  0x01ebb5ae: jbe    0x01ebb5c1
  0x01ebb5b4: mov    edi,0x1eb2970
  0x01ebb5b9: cmp    eax,edi
  0x01ebb5bb: jb     0x01ebb5d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebb5c1: push   0x5531723c
  0x01ebb5c6: call   0x01ebb5cb
  0x01ebb5cb: pusha  
  0x01ebb5cc: call   0x54dedbf0
  0x01ebb5d1: hlt    
  ;; } verify_i2ce 
  0x01ebb5d2: mov    edi,esp
  0x01ebb5d4: sub    esp,0x8
  0x01ebb5d7: and    esp,0xfffffff0
  0x01ebb5da: push   eax
  0x01ebb5db: mov    eax,edi
  0x01ebb5dd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebb5e0: mov    esi,DWORD PTR [eax+0x8]
  0x01ebb5e3: mov    DWORD PTR [esp+0x4],esi
  0x01ebb5e7: mov    esi,DWORD PTR [eax+0xc]
  0x01ebb5ea: mov    DWORD PTR [esp+0x8],esi
  0x01ebb5ee: mov    ecx,DWORD PTR [eax+0x4]
  0x01ebb5f1: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebb5f9: mov    eax,DWORD PTR [eax-0xc]
  0x01ebb5fc: mov    DWORD PTR [eax+0x168],ebx
  0x01ebb602: mov    eax,ebx
  0x01ebb604: jmp    edi
  0x01ebb606: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebb609: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebb60c: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebb60f: jne    0x01ebb622
  0x01ebb615: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebb61c: je     0x01ebb661
  0x01ebb622: jmp    0x01ea32d0
  0x01ebb627: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebb62e: je     0x01ebb661
  0x01ebb634: mov    eax,DWORD PTR [esp]
  0x01ebb637: pusha  
  0x01ebb638: pushf  
  0x01ebb639: sub    esp,0x10
  0x01ebb63c: movsd  QWORD PTR [esp],xmm0
  0x01ebb641: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebb647: push   eax
  0x01ebb648: push   ebx
  0x01ebb649: call   0x552179d0
  0x01ebb64e: add    esp,0x8
  0x01ebb651: movsd  xmm0,QWORD PTR [esp]
  0x01ebb656: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebb65c: add    esp,0x10
  0x01ebb65f: popf   
  0x01ebb660: popa   
  0x01ebb661: pop    eax
  0x01ebb662: mov    esi,esp
  0x01ebb664: sub    esp,0xc
  0x01ebb667: mov    edi,DWORD PTR [esp+0xc]
  0x01ebb66b: mov    DWORD PTR [esp+0x4],edi
  0x01ebb66f: mov    edi,DWORD PTR [esp+0x10]
  0x01ebb673: mov    DWORD PTR [esp+0x8],edi
  0x01ebb677: mov    DWORD PTR [esp],ecx
  0x01ebb67a: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebb67d: push   eax
  0x01ebb67e: jmp    ecx

AHE@0x0422beac: 0xaaaabe00 i2c: 0x01ebb6f0 c2i: 0x01ebb7b8 c2iUV: 0x01ebb797
i2c argument handler #32 for: receiver (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;J)V (309 bytes generated)
c2i argument handler starts at 01EBB7B8
  0x01ebb6f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebb6f3: mov    edi,0x1dc2940
  0x01ebb6f8: cmp    eax,edi
  0x01ebb6fa: jbe    0x01ebb70d
  0x01ebb700: mov    edi,0x1ea2940
  0x01ebb705: cmp    eax,edi
  0x01ebb707: jb     0x01ebb752
  0x01ebb70d: mov    edi,0x1dc0340
  0x01ebb712: cmp    eax,edi
  0x01ebb714: jbe    0x01ebb727
  0x01ebb71a: mov    edi,0x1dc2668
  0x01ebb71f: cmp    eax,edi
  0x01ebb721: jb     0x01ebb752
  0x01ebb727: mov    edi,0x1ead380
  0x01ebb72c: cmp    eax,edi
  0x01ebb72e: jbe    0x01ebb741
  0x01ebb734: mov    edi,0x1eb2970
  0x01ebb739: cmp    eax,edi
  0x01ebb73b: jb     0x01ebb752
  ;; i2c adapter must return to an interpreter frame
  0x01ebb741: push   0x5531723c
  0x01ebb746: call   0x01ebb74b
  0x01ebb74b: pusha  
  0x01ebb74c: call   0x54dedbf0
  0x01ebb751: hlt    
  ;; } verify_i2ce 
  0x01ebb752: mov    edi,esp
  0x01ebb754: sub    esp,0x10
  0x01ebb757: and    esp,0xfffffff0
  0x01ebb75a: push   eax
  0x01ebb75b: mov    eax,edi
  0x01ebb75d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebb760: mov    ecx,DWORD PTR [eax+0x18]
  0x01ebb763: mov    edx,DWORD PTR [eax+0x14]
  0x01ebb766: mov    esi,DWORD PTR [eax+0x10]
  0x01ebb769: mov    DWORD PTR [esp+0xc],esi
  0x01ebb76d: mov    esi,DWORD PTR [eax+0xc]
  0x01ebb770: mov    DWORD PTR [esp+0x10],esi
  0x01ebb774: mov    esi,DWORD PTR [eax+0x4]
  0x01ebb777: mov    DWORD PTR [esp+0x4],esi
  0x01ebb77b: mov    esi,DWORD PTR [eax+0x8]
  0x01ebb77e: mov    DWORD PTR [esp+0x8],esi
  0x01ebb782: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebb78a: mov    eax,DWORD PTR [eax-0xc]
  0x01ebb78d: mov    DWORD PTR [eax+0x168],ebx
  0x01ebb793: mov    eax,ebx
  0x01ebb795: jmp    edi
  0x01ebb797: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebb79a: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebb79d: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebb7a0: jne    0x01ebb7b3
  0x01ebb7a6: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebb7ad: je     0x01ebb7f2
  0x01ebb7b3: jmp    0x01ea32d0
  0x01ebb7b8: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebb7bf: je     0x01ebb7f2
  0x01ebb7c5: mov    eax,DWORD PTR [esp]
  0x01ebb7c8: pusha  
  0x01ebb7c9: pushf  
  0x01ebb7ca: sub    esp,0x10
  0x01ebb7cd: movsd  QWORD PTR [esp],xmm0
  0x01ebb7d2: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebb7d8: push   eax
  0x01ebb7d9: push   ebx
  0x01ebb7da: call   0x552179d0
  0x01ebb7df: add    esp,0x8
  0x01ebb7e2: movsd  xmm0,QWORD PTR [esp]
  0x01ebb7e7: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebb7ed: add    esp,0x10
  0x01ebb7f0: popf   
  0x01ebb7f1: popa   
  0x01ebb7f2: pop    eax
  0x01ebb7f3: mov    esi,esp
  0x01ebb7f5: sub    esp,0x18
  0x01ebb7f8: mov    DWORD PTR [esp+0x14],ecx
  0x01ebb7fc: mov    DWORD PTR [esp+0x10],edx
  0x01ebb800: mov    edi,DWORD PTR [esp+0x20]
  0x01ebb804: mov    DWORD PTR [esp+0xc],edi
  0x01ebb808: mov    edi,DWORD PTR [esp+0x24]
  0x01ebb80c: mov    DWORD PTR [esp+0x8],edi
  0x01ebb810: mov    edi,DWORD PTR [esp+0x18]
  0x01ebb814: mov    DWORD PTR [esp],edi
  0x01ebb817: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebb81b: mov    DWORD PTR [esp+0x4],edi
  0x01ebb81f: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebb822: push   eax
  0x01ebb823: jmp    ecx

AHE@0x0422bed8: 0xaaaabea0 i2c: 0x01ebb8b0 c2i: 0x01ebb97f c2iUV: 0x01ebb95e
i2c argument handler #33 for: receiver (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;JLjava/security/AccessControlContext;)V (324 bytes generated)
c2i argument handler starts at 01EBB97F
  0x01ebb8b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebb8b3: mov    edi,0x1dc2940
  0x01ebb8b8: cmp    eax,edi
  0x01ebb8ba: jbe    0x01ebb8cd
  0x01ebb8c0: mov    edi,0x1ea2940
  0x01ebb8c5: cmp    eax,edi
  0x01ebb8c7: jb     0x01ebb912
  0x01ebb8cd: mov    edi,0x1dc0340
  0x01ebb8d2: cmp    eax,edi
  0x01ebb8d4: jbe    0x01ebb8e7
  0x01ebb8da: mov    edi,0x1dc2668
  0x01ebb8df: cmp    eax,edi
  0x01ebb8e1: jb     0x01ebb912
  0x01ebb8e7: mov    edi,0x1ead380
  0x01ebb8ec: cmp    eax,edi
  0x01ebb8ee: jbe    0x01ebb901
  0x01ebb8f4: mov    edi,0x1eb2970
  0x01ebb8f9: cmp    eax,edi
  0x01ebb8fb: jb     0x01ebb912
  ;; i2c adapter must return to an interpreter frame
  0x01ebb901: push   0x5531723c
  0x01ebb906: call   0x01ebb90b
  0x01ebb90b: pusha  
  0x01ebb90c: call   0x54dedbf0
  0x01ebb911: hlt    
  ;; } verify_i2ce 
  0x01ebb912: mov    edi,esp
  0x01ebb914: sub    esp,0x18
  0x01ebb917: and    esp,0xfffffff0
  0x01ebb91a: push   eax
  0x01ebb91b: mov    eax,edi
  0x01ebb91d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebb920: mov    ecx,DWORD PTR [eax+0x1c]
  0x01ebb923: mov    edx,DWORD PTR [eax+0x18]
  0x01ebb926: mov    esi,DWORD PTR [eax+0x14]
  0x01ebb929: mov    DWORD PTR [esp+0xc],esi
  0x01ebb92d: mov    esi,DWORD PTR [eax+0x10]
  0x01ebb930: mov    DWORD PTR [esp+0x10],esi
  0x01ebb934: mov    esi,DWORD PTR [eax+0x8]
  0x01ebb937: mov    DWORD PTR [esp+0x4],esi
  0x01ebb93b: mov    esi,DWORD PTR [eax+0xc]
  0x01ebb93e: mov    DWORD PTR [esp+0x8],esi
  0x01ebb942: mov    esi,DWORD PTR [eax+0x4]
  0x01ebb945: mov    DWORD PTR [esp+0x14],esi
  0x01ebb949: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebb951: mov    eax,DWORD PTR [eax-0xc]
  0x01ebb954: mov    DWORD PTR [eax+0x168],ebx
  0x01ebb95a: mov    eax,ebx
  0x01ebb95c: jmp    edi
  0x01ebb95e: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebb961: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebb964: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebb967: jne    0x01ebb97a
  0x01ebb96d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebb974: je     0x01ebb9b9
  0x01ebb97a: jmp    0x01ea32d0
  0x01ebb97f: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebb986: je     0x01ebb9b9
  0x01ebb98c: mov    eax,DWORD PTR [esp]
  0x01ebb98f: pusha  
  0x01ebb990: pushf  
  0x01ebb991: sub    esp,0x10
  0x01ebb994: movsd  QWORD PTR [esp],xmm0
  0x01ebb999: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebb99f: push   eax
  0x01ebb9a0: push   ebx
  0x01ebb9a1: call   0x552179d0
  0x01ebb9a6: add    esp,0x8
  0x01ebb9a9: movsd  xmm0,QWORD PTR [esp]
  0x01ebb9ae: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebb9b4: add    esp,0x10
  0x01ebb9b7: popf   
  0x01ebb9b8: popa   
  0x01ebb9b9: pop    eax
  0x01ebb9ba: mov    esi,esp
  0x01ebb9bc: sub    esp,0x1c
  0x01ebb9bf: mov    DWORD PTR [esp+0x18],ecx
  0x01ebb9c3: mov    DWORD PTR [esp+0x14],edx
  0x01ebb9c7: mov    edi,DWORD PTR [esp+0x24]
  0x01ebb9cb: mov    DWORD PTR [esp+0x10],edi
  0x01ebb9cf: mov    edi,DWORD PTR [esp+0x28]
  0x01ebb9d3: mov    DWORD PTR [esp+0xc],edi
  0x01ebb9d7: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebb9db: mov    DWORD PTR [esp+0x4],edi
  0x01ebb9df: mov    edi,DWORD PTR [esp+0x20]
  0x01ebb9e3: mov    DWORD PTR [esp+0x8],edi
  0x01ebb9e7: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebb9eb: mov    DWORD PTR [esp],edi
  0x01ebb9ee: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebb9f1: push   eax
  0x01ebb9f2: jmp    ecx

AHE@0x0422bf04: 0xaaaaaaaaaaaa0000 i2c: 0x01ebba70 c2i: 0x01ebbb62 c2iUV: 0x01ebbb41
i2c argument handler #34 for: receiver (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;IILjava/lang/String;[B[B[B)V (399 bytes generated)
c2i argument handler starts at 01EBBB62
  0x01ebba70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebba73: mov    edi,0x1dc2940
  0x01ebba78: cmp    eax,edi
  0x01ebba7a: jbe    0x01ebba8d
  0x01ebba80: mov    edi,0x1ea2940
  0x01ebba85: cmp    eax,edi
  0x01ebba87: jb     0x01ebbad2
  0x01ebba8d: mov    edi,0x1dc0340
  0x01ebba92: cmp    eax,edi
  0x01ebba94: jbe    0x01ebbaa7
  0x01ebba9a: mov    edi,0x1dc2668
  0x01ebba9f: cmp    eax,edi
  0x01ebbaa1: jb     0x01ebbad2
  0x01ebbaa7: mov    edi,0x1ead380
  0x01ebbaac: cmp    eax,edi
  0x01ebbaae: jbe    0x01ebbac1
  0x01ebbab4: mov    edi,0x1eb2970
  0x01ebbab9: cmp    eax,edi
  0x01ebbabb: jb     0x01ebbad2
  ;; i2c adapter must return to an interpreter frame
  0x01ebbac1: push   0x5531723c
  0x01ebbac6: call   0x01ebbacb
  0x01ebbacb: pusha  
  0x01ebbacc: call   0x54dedbf0
  0x01ebbad1: hlt    
  ;; } verify_i2ce 
  0x01ebbad2: mov    edi,esp
  0x01ebbad4: sub    esp,0x28
  0x01ebbad7: and    esp,0xfffffff0
  0x01ebbada: push   eax
  0x01ebbadb: mov    eax,edi
  0x01ebbadd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebbae0: mov    ecx,DWORD PTR [eax+0x30]
  0x01ebbae3: mov    edx,DWORD PTR [eax+0x2c]
  0x01ebbae6: mov    esi,DWORD PTR [eax+0x28]
  0x01ebbae9: mov    DWORD PTR [esp+0x4],esi
  0x01ebbaed: mov    esi,DWORD PTR [eax+0x24]
  0x01ebbaf0: mov    DWORD PTR [esp+0x8],esi
  0x01ebbaf4: mov    esi,DWORD PTR [eax+0x20]
  0x01ebbaf7: mov    DWORD PTR [esp+0xc],esi
  0x01ebbafb: mov    esi,DWORD PTR [eax+0x1c]
  0x01ebbafe: mov    DWORD PTR [esp+0x10],esi
  0x01ebbb02: mov    esi,DWORD PTR [eax+0x18]
  0x01ebbb05: mov    DWORD PTR [esp+0x14],esi
  0x01ebbb09: mov    esi,DWORD PTR [eax+0x14]
  0x01ebbb0c: mov    DWORD PTR [esp+0x18],esi
  0x01ebbb10: mov    esi,DWORD PTR [eax+0x10]
  0x01ebbb13: mov    DWORD PTR [esp+0x1c],esi
  0x01ebbb17: mov    esi,DWORD PTR [eax+0xc]
  0x01ebbb1a: mov    DWORD PTR [esp+0x20],esi
  0x01ebbb1e: mov    esi,DWORD PTR [eax+0x8]
  0x01ebbb21: mov    DWORD PTR [esp+0x24],esi
  0x01ebbb25: mov    esi,DWORD PTR [eax+0x4]
  0x01ebbb28: mov    DWORD PTR [esp+0x28],esi
  0x01ebbb2c: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebbb34: mov    eax,DWORD PTR [eax-0xc]
  0x01ebbb37: mov    DWORD PTR [eax+0x168],ebx
  0x01ebbb3d: mov    eax,ebx
  0x01ebbb3f: jmp    edi
  0x01ebbb41: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebbb44: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebbb47: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebbb4a: jne    0x01ebbb5d
  0x01ebbb50: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebbb57: je     0x01ebbb9c
  0x01ebbb5d: jmp    0x01ea32d0
  0x01ebbb62: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebbb69: je     0x01ebbb9c
  0x01ebbb6f: mov    eax,DWORD PTR [esp]
  0x01ebbb72: pusha  
  0x01ebbb73: pushf  
  0x01ebbb74: sub    esp,0x10
  0x01ebbb77: movsd  QWORD PTR [esp],xmm0
  0x01ebbb7c: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebbb82: push   eax
  0x01ebbb83: push   ebx
  0x01ebbb84: call   0x552179d0
  0x01ebbb89: add    esp,0x8
  0x01ebbb8c: movsd  xmm0,QWORD PTR [esp]
  0x01ebbb91: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebbb97: add    esp,0x10
  0x01ebbb9a: popf   
  0x01ebbb9b: popa   
  0x01ebbb9c: pop    eax
  0x01ebbb9d: mov    esi,esp
  0x01ebbb9f: sub    esp,0x30
  0x01ebbba2: mov    DWORD PTR [esp+0x2c],ecx
  0x01ebbba6: mov    DWORD PTR [esp+0x28],edx
  0x01ebbbaa: mov    edi,DWORD PTR [esp+0x30]
  0x01ebbbae: mov    DWORD PTR [esp+0x24],edi
  0x01ebbbb2: mov    edi,DWORD PTR [esp+0x34]
  0x01ebbbb6: mov    DWORD PTR [esp+0x20],edi
  0x01ebbbba: mov    edi,DWORD PTR [esp+0x38]
  0x01ebbbbe: mov    DWORD PTR [esp+0x1c],edi
  0x01ebbbc2: mov    edi,DWORD PTR [esp+0x3c]
  0x01ebbbc6: mov    DWORD PTR [esp+0x18],edi
  0x01ebbbca: mov    edi,DWORD PTR [esp+0x40]
  0x01ebbbce: mov    DWORD PTR [esp+0x14],edi
  0x01ebbbd2: mov    edi,DWORD PTR [esp+0x44]
  0x01ebbbd6: mov    DWORD PTR [esp+0x10],edi
  0x01ebbbda: mov    edi,DWORD PTR [esp+0x48]
  0x01ebbbde: mov    DWORD PTR [esp+0xc],edi
  0x01ebbbe2: mov    edi,DWORD PTR [esp+0x4c]
  0x01ebbbe6: mov    DWORD PTR [esp+0x8],edi
  0x01ebbbea: mov    edi,DWORD PTR [esp+0x50]
  0x01ebbbee: mov    DWORD PTR [esp+0x4],edi
  0x01ebbbf2: mov    edi,DWORD PTR [esp+0x54]
  0x01ebbbf6: mov    DWORD PTR [esp],edi
  0x01ebbbf9: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebbbfc: push   eax
  0x01ebbbfd: jmp    ecx

AHE@0x0422bf30: 0xaaaaaaaa i2c: 0x01ebbc70 c2i: 0x01ebbd46 c2iUV: 0x01ebbd25
i2c argument handler #35 for: receiver (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;IILjava/lang/String;[B)Ljava/lang/reflect/Field; (339 bytes generated)
c2i argument handler starts at 01EBBD46
  0x01ebbc70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebbc73: mov    edi,0x1dc2940
  0x01ebbc78: cmp    eax,edi
  0x01ebbc7a: jbe    0x01ebbc8d
  0x01ebbc80: mov    edi,0x1ea2940
  0x01ebbc85: cmp    eax,edi
  0x01ebbc87: jb     0x01ebbcd2
  0x01ebbc8d: mov    edi,0x1dc0340
  0x01ebbc92: cmp    eax,edi
  0x01ebbc94: jbe    0x01ebbca7
  0x01ebbc9a: mov    edi,0x1dc2668
  0x01ebbc9f: cmp    eax,edi
  0x01ebbca1: jb     0x01ebbcd2
  0x01ebbca7: mov    edi,0x1ead380
  0x01ebbcac: cmp    eax,edi
  0x01ebbcae: jbe    0x01ebbcc1
  0x01ebbcb4: mov    edi,0x1eb2970
  0x01ebbcb9: cmp    eax,edi
  0x01ebbcbb: jb     0x01ebbcd2
  ;; i2c adapter must return to an interpreter frame
  0x01ebbcc1: push   0x5531723c
  0x01ebbcc6: call   0x01ebbccb
  0x01ebbccb: pusha  
  0x01ebbccc: call   0x54dedbf0
  0x01ebbcd1: hlt    
  ;; } verify_i2ce 
  0x01ebbcd2: mov    edi,esp
  0x01ebbcd4: sub    esp,0x18
  0x01ebbcd7: and    esp,0xfffffff0
  0x01ebbcda: push   eax
  0x01ebbcdb: mov    eax,edi
  0x01ebbcdd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebbce0: mov    ecx,DWORD PTR [eax+0x20]
  0x01ebbce3: mov    edx,DWORD PTR [eax+0x1c]
  0x01ebbce6: mov    esi,DWORD PTR [eax+0x18]
  0x01ebbce9: mov    DWORD PTR [esp+0x4],esi
  0x01ebbced: mov    esi,DWORD PTR [eax+0x14]
  0x01ebbcf0: mov    DWORD PTR [esp+0x8],esi
  0x01ebbcf4: mov    esi,DWORD PTR [eax+0x10]
  0x01ebbcf7: mov    DWORD PTR [esp+0xc],esi
  0x01ebbcfb: mov    esi,DWORD PTR [eax+0xc]
  0x01ebbcfe: mov    DWORD PTR [esp+0x10],esi
  0x01ebbd02: mov    esi,DWORD PTR [eax+0x8]
  0x01ebbd05: mov    DWORD PTR [esp+0x14],esi
  0x01ebbd09: mov    esi,DWORD PTR [eax+0x4]
  0x01ebbd0c: mov    DWORD PTR [esp+0x18],esi
  0x01ebbd10: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebbd18: mov    eax,DWORD PTR [eax-0xc]
  0x01ebbd1b: mov    DWORD PTR [eax+0x168],ebx
  0x01ebbd21: mov    eax,ebx
  0x01ebbd23: jmp    edi
  0x01ebbd25: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebbd28: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebbd2b: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebbd2e: jne    0x01ebbd41
  0x01ebbd34: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebbd3b: je     0x01ebbd80
  0x01ebbd41: jmp    0x01ea32d0
  0x01ebbd46: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebbd4d: je     0x01ebbd80
  0x01ebbd53: mov    eax,DWORD PTR [esp]
  0x01ebbd56: pusha  
  0x01ebbd57: pushf  
  0x01ebbd58: sub    esp,0x10
  0x01ebbd5b: movsd  QWORD PTR [esp],xmm0
  0x01ebbd60: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebbd66: push   eax
  0x01ebbd67: push   ebx
  0x01ebbd68: call   0x552179d0
  0x01ebbd6d: add    esp,0x8
  0x01ebbd70: movsd  xmm0,QWORD PTR [esp]
  0x01ebbd75: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebbd7b: add    esp,0x10
  0x01ebbd7e: popf   
  0x01ebbd7f: popa   
  0x01ebbd80: pop    eax
  0x01ebbd81: mov    esi,esp
  0x01ebbd83: sub    esp,0x20
  0x01ebbd86: mov    DWORD PTR [esp+0x1c],ecx
  0x01ebbd8a: mov    DWORD PTR [esp+0x18],edx
  0x01ebbd8e: mov    edi,DWORD PTR [esp+0x20]
  0x01ebbd92: mov    DWORD PTR [esp+0x14],edi
  0x01ebbd96: mov    edi,DWORD PTR [esp+0x24]
  0x01ebbd9a: mov    DWORD PTR [esp+0x10],edi
  0x01ebbd9e: mov    edi,DWORD PTR [esp+0x28]
  0x01ebbda2: mov    DWORD PTR [esp+0xc],edi
  0x01ebbda6: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebbdaa: mov    DWORD PTR [esp+0x8],edi
  0x01ebbdae: mov    edi,DWORD PTR [esp+0x30]
  0x01ebbdb2: mov    DWORD PTR [esp+0x4],edi
  0x01ebbdb6: mov    edi,DWORD PTR [esp+0x34]
  0x01ebbdba: mov    DWORD PTR [esp],edi
  0x01ebbdbd: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebbdc0: push   eax
  0x01ebbdc1: jmp    ecx

AHE@0x0422bf5c: 0xaa600000 i2c: 0x01ebbe70 c2i: 0x01ebbf1e c2iUV: 0x01ebbefd
i2c argument handler #36 for: receiver (IF)V (257 bytes generated)
c2i argument handler starts at 01EBBF1E
  0x01ebbe70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebbe73: mov    edi,0x1dc2940
  0x01ebbe78: cmp    eax,edi
  0x01ebbe7a: jbe    0x01ebbe8d
  0x01ebbe80: mov    edi,0x1ea2940
  0x01ebbe85: cmp    eax,edi
  0x01ebbe87: jb     0x01ebbed2
  0x01ebbe8d: mov    edi,0x1dc0340
  0x01ebbe92: cmp    eax,edi
  0x01ebbe94: jbe    0x01ebbea7
  0x01ebbe9a: mov    edi,0x1dc2668
  0x01ebbe9f: cmp    eax,edi
  0x01ebbea1: jb     0x01ebbed2
  0x01ebbea7: mov    edi,0x1ead380
  0x01ebbeac: cmp    eax,edi
  0x01ebbeae: jbe    0x01ebbec1
  0x01ebbeb4: mov    edi,0x1eb2970
  0x01ebbeb9: cmp    eax,edi
  0x01ebbebb: jb     0x01ebbed2
  ;; i2c adapter must return to an interpreter frame
  0x01ebbec1: push   0x5531723c
  0x01ebbec6: call   0x01ebbecb
  0x01ebbecb: pusha  
  0x01ebbecc: call   0x54dedbf0
  0x01ebbed1: hlt    
  ;; } verify_i2ce 
  0x01ebbed2: mov    edi,esp
  0x01ebbed4: and    esp,0xfffffff0
  0x01ebbed7: push   eax
  0x01ebbed8: mov    eax,edi
  0x01ebbeda: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebbedd: mov    ecx,DWORD PTR [eax+0xc]
  0x01ebbee0: mov    edx,DWORD PTR [eax+0x8]
  0x01ebbee3: movss  xmm0,DWORD PTR [eax+0x4]
  0x01ebbee8: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebbef0: mov    eax,DWORD PTR [eax-0xc]
  0x01ebbef3: mov    DWORD PTR [eax+0x168],ebx
  0x01ebbef9: mov    eax,ebx
  0x01ebbefb: jmp    edi
  0x01ebbefd: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebbf00: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebbf03: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebbf06: jne    0x01ebbf19
  0x01ebbf0c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebbf13: je     0x01ebbf58
  0x01ebbf19: jmp    0x01ea32d0
  0x01ebbf1e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebbf25: je     0x01ebbf58
  0x01ebbf2b: mov    eax,DWORD PTR [esp]
  0x01ebbf2e: pusha  
  0x01ebbf2f: pushf  
  0x01ebbf30: sub    esp,0x10
  0x01ebbf33: movsd  QWORD PTR [esp],xmm0
  0x01ebbf38: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebbf3e: push   eax
  0x01ebbf3f: push   ebx
  0x01ebbf40: call   0x552179d0
  0x01ebbf45: add    esp,0x8
  0x01ebbf48: movsd  xmm0,QWORD PTR [esp]
  0x01ebbf4d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebbf53: add    esp,0x10
  0x01ebbf56: popf   
  0x01ebbf57: popa   
  0x01ebbf58: pop    eax
  0x01ebbf59: mov    esi,esp
  0x01ebbf5b: sub    esp,0xc
  0x01ebbf5e: mov    DWORD PTR [esp+0x8],ecx
  0x01ebbf62: mov    DWORD PTR [esp+0x4],edx
  0x01ebbf66: movss  DWORD PTR [esp],xmm0
  0x01ebbf6b: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebbf6e: push   eax
  0x01ebbf6f: jmp    ecx

AHE@0x0422bf88: 0x66000000 i2c: 0x01ebbff0 c2i: 0x01ebc09d c2iUV: 0x01ebc07c
i2c argument handler #37 for: static (FF)F (254 bytes generated)
c2i argument handler starts at 01EBC09D
  0x01ebbff0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebbff3: mov    edi,0x1dc2940
  0x01ebbff8: cmp    eax,edi
  0x01ebbffa: jbe    0x01ebc00d
  0x01ebc000: mov    edi,0x1ea2940
  0x01ebc005: cmp    eax,edi
  0x01ebc007: jb     0x01ebc052
  0x01ebc00d: mov    edi,0x1dc0340
  0x01ebc012: cmp    eax,edi
  0x01ebc014: jbe    0x01ebc027
  0x01ebc01a: mov    edi,0x1dc2668
  0x01ebc01f: cmp    eax,edi
  0x01ebc021: jb     0x01ebc052
  0x01ebc027: mov    edi,0x1ead380
  0x01ebc02c: cmp    eax,edi
  0x01ebc02e: jbe    0x01ebc041
  0x01ebc034: mov    edi,0x1eb2970
  0x01ebc039: cmp    eax,edi
  0x01ebc03b: jb     0x01ebc052
  ;; i2c adapter must return to an interpreter frame
  0x01ebc041: push   0x5531723c
  0x01ebc046: call   0x01ebc04b
  0x01ebc04b: pusha  
  0x01ebc04c: call   0x54dedbf0
  0x01ebc051: hlt    
  ;; } verify_i2ce 
  0x01ebc052: mov    edi,esp
  0x01ebc054: and    esp,0xfffffff0
  0x01ebc057: push   eax
  0x01ebc058: mov    eax,edi
  0x01ebc05a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc05d: movss  xmm0,DWORD PTR [eax+0x8]
  0x01ebc062: movss  xmm1,DWORD PTR [eax+0x4]
  0x01ebc067: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc06f: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc072: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc078: mov    eax,ebx
  0x01ebc07a: jmp    edi
  0x01ebc07c: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc07f: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc082: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc085: jne    0x01ebc098
  0x01ebc08b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc092: je     0x01ebc0d7
  0x01ebc098: jmp    0x01ea32d0
  0x01ebc09d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc0a4: je     0x01ebc0d7
  0x01ebc0aa: mov    eax,DWORD PTR [esp]
  0x01ebc0ad: pusha  
  0x01ebc0ae: pushf  
  0x01ebc0af: sub    esp,0x10
  0x01ebc0b2: movsd  QWORD PTR [esp],xmm0
  0x01ebc0b7: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc0bd: push   eax
  0x01ebc0be: push   ebx
  0x01ebc0bf: call   0x552179d0
  0x01ebc0c4: add    esp,0x8
  0x01ebc0c7: movsd  xmm0,QWORD PTR [esp]
  0x01ebc0cc: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebc0d2: add    esp,0x10
  0x01ebc0d5: popf   
  0x01ebc0d6: popa   
  0x01ebc0d7: pop    eax
  0x01ebc0d8: mov    esi,esp
  0x01ebc0da: sub    esp,0x8
  0x01ebc0dd: movss  DWORD PTR [esp+0x4],xmm0
  0x01ebc0e3: movss  DWORD PTR [esp],xmm1
  0x01ebc0e8: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebc0eb: push   eax
  0x01ebc0ec: jmp    ecx

AHE@0x0422bfb4: 0xa6000000 i2c: 0x01ebc170 c2i: 0x01ebc21b c2iUV: 0x01ebc1fa
i2c argument handler #38 for: receiver (F)V (250 bytes generated)
c2i argument handler starts at 01EBC21B
  0x01ebc170: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebc173: mov    edi,0x1dc2940
  0x01ebc178: cmp    eax,edi
  0x01ebc17a: jbe    0x01ebc18d
  0x01ebc180: mov    edi,0x1ea2940
  0x01ebc185: cmp    eax,edi
  0x01ebc187: jb     0x01ebc1d2
  0x01ebc18d: mov    edi,0x1dc0340
  0x01ebc192: cmp    eax,edi
  0x01ebc194: jbe    0x01ebc1a7
  0x01ebc19a: mov    edi,0x1dc2668
  0x01ebc19f: cmp    eax,edi
  0x01ebc1a1: jb     0x01ebc1d2
  0x01ebc1a7: mov    edi,0x1ead380
  0x01ebc1ac: cmp    eax,edi
  0x01ebc1ae: jbe    0x01ebc1c1
  0x01ebc1b4: mov    edi,0x1eb2970
  0x01ebc1b9: cmp    eax,edi
  0x01ebc1bb: jb     0x01ebc1d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebc1c1: push   0x5531723c
  0x01ebc1c6: call   0x01ebc1cb
  0x01ebc1cb: pusha  
  0x01ebc1cc: call   0x54dedbf0
  0x01ebc1d1: hlt    
  ;; } verify_i2ce 
  0x01ebc1d2: mov    edi,esp
  0x01ebc1d4: and    esp,0xfffffff0
  0x01ebc1d7: push   eax
  0x01ebc1d8: mov    eax,edi
  0x01ebc1da: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc1dd: mov    ecx,DWORD PTR [eax+0x8]
  0x01ebc1e0: movss  xmm0,DWORD PTR [eax+0x4]
  0x01ebc1e5: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc1ed: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc1f0: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc1f6: mov    eax,ebx
  0x01ebc1f8: jmp    edi
  0x01ebc1fa: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc1fd: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc200: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc203: jne    0x01ebc216
  0x01ebc209: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc210: je     0x01ebc255
  0x01ebc216: jmp    0x01ea32d0
  0x01ebc21b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc222: je     0x01ebc255
  0x01ebc228: mov    eax,DWORD PTR [esp]
  0x01ebc22b: pusha  
  0x01ebc22c: pushf  
  0x01ebc22d: sub    esp,0x10
  0x01ebc230: movsd  QWORD PTR [esp],xmm0
  0x01ebc235: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc23b: push   eax
  0x01ebc23c: push   ebx
  0x01ebc23d: call   0x552179d0
  0x01ebc242: add    esp,0x8
  0x01ebc245: movsd  xmm0,QWORD PTR [esp]
  0x01ebc24a: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebc250: add    esp,0x10
  0x01ebc253: popf   
  0x01ebc254: popa   
  0x01ebc255: pop    eax
  0x01ebc256: mov    esi,esp
  0x01ebc258: sub    esp,0x8
  0x01ebc25b: mov    DWORD PTR [esp+0x4],ecx
  0x01ebc25f: movss  DWORD PTR [esp],xmm0
  0x01ebc264: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebc267: push   eax
  0x01ebc268: jmp    ecx

AHE@0x0422bfe0: 0xa7e00000 i2c: 0x01ebc2f0 c2i: 0x01ebc39b c2iUV: 0x01ebc37a
i2c argument handler #39 for: receiver (D)V (250 bytes generated)
c2i argument handler starts at 01EBC39B
  0x01ebc2f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebc2f3: mov    edi,0x1dc2940
  0x01ebc2f8: cmp    eax,edi
  0x01ebc2fa: jbe    0x01ebc30d
  0x01ebc300: mov    edi,0x1ea2940
  0x01ebc305: cmp    eax,edi
  0x01ebc307: jb     0x01ebc352
  0x01ebc30d: mov    edi,0x1dc0340
  0x01ebc312: cmp    eax,edi
  0x01ebc314: jbe    0x01ebc327
  0x01ebc31a: mov    edi,0x1dc2668
  0x01ebc31f: cmp    eax,edi
  0x01ebc321: jb     0x01ebc352
  0x01ebc327: mov    edi,0x1ead380
  0x01ebc32c: cmp    eax,edi
  0x01ebc32e: jbe    0x01ebc341
  0x01ebc334: mov    edi,0x1eb2970
  0x01ebc339: cmp    eax,edi
  0x01ebc33b: jb     0x01ebc352
  ;; i2c adapter must return to an interpreter frame
  0x01ebc341: push   0x5531723c
  0x01ebc346: call   0x01ebc34b
  0x01ebc34b: pusha  
  0x01ebc34c: call   0x54dedbf0
  0x01ebc351: hlt    
  ;; } verify_i2ce 
  0x01ebc352: mov    edi,esp
  0x01ebc354: and    esp,0xfffffff0
  0x01ebc357: push   eax
  0x01ebc358: mov    eax,edi
  0x01ebc35a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc35d: mov    ecx,DWORD PTR [eax+0xc]
  0x01ebc360: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01ebc365: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc36d: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc370: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc376: mov    eax,ebx
  0x01ebc378: jmp    edi
  0x01ebc37a: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc37d: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc380: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc383: jne    0x01ebc396
  0x01ebc389: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc390: je     0x01ebc3d5
  0x01ebc396: jmp    0x01ea32d0
  0x01ebc39b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc3a2: je     0x01ebc3d5
  0x01ebc3a8: mov    eax,DWORD PTR [esp]
  0x01ebc3ab: pusha  
  0x01ebc3ac: pushf  
  0x01ebc3ad: sub    esp,0x10
  0x01ebc3b0: movsd  QWORD PTR [esp],xmm0
  0x01ebc3b5: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc3bb: push   eax
  0x01ebc3bc: push   ebx
  0x01ebc3bd: call   0x552179d0
  0x01ebc3c2: add    esp,0x8
  0x01ebc3c5: movsd  xmm0,QWORD PTR [esp]
  0x01ebc3ca: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebc3d0: add    esp,0x10
  0x01ebc3d3: popf   
  0x01ebc3d4: popa   
  0x01ebc3d5: pop    eax
  0x01ebc3d6: mov    esi,esp
  0x01ebc3d8: sub    esp,0xc
  0x01ebc3db: mov    DWORD PTR [esp+0x8],ecx
  0x01ebc3df: movsd  QWORD PTR [esp],xmm0
  0x01ebc3e4: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebc3e7: push   eax
  0x01ebc3e8: jmp    ecx

AHE@0x0422c00c: 0x7e7e0000 i2c: 0x01ebc470 c2i: 0x01ebc51d c2iUV: 0x01ebc4fc
i2c argument handler #40 for: static (DD)D (254 bytes generated)
c2i argument handler starts at 01EBC51D
  0x01ebc470: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebc473: mov    edi,0x1dc2940
  0x01ebc478: cmp    eax,edi
  0x01ebc47a: jbe    0x01ebc48d
  0x01ebc480: mov    edi,0x1ea2940
  0x01ebc485: cmp    eax,edi
  0x01ebc487: jb     0x01ebc4d2
  0x01ebc48d: mov    edi,0x1dc0340
  0x01ebc492: cmp    eax,edi
  0x01ebc494: jbe    0x01ebc4a7
  0x01ebc49a: mov    edi,0x1dc2668
  0x01ebc49f: cmp    eax,edi
  0x01ebc4a1: jb     0x01ebc4d2
  0x01ebc4a7: mov    edi,0x1ead380
  0x01ebc4ac: cmp    eax,edi
  0x01ebc4ae: jbe    0x01ebc4c1
  0x01ebc4b4: mov    edi,0x1eb2970
  0x01ebc4b9: cmp    eax,edi
  0x01ebc4bb: jb     0x01ebc4d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebc4c1: push   0x5531723c
  0x01ebc4c6: call   0x01ebc4cb
  0x01ebc4cb: pusha  
  0x01ebc4cc: call   0x54dedbf0
  0x01ebc4d1: hlt    
  ;; } verify_i2ce 
  0x01ebc4d2: mov    edi,esp
  0x01ebc4d4: and    esp,0xfffffff0
  0x01ebc4d7: push   eax
  0x01ebc4d8: mov    eax,edi
  0x01ebc4da: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc4dd: movsd  xmm0,QWORD PTR [eax+0xc]
  0x01ebc4e2: movsd  xmm1,QWORD PTR [eax+0x4]
  0x01ebc4e7: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc4ef: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc4f2: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc4f8: mov    eax,ebx
  0x01ebc4fa: jmp    edi
  0x01ebc4fc: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc4ff: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc502: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc505: jne    0x01ebc518
  0x01ebc50b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc512: je     0x01ebc557
  0x01ebc518: jmp    0x01ea32d0
  0x01ebc51d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc524: je     0x01ebc557
  0x01ebc52a: mov    eax,DWORD PTR [esp]
  0x01ebc52d: pusha  
  0x01ebc52e: pushf  
  0x01ebc52f: sub    esp,0x10
  0x01ebc532: movsd  QWORD PTR [esp],xmm0
  0x01ebc537: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc53d: push   eax
  0x01ebc53e: push   ebx
  0x01ebc53f: call   0x552179d0
  0x01ebc544: add    esp,0x8
  0x01ebc547: movsd  xmm0,QWORD PTR [esp]
  0x01ebc54c: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebc552: add    esp,0x10
  0x01ebc555: popf   
  0x01ebc556: popa   
  0x01ebc557: pop    eax
  0x01ebc558: mov    esi,esp
  0x01ebc55a: sub    esp,0x10
  0x01ebc55d: movsd  QWORD PTR [esp+0x8],xmm0
  0x01ebc563: movsd  QWORD PTR [esp],xmm1
  0x01ebc568: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebc56b: push   eax
  0x01ebc56c: jmp    ecx

AHE@0x0422c038: 0x67e00000 i2c: 0x01ebc5f0 c2i: 0x01ebc69d c2iUV: 0x01ebc67c
i2c argument handler #41 for: static (FD)F (254 bytes generated)
c2i argument handler starts at 01EBC69D
  0x01ebc5f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebc5f3: mov    edi,0x1dc2940
  0x01ebc5f8: cmp    eax,edi
  0x01ebc5fa: jbe    0x01ebc60d
  0x01ebc600: mov    edi,0x1ea2940
  0x01ebc605: cmp    eax,edi
  0x01ebc607: jb     0x01ebc652
  0x01ebc60d: mov    edi,0x1dc0340
  0x01ebc612: cmp    eax,edi
  0x01ebc614: jbe    0x01ebc627
  0x01ebc61a: mov    edi,0x1dc2668
  0x01ebc61f: cmp    eax,edi
  0x01ebc621: jb     0x01ebc652
  0x01ebc627: mov    edi,0x1ead380
  0x01ebc62c: cmp    eax,edi
  0x01ebc62e: jbe    0x01ebc641
  0x01ebc634: mov    edi,0x1eb2970
  0x01ebc639: cmp    eax,edi
  0x01ebc63b: jb     0x01ebc652
  ;; i2c adapter must return to an interpreter frame
  0x01ebc641: push   0x5531723c
  0x01ebc646: call   0x01ebc64b
  0x01ebc64b: pusha  
  0x01ebc64c: call   0x54dedbf0
  0x01ebc651: hlt    
  ;; } verify_i2ce 
  0x01ebc652: mov    edi,esp
  0x01ebc654: and    esp,0xfffffff0
  0x01ebc657: push   eax
  0x01ebc658: mov    eax,edi
  0x01ebc65a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc65d: movss  xmm1,DWORD PTR [eax+0xc]
  0x01ebc662: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01ebc667: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc66f: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc672: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc678: mov    eax,ebx
  0x01ebc67a: jmp    edi
  0x01ebc67c: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc67f: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc682: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc685: jne    0x01ebc698
  0x01ebc68b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc692: je     0x01ebc6d7
  0x01ebc698: jmp    0x01ea32d0
  0x01ebc69d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc6a4: je     0x01ebc6d7
  0x01ebc6aa: mov    eax,DWORD PTR [esp]
  0x01ebc6ad: pusha  
  0x01ebc6ae: pushf  
  0x01ebc6af: sub    esp,0x10
  0x01ebc6b2: movsd  QWORD PTR [esp],xmm0
  0x01ebc6b7: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc6bd: push   eax
  0x01ebc6be: push   ebx
  0x01ebc6bf: call   0x552179d0
  0x01ebc6c4: add    esp,0x8
  0x01ebc6c7: movsd  xmm0,QWORD PTR [esp]
  0x01ebc6cc: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebc6d2: add    esp,0x10
  0x01ebc6d5: popf   
  0x01ebc6d6: popa   
  0x01ebc6d7: pop    eax
  0x01ebc6d8: mov    esi,esp
  0x01ebc6da: sub    esp,0xc
  0x01ebc6dd: movss  DWORD PTR [esp+0x8],xmm1
  0x01ebc6e3: movsd  QWORD PTR [esp],xmm0
  0x01ebc6e8: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebc6eb: push   eax
  0x01ebc6ec: jmp    ecx

AHE@0x0422c064: 0xbebe0000 i2c: 0x01ebc770 c2i: 0x01ebc832 c2iUV: 0x01ebc811
i2c argument handler #42 for: static (JJ)J (295 bytes generated)
c2i argument handler starts at 01EBC832
  0x01ebc770: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebc773: mov    edi,0x1dc2940
  0x01ebc778: cmp    eax,edi
  0x01ebc77a: jbe    0x01ebc78d
  0x01ebc780: mov    edi,0x1ea2940
  0x01ebc785: cmp    eax,edi
  0x01ebc787: jb     0x01ebc7d2
  0x01ebc78d: mov    edi,0x1dc0340
  0x01ebc792: cmp    eax,edi
  0x01ebc794: jbe    0x01ebc7a7
  0x01ebc79a: mov    edi,0x1dc2668
  0x01ebc79f: cmp    eax,edi
  0x01ebc7a1: jb     0x01ebc7d2
  0x01ebc7a7: mov    edi,0x1ead380
  0x01ebc7ac: cmp    eax,edi
  0x01ebc7ae: jbe    0x01ebc7c1
  0x01ebc7b4: mov    edi,0x1eb2970
  0x01ebc7b9: cmp    eax,edi
  0x01ebc7bb: jb     0x01ebc7d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebc7c1: push   0x5531723c
  0x01ebc7c6: call   0x01ebc7cb
  0x01ebc7cb: pusha  
  0x01ebc7cc: call   0x54dedbf0
  0x01ebc7d1: hlt    
  ;; } verify_i2ce 
  0x01ebc7d2: mov    edi,esp
  0x01ebc7d4: sub    esp,0x10
  0x01ebc7d7: and    esp,0xfffffff0
  0x01ebc7da: push   eax
  0x01ebc7db: mov    eax,edi
  0x01ebc7dd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc7e0: mov    esi,DWORD PTR [eax+0xc]
  0x01ebc7e3: mov    DWORD PTR [esp+0x4],esi
  0x01ebc7e7: mov    esi,DWORD PTR [eax+0x10]
  0x01ebc7ea: mov    DWORD PTR [esp+0x8],esi
  0x01ebc7ee: mov    esi,DWORD PTR [eax+0x4]
  0x01ebc7f1: mov    DWORD PTR [esp+0xc],esi
  0x01ebc7f5: mov    esi,DWORD PTR [eax+0x8]
  0x01ebc7f8: mov    DWORD PTR [esp+0x10],esi
  0x01ebc7fc: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc804: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc807: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc80d: mov    eax,ebx
  0x01ebc80f: jmp    edi
  0x01ebc811: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc814: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc817: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc81a: jne    0x01ebc82d
  0x01ebc820: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc827: je     0x01ebc86c
  0x01ebc82d: jmp    0x01ea32d0
  0x01ebc832: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc839: je     0x01ebc86c
  0x01ebc83f: mov    eax,DWORD PTR [esp]
  0x01ebc842: pusha  
  0x01ebc843: pushf  
  0x01ebc844: sub    esp,0x10
  0x01ebc847: movsd  QWORD PTR [esp],xmm0
  0x01ebc84c: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc852: push   eax
  0x01ebc853: push   ebx
  0x01ebc854: call   0x552179d0
  0x01ebc859: add    esp,0x8
  0x01ebc85c: movsd  xmm0,QWORD PTR [esp]
  0x01ebc861: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebc867: add    esp,0x10
  0x01ebc86a: popf   
  0x01ebc86b: popa   
  0x01ebc86c: pop    eax
  0x01ebc86d: mov    esi,esp
  0x01ebc86f: sub    esp,0x10
  0x01ebc872: mov    edi,DWORD PTR [esp+0x10]
  0x01ebc876: mov    DWORD PTR [esp+0x8],edi
  0x01ebc87a: mov    edi,DWORD PTR [esp+0x14]
  0x01ebc87e: mov    DWORD PTR [esp+0xc],edi
  0x01ebc882: mov    edi,DWORD PTR [esp+0x18]
  0x01ebc886: mov    DWORD PTR [esp],edi
  0x01ebc889: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebc88d: mov    DWORD PTR [esp+0x4],edi
  0x01ebc891: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebc894: push   eax
  0x01ebc895: jmp    ecx

AHE@0x0422c090: 0x6a000000 i2c: 0x01ebc930 c2i: 0x01ebc9db c2iUV: 0x01ebc9ba
i2c argument handler #43 for: static (FI)F (250 bytes generated)
c2i argument handler starts at 01EBC9DB
  0x01ebc930: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebc933: mov    edi,0x1dc2940
  0x01ebc938: cmp    eax,edi
  0x01ebc93a: jbe    0x01ebc94d
  0x01ebc940: mov    edi,0x1ea2940
  0x01ebc945: cmp    eax,edi
  0x01ebc947: jb     0x01ebc992
  0x01ebc94d: mov    edi,0x1dc0340
  0x01ebc952: cmp    eax,edi
  0x01ebc954: jbe    0x01ebc967
  0x01ebc95a: mov    edi,0x1dc2668
  0x01ebc95f: cmp    eax,edi
  0x01ebc961: jb     0x01ebc992
  0x01ebc967: mov    edi,0x1ead380
  0x01ebc96c: cmp    eax,edi
  0x01ebc96e: jbe    0x01ebc981
  0x01ebc974: mov    edi,0x1eb2970
  0x01ebc979: cmp    eax,edi
  0x01ebc97b: jb     0x01ebc992
  ;; i2c adapter must return to an interpreter frame
  0x01ebc981: push   0x5531723c
  0x01ebc986: call   0x01ebc98b
  0x01ebc98b: pusha  
  0x01ebc98c: call   0x54dedbf0
  0x01ebc991: hlt    
  ;; } verify_i2ce 
  0x01ebc992: mov    edi,esp
  0x01ebc994: and    esp,0xfffffff0
  0x01ebc997: push   eax
  0x01ebc998: mov    eax,edi
  0x01ebc99a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebc99d: movss  xmm0,DWORD PTR [eax+0x8]
  0x01ebc9a2: mov    ecx,DWORD PTR [eax+0x4]
  0x01ebc9a5: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebc9ad: mov    eax,DWORD PTR [eax-0xc]
  0x01ebc9b0: mov    DWORD PTR [eax+0x168],ebx
  0x01ebc9b6: mov    eax,ebx
  0x01ebc9b8: jmp    edi
  0x01ebc9ba: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebc9bd: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebc9c0: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebc9c3: jne    0x01ebc9d6
  0x01ebc9c9: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc9d0: je     0x01ebca15
  0x01ebc9d6: jmp    0x01ea32d0
  0x01ebc9db: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebc9e2: je     0x01ebca15
  0x01ebc9e8: mov    eax,DWORD PTR [esp]
  0x01ebc9eb: pusha  
  0x01ebc9ec: pushf  
  0x01ebc9ed: sub    esp,0x10
  0x01ebc9f0: movsd  QWORD PTR [esp],xmm0
  0x01ebc9f5: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebc9fb: push   eax
  0x01ebc9fc: push   ebx
  0x01ebc9fd: call   0x552179d0
  0x01ebca02: add    esp,0x8
  0x01ebca05: movsd  xmm0,QWORD PTR [esp]
  0x01ebca0a: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebca10: add    esp,0x10
  0x01ebca13: popf   
  0x01ebca14: popa   
  0x01ebca15: pop    eax
  0x01ebca16: mov    esi,esp
  0x01ebca18: sub    esp,0x8
  0x01ebca1b: movss  DWORD PTR [esp+0x4],xmm0
  0x01ebca21: mov    DWORD PTR [esp],ecx
  0x01ebca24: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebca27: push   eax
  0x01ebca28: jmp    ecx

AHE@0x0422c0bc: 0x7ea00000 i2c: 0x01ebcab0 c2i: 0x01ebcb5b c2iUV: 0x01ebcb3a
i2c argument handler #44 for: static (DI)D (250 bytes generated)
c2i argument handler starts at 01EBCB5B
  0x01ebcab0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebcab3: mov    edi,0x1dc2940
  0x01ebcab8: cmp    eax,edi
  0x01ebcaba: jbe    0x01ebcacd
  0x01ebcac0: mov    edi,0x1ea2940
  0x01ebcac5: cmp    eax,edi
  0x01ebcac7: jb     0x01ebcb12
  0x01ebcacd: mov    edi,0x1dc0340
  0x01ebcad2: cmp    eax,edi
  0x01ebcad4: jbe    0x01ebcae7
  0x01ebcada: mov    edi,0x1dc2668
  0x01ebcadf: cmp    eax,edi
  0x01ebcae1: jb     0x01ebcb12
  0x01ebcae7: mov    edi,0x1ead380
  0x01ebcaec: cmp    eax,edi
  0x01ebcaee: jbe    0x01ebcb01
  0x01ebcaf4: mov    edi,0x1eb2970
  0x01ebcaf9: cmp    eax,edi
  0x01ebcafb: jb     0x01ebcb12
  ;; i2c adapter must return to an interpreter frame
  0x01ebcb01: push   0x5531723c
  0x01ebcb06: call   0x01ebcb0b
  0x01ebcb0b: pusha  
  0x01ebcb0c: call   0x54dedbf0
  0x01ebcb11: hlt    
  ;; } verify_i2ce 
  0x01ebcb12: mov    edi,esp
  0x01ebcb14: and    esp,0xfffffff0
  0x01ebcb17: push   eax
  0x01ebcb18: mov    eax,edi
  0x01ebcb1a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebcb1d: movsd  xmm0,QWORD PTR [eax+0x8]
  0x01ebcb22: mov    ecx,DWORD PTR [eax+0x4]
  0x01ebcb25: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebcb2d: mov    eax,DWORD PTR [eax-0xc]
  0x01ebcb30: mov    DWORD PTR [eax+0x168],ebx
  0x01ebcb36: mov    eax,ebx
  0x01ebcb38: jmp    edi
  0x01ebcb3a: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebcb3d: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebcb40: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebcb43: jne    0x01ebcb56
  0x01ebcb49: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebcb50: je     0x01ebcb95
  0x01ebcb56: jmp    0x01ea32d0
  0x01ebcb5b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebcb62: je     0x01ebcb95
  0x01ebcb68: mov    eax,DWORD PTR [esp]
  0x01ebcb6b: pusha  
  0x01ebcb6c: pushf  
  0x01ebcb6d: sub    esp,0x10
  0x01ebcb70: movsd  QWORD PTR [esp],xmm0
  0x01ebcb75: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebcb7b: push   eax
  0x01ebcb7c: push   ebx
  0x01ebcb7d: call   0x552179d0
  0x01ebcb82: add    esp,0x8
  0x01ebcb85: movsd  xmm0,QWORD PTR [esp]
  0x01ebcb8a: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebcb90: add    esp,0x10
  0x01ebcb93: popf   
  0x01ebcb94: popa   
  0x01ebcb95: pop    eax
  0x01ebcb96: mov    esi,esp
  0x01ebcb98: sub    esp,0xc
  0x01ebcb9b: movsd  QWORD PTR [esp+0x4],xmm0
  0x01ebcba1: mov    DWORD PTR [esp],ecx
  0x01ebcba4: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebcba7: push   eax
  0x01ebcba8: jmp    ecx

AHE@0x0422c0e8: 0xaa7e0000 i2c: 0x01ebcc30 c2i: 0x01ebccde c2iUV: 0x01ebccbd
i2c argument handler #45 for: receiver (Ljava/lang/Object;D)V (257 bytes generated)
c2i argument handler starts at 01EBCCDE
  0x01ebcc30: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebcc33: mov    edi,0x1dc2940
  0x01ebcc38: cmp    eax,edi
  0x01ebcc3a: jbe    0x01ebcc4d
  0x01ebcc40: mov    edi,0x1ea2940
  0x01ebcc45: cmp    eax,edi
  0x01ebcc47: jb     0x01ebcc92
  0x01ebcc4d: mov    edi,0x1dc0340
  0x01ebcc52: cmp    eax,edi
  0x01ebcc54: jbe    0x01ebcc67
  0x01ebcc5a: mov    edi,0x1dc2668
  0x01ebcc5f: cmp    eax,edi
  0x01ebcc61: jb     0x01ebcc92
  0x01ebcc67: mov    edi,0x1ead380
  0x01ebcc6c: cmp    eax,edi
  0x01ebcc6e: jbe    0x01ebcc81
  0x01ebcc74: mov    edi,0x1eb2970
  0x01ebcc79: cmp    eax,edi
  0x01ebcc7b: jb     0x01ebcc92
  ;; i2c adapter must return to an interpreter frame
  0x01ebcc81: push   0x5531723c
  0x01ebcc86: call   0x01ebcc8b
  0x01ebcc8b: pusha  
  0x01ebcc8c: call   0x54dedbf0
  0x01ebcc91: hlt    
  ;; } verify_i2ce 
  0x01ebcc92: mov    edi,esp
  0x01ebcc94: and    esp,0xfffffff0
  0x01ebcc97: push   eax
  0x01ebcc98: mov    eax,edi
  0x01ebcc9a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebcc9d: mov    ecx,DWORD PTR [eax+0x10]
  0x01ebcca0: mov    edx,DWORD PTR [eax+0xc]
  0x01ebcca3: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01ebcca8: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebccb0: mov    eax,DWORD PTR [eax-0xc]
  0x01ebccb3: mov    DWORD PTR [eax+0x168],ebx
  0x01ebccb9: mov    eax,ebx
  0x01ebccbb: jmp    edi
  0x01ebccbd: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebccc0: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebccc3: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebccc6: jne    0x01ebccd9
  0x01ebcccc: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebccd3: je     0x01ebcd18
  0x01ebccd9: jmp    0x01ea32d0
  0x01ebccde: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebcce5: je     0x01ebcd18
  0x01ebcceb: mov    eax,DWORD PTR [esp]
  0x01ebccee: pusha  
  0x01ebccef: pushf  
  0x01ebccf0: sub    esp,0x10
  0x01ebccf3: movsd  QWORD PTR [esp],xmm0
  0x01ebccf8: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebccfe: push   eax
  0x01ebccff: push   ebx
  0x01ebcd00: call   0x552179d0
  0x01ebcd05: add    esp,0x8
  0x01ebcd08: movsd  xmm0,QWORD PTR [esp]
  0x01ebcd0d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebcd13: add    esp,0x10
  0x01ebcd16: popf   
  0x01ebcd17: popa   
  0x01ebcd18: pop    eax
  0x01ebcd19: mov    esi,esp
  0x01ebcd1b: sub    esp,0x10
  0x01ebcd1e: mov    DWORD PTR [esp+0xc],ecx
  0x01ebcd22: mov    DWORD PTR [esp+0x8],edx
  0x01ebcd26: movsd  QWORD PTR [esp],xmm0
  0x01ebcd2b: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebcd2e: push   eax
  0x01ebcd2f: jmp    ecx

AHE@0x0422c114: 0xaa660000 i2c: 0x01ebcdb0 c2i: 0x01ebce63 c2iUV: 0x01ebce42
i2c argument handler #46 for: receiver (Ljava/nio/charset/Charset;FF)V (268 bytes generated)
c2i argument handler starts at 01EBCE63
  0x01ebcdb0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebcdb3: mov    edi,0x1dc2940
  0x01ebcdb8: cmp    eax,edi
  0x01ebcdba: jbe    0x01ebcdcd
  0x01ebcdc0: mov    edi,0x1ea2940
  0x01ebcdc5: cmp    eax,edi
  0x01ebcdc7: jb     0x01ebce12
  0x01ebcdcd: mov    edi,0x1dc0340
  0x01ebcdd2: cmp    eax,edi
  0x01ebcdd4: jbe    0x01ebcde7
  0x01ebcdda: mov    edi,0x1dc2668
  0x01ebcddf: cmp    eax,edi
  0x01ebcde1: jb     0x01ebce12
  0x01ebcde7: mov    edi,0x1ead380
  0x01ebcdec: cmp    eax,edi
  0x01ebcdee: jbe    0x01ebce01
  0x01ebcdf4: mov    edi,0x1eb2970
  0x01ebcdf9: cmp    eax,edi
  0x01ebcdfb: jb     0x01ebce12
  ;; i2c adapter must return to an interpreter frame
  0x01ebce01: push   0x5531723c
  0x01ebce06: call   0x01ebce0b
  0x01ebce0b: pusha  
  0x01ebce0c: call   0x54dedbf0
  0x01ebce11: hlt    
  ;; } verify_i2ce 
  0x01ebce12: mov    edi,esp
  0x01ebce14: and    esp,0xfffffff0
  0x01ebce17: push   eax
  0x01ebce18: mov    eax,edi
  0x01ebce1a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebce1d: mov    ecx,DWORD PTR [eax+0x10]
  0x01ebce20: mov    edx,DWORD PTR [eax+0xc]
  0x01ebce23: movss  xmm0,DWORD PTR [eax+0x8]
  0x01ebce28: movss  xmm1,DWORD PTR [eax+0x4]
  0x01ebce2d: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebce35: mov    eax,DWORD PTR [eax-0xc]
  0x01ebce38: mov    DWORD PTR [eax+0x168],ebx
  0x01ebce3e: mov    eax,ebx
  0x01ebce40: jmp    edi
  0x01ebce42: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebce45: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebce48: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebce4b: jne    0x01ebce5e
  0x01ebce51: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebce58: je     0x01ebce9d
  0x01ebce5e: jmp    0x01ea32d0
  0x01ebce63: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebce6a: je     0x01ebce9d
  0x01ebce70: mov    eax,DWORD PTR [esp]
  0x01ebce73: pusha  
  0x01ebce74: pushf  
  0x01ebce75: sub    esp,0x10
  0x01ebce78: movsd  QWORD PTR [esp],xmm0
  0x01ebce7d: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebce83: push   eax
  0x01ebce84: push   ebx
  0x01ebce85: call   0x552179d0
  0x01ebce8a: add    esp,0x8
  0x01ebce8d: movsd  xmm0,QWORD PTR [esp]
  0x01ebce92: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebce98: add    esp,0x10
  0x01ebce9b: popf   
  0x01ebce9c: popa   
  0x01ebce9d: pop    eax
  0x01ebce9e: mov    esi,esp
  0x01ebcea0: sub    esp,0x10
  0x01ebcea3: mov    DWORD PTR [esp+0xc],ecx
  0x01ebcea7: mov    DWORD PTR [esp+0x8],edx
  0x01ebceab: movss  DWORD PTR [esp+0x4],xmm0
  0x01ebceb1: movss  DWORD PTR [esp],xmm1
  0x01ebceb6: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebceb9: push   eax
  0x01ebceba: jmp    ecx

AHE@0x0422c140: 0xaa66a000 i2c: 0x01ebcf30 c2i: 0x01ebcfed c2iUV: 0x01ebcfcc
i2c argument handler #47 for: receiver (Ljava/nio/charset/Charset;FFLjava/lang/String;)V (286 bytes generated)
c2i argument handler starts at 01EBCFED
  0x01ebcf30: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebcf33: mov    edi,0x1dc2940
  0x01ebcf38: cmp    eax,edi
  0x01ebcf3a: jbe    0x01ebcf4d
  0x01ebcf40: mov    edi,0x1ea2940
  0x01ebcf45: cmp    eax,edi
  0x01ebcf47: jb     0x01ebcf92
  0x01ebcf4d: mov    edi,0x1dc0340
  0x01ebcf52: cmp    eax,edi
  0x01ebcf54: jbe    0x01ebcf67
  0x01ebcf5a: mov    edi,0x1dc2668
  0x01ebcf5f: cmp    eax,edi
  0x01ebcf61: jb     0x01ebcf92
  0x01ebcf67: mov    edi,0x1ead380
  0x01ebcf6c: cmp    eax,edi
  0x01ebcf6e: jbe    0x01ebcf81
  0x01ebcf74: mov    edi,0x1eb2970
  0x01ebcf79: cmp    eax,edi
  0x01ebcf7b: jb     0x01ebcf92
  ;; i2c adapter must return to an interpreter frame
  0x01ebcf81: push   0x5531723c
  0x01ebcf86: call   0x01ebcf8b
  0x01ebcf8b: pusha  
  0x01ebcf8c: call   0x54dedbf0
  0x01ebcf91: hlt    
  ;; } verify_i2ce 
  0x01ebcf92: mov    edi,esp
  0x01ebcf94: sub    esp,0x8
  0x01ebcf97: and    esp,0xfffffff0
  0x01ebcf9a: push   eax
  0x01ebcf9b: mov    eax,edi
  0x01ebcf9d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebcfa0: mov    ecx,DWORD PTR [eax+0x14]
  0x01ebcfa3: mov    edx,DWORD PTR [eax+0x10]
  0x01ebcfa6: movss  xmm0,DWORD PTR [eax+0xc]
  0x01ebcfab: movss  xmm1,DWORD PTR [eax+0x8]
  0x01ebcfb0: mov    esi,DWORD PTR [eax+0x4]
  0x01ebcfb3: mov    DWORD PTR [esp+0x4],esi
  0x01ebcfb7: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebcfbf: mov    eax,DWORD PTR [eax-0xc]
  0x01ebcfc2: mov    DWORD PTR [eax+0x168],ebx
  0x01ebcfc8: mov    eax,ebx
  0x01ebcfca: jmp    edi
  0x01ebcfcc: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebcfcf: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebcfd2: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebcfd5: jne    0x01ebcfe8
  0x01ebcfdb: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebcfe2: je     0x01ebd027
  0x01ebcfe8: jmp    0x01ea32d0
  0x01ebcfed: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebcff4: je     0x01ebd027
  0x01ebcffa: mov    eax,DWORD PTR [esp]
  0x01ebcffd: pusha  
  0x01ebcffe: pushf  
  0x01ebcfff: sub    esp,0x10
  0x01ebd002: movsd  QWORD PTR [esp],xmm0
  0x01ebd007: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebd00d: push   eax
  0x01ebd00e: push   ebx
  0x01ebd00f: call   0x552179d0
  0x01ebd014: add    esp,0x8
  0x01ebd017: movsd  xmm0,QWORD PTR [esp]
  0x01ebd01c: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebd022: add    esp,0x10
  0x01ebd025: popf   
  0x01ebd026: popa   
  0x01ebd027: pop    eax
  0x01ebd028: mov    esi,esp
  0x01ebd02a: sub    esp,0x14
  0x01ebd02d: mov    DWORD PTR [esp+0x10],ecx
  0x01ebd031: mov    DWORD PTR [esp+0xc],edx
  0x01ebd035: movss  DWORD PTR [esp+0x8],xmm0
  0x01ebd03b: movss  DWORD PTR [esp+0x4],xmm1
  0x01ebd041: mov    edi,DWORD PTR [esp+0x14]
  0x01ebd045: mov    DWORD PTR [esp],edi
  0x01ebd048: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebd04b: push   eax
  0x01ebd04c: jmp    ecx

AHE@0x0422c16c: 0xaa66aaaa i2c: 0x01ebd0f0 c2i: 0x01ebd1c2 c2iUV: 0x01ebd1a1
i2c argument handler #48 for: receiver (Ljava/nio/charset/Charset;FF[[C[CII)V (331 bytes generated)
c2i argument handler starts at 01EBD1C2
  0x01ebd0f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebd0f3: mov    edi,0x1dc2940
  0x01ebd0f8: cmp    eax,edi
  0x01ebd0fa: jbe    0x01ebd10d
  0x01ebd100: mov    edi,0x1ea2940
  0x01ebd105: cmp    eax,edi
  0x01ebd107: jb     0x01ebd152
  0x01ebd10d: mov    edi,0x1dc0340
  0x01ebd112: cmp    eax,edi
  0x01ebd114: jbe    0x01ebd127
  0x01ebd11a: mov    edi,0x1dc2668
  0x01ebd11f: cmp    eax,edi
  0x01ebd121: jb     0x01ebd152
  0x01ebd127: mov    edi,0x1ead380
  0x01ebd12c: cmp    eax,edi
  0x01ebd12e: jbe    0x01ebd141
  0x01ebd134: mov    edi,0x1eb2970
  0x01ebd139: cmp    eax,edi
  0x01ebd13b: jb     0x01ebd152
  ;; i2c adapter must return to an interpreter frame
  0x01ebd141: push   0x5531723c
  0x01ebd146: call   0x01ebd14b
  0x01ebd14b: pusha  
  0x01ebd14c: call   0x54dedbf0
  0x01ebd151: hlt    
  ;; } verify_i2ce 
  0x01ebd152: mov    edi,esp
  0x01ebd154: sub    esp,0x10
  0x01ebd157: and    esp,0xfffffff0
  0x01ebd15a: push   eax
  0x01ebd15b: mov    eax,edi
  0x01ebd15d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebd160: mov    ecx,DWORD PTR [eax+0x20]
  0x01ebd163: mov    edx,DWORD PTR [eax+0x1c]
  0x01ebd166: movss  xmm0,DWORD PTR [eax+0x18]
  0x01ebd16b: movss  xmm1,DWORD PTR [eax+0x14]
  0x01ebd170: mov    esi,DWORD PTR [eax+0x10]
  0x01ebd173: mov    DWORD PTR [esp+0x4],esi
  0x01ebd177: mov    esi,DWORD PTR [eax+0xc]
  0x01ebd17a: mov    DWORD PTR [esp+0x8],esi
  0x01ebd17e: mov    esi,DWORD PTR [eax+0x8]
  0x01ebd181: mov    DWORD PTR [esp+0xc],esi
  0x01ebd185: mov    esi,DWORD PTR [eax+0x4]
  0x01ebd188: mov    DWORD PTR [esp+0x10],esi
  0x01ebd18c: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebd194: mov    eax,DWORD PTR [eax-0xc]
  0x01ebd197: mov    DWORD PTR [eax+0x168],ebx
  0x01ebd19d: mov    eax,ebx
  0x01ebd19f: jmp    edi
  0x01ebd1a1: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebd1a4: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebd1a7: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebd1aa: jne    0x01ebd1bd
  0x01ebd1b0: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd1b7: je     0x01ebd1fc
  0x01ebd1bd: jmp    0x01ea32d0
  0x01ebd1c2: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd1c9: je     0x01ebd1fc
  0x01ebd1cf: mov    eax,DWORD PTR [esp]
  0x01ebd1d2: pusha  
  0x01ebd1d3: pushf  
  0x01ebd1d4: sub    esp,0x10
  0x01ebd1d7: movsd  QWORD PTR [esp],xmm0
  0x01ebd1dc: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebd1e2: push   eax
  0x01ebd1e3: push   ebx
  0x01ebd1e4: call   0x552179d0
  0x01ebd1e9: add    esp,0x8
  0x01ebd1ec: movsd  xmm0,QWORD PTR [esp]
  0x01ebd1f1: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebd1f7: add    esp,0x10
  0x01ebd1fa: popf   
  0x01ebd1fb: popa   
  0x01ebd1fc: pop    eax
  0x01ebd1fd: mov    esi,esp
  0x01ebd1ff: sub    esp,0x20
  0x01ebd202: mov    DWORD PTR [esp+0x1c],ecx
  0x01ebd206: mov    DWORD PTR [esp+0x18],edx
  0x01ebd20a: movss  DWORD PTR [esp+0x14],xmm0
  0x01ebd210: movss  DWORD PTR [esp+0x10],xmm1
  0x01ebd216: mov    edi,DWORD PTR [esp+0x20]
  0x01ebd21a: mov    DWORD PTR [esp+0xc],edi
  0x01ebd21e: mov    edi,DWORD PTR [esp+0x24]
  0x01ebd222: mov    DWORD PTR [esp+0x8],edi
  0x01ebd226: mov    edi,DWORD PTR [esp+0x28]
  0x01ebd22a: mov    DWORD PTR [esp+0x4],edi
  0x01ebd22e: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebd232: mov    DWORD PTR [esp],edi
  0x01ebd235: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebd238: push   eax
  0x01ebd239: jmp    ecx

AHE@0x0422c198: 0xaa66aaa0 i2c: 0x01ebd2b0 c2i: 0x01ebd37b c2iUV: 0x01ebd35a
i2c argument handler #49 for: receiver (Ljava/nio/charset/Charset;FF[B[C[C)V (316 bytes generated)
c2i argument handler starts at 01EBD37B
  0x01ebd2b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebd2b3: mov    edi,0x1dc2940
  0x01ebd2b8: cmp    eax,edi
  0x01ebd2ba: jbe    0x01ebd2cd
  0x01ebd2c0: mov    edi,0x1ea2940
  0x01ebd2c5: cmp    eax,edi
  0x01ebd2c7: jb     0x01ebd312
  0x01ebd2cd: mov    edi,0x1dc0340
  0x01ebd2d2: cmp    eax,edi
  0x01ebd2d4: jbe    0x01ebd2e7
  0x01ebd2da: mov    edi,0x1dc2668
  0x01ebd2df: cmp    eax,edi
  0x01ebd2e1: jb     0x01ebd312
  0x01ebd2e7: mov    edi,0x1ead380
  0x01ebd2ec: cmp    eax,edi
  0x01ebd2ee: jbe    0x01ebd301
  0x01ebd2f4: mov    edi,0x1eb2970
  0x01ebd2f9: cmp    eax,edi
  0x01ebd2fb: jb     0x01ebd312
  ;; i2c adapter must return to an interpreter frame
  0x01ebd301: push   0x5531723c
  0x01ebd306: call   0x01ebd30b
  0x01ebd30b: pusha  
  0x01ebd30c: call   0x54dedbf0
  0x01ebd311: hlt    
  ;; } verify_i2ce 
  0x01ebd312: mov    edi,esp
  0x01ebd314: sub    esp,0x10
  0x01ebd317: and    esp,0xfffffff0
  0x01ebd31a: push   eax
  0x01ebd31b: mov    eax,edi
  0x01ebd31d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebd320: mov    ecx,DWORD PTR [eax+0x1c]
  0x01ebd323: mov    edx,DWORD PTR [eax+0x18]
  0x01ebd326: movss  xmm0,DWORD PTR [eax+0x14]
  0x01ebd32b: movss  xmm1,DWORD PTR [eax+0x10]
  0x01ebd330: mov    esi,DWORD PTR [eax+0xc]
  0x01ebd333: mov    DWORD PTR [esp+0x4],esi
  0x01ebd337: mov    esi,DWORD PTR [eax+0x8]
  0x01ebd33a: mov    DWORD PTR [esp+0x8],esi
  0x01ebd33e: mov    esi,DWORD PTR [eax+0x4]
  0x01ebd341: mov    DWORD PTR [esp+0xc],esi
  0x01ebd345: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebd34d: mov    eax,DWORD PTR [eax-0xc]
  0x01ebd350: mov    DWORD PTR [eax+0x168],ebx
  0x01ebd356: mov    eax,ebx
  0x01ebd358: jmp    edi
  0x01ebd35a: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebd35d: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebd360: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebd363: jne    0x01ebd376
  0x01ebd369: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd370: je     0x01ebd3b5
  0x01ebd376: jmp    0x01ea32d0
  0x01ebd37b: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd382: je     0x01ebd3b5
  0x01ebd388: mov    eax,DWORD PTR [esp]
  0x01ebd38b: pusha  
  0x01ebd38c: pushf  
  0x01ebd38d: sub    esp,0x10
  0x01ebd390: movsd  QWORD PTR [esp],xmm0
  0x01ebd395: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebd39b: push   eax
  0x01ebd39c: push   ebx
  0x01ebd39d: call   0x552179d0
  0x01ebd3a2: add    esp,0x8
  0x01ebd3a5: movsd  xmm0,QWORD PTR [esp]
  0x01ebd3aa: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebd3b0: add    esp,0x10
  0x01ebd3b3: popf   
  0x01ebd3b4: popa   
  0x01ebd3b5: pop    eax
  0x01ebd3b6: mov    esi,esp
  0x01ebd3b8: sub    esp,0x1c
  0x01ebd3bb: mov    DWORD PTR [esp+0x18],ecx
  0x01ebd3bf: mov    DWORD PTR [esp+0x14],edx
  0x01ebd3c3: movss  DWORD PTR [esp+0x10],xmm0
  0x01ebd3c9: movss  DWORD PTR [esp+0xc],xmm1
  0x01ebd3cf: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebd3d3: mov    DWORD PTR [esp+0x8],edi
  0x01ebd3d7: mov    edi,DWORD PTR [esp+0x20]
  0x01ebd3db: mov    DWORD PTR [esp+0x4],edi
  0x01ebd3df: mov    edi,DWORD PTR [esp+0x24]
  0x01ebd3e3: mov    DWORD PTR [esp],edi
  0x01ebd3e6: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebd3e9: push   eax
  0x01ebd3ea: jmp    ecx

AHE@0x0422c1c4: 0xbeabebe0 i2c: 0x01ebd470 c2i: 0x01ebd543 c2iUV: 0x01ebd522
i2c argument handler #50 for: static (JLjava/lang/Object;JJ)V (332 bytes generated)
c2i argument handler starts at 01EBD543
  0x01ebd470: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebd473: mov    edi,0x1dc2940
  0x01ebd478: cmp    eax,edi
  0x01ebd47a: jbe    0x01ebd48d
  0x01ebd480: mov    edi,0x1ea2940
  0x01ebd485: cmp    eax,edi
  0x01ebd487: jb     0x01ebd4d2
  0x01ebd48d: mov    edi,0x1dc0340
  0x01ebd492: cmp    eax,edi
  0x01ebd494: jbe    0x01ebd4a7
  0x01ebd49a: mov    edi,0x1dc2668
  0x01ebd49f: cmp    eax,edi
  0x01ebd4a1: jb     0x01ebd4d2
  0x01ebd4a7: mov    edi,0x1ead380
  0x01ebd4ac: cmp    eax,edi
  0x01ebd4ae: jbe    0x01ebd4c1
  0x01ebd4b4: mov    edi,0x1eb2970
  0x01ebd4b9: cmp    eax,edi
  0x01ebd4bb: jb     0x01ebd4d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebd4c1: push   0x5531723c
  0x01ebd4c6: call   0x01ebd4cb
  0x01ebd4cb: pusha  
  0x01ebd4cc: call   0x54dedbf0
  0x01ebd4d1: hlt    
  ;; } verify_i2ce 
  0x01ebd4d2: mov    edi,esp
  0x01ebd4d4: sub    esp,0x18
  0x01ebd4d7: and    esp,0xfffffff0
  0x01ebd4da: push   eax
  0x01ebd4db: mov    eax,edi
  0x01ebd4dd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebd4e0: mov    esi,DWORD PTR [eax+0x18]
  0x01ebd4e3: mov    DWORD PTR [esp+0x4],esi
  0x01ebd4e7: mov    esi,DWORD PTR [eax+0x1c]
  0x01ebd4ea: mov    DWORD PTR [esp+0x8],esi
  0x01ebd4ee: mov    ecx,DWORD PTR [eax+0x14]
  0x01ebd4f1: mov    esi,DWORD PTR [eax+0xc]
  0x01ebd4f4: mov    DWORD PTR [esp+0xc],esi
  0x01ebd4f8: mov    esi,DWORD PTR [eax+0x10]
  0x01ebd4fb: mov    DWORD PTR [esp+0x10],esi
  0x01ebd4ff: mov    esi,DWORD PTR [eax+0x4]
  0x01ebd502: mov    DWORD PTR [esp+0x14],esi
  0x01ebd506: mov    esi,DWORD PTR [eax+0x8]
  0x01ebd509: mov    DWORD PTR [esp+0x18],esi
  0x01ebd50d: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebd515: mov    eax,DWORD PTR [eax-0xc]
  0x01ebd518: mov    DWORD PTR [eax+0x168],ebx
  0x01ebd51e: mov    eax,ebx
  0x01ebd520: jmp    edi
  0x01ebd522: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebd525: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebd528: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebd52b: jne    0x01ebd53e
  0x01ebd531: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd538: je     0x01ebd57d
  0x01ebd53e: jmp    0x01ea32d0
  0x01ebd543: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd54a: je     0x01ebd57d
  0x01ebd550: mov    eax,DWORD PTR [esp]
  0x01ebd553: pusha  
  0x01ebd554: pushf  
  0x01ebd555: sub    esp,0x10
  0x01ebd558: movsd  QWORD PTR [esp],xmm0
  0x01ebd55d: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebd563: push   eax
  0x01ebd564: push   ebx
  0x01ebd565: call   0x552179d0
  0x01ebd56a: add    esp,0x8
  0x01ebd56d: movsd  xmm0,QWORD PTR [esp]
  0x01ebd572: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebd578: add    esp,0x10
  0x01ebd57b: popf   
  0x01ebd57c: popa   
  0x01ebd57d: pop    eax
  0x01ebd57e: mov    esi,esp
  0x01ebd580: sub    esp,0x1c
  0x01ebd583: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebd587: mov    DWORD PTR [esp+0x14],edi
  0x01ebd58b: mov    edi,DWORD PTR [esp+0x20]
  0x01ebd58f: mov    DWORD PTR [esp+0x18],edi
  0x01ebd593: mov    DWORD PTR [esp+0x10],ecx
  0x01ebd597: mov    edi,DWORD PTR [esp+0x24]
  0x01ebd59b: mov    DWORD PTR [esp+0x8],edi
  0x01ebd59f: mov    edi,DWORD PTR [esp+0x28]
  0x01ebd5a3: mov    DWORD PTR [esp+0xc],edi
  0x01ebd5a7: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebd5ab: mov    DWORD PTR [esp],edi
  0x01ebd5ae: mov    edi,DWORD PTR [esp+0x30]
  0x01ebd5b2: mov    DWORD PTR [esp+0x4],edi
  0x01ebd5b6: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebd5b9: push   eax
  0x01ebd5ba: jmp    ecx

AHE@0x0422c1f0: 0xbe600000 i2c: 0x01ebd630 c2i: 0x01ebd6e9 c2iUV: 0x01ebd6c8
i2c argument handler #51 for: static (JF)V (276 bytes generated)
c2i argument handler starts at 01EBD6E9
  0x01ebd630: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebd633: mov    edi,0x1dc2940
  0x01ebd638: cmp    eax,edi
  0x01ebd63a: jbe    0x01ebd64d
  0x01ebd640: mov    edi,0x1ea2940
  0x01ebd645: cmp    eax,edi
  0x01ebd647: jb     0x01ebd692
  0x01ebd64d: mov    edi,0x1dc0340
  0x01ebd652: cmp    eax,edi
  0x01ebd654: jbe    0x01ebd667
  0x01ebd65a: mov    edi,0x1dc2668
  0x01ebd65f: cmp    eax,edi
  0x01ebd661: jb     0x01ebd692
  0x01ebd667: mov    edi,0x1ead380
  0x01ebd66c: cmp    eax,edi
  0x01ebd66e: jbe    0x01ebd681
  0x01ebd674: mov    edi,0x1eb2970
  0x01ebd679: cmp    eax,edi
  0x01ebd67b: jb     0x01ebd692
  ;; i2c adapter must return to an interpreter frame
  0x01ebd681: push   0x5531723c
  0x01ebd686: call   0x01ebd68b
  0x01ebd68b: pusha  
  0x01ebd68c: call   0x54dedbf0
  0x01ebd691: hlt    
  ;; } verify_i2ce 
  0x01ebd692: mov    edi,esp
  0x01ebd694: sub    esp,0x8
  0x01ebd697: and    esp,0xfffffff0
  0x01ebd69a: push   eax
  0x01ebd69b: mov    eax,edi
  0x01ebd69d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebd6a0: mov    esi,DWORD PTR [eax+0x8]
  0x01ebd6a3: mov    DWORD PTR [esp+0x4],esi
  0x01ebd6a7: mov    esi,DWORD PTR [eax+0xc]
  0x01ebd6aa: mov    DWORD PTR [esp+0x8],esi
  0x01ebd6ae: movss  xmm0,DWORD PTR [eax+0x4]
  0x01ebd6b3: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebd6bb: mov    eax,DWORD PTR [eax-0xc]
  0x01ebd6be: mov    DWORD PTR [eax+0x168],ebx
  0x01ebd6c4: mov    eax,ebx
  0x01ebd6c6: jmp    edi
  0x01ebd6c8: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebd6cb: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebd6ce: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebd6d1: jne    0x01ebd6e4
  0x01ebd6d7: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd6de: je     0x01ebd723
  0x01ebd6e4: jmp    0x01ea32d0
  0x01ebd6e9: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd6f0: je     0x01ebd723
  0x01ebd6f6: mov    eax,DWORD PTR [esp]
  0x01ebd6f9: pusha  
  0x01ebd6fa: pushf  
  0x01ebd6fb: sub    esp,0x10
  0x01ebd6fe: movsd  QWORD PTR [esp],xmm0
  0x01ebd703: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebd709: push   eax
  0x01ebd70a: push   ebx
  0x01ebd70b: call   0x552179d0
  0x01ebd710: add    esp,0x8
  0x01ebd713: movsd  xmm0,QWORD PTR [esp]
  0x01ebd718: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebd71e: add    esp,0x10
  0x01ebd721: popf   
  0x01ebd722: popa   
  0x01ebd723: pop    eax
  0x01ebd724: mov    esi,esp
  0x01ebd726: sub    esp,0xc
  0x01ebd729: mov    edi,DWORD PTR [esp+0xc]
  0x01ebd72d: mov    DWORD PTR [esp+0x4],edi
  0x01ebd731: mov    edi,DWORD PTR [esp+0x10]
  0x01ebd735: mov    DWORD PTR [esp+0x8],edi
  0x01ebd739: movss  DWORD PTR [esp],xmm0
  0x01ebd73e: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebd741: push   eax
  0x01ebd742: jmp    ecx

AHE@0x0422c21c: 0xbe7e0000 i2c: 0x01ebd7f0 c2i: 0x01ebd8a9 c2iUV: 0x01ebd888
i2c argument handler #52 for: static (JD)V (276 bytes generated)
c2i argument handler starts at 01EBD8A9
  0x01ebd7f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebd7f3: mov    edi,0x1dc2940
  0x01ebd7f8: cmp    eax,edi
  0x01ebd7fa: jbe    0x01ebd80d
  0x01ebd800: mov    edi,0x1ea2940
  0x01ebd805: cmp    eax,edi
  0x01ebd807: jb     0x01ebd852
  0x01ebd80d: mov    edi,0x1dc0340
  0x01ebd812: cmp    eax,edi
  0x01ebd814: jbe    0x01ebd827
  0x01ebd81a: mov    edi,0x1dc2668
  0x01ebd81f: cmp    eax,edi
  0x01ebd821: jb     0x01ebd852
  0x01ebd827: mov    edi,0x1ead380
  0x01ebd82c: cmp    eax,edi
  0x01ebd82e: jbe    0x01ebd841
  0x01ebd834: mov    edi,0x1eb2970
  0x01ebd839: cmp    eax,edi
  0x01ebd83b: jb     0x01ebd852
  ;; i2c adapter must return to an interpreter frame
  0x01ebd841: push   0x5531723c
  0x01ebd846: call   0x01ebd84b
  0x01ebd84b: pusha  
  0x01ebd84c: call   0x54dedbf0
  0x01ebd851: hlt    
  ;; } verify_i2ce 
  0x01ebd852: mov    edi,esp
  0x01ebd854: sub    esp,0x8
  0x01ebd857: and    esp,0xfffffff0
  0x01ebd85a: push   eax
  0x01ebd85b: mov    eax,edi
  0x01ebd85d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebd860: mov    esi,DWORD PTR [eax+0xc]
  0x01ebd863: mov    DWORD PTR [esp+0x4],esi
  0x01ebd867: mov    esi,DWORD PTR [eax+0x10]
  0x01ebd86a: mov    DWORD PTR [esp+0x8],esi
  0x01ebd86e: movsd  xmm0,QWORD PTR [eax+0x4]
  0x01ebd873: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebd87b: mov    eax,DWORD PTR [eax-0xc]
  0x01ebd87e: mov    DWORD PTR [eax+0x168],ebx
  0x01ebd884: mov    eax,ebx
  0x01ebd886: jmp    edi
  0x01ebd888: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebd88b: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebd88e: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebd891: jne    0x01ebd8a4
  0x01ebd897: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd89e: je     0x01ebd8e3
  0x01ebd8a4: jmp    0x01ea32d0
  0x01ebd8a9: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebd8b0: je     0x01ebd8e3
  0x01ebd8b6: mov    eax,DWORD PTR [esp]
  0x01ebd8b9: pusha  
  0x01ebd8ba: pushf  
  0x01ebd8bb: sub    esp,0x10
  0x01ebd8be: movsd  QWORD PTR [esp],xmm0
  0x01ebd8c3: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebd8c9: push   eax
  0x01ebd8ca: push   ebx
  0x01ebd8cb: call   0x552179d0
  0x01ebd8d0: add    esp,0x8
  0x01ebd8d3: movsd  xmm0,QWORD PTR [esp]
  0x01ebd8d8: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebd8de: add    esp,0x10
  0x01ebd8e1: popf   
  0x01ebd8e2: popa   
  0x01ebd8e3: pop    eax
  0x01ebd8e4: mov    esi,esp
  0x01ebd8e6: sub    esp,0x10
  0x01ebd8e9: mov    edi,DWORD PTR [esp+0x10]
  0x01ebd8ed: mov    DWORD PTR [esp+0x8],edi
  0x01ebd8f1: mov    edi,DWORD PTR [esp+0x14]
  0x01ebd8f5: mov    DWORD PTR [esp+0xc],edi
  0x01ebd8f9: movsd  QWORD PTR [esp],xmm0
  0x01ebd8fe: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebd901: push   eax
  0x01ebd902: jmp    ecx

AHE@0x0422c248: 0xbeabebebe0000000 i2c: 0x01ebd9b0 c2i: 0x01ebda91 c2iUV: 0x01ebda70
i2c argument handler #53 for: static (JLjava/lang/Object;JJJ)V (362 bytes generated)
c2i argument handler starts at 01EBDA91
  0x01ebd9b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebd9b3: mov    edi,0x1dc2940
  0x01ebd9b8: cmp    eax,edi
  0x01ebd9ba: jbe    0x01ebd9cd
  0x01ebd9c0: mov    edi,0x1ea2940
  0x01ebd9c5: cmp    eax,edi
  0x01ebd9c7: jb     0x01ebda12
  0x01ebd9cd: mov    edi,0x1dc0340
  0x01ebd9d2: cmp    eax,edi
  0x01ebd9d4: jbe    0x01ebd9e7
  0x01ebd9da: mov    edi,0x1dc2668
  0x01ebd9df: cmp    eax,edi
  0x01ebd9e1: jb     0x01ebda12
  0x01ebd9e7: mov    edi,0x1ead380
  0x01ebd9ec: cmp    eax,edi
  0x01ebd9ee: jbe    0x01ebda01
  0x01ebd9f4: mov    edi,0x1eb2970
  0x01ebd9f9: cmp    eax,edi
  0x01ebd9fb: jb     0x01ebda12
  ;; i2c adapter must return to an interpreter frame
  0x01ebda01: push   0x5531723c
  0x01ebda06: call   0x01ebda0b
  0x01ebda0b: pusha  
  0x01ebda0c: call   0x54dedbf0
  0x01ebda11: hlt    
  ;; } verify_i2ce 
  0x01ebda12: mov    edi,esp
  0x01ebda14: sub    esp,0x20
  0x01ebda17: and    esp,0xfffffff0
  0x01ebda1a: push   eax
  0x01ebda1b: mov    eax,edi
  0x01ebda1d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebda20: mov    esi,DWORD PTR [eax+0x20]
  0x01ebda23: mov    DWORD PTR [esp+0x4],esi
  0x01ebda27: mov    esi,DWORD PTR [eax+0x24]
  0x01ebda2a: mov    DWORD PTR [esp+0x8],esi
  0x01ebda2e: mov    ecx,DWORD PTR [eax+0x1c]
  0x01ebda31: mov    esi,DWORD PTR [eax+0x14]
  0x01ebda34: mov    DWORD PTR [esp+0xc],esi
  0x01ebda38: mov    esi,DWORD PTR [eax+0x18]
  0x01ebda3b: mov    DWORD PTR [esp+0x10],esi
  0x01ebda3f: mov    esi,DWORD PTR [eax+0xc]
  0x01ebda42: mov    DWORD PTR [esp+0x14],esi
  0x01ebda46: mov    esi,DWORD PTR [eax+0x10]
  0x01ebda49: mov    DWORD PTR [esp+0x18],esi
  0x01ebda4d: mov    esi,DWORD PTR [eax+0x4]
  0x01ebda50: mov    DWORD PTR [esp+0x1c],esi
  0x01ebda54: mov    esi,DWORD PTR [eax+0x8]
  0x01ebda57: mov    DWORD PTR [esp+0x20],esi
  0x01ebda5b: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebda63: mov    eax,DWORD PTR [eax-0xc]
  0x01ebda66: mov    DWORD PTR [eax+0x168],ebx
  0x01ebda6c: mov    eax,ebx
  0x01ebda6e: jmp    edi
  0x01ebda70: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebda73: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebda76: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebda79: jne    0x01ebda8c
  0x01ebda7f: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebda86: je     0x01ebdacb
  0x01ebda8c: jmp    0x01ea32d0
  0x01ebda91: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebda98: je     0x01ebdacb
  0x01ebda9e: mov    eax,DWORD PTR [esp]
  0x01ebdaa1: pusha  
  0x01ebdaa2: pushf  
  0x01ebdaa3: sub    esp,0x10
  0x01ebdaa6: movsd  QWORD PTR [esp],xmm0
  0x01ebdaab: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebdab1: push   eax
  0x01ebdab2: push   ebx
  0x01ebdab3: call   0x552179d0
  0x01ebdab8: add    esp,0x8
  0x01ebdabb: movsd  xmm0,QWORD PTR [esp]
  0x01ebdac0: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebdac6: add    esp,0x10
  0x01ebdac9: popf   
  0x01ebdaca: popa   
  0x01ebdacb: pop    eax
  0x01ebdacc: mov    esi,esp
  0x01ebdace: sub    esp,0x24
  0x01ebdad1: mov    edi,DWORD PTR [esp+0x24]
  0x01ebdad5: mov    DWORD PTR [esp+0x1c],edi
  0x01ebdad9: mov    edi,DWORD PTR [esp+0x28]
  0x01ebdadd: mov    DWORD PTR [esp+0x20],edi
  0x01ebdae1: mov    DWORD PTR [esp+0x18],ecx
  0x01ebdae5: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebdae9: mov    DWORD PTR [esp+0x10],edi
  0x01ebdaed: mov    edi,DWORD PTR [esp+0x30]
  0x01ebdaf1: mov    DWORD PTR [esp+0x14],edi
  0x01ebdaf5: mov    edi,DWORD PTR [esp+0x34]
  0x01ebdaf9: mov    DWORD PTR [esp+0x8],edi
  0x01ebdafd: mov    edi,DWORD PTR [esp+0x38]
  0x01ebdb01: mov    DWORD PTR [esp+0xc],edi
  0x01ebdb05: mov    edi,DWORD PTR [esp+0x3c]
  0x01ebdb09: mov    DWORD PTR [esp],edi
  0x01ebdb0c: mov    edi,DWORD PTR [esp+0x40]
  0x01ebdb10: mov    DWORD PTR [esp+0x4],edi
  0x01ebdb14: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebdb17: push   eax
  0x01ebdb18: jmp    ecx

AHE@0x0422c274: 0xabebebebe0000000 i2c: 0x01ebdbb0 c2i: 0x01ebdc91 c2iUV: 0x01ebdc70
i2c argument handler #54 for: static (Ljava/lang/Object;JJJJ)V (362 bytes generated)
c2i argument handler starts at 01EBDC91
  0x01ebdbb0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebdbb3: mov    edi,0x1dc2940
  0x01ebdbb8: cmp    eax,edi
  0x01ebdbba: jbe    0x01ebdbcd
  0x01ebdbc0: mov    edi,0x1ea2940
  0x01ebdbc5: cmp    eax,edi
  0x01ebdbc7: jb     0x01ebdc12
  0x01ebdbcd: mov    edi,0x1dc0340
  0x01ebdbd2: cmp    eax,edi
  0x01ebdbd4: jbe    0x01ebdbe7
  0x01ebdbda: mov    edi,0x1dc2668
  0x01ebdbdf: cmp    eax,edi
  0x01ebdbe1: jb     0x01ebdc12
  0x01ebdbe7: mov    edi,0x1ead380
  0x01ebdbec: cmp    eax,edi
  0x01ebdbee: jbe    0x01ebdc01
  0x01ebdbf4: mov    edi,0x1eb2970
  0x01ebdbf9: cmp    eax,edi
  0x01ebdbfb: jb     0x01ebdc12
  ;; i2c adapter must return to an interpreter frame
  0x01ebdc01: push   0x5531723c
  0x01ebdc06: call   0x01ebdc0b
  0x01ebdc0b: pusha  
  0x01ebdc0c: call   0x54dedbf0
  0x01ebdc11: hlt    
  ;; } verify_i2ce 
  0x01ebdc12: mov    edi,esp
  0x01ebdc14: sub    esp,0x20
  0x01ebdc17: and    esp,0xfffffff0
  0x01ebdc1a: push   eax
  0x01ebdc1b: mov    eax,edi
  0x01ebdc1d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebdc20: mov    ecx,DWORD PTR [eax+0x24]
  0x01ebdc23: mov    esi,DWORD PTR [eax+0x1c]
  0x01ebdc26: mov    DWORD PTR [esp+0x4],esi
  0x01ebdc2a: mov    esi,DWORD PTR [eax+0x20]
  0x01ebdc2d: mov    DWORD PTR [esp+0x8],esi
  0x01ebdc31: mov    esi,DWORD PTR [eax+0x14]
  0x01ebdc34: mov    DWORD PTR [esp+0xc],esi
  0x01ebdc38: mov    esi,DWORD PTR [eax+0x18]
  0x01ebdc3b: mov    DWORD PTR [esp+0x10],esi
  0x01ebdc3f: mov    esi,DWORD PTR [eax+0xc]
  0x01ebdc42: mov    DWORD PTR [esp+0x14],esi
  0x01ebdc46: mov    esi,DWORD PTR [eax+0x10]
  0x01ebdc49: mov    DWORD PTR [esp+0x18],esi
  0x01ebdc4d: mov    esi,DWORD PTR [eax+0x4]
  0x01ebdc50: mov    DWORD PTR [esp+0x1c],esi
  0x01ebdc54: mov    esi,DWORD PTR [eax+0x8]
  0x01ebdc57: mov    DWORD PTR [esp+0x20],esi
  0x01ebdc5b: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebdc63: mov    eax,DWORD PTR [eax-0xc]
  0x01ebdc66: mov    DWORD PTR [eax+0x168],ebx
  0x01ebdc6c: mov    eax,ebx
  0x01ebdc6e: jmp    edi
  0x01ebdc70: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebdc73: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebdc76: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebdc79: jne    0x01ebdc8c
  0x01ebdc7f: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebdc86: je     0x01ebdccb
  0x01ebdc8c: jmp    0x01ea32d0
  0x01ebdc91: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebdc98: je     0x01ebdccb
  0x01ebdc9e: mov    eax,DWORD PTR [esp]
  0x01ebdca1: pusha  
  0x01ebdca2: pushf  
  0x01ebdca3: sub    esp,0x10
  0x01ebdca6: movsd  QWORD PTR [esp],xmm0
  0x01ebdcab: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebdcb1: push   eax
  0x01ebdcb2: push   ebx
  0x01ebdcb3: call   0x552179d0
  0x01ebdcb8: add    esp,0x8
  0x01ebdcbb: movsd  xmm0,QWORD PTR [esp]
  0x01ebdcc0: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebdcc6: add    esp,0x10
  0x01ebdcc9: popf   
  0x01ebdcca: popa   
  0x01ebdccb: pop    eax
  0x01ebdccc: mov    esi,esp
  0x01ebdcce: sub    esp,0x24
  0x01ebdcd1: mov    DWORD PTR [esp+0x20],ecx
  0x01ebdcd5: mov    edi,DWORD PTR [esp+0x24]
  0x01ebdcd9: mov    DWORD PTR [esp+0x18],edi
  0x01ebdcdd: mov    edi,DWORD PTR [esp+0x28]
  0x01ebdce1: mov    DWORD PTR [esp+0x1c],edi
  0x01ebdce5: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebdce9: mov    DWORD PTR [esp+0x10],edi
  0x01ebdced: mov    edi,DWORD PTR [esp+0x30]
  0x01ebdcf1: mov    DWORD PTR [esp+0x14],edi
  0x01ebdcf5: mov    edi,DWORD PTR [esp+0x34]
  0x01ebdcf9: mov    DWORD PTR [esp+0x8],edi
  0x01ebdcfd: mov    edi,DWORD PTR [esp+0x38]
  0x01ebdd01: mov    DWORD PTR [esp+0xc],edi
  0x01ebdd05: mov    edi,DWORD PTR [esp+0x3c]
  0x01ebdd09: mov    DWORD PTR [esp],edi
  0x01ebdd0c: mov    edi,DWORD PTR [esp+0x40]
  0x01ebdd10: mov    DWORD PTR [esp+0x4],edi
  0x01ebdd14: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebdd17: push   eax
  0x01ebdd18: jmp    ecx

AHE@0x0422c2a0: 0xbe7ea000 i2c: 0x01ebddb0 c2i: 0x01ebde6c c2iUV: 0x01ebde4b
i2c argument handler #55 for: static (JDZ)V (283 bytes generated)
c2i argument handler starts at 01EBDE6C
  0x01ebddb0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebddb3: mov    edi,0x1dc2940
  0x01ebddb8: cmp    eax,edi
  0x01ebddba: jbe    0x01ebddcd
  0x01ebddc0: mov    edi,0x1ea2940
  0x01ebddc5: cmp    eax,edi
  0x01ebddc7: jb     0x01ebde12
  0x01ebddcd: mov    edi,0x1dc0340
  0x01ebddd2: cmp    eax,edi
  0x01ebddd4: jbe    0x01ebdde7
  0x01ebddda: mov    edi,0x1dc2668
  0x01ebdddf: cmp    eax,edi
  0x01ebdde1: jb     0x01ebde12
  0x01ebdde7: mov    edi,0x1ead380
  0x01ebddec: cmp    eax,edi
  0x01ebddee: jbe    0x01ebde01
  0x01ebddf4: mov    edi,0x1eb2970
  0x01ebddf9: cmp    eax,edi
  0x01ebddfb: jb     0x01ebde12
  ;; i2c adapter must return to an interpreter frame
  0x01ebde01: push   0x5531723c
  0x01ebde06: call   0x01ebde0b
  0x01ebde0b: pusha  
  0x01ebde0c: call   0x54dedbf0
  0x01ebde11: hlt    
  ;; } verify_i2ce 
  0x01ebde12: mov    edi,esp
  0x01ebde14: sub    esp,0x8
  0x01ebde17: and    esp,0xfffffff0
  0x01ebde1a: push   eax
  0x01ebde1b: mov    eax,edi
  0x01ebde1d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebde20: mov    esi,DWORD PTR [eax+0x10]
  0x01ebde23: mov    DWORD PTR [esp+0x4],esi
  0x01ebde27: mov    esi,DWORD PTR [eax+0x14]
  0x01ebde2a: mov    DWORD PTR [esp+0x8],esi
  0x01ebde2e: movsd  xmm0,QWORD PTR [eax+0x8]
  0x01ebde33: mov    ecx,DWORD PTR [eax+0x4]
  0x01ebde36: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebde3e: mov    eax,DWORD PTR [eax-0xc]
  0x01ebde41: mov    DWORD PTR [eax+0x168],ebx
  0x01ebde47: mov    eax,ebx
  0x01ebde49: jmp    edi
  0x01ebde4b: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebde4e: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebde51: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebde54: jne    0x01ebde67
  0x01ebde5a: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebde61: je     0x01ebdea6
  0x01ebde67: jmp    0x01ea32d0
  0x01ebde6c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebde73: je     0x01ebdea6
  0x01ebde79: mov    eax,DWORD PTR [esp]
  0x01ebde7c: pusha  
  0x01ebde7d: pushf  
  0x01ebde7e: sub    esp,0x10
  0x01ebde81: movsd  QWORD PTR [esp],xmm0
  0x01ebde86: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebde8c: push   eax
  0x01ebde8d: push   ebx
  0x01ebde8e: call   0x552179d0
  0x01ebde93: add    esp,0x8
  0x01ebde96: movsd  xmm0,QWORD PTR [esp]
  0x01ebde9b: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebdea1: add    esp,0x10
  0x01ebdea4: popf   
  0x01ebdea5: popa   
  0x01ebdea6: pop    eax
  0x01ebdea7: mov    esi,esp
  0x01ebdea9: sub    esp,0x14
  0x01ebdeac: mov    edi,DWORD PTR [esp+0x14]
  0x01ebdeb0: mov    DWORD PTR [esp+0xc],edi
  0x01ebdeb4: mov    edi,DWORD PTR [esp+0x18]
  0x01ebdeb8: mov    DWORD PTR [esp+0x10],edi
  0x01ebdebc: movsd  QWORD PTR [esp+0x4],xmm0
  0x01ebdec2: mov    DWORD PTR [esp],ecx
  0x01ebdec5: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebdec8: push   eax
  0x01ebdec9: jmp    ecx

AHE@0x0422c2cc: 0xaa7ea000 i2c: 0x01ebdf70 c2i: 0x01ebe028 c2iUV: 0x01ebe007
i2c argument handler #56 for: static (Ljava/nio/ByteBuffer;IDZ)V (275 bytes generated)
c2i argument handler starts at 01EBE028
  0x01ebdf70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebdf73: mov    edi,0x1dc2940
  0x01ebdf78: cmp    eax,edi
  0x01ebdf7a: jbe    0x01ebdf8d
  0x01ebdf80: mov    edi,0x1ea2940
  0x01ebdf85: cmp    eax,edi
  0x01ebdf87: jb     0x01ebdfd2
  0x01ebdf8d: mov    edi,0x1dc0340
  0x01ebdf92: cmp    eax,edi
  0x01ebdf94: jbe    0x01ebdfa7
  0x01ebdf9a: mov    edi,0x1dc2668
  0x01ebdf9f: cmp    eax,edi
  0x01ebdfa1: jb     0x01ebdfd2
  0x01ebdfa7: mov    edi,0x1ead380
  0x01ebdfac: cmp    eax,edi
  0x01ebdfae: jbe    0x01ebdfc1
  0x01ebdfb4: mov    edi,0x1eb2970
  0x01ebdfb9: cmp    eax,edi
  0x01ebdfbb: jb     0x01ebdfd2
  ;; i2c adapter must return to an interpreter frame
  0x01ebdfc1: push   0x5531723c
  0x01ebdfc6: call   0x01ebdfcb
  0x01ebdfcb: pusha  
  0x01ebdfcc: call   0x54dedbf0
  0x01ebdfd1: hlt    
  ;; } verify_i2ce 
  0x01ebdfd2: mov    edi,esp
  0x01ebdfd4: sub    esp,0x8
  0x01ebdfd7: and    esp,0xfffffff0
  0x01ebdfda: push   eax
  0x01ebdfdb: mov    eax,edi
  0x01ebdfdd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebdfe0: mov    ecx,DWORD PTR [eax+0x14]
  0x01ebdfe3: mov    edx,DWORD PTR [eax+0x10]
  0x01ebdfe6: movsd  xmm0,QWORD PTR [eax+0x8]
  0x01ebdfeb: mov    esi,DWORD PTR [eax+0x4]
  0x01ebdfee: mov    DWORD PTR [esp+0x4],esi
  0x01ebdff2: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebdffa: mov    eax,DWORD PTR [eax-0xc]
  0x01ebdffd: mov    DWORD PTR [eax+0x168],ebx
  0x01ebe003: mov    eax,ebx
  0x01ebe005: jmp    edi
  0x01ebe007: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebe00a: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebe00d: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebe010: jne    0x01ebe023
  0x01ebe016: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe01d: je     0x01ebe062
  0x01ebe023: jmp    0x01ea32d0
  0x01ebe028: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe02f: je     0x01ebe062
  0x01ebe035: mov    eax,DWORD PTR [esp]
  0x01ebe038: pusha  
  0x01ebe039: pushf  
  0x01ebe03a: sub    esp,0x10
  0x01ebe03d: movsd  QWORD PTR [esp],xmm0
  0x01ebe042: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebe048: push   eax
  0x01ebe049: push   ebx
  0x01ebe04a: call   0x552179d0
  0x01ebe04f: add    esp,0x8
  0x01ebe052: movsd  xmm0,QWORD PTR [esp]
  0x01ebe057: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebe05d: add    esp,0x10
  0x01ebe060: popf   
  0x01ebe061: popa   
  0x01ebe062: pop    eax
  0x01ebe063: mov    esi,esp
  0x01ebe065: sub    esp,0x14
  0x01ebe068: mov    DWORD PTR [esp+0x10],ecx
  0x01ebe06c: mov    DWORD PTR [esp+0xc],edx
  0x01ebe070: movsd  QWORD PTR [esp+0x4],xmm0
  0x01ebe076: mov    edi,DWORD PTR [esp+0x14]
  0x01ebe07a: mov    DWORD PTR [esp],edi
  0x01ebe07d: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebe080: push   eax
  0x01ebe081: jmp    ecx

AHE@0x0422c2f8: 0xaa6a0000 i2c: 0x01ebe130 c2i: 0x01ebe1e8 c2iUV: 0x01ebe1c7
i2c argument handler #57 for: static (Ljava/nio/ByteBuffer;IFZ)V (275 bytes generated)
c2i argument handler starts at 01EBE1E8
  0x01ebe130: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebe133: mov    edi,0x1dc2940
  0x01ebe138: cmp    eax,edi
  0x01ebe13a: jbe    0x01ebe14d
  0x01ebe140: mov    edi,0x1ea2940
  0x01ebe145: cmp    eax,edi
  0x01ebe147: jb     0x01ebe192
  0x01ebe14d: mov    edi,0x1dc0340
  0x01ebe152: cmp    eax,edi
  0x01ebe154: jbe    0x01ebe167
  0x01ebe15a: mov    edi,0x1dc2668
  0x01ebe15f: cmp    eax,edi
  0x01ebe161: jb     0x01ebe192
  0x01ebe167: mov    edi,0x1ead380
  0x01ebe16c: cmp    eax,edi
  0x01ebe16e: jbe    0x01ebe181
  0x01ebe174: mov    edi,0x1eb2970
  0x01ebe179: cmp    eax,edi
  0x01ebe17b: jb     0x01ebe192
  ;; i2c adapter must return to an interpreter frame
  0x01ebe181: push   0x5531723c
  0x01ebe186: call   0x01ebe18b
  0x01ebe18b: pusha  
  0x01ebe18c: call   0x54dedbf0
  0x01ebe191: hlt    
  ;; } verify_i2ce 
  0x01ebe192: mov    edi,esp
  0x01ebe194: sub    esp,0x8
  0x01ebe197: and    esp,0xfffffff0
  0x01ebe19a: push   eax
  0x01ebe19b: mov    eax,edi
  0x01ebe19d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebe1a0: mov    ecx,DWORD PTR [eax+0x10]
  0x01ebe1a3: mov    edx,DWORD PTR [eax+0xc]
  0x01ebe1a6: movss  xmm0,DWORD PTR [eax+0x8]
  0x01ebe1ab: mov    esi,DWORD PTR [eax+0x4]
  0x01ebe1ae: mov    DWORD PTR [esp+0x4],esi
  0x01ebe1b2: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebe1ba: mov    eax,DWORD PTR [eax-0xc]
  0x01ebe1bd: mov    DWORD PTR [eax+0x168],ebx
  0x01ebe1c3: mov    eax,ebx
  0x01ebe1c5: jmp    edi
  0x01ebe1c7: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebe1ca: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebe1cd: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebe1d0: jne    0x01ebe1e3
  0x01ebe1d6: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe1dd: je     0x01ebe222
  0x01ebe1e3: jmp    0x01ea32d0
  0x01ebe1e8: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe1ef: je     0x01ebe222
  0x01ebe1f5: mov    eax,DWORD PTR [esp]
  0x01ebe1f8: pusha  
  0x01ebe1f9: pushf  
  0x01ebe1fa: sub    esp,0x10
  0x01ebe1fd: movsd  QWORD PTR [esp],xmm0
  0x01ebe202: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebe208: push   eax
  0x01ebe209: push   ebx
  0x01ebe20a: call   0x552179d0
  0x01ebe20f: add    esp,0x8
  0x01ebe212: movsd  xmm0,QWORD PTR [esp]
  0x01ebe217: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebe21d: add    esp,0x10
  0x01ebe220: popf   
  0x01ebe221: popa   
  0x01ebe222: pop    eax
  0x01ebe223: mov    esi,esp
  0x01ebe225: sub    esp,0x10
  0x01ebe228: mov    DWORD PTR [esp+0xc],ecx
  0x01ebe22c: mov    DWORD PTR [esp+0x8],edx
  0x01ebe230: movss  DWORD PTR [esp+0x4],xmm0
  0x01ebe236: mov    edi,DWORD PTR [esp+0x10]
  0x01ebe23a: mov    DWORD PTR [esp],edi
  0x01ebe23d: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebe240: push   eax
  0x01ebe241: jmp    ecx

AHE@0x0422c324: 0xbe6a0000 i2c: 0x01ebe2f0 c2i: 0x01ebe3ac c2iUV: 0x01ebe38b
i2c argument handler #58 for: static (JFZ)V (283 bytes generated)
c2i argument handler starts at 01EBE3AC
  0x01ebe2f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebe2f3: mov    edi,0x1dc2940
  0x01ebe2f8: cmp    eax,edi
  0x01ebe2fa: jbe    0x01ebe30d
  0x01ebe300: mov    edi,0x1ea2940
  0x01ebe305: cmp    eax,edi
  0x01ebe307: jb     0x01ebe352
  0x01ebe30d: mov    edi,0x1dc0340
  0x01ebe312: cmp    eax,edi
  0x01ebe314: jbe    0x01ebe327
  0x01ebe31a: mov    edi,0x1dc2668
  0x01ebe31f: cmp    eax,edi
  0x01ebe321: jb     0x01ebe352
  0x01ebe327: mov    edi,0x1ead380
  0x01ebe32c: cmp    eax,edi
  0x01ebe32e: jbe    0x01ebe341
  0x01ebe334: mov    edi,0x1eb2970
  0x01ebe339: cmp    eax,edi
  0x01ebe33b: jb     0x01ebe352
  ;; i2c adapter must return to an interpreter frame
  0x01ebe341: push   0x5531723c
  0x01ebe346: call   0x01ebe34b
  0x01ebe34b: pusha  
  0x01ebe34c: call   0x54dedbf0
  0x01ebe351: hlt    
  ;; } verify_i2ce 
  0x01ebe352: mov    edi,esp
  0x01ebe354: sub    esp,0x8
  0x01ebe357: and    esp,0xfffffff0
  0x01ebe35a: push   eax
  0x01ebe35b: mov    eax,edi
  0x01ebe35d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebe360: mov    esi,DWORD PTR [eax+0xc]
  0x01ebe363: mov    DWORD PTR [esp+0x4],esi
  0x01ebe367: mov    esi,DWORD PTR [eax+0x10]
  0x01ebe36a: mov    DWORD PTR [esp+0x8],esi
  0x01ebe36e: movss  xmm0,DWORD PTR [eax+0x8]
  0x01ebe373: mov    ecx,DWORD PTR [eax+0x4]
  0x01ebe376: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebe37e: mov    eax,DWORD PTR [eax-0xc]
  0x01ebe381: mov    DWORD PTR [eax+0x168],ebx
  0x01ebe387: mov    eax,ebx
  0x01ebe389: jmp    edi
  0x01ebe38b: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebe38e: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebe391: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebe394: jne    0x01ebe3a7
  0x01ebe39a: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe3a1: je     0x01ebe3e6
  0x01ebe3a7: jmp    0x01ea32d0
  0x01ebe3ac: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe3b3: je     0x01ebe3e6
  0x01ebe3b9: mov    eax,DWORD PTR [esp]
  0x01ebe3bc: pusha  
  0x01ebe3bd: pushf  
  0x01ebe3be: sub    esp,0x10
  0x01ebe3c1: movsd  QWORD PTR [esp],xmm0
  0x01ebe3c6: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebe3cc: push   eax
  0x01ebe3cd: push   ebx
  0x01ebe3ce: call   0x552179d0
  0x01ebe3d3: add    esp,0x8
  0x01ebe3d6: movsd  xmm0,QWORD PTR [esp]
  0x01ebe3db: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebe3e1: add    esp,0x10
  0x01ebe3e4: popf   
  0x01ebe3e5: popa   
  0x01ebe3e6: pop    eax
  0x01ebe3e7: mov    esi,esp
  0x01ebe3e9: sub    esp,0x10
  0x01ebe3ec: mov    edi,DWORD PTR [esp+0x10]
  0x01ebe3f0: mov    DWORD PTR [esp+0x8],edi
  0x01ebe3f4: mov    edi,DWORD PTR [esp+0x14]
  0x01ebe3f8: mov    DWORD PTR [esp+0xc],edi
  0x01ebe3fc: movss  DWORD PTR [esp+0x4],xmm0
  0x01ebe402: mov    DWORD PTR [esp],ecx
  0x01ebe405: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebe408: push   eax
  0x01ebe409: jmp    ecx

AHE@0x0422c350: 0xbebea000 i2c: 0x01ebe4b0 c2i: 0x01ebe575 c2iUV: 0x01ebe554
i2c argument handler #59 for: static (JJZ)V (302 bytes generated)
c2i argument handler starts at 01EBE575
  0x01ebe4b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebe4b3: mov    edi,0x1dc2940
  0x01ebe4b8: cmp    eax,edi
  0x01ebe4ba: jbe    0x01ebe4cd
  0x01ebe4c0: mov    edi,0x1ea2940
  0x01ebe4c5: cmp    eax,edi
  0x01ebe4c7: jb     0x01ebe512
  0x01ebe4cd: mov    edi,0x1dc0340
  0x01ebe4d2: cmp    eax,edi
  0x01ebe4d4: jbe    0x01ebe4e7
  0x01ebe4da: mov    edi,0x1dc2668
  0x01ebe4df: cmp    eax,edi
  0x01ebe4e1: jb     0x01ebe512
  0x01ebe4e7: mov    edi,0x1ead380
  0x01ebe4ec: cmp    eax,edi
  0x01ebe4ee: jbe    0x01ebe501
  0x01ebe4f4: mov    edi,0x1eb2970
  0x01ebe4f9: cmp    eax,edi
  0x01ebe4fb: jb     0x01ebe512
  ;; i2c adapter must return to an interpreter frame
  0x01ebe501: push   0x5531723c
  0x01ebe506: call   0x01ebe50b
  0x01ebe50b: pusha  
  0x01ebe50c: call   0x54dedbf0
  0x01ebe511: hlt    
  ;; } verify_i2ce 
  0x01ebe512: mov    edi,esp
  0x01ebe514: sub    esp,0x10
  0x01ebe517: and    esp,0xfffffff0
  0x01ebe51a: push   eax
  0x01ebe51b: mov    eax,edi
  0x01ebe51d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebe520: mov    esi,DWORD PTR [eax+0x10]
  0x01ebe523: mov    DWORD PTR [esp+0x4],esi
  0x01ebe527: mov    esi,DWORD PTR [eax+0x14]
  0x01ebe52a: mov    DWORD PTR [esp+0x8],esi
  0x01ebe52e: mov    esi,DWORD PTR [eax+0x8]
  0x01ebe531: mov    DWORD PTR [esp+0xc],esi
  0x01ebe535: mov    esi,DWORD PTR [eax+0xc]
  0x01ebe538: mov    DWORD PTR [esp+0x10],esi
  0x01ebe53c: mov    ecx,DWORD PTR [eax+0x4]
  0x01ebe53f: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebe547: mov    eax,DWORD PTR [eax-0xc]
  0x01ebe54a: mov    DWORD PTR [eax+0x168],ebx
  0x01ebe550: mov    eax,ebx
  0x01ebe552: jmp    edi
  0x01ebe554: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebe557: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebe55a: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebe55d: jne    0x01ebe570
  0x01ebe563: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe56a: je     0x01ebe5af
  0x01ebe570: jmp    0x01ea32d0
  0x01ebe575: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe57c: je     0x01ebe5af
  0x01ebe582: mov    eax,DWORD PTR [esp]
  0x01ebe585: pusha  
  0x01ebe586: pushf  
  0x01ebe587: sub    esp,0x10
  0x01ebe58a: movsd  QWORD PTR [esp],xmm0
  0x01ebe58f: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebe595: push   eax
  0x01ebe596: push   ebx
  0x01ebe597: call   0x552179d0
  0x01ebe59c: add    esp,0x8
  0x01ebe59f: movsd  xmm0,QWORD PTR [esp]
  0x01ebe5a4: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebe5aa: add    esp,0x10
  0x01ebe5ad: popf   
  0x01ebe5ae: popa   
  0x01ebe5af: pop    eax
  0x01ebe5b0: mov    esi,esp
  0x01ebe5b2: sub    esp,0x14
  0x01ebe5b5: mov    edi,DWORD PTR [esp+0x14]
  0x01ebe5b9: mov    DWORD PTR [esp+0xc],edi
  0x01ebe5bd: mov    edi,DWORD PTR [esp+0x18]
  0x01ebe5c1: mov    DWORD PTR [esp+0x10],edi
  0x01ebe5c5: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebe5c9: mov    DWORD PTR [esp+0x4],edi
  0x01ebe5cd: mov    edi,DWORD PTR [esp+0x20]
  0x01ebe5d1: mov    DWORD PTR [esp+0x8],edi
  0x01ebe5d5: mov    DWORD PTR [esp],ecx
  0x01ebe5d8: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebe5db: push   eax
  0x01ebe5dc: jmp    ecx

AHE@0x0422c37c: 0xbeaa0000 i2c: 0x01ebe670 c2i: 0x01ebe72a c2iUV: 0x01ebe709
i2c argument handler #60 for: static (JIZ)V (279 bytes generated)
c2i argument handler starts at 01EBE72A
  0x01ebe670: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebe673: mov    edi,0x1dc2940
  0x01ebe678: cmp    eax,edi
  0x01ebe67a: jbe    0x01ebe68d
  0x01ebe680: mov    edi,0x1ea2940
  0x01ebe685: cmp    eax,edi
  0x01ebe687: jb     0x01ebe6d2
  0x01ebe68d: mov    edi,0x1dc0340
  0x01ebe692: cmp    eax,edi
  0x01ebe694: jbe    0x01ebe6a7
  0x01ebe69a: mov    edi,0x1dc2668
  0x01ebe69f: cmp    eax,edi
  0x01ebe6a1: jb     0x01ebe6d2
  0x01ebe6a7: mov    edi,0x1ead380
  0x01ebe6ac: cmp    eax,edi
  0x01ebe6ae: jbe    0x01ebe6c1
  0x01ebe6b4: mov    edi,0x1eb2970
  0x01ebe6b9: cmp    eax,edi
  0x01ebe6bb: jb     0x01ebe6d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebe6c1: push   0x5531723c
  0x01ebe6c6: call   0x01ebe6cb
  0x01ebe6cb: pusha  
  0x01ebe6cc: call   0x54dedbf0
  0x01ebe6d1: hlt    
  ;; } verify_i2ce 
  0x01ebe6d2: mov    edi,esp
  0x01ebe6d4: sub    esp,0x8
  0x01ebe6d7: and    esp,0xfffffff0
  0x01ebe6da: push   eax
  0x01ebe6db: mov    eax,edi
  0x01ebe6dd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebe6e0: mov    esi,DWORD PTR [eax+0xc]
  0x01ebe6e3: mov    DWORD PTR [esp+0x4],esi
  0x01ebe6e7: mov    esi,DWORD PTR [eax+0x10]
  0x01ebe6ea: mov    DWORD PTR [esp+0x8],esi
  0x01ebe6ee: mov    ecx,DWORD PTR [eax+0x8]
  0x01ebe6f1: mov    edx,DWORD PTR [eax+0x4]
  0x01ebe6f4: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebe6fc: mov    eax,DWORD PTR [eax-0xc]
  0x01ebe6ff: mov    DWORD PTR [eax+0x168],ebx
  0x01ebe705: mov    eax,ebx
  0x01ebe707: jmp    edi
  0x01ebe709: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebe70c: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebe70f: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebe712: jne    0x01ebe725
  0x01ebe718: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe71f: je     0x01ebe764
  0x01ebe725: jmp    0x01ea32d0
  0x01ebe72a: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe731: je     0x01ebe764
  0x01ebe737: mov    eax,DWORD PTR [esp]
  0x01ebe73a: pusha  
  0x01ebe73b: pushf  
  0x01ebe73c: sub    esp,0x10
  0x01ebe73f: movsd  QWORD PTR [esp],xmm0
  0x01ebe744: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebe74a: push   eax
  0x01ebe74b: push   ebx
  0x01ebe74c: call   0x552179d0
  0x01ebe751: add    esp,0x8
  0x01ebe754: movsd  xmm0,QWORD PTR [esp]
  0x01ebe759: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebe75f: add    esp,0x10
  0x01ebe762: popf   
  0x01ebe763: popa   
  0x01ebe764: pop    eax
  0x01ebe765: mov    esi,esp
  0x01ebe767: sub    esp,0x10
  0x01ebe76a: mov    edi,DWORD PTR [esp+0x10]
  0x01ebe76e: mov    DWORD PTR [esp+0x8],edi
  0x01ebe772: mov    edi,DWORD PTR [esp+0x14]
  0x01ebe776: mov    DWORD PTR [esp+0xc],edi
  0x01ebe77a: mov    DWORD PTR [esp+0x4],ecx
  0x01ebe77e: mov    DWORD PTR [esp],edx
  0x01ebe781: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebe784: push   eax
  0x01ebe785: jmp    ecx

AHE@0x0422c3a8: 0xabeaa000 i2c: 0x01ebe830 c2i: 0x01ebe8f1 c2iUV: 0x01ebe8d0
i2c argument handler #61 for: receiver (JILjava/lang/Object;)Ljava/nio/ByteBuffer; (294 bytes generated)
c2i argument handler starts at 01EBE8F1
  0x01ebe830: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebe833: mov    edi,0x1dc2940
  0x01ebe838: cmp    eax,edi
  0x01ebe83a: jbe    0x01ebe84d
  0x01ebe840: mov    edi,0x1ea2940
  0x01ebe845: cmp    eax,edi
  0x01ebe847: jb     0x01ebe892
  0x01ebe84d: mov    edi,0x1dc0340
  0x01ebe852: cmp    eax,edi
  0x01ebe854: jbe    0x01ebe867
  0x01ebe85a: mov    edi,0x1dc2668
  0x01ebe85f: cmp    eax,edi
  0x01ebe861: jb     0x01ebe892
  0x01ebe867: mov    edi,0x1ead380
  0x01ebe86c: cmp    eax,edi
  0x01ebe86e: jbe    0x01ebe881
  0x01ebe874: mov    edi,0x1eb2970
  0x01ebe879: cmp    eax,edi
  0x01ebe87b: jb     0x01ebe892
  ;; i2c adapter must return to an interpreter frame
  0x01ebe881: push   0x5531723c
  0x01ebe886: call   0x01ebe88b
  0x01ebe88b: pusha  
  0x01ebe88c: call   0x54dedbf0
  0x01ebe891: hlt    
  ;; } verify_i2ce 
  0x01ebe892: mov    edi,esp
  0x01ebe894: sub    esp,0x10
  0x01ebe897: and    esp,0xfffffff0
  0x01ebe89a: push   eax
  0x01ebe89b: mov    eax,edi
  0x01ebe89d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebe8a0: mov    ecx,DWORD PTR [eax+0x14]
  0x01ebe8a3: mov    esi,DWORD PTR [eax+0xc]
  0x01ebe8a6: mov    DWORD PTR [esp+0x4],esi
  0x01ebe8aa: mov    esi,DWORD PTR [eax+0x10]
  0x01ebe8ad: mov    DWORD PTR [esp+0x8],esi
  0x01ebe8b1: mov    edx,DWORD PTR [eax+0x8]
  0x01ebe8b4: mov    esi,DWORD PTR [eax+0x4]
  0x01ebe8b7: mov    DWORD PTR [esp+0xc],esi
  0x01ebe8bb: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebe8c3: mov    eax,DWORD PTR [eax-0xc]
  0x01ebe8c6: mov    DWORD PTR [eax+0x168],ebx
  0x01ebe8cc: mov    eax,ebx
  0x01ebe8ce: jmp    edi
  0x01ebe8d0: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebe8d3: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebe8d6: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebe8d9: jne    0x01ebe8ec
  0x01ebe8df: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe8e6: je     0x01ebe92b
  0x01ebe8ec: jmp    0x01ea32d0
  0x01ebe8f1: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebe8f8: je     0x01ebe92b
  0x01ebe8fe: mov    eax,DWORD PTR [esp]
  0x01ebe901: pusha  
  0x01ebe902: pushf  
  0x01ebe903: sub    esp,0x10
  0x01ebe906: movsd  QWORD PTR [esp],xmm0
  0x01ebe90b: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebe911: push   eax
  0x01ebe912: push   ebx
  0x01ebe913: call   0x552179d0
  0x01ebe918: add    esp,0x8
  0x01ebe91b: movsd  xmm0,QWORD PTR [esp]
  0x01ebe920: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebe926: add    esp,0x10
  0x01ebe929: popf   
  0x01ebe92a: popa   
  0x01ebe92b: pop    eax
  0x01ebe92c: mov    esi,esp
  0x01ebe92e: sub    esp,0x14
  0x01ebe931: mov    DWORD PTR [esp+0x10],ecx
  0x01ebe935: mov    edi,DWORD PTR [esp+0x14]
  0x01ebe939: mov    DWORD PTR [esp+0x8],edi
  0x01ebe93d: mov    edi,DWORD PTR [esp+0x18]
  0x01ebe941: mov    DWORD PTR [esp+0xc],edi
  0x01ebe945: mov    DWORD PTR [esp+0x4],edx
  0x01ebe949: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebe94d: mov    DWORD PTR [esp],edi
  0x01ebe950: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebe953: push   eax
  0x01ebe954: jmp    ecx

AHE@0x0422c3d4: 0xabeabea0 i2c: 0x01ebe9f0 c2i: 0x01ebeabf c2iUV: 0x01ebea9e
i2c argument handler #62 for: receiver (JLjava/util/function/ToLongFunction;JLjava/util/function/LongBinaryOperator;)J (324 bytes generated)
c2i argument handler starts at 01EBEABF
  0x01ebe9f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebe9f3: mov    edi,0x1dc2940
  0x01ebe9f8: cmp    eax,edi
  0x01ebe9fa: jbe    0x01ebea0d
  0x01ebea00: mov    edi,0x1ea2940
  0x01ebea05: cmp    eax,edi
  0x01ebea07: jb     0x01ebea52
  0x01ebea0d: mov    edi,0x1dc0340
  0x01ebea12: cmp    eax,edi
  0x01ebea14: jbe    0x01ebea27
  0x01ebea1a: mov    edi,0x1dc2668
  0x01ebea1f: cmp    eax,edi
  0x01ebea21: jb     0x01ebea52
  0x01ebea27: mov    edi,0x1ead380
  0x01ebea2c: cmp    eax,edi
  0x01ebea2e: jbe    0x01ebea41
  0x01ebea34: mov    edi,0x1eb2970
  0x01ebea39: cmp    eax,edi
  0x01ebea3b: jb     0x01ebea52
  ;; i2c adapter must return to an interpreter frame
  0x01ebea41: push   0x5531723c
  0x01ebea46: call   0x01ebea4b
  0x01ebea4b: pusha  
  0x01ebea4c: call   0x54dedbf0
  0x01ebea51: hlt    
  ;; } verify_i2ce 
  0x01ebea52: mov    edi,esp
  0x01ebea54: sub    esp,0x18
  0x01ebea57: and    esp,0xfffffff0
  0x01ebea5a: push   eax
  0x01ebea5b: mov    eax,edi
  0x01ebea5d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebea60: mov    ecx,DWORD PTR [eax+0x1c]
  0x01ebea63: mov    esi,DWORD PTR [eax+0x14]
  0x01ebea66: mov    DWORD PTR [esp+0x4],esi
  0x01ebea6a: mov    esi,DWORD PTR [eax+0x18]
  0x01ebea6d: mov    DWORD PTR [esp+0x8],esi
  0x01ebea71: mov    edx,DWORD PTR [eax+0x10]
  0x01ebea74: mov    esi,DWORD PTR [eax+0x8]
  0x01ebea77: mov    DWORD PTR [esp+0xc],esi
  0x01ebea7b: mov    esi,DWORD PTR [eax+0xc]
  0x01ebea7e: mov    DWORD PTR [esp+0x10],esi
  0x01ebea82: mov    esi,DWORD PTR [eax+0x4]
  0x01ebea85: mov    DWORD PTR [esp+0x14],esi
  0x01ebea89: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebea91: mov    eax,DWORD PTR [eax-0xc]
  0x01ebea94: mov    DWORD PTR [eax+0x168],ebx
  0x01ebea9a: mov    eax,ebx
  0x01ebea9c: jmp    edi
  0x01ebea9e: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebeaa1: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebeaa4: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebeaa7: jne    0x01ebeaba
  0x01ebeaad: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebeab4: je     0x01ebeaf9
  0x01ebeaba: jmp    0x01ea32d0
  0x01ebeabf: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebeac6: je     0x01ebeaf9
  0x01ebeacc: mov    eax,DWORD PTR [esp]
  0x01ebeacf: pusha  
  0x01ebead0: pushf  
  0x01ebead1: sub    esp,0x10
  0x01ebead4: movsd  QWORD PTR [esp],xmm0
  0x01ebead9: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebeadf: push   eax
  0x01ebeae0: push   ebx
  0x01ebeae1: call   0x552179d0
  0x01ebeae6: add    esp,0x8
  0x01ebeae9: movsd  xmm0,QWORD PTR [esp]
  0x01ebeaee: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebeaf4: add    esp,0x10
  0x01ebeaf7: popf   
  0x01ebeaf8: popa   
  0x01ebeaf9: pop    eax
  0x01ebeafa: mov    esi,esp
  0x01ebeafc: sub    esp,0x1c
  0x01ebeaff: mov    DWORD PTR [esp+0x18],ecx
  0x01ebeb03: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebeb07: mov    DWORD PTR [esp+0x10],edi
  0x01ebeb0b: mov    edi,DWORD PTR [esp+0x20]
  0x01ebeb0f: mov    DWORD PTR [esp+0x14],edi
  0x01ebeb13: mov    DWORD PTR [esp+0xc],edx
  0x01ebeb17: mov    edi,DWORD PTR [esp+0x24]
  0x01ebeb1b: mov    DWORD PTR [esp+0x4],edi
  0x01ebeb1f: mov    edi,DWORD PTR [esp+0x28]
  0x01ebeb23: mov    DWORD PTR [esp+0x8],edi
  0x01ebeb27: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebeb2b: mov    DWORD PTR [esp],edi
  0x01ebeb2e: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebeb31: push   eax
  0x01ebeb32: jmp    ecx

AHE@0x0422c400: 0xabeaaa00 i2c: 0x01ebebb0 c2i: 0x01ebec78 c2iUV: 0x01ebec57
i2c argument handler #63 for: receiver (JLjava/util/function/ToIntFunction;ILjava/util/function/IntBinaryOperator;)I (309 bytes generated)
c2i argument handler starts at 01EBEC78
  0x01ebebb0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebebb3: mov    edi,0x1dc2940
  0x01ebebb8: cmp    eax,edi
  0x01ebebba: jbe    0x01ebebcd
  0x01ebebc0: mov    edi,0x1ea2940
  0x01ebebc5: cmp    eax,edi
  0x01ebebc7: jb     0x01ebec12
  0x01ebebcd: mov    edi,0x1dc0340
  0x01ebebd2: cmp    eax,edi
  0x01ebebd4: jbe    0x01ebebe7
  0x01ebebda: mov    edi,0x1dc2668
  0x01ebebdf: cmp    eax,edi
  0x01ebebe1: jb     0x01ebec12
  0x01ebebe7: mov    edi,0x1ead380
  0x01ebebec: cmp    eax,edi
  0x01ebebee: jbe    0x01ebec01
  0x01ebebf4: mov    edi,0x1eb2970
  0x01ebebf9: cmp    eax,edi
  0x01ebebfb: jb     0x01ebec12
  ;; i2c adapter must return to an interpreter frame
  0x01ebec01: push   0x5531723c
  0x01ebec06: call   0x01ebec0b
  0x01ebec0b: pusha  
  0x01ebec0c: call   0x54dedbf0
  0x01ebec11: hlt    
  ;; } verify_i2ce 
  0x01ebec12: mov    edi,esp
  0x01ebec14: sub    esp,0x10
  0x01ebec17: and    esp,0xfffffff0
  0x01ebec1a: push   eax
  0x01ebec1b: mov    eax,edi
  0x01ebec1d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebec20: mov    ecx,DWORD PTR [eax+0x18]
  0x01ebec23: mov    esi,DWORD PTR [eax+0x10]
  0x01ebec26: mov    DWORD PTR [esp+0x4],esi
  0x01ebec2a: mov    esi,DWORD PTR [eax+0x14]
  0x01ebec2d: mov    DWORD PTR [esp+0x8],esi
  0x01ebec31: mov    edx,DWORD PTR [eax+0xc]
  0x01ebec34: mov    esi,DWORD PTR [eax+0x8]
  0x01ebec37: mov    DWORD PTR [esp+0xc],esi
  0x01ebec3b: mov    esi,DWORD PTR [eax+0x4]
  0x01ebec3e: mov    DWORD PTR [esp+0x10],esi
  0x01ebec42: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebec4a: mov    eax,DWORD PTR [eax-0xc]
  0x01ebec4d: mov    DWORD PTR [eax+0x168],ebx
  0x01ebec53: mov    eax,ebx
  0x01ebec55: jmp    edi
  0x01ebec57: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebec5a: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebec5d: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebec60: jne    0x01ebec73
  0x01ebec66: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebec6d: je     0x01ebecb2
  0x01ebec73: jmp    0x01ea32d0
  0x01ebec78: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebec7f: je     0x01ebecb2
  0x01ebec85: mov    eax,DWORD PTR [esp]
  0x01ebec88: pusha  
  0x01ebec89: pushf  
  0x01ebec8a: sub    esp,0x10
  0x01ebec8d: movsd  QWORD PTR [esp],xmm0
  0x01ebec92: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebec98: push   eax
  0x01ebec99: push   ebx
  0x01ebec9a: call   0x552179d0
  0x01ebec9f: add    esp,0x8
  0x01ebeca2: movsd  xmm0,QWORD PTR [esp]
  0x01ebeca7: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebecad: add    esp,0x10
  0x01ebecb0: popf   
  0x01ebecb1: popa   
  0x01ebecb2: pop    eax
  0x01ebecb3: mov    esi,esp
  0x01ebecb5: sub    esp,0x18
  0x01ebecb8: mov    DWORD PTR [esp+0x14],ecx
  0x01ebecbc: mov    edi,DWORD PTR [esp+0x18]
  0x01ebecc0: mov    DWORD PTR [esp+0xc],edi
  0x01ebecc4: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebecc8: mov    DWORD PTR [esp+0x10],edi
  0x01ebeccc: mov    DWORD PTR [esp+0x8],edx
  0x01ebecd0: mov    edi,DWORD PTR [esp+0x20]
  0x01ebecd4: mov    DWORD PTR [esp+0x4],edi
  0x01ebecd8: mov    edi,DWORD PTR [esp+0x24]
  0x01ebecdc: mov    DWORD PTR [esp],edi
  0x01ebecdf: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebece2: push   eax
  0x01ebece3: jmp    ecx

AHE@0x0422c42c: 0xabea7ea0 i2c: 0x01ebed70 c2i: 0x01ebee36 c2iUV: 0x01ebee15
i2c argument handler #64 for: receiver (JLjava/util/function/ToDoubleFunction;DLjava/util/function/DoubleBinaryOperator;)D (305 bytes generated)
c2i argument handler starts at 01EBEE36
  0x01ebed70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebed73: mov    edi,0x1dc2940
  0x01ebed78: cmp    eax,edi
  0x01ebed7a: jbe    0x01ebed8d
  0x01ebed80: mov    edi,0x1ea2940
  0x01ebed85: cmp    eax,edi
  0x01ebed87: jb     0x01ebedd2
  0x01ebed8d: mov    edi,0x1dc0340
  0x01ebed92: cmp    eax,edi
  0x01ebed94: jbe    0x01ebeda7
  0x01ebed9a: mov    edi,0x1dc2668
  0x01ebed9f: cmp    eax,edi
  0x01ebeda1: jb     0x01ebedd2
  0x01ebeda7: mov    edi,0x1ead380
  0x01ebedac: cmp    eax,edi
  0x01ebedae: jbe    0x01ebedc1
  0x01ebedb4: mov    edi,0x1eb2970
  0x01ebedb9: cmp    eax,edi
  0x01ebedbb: jb     0x01ebedd2
  ;; i2c adapter must return to an interpreter frame
  0x01ebedc1: push   0x5531723c
  0x01ebedc6: call   0x01ebedcb
  0x01ebedcb: pusha  
  0x01ebedcc: call   0x54dedbf0
  0x01ebedd1: hlt    
  ;; } verify_i2ce 
  0x01ebedd2: mov    edi,esp
  0x01ebedd4: sub    esp,0x10
  0x01ebedd7: and    esp,0xfffffff0
  0x01ebedda: push   eax
  0x01ebeddb: mov    eax,edi
  0x01ebeddd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebede0: mov    ecx,DWORD PTR [eax+0x1c]
  0x01ebede3: mov    esi,DWORD PTR [eax+0x14]
  0x01ebede6: mov    DWORD PTR [esp+0x4],esi
  0x01ebedea: mov    esi,DWORD PTR [eax+0x18]
  0x01ebeded: mov    DWORD PTR [esp+0x8],esi
  0x01ebedf1: mov    edx,DWORD PTR [eax+0x10]
  0x01ebedf4: movsd  xmm0,QWORD PTR [eax+0x8]
  0x01ebedf9: mov    esi,DWORD PTR [eax+0x4]
  0x01ebedfc: mov    DWORD PTR [esp+0xc],esi
  0x01ebee00: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebee08: mov    eax,DWORD PTR [eax-0xc]
  0x01ebee0b: mov    DWORD PTR [eax+0x168],ebx
  0x01ebee11: mov    eax,ebx
  0x01ebee13: jmp    edi
  0x01ebee15: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebee18: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebee1b: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebee1e: jne    0x01ebee31
  0x01ebee24: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebee2b: je     0x01ebee70
  0x01ebee31: jmp    0x01ea32d0
  0x01ebee36: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebee3d: je     0x01ebee70
  0x01ebee43: mov    eax,DWORD PTR [esp]
  0x01ebee46: pusha  
  0x01ebee47: pushf  
  0x01ebee48: sub    esp,0x10
  0x01ebee4b: movsd  QWORD PTR [esp],xmm0
  0x01ebee50: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebee56: push   eax
  0x01ebee57: push   ebx
  0x01ebee58: call   0x552179d0
  0x01ebee5d: add    esp,0x8
  0x01ebee60: movsd  xmm0,QWORD PTR [esp]
  0x01ebee65: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebee6b: add    esp,0x10
  0x01ebee6e: popf   
  0x01ebee6f: popa   
  0x01ebee70: pop    eax
  0x01ebee71: mov    esi,esp
  0x01ebee73: sub    esp,0x1c
  0x01ebee76: mov    DWORD PTR [esp+0x18],ecx
  0x01ebee7a: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebee7e: mov    DWORD PTR [esp+0x10],edi
  0x01ebee82: mov    edi,DWORD PTR [esp+0x20]
  0x01ebee86: mov    DWORD PTR [esp+0x14],edi
  0x01ebee8a: mov    DWORD PTR [esp+0xc],edx
  0x01ebee8e: movsd  QWORD PTR [esp+0x4],xmm0
  0x01ebee94: mov    edi,DWORD PTR [esp+0x24]
  0x01ebee98: mov    DWORD PTR [esp],edi
  0x01ebee9b: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebee9e: push   eax
  0x01ebee9f: jmp    ecx

AHE@0x0422c458: 0xbeaaaa00 i2c: 0x01ebef30 c2i: 0x01ebeff8 c2iUV: 0x01ebefd7
i2c argument handler #65 for: static (JI[CII)I (309 bytes generated)
c2i argument handler starts at 01EBEFF8
  0x01ebef30: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebef33: mov    edi,0x1dc2940
  0x01ebef38: cmp    eax,edi
  0x01ebef3a: jbe    0x01ebef4d
  0x01ebef40: mov    edi,0x1ea2940
  0x01ebef45: cmp    eax,edi
  0x01ebef47: jb     0x01ebef92
  0x01ebef4d: mov    edi,0x1dc0340
  0x01ebef52: cmp    eax,edi
  0x01ebef54: jbe    0x01ebef67
  0x01ebef5a: mov    edi,0x1dc2668
  0x01ebef5f: cmp    eax,edi
  0x01ebef61: jb     0x01ebef92
  0x01ebef67: mov    edi,0x1ead380
  0x01ebef6c: cmp    eax,edi
  0x01ebef6e: jbe    0x01ebef81
  0x01ebef74: mov    edi,0x1eb2970
  0x01ebef79: cmp    eax,edi
  0x01ebef7b: jb     0x01ebef92
  ;; i2c adapter must return to an interpreter frame
  0x01ebef81: push   0x5531723c
  0x01ebef86: call   0x01ebef8b
  0x01ebef8b: pusha  
  0x01ebef8c: call   0x54dedbf0
  0x01ebef91: hlt    
  ;; } verify_i2ce 
  0x01ebef92: mov    edi,esp
  0x01ebef94: sub    esp,0x10
  0x01ebef97: and    esp,0xfffffff0
  0x01ebef9a: push   eax
  0x01ebef9b: mov    eax,edi
  0x01ebef9d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebefa0: mov    esi,DWORD PTR [eax+0x14]
  0x01ebefa3: mov    DWORD PTR [esp+0x4],esi
  0x01ebefa7: mov    esi,DWORD PTR [eax+0x18]
  0x01ebefaa: mov    DWORD PTR [esp+0x8],esi
  0x01ebefae: mov    ecx,DWORD PTR [eax+0x10]
  0x01ebefb1: mov    edx,DWORD PTR [eax+0xc]
  0x01ebefb4: mov    esi,DWORD PTR [eax+0x8]
  0x01ebefb7: mov    DWORD PTR [esp+0xc],esi
  0x01ebefbb: mov    esi,DWORD PTR [eax+0x4]
  0x01ebefbe: mov    DWORD PTR [esp+0x10],esi
  0x01ebefc2: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebefca: mov    eax,DWORD PTR [eax-0xc]
  0x01ebefcd: mov    DWORD PTR [eax+0x168],ebx
  0x01ebefd3: mov    eax,ebx
  0x01ebefd5: jmp    edi
  0x01ebefd7: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebefda: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebefdd: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebefe0: jne    0x01ebeff3
  0x01ebefe6: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebefed: je     0x01ebf032
  0x01ebeff3: jmp    0x01ea32d0
  0x01ebeff8: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebefff: je     0x01ebf032
  0x01ebf005: mov    eax,DWORD PTR [esp]
  0x01ebf008: pusha  
  0x01ebf009: pushf  
  0x01ebf00a: sub    esp,0x10
  0x01ebf00d: movsd  QWORD PTR [esp],xmm0
  0x01ebf012: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebf018: push   eax
  0x01ebf019: push   ebx
  0x01ebf01a: call   0x552179d0
  0x01ebf01f: add    esp,0x8
  0x01ebf022: movsd  xmm0,QWORD PTR [esp]
  0x01ebf027: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebf02d: add    esp,0x10
  0x01ebf030: popf   
  0x01ebf031: popa   
  0x01ebf032: pop    eax
  0x01ebf033: mov    esi,esp
  0x01ebf035: sub    esp,0x18
  0x01ebf038: mov    edi,DWORD PTR [esp+0x18]
  0x01ebf03c: mov    DWORD PTR [esp+0x10],edi
  0x01ebf040: mov    edi,DWORD PTR [esp+0x1c]
  0x01ebf044: mov    DWORD PTR [esp+0x14],edi
  0x01ebf048: mov    DWORD PTR [esp+0xc],ecx
  0x01ebf04c: mov    DWORD PTR [esp+0x8],edx
  0x01ebf050: mov    edi,DWORD PTR [esp+0x20]
  0x01ebf054: mov    DWORD PTR [esp+0x4],edi
  0x01ebf058: mov    edi,DWORD PTR [esp+0x24]
  0x01ebf05c: mov    DWORD PTR [esp],edi
  0x01ebf05f: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebf062: push   eax
  0x01ebf063: jmp    ecx

AHE@0x0422c484: 0xaaaaaaaaaa000000 i2c: 0x01ebf0f0 c2i: 0x01ebf1d4 c2iUV: 0x01ebf1b3
i2c argument handler #66 for: receiver (Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V (369 bytes generated)
c2i argument handler starts at 01EBF1D4
  0x01ebf0f0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01ebf0f3: mov    edi,0x1dc2940
  0x01ebf0f8: cmp    eax,edi
  0x01ebf0fa: jbe    0x01ebf10d
  0x01ebf100: mov    edi,0x1ea2940
  0x01ebf105: cmp    eax,edi
  0x01ebf107: jb     0x01ebf152
  0x01ebf10d: mov    edi,0x1dc0340
  0x01ebf112: cmp    eax,edi
  0x01ebf114: jbe    0x01ebf127
  0x01ebf11a: mov    edi,0x1dc2668
  0x01ebf11f: cmp    eax,edi
  0x01ebf121: jb     0x01ebf152
  0x01ebf127: mov    edi,0x1ead380
  0x01ebf12c: cmp    eax,edi
  0x01ebf12e: jbe    0x01ebf141
  0x01ebf134: mov    edi,0x1eb2970
  0x01ebf139: cmp    eax,edi
  0x01ebf13b: jb     0x01ebf152
  ;; i2c adapter must return to an interpreter frame
  0x01ebf141: push   0x5531723c
  0x01ebf146: call   0x01ebf14b
  0x01ebf14b: pusha  
  0x01ebf14c: call   0x54dedbf0
  0x01ebf151: hlt    
  ;; } verify_i2ce 
  0x01ebf152: mov    edi,esp
  0x01ebf154: sub    esp,0x20
  0x01ebf157: and    esp,0xfffffff0
  0x01ebf15a: push   eax
  0x01ebf15b: mov    eax,edi
  0x01ebf15d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01ebf160: mov    ecx,DWORD PTR [eax+0x28]
  0x01ebf163: mov    edx,DWORD PTR [eax+0x24]
  0x01ebf166: mov    esi,DWORD PTR [eax+0x20]
  0x01ebf169: mov    DWORD PTR [esp+0x4],esi
  0x01ebf16d: mov    esi,DWORD PTR [eax+0x1c]
  0x01ebf170: mov    DWORD PTR [esp+0x8],esi
  0x01ebf174: mov    esi,DWORD PTR [eax+0x18]
  0x01ebf177: mov    DWORD PTR [esp+0xc],esi
  0x01ebf17b: mov    esi,DWORD PTR [eax+0x14]
  0x01ebf17e: mov    DWORD PTR [esp+0x10],esi
  0x01ebf182: mov    esi,DWORD PTR [eax+0x10]
  0x01ebf185: mov    DWORD PTR [esp+0x14],esi
  0x01ebf189: mov    esi,DWORD PTR [eax+0xc]
  0x01ebf18c: mov    DWORD PTR [esp+0x18],esi
  0x01ebf190: mov    esi,DWORD PTR [eax+0x8]
  0x01ebf193: mov    DWORD PTR [esp+0x1c],esi
  0x01ebf197: mov    esi,DWORD PTR [eax+0x4]
  0x01ebf19a: mov    DWORD PTR [esp+0x20],esi
  0x01ebf19e: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01ebf1a6: mov    eax,DWORD PTR [eax-0xc]
  0x01ebf1a9: mov    DWORD PTR [eax+0x168],ebx
  0x01ebf1af: mov    eax,ebx
  0x01ebf1b1: jmp    edi
  0x01ebf1b3: mov    ebx,DWORD PTR [ecx+0x4]
  0x01ebf1b6: cmp    ebx,DWORD PTR [eax+0x8]
  0x01ebf1b9: mov    ebx,DWORD PTR [eax+0x4]
  0x01ebf1bc: jne    0x01ebf1cf
  0x01ebf1c2: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebf1c9: je     0x01ebf20e
  0x01ebf1cf: jmp    0x01ea32d0
  0x01ebf1d4: cmp    DWORD PTR [ebx+0x30],0x0
  0x01ebf1db: je     0x01ebf20e
  0x01ebf1e1: mov    eax,DWORD PTR [esp]
  0x01ebf1e4: pusha  
  0x01ebf1e5: pushf  
  0x01ebf1e6: sub    esp,0x10
  0x01ebf1e9: movsd  QWORD PTR [esp],xmm0
  0x01ebf1ee: movsd  QWORD PTR [esp+0x8],xmm1
  0x01ebf1f4: push   eax
  0x01ebf1f5: push   ebx
  0x01ebf1f6: call   0x552179d0
  0x01ebf1fb: add    esp,0x8
  0x01ebf1fe: movsd  xmm0,QWORD PTR [esp]
  0x01ebf203: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01ebf209: add    esp,0x10
  0x01ebf20c: popf   
  0x01ebf20d: popa   
  0x01ebf20e: pop    eax
  0x01ebf20f: mov    esi,esp
  0x01ebf211: sub    esp,0x28
  0x01ebf214: mov    DWORD PTR [esp+0x24],ecx
  0x01ebf218: mov    DWORD PTR [esp+0x20],edx
  0x01ebf21c: mov    edi,DWORD PTR [esp+0x28]
  0x01ebf220: mov    DWORD PTR [esp+0x1c],edi
  0x01ebf224: mov    edi,DWORD PTR [esp+0x2c]
  0x01ebf228: mov    DWORD PTR [esp+0x18],edi
  0x01ebf22c: mov    edi,DWORD PTR [esp+0x30]
  0x01ebf230: mov    DWORD PTR [esp+0x14],edi
  0x01ebf234: mov    edi,DWORD PTR [esp+0x34]
  0x01ebf238: mov    DWORD PTR [esp+0x10],edi
  0x01ebf23c: mov    edi,DWORD PTR [esp+0x38]
  0x01ebf240: mov    DWORD PTR [esp+0xc],edi
  0x01ebf244: mov    edi,DWORD PTR [esp+0x3c]
  0x01ebf248: mov    DWORD PTR [esp+0x8],edi
  0x01ebf24c: mov    edi,DWORD PTR [esp+0x40]
  0x01ebf250: mov    DWORD PTR [esp+0x4],edi
  0x01ebf254: mov    edi,DWORD PTR [esp+0x44]
  0x01ebf258: mov    DWORD PTR [esp],edi
  0x01ebf25b: mov    ecx,DWORD PTR [ebx+0x24]
  0x01ebf25e: push   eax
  0x01ebf25f: jmp    ecx

Decoding RuntimeStub - dtrace_object_alloc Runtime1 stub 0x01f05948
  0x01f05990: push   ebp
  0x01f05991: mov    ebp,esp
  ;; save_live_registers
  0x01f05993: pusha  
  0x01f05994: sub    esp,0xf0
  0x01f0599a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f059a5: movsd  QWORD PTR [esp],xmm0
  0x01f059aa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f059b0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f059b6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f059bc: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f059c2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f059c8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f059ce: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f059d4: push   eax
  0x01f059d5: call   0x55215560
  0x01f059da: pop    eax
  ;; restore_live_registers
  0x01f059db: movsd  xmm0,QWORD PTR [esp]
  0x01f059e0: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f059e6: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f059ec: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f059f2: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f059f8: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f059fe: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f05a04: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f05a0a: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f05a15: je     0x01f05a2c
  0x01f05a1b: push   0x5530ce30
  0x01f05a20: call   0x01f05a25
  0x01f05a25: pusha  
  0x01f05a26: call   0x54dedbf0
  0x01f05a2b: hlt    
  0x01f05a2c: add    esp,0xf0
  0x01f05a32: popa   
  0x01f05a33: mov    esp,ebp
  0x01f05a35: pop    ebp
  0x01f05a36: ret    
  0x01f05a37: nop    

Decoding RuntimeStub - unwind_exception Runtime1 stub 0x01f05a48
  0x01f05aa0: mov    ebx,0xdead
  0x01f05aa5: mov    ecx,0xdead
  0x01f05aaa: mov    edx,0xdead
  0x01f05aaf: mov    esi,0xdead
  0x01f05ab4: mov    edi,0xdead
  0x01f05ab9: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05ac1: mov    edi,DWORD PTR [edi-0xc]
  0x01f05ac4: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f05ace: je     0x01f05ae5
  0x01f05ad4: push   0x5530cf48
  0x01f05ad9: call   0x01f05ade
  0x01f05ade: pusha  
  0x01f05adf: call   0x54dedbf0
  0x01f05ae4: hlt    
  0x01f05ae5: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f05aef: je     0x01f05b06
  0x01f05af5: push   0x5530cf64
  0x01f05afa: call   0x01f05aff
  0x01f05aff: pusha  
  0x01f05b00: call   0x54dedbf0
  0x01f05b05: hlt    
  0x01f05b06: emms   
  0x01f05b08: mov    esi,eax
  0x01f05b0a: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05b12: mov    edi,DWORD PTR [edi-0xc]
  0x01f05b15: mov    edx,DWORD PTR [esp]
  0x01f05b18: push   edx
  0x01f05b19: push   edi
  0x01f05b1a: call   0x55213a10
  0x01f05b1f: add    esp,0x8
  0x01f05b22: mov    ebx,0xdead
  0x01f05b27: mov    ecx,0xdead
  0x01f05b2c: mov    edx,0xdead
  0x01f05b31: mov    edi,0xdead
  0x01f05b36: mov    ebx,eax
  0x01f05b38: mov    eax,esi
  0x01f05b3a: pop    edx
  0x01f05b3b: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05b43: mov    edi,DWORD PTR [edi-0xc]
  0x01f05b46: cmp    DWORD PTR [edi+0x1b8],0x0
  0x01f05b50: cmovne esp,ebp
  0x01f05b53: jmp    ebx
  0x01f05b55: nop    
  0x01f05b56: nop    
  0x01f05b57: nop    

Decoding RuntimeStub - forward_exception Runtime1 stub 0x01f05b88
  ;; generate_handle_exception
  0x01f05bf0: mov    eax,DWORD PTR [edi+0x4]
  0x01f05bf3: mov    DWORD PTR [edi+0x4],0x0
  0x01f05bfa: mov    edx,DWORD PTR [ebp+0x4]
  0x01f05bfd: mov    DWORD PTR [edi+0x16c],0x0
  0x01f05c07: mov    DWORD PTR [edi+0x170],0x0
  0x01f05c11: mov    ebx,0xdead
  0x01f05c16: mov    ecx,0xdead
  0x01f05c1b: mov    esi,0xdead
  0x01f05c20: mov    edi,0xdead
  0x01f05c25: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05c2d: mov    edi,DWORD PTR [edi-0xc]
  0x01f05c30: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f05c3a: je     0x01f05c51
  0x01f05c40: push   0x5530cee4
  0x01f05c45: call   0x01f05c4a
  0x01f05c4a: pusha  
  0x01f05c4b: call   0x54dedbf0
  0x01f05c50: hlt    
  0x01f05c51: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f05c5b: je     0x01f05c72
  0x01f05c61: push   0x5530cf00
  0x01f05c66: call   0x01f05c6b
  0x01f05c6b: pusha  
  0x01f05c6c: call   0x54dedbf0
  0x01f05c71: hlt    
  0x01f05c72: mov    DWORD PTR [edi+0x1ac],eax
  0x01f05c78: mov    DWORD PTR [edi+0x1b0],edx
  0x01f05c7e: mov    DWORD PTR [ebp+0x4],edx
  0x01f05c81: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05c89: mov    edi,DWORD PTR [edi-0xc]
  0x01f05c8c: push   edi
  0x01f05c8d: mov    DWORD PTR [edi+0x144],ebp
  0x01f05c93: mov    DWORD PTR [edi+0x13c],esp
  0x01f05c99: call   0x54ea9c50
  0x01f05c9e: push   eax
  0x01f05c9f: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f05ca7: mov    eax,DWORD PTR [eax-0xc]
  0x01f05caa: cmp    edi,eax
  0x01f05cac: je     0x01f05cc4
  0x01f05cb2: int3   
  0x01f05cb3: push   0x5530cc08
  0x01f05cb8: call   0x01f05cbd
  0x01f05cbd: pusha  
  0x01f05cbe: call   0x54dedbf0
  0x01f05cc3: hlt    
  0x01f05cc4: pop    eax
  0x01f05cc5: mov    DWORD PTR [edi+0x13c],0x0
  0x01f05ccf: mov    DWORD PTR [edi+0x144],0x0
  0x01f05cd9: add    esp,0x4
  0x01f05cdc: cmp    DWORD PTR [edi+0x4],0x0
  0x01f05ce3: je     0x01f05cfd
  0x01f05ce9: mov    eax,DWORD PTR [edi+0x4]
  0x01f05cec: push   0x552fd97c
  0x01f05cf1: call   0x01f05cf6
  0x01f05cf6: pusha  
  0x01f05cf7: call   0x54dedbf0
  0x01f05cfc: hlt    
  0x01f05cfd: mov    ebx,0xdead
  0x01f05d02: mov    ecx,0xdead
  0x01f05d07: mov    edx,0xdead
  0x01f05d0c: mov    esi,0xdead
  0x01f05d11: mov    edi,0xdead
  0x01f05d16: mov    DWORD PTR [ebp+0x4],eax
  ;; restore_live_registers
  0x01f05d19: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f05d24: je     0x01f05d3b
  0x01f05d2a: push   0x5530ce30
  0x01f05d2f: call   0x01f05d34
  0x01f05d34: pusha  
  0x01f05d35: call   0x54dedbf0
  0x01f05d3a: hlt    
  0x01f05d3b: add    esp,0xf0
  0x01f05d41: popa   
  0x01f05d42: mov    esp,ebp
  0x01f05d44: pop    ebp
  0x01f05d45: ret    
  0x01f05d46: nop    
  0x01f05d47: nop    

Decoding RuntimeStub - throw_range_check_failed Runtime1 stub 0x01f05d88
  0x01f05de0: push   ebp
  0x01f05de1: mov    ebp,esp
  ;; save_live_registers
  0x01f05de3: pusha  
  0x01f05de4: sub    esp,0xf0
  0x01f05dea: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f05df5: movsd  QWORD PTR [esp],xmm0
  0x01f05dfa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f05e00: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f05e06: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f05e0c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f05e12: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f05e18: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f05e1e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f05e24: mov    eax,0xdead
  0x01f05e29: mov    ebx,0xdead
  0x01f05e2e: mov    ecx,0xdead
  0x01f05e33: mov    edx,0xdead
  0x01f05e38: mov    esi,0xdead
  0x01f05e3d: mov    edi,0xdead
  0x01f05e42: mov    ebx,DWORD PTR [ebp+0x8]
  0x01f05e45: push   ebx
  0x01f05e46: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05e4e: mov    edi,DWORD PTR [edi-0xc]
  0x01f05e51: push   edi
  0x01f05e52: mov    DWORD PTR [edi+0x144],ebp
  0x01f05e58: mov    DWORD PTR [edi+0x13c],esp
  0x01f05e5e: call   0x54ea9d10
  0x01f05e63: push   eax
  0x01f05e64: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f05e6c: mov    eax,DWORD PTR [eax-0xc]
  0x01f05e6f: cmp    edi,eax
  0x01f05e71: je     0x01f05e89
  0x01f05e77: int3   
  0x01f05e78: push   0x5530cc08
  0x01f05e7d: call   0x01f05e82
  0x01f05e82: pusha  
  0x01f05e83: call   0x54dedbf0
  0x01f05e88: hlt    
  0x01f05e89: pop    eax
  0x01f05e8a: mov    DWORD PTR [edi+0x13c],0x0
  0x01f05e94: mov    DWORD PTR [edi+0x144],0x0
  0x01f05e9e: add    esp,0x8
  0x01f05ea1: cmp    DWORD PTR [edi+0x4],0x0
  0x01f05ea8: je     0x01f05eb6
  0x01f05eae: mov    eax,DWORD PTR [edi+0x4]
  0x01f05eb1: jmp    0x01f05bf0
  0x01f05eb6: push   0x5530ce84
  0x01f05ebb: call   0x01f05ec0
  0x01f05ec0: pusha  
  0x01f05ec1: call   0x54dedbf0
  0x01f05ec6: hlt    
  0x01f05ec7: mov    esp,ebp
  0x01f05ec9: pop    ebp
  0x01f05eca: ret    
  0x01f05ecb: nop    

Decoding RuntimeStub - throw_index_exception Runtime1 stub 0x01f05f08
  0x01f05f60: push   ebp
  0x01f05f61: mov    ebp,esp
  ;; save_live_registers
  0x01f05f63: pusha  
  0x01f05f64: sub    esp,0xf0
  0x01f05f6a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f05f75: movsd  QWORD PTR [esp],xmm0
  0x01f05f7a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f05f80: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f05f86: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f05f8c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f05f92: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f05f98: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f05f9e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f05fa4: mov    eax,0xdead
  0x01f05fa9: mov    ebx,0xdead
  0x01f05fae: mov    ecx,0xdead
  0x01f05fb3: mov    edx,0xdead
  0x01f05fb8: mov    esi,0xdead
  0x01f05fbd: mov    edi,0xdead
  0x01f05fc2: mov    ebx,DWORD PTR [ebp+0x8]
  0x01f05fc5: push   ebx
  0x01f05fc6: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f05fce: mov    edi,DWORD PTR [edi-0xc]
  0x01f05fd1: push   edi
  0x01f05fd2: mov    DWORD PTR [edi+0x144],ebp
  0x01f05fd8: mov    DWORD PTR [edi+0x13c],esp
  0x01f05fde: call   0x54ea9e40
  0x01f05fe3: push   eax
  0x01f05fe4: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f05fec: mov    eax,DWORD PTR [eax-0xc]
  0x01f05fef: cmp    edi,eax
  0x01f05ff1: je     0x01f06009
  0x01f05ff7: int3   
  0x01f05ff8: push   0x5530cc08
  0x01f05ffd: call   0x01f06002
  0x01f06002: pusha  
  0x01f06003: call   0x54dedbf0
  0x01f06008: hlt    
  0x01f06009: pop    eax
  0x01f0600a: mov    DWORD PTR [edi+0x13c],0x0
  0x01f06014: mov    DWORD PTR [edi+0x144],0x0
  0x01f0601e: add    esp,0x8
  0x01f06021: cmp    DWORD PTR [edi+0x4],0x0
  0x01f06028: je     0x01f06036
  0x01f0602e: mov    eax,DWORD PTR [edi+0x4]
  0x01f06031: jmp    0x01f05bf0
  0x01f06036: push   0x5530ce84
  0x01f0603b: call   0x01f06040
  0x01f06040: pusha  
  0x01f06041: call   0x54dedbf0
  0x01f06046: hlt    
  0x01f06047: mov    esp,ebp
  0x01f06049: pop    ebp
  0x01f0604a: ret    
  0x01f0604b: nop    

Decoding RuntimeStub - throw_div0_exception Runtime1 stub 0x01f06088
  0x01f060e0: push   ebp
  0x01f060e1: mov    ebp,esp
  ;; save_live_registers
  0x01f060e3: pusha  
  0x01f060e4: sub    esp,0xf0
  0x01f060ea: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f060f5: movsd  QWORD PTR [esp],xmm0
  0x01f060fa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f06100: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f06106: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0610c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f06112: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f06118: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0611e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f06124: mov    eax,0xdead
  0x01f06129: mov    ebx,0xdead
  0x01f0612e: mov    ecx,0xdead
  0x01f06133: mov    edx,0xdead
  0x01f06138: mov    esi,0xdead
  0x01f0613d: mov    edi,0xdead
  0x01f06142: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f0614a: mov    edi,DWORD PTR [edi-0xc]
  0x01f0614d: push   edi
  0x01f0614e: mov    DWORD PTR [edi+0x144],ebp
  0x01f06154: mov    DWORD PTR [edi+0x13c],esp
  0x01f0615a: call   0x54ea9f70
  0x01f0615f: push   eax
  0x01f06160: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f06168: mov    eax,DWORD PTR [eax-0xc]
  0x01f0616b: cmp    edi,eax
  0x01f0616d: je     0x01f06185
  0x01f06173: int3   
  0x01f06174: push   0x5530cc08
  0x01f06179: call   0x01f0617e
  0x01f0617e: pusha  
  0x01f0617f: call   0x54dedbf0
  0x01f06184: hlt    
  0x01f06185: pop    eax
  0x01f06186: mov    DWORD PTR [edi+0x13c],0x0
  0x01f06190: mov    DWORD PTR [edi+0x144],0x0
  0x01f0619a: add    esp,0x4
  0x01f0619d: cmp    DWORD PTR [edi+0x4],0x0
  0x01f061a4: je     0x01f061b2
  0x01f061aa: mov    eax,DWORD PTR [edi+0x4]
  0x01f061ad: jmp    0x01f05bf0
  0x01f061b2: push   0x5530ce84
  0x01f061b7: call   0x01f061bc
  0x01f061bc: pusha  
  0x01f061bd: call   0x54dedbf0
  0x01f061c2: hlt    
  0x01f061c3: mov    esp,ebp
  0x01f061c5: pop    ebp
  0x01f061c6: ret    
  0x01f061c7: nop    

Decoding RuntimeStub - throw_null_pointer_exception Runtime1 stub 0x01f06208
  0x01f06260: push   ebp
  0x01f06261: mov    ebp,esp
  ;; save_live_registers
  0x01f06263: pusha  
  0x01f06264: sub    esp,0xf0
  0x01f0626a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f06275: movsd  QWORD PTR [esp],xmm0
  0x01f0627a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f06280: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f06286: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0628c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f06292: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f06298: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0629e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f062a4: mov    eax,0xdead
  0x01f062a9: mov    ebx,0xdead
  0x01f062ae: mov    ecx,0xdead
  0x01f062b3: mov    edx,0xdead
  0x01f062b8: mov    esi,0xdead
  0x01f062bd: mov    edi,0xdead
  0x01f062c2: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f062ca: mov    edi,DWORD PTR [edi-0xc]
  0x01f062cd: push   edi
  0x01f062ce: mov    DWORD PTR [edi+0x144],ebp
  0x01f062d4: mov    DWORD PTR [edi+0x13c],esp
  0x01f062da: call   0x54eaa090
  0x01f062df: push   eax
  0x01f062e0: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f062e8: mov    eax,DWORD PTR [eax-0xc]
  0x01f062eb: cmp    edi,eax
  0x01f062ed: je     0x01f06305
  0x01f062f3: int3   
  0x01f062f4: push   0x5530cc08
  0x01f062f9: call   0x01f062fe
  0x01f062fe: pusha  
  0x01f062ff: call   0x54dedbf0
  0x01f06304: hlt    
  0x01f06305: pop    eax
  0x01f06306: mov    DWORD PTR [edi+0x13c],0x0
  0x01f06310: mov    DWORD PTR [edi+0x144],0x0
  0x01f0631a: add    esp,0x4
  0x01f0631d: cmp    DWORD PTR [edi+0x4],0x0
  0x01f06324: je     0x01f06332
  0x01f0632a: mov    eax,DWORD PTR [edi+0x4]
  0x01f0632d: jmp    0x01f05bf0
  0x01f06332: push   0x5530ce84
  0x01f06337: call   0x01f0633c
  0x01f0633c: pusha  
  0x01f0633d: call   0x54dedbf0
  0x01f06342: hlt    
  0x01f06343: mov    esp,ebp
  0x01f06345: pop    ebp
  0x01f06346: ret    
  0x01f06347: nop    

Decoding RuntimeStub - register_finalizer Runtime1 stub 0x01f06388
  0x01f063e0: mov    eax,DWORD PTR [esp+0x4]
  0x01f063e4: mov    esi,DWORD PTR [eax+0x4]
  0x01f063e7: mov    esi,DWORD PTR [esi+0x58]
  0x01f063ea: test   esi,0x40000000
  0x01f063f0: jne    0x01f063f7
  0x01f063f6: ret    
  0x01f063f7: push   ebp
  0x01f063f8: mov    ebp,esp
  ;; save_live_registers
  0x01f063fa: pusha  
  0x01f063fb: sub    esp,0xf0
  0x01f06401: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f0640c: movsd  QWORD PTR [esp],xmm0
  0x01f06411: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f06417: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f0641d: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f06423: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f06429: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f0642f: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f06435: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f0643b: push   eax
  0x01f0643c: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f06444: mov    edi,DWORD PTR [edi-0xc]
  0x01f06447: push   edi
  0x01f06448: mov    DWORD PTR [edi+0x144],ebp
  0x01f0644e: mov    DWORD PTR [edi+0x13c],esp
  0x01f06454: call   0x552153c0
  0x01f06459: push   eax
  0x01f0645a: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f06462: mov    eax,DWORD PTR [eax-0xc]
  0x01f06465: cmp    edi,eax
  0x01f06467: je     0x01f0647f
  0x01f0646d: int3   
  0x01f0646e: push   0x5530cc08
  0x01f06473: call   0x01f06478
  0x01f06478: pusha  
  0x01f06479: call   0x54dedbf0
  0x01f0647e: hlt    
  0x01f0647f: pop    eax
  0x01f06480: mov    DWORD PTR [edi+0x13c],0x0
  0x01f0648a: mov    DWORD PTR [edi+0x144],0x0
  0x01f06494: add    esp,0x8
  0x01f06497: cmp    DWORD PTR [edi+0x4],0x0
  0x01f0649e: je     0x01f064ac
  0x01f064a4: mov    eax,DWORD PTR [edi+0x4]
  0x01f064a7: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f064ac: movsd  xmm0,QWORD PTR [esp]
  0x01f064b1: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f064b7: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f064bd: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f064c3: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f064c9: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f064cf: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f064d5: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f064db: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f064e6: je     0x01f064fd
  0x01f064ec: push   0x5530ce30
  0x01f064f1: call   0x01f064f6
  0x01f064f6: pusha  
  0x01f064f7: call   0x54dedbf0
  0x01f064fc: hlt    
  0x01f064fd: add    esp,0xf0
  0x01f06503: popa   
  0x01f06504: mov    esp,ebp
  0x01f06506: pop    ebp
  0x01f06507: ret    

Decoding RuntimeStub - new_instance Runtime1 stub 0x01f06548
  0x01f065a0: push   ebp
  0x01f065a1: mov    ebp,esp
  ;; save_live_registers
  0x01f065a3: pusha  
  0x01f065a4: sub    esp,0xf0
  0x01f065aa: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f065b5: movsd  QWORD PTR [esp],xmm0
  0x01f065ba: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f065c0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f065c6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f065cc: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f065d2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f065d8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f065de: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f065e4: push   edx
  0x01f065e5: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f065ed: mov    edi,DWORD PTR [edi-0xc]
  0x01f065f0: push   edi
  0x01f065f1: mov    DWORD PTR [edi+0x144],ebp
  0x01f065f7: mov    DWORD PTR [edi+0x13c],esp
  0x01f065fd: call   0x54ea92a0
  0x01f06602: push   eax
  0x01f06603: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f0660b: mov    eax,DWORD PTR [eax-0xc]
  0x01f0660e: cmp    edi,eax
  0x01f06610: je     0x01f06628
  0x01f06616: int3   
  0x01f06617: push   0x5530cc08
  0x01f0661c: call   0x01f06621
  0x01f06621: pusha  
  0x01f06622: call   0x54dedbf0
  0x01f06627: hlt    
  0x01f06628: pop    eax
  0x01f06629: mov    DWORD PTR [edi+0x13c],0x0
  0x01f06633: mov    DWORD PTR [edi+0x144],0x0
  0x01f0663d: add    esp,0x8
  0x01f06640: cmp    DWORD PTR [edi+0x4],0x0
  0x01f06647: je     0x01f0665f
  0x01f0664d: mov    eax,DWORD PTR [edi+0x4]
  0x01f06650: mov    DWORD PTR [edi+0x16c],0x0
  0x01f0665a: jmp    0x01f05bf0
  0x01f0665f: mov    eax,DWORD PTR [edi+0x16c]
  0x01f06665: mov    DWORD PTR [edi+0x16c],0x0
  ;; restore_live_registers_except_rax
  0x01f0666f: movsd  xmm0,QWORD PTR [esp]
  0x01f06674: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f0667a: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f06680: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f06686: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f0668c: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f06692: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f06698: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f0669e: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f066a9: je     0x01f066c0
  0x01f066af: push   0x5530ce30
  0x01f066b4: call   0x01f066b9
  0x01f066b9: pusha  
  0x01f066ba: call   0x54dedbf0
  0x01f066bf: hlt    
  0x01f066c0: add    esp,0xf0
  0x01f066c6: pop    edi
  0x01f066c7: pop    esi
  0x01f066c8: pop    ebp
  0x01f066c9: pop    ebx
  0x01f066ca: pop    ebx
  0x01f066cb: pop    edx
  0x01f066cc: pop    ecx
  0x01f066cd: add    esp,0x4
  0x01f066d0: mov    esp,ebp
  0x01f066d2: pop    ebp
  0x01f066d3: ret    

Decoding RuntimeStub - fast_new_instance Runtime1 stub 0x01f06708
  0x01f067d0: push   edi
  0x01f067d1: push   ebx
  0x01f067d2: mov    ecx,DWORD PTR [edx+0x8]
  0x01f067d5: cmp    ecx,0x0
  0x01f067d8: jle    0x01f067ea
  0x01f067de: test   ecx,0x1
  0x01f067e4: je     0x01f0680c
  0x01f067ea: push   0x5530d17c
  0x01f067ef: call   0x01f067f4
  0x01f067f4: pusha  
  0x01f067f5: call   0x54dedbf0
  0x01f067fa: hlt    
  0x01f067fb: push   0x552fd97c
  0x01f06800: call   0x01f06805
  0x01f06805: pusha  
  0x01f06806: call   0x54dedbf0
  0x01f0680b: hlt    
  0x01f0680c: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f06814: mov    edi,DWORD PTR [edi-0xc]
  0x01f06817: mov    eax,DWORD PTR [edi+0x44]
  0x01f0681a: mov    ecx,DWORD PTR [edi+0x4c]
  0x01f0681d: sub    ecx,eax
  0x01f0681f: shr    ecx,0x2
  0x01f06822: cmp    ecx,DWORD PTR [edi+0x54]
  0x01f06825: jle    0x01f0683c
  0x01f0682b: mov    esi,0x4
  0x01f06830: add    DWORD PTR [edi+0x54],esi
  0x01f06833: add    DWORD PTR [edi+0x68],0x1
  0x01f06837: jmp    0x01f0695c
  0x01f0683c: add    DWORD PTR [edi+0x58],0x1
  0x01f06840: add    DWORD PTR [edi+0x5c],ecx
  0x01f06843: test   eax,eax
  0x01f06845: je     0x01f06878
  0x01f0684b: mov    DWORD PTR [eax],0x101
  0x01f06851: sub    ecx,0x3
  0x01f06854: add    ecx,0x4
  0x01f06857: shl    ecx,0x0
  0x01f0685a: mov    DWORD PTR [eax+0x8],ecx
  0x01f0685d: mov    ecx,DWORD PTR ds:0x5563111c
  0x01f06863: mov    DWORD PTR [eax+0x4],ecx
  0x01f06866: mov    ecx,eax
  0x01f06868: sub    ecx,DWORD PTR [edi+0x40]
  0x01f0686b: add    DWORD PTR [edi+0x88],ecx
  0x01f06871: adc    DWORD PTR [edi+0x8c],0x0
  0x01f06878: mov    ecx,DWORD PTR [edi+0x50]
  0x01f0687b: shl    ecx,0x2
  0x01f0687e: mov    eax,DWORD PTR ds:0x410dd0
  0x01f06884: lea    esi,[eax+ecx*1]
  0x01f06887: cmp    esi,eax
  0x01f06889: jb     0x01f069e5
  0x01f0688f: cmp    esi,DWORD PTR ds:0x410da0
  0x01f06895: ja     0x01f069e5
  0x01f0689b: lock cmpxchg DWORD PTR ds:0x410dd0,esi
  0x01f068a3: jne    0x01f0687e
  0x01f068a5: push   esi
  0x01f068a6: mov    esi,DWORD PTR [edi+0x50]
  0x01f068a9: shl    esi,0x2
  0x01f068ac: cmp    ecx,esi
  0x01f068ae: je     0x01f068d6
  ;; assert(t1 != tlab size)
  0x01f068b4: push   0x553138fc
  0x01f068b9: call   0x01f068be
  0x01f068be: pusha  
  0x01f068bf: call   0x54dedbf0
  0x01f068c4: hlt    
  0x01f068c5: push   0x552fd97c
  0x01f068ca: call   0x01f068cf
  0x01f068cf: pusha  
  0x01f068d0: call   0x54dedbf0
  0x01f068d5: hlt    
  0x01f068d6: pop    esi
  0x01f068d7: mov    DWORD PTR [edi+0x40],eax
  0x01f068da: mov    DWORD PTR [edi+0x44],eax
  0x01f068dd: add    eax,ecx
  0x01f068df: sub    eax,0x10
  0x01f068e2: mov    DWORD PTR [edi+0x4c],eax
  0x01f068e5: jmp    0x01f068ea
  0x01f068ea: mov    ecx,DWORD PTR [edx+0x8]
  0x01f068ed: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01f068f5: mov    ebx,DWORD PTR [ebx-0xc]
  0x01f068f8: mov    eax,DWORD PTR [ebx+0x44]
  0x01f068fb: lea    esi,[eax+ecx*1]
  0x01f068fe: cmp    esi,DWORD PTR [ebx+0x4c]
  0x01f06901: ja     0x01f069e5
  0x01f06907: mov    DWORD PTR [ebx+0x44],esi
  0x01f0690a: mov    ebx,DWORD PTR [edx+0x68]
  0x01f0690d: mov    DWORD PTR [eax],ebx
  0x01f0690f: mov    DWORD PTR [eax+0x4],edx
  0x01f06912: mov    esi,ecx
  0x01f06914: sub    esi,0x8
  0x01f06917: je     0x01f06959
  0x01f0691d: test   esi,0x3
  0x01f06923: je     0x01f0693a
  0x01f06929: push   0x5530c488
  0x01f0692e: call   0x01f06933
  0x01f06933: pusha  
  0x01f06934: call   0x54dedbf0
  0x01f06939: hlt    
  0x01f0693a: xor    ebx,ebx
  0x01f0693c: shr    esi,0x3
  0x01f0693f: jae    0x01f0694f
  0x01f06945: mov    DWORD PTR [eax+esi*8+0x8],ebx
  0x01f06949: je     0x01f06959
  0x01f0694f: mov    DWORD PTR [eax+esi*8+0x4],ebx
  0x01f06953: mov    DWORD PTR [eax+esi*8],ebx
  0x01f06956: dec    esi
  0x01f06957: jne    0x01f0694f
  0x01f06959: pop    ebx
  0x01f0695a: pop    edi
  0x01f0695b: ret    
  0x01f0695c: mov    ecx,DWORD PTR [edx+0x8]
  0x01f0695f: mov    eax,DWORD PTR ds:0x410dd0
  0x01f06965: lea    ebx,[eax+ecx*1]
  0x01f06968: cmp    ebx,eax
  0x01f0696a: jb     0x01f069e5
  0x01f06970: cmp    ebx,DWORD PTR ds:0x410da0
  0x01f06976: ja     0x01f069e5
  0x01f0697c: lock cmpxchg DWORD PTR ds:0x410dd0,ebx
  0x01f06984: jne    0x01f0695f
  0x01f06986: add    DWORD PTR [edi+0x88],ecx
  0x01f0698c: adc    DWORD PTR [edi+0x8c],0x0
  0x01f06993: mov    ebx,DWORD PTR [edx+0x68]
  0x01f06996: mov    DWORD PTR [eax],ebx
  0x01f06998: mov    DWORD PTR [eax+0x4],edx
  0x01f0699b: mov    esi,ecx
  0x01f0699d: sub    esi,0x8
  0x01f069a0: je     0x01f069e2
  0x01f069a6: test   esi,0x3
  0x01f069ac: je     0x01f069c3
  0x01f069b2: push   0x5530c488
  0x01f069b7: call   0x01f069bc
  0x01f069bc: pusha  
  0x01f069bd: call   0x54dedbf0
  0x01f069c2: hlt    
  0x01f069c3: xor    ebx,ebx
  0x01f069c5: shr    esi,0x3
  0x01f069c8: jae    0x01f069d8
  0x01f069ce: mov    DWORD PTR [eax+esi*8+0x8],ebx
  0x01f069d2: je     0x01f069e2
  0x01f069d8: mov    DWORD PTR [eax+esi*8+0x4],ebx
  0x01f069dc: mov    DWORD PTR [eax+esi*8],ebx
  0x01f069df: dec    esi
  0x01f069e0: jne    0x01f069d8
  0x01f069e2: pop    ebx
  0x01f069e3: pop    edi
  0x01f069e4: ret    
  0x01f069e5: pop    ebx
  0x01f069e6: pop    edi
  0x01f069e7: push   ebp
  0x01f069e8: mov    ebp,esp
  ;; save_live_registers
  0x01f069ea: pusha  
  0x01f069eb: sub    esp,0xf0
  0x01f069f1: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f069fc: movsd  QWORD PTR [esp],xmm0
  0x01f06a01: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f06a07: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f06a0d: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f06a13: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f06a19: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f06a1f: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f06a25: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f06a2b: push   edx
  0x01f06a2c: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f06a34: mov    edi,DWORD PTR [edi-0xc]
  0x01f06a37: push   edi
  0x01f06a38: mov    DWORD PTR [edi+0x144],ebp
  0x01f06a3e: mov    DWORD PTR [edi+0x13c],esp
  0x01f06a44: call   0x54ea92a0
  0x01f06a49: push   eax
  0x01f06a4a: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f06a52: mov    eax,DWORD PTR [eax-0xc]
  0x01f06a55: cmp    edi,eax
  0x01f06a57: je     0x01f06a6f
  0x01f06a5d: int3   
  0x01f06a5e: push   0x5530cc08
  0x01f06a63: call   0x01f06a68
  0x01f06a68: pusha  
  0x01f06a69: call   0x54dedbf0
  0x01f06a6e: hlt    
  0x01f06a6f: pop    eax
  0x01f06a70: mov    DWORD PTR [edi+0x13c],0x0
  0x01f06a7a: mov    DWORD PTR [edi+0x144],0x0
  0x01f06a84: add    esp,0x8
  0x01f06a87: cmp    DWORD PTR [edi+0x4],0x0
  0x01f06a8e: je     0x01f06aa6
  0x01f06a94: mov    eax,DWORD PTR [edi+0x4]
  0x01f06a97: mov    DWORD PTR [edi+0x16c],0x0
  0x01f06aa1: jmp    0x01f05bf0
  0x01f06aa6: mov    eax,DWORD PTR [edi+0x16c]
  0x01f06aac: mov    DWORD PTR [edi+0x16c],0x0
  ;; restore_live_registers_except_rax
  0x01f06ab6: movsd  xmm0,QWORD PTR [esp]
  0x01f06abb: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f06ac1: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f06ac7: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f06acd: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f06ad3: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f06ad9: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f06adf: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f06ae5: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f06af0: je     0x01f06b07
  0x01f06af6: push   0x5530ce30
  0x01f06afb: call   0x01f06b00
  0x01f06b00: pusha  
  0x01f06b01: call   0x54dedbf0
  0x01f06b06: hlt    
  0x01f06b07: add    esp,0xf0
  0x01f06b0d: pop    edi
  0x01f06b0e: pop    esi
  0x01f06b0f: pop    ebp
  0x01f06b10: pop    ebx
  0x01f06b11: pop    ebx
  0x01f06b12: pop    edx
  0x01f06b13: pop    ecx
  0x01f06b14: add    esp,0x4
  0x01f06b17: mov    esp,ebp
  0x01f06b19: pop    ebp
  0x01f06b1a: ret    
  0x01f06b1b: nop    

Decoding RuntimeStub - fast_new_instance_init_check Runtime1 stub 0x01f06b48
  0x01f06c10: push   edi
  0x01f06c11: push   ebx
  0x01f06c12: cmp    BYTE PTR [edx+0xde],0x4
  0x01f06c19: jne    0x01f06e32
  0x01f06c1f: mov    ecx,DWORD PTR [edx+0x8]
  0x01f06c22: cmp    ecx,0x0
  0x01f06c25: jle    0x01f06c37
  0x01f06c2b: test   ecx,0x1
  0x01f06c31: je     0x01f06c59
  0x01f06c37: push   0x5530d17c
  0x01f06c3c: call   0x01f06c41
  0x01f06c41: pusha  
  0x01f06c42: call   0x54dedbf0
  0x01f06c47: hlt    
  0x01f06c48: push   0x552fd97c
  0x01f06c4d: call   0x01f06c52
  0x01f06c52: pusha  
  0x01f06c53: call   0x54dedbf0
  0x01f06c58: hlt    
  0x01f06c59: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f06c61: mov    edi,DWORD PTR [edi-0xc]
  0x01f06c64: mov    eax,DWORD PTR [edi+0x44]
  0x01f06c67: mov    ecx,DWORD PTR [edi+0x4c]
  0x01f06c6a: sub    ecx,eax
  0x01f06c6c: shr    ecx,0x2
  0x01f06c6f: cmp    ecx,DWORD PTR [edi+0x54]
  0x01f06c72: jle    0x01f06c89
  0x01f06c78: mov    esi,0x4
  0x01f06c7d: add    DWORD PTR [edi+0x54],esi
  0x01f06c80: add    DWORD PTR [edi+0x68],0x1
  0x01f06c84: jmp    0x01f06da9
  0x01f06c89: add    DWORD PTR [edi+0x58],0x1
  0x01f06c8d: add    DWORD PTR [edi+0x5c],ecx
  0x01f06c90: test   eax,eax
  0x01f06c92: je     0x01f06cc5
  0x01f06c98: mov    DWORD PTR [eax],0x101
  0x01f06c9e: sub    ecx,0x3
  0x01f06ca1: add    ecx,0x4
  0x01f06ca4: shl    ecx,0x0
  0x01f06ca7: mov    DWORD PTR [eax+0x8],ecx
  0x01f06caa: mov    ecx,DWORD PTR ds:0x5563111c
  0x01f06cb0: mov    DWORD PTR [eax+0x4],ecx
  0x01f06cb3: mov    ecx,eax
  0x01f06cb5: sub    ecx,DWORD PTR [edi+0x40]
  0x01f06cb8: add    DWORD PTR [edi+0x88],ecx
  0x01f06cbe: adc    DWORD PTR [edi+0x8c],0x0
  0x01f06cc5: mov    ecx,DWORD PTR [edi+0x50]
  0x01f06cc8: shl    ecx,0x2
  0x01f06ccb: mov    eax,DWORD PTR ds:0x410dd0
  0x01f06cd1: lea    esi,[eax+ecx*1]
  0x01f06cd4: cmp    esi,eax
  0x01f06cd6: jb     0x01f06e32
  0x01f06cdc: cmp    esi,DWORD PTR ds:0x410da0
  0x01f06ce2: ja     0x01f06e32
  0x01f06ce8: lock cmpxchg DWORD PTR ds:0x410dd0,esi
  0x01f06cf0: jne    0x01f06ccb
  0x01f06cf2: push   esi
  0x01f06cf3: mov    esi,DWORD PTR [edi+0x50]
  0x01f06cf6: shl    esi,0x2
  0x01f06cf9: cmp    ecx,esi
  0x01f06cfb: je     0x01f06d23
  ;; assert(t1 != tlab size)
  0x01f06d01: push   0x553138fc
  0x01f06d06: call   0x01f06d0b
  0x01f06d0b: pusha  
  0x01f06d0c: call   0x54dedbf0
  0x01f06d11: hlt    
  0x01f06d12: push   0x552fd97c
  0x01f06d17: call   0x01f06d1c
  0x01f06d1c: pusha  
  0x01f06d1d: call   0x54dedbf0
  0x01f06d22: hlt    
  0x01f06d23: pop    esi
  0x01f06d24: mov    DWORD PTR [edi+0x40],eax
  0x01f06d27: mov    DWORD PTR [edi+0x44],eax
  0x01f06d2a: add    eax,ecx
  0x01f06d2c: sub    eax,0x10
  0x01f06d2f: mov    DWORD PTR [edi+0x4c],eax
  0x01f06d32: jmp    0x01f06d37
  0x01f06d37: mov    ecx,DWORD PTR [edx+0x8]
  0x01f06d3a: mov    ebx,DWORD PTR fs:[eiz*1+0x0]
  0x01f06d42: mov    ebx,DWORD PTR [ebx-0xc]
  0x01f06d45: mov    eax,DWORD PTR [ebx+0x44]
  0x01f06d48: lea    esi,[eax+ecx*1]
  0x01f06d4b: cmp    esi,DWORD PTR [ebx+0x4c]
  0x01f06d4e: ja     0x01f06e32
  0x01f06d54: mov    DWORD PTR [ebx+0x44],esi
  0x01f06d57: mov    ebx,DWORD PTR [edx+0x68]
  0x01f06d5a: mov    DWORD PTR [eax],ebx
  0x01f06d5c: mov    DWORD PTR [eax+0x4],edx
  0x01f06d5f: mov    esi,ecx
  0x01f06d61: sub    esi,0x8
  0x01f06d64: je     0x01f06da6
  0x01f06d6a: test   esi,0x3
  0x01f06d70: je     0x01f06d87
  0x01f06d76: push   0x5530c488
  0x01f06d7b: call   0x01f06d80
  0x01f06d80: pusha  
  0x01f06d81: call   0x54dedbf0
  0x01f06d86: hlt    
  0x01f06d87: xor    ebx,ebx
  0x01f06d89: shr    esi,0x3
  0x01f06d8c: jae    0x01f06d9c
  0x01f06d92: mov    DWORD PTR [eax+esi*8+0x8],ebx
  0x01f06d96: je     0x01f06da6
  0x01f06d9c: mov    DWORD PTR [eax+esi*8+0x4],ebx
  0x01f06da0: mov    DWORD PTR [eax+esi*8],ebx
  0x01f06da3: dec    esi
  0x01f06da4: jne    0x01f06d9c
  0x01f06da6: pop    ebx
  0x01f06da7: pop    edi
  0x01f06da8: ret    
  0x01f06da9: mov    ecx,DWORD PTR [edx+0x8]
  0x01f06dac: mov    eax,DWORD PTR ds:0x410dd0
  0x01f06db2: lea    ebx,[eax+ecx*1]
  0x01f06db5: cmp    ebx,eax
  0x01f06db7: jb     0x01f06e32
  0x01f06dbd: cmp    ebx,DWORD PTR ds:0x410da0
  0x01f06dc3: ja     0x01f06e32
  0x01f06dc9: lock cmpxchg DWORD PTR ds:0x410dd0,ebx
  0x01f06dd1: jne    0x01f06dac
  0x01f06dd3: add    DWORD PTR [edi+0x88],ecx
  0x01f06dd9: adc    DWORD PTR [edi+0x8c],0x0
  0x01f06de0: mov    ebx,DWORD PTR [edx+0x68]
  0x01f06de3: mov    DWORD PTR [eax],ebx
  0x01f06de5: mov    DWORD PTR [eax+0x4],edx
  0x01f06de8: mov    esi,ecx
  0x01f06dea: sub    esi,0x8
  0x01f06ded: je     0x01f06e2f
  0x01f06df3: test   esi,0x3
  0x01f06df9: je     0x01f06e10
  0x01f06dff: push   0x5530c488
  0x01f06e04: call   0x01f06e09
  0x01f06e09: pusha  
  0x01f06e0a: call   0x54dedbf0
  0x01f06e0f: hlt    
  0x01f06e10: xor    ebx,ebx
  0x01f06e12: shr    esi,0x3
  0x01f06e15: jae    0x01f06e25
  0x01f06e1b: mov    DWORD PTR [eax+esi*8+0x8],ebx
  0x01f06e1f: je     0x01f06e2f
  0x01f06e25: mov    DWORD PTR [eax+esi*8+0x4],ebx
  0x01f06e29: mov    DWORD PTR [eax+esi*8],ebx
  0x01f06e2c: dec    esi
  0x01f06e2d: jne    0x01f06e25
  0x01f06e2f: pop    ebx
  0x01f06e30: pop    edi
  0x01f06e31: ret    
  0x01f06e32: pop    ebx
  0x01f06e33: pop    edi
  0x01f06e34: push   ebp
  0x01f06e35: mov    ebp,esp
  ;; save_live_registers
  0x01f06e37: pusha  
  0x01f06e38: sub    esp,0xf0
  0x01f06e3e: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f06e49: movsd  QWORD PTR [esp],xmm0
  0x01f06e4e: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f06e54: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f06e5a: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f06e60: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f06e66: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f06e6c: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f06e72: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f06e78: push   edx
  0x01f06e79: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f06e81: mov    edi,DWORD PTR [edi-0xc]
  0x01f06e84: push   edi
  0x01f06e85: mov    DWORD PTR [edi+0x144],ebp
  0x01f06e8b: mov    DWORD PTR [edi+0x13c],esp
  0x01f06e91: call   0x54ea92a0
  0x01f06e96: push   eax
  0x01f06e97: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f06e9f: mov    eax,DWORD PTR [eax-0xc]
  0x01f06ea2: cmp    edi,eax
  0x01f06ea4: je     0x01f06ebc
  0x01f06eaa: int3   
  0x01f06eab: push   0x5530cc08
  0x01f06eb0: call   0x01f06eb5
  0x01f06eb5: pusha  
  0x01f06eb6: call   0x54dedbf0
  0x01f06ebb: hlt    
  0x01f06ebc: pop    eax
  0x01f06ebd: mov    DWORD PTR [edi+0x13c],0x0
  0x01f06ec7: mov    DWORD PTR [edi+0x144],0x0
  0x01f06ed1: add    esp,0x8
  0x01f06ed4: cmp    DWORD PTR [edi+0x4],0x0
  0x01f06edb: je     0x01f06ef3
  0x01f06ee1: mov    eax,DWORD PTR [edi+0x4]
  0x01f06ee4: mov    DWORD PTR [edi+0x16c],0x0
  0x01f06eee: jmp    0x01f05bf0
  0x01f06ef3: mov    eax,DWORD PTR [edi+0x16c]
  0x01f06ef9: mov    DWORD PTR [edi+0x16c],0x0
  ;; restore_live_registers_except_rax
  0x01f06f03: movsd  xmm0,QWORD PTR [esp]
  0x01f06f08: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f06f0e: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f06f14: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f06f1a: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f06f20: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f06f26: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f06f2c: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f06f32: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f06f3d: je     0x01f06f54
  0x01f06f43: push   0x5530ce30
  0x01f06f48: call   0x01f06f4d
  0x01f06f4d: pusha  
  0x01f06f4e: call   0x54dedbf0
  0x01f06f53: hlt    
  0x01f06f54: add    esp,0xf0
  0x01f06f5a: pop    edi
  0x01f06f5b: pop    esi
  0x01f06f5c: pop    ebp
  0x01f06f5d: pop    ebx
  0x01f06f5e: pop    ebx
  0x01f06f5f: pop    edx
  0x01f06f60: pop    ecx
  0x01f06f61: add    esp,0x4
  0x01f06f64: mov    esp,ebp
  0x01f06f66: pop    ebp
  0x01f06f67: ret    

Decoding RuntimeStub - new_type_array Runtime1 stub 0x01f06f88
  0x01f07050: mov    eax,DWORD PTR [edx+0x8]
  0x01f07053: sar    eax,0x1e
  0x01f07056: cmp    eax,0xffffffff
  0x01f07059: je     0x01f07081
  0x01f0705f: push   0x5530d1e8
  0x01f07064: call   0x01f07069
  0x01f07069: pusha  
  0x01f0706a: call   0x54dedbf0
  0x01f0706f: hlt    
  0x01f07070: push   0x552fd97c
  0x01f07075: call   0x01f0707a
  0x01f0707a: pusha  
  0x01f0707b: call   0x54dedbf0
  0x01f07080: hlt    
  0x01f07081: cmp    ebx,0xffffff
  0x01f07087: ja     0x01f072aa
  0x01f0708d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07095: mov    edi,DWORD PTR [edi-0xc]
  0x01f07098: mov    eax,DWORD PTR [edi+0x44]
  0x01f0709b: mov    ecx,DWORD PTR [edi+0x4c]
  0x01f0709e: sub    ecx,eax
  0x01f070a0: shr    ecx,0x2
  0x01f070a3: cmp    ecx,DWORD PTR [edi+0x54]
  0x01f070a6: jle    0x01f070bd
  0x01f070ac: mov    esi,0x4
  0x01f070b1: add    DWORD PTR [edi+0x54],esi
  0x01f070b4: add    DWORD PTR [edi+0x68],0x1
  0x01f070b8: jmp    0x01f071ff
  0x01f070bd: add    DWORD PTR [edi+0x58],0x1
  0x01f070c1: add    DWORD PTR [edi+0x5c],ecx
  0x01f070c4: test   eax,eax
  0x01f070c6: je     0x01f070f9
  0x01f070cc: mov    DWORD PTR [eax],0x101
  0x01f070d2: sub    ecx,0x3
  0x01f070d5: add    ecx,0x4
  0x01f070d8: shl    ecx,0x0
  0x01f070db: mov    DWORD PTR [eax+0x8],ecx
  0x01f070de: mov    ecx,DWORD PTR ds:0x5563111c
  0x01f070e4: mov    DWORD PTR [eax+0x4],ecx
  0x01f070e7: mov    ecx,eax
  0x01f070e9: sub    ecx,DWORD PTR [edi+0x40]
  0x01f070ec: add    DWORD PTR [edi+0x88],ecx
  0x01f070f2: adc    DWORD PTR [edi+0x8c],0x0
  0x01f070f9: mov    ecx,DWORD PTR [edi+0x50]
  0x01f070fc: shl    ecx,0x2
  0x01f070ff: mov    eax,DWORD PTR ds:0x410dd0
  0x01f07105: lea    esi,[eax+ecx*1]
  0x01f07108: cmp    esi,eax
  0x01f0710a: jb     0x01f072aa
  0x01f07110: cmp    esi,DWORD PTR ds:0x410da0
  0x01f07116: ja     0x01f072aa
  0x01f0711c: lock cmpxchg DWORD PTR ds:0x410dd0,esi
  0x01f07124: jne    0x01f070ff
  0x01f07126: push   esi
  0x01f07127: mov    esi,DWORD PTR [edi+0x50]
  0x01f0712a: shl    esi,0x2
  0x01f0712d: cmp    ecx,esi
  0x01f0712f: je     0x01f07157
  ;; assert(t1 != tlab size)
  0x01f07135: push   0x553138fc
  0x01f0713a: call   0x01f0713f
  0x01f0713f: pusha  
  0x01f07140: call   0x54dedbf0
  0x01f07145: hlt    
  0x01f07146: push   0x552fd97c
  0x01f0714b: call   0x01f07150
  0x01f07150: pusha  
  0x01f07151: call   0x54dedbf0
  0x01f07156: hlt    
  0x01f07157: pop    esi
  0x01f07158: mov    DWORD PTR [edi+0x40],eax
  0x01f0715b: mov    DWORD PTR [edi+0x44],eax
  0x01f0715e: add    eax,ecx
  0x01f07160: sub    eax,0x10
  0x01f07163: mov    DWORD PTR [edi+0x4c],eax
  0x01f07166: jmp    0x01f0716b
  0x01f0716b: mov    ecx,DWORD PTR [edx+0x8]
  0x01f0716e: mov    esi,ebx
  0x01f07170: shl    esi,cl
  0x01f07172: shr    ecx,0x10
  0x01f07175: and    ecx,0xff
  0x01f0717b: add    esi,ecx
  0x01f0717d: add    esi,0x7
  0x01f07180: and    esi,0xfffffff8
  0x01f07183: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01f0718b: mov    ecx,DWORD PTR [ecx-0xc]
  0x01f0718e: mov    eax,DWORD PTR [ecx+0x44]
  0x01f07191: lea    edi,[eax+esi*1]
  0x01f07194: cmp    edi,DWORD PTR [ecx+0x4c]
  0x01f07197: ja     0x01f072aa
  0x01f0719d: mov    DWORD PTR [ecx+0x44],edi
  0x01f071a0: mov    DWORD PTR [eax],0x1
  0x01f071a6: mov    DWORD PTR [eax+0x4],edx
  0x01f071a9: mov    DWORD PTR [eax+0x8],ebx
  0x01f071ac: mov    cl,BYTE PTR [edx+0xa]
  0x01f071af: and    ecx,0xff
  0x01f071b5: sub    esi,ecx
  0x01f071b7: add    ecx,eax
  0x01f071b9: sub    esi,0x0
  0x01f071bc: je     0x01f071fe
  0x01f071c2: test   esi,0x3
  0x01f071c8: je     0x01f071df
  0x01f071ce: push   0x5530c488
  0x01f071d3: call   0x01f071d8
  0x01f071d8: pusha  
  0x01f071d9: call   0x54dedbf0
  0x01f071de: hlt    
  0x01f071df: xor    edi,edi
  0x01f071e1: shr    esi,0x3
  0x01f071e4: jae    0x01f071f3
  0x01f071ea: mov    DWORD PTR [ecx+esi*8],edi
  0x01f071ed: je     0x01f071fe
  0x01f071f3: mov    DWORD PTR [ecx+esi*8-0x4],edi
  0x01f071f7: mov    DWORD PTR [ecx+esi*8-0x8],edi
  0x01f071fb: dec    esi
  0x01f071fc: jne    0x01f071f3
  0x01f071fe: ret    
  0x01f071ff: mov    ecx,DWORD PTR [edx+0x8]
  0x01f07202: mov    esi,ebx
  0x01f07204: shl    esi,cl
  0x01f07206: shr    ecx,0x10
  0x01f07209: and    ecx,0xff
  0x01f0720f: add    esi,ecx
  0x01f07211: add    esi,0x7
  0x01f07214: and    esi,0xfffffff8
  0x01f07217: mov    eax,DWORD PTR ds:0x410dd0
  0x01f0721d: lea    ecx,[eax+esi*1]
  0x01f07220: cmp    ecx,eax
  0x01f07222: jb     0x01f072aa
  0x01f07228: cmp    ecx,DWORD PTR ds:0x410da0
  0x01f0722e: ja     0x01f072aa
  0x01f07234: lock cmpxchg DWORD PTR ds:0x410dd0,ecx
  0x01f0723c: jne    0x01f07217
  0x01f0723e: add    DWORD PTR [edi+0x88],esi
  0x01f07244: adc    DWORD PTR [edi+0x8c],0x0
  0x01f0724b: mov    DWORD PTR [eax],0x1
  0x01f07251: mov    DWORD PTR [eax+0x4],edx
  0x01f07254: mov    DWORD PTR [eax+0x8],ebx
  0x01f07257: mov    cl,BYTE PTR [edx+0xa]
  0x01f0725a: and    ecx,0xff
  0x01f07260: sub    esi,ecx
  0x01f07262: add    ecx,eax
  0x01f07264: sub    esi,0x0
  0x01f07267: je     0x01f072a9
  0x01f0726d: test   esi,0x3
  0x01f07273: je     0x01f0728a
  0x01f07279: push   0x5530c488
  0x01f0727e: call   0x01f07283
  0x01f07283: pusha  
  0x01f07284: call   0x54dedbf0
  0x01f07289: hlt    
  0x01f0728a: xor    edi,edi
  0x01f0728c: shr    esi,0x3
  0x01f0728f: jae    0x01f0729e
  0x01f07295: mov    DWORD PTR [ecx+esi*8],edi
  0x01f07298: je     0x01f072a9
  0x01f0729e: mov    DWORD PTR [ecx+esi*8-0x4],edi
  0x01f072a2: mov    DWORD PTR [ecx+esi*8-0x8],edi
  0x01f072a6: dec    esi
  0x01f072a7: jne    0x01f0729e
  0x01f072a9: ret    
  0x01f072aa: push   ebp
  0x01f072ab: mov    ebp,esp
  ;; save_live_registers
  0x01f072ad: pusha  
  0x01f072ae: sub    esp,0xf0
  0x01f072b4: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f072bf: movsd  QWORD PTR [esp],xmm0
  0x01f072c4: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f072ca: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f072d0: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f072d6: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f072dc: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f072e2: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f072e8: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f072ee: push   ebx
  0x01f072ef: push   edx
  0x01f072f0: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f072f8: mov    edi,DWORD PTR [edi-0xc]
  0x01f072fb: push   edi
  0x01f072fc: mov    DWORD PTR [edi+0x144],ebp
  0x01f07302: mov    DWORD PTR [edi+0x13c],esp
  0x01f07308: call   0x54ea94c0
  0x01f0730d: push   eax
  0x01f0730e: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f07316: mov    eax,DWORD PTR [eax-0xc]
  0x01f07319: cmp    edi,eax
  0x01f0731b: je     0x01f07333
  0x01f07321: int3   
  0x01f07322: push   0x5530cc08
  0x01f07327: call   0x01f0732c
  0x01f0732c: pusha  
  0x01f0732d: call   0x54dedbf0
  0x01f07332: hlt    
  0x01f07333: pop    eax
  0x01f07334: mov    DWORD PTR [edi+0x13c],0x0
  0x01f0733e: mov    DWORD PTR [edi+0x144],0x0
  0x01f07348: add    esp,0xc
  0x01f0734b: cmp    DWORD PTR [edi+0x4],0x0
  0x01f07352: je     0x01f0736a
  0x01f07358: mov    eax,DWORD PTR [edi+0x4]
  0x01f0735b: mov    DWORD PTR [edi+0x16c],0x0
  0x01f07365: jmp    0x01f05bf0
  0x01f0736a: mov    eax,DWORD PTR [edi+0x16c]
  0x01f07370: mov    DWORD PTR [edi+0x16c],0x0
  ;; restore_live_registers_except_rax
  0x01f0737a: movsd  xmm0,QWORD PTR [esp]
  0x01f0737f: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f07385: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f0738b: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f07391: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f07397: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f0739d: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f073a3: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f073a9: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f073b4: je     0x01f073cb
  0x01f073ba: push   0x5530ce30
  0x01f073bf: call   0x01f073c4
  0x01f073c4: pusha  
  0x01f073c5: call   0x54dedbf0
  0x01f073ca: hlt    
  0x01f073cb: add    esp,0xf0
  0x01f073d1: pop    edi
  0x01f073d2: pop    esi
  0x01f073d3: pop    ebp
  0x01f073d4: pop    ebx
  0x01f073d5: pop    ebx
  0x01f073d6: pop    edx
  0x01f073d7: pop    ecx
  0x01f073d8: add    esp,0x4
  0x01f073db: mov    esp,ebp
  0x01f073dd: pop    ebp
  0x01f073de: ret    
  0x01f073df: nop    

Decoding RuntimeStub - new_object_array Runtime1 stub 0x01f07408
  0x01f074d0: mov    eax,DWORD PTR [edx+0x8]
  0x01f074d3: sar    eax,0x1e
  0x01f074d6: cmp    eax,0xfffffffe
  0x01f074d9: je     0x01f07501
  0x01f074df: push   0x5530d1e8
  0x01f074e4: call   0x01f074e9
  0x01f074e9: pusha  
  0x01f074ea: call   0x54dedbf0
  0x01f074ef: hlt    
  0x01f074f0: push   0x552fd97c
  0x01f074f5: call   0x01f074fa
  0x01f074fa: pusha  
  0x01f074fb: call   0x54dedbf0
  0x01f07500: hlt    
  0x01f07501: cmp    ebx,0xffffff
  0x01f07507: ja     0x01f0772a
  0x01f0750d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07515: mov    edi,DWORD PTR [edi-0xc]
  0x01f07518: mov    eax,DWORD PTR [edi+0x44]
  0x01f0751b: mov    ecx,DWORD PTR [edi+0x4c]
  0x01f0751e: sub    ecx,eax
  0x01f07520: shr    ecx,0x2
  0x01f07523: cmp    ecx,DWORD PTR [edi+0x54]
  0x01f07526: jle    0x01f0753d
  0x01f0752c: mov    esi,0x4
  0x01f07531: add    DWORD PTR [edi+0x54],esi
  0x01f07534: add    DWORD PTR [edi+0x68],0x1
  0x01f07538: jmp    0x01f0767f
  0x01f0753d: add    DWORD PTR [edi+0x58],0x1
  0x01f07541: add    DWORD PTR [edi+0x5c],ecx
  0x01f07544: test   eax,eax
  0x01f07546: je     0x01f07579
  0x01f0754c: mov    DWORD PTR [eax],0x101
  0x01f07552: sub    ecx,0x3
  0x01f07555: add    ecx,0x4
  0x01f07558: shl    ecx,0x0
  0x01f0755b: mov    DWORD PTR [eax+0x8],ecx
  0x01f0755e: mov    ecx,DWORD PTR ds:0x5563111c
  0x01f07564: mov    DWORD PTR [eax+0x4],ecx
  0x01f07567: mov    ecx,eax
  0x01f07569: sub    ecx,DWORD PTR [edi+0x40]
  0x01f0756c: add    DWORD PTR [edi+0x88],ecx
  0x01f07572: adc    DWORD PTR [edi+0x8c],0x0
  0x01f07579: mov    ecx,DWORD PTR [edi+0x50]
  0x01f0757c: shl    ecx,0x2
  0x01f0757f: mov    eax,DWORD PTR ds:0x410dd0
  0x01f07585: lea    esi,[eax+ecx*1]
  0x01f07588: cmp    esi,eax
  0x01f0758a: jb     0x01f0772a
  0x01f07590: cmp    esi,DWORD PTR ds:0x410da0
  0x01f07596: ja     0x01f0772a
  0x01f0759c: lock cmpxchg DWORD PTR ds:0x410dd0,esi
  0x01f075a4: jne    0x01f0757f
  0x01f075a6: push   esi
  0x01f075a7: mov    esi,DWORD PTR [edi+0x50]
  0x01f075aa: shl    esi,0x2
  0x01f075ad: cmp    ecx,esi
  0x01f075af: je     0x01f075d7
  ;; assert(t1 != tlab size)
  0x01f075b5: push   0x553138fc
  0x01f075ba: call   0x01f075bf
  0x01f075bf: pusha  
  0x01f075c0: call   0x54dedbf0
  0x01f075c5: hlt    
  0x01f075c6: push   0x552fd97c
  0x01f075cb: call   0x01f075d0
  0x01f075d0: pusha  
  0x01f075d1: call   0x54dedbf0
  0x01f075d6: hlt    
  0x01f075d7: pop    esi
  0x01f075d8: mov    DWORD PTR [edi+0x40],eax
  0x01f075db: mov    DWORD PTR [edi+0x44],eax
  0x01f075de: add    eax,ecx
  0x01f075e0: sub    eax,0x10
  0x01f075e3: mov    DWORD PTR [edi+0x4c],eax
  0x01f075e6: jmp    0x01f075eb
  0x01f075eb: mov    ecx,DWORD PTR [edx+0x8]
  0x01f075ee: mov    esi,ebx
  0x01f075f0: shl    esi,cl
  0x01f075f2: shr    ecx,0x10
  0x01f075f5: and    ecx,0xff
  0x01f075fb: add    esi,ecx
  0x01f075fd: add    esi,0x7
  0x01f07600: and    esi,0xfffffff8
  0x01f07603: mov    ecx,DWORD PTR fs:[eiz*1+0x0]
  0x01f0760b: mov    ecx,DWORD PTR [ecx-0xc]
  0x01f0760e: mov    eax,DWORD PTR [ecx+0x44]
  0x01f07611: lea    edi,[eax+esi*1]
  0x01f07614: cmp    edi,DWORD PTR [ecx+0x4c]
  0x01f07617: ja     0x01f0772a
  0x01f0761d: mov    DWORD PTR [ecx+0x44],edi
  0x01f07620: mov    DWORD PTR [eax],0x1
  0x01f07626: mov    DWORD PTR [eax+0x4],edx
  0x01f07629: mov    DWORD PTR [eax+0x8],ebx
  0x01f0762c: mov    cl,BYTE PTR [edx+0xa]
  0x01f0762f: and    ecx,0xff
  0x01f07635: sub    esi,ecx
  0x01f07637: add    ecx,eax
  0x01f07639: sub    esi,0x0
  0x01f0763c: je     0x01f0767e
  0x01f07642: test   esi,0x3
  0x01f07648: je     0x01f0765f
  0x01f0764e: push   0x5530c488
  0x01f07653: call   0x01f07658
  0x01f07658: pusha  
  0x01f07659: call   0x54dedbf0
  0x01f0765e: hlt    
  0x01f0765f: xor    edi,edi
  0x01f07661: shr    esi,0x3
  0x01f07664: jae    0x01f07673
  0x01f0766a: mov    DWORD PTR [ecx+esi*8],edi
  0x01f0766d: je     0x01f0767e
  0x01f07673: mov    DWORD PTR [ecx+esi*8-0x4],edi
  0x01f07677: mov    DWORD PTR [ecx+esi*8-0x8],edi
  0x01f0767b: dec    esi
  0x01f0767c: jne    0x01f07673
  0x01f0767e: ret    
  0x01f0767f: mov    ecx,DWORD PTR [edx+0x8]
  0x01f07682: mov    esi,ebx
  0x01f07684: shl    esi,cl
  0x01f07686: shr    ecx,0x10
  0x01f07689: and    ecx,0xff
  0x01f0768f: add    esi,ecx
  0x01f07691: add    esi,0x7
  0x01f07694: and    esi,0xfffffff8
  0x01f07697: mov    eax,DWORD PTR ds:0x410dd0
  0x01f0769d: lea    ecx,[eax+esi*1]
  0x01f076a0: cmp    ecx,eax
  0x01f076a2: jb     0x01f0772a
  0x01f076a8: cmp    ecx,DWORD PTR ds:0x410da0
  0x01f076ae: ja     0x01f0772a
  0x01f076b4: lock cmpxchg DWORD PTR ds:0x410dd0,ecx
  0x01f076bc: jne    0x01f07697
  0x01f076be: add    DWORD PTR [edi+0x88],esi
  0x01f076c4: adc    DWORD PTR [edi+0x8c],0x0
  0x01f076cb: mov    DWORD PTR [eax],0x1
  0x01f076d1: mov    DWORD PTR [eax+0x4],edx
  0x01f076d4: mov    DWORD PTR [eax+0x8],ebx
  0x01f076d7: mov    cl,BYTE PTR [edx+0xa]
  0x01f076da: and    ecx,0xff
  0x01f076e0: sub    esi,ecx
  0x01f076e2: add    ecx,eax
  0x01f076e4: sub    esi,0x0
  0x01f076e7: je     0x01f07729
  0x01f076ed: test   esi,0x3
  0x01f076f3: je     0x01f0770a
  0x01f076f9: push   0x5530c488
  0x01f076fe: call   0x01f07703
  0x01f07703: pusha  
  0x01f07704: call   0x54dedbf0
  0x01f07709: hlt    
  0x01f0770a: xor    edi,edi
  0x01f0770c: shr    esi,0x3
  0x01f0770f: jae    0x01f0771e
  0x01f07715: mov    DWORD PTR [ecx+esi*8],edi
  0x01f07718: je     0x01f07729
  0x01f0771e: mov    DWORD PTR [ecx+esi*8-0x4],edi
  0x01f07722: mov    DWORD PTR [ecx+esi*8-0x8],edi
  0x01f07726: dec    esi
  0x01f07727: jne    0x01f0771e
  0x01f07729: ret    
  0x01f0772a: push   ebp
  0x01f0772b: mov    ebp,esp
  ;; save_live_registers
  0x01f0772d: pusha  
  0x01f0772e: sub    esp,0xf0
  0x01f07734: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f0773f: movsd  QWORD PTR [esp],xmm0
  0x01f07744: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f0774a: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f07750: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f07756: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f0775c: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f07762: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f07768: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f0776e: push   ebx
  0x01f0776f: push   edx
  0x01f07770: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07778: mov    edi,DWORD PTR [edi-0xc]
  0x01f0777b: push   edi
  0x01f0777c: mov    DWORD PTR [edi+0x144],ebp
  0x01f07782: mov    DWORD PTR [edi+0x13c],esp
  0x01f07788: call   0x54ea9670
  0x01f0778d: push   eax
  0x01f0778e: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f07796: mov    eax,DWORD PTR [eax-0xc]
  0x01f07799: cmp    edi,eax
  0x01f0779b: je     0x01f077b3
  0x01f077a1: int3   
  0x01f077a2: push   0x5530cc08
  0x01f077a7: call   0x01f077ac
  0x01f077ac: pusha  
  0x01f077ad: call   0x54dedbf0
  0x01f077b2: hlt    
  0x01f077b3: pop    eax
  0x01f077b4: mov    DWORD PTR [edi+0x13c],0x0
  0x01f077be: mov    DWORD PTR [edi+0x144],0x0
  0x01f077c8: add    esp,0xc
  0x01f077cb: cmp    DWORD PTR [edi+0x4],0x0
  0x01f077d2: je     0x01f077ea
  0x01f077d8: mov    eax,DWORD PTR [edi+0x4]
  0x01f077db: mov    DWORD PTR [edi+0x16c],0x0
  0x01f077e5: jmp    0x01f05bf0
  0x01f077ea: mov    eax,DWORD PTR [edi+0x16c]
  0x01f077f0: mov    DWORD PTR [edi+0x16c],0x0
  ;; restore_live_registers_except_rax
  0x01f077fa: movsd  xmm0,QWORD PTR [esp]
  0x01f077ff: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f07805: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f0780b: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f07811: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f07817: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f0781d: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f07823: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f07829: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f07834: je     0x01f0784b
  0x01f0783a: push   0x5530ce30
  0x01f0783f: call   0x01f07844
  0x01f07844: pusha  
  0x01f07845: call   0x54dedbf0
  0x01f0784a: hlt    
  0x01f0784b: add    esp,0xf0
  0x01f07851: pop    edi
  0x01f07852: pop    esi
  0x01f07853: pop    ebp
  0x01f07854: pop    ebx
  0x01f07855: pop    ebx
  0x01f07856: pop    edx
  0x01f07857: pop    ecx
  0x01f07858: add    esp,0x4
  0x01f0785b: mov    esp,ebp
  0x01f0785d: pop    ebp
  0x01f0785e: ret    
  0x01f0785f: nop    

Decoding RuntimeStub - new_multi_array Runtime1 stub 0x01f07888
  0x01f078e0: push   ebp
  0x01f078e1: mov    ebp,esp
  ;; save_live_registers
  0x01f078e3: pusha  
  0x01f078e4: sub    esp,0xf0
  0x01f078ea: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f078f5: movsd  QWORD PTR [esp],xmm0
  0x01f078fa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f07900: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f07906: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0790c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f07912: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f07918: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0791e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f07924: push   ecx
  0x01f07925: push   ebx
  0x01f07926: push   eax
  0x01f07927: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f0792f: mov    edi,DWORD PTR [edi-0xc]
  0x01f07932: push   edi
  0x01f07933: mov    DWORD PTR [edi+0x144],ebp
  0x01f07939: mov    DWORD PTR [edi+0x13c],esp
  0x01f0793f: call   0x54ea9820
  0x01f07944: push   eax
  0x01f07945: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f0794d: mov    eax,DWORD PTR [eax-0xc]
  0x01f07950: cmp    edi,eax
  0x01f07952: je     0x01f0796a
  0x01f07958: int3   
  0x01f07959: push   0x5530cc08
  0x01f0795e: call   0x01f07963
  0x01f07963: pusha  
  0x01f07964: call   0x54dedbf0
  0x01f07969: hlt    
  0x01f0796a: pop    eax
  0x01f0796b: mov    DWORD PTR [edi+0x13c],0x0
  0x01f07975: mov    DWORD PTR [edi+0x144],0x0
  0x01f0797f: add    esp,0x10
  0x01f07982: cmp    DWORD PTR [edi+0x4],0x0
  0x01f07989: je     0x01f079a1
  0x01f0798f: mov    eax,DWORD PTR [edi+0x4]
  0x01f07992: mov    DWORD PTR [edi+0x16c],0x0
  0x01f0799c: jmp    0x01f05bf0
  0x01f079a1: mov    eax,DWORD PTR [edi+0x16c]
  0x01f079a7: mov    DWORD PTR [edi+0x16c],0x0
  ;; restore_live_registers_except_rax
  0x01f079b1: movsd  xmm0,QWORD PTR [esp]
  0x01f079b6: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f079bc: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f079c2: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f079c8: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f079ce: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f079d4: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f079da: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f079e0: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f079eb: je     0x01f07a02
  0x01f079f1: push   0x5530ce30
  0x01f079f6: call   0x01f079fb
  0x01f079fb: pusha  
  0x01f079fc: call   0x54dedbf0
  0x01f07a01: hlt    
  0x01f07a02: add    esp,0xf0
  0x01f07a08: pop    edi
  0x01f07a09: pop    esi
  0x01f07a0a: pop    ebp
  0x01f07a0b: pop    ebx
  0x01f07a0c: pop    ebx
  0x01f07a0d: pop    edx
  0x01f07a0e: pop    ecx
  0x01f07a0f: add    esp,0x4
  0x01f07a12: mov    esp,ebp
  0x01f07a14: pop    ebp
  0x01f07a15: ret    
  0x01f07a16: nop    
  0x01f07a17: nop    

Decoding RuntimeStub - handle_exception_nofpu Runtime1 stub 0x01f07a48
  0x01f07ab0: push   ebp
  0x01f07ab1: mov    ebp,esp
  ;; generate_handle_exception
  ;; save_live_registers
  0x01f07ab3: pusha  
  0x01f07ab4: sub    esp,0xf0
  0x01f07aba: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f07ac5: movsd  QWORD PTR [esp],xmm0
  0x01f07aca: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f07ad0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f07ad6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f07adc: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f07ae2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f07ae8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f07aee: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f07af4: mov    ebx,0xdead
  0x01f07af9: mov    ecx,0xdead
  0x01f07afe: mov    esi,0xdead
  0x01f07b03: mov    edi,0xdead
  0x01f07b08: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07b10: mov    edi,DWORD PTR [edi-0xc]
  0x01f07b13: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f07b1d: je     0x01f07b34
  0x01f07b23: push   0x5530cee4
  0x01f07b28: call   0x01f07b2d
  0x01f07b2d: pusha  
  0x01f07b2e: call   0x54dedbf0
  0x01f07b33: hlt    
  0x01f07b34: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f07b3e: je     0x01f07b55
  0x01f07b44: push   0x5530cf00
  0x01f07b49: call   0x01f07b4e
  0x01f07b4e: pusha  
  0x01f07b4f: call   0x54dedbf0
  0x01f07b54: hlt    
  0x01f07b55: mov    DWORD PTR [edi+0x1ac],eax
  0x01f07b5b: mov    DWORD PTR [edi+0x1b0],edx
  0x01f07b61: mov    DWORD PTR [ebp+0x4],edx
  0x01f07b64: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07b6c: mov    edi,DWORD PTR [edi-0xc]
  0x01f07b6f: push   edi
  0x01f07b70: mov    DWORD PTR [edi+0x144],ebp
  0x01f07b76: mov    DWORD PTR [edi+0x13c],esp
  0x01f07b7c: call   0x54ea9c50
  0x01f07b81: push   eax
  0x01f07b82: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f07b8a: mov    eax,DWORD PTR [eax-0xc]
  0x01f07b8d: cmp    edi,eax
  0x01f07b8f: je     0x01f07ba7
  0x01f07b95: int3   
  0x01f07b96: push   0x5530cc08
  0x01f07b9b: call   0x01f07ba0
  0x01f07ba0: pusha  
  0x01f07ba1: call   0x54dedbf0
  0x01f07ba6: hlt    
  0x01f07ba7: pop    eax
  0x01f07ba8: mov    DWORD PTR [edi+0x13c],0x0
  0x01f07bb2: mov    DWORD PTR [edi+0x144],0x0
  0x01f07bbc: add    esp,0x4
  0x01f07bbf: cmp    DWORD PTR [edi+0x4],0x0
  0x01f07bc6: je     0x01f07bd4
  0x01f07bcc: mov    eax,DWORD PTR [edi+0x4]
  0x01f07bcf: jmp    0x01f05bf0
  0x01f07bd4: mov    ebx,0xdead
  0x01f07bd9: mov    ecx,0xdead
  0x01f07bde: mov    edx,0xdead
  0x01f07be3: mov    esi,0xdead
  0x01f07be8: mov    edi,0xdead
  0x01f07bed: mov    DWORD PTR [ebp+0x4],eax
  ;; restore_live_registers
  0x01f07bf0: movsd  xmm0,QWORD PTR [esp]
  0x01f07bf5: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f07bfb: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f07c01: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f07c07: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f07c0d: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f07c13: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f07c19: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f07c1f: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f07c2a: je     0x01f07c41
  0x01f07c30: push   0x5530ce30
  0x01f07c35: call   0x01f07c3a
  0x01f07c3a: pusha  
  0x01f07c3b: call   0x54dedbf0
  0x01f07c40: hlt    
  0x01f07c41: add    esp,0xf0
  0x01f07c47: popa   
  0x01f07c48: mov    esp,ebp
  0x01f07c4a: pop    ebp
  0x01f07c4b: ret    

Decoding RuntimeStub - handle_exception Runtime1 stub 0x01f07c88
  0x01f07cf0: push   ebp
  0x01f07cf1: mov    ebp,esp
  ;; generate_handle_exception
  ;; save_live_registers
  0x01f07cf3: pusha  
  0x01f07cf4: sub    esp,0xf0
  0x01f07cfa: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f07d05: mov    ebx,0xdead
  0x01f07d0a: mov    ecx,0xdead
  0x01f07d0f: mov    esi,0xdead
  0x01f07d14: mov    edi,0xdead
  0x01f07d19: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07d21: mov    edi,DWORD PTR [edi-0xc]
  0x01f07d24: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f07d2e: je     0x01f07d45
  0x01f07d34: push   0x5530cee4
  0x01f07d39: call   0x01f07d3e
  0x01f07d3e: pusha  
  0x01f07d3f: call   0x54dedbf0
  0x01f07d44: hlt    
  0x01f07d45: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f07d4f: je     0x01f07d66
  0x01f07d55: push   0x5530cf00
  0x01f07d5a: call   0x01f07d5f
  0x01f07d5f: pusha  
  0x01f07d60: call   0x54dedbf0
  0x01f07d65: hlt    
  0x01f07d66: mov    DWORD PTR [edi+0x1ac],eax
  0x01f07d6c: mov    DWORD PTR [edi+0x1b0],edx
  0x01f07d72: mov    DWORD PTR [ebp+0x4],edx
  0x01f07d75: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07d7d: mov    edi,DWORD PTR [edi-0xc]
  0x01f07d80: push   edi
  0x01f07d81: mov    DWORD PTR [edi+0x144],ebp
  0x01f07d87: mov    DWORD PTR [edi+0x13c],esp
  0x01f07d8d: call   0x54ea9c50
  0x01f07d92: push   eax
  0x01f07d93: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f07d9b: mov    eax,DWORD PTR [eax-0xc]
  0x01f07d9e: cmp    edi,eax
  0x01f07da0: je     0x01f07db8
  0x01f07da6: int3   
  0x01f07da7: push   0x5530cc08
  0x01f07dac: call   0x01f07db1
  0x01f07db1: pusha  
  0x01f07db2: call   0x54dedbf0
  0x01f07db7: hlt    
  0x01f07db8: pop    eax
  0x01f07db9: mov    DWORD PTR [edi+0x13c],0x0
  0x01f07dc3: mov    DWORD PTR [edi+0x144],0x0
  0x01f07dcd: add    esp,0x4
  0x01f07dd0: cmp    DWORD PTR [edi+0x4],0x0
  0x01f07dd7: je     0x01f07de5
  0x01f07ddd: mov    eax,DWORD PTR [edi+0x4]
  0x01f07de0: jmp    0x01f05bf0
  0x01f07de5: mov    ebx,0xdead
  0x01f07dea: mov    ecx,0xdead
  0x01f07def: mov    edx,0xdead
  0x01f07df4: mov    esi,0xdead
  0x01f07df9: mov    edi,0xdead
  0x01f07dfe: mov    DWORD PTR [ebp+0x4],eax
  ;; restore_live_registers
  0x01f07e01: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f07e0c: je     0x01f07e23
  0x01f07e12: push   0x5530ce30
  0x01f07e17: call   0x01f07e1c
  0x01f07e1c: pusha  
  0x01f07e1d: call   0x54dedbf0
  0x01f07e22: hlt    
  0x01f07e23: add    esp,0xf0
  0x01f07e29: popa   
  0x01f07e2a: mov    esp,ebp
  0x01f07e2c: pop    ebp
  0x01f07e2d: ret    
  0x01f07e2e: nop    
  0x01f07e2f: nop    

Decoding RuntimeStub - handle_exception_from_callee Runtime1 stub 0x01f07e48
  0x01f07ea0: push   ebp
  0x01f07ea1: mov    ebp,esp
  ;; generate_handle_exception
  0x01f07ea3: mov    ebx,0xdead
  0x01f07ea8: mov    ecx,0xdead
  0x01f07ead: mov    esi,0xdead
  0x01f07eb2: mov    edi,0xdead
  0x01f07eb7: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07ebf: mov    edi,DWORD PTR [edi-0xc]
  0x01f07ec2: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f07ecc: je     0x01f07ee3
  0x01f07ed2: push   0x5530cee4
  0x01f07ed7: call   0x01f07edc
  0x01f07edc: pusha  
  0x01f07edd: call   0x54dedbf0
  0x01f07ee2: hlt    
  0x01f07ee3: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f07eed: je     0x01f07f04
  0x01f07ef3: push   0x5530cf00
  0x01f07ef8: call   0x01f07efd
  0x01f07efd: pusha  
  0x01f07efe: call   0x54dedbf0
  0x01f07f03: hlt    
  0x01f07f04: mov    DWORD PTR [edi+0x1ac],eax
  0x01f07f0a: mov    DWORD PTR [edi+0x1b0],edx
  0x01f07f10: mov    DWORD PTR [ebp+0x4],edx
  0x01f07f13: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07f1b: mov    edi,DWORD PTR [edi-0xc]
  0x01f07f1e: push   edi
  0x01f07f1f: mov    DWORD PTR [edi+0x144],ebp
  0x01f07f25: mov    DWORD PTR [edi+0x13c],esp
  0x01f07f2b: call   0x54ea9c50
  0x01f07f30: push   eax
  0x01f07f31: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f07f39: mov    eax,DWORD PTR [eax-0xc]
  0x01f07f3c: cmp    edi,eax
  0x01f07f3e: je     0x01f07f56
  0x01f07f44: int3   
  0x01f07f45: push   0x5530cc08
  0x01f07f4a: call   0x01f07f4f
  0x01f07f4f: pusha  
  0x01f07f50: call   0x54dedbf0
  0x01f07f55: hlt    
  0x01f07f56: pop    eax
  0x01f07f57: mov    DWORD PTR [edi+0x13c],0x0
  0x01f07f61: mov    DWORD PTR [edi+0x144],0x0
  0x01f07f6b: add    esp,0x4
  0x01f07f6e: cmp    DWORD PTR [edi+0x4],0x0
  0x01f07f75: je     0x01f07f83
  0x01f07f7b: mov    eax,DWORD PTR [edi+0x4]
  0x01f07f7e: jmp    0x01f05bf0
  0x01f07f83: mov    ebx,0xdead
  0x01f07f88: mov    ecx,0xdead
  0x01f07f8d: mov    edx,0xdead
  0x01f07f92: mov    esi,0xdead
  0x01f07f97: mov    edi,0xdead
  0x01f07f9c: mov    DWORD PTR [ebp+0x4],eax
  0x01f07f9f: mov    esp,ebp
  0x01f07fa1: pop    ebp
  0x01f07fa2: pop    ecx
  0x01f07fa3: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f07fab: mov    edi,DWORD PTR [edi-0xc]
  0x01f07fae: cmp    DWORD PTR [edi+0x1b8],0x0
  0x01f07fb8: cmovne esp,ebp
  0x01f07fbb: jmp    ecx
  0x01f07fbd: mov    esp,ebp
  0x01f07fbf: pop    ebp
  0x01f07fc0: ret    
  0x01f07fc1: nop    
  0x01f07fc2: nop    
  0x01f07fc3: nop    

Decoding RuntimeStub - throw_array_store_exception Runtime1 stub 0x01f08008
  0x01f08060: push   ebp
  0x01f08061: mov    ebp,esp
  ;; save_live_registers
  0x01f08063: pusha  
  0x01f08064: sub    esp,0xf0
  0x01f0806a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08075: movsd  QWORD PTR [esp],xmm0
  0x01f0807a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f08080: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f08086: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0808c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f08092: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f08098: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0809e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f080a4: mov    eax,0xdead
  0x01f080a9: mov    ebx,0xdead
  0x01f080ae: mov    ecx,0xdead
  0x01f080b3: mov    edx,0xdead
  0x01f080b8: mov    esi,0xdead
  0x01f080bd: mov    edi,0xdead
  0x01f080c2: mov    ebx,DWORD PTR [ebp+0x8]
  0x01f080c5: push   ebx
  0x01f080c6: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f080ce: mov    edi,DWORD PTR [edi-0xc]
  0x01f080d1: push   edi
  0x01f080d2: mov    DWORD PTR [edi+0x144],ebp
  0x01f080d8: mov    DWORD PTR [edi+0x13c],esp
  0x01f080de: call   0x54eaa430
  0x01f080e3: push   eax
  0x01f080e4: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f080ec: mov    eax,DWORD PTR [eax-0xc]
  0x01f080ef: cmp    edi,eax
  0x01f080f1: je     0x01f08109
  0x01f080f7: int3   
  0x01f080f8: push   0x5530cc08
  0x01f080fd: call   0x01f08102
  0x01f08102: pusha  
  0x01f08103: call   0x54dedbf0
  0x01f08108: hlt    
  0x01f08109: pop    eax
  0x01f0810a: mov    DWORD PTR [edi+0x13c],0x0
  0x01f08114: mov    DWORD PTR [edi+0x144],0x0
  0x01f0811e: add    esp,0x8
  0x01f08121: cmp    DWORD PTR [edi+0x4],0x0
  0x01f08128: je     0x01f08136
  0x01f0812e: mov    eax,DWORD PTR [edi+0x4]
  0x01f08131: jmp    0x01f05bf0
  0x01f08136: push   0x5530ce84
  0x01f0813b: call   0x01f08140
  0x01f08140: pusha  
  0x01f08141: call   0x54dedbf0
  0x01f08146: hlt    
  0x01f08147: mov    esp,ebp
  0x01f08149: pop    ebp
  0x01f0814a: ret    
  0x01f0814b: nop    

Decoding RuntimeStub - throw_class_cast_exception Runtime1 stub 0x01f08188
  0x01f081e0: push   ebp
  0x01f081e1: mov    ebp,esp
  ;; save_live_registers
  0x01f081e3: pusha  
  0x01f081e4: sub    esp,0xf0
  0x01f081ea: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f081f5: movsd  QWORD PTR [esp],xmm0
  0x01f081fa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f08200: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f08206: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0820c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f08212: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f08218: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0821e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f08224: mov    eax,0xdead
  0x01f08229: mov    ebx,0xdead
  0x01f0822e: mov    ecx,0xdead
  0x01f08233: mov    edx,0xdead
  0x01f08238: mov    esi,0xdead
  0x01f0823d: mov    edi,0xdead
  0x01f08242: mov    ebx,DWORD PTR [ebp+0x8]
  0x01f08245: push   ebx
  0x01f08246: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f0824e: mov    edi,DWORD PTR [edi-0xc]
  0x01f08251: push   edi
  0x01f08252: mov    DWORD PTR [edi+0x144],ebp
  0x01f08258: mov    DWORD PTR [edi+0x13c],esp
  0x01f0825e: call   0x54eaa1b0
  0x01f08263: push   eax
  0x01f08264: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f0826c: mov    eax,DWORD PTR [eax-0xc]
  0x01f0826f: cmp    edi,eax
  0x01f08271: je     0x01f08289
  0x01f08277: int3   
  0x01f08278: push   0x5530cc08
  0x01f0827d: call   0x01f08282
  0x01f08282: pusha  
  0x01f08283: call   0x54dedbf0
  0x01f08288: hlt    
  0x01f08289: pop    eax
  0x01f0828a: mov    DWORD PTR [edi+0x13c],0x0
  0x01f08294: mov    DWORD PTR [edi+0x144],0x0
  0x01f0829e: add    esp,0x8
  0x01f082a1: cmp    DWORD PTR [edi+0x4],0x0
  0x01f082a8: je     0x01f082b6
  0x01f082ae: mov    eax,DWORD PTR [edi+0x4]
  0x01f082b1: jmp    0x01f05bf0
  0x01f082b6: push   0x5530ce84
  0x01f082bb: call   0x01f082c0
  0x01f082c0: pusha  
  0x01f082c1: call   0x54dedbf0
  0x01f082c6: hlt    
  0x01f082c7: mov    esp,ebp
  0x01f082c9: pop    ebp
  0x01f082ca: ret    
  0x01f082cb: nop    

Decoding RuntimeStub - throw_incompatible_class_change_error Runtime1 stub 0x01f08308
  0x01f08360: push   ebp
  0x01f08361: mov    ebp,esp
  ;; save_live_registers
  0x01f08363: pusha  
  0x01f08364: sub    esp,0xf0
  0x01f0836a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08375: movsd  QWORD PTR [esp],xmm0
  0x01f0837a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f08380: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f08386: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0838c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f08392: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f08398: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0839e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f083a4: mov    eax,0xdead
  0x01f083a9: mov    ebx,0xdead
  0x01f083ae: mov    ecx,0xdead
  0x01f083b3: mov    edx,0xdead
  0x01f083b8: mov    esi,0xdead
  0x01f083bd: mov    edi,0xdead
  0x01f083c2: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f083ca: mov    edi,DWORD PTR [edi-0xc]
  0x01f083cd: push   edi
  0x01f083ce: mov    DWORD PTR [edi+0x144],ebp
  0x01f083d4: mov    DWORD PTR [edi+0x13c],esp
  0x01f083da: call   0x54eaa300
  0x01f083df: push   eax
  0x01f083e0: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f083e8: mov    eax,DWORD PTR [eax-0xc]
  0x01f083eb: cmp    edi,eax
  0x01f083ed: je     0x01f08405
  0x01f083f3: int3   
  0x01f083f4: push   0x5530cc08
  0x01f083f9: call   0x01f083fe
  0x01f083fe: pusha  
  0x01f083ff: call   0x54dedbf0
  0x01f08404: hlt    
  0x01f08405: pop    eax
  0x01f08406: mov    DWORD PTR [edi+0x13c],0x0
  0x01f08410: mov    DWORD PTR [edi+0x144],0x0
  0x01f0841a: add    esp,0x4
  0x01f0841d: cmp    DWORD PTR [edi+0x4],0x0
  0x01f08424: je     0x01f08432
  0x01f0842a: mov    eax,DWORD PTR [edi+0x4]
  0x01f0842d: jmp    0x01f05bf0
  0x01f08432: push   0x5530ce84
  0x01f08437: call   0x01f0843c
  0x01f0843c: pusha  
  0x01f0843d: call   0x54dedbf0
  0x01f08442: hlt    
  0x01f08443: mov    esp,ebp
  0x01f08445: pop    ebp
  0x01f08446: ret    
  0x01f08447: nop    

Decoding RuntimeStub - slow_subtype_check Runtime1 stub 0x01f08488
  0x01f084d0: push   edi
  0x01f084d1: push   esi
  0x01f084d2: push   ecx
  0x01f084d3: push   eax
  0x01f084d4: mov    esi,DWORD PTR [esp+0x18]
  0x01f084d8: mov    eax,DWORD PTR [esp+0x14]
  0x01f084dc: inc    DWORD PTR ds:0x556349a0
  0x01f084e2: mov    edi,DWORD PTR [esi+0x18]
  0x01f084e5: mov    ecx,DWORD PTR [edi]
  0x01f084e7: add    edi,0x4
  0x01f084ea: test   eax,eax
  0x01f084ec: repnz scas eax,DWORD PTR es:[edi]
  0x01f084ee: jne    0x01f08504
  0x01f084f4: mov    DWORD PTR [esi+0x14],eax
  0x01f084f7: mov    DWORD PTR [esp+0x18],0x1
  0x01f084ff: pop    eax
  0x01f08500: pop    ecx
  0x01f08501: pop    esi
  0x01f08502: pop    edi
  0x01f08503: ret    
  0x01f08504: mov    DWORD PTR [esp+0x18],0x0
  0x01f0850c: pop    eax
  0x01f0850d: pop    ecx
  0x01f0850e: pop    esi
  0x01f0850f: pop    edi
  0x01f08510: ret    
  0x01f08511: nop    
  0x01f08512: nop    
  0x01f08513: nop    

Decoding RuntimeStub - monitorenter Runtime1 stub 0x01f08548
  0x01f085a0: push   ebp
  0x01f085a1: mov    ebp,esp
  ;; save_live_registers
  0x01f085a3: pusha  
  0x01f085a4: sub    esp,0xf0
  0x01f085aa: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f085b5: movsd  QWORD PTR [esp],xmm0
  0x01f085ba: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f085c0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f085c6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f085cc: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f085d2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f085d8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f085de: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f085e4: mov    eax,DWORD PTR [ebp+0xc]
  0x01f085e7: mov    ebx,DWORD PTR [ebp+0x8]
  0x01f085ea: push   ebx
  0x01f085eb: push   eax
  0x01f085ec: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f085f4: mov    edi,DWORD PTR [edi-0xc]
  0x01f085f7: push   edi
  0x01f085f8: mov    DWORD PTR [edi+0x144],ebp
  0x01f085fe: mov    DWORD PTR [edi+0x13c],esp
  0x01f08604: call   0x54eaa560
  0x01f08609: push   eax
  0x01f0860a: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f08612: mov    eax,DWORD PTR [eax-0xc]
  0x01f08615: cmp    edi,eax
  0x01f08617: je     0x01f0862f
  0x01f0861d: int3   
  0x01f0861e: push   0x5530cc08
  0x01f08623: call   0x01f08628
  0x01f08628: pusha  
  0x01f08629: call   0x54dedbf0
  0x01f0862e: hlt    
  0x01f0862f: pop    eax
  0x01f08630: mov    DWORD PTR [edi+0x13c],0x0
  0x01f0863a: mov    DWORD PTR [edi+0x144],0x0
  0x01f08644: add    esp,0xc
  0x01f08647: cmp    DWORD PTR [edi+0x4],0x0
  0x01f0864e: je     0x01f0865c
  0x01f08654: mov    eax,DWORD PTR [edi+0x4]
  0x01f08657: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f0865c: movsd  xmm0,QWORD PTR [esp]
  0x01f08661: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f08667: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f0866d: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f08673: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f08679: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f0867f: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f08685: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f0868b: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08696: je     0x01f086ad
  0x01f0869c: push   0x5530ce30
  0x01f086a1: call   0x01f086a6
  0x01f086a6: pusha  
  0x01f086a7: call   0x54dedbf0
  0x01f086ac: hlt    
  0x01f086ad: add    esp,0xf0
  0x01f086b3: popa   
  0x01f086b4: mov    esp,ebp
  0x01f086b6: pop    ebp
  0x01f086b7: ret    

Decoding RuntimeStub - monitorenter_nofpu Runtime1 stub 0x01f086c8
  0x01f08720: push   ebp
  0x01f08721: mov    ebp,esp
  ;; save_live_registers
  0x01f08723: pusha  
  0x01f08724: sub    esp,0xf0
  0x01f0872a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08735: mov    eax,DWORD PTR [ebp+0xc]
  0x01f08738: mov    ebx,DWORD PTR [ebp+0x8]
  0x01f0873b: push   ebx
  0x01f0873c: push   eax
  0x01f0873d: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f08745: mov    edi,DWORD PTR [edi-0xc]
  0x01f08748: push   edi
  0x01f08749: mov    DWORD PTR [edi+0x144],ebp
  0x01f0874f: mov    DWORD PTR [edi+0x13c],esp
  0x01f08755: call   0x54eaa560
  0x01f0875a: push   eax
  0x01f0875b: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f08763: mov    eax,DWORD PTR [eax-0xc]
  0x01f08766: cmp    edi,eax
  0x01f08768: je     0x01f08780
  0x01f0876e: int3   
  0x01f0876f: push   0x5530cc08
  0x01f08774: call   0x01f08779
  0x01f08779: pusha  
  0x01f0877a: call   0x54dedbf0
  0x01f0877f: hlt    
  0x01f08780: pop    eax
  0x01f08781: mov    DWORD PTR [edi+0x13c],0x0
  0x01f0878b: mov    DWORD PTR [edi+0x144],0x0
  0x01f08795: add    esp,0xc
  0x01f08798: cmp    DWORD PTR [edi+0x4],0x0
  0x01f0879f: je     0x01f087ad
  0x01f087a5: mov    eax,DWORD PTR [edi+0x4]
  0x01f087a8: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f087ad: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f087b8: je     0x01f087cf
  0x01f087be: push   0x5530ce30
  0x01f087c3: call   0x01f087c8
  0x01f087c8: pusha  
  0x01f087c9: call   0x54dedbf0
  0x01f087ce: hlt    
  0x01f087cf: add    esp,0xf0
  0x01f087d5: popa   
  0x01f087d6: mov    esp,ebp
  0x01f087d8: pop    ebp
  0x01f087d9: ret    
  0x01f087da: nop    
  0x01f087db: nop    

Decoding RuntimeStub - monitorexit Runtime1 stub 0x01f08808
  0x01f08860: push   ebp
  0x01f08861: mov    ebp,esp
  ;; save_live_registers
  0x01f08863: pusha  
  0x01f08864: sub    esp,0xf0
  0x01f0886a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08875: movsd  QWORD PTR [esp],xmm0
  0x01f0887a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f08880: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f08886: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f0888c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f08892: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f08898: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f0889e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f088a4: mov    eax,DWORD PTR [ebp+0x8]
  0x01f088a7: push   eax
  0x01f088a8: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f088b0: mov    edi,DWORD PTR [edi-0xc]
  0x01f088b3: push   edi
  0x01f088b4: mov    DWORD PTR [edi+0x144],ebp
  0x01f088ba: mov    DWORD PTR [edi+0x13c],esp
  0x01f088c0: call   0x54eaa790
  0x01f088c5: push   eax
  0x01f088c6: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f088ce: mov    eax,DWORD PTR [eax-0xc]
  0x01f088d1: cmp    edi,eax
  0x01f088d3: je     0x01f088eb
  0x01f088d9: int3   
  0x01f088da: push   0x5530cc08
  0x01f088df: call   0x01f088e4
  0x01f088e4: pusha  
  0x01f088e5: call   0x54dedbf0
  0x01f088ea: hlt    
  0x01f088eb: pop    eax
  0x01f088ec: mov    DWORD PTR [edi+0x13c],0x0
  0x01f088f6: mov    DWORD PTR [edi+0x144],0x0
  0x01f08900: add    esp,0x8
  0x01f08903: cmp    DWORD PTR [edi+0x4],0x0
  0x01f0890a: je     0x01f08918
  0x01f08910: mov    eax,DWORD PTR [edi+0x4]
  0x01f08913: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f08918: movsd  xmm0,QWORD PTR [esp]
  0x01f0891d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f08923: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f08929: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f0892f: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f08935: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f0893b: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f08941: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f08947: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08952: je     0x01f08969
  0x01f08958: push   0x5530ce30
  0x01f0895d: call   0x01f08962
  0x01f08962: pusha  
  0x01f08963: call   0x54dedbf0
  0x01f08968: hlt    
  0x01f08969: add    esp,0xf0
  0x01f0896f: popa   
  0x01f08970: mov    esp,ebp
  0x01f08972: pop    ebp
  0x01f08973: ret    

Decoding RuntimeStub - monitorexit_nofpu Runtime1 stub 0x01f08988
  0x01f089e0: push   ebp
  0x01f089e1: mov    ebp,esp
  ;; save_live_registers
  0x01f089e3: pusha  
  0x01f089e4: sub    esp,0xf0
  0x01f089ea: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f089f5: mov    eax,DWORD PTR [ebp+0x8]
  0x01f089f8: push   eax
  0x01f089f9: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f08a01: mov    edi,DWORD PTR [edi-0xc]
  0x01f08a04: push   edi
  0x01f08a05: mov    DWORD PTR [edi+0x144],ebp
  0x01f08a0b: mov    DWORD PTR [edi+0x13c],esp
  0x01f08a11: call   0x54eaa790
  0x01f08a16: push   eax
  0x01f08a17: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f08a1f: mov    eax,DWORD PTR [eax-0xc]
  0x01f08a22: cmp    edi,eax
  0x01f08a24: je     0x01f08a3c
  0x01f08a2a: int3   
  0x01f08a2b: push   0x5530cc08
  0x01f08a30: call   0x01f08a35
  0x01f08a35: pusha  
  0x01f08a36: call   0x54dedbf0
  0x01f08a3b: hlt    
  0x01f08a3c: pop    eax
  0x01f08a3d: mov    DWORD PTR [edi+0x13c],0x0
  0x01f08a47: mov    DWORD PTR [edi+0x144],0x0
  0x01f08a51: add    esp,0x8
  0x01f08a54: cmp    DWORD PTR [edi+0x4],0x0
  0x01f08a5b: je     0x01f08a69
  0x01f08a61: mov    eax,DWORD PTR [edi+0x4]
  0x01f08a64: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f08a69: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f08a74: je     0x01f08a8b
  0x01f08a7a: push   0x5530ce30
  0x01f08a7f: call   0x01f08a84
  0x01f08a84: pusha  
  0x01f08a85: call   0x54dedbf0
  0x01f08a8a: hlt    
  0x01f08a8b: add    esp,0xf0
  0x01f08a91: popa   
  0x01f08a92: mov    esp,ebp
  0x01f08a94: pop    ebp
  0x01f08a95: ret    
  0x01f08a96: nop    
  0x01f08a97: nop    

Decoding RuntimeStub - deoptimize Runtime1 stub 0x01f12b48
  0x01f12ba0: push   ebp
  0x01f12ba1: mov    ebp,esp
  ;; save_live_registers
  0x01f12ba3: pusha  
  0x01f12ba4: sub    esp,0xf0
  0x01f12baa: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f12bb5: movsd  QWORD PTR [esp],xmm0
  0x01f12bba: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f12bc0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f12bc6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f12bcc: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f12bd2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f12bd8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f12bde: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f12be4: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f12bec: mov    edi,DWORD PTR [edi-0xc]
  0x01f12bef: push   edi
  0x01f12bf0: mov    DWORD PTR [edi+0x144],ebp
  0x01f12bf6: mov    DWORD PTR [edi+0x13c],esp
  0x01f12bfc: call   0x54eaa960
  0x01f12c01: push   eax
  0x01f12c02: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f12c0a: mov    eax,DWORD PTR [eax-0xc]
  0x01f12c0d: cmp    edi,eax
  0x01f12c0f: je     0x01f12c27
  0x01f12c15: int3   
  0x01f12c16: push   0x5530cc08
  0x01f12c1b: call   0x01f12c20
  0x01f12c20: pusha  
  0x01f12c21: call   0x54dedbf0
  0x01f12c26: hlt    
  0x01f12c27: pop    eax
  0x01f12c28: mov    DWORD PTR [edi+0x13c],0x0
  0x01f12c32: mov    DWORD PTR [edi+0x144],0x0
  0x01f12c3c: add    esp,0x4
  0x01f12c3f: cmp    DWORD PTR [edi+0x4],0x0
  0x01f12c46: je     0x01f12c54
  0x01f12c4c: mov    eax,DWORD PTR [edi+0x4]
  0x01f12c4f: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f12c54: movsd  xmm0,QWORD PTR [esp]
  0x01f12c59: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f12c5f: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f12c65: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f12c6b: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f12c71: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f12c77: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f12c7d: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f12c83: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f12c8e: je     0x01f12ca5
  0x01f12c94: push   0x5530ce30
  0x01f12c99: call   0x01f12c9e
  0x01f12c9e: pusha  
  0x01f12c9f: call   0x54dedbf0
  0x01f12ca4: hlt    
  0x01f12ca5: add    esp,0xf0
  0x01f12cab: popa   
  0x01f12cac: mov    esp,ebp
  0x01f12cae: pop    ebp
  0x01f12caf: jmp    0x01ea409f
  0x01f12cb4: mov    esp,ebp
  0x01f12cb6: pop    ebp
  0x01f12cb7: ret    

Decoding RuntimeStub - access_field_patching Runtime1 stub 0x01f12cc8
  0x01f12d40: push   ebp
  0x01f12d41: mov    ebp,esp
  ;; save_live_registers
  0x01f12d43: pusha  
  0x01f12d44: sub    esp,0xf0
  0x01f12d4a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f12d55: movsd  QWORD PTR [esp],xmm0
  0x01f12d5a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f12d60: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f12d66: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f12d6c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f12d72: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f12d78: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f12d7e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f12d84: push   eax
  0x01f12d85: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f12d8d: mov    edi,DWORD PTR [edi-0xc]
  0x01f12d90: push   edi
  0x01f12d91: mov    DWORD PTR [edi+0x144],ebp
  0x01f12d97: mov    DWORD PTR [edi+0x13c],esp
  0x01f12d9d: call   0x54eaab00
  0x01f12da2: push   eax
  0x01f12da3: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f12dab: mov    eax,DWORD PTR [eax-0xc]
  0x01f12dae: cmp    edi,eax
  0x01f12db0: je     0x01f12dc7
  0x01f12db6: push   0x5530d05c
  0x01f12dbb: call   0x01f12dc0
  0x01f12dc0: pusha  
  0x01f12dc1: call   0x54dedbf0
  0x01f12dc6: hlt    
  0x01f12dc7: pop    eax
  0x01f12dc8: mov    DWORD PTR [edi+0x13c],0x0
  0x01f12dd2: mov    DWORD PTR [edi+0x144],0x0
  0x01f12ddc: pop    ecx
  0x01f12ddd: pop    ecx
  0x01f12dde: cmp    DWORD PTR [edi+0x4],0x0
  0x01f12de5: je     0x01f12eb5
  0x01f12deb: test   eax,eax
  0x01f12ded: je     0x01f05bf0
  0x01f12df3: mov    eax,DWORD PTR [edi+0x4]
  0x01f12df6: mov    DWORD PTR [edi+0x4],0x0
  0x01f12dfd: mov    edx,DWORD PTR [esp+0x114]
  0x01f12e04: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f12e0e: je     0x01f12e25
  0x01f12e14: push   0x5530d090
  0x01f12e19: call   0x01f12e1e
  0x01f12e1e: pusha  
  0x01f12e1f: call   0x54dedbf0
  0x01f12e24: hlt    
  0x01f12e25: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f12e2f: je     0x01f12e46
  0x01f12e35: push   0x5530d0ac
  0x01f12e3a: call   0x01f12e3f
  0x01f12e3f: pusha  
  0x01f12e40: call   0x54dedbf0
  0x01f12e45: hlt    
  0x01f12e46: mov    DWORD PTR [edi+0x1ac],eax
  0x01f12e4c: mov    DWORD PTR [edi+0x1b0],edx
  ;; restore_live_registers
  0x01f12e52: movsd  xmm0,QWORD PTR [esp]
  0x01f12e57: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f12e5d: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f12e63: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f12e69: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f12e6f: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f12e75: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f12e7b: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f12e81: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f12e8c: je     0x01f12ea3
  0x01f12e92: push   0x5530ce30
  0x01f12e97: call   0x01f12e9c
  0x01f12e9c: pusha  
  0x01f12e9d: call   0x54dedbf0
  0x01f12ea2: hlt    
  0x01f12ea3: add    esp,0xf0
  0x01f12ea9: popa   
  0x01f12eaa: mov    esp,ebp
  0x01f12eac: pop    ebp
  0x01f12ead: add    esp,0x4
  0x01f12eb0: jmp    0x01ea4155
  0x01f12eb5: test   eax,eax
  0x01f12eb7: je     0x01f12f1d
  ;; restore_live_registers
  0x01f12ebd: movsd  xmm0,QWORD PTR [esp]
  0x01f12ec2: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f12ec8: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f12ece: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f12ed4: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f12eda: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f12ee0: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f12ee6: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f12eec: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f12ef7: je     0x01f12f0e
  0x01f12efd: push   0x5530ce30
  0x01f12f02: call   0x01f12f07
  0x01f12f07: pusha  
  0x01f12f08: call   0x54dedbf0
  0x01f12f0d: hlt    
  0x01f12f0e: add    esp,0xf0
  0x01f12f14: popa   
  0x01f12f15: mov    esp,ebp
  0x01f12f17: pop    ebp
  0x01f12f18: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f12f1d: movsd  xmm0,QWORD PTR [esp]
  0x01f12f22: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f12f28: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f12f2e: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f12f34: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f12f3a: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f12f40: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f12f46: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f12f4c: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f12f57: je     0x01f12f6e
  0x01f12f5d: push   0x5530ce30
  0x01f12f62: call   0x01f12f67
  0x01f12f67: pusha  
  0x01f12f68: call   0x54dedbf0
  0x01f12f6d: hlt    
  0x01f12f6e: add    esp,0xf0
  0x01f12f74: popa   
  0x01f12f75: mov    esp,ebp
  0x01f12f77: pop    ebp
  0x01f12f78: ret    
  0x01f12f79: mov    esp,ebp
  0x01f12f7b: pop    ebp
  0x01f12f7c: ret    
  0x01f12f7d: nop    
  0x01f12f7e: nop    
  0x01f12f7f: nop    

Decoding RuntimeStub - load_klass_patching Runtime1 stub 0x01f12f88
  0x01f13000: push   ebp
  0x01f13001: mov    ebp,esp
  ;; save_live_registers
  0x01f13003: pusha  
  0x01f13004: sub    esp,0xf0
  0x01f1300a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13015: movsd  QWORD PTR [esp],xmm0
  0x01f1301a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f13020: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f13026: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f1302c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f13032: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f13038: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f1303e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f13044: push   eax
  0x01f13045: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f1304d: mov    edi,DWORD PTR [edi-0xc]
  0x01f13050: push   edi
  0x01f13051: mov    DWORD PTR [edi+0x144],ebp
  0x01f13057: mov    DWORD PTR [edi+0x13c],esp
  0x01f1305d: call   0x54eaab50
  0x01f13062: push   eax
  0x01f13063: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f1306b: mov    eax,DWORD PTR [eax-0xc]
  0x01f1306e: cmp    edi,eax
  0x01f13070: je     0x01f13087
  0x01f13076: push   0x5530d05c
  0x01f1307b: call   0x01f13080
  0x01f13080: pusha  
  0x01f13081: call   0x54dedbf0
  0x01f13086: hlt    
  0x01f13087: pop    eax
  0x01f13088: mov    DWORD PTR [edi+0x13c],0x0
  0x01f13092: mov    DWORD PTR [edi+0x144],0x0
  0x01f1309c: pop    ecx
  0x01f1309d: pop    ecx
  0x01f1309e: cmp    DWORD PTR [edi+0x4],0x0
  0x01f130a5: je     0x01f13175
  0x01f130ab: test   eax,eax
  0x01f130ad: je     0x01f05bf0
  0x01f130b3: mov    eax,DWORD PTR [edi+0x4]
  0x01f130b6: mov    DWORD PTR [edi+0x4],0x0
  0x01f130bd: mov    edx,DWORD PTR [esp+0x114]
  0x01f130c4: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f130ce: je     0x01f130e5
  0x01f130d4: push   0x5530d090
  0x01f130d9: call   0x01f130de
  0x01f130de: pusha  
  0x01f130df: call   0x54dedbf0
  0x01f130e4: hlt    
  0x01f130e5: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f130ef: je     0x01f13106
  0x01f130f5: push   0x5530d0ac
  0x01f130fa: call   0x01f130ff
  0x01f130ff: pusha  
  0x01f13100: call   0x54dedbf0
  0x01f13105: hlt    
  0x01f13106: mov    DWORD PTR [edi+0x1ac],eax
  0x01f1310c: mov    DWORD PTR [edi+0x1b0],edx
  ;; restore_live_registers
  0x01f13112: movsd  xmm0,QWORD PTR [esp]
  0x01f13117: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f1311d: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f13123: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13129: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f1312f: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13135: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f1313b: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f13141: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f1314c: je     0x01f13163
  0x01f13152: push   0x5530ce30
  0x01f13157: call   0x01f1315c
  0x01f1315c: pusha  
  0x01f1315d: call   0x54dedbf0
  0x01f13162: hlt    
  0x01f13163: add    esp,0xf0
  0x01f13169: popa   
  0x01f1316a: mov    esp,ebp
  0x01f1316c: pop    ebp
  0x01f1316d: add    esp,0x4
  0x01f13170: jmp    0x01ea4155
  0x01f13175: test   eax,eax
  0x01f13177: je     0x01f131dd
  ;; restore_live_registers
  0x01f1317d: movsd  xmm0,QWORD PTR [esp]
  0x01f13182: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f13188: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f1318e: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13194: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f1319a: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f131a0: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f131a6: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f131ac: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f131b7: je     0x01f131ce
  0x01f131bd: push   0x5530ce30
  0x01f131c2: call   0x01f131c7
  0x01f131c7: pusha  
  0x01f131c8: call   0x54dedbf0
  0x01f131cd: hlt    
  0x01f131ce: add    esp,0xf0
  0x01f131d4: popa   
  0x01f131d5: mov    esp,ebp
  0x01f131d7: pop    ebp
  0x01f131d8: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f131dd: movsd  xmm0,QWORD PTR [esp]
  0x01f131e2: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f131e8: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f131ee: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f131f4: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f131fa: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13200: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f13206: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f1320c: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13217: je     0x01f1322e
  0x01f1321d: push   0x5530ce30
  0x01f13222: call   0x01f13227
  0x01f13227: pusha  
  0x01f13228: call   0x54dedbf0
  0x01f1322d: hlt    
  0x01f1322e: add    esp,0xf0
  0x01f13234: popa   
  0x01f13235: mov    esp,ebp
  0x01f13237: pop    ebp
  0x01f13238: ret    
  0x01f13239: mov    esp,ebp
  0x01f1323b: pop    ebp
  0x01f1323c: ret    
  0x01f1323d: nop    
  0x01f1323e: nop    
  0x01f1323f: nop    

Decoding RuntimeStub - load_mirror_patching Runtime1 stub 0x01f13248
  0x01f132c0: push   ebp
  0x01f132c1: mov    ebp,esp
  ;; save_live_registers
  0x01f132c3: pusha  
  0x01f132c4: sub    esp,0xf0
  0x01f132ca: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f132d5: movsd  QWORD PTR [esp],xmm0
  0x01f132da: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f132e0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f132e6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f132ec: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f132f2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f132f8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f132fe: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f13304: push   eax
  0x01f13305: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f1330d: mov    edi,DWORD PTR [edi-0xc]
  0x01f13310: push   edi
  0x01f13311: mov    DWORD PTR [edi+0x144],ebp
  0x01f13317: mov    DWORD PTR [edi+0x13c],esp
  0x01f1331d: call   0x54eaaba0
  0x01f13322: push   eax
  0x01f13323: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f1332b: mov    eax,DWORD PTR [eax-0xc]
  0x01f1332e: cmp    edi,eax
  0x01f13330: je     0x01f13347
  0x01f13336: push   0x5530d05c
  0x01f1333b: call   0x01f13340
  0x01f13340: pusha  
  0x01f13341: call   0x54dedbf0
  0x01f13346: hlt    
  0x01f13347: pop    eax
  0x01f13348: mov    DWORD PTR [edi+0x13c],0x0
  0x01f13352: mov    DWORD PTR [edi+0x144],0x0
  0x01f1335c: pop    ecx
  0x01f1335d: pop    ecx
  0x01f1335e: cmp    DWORD PTR [edi+0x4],0x0
  0x01f13365: je     0x01f13435
  0x01f1336b: test   eax,eax
  0x01f1336d: je     0x01f05bf0
  0x01f13373: mov    eax,DWORD PTR [edi+0x4]
  0x01f13376: mov    DWORD PTR [edi+0x4],0x0
  0x01f1337d: mov    edx,DWORD PTR [esp+0x114]
  0x01f13384: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f1338e: je     0x01f133a5
  0x01f13394: push   0x5530d090
  0x01f13399: call   0x01f1339e
  0x01f1339e: pusha  
  0x01f1339f: call   0x54dedbf0
  0x01f133a4: hlt    
  0x01f133a5: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f133af: je     0x01f133c6
  0x01f133b5: push   0x5530d0ac
  0x01f133ba: call   0x01f133bf
  0x01f133bf: pusha  
  0x01f133c0: call   0x54dedbf0
  0x01f133c5: hlt    
  0x01f133c6: mov    DWORD PTR [edi+0x1ac],eax
  0x01f133cc: mov    DWORD PTR [edi+0x1b0],edx
  ;; restore_live_registers
  0x01f133d2: movsd  xmm0,QWORD PTR [esp]
  0x01f133d7: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f133dd: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f133e3: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f133e9: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f133ef: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f133f5: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f133fb: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f13401: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f1340c: je     0x01f13423
  0x01f13412: push   0x5530ce30
  0x01f13417: call   0x01f1341c
  0x01f1341c: pusha  
  0x01f1341d: call   0x54dedbf0
  0x01f13422: hlt    
  0x01f13423: add    esp,0xf0
  0x01f13429: popa   
  0x01f1342a: mov    esp,ebp
  0x01f1342c: pop    ebp
  0x01f1342d: add    esp,0x4
  0x01f13430: jmp    0x01ea4155
  0x01f13435: test   eax,eax
  0x01f13437: je     0x01f1349d
  ;; restore_live_registers
  0x01f1343d: movsd  xmm0,QWORD PTR [esp]
  0x01f13442: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f13448: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f1344e: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13454: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f1345a: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13460: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f13466: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f1346c: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13477: je     0x01f1348e
  0x01f1347d: push   0x5530ce30
  0x01f13482: call   0x01f13487
  0x01f13487: pusha  
  0x01f13488: call   0x54dedbf0
  0x01f1348d: hlt    
  0x01f1348e: add    esp,0xf0
  0x01f13494: popa   
  0x01f13495: mov    esp,ebp
  0x01f13497: pop    ebp
  0x01f13498: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f1349d: movsd  xmm0,QWORD PTR [esp]
  0x01f134a2: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f134a8: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f134ae: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f134b4: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f134ba: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f134c0: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f134c6: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f134cc: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f134d7: je     0x01f134ee
  0x01f134dd: push   0x5530ce30
  0x01f134e2: call   0x01f134e7
  0x01f134e7: pusha  
  0x01f134e8: call   0x54dedbf0
  0x01f134ed: hlt    
  0x01f134ee: add    esp,0xf0
  0x01f134f4: popa   
  0x01f134f5: mov    esp,ebp
  0x01f134f7: pop    ebp
  0x01f134f8: ret    
  0x01f134f9: mov    esp,ebp
  0x01f134fb: pop    ebp
  0x01f134fc: ret    
  0x01f134fd: nop    
  0x01f134fe: nop    
  0x01f134ff: nop    

Decoding RuntimeStub - load_appendix_patching Runtime1 stub 0x01f13508
  0x01f13580: push   ebp
  0x01f13581: mov    ebp,esp
  ;; save_live_registers
  0x01f13583: pusha  
  0x01f13584: sub    esp,0xf0
  0x01f1358a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13595: movsd  QWORD PTR [esp],xmm0
  0x01f1359a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f135a0: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f135a6: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f135ac: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f135b2: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f135b8: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f135be: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f135c4: push   eax
  0x01f135c5: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f135cd: mov    edi,DWORD PTR [edi-0xc]
  0x01f135d0: push   edi
  0x01f135d1: mov    DWORD PTR [edi+0x144],ebp
  0x01f135d7: mov    DWORD PTR [edi+0x13c],esp
  0x01f135dd: call   0x54eaabf0
  0x01f135e2: push   eax
  0x01f135e3: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f135eb: mov    eax,DWORD PTR [eax-0xc]
  0x01f135ee: cmp    edi,eax
  0x01f135f0: je     0x01f13607
  0x01f135f6: push   0x5530d05c
  0x01f135fb: call   0x01f13600
  0x01f13600: pusha  
  0x01f13601: call   0x54dedbf0
  0x01f13606: hlt    
  0x01f13607: pop    eax
  0x01f13608: mov    DWORD PTR [edi+0x13c],0x0
  0x01f13612: mov    DWORD PTR [edi+0x144],0x0
  0x01f1361c: pop    ecx
  0x01f1361d: pop    ecx
  0x01f1361e: cmp    DWORD PTR [edi+0x4],0x0
  0x01f13625: je     0x01f136f5
  0x01f1362b: test   eax,eax
  0x01f1362d: je     0x01f05bf0
  0x01f13633: mov    eax,DWORD PTR [edi+0x4]
  0x01f13636: mov    DWORD PTR [edi+0x4],0x0
  0x01f1363d: mov    edx,DWORD PTR [esp+0x114]
  0x01f13644: cmp    DWORD PTR [edi+0x1ac],0x0
  0x01f1364e: je     0x01f13665
  0x01f13654: push   0x5530d090
  0x01f13659: call   0x01f1365e
  0x01f1365e: pusha  
  0x01f1365f: call   0x54dedbf0
  0x01f13664: hlt    
  0x01f13665: cmp    DWORD PTR [edi+0x1b0],0x0
  0x01f1366f: je     0x01f13686
  0x01f13675: push   0x5530d0ac
  0x01f1367a: call   0x01f1367f
  0x01f1367f: pusha  
  0x01f13680: call   0x54dedbf0
  0x01f13685: hlt    
  0x01f13686: mov    DWORD PTR [edi+0x1ac],eax
  0x01f1368c: mov    DWORD PTR [edi+0x1b0],edx
  ;; restore_live_registers
  0x01f13692: movsd  xmm0,QWORD PTR [esp]
  0x01f13697: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f1369d: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f136a3: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f136a9: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f136af: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f136b5: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f136bb: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f136c1: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f136cc: je     0x01f136e3
  0x01f136d2: push   0x5530ce30
  0x01f136d7: call   0x01f136dc
  0x01f136dc: pusha  
  0x01f136dd: call   0x54dedbf0
  0x01f136e2: hlt    
  0x01f136e3: add    esp,0xf0
  0x01f136e9: popa   
  0x01f136ea: mov    esp,ebp
  0x01f136ec: pop    ebp
  0x01f136ed: add    esp,0x4
  0x01f136f0: jmp    0x01ea4155
  0x01f136f5: test   eax,eax
  0x01f136f7: je     0x01f1375d
  ;; restore_live_registers
  0x01f136fd: movsd  xmm0,QWORD PTR [esp]
  0x01f13702: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f13708: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f1370e: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13714: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f1371a: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13720: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f13726: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f1372c: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13737: je     0x01f1374e
  0x01f1373d: push   0x5530ce30
  0x01f13742: call   0x01f13747
  0x01f13747: pusha  
  0x01f13748: call   0x54dedbf0
  0x01f1374d: hlt    
  0x01f1374e: add    esp,0xf0
  0x01f13754: popa   
  0x01f13755: mov    esp,ebp
  0x01f13757: pop    ebp
  0x01f13758: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f1375d: movsd  xmm0,QWORD PTR [esp]
  0x01f13762: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f13768: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f1376e: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13774: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f1377a: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13780: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f13786: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f1378c: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13797: je     0x01f137ae
  0x01f1379d: push   0x5530ce30
  0x01f137a2: call   0x01f137a7
  0x01f137a7: pusha  
  0x01f137a8: call   0x54dedbf0
  0x01f137ad: hlt    
  0x01f137ae: add    esp,0xf0
  0x01f137b4: popa   
  0x01f137b5: mov    esp,ebp
  0x01f137b7: pop    ebp
  0x01f137b8: ret    
  0x01f137b9: mov    esp,ebp
  0x01f137bb: pop    ebp
  0x01f137bc: ret    
  0x01f137bd: nop    
  0x01f137be: nop    
  0x01f137bf: nop    

Decoding RuntimeStub - g1_pre_barrier_slow Runtime1 stub 0x01f137c8
  0x01f13820: push   ebp
  0x01f13821: mov    ebp,esp
  0x01f13823: mov    eax,0x1e
  0x01f13828: push   eax
  0x01f13829: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f13831: mov    edi,DWORD PTR [edi-0xc]
  0x01f13834: push   edi
  0x01f13835: mov    DWORD PTR [edi+0x144],ebp
  0x01f1383b: mov    DWORD PTR [edi+0x13c],esp
  0x01f13841: call   0x54ea9b40
  0x01f13846: push   eax
  0x01f13847: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f1384f: mov    eax,DWORD PTR [eax-0xc]
  0x01f13852: cmp    edi,eax
  0x01f13854: je     0x01f1386c
  0x01f1385a: int3   
  0x01f1385b: push   0x5530cc08
  0x01f13860: call   0x01f13865
  0x01f13865: pusha  
  0x01f13866: call   0x54dedbf0
  0x01f1386b: hlt    
  0x01f1386c: pop    eax
  0x01f1386d: mov    DWORD PTR [edi+0x13c],0x0
  0x01f13877: mov    DWORD PTR [edi+0x144],0x0
  0x01f13881: add    esp,0x8
  0x01f13884: cmp    DWORD PTR [edi+0x4],0x0
  0x01f1388b: je     0x01f1389c
  0x01f13891: mov    eax,DWORD PTR [edi+0x4]
  0x01f13894: mov    esp,ebp
  0x01f13896: pop    ebp
  0x01f13897: jmp    Stub::forward exception
  0x01f1389c: push   0x552fd97c
  0x01f138a1: call   0x01f138a6
  0x01f138a6: pusha  
  0x01f138a7: call   0x54dedbf0
  0x01f138ac: hlt    
  0x01f138ad: mov    esp,ebp
  0x01f138af: pop    ebp
  0x01f138b0: ret    
  0x01f138b1: nop    
  0x01f138b2: nop    
  0x01f138b3: nop    

Decoding RuntimeStub - g1_post_barrier_slow Runtime1 stub 0x01f138c8
  0x01f13900: push   ebp
  0x01f13901: mov    ebp,esp
  0x01f13903: push   eax
  0x01f13904: push   ecx
  0x01f13905: mov    ecx,DWORD PTR [ebp+0x8]
  0x01f13908: shr    ecx,0x9
  0x01f1390b: mov    eax,0x1707000
  0x01f13910: add    ecx,eax
  0x01f13912: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f1391a: mov    eax,DWORD PTR [eax-0xc]
  0x01f1391d: cmp    BYTE PTR [ecx],0x20
  0x01f13920: je     0x01f1396f
  0x01f13926: lock add DWORD PTR [esp],0x0
  0x01f1392b: cmp    BYTE PTR [ecx],0x0
  0x01f1392e: je     0x01f1396f
  0x01f13934: mov    BYTE PTR [ecx],0x0
  0x01f13937: cmp    DWORD PTR [eax+0x2fc],0x0
  0x01f13941: je     0x01f13963
  0x01f13947: sub    DWORD PTR [eax+0x2fc],0x4
  0x01f1394e: push   ebx
  0x01f1394f: mov    ebx,DWORD PTR [eax+0x2f8]
  0x01f13955: add    ebx,DWORD PTR [eax+0x2fc]
  0x01f1395b: mov    DWORD PTR [ebx],ecx
  0x01f1395d: pop    ebx
  0x01f1395e: jmp    0x01f1396f
  0x01f13963: push   edx
  0x01f13964: push   eax
  0x01f13965: push   ecx
  0x01f13966: call   0x55213c60
  0x01f1396b: add    esp,0x8
  0x01f1396e: pop    edx
  0x01f1396f: pop    ecx
  0x01f13970: pop    eax
  0x01f13971: mov    esp,ebp
  0x01f13973: pop    ebp
  0x01f13974: ret    
  0x01f13975: nop    
  0x01f13976: nop    
  0x01f13977: nop    

MethodHandle::interpreter_entry::_invokeGenericDecoding RuntimeStub - fpu2long_stub Runtime1 stub 0x01f13988
  0x01f139c0: push   esi
  0x01f139c1: push   ecx
  0x01f139c2: sub    esp,0x20
  0x01f139c5: fst    QWORD PTR [esp+0x4]
  0x01f139c9: mov    eax,DWORD PTR [esp+0x8]
  0x01f139cd: and    eax,0x7ff00000
  0x01f139d3: cmp    eax,0x7ff00000
  0x01f139d9: jne    0x01f139f3
  0x01f139df: mov    eax,DWORD PTR [esp+0x8]
  0x01f139e3: and    eax,0xfffff
  0x01f139e9: or     eax,DWORD PTR [esp+0x4]
  0x01f139ed: jne    0x01f13a59
  0x01f139f3: fstcw  WORD PTR [esp]
  0x01f139f7: movzx  eax,WORD PTR [esp]
  0x01f139fb: or     eax,0xc00
  0x01f13a01: mov    WORD PTR [esp+0x2],ax
  0x01f13a06: fldcw  WORD PTR [esp+0x2]
  0x01f13a0a: fwait
  0x01f13a0b: fistp  QWORD PTR [esp+0xc]
  0x01f13a0f: fldcw  WORD PTR [esp]
  0x01f13a12: fwait
  0x01f13a13: mov    eax,DWORD PTR [esp+0xc]
  0x01f13a17: mov    edx,DWORD PTR [esp+0x10]
  0x01f13a1b: mov    ecx,eax
  0x01f13a1d: xor    ecx,0x0
  0x01f13a20: mov    esi,0x80000000
  0x01f13a25: xor    esi,edx
  0x01f13a27: or     ecx,esi
  0x01f13a29: jne    0x01f13a61
  0x01f13a2f: fldz   
  0x01f13a31: fcomp  QWORD PTR [esp+0x4]
  0x01f13a35: fnstsw ax
  0x01f13a37: sahf   
  0x01f13a38: ja     0x01f13a4d
  0x01f13a3e: mov    edx,0x7fffffff
  0x01f13a43: mov    eax,0xffffffff
  0x01f13a48: jmp    0x01f13a61
  0x01f13a4d: mov    edx,0x80000000
  0x01f13a52: xor    eax,eax
  0x01f13a54: jmp    0x01f13a61
  0x01f13a59: ffree  st(0)
  0x01f13a5b: fincstp 
  0x01f13a5d: xor    edx,edx
  0x01f13a5f: xor    eax,eax
  0x01f13a61: add    esp,0x20
  0x01f13a64: pop    ecx
  0x01f13a65: pop    esi
  0x01f13a66: ret    
  0x01f13a67: nop    

Decoding RuntimeStub - counter_overflow Runtime1 stub 0x01f13a88
  0x01f13ae0: push   ebp
  0x01f13ae1: mov    ebp,esp
  ;; save_live_registers
  0x01f13ae3: pusha  
  0x01f13ae4: sub    esp,0xf0
  0x01f13aea: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13af5: movsd  QWORD PTR [esp],xmm0
  0x01f13afa: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f13b00: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f13b06: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f13b0c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f13b12: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f13b18: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f13b1e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f13b24: mov    eax,DWORD PTR [ebp+0x8]
  0x01f13b27: mov    ebx,DWORD PTR [ebp+0xc]
  0x01f13b2a: push   ebx
  0x01f13b2b: push   eax
  0x01f13b2c: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f13b34: mov    edi,DWORD PTR [edi-0xc]
  0x01f13b37: push   edi
  0x01f13b38: mov    DWORD PTR [edi+0x144],ebp
  0x01f13b3e: mov    DWORD PTR [edi+0x13c],esp
  0x01f13b44: call   0x54ea99e0
  0x01f13b49: push   eax
  0x01f13b4a: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f13b52: mov    eax,DWORD PTR [eax-0xc]
  0x01f13b55: cmp    edi,eax
  0x01f13b57: je     0x01f13b6f
  0x01f13b5d: int3   
  0x01f13b5e: push   0x5530cc08
  0x01f13b63: call   0x01f13b68
  0x01f13b68: pusha  
  0x01f13b69: call   0x54dedbf0
  0x01f13b6e: hlt    
  0x01f13b6f: pop    eax
  0x01f13b70: mov    DWORD PTR [edi+0x13c],0x0
  0x01f13b7a: mov    DWORD PTR [edi+0x144],0x0
  0x01f13b84: add    esp,0xc
  0x01f13b87: cmp    DWORD PTR [edi+0x4],0x0
  0x01f13b8e: je     0x01f13b9c
  0x01f13b94: mov    eax,DWORD PTR [edi+0x4]
  0x01f13b97: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f13b9c: movsd  xmm0,QWORD PTR [esp]
  0x01f13ba1: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f13ba7: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f13bad: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13bb3: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f13bb9: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13bbf: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f13bc5: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f13bcb: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13bd6: je     0x01f13bed
  0x01f13bdc: push   0x5530ce30
  0x01f13be1: call   0x01f13be6
  0x01f13be6: pusha  
  0x01f13be7: call   0x54dedbf0
  0x01f13bec: hlt    
  0x01f13bed: add    esp,0xf0
  0x01f13bf3: popa   
  0x01f13bf4: mov    esp,ebp
  0x01f13bf6: pop    ebp
  0x01f13bf7: ret    

Decoding RuntimeStub - predicate_failed_trap Runtime1 stub 0x01f13c08
  0x01f13c60: push   ebp
  0x01f13c61: mov    ebp,esp
  ;; save_live_registers
  0x01f13c63: pusha  
  0x01f13c64: sub    esp,0xf0
  0x01f13c6a: mov    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13c75: movsd  QWORD PTR [esp],xmm0
  0x01f13c7a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f13c80: movsd  QWORD PTR [esp+0x10],xmm2
  0x01f13c86: movsd  QWORD PTR [esp+0x18],xmm3
  0x01f13c8c: movsd  QWORD PTR [esp+0x20],xmm4
  0x01f13c92: movsd  QWORD PTR [esp+0x28],xmm5
  0x01f13c98: movsd  QWORD PTR [esp+0x30],xmm6
  0x01f13c9e: movsd  QWORD PTR [esp+0x38],xmm7
  0x01f13ca4: mov    edi,DWORD PTR fs:[eiz*1+0x0]
  0x01f13cac: mov    edi,DWORD PTR [edi-0xc]
  0x01f13caf: push   edi
  0x01f13cb0: mov    DWORD PTR [edi+0x144],ebp
  0x01f13cb6: mov    DWORD PTR [edi+0x13c],esp
  0x01f13cbc: call   0x54eacd20
  0x01f13cc1: push   eax
  0x01f13cc2: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f13cca: mov    eax,DWORD PTR [eax-0xc]
  0x01f13ccd: cmp    edi,eax
  0x01f13ccf: je     0x01f13ce7
  0x01f13cd5: int3   
  0x01f13cd6: push   0x5530cc08
  0x01f13cdb: call   0x01f13ce0
  0x01f13ce0: pusha  
  0x01f13ce1: call   0x54dedbf0
  0x01f13ce6: hlt    
  0x01f13ce7: pop    eax
  0x01f13ce8: mov    DWORD PTR [edi+0x13c],0x0
  0x01f13cf2: mov    DWORD PTR [edi+0x144],0x0
  0x01f13cfc: add    esp,0x4
  0x01f13cff: cmp    DWORD PTR [edi+0x4],0x0
  0x01f13d06: je     0x01f13d14
  0x01f13d0c: mov    eax,DWORD PTR [edi+0x4]
  0x01f13d0f: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f13d14: movsd  xmm0,QWORD PTR [esp]
  0x01f13d19: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f13d1f: movsd  xmm2,QWORD PTR [esp+0x10]
  0x01f13d25: movsd  xmm3,QWORD PTR [esp+0x18]
  0x01f13d2b: movsd  xmm4,QWORD PTR [esp+0x20]
  0x01f13d31: movsd  xmm5,QWORD PTR [esp+0x28]
  0x01f13d37: movsd  xmm6,QWORD PTR [esp+0x30]
  0x01f13d3d: movsd  xmm7,QWORD PTR [esp+0x38]
  0x01f13d43: cmp    DWORD PTR [esp+0xec],0xfeedbeef
  0x01f13d4e: je     0x01f13d65
  0x01f13d54: push   0x5530ce30
  0x01f13d59: call   0x01f13d5e
  0x01f13d5e: pusha  
  0x01f13d5f: call   0x54dedbf0
  0x01f13d64: hlt    
  0x01f13d65: add    esp,0xf0
  0x01f13d6b: popa   
  0x01f13d6c: mov    esp,ebp
  0x01f13d6e: pop    ebp
  0x01f13d6f: jmp    0x01ea409f
  0x01f13d74: mov    esp,ebp
  0x01f13d76: pop    ebp
  0x01f13d77: ret    

 [0x01f08b00, 0x01f08b01[ (1 bytes)
  0x01f08b00: hlt    

MethodHandle::interpreter_entry::_invokeBasic [0x01f08b01, 0x01f08b72[ (113 bytes)
  0x01f08b01: nop    
  0x01f08b02: nop    
  0x01f08b03: nop    
  0x01f08b04: nop    
  0x01f08b05: nop    
  0x01f08b06: nop    
  0x01f08b07: nop    
  0x01f08b08: nop    
  0x01f08b09: nop    
  0x01f08b0a: nop    
  0x01f08b0b: nop    
  0x01f08b0c: nop    
  0x01f08b0d: nop    
  0x01f08b0e: nop    
  0x01f08b0f: nop    
  ;; verify_intrinsic_id {
  0x01f08b10: cmp    BYTE PTR [ebx+0x1e],0xac
  0x01f08b14: je     0x01f08b2b
  ;; bad Method*::intrinsic_id
  0x01f08b1a: push   0x553146d0
  0x01f08b1f: call   0x01f08b24
  0x01f08b24: pusha  
  0x01f08b25: call   0x54dedbf0
  0x01f08b2a: hlt    
  ;; } verify_intrinsic_id
  0x01f08b2b: mov    edx,DWORD PTR [ebx+0x8]
  0x01f08b2e: movzx  edx,WORD PTR [edx+0x22]
  0x01f08b32: mov    ecx,DWORD PTR [esp+edx*4]
  ;; jump_to_lambda_form {
  0x01f08b35: mov    ebx,DWORD PTR [ecx+0xc]
  0x01f08b38: mov    ebx,DWORD PTR [ebx+0x20]
  0x01f08b3b: mov    ebx,DWORD PTR [ebx+0x10]
  0x01f08b3e: mov    edx,DWORD PTR [ebx+0x8]
  0x01f08b41: movzx  edx,WORD PTR [edx+0x22]
  0x01f08b45: cmp    ecx,DWORD PTR [esp+edx*4]
  0x01f08b48: je     0x01f08b62
  0x01f08b4e: mov    eax,DWORD PTR [esp+edx*4]
  ;; receiver not on stack
  0x01f08b51: push   0x553145dc
  0x01f08b56: call   0x01f08b5b
  0x01f08b5b: pusha  
  0x01f08b5c: call   0x54dedbf0
  0x01f08b61: hlt    
  ;; L:
  0x01f08b62: test   ebx,ebx
  0x01f08b64: je     0x01f08b6d
  0x01f08b6a: jmp    DWORD PTR [ebx+0x34]
  0x01f08b6d: jmp    0x01eb2b90

MethodHandle::interpreter_entry::_linkToVirtual [0x01f08b72, 0x01f08ccc[ (346 bytes)
  ;; } jump_to_lambda_form
  0x01f08b72: nop    
  0x01f08b73: nop    
  0x01f08b74: nop    
  0x01f08b75: nop    
  0x01f08b76: nop    
  0x01f08b77: nop    
  0x01f08b78: nop    
  0x01f08b79: nop    
  0x01f08b7a: nop    
  0x01f08b7b: nop    
  0x01f08b7c: nop    
  0x01f08b7d: nop    
  0x01f08b7e: nop    
  0x01f08b7f: nop    
  ;; verify_intrinsic_id {
  0x01f08b80: cmp    BYTE PTR [ebx+0x1e],0xad
  0x01f08b84: je     0x01f08b9b
  ;; bad Method*::intrinsic_id
  0x01f08b8a: push   0x553146d0
  0x01f08b8f: call   0x01f08b94
  0x01f08b94: pusha  
  0x01f08b95: call   0x54dedbf0
  0x01f08b9a: hlt    
  ;; } verify_intrinsic_id
  0x01f08b9b: mov    edx,DWORD PTR [ebx+0x8]
  0x01f08b9e: movzx  edx,WORD PTR [edx+0x22]
  0x01f08ba2: mov    ecx,DWORD PTR [esp+edx*4]
  0x01f08ba5: pop    eax
  0x01f08ba6: pop    ebx
  0x01f08ba7: push   eax
  ;; verify_klass {
  0x01f08ba8: test   ebx,ebx
  0x01f08baa: je     0x01f08bd0
  0x01f08bb0: push   edi
  0x01f08bb1: mov    edi,DWORD PTR [ebx+0x4]
  0x01f08bb4: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08bba: je     0x01f08be1
  0x01f08bc0: mov    edi,DWORD PTR [edi+0x20]
  0x01f08bc3: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08bc9: je     0x01f08be1
  0x01f08bcf: pop    edi
  ;; MemberName required for invokeVirtual etc.
  0x01f08bd0: push   0x553148a8
  0x01f08bd5: call   0x01f08bda
  0x01f08bda: pusha  
  0x01f08bdb: call   0x54dedbf0
  0x01f08be0: hlt    
  ;; L_ok:
  0x01f08be1: pop    edi
  ;; } verify_klass
  0x01f08be2: mov    edx,DWORD PTR [ecx+0x4]
  ;; check_receiver {
  0x01f08be5: mov    edi,DWORD PTR [ebx+0x14]
  ;; verify_klass {
  0x01f08be8: test   edi,edi
  0x01f08bea: je     0x01f08c10
  0x01f08bf0: push   edi
  0x01f08bf1: mov    edi,DWORD PTR [edi+0x4]
  0x01f08bf4: cmp    edi,DWORD PTR ds:0x555e16ac
  0x01f08bfa: je     0x01f08c21
  0x01f08c00: mov    edi,DWORD PTR [edi+0x20]
  0x01f08c03: cmp    edi,DWORD PTR ds:0x555e16ac
  0x01f08c09: je     0x01f08c21
  0x01f08c0f: pop    edi
  ;; MH argument is a Class
  0x01f08c10: push   0x55314220
  0x01f08c15: call   0x01f08c1a
  0x01f08c1a: pusha  
  0x01f08c1b: call   0x54dedbf0
  0x01f08c20: hlt    
  ;; L_ok:
  0x01f08c21: pop    edi
  ;; } verify_klass
  0x01f08c22: mov    edi,DWORD PTR [edi+0x40]
  0x01f08c25: cmp    edx,edi
  0x01f08c27: je     0x01f08c75
  0x01f08c2d: mov    eax,DWORD PTR [edi+0xc]
  0x01f08c30: cmp    edi,DWORD PTR [edx+eax*1]
  0x01f08c33: je     0x01f08c75
  0x01f08c39: cmp    eax,0x14
  0x01f08c3c: jne    0x01f08c64
  0x01f08c42: mov    eax,edi
  0x01f08c44: push   ecx
  0x01f08c45: push   edi
  0x01f08c46: inc    DWORD PTR ds:0x556349a0
  0x01f08c4c: mov    edi,DWORD PTR [edx+0x18]
  0x01f08c4f: mov    ecx,DWORD PTR [edi]
  0x01f08c51: add    edi,0x4
  0x01f08c54: test   eax,eax
  0x01f08c56: repnz scas eax,DWORD PTR es:[edi]
  0x01f08c58: pop    edi
  0x01f08c59: pop    ecx
  0x01f08c5a: jne    0x01f08c64
  0x01f08c5c: mov    DWORD PTR [edx+0x14],edi
  0x01f08c5f: jmp    0x01f08c75
  ;; receiver class disagrees with MemberName.clazz
  0x01f08c64: push   0x55314aa8
  0x01f08c69: call   0x01f08c6e
  0x01f08c6e: pusha  
  0x01f08c6f: call   0x54dedbf0
  0x01f08c74: hlt    
  ;; } check_receiver
  ;; verify_ref_kind {
  0x01f08c75: mov    eax,DWORD PTR [ebx+0x8]
  0x01f08c78: shr    eax,0x18
  0x01f08c7b: and    eax,0xf
  0x01f08c7e: cmp    eax,0x5
  0x01f08c81: je     0x01f08c98
  ;; verify_ref_kind expected 5
  0x01f08c87: push   0x42e9058
  0x01f08c8c: call   0x01f08c91
  0x01f08c91: pusha  
  0x01f08c92: call   0x54dedbf0
  0x01f08c97: hlt    
  ;; } verify_ref_kind
  0x01f08c98: mov    edi,DWORD PTR [ebx+0xc]
  0x01f08c9b: cmp    edi,0x0
  0x01f08c9e: jge    0x01f08cb5
  ;; no virtual index
  0x01f08ca4: push   0x55314b00
  0x01f08ca9: call   0x01f08cae
  0x01f08cae: pusha  
  0x01f08caf: call   0x54dedbf0
  0x01f08cb4: hlt    
  ;; L_index_ok:
  0x01f08cb5: mov    ebx,DWORD PTR [edx+edi*4+0x108]
  0x01f08cbc: test   ebx,ebx
  0x01f08cbe: je     0x01f08cc7
  0x01f08cc4: jmp    DWORD PTR [ebx+0x34]
  0x01f08cc7: jmp    0x01eb2b90

MethodHandle::interpreter_entry::_linkToStatic [0x01f08ccc, 0x01f08d5e[ (146 bytes)
  0x01f08ccc: nop    
  0x01f08ccd: nop    
  0x01f08cce: nop    
  0x01f08ccf: nop    
  ;; verify_intrinsic_id {
  0x01f08cd0: cmp    BYTE PTR [ebx+0x1e],0xae
  0x01f08cd4: je     0x01f08ceb
  ;; bad Method*::intrinsic_id
  0x01f08cda: push   0x553146d0
  0x01f08cdf: call   0x01f08ce4
  0x01f08ce4: pusha  
  0x01f08ce5: call   0x54dedbf0
  0x01f08cea: hlt    
  ;; } verify_intrinsic_id
  0x01f08ceb: pop    eax
  0x01f08cec: pop    ebx
  0x01f08ced: push   eax
  ;; verify_klass {
  0x01f08cee: test   ebx,ebx
  0x01f08cf0: je     0x01f08d16
  0x01f08cf6: push   edi
  0x01f08cf7: mov    edi,DWORD PTR [ebx+0x4]
  0x01f08cfa: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08d00: je     0x01f08d27
  0x01f08d06: mov    edi,DWORD PTR [edi+0x20]
  0x01f08d09: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08d0f: je     0x01f08d27
  0x01f08d15: pop    edi
  ;; MemberName required for invokeVirtual etc.
  0x01f08d16: push   0x553148a8
  0x01f08d1b: call   0x01f08d20
  0x01f08d20: pusha  
  0x01f08d21: call   0x54dedbf0
  0x01f08d26: hlt    
  ;; L_ok:
  0x01f08d27: pop    edi
  ;; } verify_klass
  ;; verify_ref_kind {
  0x01f08d28: mov    eax,DWORD PTR [ebx+0x8]
  0x01f08d2b: shr    eax,0x18
  0x01f08d2e: and    eax,0xf
  0x01f08d31: cmp    eax,0x6
  0x01f08d34: je     0x01f08d4b
  ;; verify_ref_kind expected 6
  0x01f08d3a: push   0x42e9940
  0x01f08d3f: call   0x01f08d44
  0x01f08d44: pusha  
  0x01f08d45: call   0x54dedbf0
  0x01f08d4a: hlt    
  ;; } verify_ref_kind
  0x01f08d4b: mov    ebx,DWORD PTR [ebx+0x10]
  0x01f08d4e: test   ebx,ebx
  0x01f08d50: je     0x01f08d59
  0x01f08d56: jmp    DWORD PTR [ebx+0x34]
  0x01f08d59: jmp    0x01eb2b90

MethodHandle::interpreter_entry::_linkToSpecial [0x01f08d5e, 0x01f08e8d[ (303 bytes)
  0x01f08d5e: nop    
  0x01f08d5f: nop    
  ;; verify_intrinsic_id {
  0x01f08d60: cmp    BYTE PTR [ebx+0x1e],0xaf
  0x01f08d64: je     0x01f08d7b
  ;; bad Method*::intrinsic_id
  0x01f08d6a: push   0x553146d0
  0x01f08d6f: call   0x01f08d74
  0x01f08d74: pusha  
  0x01f08d75: call   0x54dedbf0
  0x01f08d7a: hlt    
  ;; } verify_intrinsic_id
  0x01f08d7b: mov    edx,DWORD PTR [ebx+0x8]
  0x01f08d7e: movzx  edx,WORD PTR [edx+0x22]
  0x01f08d82: mov    ecx,DWORD PTR [esp+edx*4]
  0x01f08d85: pop    eax
  0x01f08d86: pop    ebx
  0x01f08d87: push   eax
  ;; verify_klass {
  0x01f08d88: test   ebx,ebx
  0x01f08d8a: je     0x01f08db0
  0x01f08d90: push   edi
  0x01f08d91: mov    edi,DWORD PTR [ebx+0x4]
  0x01f08d94: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08d9a: je     0x01f08dc1
  0x01f08da0: mov    edi,DWORD PTR [edi+0x20]
  0x01f08da3: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08da9: je     0x01f08dc1
  0x01f08daf: pop    edi
  ;; MemberName required for invokeVirtual etc.
  0x01f08db0: push   0x553148a8
  0x01f08db5: call   0x01f08dba
  0x01f08dba: pusha  
  0x01f08dbb: call   0x54dedbf0
  0x01f08dc0: hlt    
  ;; L_ok:
  0x01f08dc1: pop    edi
  ;; } verify_klass
  0x01f08dc2: cmp    eax,DWORD PTR [ecx]
  ;; check_receiver {
  0x01f08dc4: mov    edx,DWORD PTR [ecx+0x4]
  0x01f08dc7: mov    edi,DWORD PTR [ebx+0x14]
  ;; verify_klass {
  0x01f08dca: test   edi,edi
  0x01f08dcc: je     0x01f08df2
  0x01f08dd2: push   edi
  0x01f08dd3: mov    edi,DWORD PTR [edi+0x4]
  0x01f08dd6: cmp    edi,DWORD PTR ds:0x555e16ac
  0x01f08ddc: je     0x01f08e03
  0x01f08de2: mov    edi,DWORD PTR [edi+0x20]
  0x01f08de5: cmp    edi,DWORD PTR ds:0x555e16ac
  0x01f08deb: je     0x01f08e03
  0x01f08df1: pop    edi
  ;; MH argument is a Class
  0x01f08df2: push   0x55314220
  0x01f08df7: call   0x01f08dfc
  0x01f08dfc: pusha  
  0x01f08dfd: call   0x54dedbf0
  0x01f08e02: hlt    
  ;; L_ok:
  0x01f08e03: pop    edi
  ;; } verify_klass
  0x01f08e04: mov    edi,DWORD PTR [edi+0x40]
  0x01f08e07: cmp    edx,edi
  0x01f08e09: je     0x01f08e57
  0x01f08e0f: mov    eax,DWORD PTR [edi+0xc]
  0x01f08e12: cmp    edi,DWORD PTR [edx+eax*1]
  0x01f08e15: je     0x01f08e57
  0x01f08e1b: cmp    eax,0x14
  0x01f08e1e: jne    0x01f08e46
  0x01f08e24: mov    eax,edi
  0x01f08e26: push   ecx
  0x01f08e27: push   edi
  0x01f08e28: inc    DWORD PTR ds:0x556349a0
  0x01f08e2e: mov    edi,DWORD PTR [edx+0x18]
  0x01f08e31: mov    ecx,DWORD PTR [edi]
  0x01f08e33: add    edi,0x4
  0x01f08e36: test   eax,eax
  0x01f08e38: repnz scas eax,DWORD PTR es:[edi]
  0x01f08e3a: pop    edi
  0x01f08e3b: pop    ecx
  0x01f08e3c: jne    0x01f08e46
  0x01f08e3e: mov    DWORD PTR [edx+0x14],edi
  0x01f08e41: jmp    0x01f08e57
  ;; receiver class disagrees with MemberName.clazz
  0x01f08e46: push   0x55314aa8
  0x01f08e4b: call   0x01f08e50
  0x01f08e50: pusha  
  0x01f08e51: call   0x54dedbf0
  0x01f08e56: hlt    
  ;; } check_receiver
  ;; verify_ref_kind {
  0x01f08e57: mov    eax,DWORD PTR [ebx+0x8]
  0x01f08e5a: shr    eax,0x18
  0x01f08e5d: and    eax,0xf
  0x01f08e60: cmp    eax,0x7
  0x01f08e63: je     0x01f08e7a
  ;; verify_ref_kind expected 7
  0x01f08e69: push   0x42ea570
  0x01f08e6e: call   0x01f08e73
  0x01f08e73: pusha  
  0x01f08e74: call   0x54dedbf0
  0x01f08e79: hlt    
  ;; } verify_ref_kind
  0x01f08e7a: mov    ebx,DWORD PTR [ebx+0x10]
  0x01f08e7d: test   ebx,ebx
  0x01f08e7f: je     0x01f08e88
  0x01f08e85: jmp    DWORD PTR [ebx+0x34]
  0x01f08e88: jmp    0x01eb2b90

MethodHandle::interpreter_entry::_linkToInterface [0x01f08e8d, 0x01f08fbd[ (304 bytes)
  0x01f08e8d: nop    
  0x01f08e8e: nop    
  0x01f08e8f: nop    
  ;; verify_intrinsic_id {
  0x01f08e90: cmp    BYTE PTR [ebx+0x1e],0xb0
  0x01f08e94: je     0x01f08eab
  ;; bad Method*::intrinsic_id
  0x01f08e9a: push   0x553146d0
  0x01f08e9f: call   0x01f08ea4
  0x01f08ea4: pusha  
  0x01f08ea5: call   0x54dedbf0
  0x01f08eaa: hlt    
  ;; } verify_intrinsic_id
  0x01f08eab: mov    edx,DWORD PTR [ebx+0x8]
  0x01f08eae: movzx  edx,WORD PTR [edx+0x22]
  0x01f08eb2: mov    ecx,DWORD PTR [esp+edx*4]
  0x01f08eb5: pop    eax
  0x01f08eb6: pop    ebx
  0x01f08eb7: push   eax
  ;; verify_klass {
  0x01f08eb8: test   ebx,ebx
  0x01f08eba: je     0x01f08ee0
  0x01f08ec0: push   edi
  0x01f08ec1: mov    edi,DWORD PTR [ebx+0x4]
  0x01f08ec4: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08eca: je     0x01f08ef1
  0x01f08ed0: mov    edi,DWORD PTR [edi+0x20]
  0x01f08ed3: cmp    edi,DWORD PTR ds:0x555e1760
  0x01f08ed9: je     0x01f08ef1
  0x01f08edf: pop    edi
  ;; MemberName required for invokeVirtual etc.
  0x01f08ee0: push   0x553148a8
  0x01f08ee5: call   0x01f08eea
  0x01f08eea: pusha  
  0x01f08eeb: call   0x54dedbf0
  0x01f08ef0: hlt    
  ;; L_ok:
  0x01f08ef1: pop    edi
  ;; } verify_klass
  0x01f08ef2: mov    edx,DWORD PTR [ecx+0x4]
  ;; check_receiver {
  ;; } check_receiver
  ;; verify_ref_kind {
  0x01f08ef5: mov    eax,DWORD PTR [ebx+0x8]
  0x01f08ef8: shr    eax,0x18
  0x01f08efb: and    eax,0xf
  0x01f08efe: cmp    eax,0x9
  0x01f08f01: je     0x01f08f18
  ;; verify_ref_kind expected 9
  0x01f08f07: push   0x42eae60
  0x01f08f0c: call   0x01f08f11
  0x01f08f11: pusha  
  0x01f08f12: call   0x54dedbf0
  0x01f08f17: hlt    
  ;; } verify_ref_kind
  0x01f08f18: mov    eax,DWORD PTR [ebx+0x14]
  ;; verify_klass {
  0x01f08f1b: test   eax,eax
  0x01f08f1d: je     0x01f08f43
  0x01f08f23: push   edi
  0x01f08f24: mov    edi,DWORD PTR [eax+0x4]
  0x01f08f27: cmp    edi,DWORD PTR ds:0x555e16ac
  0x01f08f2d: je     0x01f08f54
  0x01f08f33: mov    edi,DWORD PTR [edi+0x20]
  0x01f08f36: cmp    edi,DWORD PTR ds:0x555e16ac
  0x01f08f3c: je     0x01f08f54
  0x01f08f42: pop    edi
  ;; MH argument is a Class
  0x01f08f43: push   0x55314220
  0x01f08f48: call   0x01f08f4d
  0x01f08f4d: pusha  
  0x01f08f4e: call   0x54dedbf0
  0x01f08f53: hlt    
  ;; L_ok:
  0x01f08f54: pop    edi
  ;; } verify_klass
  0x01f08f55: mov    eax,DWORD PTR [eax+0x40]
  0x01f08f58: mov    ebx,DWORD PTR [ebx+0xc]
  0x01f08f5b: cmp    ebx,0x0
  0x01f08f5e: jge    0x01f08f75
  ;; invalid vtable index for MH.invokeInterface
  0x01f08f64: push   0x55314b90
  0x01f08f69: call   0x01f08f6e
  0x01f08f6e: pusha  
  0x01f08f6f: call   0x54dedbf0
  0x01f08f74: hlt    
  0x01f08f75: mov    edi,DWORD PTR [edx+0xb0]
  0x01f08f7b: lea    edi,[edx+edi*4+0x108]
  0x01f08f82: add    edi,0x7
  0x01f08f85: and    edi,0xfffffff8
  0x01f08f88: lea    edx,[edx+ebx*4]
  0x01f08f8b: mov    ebx,DWORD PTR [edi]
  0x01f08f8d: cmp    eax,ebx
  0x01f08f8f: je     0x01f08fa2
  0x01f08f91: test   ebx,ebx
  0x01f08f93: je     0x01f08fb8
  0x01f08f99: add    edi,0x8
  0x01f08f9c: mov    ebx,DWORD PTR [edi]
  0x01f08f9e: cmp    eax,ebx
  0x01f08fa0: jne    0x01f08f91
  0x01f08fa2: mov    edi,DWORD PTR [edi+0x4]
  0x01f08fa5: mov    ebx,DWORD PTR [edx+edi*1]
  0x01f08fa8: test   ebx,ebx
  0x01f08faa: je     0x01f08fb3
  0x01f08fb0: jmp    DWORD PTR [ebx+0x34]
  0x01f08fb3: jmp    0x01eb2b90
  0x01f08fb8: jmp    0x01eb2c50

AHE@0x0422c4b0: 0xaaabeaaa i2c: 0x01f14170 c2i: 0x01f14246 c2iUV: 0x01f14225
i2c argument handler #67 for: receiver (IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V (339 bytes generated)
c2i argument handler starts at 01F14246
  0x01f14170: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f14173: mov    edi,0x1dc2940
  0x01f14178: cmp    eax,edi
  0x01f1417a: jbe    0x01f1418d
  0x01f14180: mov    edi,0x1ea2940
  0x01f14185: cmp    eax,edi
  0x01f14187: jb     0x01f141d2
  0x01f1418d: mov    edi,0x1dc0340
  0x01f14192: cmp    eax,edi
  0x01f14194: jbe    0x01f141a7
  0x01f1419a: mov    edi,0x1dc2668
  0x01f1419f: cmp    eax,edi
  0x01f141a1: jb     0x01f141d2
  0x01f141a7: mov    edi,0x1ead380
  0x01f141ac: cmp    eax,edi
  0x01f141ae: jbe    0x01f141c1
  0x01f141b4: mov    edi,0x1eb2970
  0x01f141b9: cmp    eax,edi
  0x01f141bb: jb     0x01f141d2
  ;; i2c adapter must return to an interpreter frame
  0x01f141c1: push   0x5531723c
  0x01f141c6: call   0x01f141cb
  0x01f141cb: pusha  
  0x01f141cc: call   0x54dedbf0
  0x01f141d1: hlt    
  ;; } verify_i2ce 
  0x01f141d2: mov    edi,esp
  0x01f141d4: sub    esp,0x18
  0x01f141d7: and    esp,0xfffffff0
  0x01f141da: push   eax
  0x01f141db: mov    eax,edi
  0x01f141dd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f141e0: mov    ecx,DWORD PTR [eax+0x20]
  0x01f141e3: mov    edx,DWORD PTR [eax+0x1c]
  0x01f141e6: mov    esi,DWORD PTR [eax+0x18]
  0x01f141e9: mov    DWORD PTR [esp+0xc],esi
  0x01f141ed: mov    esi,DWORD PTR [eax+0x10]
  0x01f141f0: mov    DWORD PTR [esp+0x4],esi
  0x01f141f4: mov    esi,DWORD PTR [eax+0x14]
  0x01f141f7: mov    DWORD PTR [esp+0x8],esi
  0x01f141fb: mov    esi,DWORD PTR [eax+0xc]
  0x01f141fe: mov    DWORD PTR [esp+0x10],esi
  0x01f14202: mov    esi,DWORD PTR [eax+0x8]
  0x01f14205: mov    DWORD PTR [esp+0x14],esi
  0x01f14209: mov    esi,DWORD PTR [eax+0x4]
  0x01f1420c: mov    DWORD PTR [esp+0x18],esi
  0x01f14210: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f14218: mov    eax,DWORD PTR [eax-0xc]
  0x01f1421b: mov    DWORD PTR [eax+0x168],ebx
  0x01f14221: mov    eax,ebx
  0x01f14223: jmp    edi
  0x01f14225: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f14228: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f1422b: mov    ebx,DWORD PTR [eax+0x4]
  0x01f1422e: jne    0x01f14241
  0x01f14234: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f1423b: je     0x01f14280
  0x01f14241: jmp    0x01ea32d0
  0x01f14246: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f1424d: je     0x01f14280
  0x01f14253: mov    eax,DWORD PTR [esp]
  0x01f14256: pusha  
  0x01f14257: pushf  
  0x01f14258: sub    esp,0x10
  0x01f1425b: movsd  QWORD PTR [esp],xmm0
  0x01f14260: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f14266: push   eax
  0x01f14267: push   ebx
  0x01f14268: call   0x552179d0
  0x01f1426d: add    esp,0x8
  0x01f14270: movsd  xmm0,QWORD PTR [esp]
  0x01f14275: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f1427b: add    esp,0x10
  0x01f1427e: popf   
  0x01f1427f: popa   
  0x01f14280: pop    eax
  0x01f14281: mov    esi,esp
  0x01f14283: sub    esp,0x20
  0x01f14286: mov    DWORD PTR [esp+0x1c],ecx
  0x01f1428a: mov    DWORD PTR [esp+0x18],edx
  0x01f1428e: mov    edi,DWORD PTR [esp+0x28]
  0x01f14292: mov    DWORD PTR [esp+0x14],edi
  0x01f14296: mov    edi,DWORD PTR [esp+0x20]
  0x01f1429a: mov    DWORD PTR [esp+0xc],edi
  0x01f1429e: mov    edi,DWORD PTR [esp+0x24]
  0x01f142a2: mov    DWORD PTR [esp+0x10],edi
  0x01f142a6: mov    edi,DWORD PTR [esp+0x2c]
  0x01f142aa: mov    DWORD PTR [esp+0x8],edi
  0x01f142ae: mov    edi,DWORD PTR [esp+0x30]
  0x01f142b2: mov    DWORD PTR [esp+0x4],edi
  0x01f142b6: mov    edi,DWORD PTR [esp+0x34]
  0x01f142ba: mov    DWORD PTR [esp],edi
  0x01f142bd: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f142c0: push   eax
  0x01f142c1: jmp    ecx

AHE@0x0422c4dc: 0xaaabeaa0 i2c: 0x01f14370 c2i: 0x01f1443f c2iUV: 0x01f1441e
i2c argument handler #68 for: receiver (IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V (324 bytes generated)
c2i argument handler starts at 01F1443F
  0x01f14370: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f14373: mov    edi,0x1dc2940
  0x01f14378: cmp    eax,edi
  0x01f1437a: jbe    0x01f1438d
  0x01f14380: mov    edi,0x1ea2940
  0x01f14385: cmp    eax,edi
  0x01f14387: jb     0x01f143d2
  0x01f1438d: mov    edi,0x1dc0340
  0x01f14392: cmp    eax,edi
  0x01f14394: jbe    0x01f143a7
  0x01f1439a: mov    edi,0x1dc2668
  0x01f1439f: cmp    eax,edi
  0x01f143a1: jb     0x01f143d2
  0x01f143a7: mov    edi,0x1ead380
  0x01f143ac: cmp    eax,edi
  0x01f143ae: jbe    0x01f143c1
  0x01f143b4: mov    edi,0x1eb2970
  0x01f143b9: cmp    eax,edi
  0x01f143bb: jb     0x01f143d2
  ;; i2c adapter must return to an interpreter frame
  0x01f143c1: push   0x5531723c
  0x01f143c6: call   0x01f143cb
  0x01f143cb: pusha  
  0x01f143cc: call   0x54dedbf0
  0x01f143d1: hlt    
  ;; } verify_i2ce 
  0x01f143d2: mov    edi,esp
  0x01f143d4: sub    esp,0x18
  0x01f143d7: and    esp,0xfffffff0
  0x01f143da: push   eax
  0x01f143db: mov    eax,edi
  0x01f143dd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f143e0: mov    ecx,DWORD PTR [eax+0x1c]
  0x01f143e3: mov    edx,DWORD PTR [eax+0x18]
  0x01f143e6: mov    esi,DWORD PTR [eax+0x14]
  0x01f143e9: mov    DWORD PTR [esp+0xc],esi
  0x01f143ed: mov    esi,DWORD PTR [eax+0xc]
  0x01f143f0: mov    DWORD PTR [esp+0x4],esi
  0x01f143f4: mov    esi,DWORD PTR [eax+0x10]
  0x01f143f7: mov    DWORD PTR [esp+0x8],esi
  0x01f143fb: mov    esi,DWORD PTR [eax+0x8]
  0x01f143fe: mov    DWORD PTR [esp+0x10],esi
  0x01f14402: mov    esi,DWORD PTR [eax+0x4]
  0x01f14405: mov    DWORD PTR [esp+0x14],esi
  0x01f14409: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f14411: mov    eax,DWORD PTR [eax-0xc]
  0x01f14414: mov    DWORD PTR [eax+0x168],ebx
  0x01f1441a: mov    eax,ebx
  0x01f1441c: jmp    edi
  0x01f1441e: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f14421: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f14424: mov    ebx,DWORD PTR [eax+0x4]
  0x01f14427: jne    0x01f1443a
  0x01f1442d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f14434: je     0x01f14479
  0x01f1443a: jmp    0x01ea32d0
  0x01f1443f: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f14446: je     0x01f14479
  0x01f1444c: mov    eax,DWORD PTR [esp]
  0x01f1444f: pusha  
  0x01f14450: pushf  
  0x01f14451: sub    esp,0x10
  0x01f14454: movsd  QWORD PTR [esp],xmm0
  0x01f14459: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f1445f: push   eax
  0x01f14460: push   ebx
  0x01f14461: call   0x552179d0
  0x01f14466: add    esp,0x8
  0x01f14469: movsd  xmm0,QWORD PTR [esp]
  0x01f1446e: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f14474: add    esp,0x10
  0x01f14477: popf   
  0x01f14478: popa   
  0x01f14479: pop    eax
  0x01f1447a: mov    esi,esp
  0x01f1447c: sub    esp,0x1c
  0x01f1447f: mov    DWORD PTR [esp+0x18],ecx
  0x01f14483: mov    DWORD PTR [esp+0x14],edx
  0x01f14487: mov    edi,DWORD PTR [esp+0x24]
  0x01f1448b: mov    DWORD PTR [esp+0x10],edi
  0x01f1448f: mov    edi,DWORD PTR [esp+0x1c]
  0x01f14493: mov    DWORD PTR [esp+0x8],edi
  0x01f14497: mov    edi,DWORD PTR [esp+0x20]
  0x01f1449b: mov    DWORD PTR [esp+0xc],edi
  0x01f1449f: mov    edi,DWORD PTR [esp+0x28]
  0x01f144a3: mov    DWORD PTR [esp+0x4],edi
  0x01f144a7: mov    edi,DWORD PTR [esp+0x2c]
  0x01f144ab: mov    DWORD PTR [esp],edi
  0x01f144ae: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f144b1: push   eax
  0x01f144b2: jmp    ecx

AHE@0x0422c508: 0xaaabeaaaa0000000 i2c: 0x01f14530 c2i: 0x01f1460d c2iUV: 0x01f145ec
i2c argument handler #69 for: receiver (IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V (354 bytes generated)
c2i argument handler starts at 01F1460D
  0x01f14530: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f14533: mov    edi,0x1dc2940
  0x01f14538: cmp    eax,edi
  0x01f1453a: jbe    0x01f1454d
  0x01f14540: mov    edi,0x1ea2940
  0x01f14545: cmp    eax,edi
  0x01f14547: jb     0x01f14592
  0x01f1454d: mov    edi,0x1dc0340
  0x01f14552: cmp    eax,edi
  0x01f14554: jbe    0x01f14567
  0x01f1455a: mov    edi,0x1dc2668
  0x01f1455f: cmp    eax,edi
  0x01f14561: jb     0x01f14592
  0x01f14567: mov    edi,0x1ead380
  0x01f1456c: cmp    eax,edi
  0x01f1456e: jbe    0x01f14581
  0x01f14574: mov    edi,0x1eb2970
  0x01f14579: cmp    eax,edi
  0x01f1457b: jb     0x01f14592
  ;; i2c adapter must return to an interpreter frame
  0x01f14581: push   0x5531723c
  0x01f14586: call   0x01f1458b
  0x01f1458b: pusha  
  0x01f1458c: call   0x54dedbf0
  0x01f14591: hlt    
  ;; } verify_i2ce 
  0x01f14592: mov    edi,esp
  0x01f14594: sub    esp,0x20
  0x01f14597: and    esp,0xfffffff0
  0x01f1459a: push   eax
  0x01f1459b: mov    eax,edi
  0x01f1459d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f145a0: mov    ecx,DWORD PTR [eax+0x24]
  0x01f145a3: mov    edx,DWORD PTR [eax+0x20]
  0x01f145a6: mov    esi,DWORD PTR [eax+0x1c]
  0x01f145a9: mov    DWORD PTR [esp+0xc],esi
  0x01f145ad: mov    esi,DWORD PTR [eax+0x14]
  0x01f145b0: mov    DWORD PTR [esp+0x4],esi
  0x01f145b4: mov    esi,DWORD PTR [eax+0x18]
  0x01f145b7: mov    DWORD PTR [esp+0x8],esi
  0x01f145bb: mov    esi,DWORD PTR [eax+0x10]
  0x01f145be: mov    DWORD PTR [esp+0x10],esi
  0x01f145c2: mov    esi,DWORD PTR [eax+0xc]
  0x01f145c5: mov    DWORD PTR [esp+0x14],esi
  0x01f145c9: mov    esi,DWORD PTR [eax+0x8]
  0x01f145cc: mov    DWORD PTR [esp+0x18],esi
  0x01f145d0: mov    esi,DWORD PTR [eax+0x4]
  0x01f145d3: mov    DWORD PTR [esp+0x1c],esi
  0x01f145d7: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f145df: mov    eax,DWORD PTR [eax-0xc]
  0x01f145e2: mov    DWORD PTR [eax+0x168],ebx
  0x01f145e8: mov    eax,ebx
  0x01f145ea: jmp    edi
  0x01f145ec: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f145ef: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f145f2: mov    ebx,DWORD PTR [eax+0x4]
  0x01f145f5: jne    0x01f14608
  0x01f145fb: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f14602: je     0x01f14647
  0x01f14608: jmp    0x01ea32d0
  0x01f1460d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f14614: je     0x01f14647
  0x01f1461a: mov    eax,DWORD PTR [esp]
  0x01f1461d: pusha  
  0x01f1461e: pushf  
  0x01f1461f: sub    esp,0x10
  0x01f14622: movsd  QWORD PTR [esp],xmm0
  0x01f14627: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f1462d: push   eax
  0x01f1462e: push   ebx
  0x01f1462f: call   0x552179d0
  0x01f14634: add    esp,0x8
  0x01f14637: movsd  xmm0,QWORD PTR [esp]
  0x01f1463c: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f14642: add    esp,0x10
  0x01f14645: popf   
  0x01f14646: popa   
  0x01f14647: pop    eax
  0x01f14648: mov    esi,esp
  0x01f1464a: sub    esp,0x24
  0x01f1464d: mov    DWORD PTR [esp+0x20],ecx
  0x01f14651: mov    DWORD PTR [esp+0x1c],edx
  0x01f14655: mov    edi,DWORD PTR [esp+0x2c]
  0x01f14659: mov    DWORD PTR [esp+0x18],edi
  0x01f1465d: mov    edi,DWORD PTR [esp+0x24]
  0x01f14661: mov    DWORD PTR [esp+0x10],edi
  0x01f14665: mov    edi,DWORD PTR [esp+0x28]
  0x01f14669: mov    DWORD PTR [esp+0x14],edi
  0x01f1466d: mov    edi,DWORD PTR [esp+0x30]
  0x01f14671: mov    DWORD PTR [esp+0xc],edi
  0x01f14675: mov    edi,DWORD PTR [esp+0x34]
  0x01f14679: mov    DWORD PTR [esp+0x8],edi
  0x01f1467d: mov    edi,DWORD PTR [esp+0x38]
  0x01f14681: mov    DWORD PTR [esp+0x4],edi
  0x01f14685: mov    edi,DWORD PTR [esp+0x3c]
  0x01f14689: mov    DWORD PTR [esp],edi
  0x01f1468c: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f1468f: push   eax
  0x01f14690: jmp    ecx

AHE@0x0422c534: 0xbebebe00 i2c: 0x01f14730 c2i: 0x01f14800 c2iUV: 0x01f147df
i2c argument handler #70 for: static (JJJ)J (325 bytes generated)
c2i argument handler starts at 01F14800
  0x01f14730: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f14733: mov    edi,0x1dc2940
  0x01f14738: cmp    eax,edi
  0x01f1473a: jbe    0x01f1474d
  0x01f14740: mov    edi,0x1ea2940
  0x01f14745: cmp    eax,edi
  0x01f14747: jb     0x01f14792
  0x01f1474d: mov    edi,0x1dc0340
  0x01f14752: cmp    eax,edi
  0x01f14754: jbe    0x01f14767
  0x01f1475a: mov    edi,0x1dc2668
  0x01f1475f: cmp    eax,edi
  0x01f14761: jb     0x01f14792
  0x01f14767: mov    edi,0x1ead380
  0x01f1476c: cmp    eax,edi
  0x01f1476e: jbe    0x01f14781
  0x01f14774: mov    edi,0x1eb2970
  0x01f14779: cmp    eax,edi
  0x01f1477b: jb     0x01f14792
  ;; i2c adapter must return to an interpreter frame
  0x01f14781: push   0x5531723c
  0x01f14786: call   0x01f1478b
  0x01f1478b: pusha  
  0x01f1478c: call   0x54dedbf0
  0x01f14791: hlt    
  ;; } verify_i2ce 
  0x01f14792: mov    edi,esp
  0x01f14794: sub    esp,0x18
  0x01f14797: and    esp,0xfffffff0
  0x01f1479a: push   eax
  0x01f1479b: mov    eax,edi
  0x01f1479d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f147a0: mov    esi,DWORD PTR [eax+0x14]
  0x01f147a3: mov    DWORD PTR [esp+0x4],esi
  0x01f147a7: mov    esi,DWORD PTR [eax+0x18]
  0x01f147aa: mov    DWORD PTR [esp+0x8],esi
  0x01f147ae: mov    esi,DWORD PTR [eax+0xc]
  0x01f147b1: mov    DWORD PTR [esp+0xc],esi
  0x01f147b5: mov    esi,DWORD PTR [eax+0x10]
  0x01f147b8: mov    DWORD PTR [esp+0x10],esi
  0x01f147bc: mov    esi,DWORD PTR [eax+0x4]
  0x01f147bf: mov    DWORD PTR [esp+0x14],esi
  0x01f147c3: mov    esi,DWORD PTR [eax+0x8]
  0x01f147c6: mov    DWORD PTR [esp+0x18],esi
  0x01f147ca: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f147d2: mov    eax,DWORD PTR [eax-0xc]
  0x01f147d5: mov    DWORD PTR [eax+0x168],ebx
  0x01f147db: mov    eax,ebx
  0x01f147dd: jmp    edi
  0x01f147df: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f147e2: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f147e5: mov    ebx,DWORD PTR [eax+0x4]
  0x01f147e8: jne    0x01f147fb
  0x01f147ee: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f147f5: je     0x01f1483a
  0x01f147fb: jmp    0x01ea32d0
  0x01f14800: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f14807: je     0x01f1483a
  0x01f1480d: mov    eax,DWORD PTR [esp]
  0x01f14810: pusha  
  0x01f14811: pushf  
  0x01f14812: sub    esp,0x10
  0x01f14815: movsd  QWORD PTR [esp],xmm0
  0x01f1481a: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f14820: push   eax
  0x01f14821: push   ebx
  0x01f14822: call   0x552179d0
  0x01f14827: add    esp,0x8
  0x01f1482a: movsd  xmm0,QWORD PTR [esp]
  0x01f1482f: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f14835: add    esp,0x10
  0x01f14838: popf   
  0x01f14839: popa   
  0x01f1483a: pop    eax
  0x01f1483b: mov    esi,esp
  0x01f1483d: sub    esp,0x18
  0x01f14840: mov    edi,DWORD PTR [esp+0x18]
  0x01f14844: mov    DWORD PTR [esp+0x10],edi
  0x01f14848: mov    edi,DWORD PTR [esp+0x1c]
  0x01f1484c: mov    DWORD PTR [esp+0x14],edi
  0x01f14850: mov    edi,DWORD PTR [esp+0x20]
  0x01f14854: mov    DWORD PTR [esp+0x8],edi
  0x01f14858: mov    edi,DWORD PTR [esp+0x24]
  0x01f1485c: mov    DWORD PTR [esp+0xc],edi
  0x01f14860: mov    edi,DWORD PTR [esp+0x28]
  0x01f14864: mov    DWORD PTR [esp],edi
  0x01f14867: mov    edi,DWORD PTR [esp+0x2c]
  0x01f1486b: mov    DWORD PTR [esp+0x4],edi
  0x01f1486f: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f14872: push   eax
  0x01f14873: jmp    ecx

AHE@0x0422c560: 0xaaaaaabe i2c: 0x01f153b0 c2i: 0x01f15486 c2iUV: 0x01f15465
i2c argument handler #71 for: receiver (Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/util/ResourceBundle;J)Z (339 bytes generated)
c2i argument handler starts at 01F15486
  0x01f153b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f153b3: mov    edi,0x1dc2940
  0x01f153b8: cmp    eax,edi
  0x01f153ba: jbe    0x01f153cd
  0x01f153c0: mov    edi,0x1ea2940
  0x01f153c5: cmp    eax,edi
  0x01f153c7: jb     0x01f15412
  0x01f153cd: mov    edi,0x1dc0340
  0x01f153d2: cmp    eax,edi
  0x01f153d4: jbe    0x01f153e7
  0x01f153da: mov    edi,0x1dc2668
  0x01f153df: cmp    eax,edi
  0x01f153e1: jb     0x01f15412
  0x01f153e7: mov    edi,0x1ead380
  0x01f153ec: cmp    eax,edi
  0x01f153ee: jbe    0x01f15401
  0x01f153f4: mov    edi,0x1eb2970
  0x01f153f9: cmp    eax,edi
  0x01f153fb: jb     0x01f15412
  ;; i2c adapter must return to an interpreter frame
  0x01f15401: push   0x5531723c
  0x01f15406: call   0x01f1540b
  0x01f1540b: pusha  
  0x01f1540c: call   0x54dedbf0
  0x01f15411: hlt    
  ;; } verify_i2ce 
  0x01f15412: mov    edi,esp
  0x01f15414: sub    esp,0x18
  0x01f15417: and    esp,0xfffffff0
  0x01f1541a: push   eax
  0x01f1541b: mov    eax,edi
  0x01f1541d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f15420: mov    ecx,DWORD PTR [eax+0x20]
  0x01f15423: mov    edx,DWORD PTR [eax+0x1c]
  0x01f15426: mov    esi,DWORD PTR [eax+0x18]
  0x01f15429: mov    DWORD PTR [esp+0xc],esi
  0x01f1542d: mov    esi,DWORD PTR [eax+0x14]
  0x01f15430: mov    DWORD PTR [esp+0x10],esi
  0x01f15434: mov    esi,DWORD PTR [eax+0x10]
  0x01f15437: mov    DWORD PTR [esp+0x14],esi
  0x01f1543b: mov    esi,DWORD PTR [eax+0xc]
  0x01f1543e: mov    DWORD PTR [esp+0x18],esi
  0x01f15442: mov    esi,DWORD PTR [eax+0x4]
  0x01f15445: mov    DWORD PTR [esp+0x4],esi
  0x01f15449: mov    esi,DWORD PTR [eax+0x8]
  0x01f1544c: mov    DWORD PTR [esp+0x8],esi
  0x01f15450: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f15458: mov    eax,DWORD PTR [eax-0xc]
  0x01f1545b: mov    DWORD PTR [eax+0x168],ebx
  0x01f15461: mov    eax,ebx
  0x01f15463: jmp    edi
  0x01f15465: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f15468: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f1546b: mov    ebx,DWORD PTR [eax+0x4]
  0x01f1546e: jne    0x01f15481
  0x01f15474: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f1547b: je     0x01f154c0
  0x01f15481: jmp    0x01ea32d0
  0x01f15486: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f1548d: je     0x01f154c0
  0x01f15493: mov    eax,DWORD PTR [esp]
  0x01f15496: pusha  
  0x01f15497: pushf  
  0x01f15498: sub    esp,0x10
  0x01f1549b: movsd  QWORD PTR [esp],xmm0
  0x01f154a0: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f154a6: push   eax
  0x01f154a7: push   ebx
  0x01f154a8: call   0x552179d0
  0x01f154ad: add    esp,0x8
  0x01f154b0: movsd  xmm0,QWORD PTR [esp]
  0x01f154b5: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f154bb: add    esp,0x10
  0x01f154be: popf   
  0x01f154bf: popa   
  0x01f154c0: pop    eax
  0x01f154c1: mov    esi,esp
  0x01f154c3: sub    esp,0x20
  0x01f154c6: mov    DWORD PTR [esp+0x1c],ecx
  0x01f154ca: mov    DWORD PTR [esp+0x18],edx
  0x01f154ce: mov    edi,DWORD PTR [esp+0x28]
  0x01f154d2: mov    DWORD PTR [esp+0x14],edi
  0x01f154d6: mov    edi,DWORD PTR [esp+0x2c]
  0x01f154da: mov    DWORD PTR [esp+0x10],edi
  0x01f154de: mov    edi,DWORD PTR [esp+0x30]
  0x01f154e2: mov    DWORD PTR [esp+0xc],edi
  0x01f154e6: mov    edi,DWORD PTR [esp+0x34]
  0x01f154ea: mov    DWORD PTR [esp+0x8],edi
  0x01f154ee: mov    edi,DWORD PTR [esp+0x20]
  0x01f154f2: mov    DWORD PTR [esp],edi
  0x01f154f5: mov    edi,DWORD PTR [esp+0x24]
  0x01f154f9: mov    DWORD PTR [esp+0x4],edi
  0x01f154fd: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f15500: push   eax
  0x01f15501: jmp    ecx

AHE@0x0422c58c: 0xbebebeaaa0000000 i2c: 0x01f17630 c2i: 0x01f1770d c2iUV: 0x01f176ec
i2c argument handler #72 for: static (JJJ[BII)I (354 bytes generated)
c2i argument handler starts at 01F1770D
  0x01f17630: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f17633: mov    edi,0x1dc2940
  0x01f17638: cmp    eax,edi
  0x01f1763a: jbe    0x01f1764d
  0x01f17640: mov    edi,0x1ea2940
  0x01f17645: cmp    eax,edi
  0x01f17647: jb     0x01f17692
  0x01f1764d: mov    edi,0x1dc0340
  0x01f17652: cmp    eax,edi
  0x01f17654: jbe    0x01f17667
  0x01f1765a: mov    edi,0x1dc2668
  0x01f1765f: cmp    eax,edi
  0x01f17661: jb     0x01f17692
  0x01f17667: mov    edi,0x1ead380
  0x01f1766c: cmp    eax,edi
  0x01f1766e: jbe    0x01f17681
  0x01f17674: mov    edi,0x1eb2970
  0x01f17679: cmp    eax,edi
  0x01f1767b: jb     0x01f17692
  ;; i2c adapter must return to an interpreter frame
  0x01f17681: push   0x5531723c
  0x01f17686: call   0x01f1768b
  0x01f1768b: pusha  
  0x01f1768c: call   0x54dedbf0
  0x01f17691: hlt    
  ;; } verify_i2ce 
  0x01f17692: mov    edi,esp
  0x01f17694: sub    esp,0x20
  0x01f17697: and    esp,0xfffffff0
  0x01f1769a: push   eax
  0x01f1769b: mov    eax,edi
  0x01f1769d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f176a0: mov    esi,DWORD PTR [eax+0x20]
  0x01f176a3: mov    DWORD PTR [esp+0x4],esi
  0x01f176a7: mov    esi,DWORD PTR [eax+0x24]
  0x01f176aa: mov    DWORD PTR [esp+0x8],esi
  0x01f176ae: mov    esi,DWORD PTR [eax+0x18]
  0x01f176b1: mov    DWORD PTR [esp+0xc],esi
  0x01f176b5: mov    esi,DWORD PTR [eax+0x1c]
  0x01f176b8: mov    DWORD PTR [esp+0x10],esi
  0x01f176bc: mov    esi,DWORD PTR [eax+0x10]
  0x01f176bf: mov    DWORD PTR [esp+0x14],esi
  0x01f176c3: mov    esi,DWORD PTR [eax+0x14]
  0x01f176c6: mov    DWORD PTR [esp+0x18],esi
  0x01f176ca: mov    ecx,DWORD PTR [eax+0xc]
  0x01f176cd: mov    edx,DWORD PTR [eax+0x8]
  0x01f176d0: mov    esi,DWORD PTR [eax+0x4]
  0x01f176d3: mov    DWORD PTR [esp+0x1c],esi
  0x01f176d7: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f176df: mov    eax,DWORD PTR [eax-0xc]
  0x01f176e2: mov    DWORD PTR [eax+0x168],ebx
  0x01f176e8: mov    eax,ebx
  0x01f176ea: jmp    edi
  0x01f176ec: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f176ef: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f176f2: mov    ebx,DWORD PTR [eax+0x4]
  0x01f176f5: jne    0x01f17708
  0x01f176fb: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f17702: je     0x01f17747
  0x01f17708: jmp    0x01ea32d0
  0x01f1770d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f17714: je     0x01f17747
  0x01f1771a: mov    eax,DWORD PTR [esp]
  0x01f1771d: pusha  
  0x01f1771e: pushf  
  0x01f1771f: sub    esp,0x10
  0x01f17722: movsd  QWORD PTR [esp],xmm0
  0x01f17727: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f1772d: push   eax
  0x01f1772e: push   ebx
  0x01f1772f: call   0x552179d0
  0x01f17734: add    esp,0x8
  0x01f17737: movsd  xmm0,QWORD PTR [esp]
  0x01f1773c: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f17742: add    esp,0x10
  0x01f17745: popf   
  0x01f17746: popa   
  0x01f17747: pop    eax
  0x01f17748: mov    esi,esp
  0x01f1774a: sub    esp,0x24
  0x01f1774d: mov    edi,DWORD PTR [esp+0x24]
  0x01f17751: mov    DWORD PTR [esp+0x1c],edi
  0x01f17755: mov    edi,DWORD PTR [esp+0x28]
  0x01f17759: mov    DWORD PTR [esp+0x20],edi
  0x01f1775d: mov    edi,DWORD PTR [esp+0x2c]
  0x01f17761: mov    DWORD PTR [esp+0x14],edi
  0x01f17765: mov    edi,DWORD PTR [esp+0x30]
  0x01f17769: mov    DWORD PTR [esp+0x18],edi
  0x01f1776d: mov    edi,DWORD PTR [esp+0x34]
  0x01f17771: mov    DWORD PTR [esp+0xc],edi
  0x01f17775: mov    edi,DWORD PTR [esp+0x38]
  0x01f17779: mov    DWORD PTR [esp+0x10],edi
  0x01f1777d: mov    DWORD PTR [esp+0x8],ecx
  0x01f17781: mov    DWORD PTR [esp+0x4],edx
  0x01f17785: mov    edi,DWORD PTR [esp+0x3c]
  0x01f17789: mov    DWORD PTR [esp],edi
  0x01f1778c: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f1778f: push   eax
  0x01f17790: jmp    ecx

AHE@0x0422c5b8: 0xaaaabeaa i2c: 0x01f1be70 c2i: 0x01f1bf46 c2iUV: 0x01f1bf25
i2c argument handler #73 for: static ([JI[IIJII)I (339 bytes generated)
c2i argument handler starts at 01F1BF46
  0x01f1be70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f1be73: mov    edi,0x1dc2940
  0x01f1be78: cmp    eax,edi
  0x01f1be7a: jbe    0x01f1be8d
  0x01f1be80: mov    edi,0x1ea2940
  0x01f1be85: cmp    eax,edi
  0x01f1be87: jb     0x01f1bed2
  0x01f1be8d: mov    edi,0x1dc0340
  0x01f1be92: cmp    eax,edi
  0x01f1be94: jbe    0x01f1bea7
  0x01f1be9a: mov    edi,0x1dc2668
  0x01f1be9f: cmp    eax,edi
  0x01f1bea1: jb     0x01f1bed2
  0x01f1bea7: mov    edi,0x1ead380
  0x01f1beac: cmp    eax,edi
  0x01f1beae: jbe    0x01f1bec1
  0x01f1beb4: mov    edi,0x1eb2970
  0x01f1beb9: cmp    eax,edi
  0x01f1bebb: jb     0x01f1bed2
  ;; i2c adapter must return to an interpreter frame
  0x01f1bec1: push   0x5531723c
  0x01f1bec6: call   0x01f1becb
  0x01f1becb: pusha  
  0x01f1becc: call   0x54dedbf0
  0x01f1bed1: hlt    
  ;; } verify_i2ce 
  0x01f1bed2: mov    edi,esp
  0x01f1bed4: sub    esp,0x18
  0x01f1bed7: and    esp,0xfffffff0
  0x01f1beda: push   eax
  0x01f1bedb: mov    eax,edi
  0x01f1bedd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f1bee0: mov    ecx,DWORD PTR [eax+0x20]
  0x01f1bee3: mov    edx,DWORD PTR [eax+0x1c]
  0x01f1bee6: mov    esi,DWORD PTR [eax+0x18]
  0x01f1bee9: mov    DWORD PTR [esp+0xc],esi
  0x01f1beed: mov    esi,DWORD PTR [eax+0x14]
  0x01f1bef0: mov    DWORD PTR [esp+0x10],esi
  0x01f1bef4: mov    esi,DWORD PTR [eax+0xc]
  0x01f1bef7: mov    DWORD PTR [esp+0x4],esi
  0x01f1befb: mov    esi,DWORD PTR [eax+0x10]
  0x01f1befe: mov    DWORD PTR [esp+0x8],esi
  0x01f1bf02: mov    esi,DWORD PTR [eax+0x8]
  0x01f1bf05: mov    DWORD PTR [esp+0x14],esi
  0x01f1bf09: mov    esi,DWORD PTR [eax+0x4]
  0x01f1bf0c: mov    DWORD PTR [esp+0x18],esi
  0x01f1bf10: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f1bf18: mov    eax,DWORD PTR [eax-0xc]
  0x01f1bf1b: mov    DWORD PTR [eax+0x168],ebx
  0x01f1bf21: mov    eax,ebx
  0x01f1bf23: jmp    edi
  0x01f1bf25: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f1bf28: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f1bf2b: mov    ebx,DWORD PTR [eax+0x4]
  0x01f1bf2e: jne    0x01f1bf41
  0x01f1bf34: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f1bf3b: je     0x01f1bf80
  0x01f1bf41: jmp    0x01ea32d0
  0x01f1bf46: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f1bf4d: je     0x01f1bf80
  0x01f1bf53: mov    eax,DWORD PTR [esp]
  0x01f1bf56: pusha  
  0x01f1bf57: pushf  
  0x01f1bf58: sub    esp,0x10
  0x01f1bf5b: movsd  QWORD PTR [esp],xmm0
  0x01f1bf60: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f1bf66: push   eax
  0x01f1bf67: push   ebx
  0x01f1bf68: call   0x552179d0
  0x01f1bf6d: add    esp,0x8
  0x01f1bf70: movsd  xmm0,QWORD PTR [esp]
  0x01f1bf75: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f1bf7b: add    esp,0x10
  0x01f1bf7e: popf   
  0x01f1bf7f: popa   
  0x01f1bf80: pop    eax
  0x01f1bf81: mov    esi,esp
  0x01f1bf83: sub    esp,0x20
  0x01f1bf86: mov    DWORD PTR [esp+0x1c],ecx
  0x01f1bf8a: mov    DWORD PTR [esp+0x18],edx
  0x01f1bf8e: mov    edi,DWORD PTR [esp+0x28]
  0x01f1bf92: mov    DWORD PTR [esp+0x14],edi
  0x01f1bf96: mov    edi,DWORD PTR [esp+0x2c]
  0x01f1bf9a: mov    DWORD PTR [esp+0x10],edi
  0x01f1bf9e: mov    edi,DWORD PTR [esp+0x20]
  0x01f1bfa2: mov    DWORD PTR [esp+0x8],edi
  0x01f1bfa6: mov    edi,DWORD PTR [esp+0x24]
  0x01f1bfaa: mov    DWORD PTR [esp+0xc],edi
  0x01f1bfae: mov    edi,DWORD PTR [esp+0x30]
  0x01f1bfb2: mov    DWORD PTR [esp+0x4],edi
  0x01f1bfb6: mov    edi,DWORD PTR [esp+0x34]
  0x01f1bfba: mov    DWORD PTR [esp],edi
  0x01f1bfbd: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f1bfc0: push   eax
  0x01f1bfc1: jmp    ecx

AHE@0x0422c5e4: 0xaabeaaa0 i2c: 0x01f289b0 c2i: 0x01f28a7f c2iUV: 0x01f28a5e
i2c argument handler #74 for: receiver (Ljava/lang/StringBuilder;JLjava/util/Formatter$Flags;ILjava/util/Locale;)Ljava/lang/StringBuilder; (324 bytes generated)
c2i argument handler starts at 01F28A7F
  0x01f289b0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f289b3: mov    edi,0x1dc2940
  0x01f289b8: cmp    eax,edi
  0x01f289ba: jbe    0x01f289cd
  0x01f289c0: mov    edi,0x1ea2940
  0x01f289c5: cmp    eax,edi
  0x01f289c7: jb     0x01f28a12
  0x01f289cd: mov    edi,0x1dc0340
  0x01f289d2: cmp    eax,edi
  0x01f289d4: jbe    0x01f289e7
  0x01f289da: mov    edi,0x1dc2668
  0x01f289df: cmp    eax,edi
  0x01f289e1: jb     0x01f28a12
  0x01f289e7: mov    edi,0x1ead380
  0x01f289ec: cmp    eax,edi
  0x01f289ee: jbe    0x01f28a01
  0x01f289f4: mov    edi,0x1eb2970
  0x01f289f9: cmp    eax,edi
  0x01f289fb: jb     0x01f28a12
  ;; i2c adapter must return to an interpreter frame
  0x01f28a01: push   0x5531723c
  0x01f28a06: call   0x01f28a0b
  0x01f28a0b: pusha  
  0x01f28a0c: call   0x54dedbf0
  0x01f28a11: hlt    
  ;; } verify_i2ce 
  0x01f28a12: mov    edi,esp
  0x01f28a14: sub    esp,0x18
  0x01f28a17: and    esp,0xfffffff0
  0x01f28a1a: push   eax
  0x01f28a1b: mov    eax,edi
  0x01f28a1d: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f28a20: mov    ecx,DWORD PTR [eax+0x1c]
  0x01f28a23: mov    edx,DWORD PTR [eax+0x18]
  0x01f28a26: mov    esi,DWORD PTR [eax+0x10]
  0x01f28a29: mov    DWORD PTR [esp+0x4],esi
  0x01f28a2d: mov    esi,DWORD PTR [eax+0x14]
  0x01f28a30: mov    DWORD PTR [esp+0x8],esi
  0x01f28a34: mov    esi,DWORD PTR [eax+0xc]
  0x01f28a37: mov    DWORD PTR [esp+0xc],esi
  0x01f28a3b: mov    esi,DWORD PTR [eax+0x8]
  0x01f28a3e: mov    DWORD PTR [esp+0x10],esi
  0x01f28a42: mov    esi,DWORD PTR [eax+0x4]
  0x01f28a45: mov    DWORD PTR [esp+0x14],esi
  0x01f28a49: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f28a51: mov    eax,DWORD PTR [eax-0xc]
  0x01f28a54: mov    DWORD PTR [eax+0x168],ebx
  0x01f28a5a: mov    eax,ebx
  0x01f28a5c: jmp    edi
  0x01f28a5e: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f28a61: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f28a64: mov    ebx,DWORD PTR [eax+0x4]
  0x01f28a67: jne    0x01f28a7a
  0x01f28a6d: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28a74: je     0x01f28ab9
  0x01f28a7a: jmp    0x01ea32d0
  0x01f28a7f: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28a86: je     0x01f28ab9
  0x01f28a8c: mov    eax,DWORD PTR [esp]
  0x01f28a8f: pusha  
  0x01f28a90: pushf  
  0x01f28a91: sub    esp,0x10
  0x01f28a94: movsd  QWORD PTR [esp],xmm0
  0x01f28a99: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f28a9f: push   eax
  0x01f28aa0: push   ebx
  0x01f28aa1: call   0x552179d0
  0x01f28aa6: add    esp,0x8
  0x01f28aa9: movsd  xmm0,QWORD PTR [esp]
  0x01f28aae: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f28ab4: add    esp,0x10
  0x01f28ab7: popf   
  0x01f28ab8: popa   
  0x01f28ab9: pop    eax
  0x01f28aba: mov    esi,esp
  0x01f28abc: sub    esp,0x1c
  0x01f28abf: mov    DWORD PTR [esp+0x18],ecx
  0x01f28ac3: mov    DWORD PTR [esp+0x14],edx
  0x01f28ac7: mov    edi,DWORD PTR [esp+0x1c]
  0x01f28acb: mov    DWORD PTR [esp+0xc],edi
  0x01f28acf: mov    edi,DWORD PTR [esp+0x20]
  0x01f28ad3: mov    DWORD PTR [esp+0x10],edi
  0x01f28ad7: mov    edi,DWORD PTR [esp+0x24]
  0x01f28adb: mov    DWORD PTR [esp+0x8],edi
  0x01f28adf: mov    edi,DWORD PTR [esp+0x28]
  0x01f28ae3: mov    DWORD PTR [esp+0x4],edi
  0x01f28ae7: mov    edi,DWORD PTR [esp+0x2c]
  0x01f28aeb: mov    DWORD PTR [esp],edi
  0x01f28aee: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f28af1: push   eax
  0x01f28af2: jmp    ecx

AHE@0x0422c610: 0xa7ea0000 i2c: 0x01f28b70 c2i: 0x01f28c1e c2iUV: 0x01f28bfd
i2c argument handler #75 for: receiver (DI)Ljava/lang/String; (257 bytes generated)
c2i argument handler starts at 01F28C1E
  0x01f28b70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f28b73: mov    edi,0x1dc2940
  0x01f28b78: cmp    eax,edi
  0x01f28b7a: jbe    0x01f28b8d
  0x01f28b80: mov    edi,0x1ea2940
  0x01f28b85: cmp    eax,edi
  0x01f28b87: jb     0x01f28bd2
  0x01f28b8d: mov    edi,0x1dc0340
  0x01f28b92: cmp    eax,edi
  0x01f28b94: jbe    0x01f28ba7
  0x01f28b9a: mov    edi,0x1dc2668
  0x01f28b9f: cmp    eax,edi
  0x01f28ba1: jb     0x01f28bd2
  0x01f28ba7: mov    edi,0x1ead380
  0x01f28bac: cmp    eax,edi
  0x01f28bae: jbe    0x01f28bc1
  0x01f28bb4: mov    edi,0x1eb2970
  0x01f28bb9: cmp    eax,edi
  0x01f28bbb: jb     0x01f28bd2
  ;; i2c adapter must return to an interpreter frame
  0x01f28bc1: push   0x5531723c
  0x01f28bc6: call   0x01f28bcb
  0x01f28bcb: pusha  
  0x01f28bcc: call   0x54dedbf0
  0x01f28bd1: hlt    
  ;; } verify_i2ce 
  0x01f28bd2: mov    edi,esp
  0x01f28bd4: and    esp,0xfffffff0
  0x01f28bd7: push   eax
  0x01f28bd8: mov    eax,edi
  0x01f28bda: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f28bdd: mov    ecx,DWORD PTR [eax+0x10]
  0x01f28be0: movsd  xmm0,QWORD PTR [eax+0x8]
  0x01f28be5: mov    edx,DWORD PTR [eax+0x4]
  0x01f28be8: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f28bf0: mov    eax,DWORD PTR [eax-0xc]
  0x01f28bf3: mov    DWORD PTR [eax+0x168],ebx
  0x01f28bf9: mov    eax,ebx
  0x01f28bfb: jmp    edi
  0x01f28bfd: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f28c00: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f28c03: mov    ebx,DWORD PTR [eax+0x4]
  0x01f28c06: jne    0x01f28c19
  0x01f28c0c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28c13: je     0x01f28c58
  0x01f28c19: jmp    0x01ea32d0
  0x01f28c1e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28c25: je     0x01f28c58
  0x01f28c2b: mov    eax,DWORD PTR [esp]
  0x01f28c2e: pusha  
  0x01f28c2f: pushf  
  0x01f28c30: sub    esp,0x10
  0x01f28c33: movsd  QWORD PTR [esp],xmm0
  0x01f28c38: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f28c3e: push   eax
  0x01f28c3f: push   ebx
  0x01f28c40: call   0x552179d0
  0x01f28c45: add    esp,0x8
  0x01f28c48: movsd  xmm0,QWORD PTR [esp]
  0x01f28c4d: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f28c53: add    esp,0x10
  0x01f28c56: popf   
  0x01f28c57: popa   
  0x01f28c58: pop    eax
  0x01f28c59: mov    esi,esp
  0x01f28c5b: sub    esp,0x10
  0x01f28c5e: mov    DWORD PTR [esp+0xc],ecx
  0x01f28c62: movsd  QWORD PTR [esp+0x4],xmm0
  0x01f28c68: mov    DWORD PTR [esp],edx
  0x01f28c6b: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f28c6e: push   eax
  0x01f28c6f: jmp    ecx

AHE@0x0422c63c: 0xa6a00000 i2c: 0x01f28cf0 c2i: 0x01f28d9e c2iUV: 0x01f28d7d
i2c argument handler #76 for: receiver (FLjava/util/Locale;)V (257 bytes generated)
c2i argument handler starts at 01F28D9E
  0x01f28cf0: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f28cf3: mov    edi,0x1dc2940
  0x01f28cf8: cmp    eax,edi
  0x01f28cfa: jbe    0x01f28d0d
  0x01f28d00: mov    edi,0x1ea2940
  0x01f28d05: cmp    eax,edi
  0x01f28d07: jb     0x01f28d52
  0x01f28d0d: mov    edi,0x1dc0340
  0x01f28d12: cmp    eax,edi
  0x01f28d14: jbe    0x01f28d27
  0x01f28d1a: mov    edi,0x1dc2668
  0x01f28d1f: cmp    eax,edi
  0x01f28d21: jb     0x01f28d52
  0x01f28d27: mov    edi,0x1ead380
  0x01f28d2c: cmp    eax,edi
  0x01f28d2e: jbe    0x01f28d41
  0x01f28d34: mov    edi,0x1eb2970
  0x01f28d39: cmp    eax,edi
  0x01f28d3b: jb     0x01f28d52
  ;; i2c adapter must return to an interpreter frame
  0x01f28d41: push   0x5531723c
  0x01f28d46: call   0x01f28d4b
  0x01f28d4b: pusha  
  0x01f28d4c: call   0x54dedbf0
  0x01f28d51: hlt    
  ;; } verify_i2ce 
  0x01f28d52: mov    edi,esp
  0x01f28d54: and    esp,0xfffffff0
  0x01f28d57: push   eax
  0x01f28d58: mov    eax,edi
  0x01f28d5a: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f28d5d: mov    ecx,DWORD PTR [eax+0xc]
  0x01f28d60: movss  xmm0,DWORD PTR [eax+0x8]
  0x01f28d65: mov    edx,DWORD PTR [eax+0x4]
  0x01f28d68: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f28d70: mov    eax,DWORD PTR [eax-0xc]
  0x01f28d73: mov    DWORD PTR [eax+0x168],ebx
  0x01f28d79: mov    eax,ebx
  0x01f28d7b: jmp    edi
  0x01f28d7d: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f28d80: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f28d83: mov    ebx,DWORD PTR [eax+0x4]
  0x01f28d86: jne    0x01f28d99
  0x01f28d8c: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28d93: je     0x01f28dd8
  0x01f28d99: jmp    0x01ea32d0
  0x01f28d9e: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28da5: je     0x01f28dd8
  0x01f28dab: mov    eax,DWORD PTR [esp]
  0x01f28dae: pusha  
  0x01f28daf: pushf  
  0x01f28db0: sub    esp,0x10
  0x01f28db3: movsd  QWORD PTR [esp],xmm0
  0x01f28db8: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f28dbe: push   eax
  0x01f28dbf: push   ebx
  0x01f28dc0: call   0x552179d0
  0x01f28dc5: add    esp,0x8
  0x01f28dc8: movsd  xmm0,QWORD PTR [esp]
  0x01f28dcd: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f28dd3: add    esp,0x10
  0x01f28dd6: popf   
  0x01f28dd7: popa   
  0x01f28dd8: pop    eax
  0x01f28dd9: mov    esi,esp
  0x01f28ddb: sub    esp,0xc
  0x01f28dde: mov    DWORD PTR [esp+0x8],ecx
  0x01f28de2: movss  DWORD PTR [esp+0x4],xmm0
  0x01f28de8: mov    DWORD PTR [esp],edx
  0x01f28deb: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f28dee: push   eax
  0x01f28def: jmp    ecx

AHE@0x0422c668: 0xaa7eaaaaa0000000 i2c: 0x01f28e70 c2i: 0x01f28f44 c2iUV: 0x01f28f23
i2c argument handler #77 for: receiver (Ljava/lang/StringBuilder;DLjava/util/Locale;Ljava/util/Formatter$Flags;CIZ)V (335 bytes generated)
c2i argument handler starts at 01F28F44
  0x01f28e70: mov    eax,DWORD PTR [esp]
  ;; verify_i2c { 
  0x01f28e73: mov    edi,0x1dc2940
  0x01f28e78: cmp    eax,edi
  0x01f28e7a: jbe    0x01f28e8d
  0x01f28e80: mov    edi,0x1ea2940
  0x01f28e85: cmp    eax,edi
  0x01f28e87: jb     0x01f28ed2
  0x01f28e8d: mov    edi,0x1dc0340
  0x01f28e92: cmp    eax,edi
  0x01f28e94: jbe    0x01f28ea7
  0x01f28e9a: mov    edi,0x1dc2668
  0x01f28e9f: cmp    eax,edi
  0x01f28ea1: jb     0x01f28ed2
  0x01f28ea7: mov    edi,0x1ead380
  0x01f28eac: cmp    eax,edi
  0x01f28eae: jbe    0x01f28ec1
  0x01f28eb4: mov    edi,0x1eb2970
  0x01f28eb9: cmp    eax,edi
  0x01f28ebb: jb     0x01f28ed2
  ;; i2c adapter must return to an interpreter frame
  0x01f28ec1: push   0x5531723c
  0x01f28ec6: call   0x01f28ecb
  0x01f28ecb: pusha  
  0x01f28ecc: call   0x54dedbf0
  0x01f28ed1: hlt    
  ;; } verify_i2ce 
  0x01f28ed2: mov    edi,esp
  0x01f28ed4: sub    esp,0x18
  0x01f28ed7: and    esp,0xfffffff0
  0x01f28eda: push   eax
  0x01f28edb: mov    eax,edi
  0x01f28edd: mov    edi,DWORD PTR [ebx+0x2c]
  0x01f28ee0: mov    ecx,DWORD PTR [eax+0x24]
  0x01f28ee3: mov    edx,DWORD PTR [eax+0x20]
  0x01f28ee6: movsd  xmm0,QWORD PTR [eax+0x18]
  0x01f28eeb: mov    esi,DWORD PTR [eax+0x14]
  0x01f28eee: mov    DWORD PTR [esp+0x4],esi
  0x01f28ef2: mov    esi,DWORD PTR [eax+0x10]
  0x01f28ef5: mov    DWORD PTR [esp+0x8],esi
  0x01f28ef9: mov    esi,DWORD PTR [eax+0xc]
  0x01f28efc: mov    DWORD PTR [esp+0xc],esi
  0x01f28f00: mov    esi,DWORD PTR [eax+0x8]
  0x01f28f03: mov    DWORD PTR [esp+0x10],esi
  0x01f28f07: mov    esi,DWORD PTR [eax+0x4]
  0x01f28f0a: mov    DWORD PTR [esp+0x14],esi
  0x01f28f0e: mov    eax,DWORD PTR fs:[eiz*1+0x0]
  0x01f28f16: mov    eax,DWORD PTR [eax-0xc]
  0x01f28f19: mov    DWORD PTR [eax+0x168],ebx
  0x01f28f1f: mov    eax,ebx
  0x01f28f21: jmp    edi
  0x01f28f23: mov    ebx,DWORD PTR [ecx+0x4]
  0x01f28f26: cmp    ebx,DWORD PTR [eax+0x8]
  0x01f28f29: mov    ebx,DWORD PTR [eax+0x4]
  0x01f28f2c: jne    0x01f28f3f
  0x01f28f32: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28f39: je     0x01f28f7e
  0x01f28f3f: jmp    0x01ea32d0
  0x01f28f44: cmp    DWORD PTR [ebx+0x30],0x0
  0x01f28f4b: je     0x01f28f7e
  0x01f28f51: mov    eax,DWORD PTR [esp]
  0x01f28f54: pusha  
  0x01f28f55: pushf  
  0x01f28f56: sub    esp,0x10
  0x01f28f59: movsd  QWORD PTR [esp],xmm0
  0x01f28f5e: movsd  QWORD PTR [esp+0x8],xmm1
  0x01f28f64: push   eax
  0x01f28f65: push   ebx
  0x01f28f66: call   0x552179d0
  0x01f28f6b: add    esp,0x8
  0x01f28f6e: movsd  xmm0,QWORD PTR [esp]
  0x01f28f73: movsd  xmm1,QWORD PTR [esp+0x8]
  0x01f28f79: add    esp,0x10
  0x01f28f7c: popf   
  0x01f28f7d: popa   
  0x01f28f7e: pop    eax
  0x01f28f7f: mov    esi,esp
  0x01f28f81: sub    esp,0x24
  0x01f28f84: mov    DWORD PTR [esp+0x20],ecx
  0x01f28f88: mov    DWORD PTR [esp+0x1c],edx
  0x01f28f8c: movsd  QWORD PTR [esp+0x14],xmm0
  0x01f28f92: mov    edi,DWORD PTR [esp+0x24]
  0x01f28f96: mov    DWORD PTR [esp+0x10],edi
  0x01f28f9a: mov    edi,DWORD PTR [esp+0x28]
  0x01f28f9e: mov    DWORD PTR [esp+0xc],edi
  0x01f28fa2: mov    edi,DWORD PTR [esp+0x2c]
  0x01f28fa6: mov    DWORD PTR [esp+0x8],edi
  0x01f28faa: mov    edi,DWORD PTR [esp+0x30]
  0x01f28fae: mov    DWORD PTR [esp+0x4],edi
  0x01f28fb2: mov    edi,DWORD PTR [esp+0x34]
  0x01f28fb6: mov    DWORD PTR [esp],edi
  0x01f28fb9: mov    ecx,DWORD PTR [ebx+0x24]
  0x01f28fbc: push   eax
  0x01f28fbd: jmp    ecx
