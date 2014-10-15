invokeinterface  185 invokeinterface  [0x07f181b0, 0x07f184f0]  832 bytes

  0x07f181b0: sub    $0x4,%esp
  0x07f181b3: fstps  (%esp)
  0x07f181b6: jmp    0x07f181d4
  0x07f181bb: sub    $0x8,%esp
  0x07f181be: fstpl  (%esp)
  0x07f181c1: jmp    0x07f181d4
  0x07f181c6: push   %edx
  0x07f181c7: push   %eax
  0x07f181c8: jmp    0x07f181d4
  0x07f181cd: push   %eax
  0x07f181ce: jmp    0x07f181d4
  0x07f181d3: push   %eax


  //---begin prepare_invoke
	  0x07f181d4: mov    %esi,-0x1c(%ebp) //%esi的值是invokeinterface字节码在内存中的地址，把这个地址保持到当前栈帧
	  0x07f181d7: movzwl 0x1(%esi),%edx //跟在invokeinterface后的两个字节是indexbyte1、indexbyte2
	  0x07f181db: mov    -0x14(%ebp),%ecx //ConstantPoolCache
	  0x07f181de: shl    $0x2,%edx
	  0x07f181e1: mov    0x8(%ecx,%edx,4),%ebx
	  0x07f181e5: shr    $0x10,%ebx
	  0x07f181e8: and    $0xff,%ebx

	  0x07f181ee: cmp    $0xb9,%ebx
	  0x07f181f4: je     0x07f182a7

	  0x07f181fa: mov    $0xb9,%ebx

      //---begin InterpreterRuntime::resolve_invoke
		  0x07f181ff: call   0x07f18209
		  0x07f18204: jmp    0x07f1829d
		  0x07f18209: push   %ebx
		  0x07f1820a: lea    0x8(%esp),%eax
		  0x07f1820e: cmpl   $0x0,-0x8(%ebp)
		  0x07f18215: je     0x07f1822c
		  0x07f1821b: push   $0x5926a9d4
		  0x07f18220: call   0x07f18225
		  0x07f18225: pusha  
		  0x07f18226: call   0x58d2df50
		  0x07f1822b: hlt    
		  0x07f1822c: mov    %esi,-0x1c(%ebp)
		  0x07f1822f: mov    %fs:0x0(,%eiz,1),%edi
		  0x07f18237: mov    -0xc(%edi),%edi
		  0x07f1823a: push   %edi
		  0x07f1823b: mov    %ebp,0x144(%edi)
		  0x07f18241: mov    %eax,0x13c(%edi)
		  0x07f18247: call   0x58fada20
		  0x07f1824c: add    $0x8,%esp
		  0x07f1824f: push   %eax
		  0x07f18250: mov    %fs:0x0(,%eiz,1),%eax
		  0x07f18258: mov    -0xc(%eax),%eax
		  0x07f1825b: cmp    %eax,%edi
		  0x07f1825d: je     0x07f18274
		  ;; MacroAssembler::call_VM_base: rdi not callee saved?
		  0x07f18263: push   $0x5926d0e8
		  0x07f18268: call   0x07f1826d
		  0x07f1826d: pusha  
		  0x07f1826e: call   0x58d2df50
		  0x07f18273: hlt    
		  0x07f18274: pop    %eax
		  0x07f18275: movl   $0x0,0x13c(%edi)
		  0x07f1827f: movl   $0x0,0x144(%edi)
		  0x07f18289: cmpl   $0x0,0x4(%edi)
		  0x07f18290: jne    0x07f00380
		  0x07f18296: mov    -0x1c(%ebp),%esi
		  0x07f18299: mov    -0x18(%ebp),%edi
		  0x07f1829c: ret
	  //---end   InterpreterRuntime::resolve_invoke

	  0x07f1829d: movzwl 0x1(%esi),%edx
	  0x07f182a1: mov    -0x14(%ebp),%ecx
	  0x07f182a4: shl    $0x2,%edx

	  0x07f182a7: mov    0xc(%ecx,%edx,4),%eax  //_f1
	  0x07f182ab: mov    0x10(%ecx,%edx,4),%ebx //_f2
	  0x07f182af: mov    0x14(%ecx,%edx,4),%edx //_flags
	  0x07f182b3: mov    %edx,%ecx
	  0x07f182b5: and    $0xff,%ecx //方法参数个数
	  0x07f182bb: mov    -0x4(%esp,%ecx,4),%ecx  //this指针存放在堆栈的位置，总是这第一个参数
	  0x07f182bf: mov    %edx,%esi
	  0x07f182c1: shr    $0x1c,%edx // compute return type
	  0x07f182c4: mov    0x59595460(,%edx,4),%edx // load return address
	  0x07f182cb: push   %edx // push return address
	  0x07f182cc: mov    %esi,%edx
	  0x07f182ce: mov    -0x1c(%ebp),%esi //invokeinterface字节码在内存中的地址，见上面(---begin prepare_invoke)
  //---end   prepare_invoke


  0x07f182d1: mov    %edx,%edi //_flags
  0x07f182d3: and    $0x800000,%edi //is_forced_virtual
  0x07f182d9: je     0x07f1830d

  //---begin invokevirtual_helper
	  0x07f182df: mov    %edx,%eax
	  0x07f182e1: and    $0x100000,%eax //is_vfinal
	  0x07f182e7: je     0x07f182f9

	  0x07f182ed: cmp    (%ecx),%eax
	  0x07f182ef: lea    0x4(%esp),%esi
	  0x07f182f3: mov    %esi,-0x8(%ebp)
	  0x07f182f6: jmp    *0x34(%ebx)

	  0x07f182f9: mov    0x4(%ecx),%eax //load_klass
	  0x07f182fc: mov    0x108(%eax,%ebx,4),%ebx //lookup_virtual_method
	  //jump_from_interpreted
	  0x07f18303: lea    0x4(%esp),%esi
	  0x07f18307: mov    %esi,-0x8(%ebp)
	  0x07f1830a: jmp    *0x34(%ebx)
  //---end   invokevirtual_helper


  0x07f1830d: mov    -0x18(%ebp),%edi //restore_locals
  0x07f18310: mov    0x4(%ecx),%edx //load_klass，this指针所指向的对象的类(偏移是4，因为mark word在前面，占了4字节)

  //---begin lookup_interface_method
	  0x07f18313: mov    0xb0(%edx),%esi //vtable_length
	  0x07f18319: lea    0x108(%edx,%esi,4),%esi
	  0x07f18320: add    $0x7,%esi
	  0x07f18323: and    $0xfffffff8,%esi
	  0x07f18326: lea    (%edx,%ebx,4),%edx

	  //第一次for
	  0x07f18329: mov    (%esi),%ebx //itableOffsetEntry::interface_offset
	  0x07f1832b: cmp    %ebx,%eax
	  0x07f1832d: je     0x07f18340
	  0x07f1832f: test   %ebx,%ebx
	  0x07f18331: je     0x07f1841e
	  0x07f18337: add    $0x8,%esi

	  //第2次for
	  0x07f1833a: mov    (%esi),%ebx
	  0x07f1833c: cmp    %ebx,%eax
	  0x07f1833e: jne    0x07f1832f

	  // Got a hit.
	  0x07f18340: mov    0x4(%esi),%esi
	  0x07f18343: mov    (%edx,%esi,1),%ebx
  //---end   lookup_interface_method

  0x07f18346: test   %ebx,%ebx
  0x07f18348: je     0x07f18369

  //jump_from_interpreted
  0x07f1834e: lea    0x4(%esp),%esi // set sender sp
  0x07f18352: mov    %esi,-0x8(%ebp) // record last_sp
  0x07f18355: jmp    *0x34(%ebx)

  //should_not_reach_her
  0x07f18358: push   $0x59257db8
  0x07f1835d: call   0x07f18362
  0x07f18362: pusha  
  0x07f18363: call   0x58d2df50
  0x07f18368: hlt 
  
  0x07f18369: pop    %ebx
  0x07f1836a: mov    -0x1c(%ebp),%esi
  0x07f1836d: mov    -0x18(%ebp),%edi

  //---begin InterpreterRuntime::throw_AbstractMethodError
	  0x07f18370: call   0x07f1837a
	  0x07f18375: jmp    0x07f1840d
	  0x07f1837a: lea    0x4(%esp),%eax
	  0x07f1837e: cmpl   $0x0,-0x8(%ebp)
	  0x07f18385: je     0x07f1839c
	  0x07f1838b: push   $0x5926a9d4
	  0x07f18390: call   0x07f18395
	  0x07f18395: pusha  
	  0x07f18396: call   0x58d2df50
	  0x07f1839b: hlt    
	  0x07f1839c: mov    %esi,-0x1c(%ebp)
	  0x07f1839f: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f183a7: mov    -0xc(%edi),%edi
	  0x07f183aa: push   %edi
	  0x07f183ab: mov    %ebp,0x144(%edi)
	  0x07f183b1: mov    %eax,0x13c(%edi)
	  0x07f183b7: call   0x58fabb60
	  0x07f183bc: add    $0x4,%esp
	  0x07f183bf: push   %eax
	  0x07f183c0: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f183c8: mov    -0xc(%eax),%eax
	  0x07f183cb: cmp    %eax,%edi
	  0x07f183cd: je     0x07f183e4
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f183d3: push   $0x5926d0e8
	  0x07f183d8: call   0x07f183dd
	  0x07f183dd: pusha  
	  0x07f183de: call   0x58d2df50
	  0x07f183e3: hlt    
	  0x07f183e4: pop    %eax
	  0x07f183e5: movl   $0x0,0x13c(%edi)
	  0x07f183ef: movl   $0x0,0x144(%edi)
	  0x07f183f9: cmpl   $0x0,0x4(%edi)
	  0x07f18400: jne    0x07f00380
	  0x07f18406: mov    -0x1c(%ebp),%esi
	  0x07f18409: mov    -0x18(%ebp),%edi
	  0x07f1840c: ret  
  //---end   InterpreterRuntime::throw_AbstractMethodError

  //should_not_reach_here
  0x07f1840d: push   $0x59257db8
  0x07f18412: call   0x07f18417
  0x07f18417: pusha  
  0x07f18418: call   0x58d2df50
  0x07f1841d: hlt    

  0x07f1841e: pop    %ebx
  0x07f1841f: mov    -0x1c(%ebp),%esi
  0x07f18422: mov    -0x18(%ebp),%edi

  //---begin InterpreterRuntime::throw_IncompatibleClassChangeError
	  0x07f18425: call   0x07f1842f
	  0x07f1842a: jmp    0x07f184c2
	  0x07f1842f: lea    0x4(%esp),%eax
	  0x07f18433: cmpl   $0x0,-0x8(%ebp)
	  0x07f1843a: je     0x07f18451
	  0x07f18440: push   $0x5926a9d4
	  0x07f18445: call   0x07f1844a
	  0x07f1844a: pusha  
	  0x07f1844b: call   0x58d2df50
	  0x07f18450: hlt    
	  0x07f18451: mov    %esi,-0x1c(%ebp)
	  0x07f18454: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f1845c: mov    -0xc(%edi),%edi
	  0x07f1845f: push   %edi
	  0x07f18460: mov    %ebp,0x144(%edi)
	  0x07f18466: mov    %eax,0x13c(%edi)
	  0x07f1846c: call   0x58fabc90
	  0x07f18471: add    $0x4,%esp
	  0x07f18474: push   %eax
	  0x07f18475: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f1847d: mov    -0xc(%eax),%eax
	  0x07f18480: cmp    %eax,%edi
	  0x07f18482: je     0x07f18499
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f18488: push   $0x5926d0e8
	  0x07f1848d: call   0x07f18492
	  0x07f18492: pusha  
	  0x07f18493: call   0x58d2df50
	  0x07f18498: hlt    
	  0x07f18499: pop    %eax
	  0x07f1849a: movl   $0x0,0x13c(%edi)
	  0x07f184a4: movl   $0x0,0x144(%edi)
	  0x07f184ae: cmpl   $0x0,0x4(%edi)
	  0x07f184b5: jne    0x07f00380
	  0x07f184bb: mov    -0x1c(%ebp),%esi
	  0x07f184be: mov    -0x18(%ebp),%edi
	  0x07f184c1: ret    
  //---end   InterpreterRuntime::throw_IncompatibleClassChangeError

  //should_not_reach_here
  0x07f184c2: push   $0x59257db8
  0x07f184c7: call   0x07f184cc
  0x07f184cc: pusha  
  0x07f184cd: call   0x58d2df50
  0x07f184d2: hlt    

  //下面的对应TemplateInterpreterGenerator::generate_and_dispatch的should_not_reach_here();
  0x07f184d3: push   $0x59257db8
  0x07f184d8: call   0x07f184dd
  0x07f184dd: pusha  
  0x07f184de: call   0x58d2df50
  0x07f184e3: hlt    
  0x07f184e4: int3   
  0x07f184e5: int3   
  0x07f184e6: int3   
  0x07f184e7: int3   
  0x07f184e8: int3   
  0x07f184e9: int3   
  0x07f184ea: int3   
  0x07f184eb: int3   
  0x07f184ec: int3   
  0x07f184ed: int3   
  0x07f184ee: int3   
  0x07f184ef: int3   
