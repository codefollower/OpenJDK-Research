putstatic  179 putstatic  [0x01cc5000, 0x01cc5210]  528 bytes

  0x01cc5000: sub    $0x4,%esp
  0x01cc5003: fstps  (%esp)
  0x01cc5006: jmp    0x01cc5024
  0x01cc500b: sub    $0x8,%esp
  0x01cc500e: fstpl  (%esp)
  0x01cc5011: jmp    0x01cc5024
  0x01cc5016: push   %edx
  0x01cc5017: push   %eax
  0x01cc5018: jmp    0x01cc5024
  0x01cc501d: push   %eax
  0x01cc501e: jmp    0x01cc5024
  0x01cc5023: push   %eax

  //---begin TemplateTable::resolve_cache_and_index
	  //---begin InterpreterMacroAssembler::get_cache_and_index_and_bytecode_at_bcp
		  //---begin InterpreterMacroAssembler::get_cache_and_index_at_bcp
		  0x01cc5024: movzwl 0x1(%esi),%edx //putstatic后面的indexbyte1和indexbyte2
		  0x01cc5028: mov    -0x14(%ebp),%ecx //ConstantPoolCache *
		  0x01cc502b: shl    $0x2,%edx // convert from field index to ConstantPoolCacheEntry index
		  //---end   InterpreterMacroAssembler::get_cache_and_index_at_bcp

		  0x01cc502e: mov    0x8(%ecx,%edx,4),%ebx
		  0x01cc5032: shr    $0x18,%ebx
		  0x01cc5035: and    $0xff,%ebx
	  //---end   InterpreterMacroAssembler::get_cache_and_index_and_bytecode_at_bcp

	  0x01cc503b: cmp    $0xb3,%ebx
	  0x01cc5041: je     0x01cc50f4

	  0x01cc5047: mov    $0xb3,%ebx

	  //---begin MacroAssembler::call_VM InterpreterRuntime::resolve_get_put
		  0x01cc504c: call   0x01cc5056
		  0x01cc5051: jmp    0x01cc50ea
		  0x01cc5056: push   %ebx
		  0x01cc5057: lea    0x8(%esp),%eax
		  0x01cc505b: cmpl   $0x0,-0x8(%ebp)
		  0x01cc5062: je     0x01cc5079
		  0x01cc5068: push   $0x55310188
		  0x01cc506d: call   0x01cc5072
		  0x01cc5072: pusha  
		  0x01cc5073: call   0x54dedbf0
		  0x01cc5078: hlt    
		  0x01cc5079: mov    %esi,-0x1c(%ebp)
		  0x01cc507c: mov    %fs:0x0(,%eiz,1),%edi
		  0x01cc5084: mov    -0xc(%edi),%edi
		  0x01cc5087: push   %edi
		  0x01cc5088: mov    %ebp,0x144(%edi)
		  0x01cc508e: mov    %eax,0x13c(%edi)
		  0x01cc5094: call   0x5505a590
		  0x01cc5099: add    $0x8,%esp
		  0x01cc509c: push   %eax
		  0x01cc509d: mov    %fs:0x0(,%eiz,1),%eax
		  0x01cc50a5: mov    -0xc(%eax),%eax
		  0x01cc50a8: cmp    %eax,%edi
		  0x01cc50aa: je     0x01cc50c1
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x01cc50b0: push   $0x55312af0
		  0x01cc50b5: call   0x01cc50ba
		  0x01cc50ba: pusha  
		  0x01cc50bb: call   0x54dedbf0
		  0x01cc50c0: hlt    
		  0x01cc50c1: pop    %eax
		  0x01cc50c2: movl   $0x0,0x13c(%edi)
		  0x01cc50cc: movl   $0x0,0x144(%edi)
		  0x01cc50d6: cmpl   $0x0,0x4(%edi)
		  0x01cc50dd: jne    0x01cb0340
		  0x01cc50e3: mov    -0x1c(%ebp),%esi
		  0x01cc50e6: mov    -0x18(%ebp),%edi
		  0x01cc50e9: ret    
	  //---end   MacroAssembler::call_VM InterpreterRuntime::resolve_get_put


	  //同上
	  //---begin InterpreterMacroAssembler::get_cache_and_index_at_bcp
	  0x01cc50ea: movzwl 0x1(%esi),%edx
	  0x01cc50ee: mov    -0x14(%ebp),%ecx
	  0x01cc50f1: shl    $0x2,%edx
	  //---end   InterpreterMacroAssembler::get_cache_and_index_at_bcp
  //---end   TemplateTable::resolve_cache_and_index


  //如果通过JVMTI启用了字段访问就会多加下面这一段汇编，这里没有显示出来
  //---begin jvmti_post_field_mod(cache, index, is_static);
  //......
  //---end   jvmti_post_field_mod(cache, index, is_static);


  //---begin TemplateTable::load_field_cp_cache_entry
	  0x01cc50f4: mov    0x10(%ecx,%edx,4),%ebx // Field offset
	  0x01cc50f8: mov    0x14(%ecx,%edx,4),%eax // Flags
	  0x01cc50fc: mov    0xc(%ecx,%edx,4),%ecx  // klass overwrite register
	  0x01cc5100: mov    0x3c(%ecx),%ecx //klass._java_mirror
  //---end   TemplateTable::load_field_cp_cache_entry

  0x01cc5103: mov    %eax,%edx
  0x01cc5105: shr    $0x15,%edx
  0x01cc5108: and    $0x1,%edx //field is volatile

  0x01cc510b: shr    $0x1c,%eax //tos
  0x01cc510e: and    $0xf,%eax
  0x01cc5111: jne    0x01cc5120

  // btos
  0x01cc5117: pop    %eax //操作数
  0x01cc5118: mov    %al,(%ecx,%ebx,1)
  0x01cc511b: jmp    0x01cc51ea

  // itos
  0x01cc5120: cmp    $0x3,%eax
  0x01cc5123: jne    0x01cc5132

  0x01cc5129: pop    %eax
  0x01cc512a: mov    %eax,(%ecx,%ebx,1)
  0x01cc512d: jmp    0x01cc51ea

  // atos
  0x01cc5132: cmp    $0x7,%eax
  0x01cc5135: jne    0x01cc514f
  0x01cc513b: pop    %eax
  //do_oop_store
  0x01cc513c: mov    %eax,(%ecx,%ebx,1)
  0x01cc513f: shr    $0x9,%ecx //store_check_part_1

  0x01cc5142: movb   $0x0,0x12c7000(,%ecx,1) //store_check_part_2
  0x01cc514a: jmp    0x01cc51ea

  0x01cc514f: cmp    $0x1,%eax
  0x01cc5152: jne    0x01cc5162

  // ctos
  0x01cc5158: pop    %eax
  0x01cc5159: mov    %ax,(%ecx,%ebx,1)
  0x01cc515d: jmp    0x01cc51ea

  0x01cc5162: cmp    $0x2,%eax
  0x01cc5165: jne    0x01cc5175

  // stos
  0x01cc516b: pop    %eax
  0x01cc516c: mov    %ax,(%ecx,%ebx,1)
  0x01cc5170: jmp    0x01cc51ea

  0x01cc5175: cmp    $0x4,%eax
  0x01cc5178: jne    0x01cc51ab

  // ltos
  0x01cc517e: test   %edx,%edx
  0x01cc5180: je     0x01cc519d
  0x01cc5186: pop    %eax
  0x01cc5187: pop    %edx
  0x01cc5188: push   %edx
  0x01cc5189: push   %eax // Must update atomically with FIST

  0x01cc518a: fildll (%esp) // So load into FPU register
  0x01cc518d: fistpll (%ecx,%ebx,1) // and put into memory atomically
  0x01cc5190: add    $0x8,%esp

  0x01cc5193: lock addl $0x0,(%esp) //TemplateTable::volatile_barrier
  
  // Don't rewrite volatile version
  0x01cc5198: jmp    0x01cc51f7

  0x01cc519d: pop    %eax
  0x01cc519e: pop    %edx
  0x01cc519f: mov    %edx,0x4(%ecx,%ebx,1)
  0x01cc51a3: mov    %eax,(%ecx,%ebx,1)
  0x01cc51a6: jmp    0x01cc51f7

  0x01cc51ab: cmp    $0x5,%eax
  0x01cc51ae: jne    0x01cc51c2

  // ftos
  //下面两条在InterpreterMacroAssembler::pop_f()中
  0x01cc51b4: flds   (%esp)
  0x01cc51b7: add    $0x4,%esp

  0x01cc51ba: fstps  (%ecx,%ebx,1)
  0x01cc51bd: jmp    0x01cc51ea

  0x01cc51c2: cmp    $0x6,%eax
  0x01cc51c5: jne    0x01cc51d9

  // dtos
  0x01cc51cb: fldl   (%esp)
  0x01cc51ce: add    $0x8,%esp

  0x01cc51d1: fstpl  (%ecx,%ebx,1)
  0x01cc51d4: jmp    0x01cc51ea

  //stop("Bad state");
  0x01cc51d9: push   $0x5531a870
  0x01cc51de: call   0x01cc51e3
  0x01cc51e3: pusha  
  0x01cc51e4: call   0x54dedbf0
  0x01cc51e9: hlt    

  0x01cc51ea: test   %edx,%edx
  0x01cc51ec: je     0x01cc51f7

  0x01cc51f2: lock addl $0x0,(%esp) //volatile_barrier

  0x01cc51f7: movzbl 0x3(%esi),%ebx
  0x01cc51fb: add    $0x3,%esi
  0x01cc51fe: jmp    *0x55629838(,%ebx,4)
  0x01cc5205: nop    
  0x01cc5206: nop    
  0x01cc5207: nop    
  0x01cc5208: int3   
  0x01cc5209: int3   
  0x01cc520a: int3   
  0x01cc520b: int3   
  0x01cc520c: int3   
  0x01cc520d: int3   
  0x01cc520e: int3   
  0x01cc520f: int3   

