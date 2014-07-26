istore_0  59 istore_0  [0x01cbfbb0, 0x01cbfbc0]  16 bytes

  0x01cbfbb0: pop    %eax

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

  //直接跳到这里
  0x01cbfbb1: mov    %eax,(%edi) //%edi指向上面堆栈return_from_Java下面那一项

  0x01cbfbb3: movzbl 0x1(%esi),%ebx
  0x01cbfbb7: inc    %esi
  0x01cbfbb8: jmp    *0x55629838(,%ebx,4)
  0x01cbfbbf: nop    
