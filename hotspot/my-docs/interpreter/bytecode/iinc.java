iinc  132 iinc  [0x01cc0cc0, 0x01cc0d30]  112 bytes

  0x01cc0cc0: sub    $0x4,%esp
  0x01cc0cc3: fstps  (%esp)
  0x01cc0cc6: jmp    0x01cc0ce4
  0x01cc0ccb: sub    $0x8,%esp
  0x01cc0cce: fstpl  (%esp)
  0x01cc0cd1: jmp    0x01cc0ce4
  0x01cc0cd6: push   %edx
  0x01cc0cd7: push   %eax
  0x01cc0cd8: jmp    0x01cc0ce4
  0x01cc0cdd: push   %eax
  0x01cc0cde: jmp    0x01cc0ce4
  0x01cc0ce3: push   %eax

  //直接跳到这里
  //指令格式: iinc  0, 1
  0x01cc0ce4: movsbl 0x2(%esi),%edx //是1
  0x01cc0ce8: movzbl 0x1(%esi),%ebx //是0 局部变量的slot位置
      //    [ (%esp)               ] <--- rsp  //reserve word for pointer to expression stack bottom
	  //    [ 第一个字节码内存地址 ]
	  //    [ argument word 1 所在堆栈位置 ]
	  //    [ ConstantPoolCache    ]
	  //    [ 0                    ] <--- rax
	  //    [ method               ]
	  //    [ 0                    ]
	  //    [ argument word n 所在堆栈位置 ]
	  //    [ saved rbp,           ] <--- rbp,
	  
	  //    [ return_from_Java     ] 
	  //    [ 0                    ] 总共_max_locals - _size_of_parameters个0
	  //      ...
	  //    [ 0                    ]
	  //    [ 0                    ]
	  //    [ argument word n      ]
	  //      ...
	  // -N [ argument word 1      ]
  0x01cc0cec: neg    %ebx //edi是往下的，取负值
  0x01cc0cee: add    %edx,(%edi,%ebx,4)
  0x01cc0cf1: movzbl 0x3(%esi),%ebx //iinc占用３字节
  0x01cc0cf5: add    $0x3,%esi
  0x01cc0cf8: jmp    *0x55629838(,%ebx,4)


  0x01cc0cff: mov    0x4(%esi),%edx
  0x01cc0d02: movzwl 0x2(%esi),%ebx
  0x01cc0d06: bswap  %ebx
  0x01cc0d08: shr    $0x10,%ebx
  0x01cc0d0b: neg    %ebx
  0x01cc0d0d: bswap  %edx
  0x01cc0d0f: sar    $0x10,%edx
  0x01cc0d12: add    %edx,(%edi,%ebx,4)
  0x01cc0d15: movzbl 0x6(%esi),%ebx
  0x01cc0d19: add    $0x6,%esi
  0x01cc0d1c: jmp    *0x55629838(,%ebx,4)
  0x01cc0d23: nop    
  0x01cc0d24: int3   
  0x01cc0d25: int3   
  0x01cc0d26: int3   
  0x01cc0d27: int3   
  0x01cc0d28: int3   
  0x01cc0d29: int3   
  0x01cc0d2a: int3   
  0x01cc0d2b: int3   
  0x01cc0d2c: int3   
  0x01cc0d2d: int3   
  0x01cc0d2e: int3   
  0x01cc0d2f: int3   