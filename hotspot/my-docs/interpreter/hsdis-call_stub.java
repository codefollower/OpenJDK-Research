  //堆栈方向与书上常见的相反
  //这里要从下往上看，下面的内存地址高，上面的小，每push一次rsp要减去4（左边的标号*4 + rbp就得到它的内存地址）
  //------------------------------------------------------------------------------------------------------------------------
  // Call stubs are used to call Java from C
  //    return_from_Java 是紧跟在call *%eax后面的那条指令的地址
  //    [ return_from_Java     ] <--- rsp
  //    [ argument word n      ]
  //      ...
  // -N [ argument word 1      ]
  // -7 [ Possible padding for stack alignment ]
  // -6 [ Possible padding for stack alignment ]
  // -5 [ Possible padding for stack alignment ]
  // -4 [ mxcsr save           ] <--- rsp_after_call
  // -3 [ saved rbx,            ]
  // -2 [ saved rsi            ]
  // -1 [ saved rdi            ]
  //  0 [ saved rbp,            ] <--- rbp,
  //  1 [ return address       ]
  //  2 [ ptr. to call wrapper ]
  //  3 [ result               ]
  //  4 [ result_type          ]
  //  5 [ method               ]
  //  6 [ entry_point          ]
  //  7 [ parameters           ]
  //  8 [ parameter_size       ]
  //  9 [ thread               ]

StubRoutines::call_stub [0x01dc03b4, 0x01dc0485[ (209 bytes)
  0x01dc03b4: push   %ebp
  0x01dc03b5: mov    %esp,%ebp

  //0x20(%ebp) = 从内存地址(%ebp的值(是一个内存地址) + 32(4*8, 正好是第8项))中取值
  //所以最后%ecx的值是parameter_size
  0x01dc03b7: mov    0x20(%ebp),%ecx
  //每个参数都占4个字节，所以把%ecx左移两位就算出所有的参数共占用多少字节
  0x01dc03ba: shl    $0x2,%ecx
  //$0x10是16，因为要保存rdi、rsi、rbx、mxcsr这4个寄存器的值，每个占4个字节，所以再加16
  0x01dc03bd: add    $0x10,%ecx
  //把%esp移动最后一个parameter位置
  0x01dc03c0: sub    %ecx,%esp
  //堆栈按16位对齐，这里去掉后4位，相当于减16，如果前面两条指令得到的字节数不够16的整数倍，这里就会减小%esp的值
  0x01dc03c2: and    $0xfffffff0,%esp

  //按惯例，被调用者(被call指令调用)要保存rdi、rsi、rbx这3个寄存器的值
  0x01dc03c5: mov    %edi,-0x4(%ebp)
  0x01dc03c8: mov    %esi,-0x8(%ebp)
  0x01dc03cb: mov    %ebx,-0xc(%ebp)

  //保存mxcsr寄存器的值
  0x01dc03ce: stmxcsr -0x10(%ebp)

  0x01dc03d2: mov    -0x10(%ebp),%eax
  0x01dc03d5: and    $0xffc0,%eax
  0x01dc03db: cmp    0x56005778,%eax
  0x01dc03e1: je     0x01dc03ee
  0x01dc03e7: ldmxcsr 0x56005778 //如果0x56005778(在数据段)中的值与%eax中的值不同，则把0x56005778中的值保存到mxcsr寄存器

  //对应CTRL寄存器
  0x01dc03ee: fldcw  0x56005768 //Loads the 16-bit source operand into the FPU control word.

  // make sure we have no pending exceptions
  0x01dc03f4: mov    0x24(%ebp),%ecx //对应thread
  0x01dc03f7: cmpl   $0x0,0x4(%ecx) //看看thread对象的_pending_exception字段是否为0，不为0就表示有pending exceptions
  0x01dc03fe: je     0x01dc0415
  //stop("StubRoutines::call_stub: entered with pending exception");
  0x01dc0404: push   $0x55ce7d38
  0x01dc0409: call   0x01dc040e
  0x01dc040e: pusha  
  0x01dc040f: call   0x557bdbf0
  0x01dc0414: hlt    

  ;; pass parameters if any
  0x01dc0415: mov    0x20(%ebp),%ecx
  0x01dc0418: test   %ecx,%ecx //parameter_size是0就直接跳过参数处理
  0x01dc041a: je     0x01dc0430
  0x01dc0420: mov    0x1c(%ebp),%edx //对应parameters
  0x01dc0423: xor    %ebx,%ebx //把%ebx设为0

  //从后往前遍历参数，然后放到堆栈中
  //parameters是个数组，所以parameters的内存地址就是第一个数组元素的地址，
  //第i(i>=0)个元素的地址 = parameters的内存地址 + i*4
  //因为%ecx是parameter_size, 按%ecx递减时算出的地址是多了４个字节的，所以要减去4，
  //比如parameters的内存地址是0x11223300，有3个数组元素，
  //那么每个数组元素的内存地址分别是
  //parameters[0] = 0x11223300 = parameters的内存地址 = %edx的值
  //parameters[1] = 0x11223304
  //parameters[2] = 0x11223308
  //此时%ecx = 3
  //从后往前遍历参数时，先计算第三个元素的内存地址
  //parameters[2] = %edx + %ecx*4 - 0x4 =  0x11223300 + 12 - 0x4 = 0x11223308
  //最后再把0x11223308中存放的值放到%eax
  ;; loop:
  0x01dc0425: mov    -0x4(%edx,%ecx,4),%eax
  0x01dc0429: mov    %eax,(%esp,%ebx,4)
  0x01dc042c: inc    %ebx
  0x01dc042d: dec    %ecx
  0x01dc042e: jne    0x01dc0425

  ;; parameters_done:
  //这两条很关键，%ebx中存放着method，
  //接下来就要重点关注method entry point (kind = zerolocals)如何使用%ebx
  0x01dc0430: mov    0x14(%ebp),%ebx //对应method
  0x01dc0433: mov    0x18(%ebp),%eax //对应entry_point
  0x01dc0436: mov    %esp,%esi
  ;; call Java function
  0x01dc0438: call   *%eax

  ;; call_stub_return_address:
  0x01dc043a: mov    0xc(%ebp),%edi  //result
  0x01dc043d: mov    0x10(%ebp),%esi //result_type

  0x01dc0440: cmp    $0xb,%esi
  0x01dc0443: je     0x01dc0472
  0x01dc0449: cmp    $0x6,%esi
  0x01dc044c: je     0x01dc0479
  0x01dc0452: cmp    $0x7,%esi
  0x01dc0455: je     0x01dc047f
  0x01dc045b: mov    %eax,(%edi)
  ;; exit:
  0x01dc045d: lea    -0x10(%ebp),%esp
  0x01dc0460: ldmxcsr -0x10(%ebp)
  0x01dc0464: mov    -0xc(%ebp),%ebx
  0x01dc0467: mov    -0x8(%ebp),%esi
  0x01dc046a: mov    -0x4(%ebp),%edi
  0x01dc046d: add    $0x10,%esp
  0x01dc0470: pop    %ebp
  0x01dc0471: ret    
  ;; is_long:
  0x01dc0472: mov    %eax,(%edi)
  0x01dc0474: mov    %edx,0x4(%edi)
  0x01dc0477: jmp    0x01dc045d
  ;; is_float:
  0x01dc0479: movss  %xmm0,(%edi)
  0x01dc047d: jmp    0x01dc045d
  ;; is_double:
  0x01dc047f: movsd  %xmm0,(%edi)
  0x01dc0483: jmp    0x01dc045d


//intel格式
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


