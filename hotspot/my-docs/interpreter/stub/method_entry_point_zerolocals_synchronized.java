//zerolocals_synchronized比zerolocals多了lock_method，其他的汇编一样
method entry point (kind = zerolocals_synchronized)  [0x07f0bdf0, 0x07f0c2f0]  1280 bytes
  //下面的代码跟zerolocals一样
	  0x07f0bdf0: mov    0x8(%ebx),%edx
	  0x07f0bdf3: movzwl 0x22(%edx),%ecx
	  0x07f0bdf7: movzwl 0x20(%edx),%edx
	  0x07f0bdfb: sub    %ecx,%edx
	  0x07f0bdfd: cmp    $0x3f6,%edx
	  0x07f0be03: jbe    0x07f0be83
	  0x07f0be09: push   %esi
	  0x07f0be0a: mov    %fs:0x0(,%eiz,1),%esi
	  0x07f0be12: mov    -0xc(%esi),%esi
	  0x07f0be15: lea    0x28(,%edx,4),%eax
	  0x07f0be1c: cmpl   $0x0,0xd4(%esi)
	  0x07f0be26: jne    0x07f0be3d
	  0x07f0be2c: push   $0x553191c4
	  0x07f0be31: call   0x07f0be36
	  0x07f0be36: pusha  
	  0x07f0be37: call   0x54dedbf0
	  0x07f0be3c: hlt    
	  0x07f0be3d: cmpl   $0x0,0xd8(%esi)
	  0x07f0be47: jne    0x07f0be5e
	  0x07f0be4d: push   $0x553191d8
	  0x07f0be52: call   0x07f0be57
	  0x07f0be57: pusha  
	  0x07f0be58: call   0x54dedbf0
	  0x07f0be5d: hlt    
	  0x07f0be5e: add    0xd4(%esi),%eax
	  0x07f0be64: sub    0xd8(%esi),%eax
	  0x07f0be6a: add    $0x9000,%eax
	  0x07f0be70: cmp    %eax,%esp
	  0x07f0be72: ja     0x07f0be82
	  0x07f0be78: pop    %esi
	  0x07f0be79: pop    %eax
	  0x07f0be7a: mov    %esi,%esp
	  0x07f0be7c: push   %eax
	  0x07f0be7d: jmp    0x07f02890
	  0x07f0be82: pop    %esi
	  0x07f0be83: pop    %eax
	  0x07f0be84: lea    -0x4(%esp,%ecx,4),%edi
	  0x07f0be88: test   %edx,%edx
	  0x07f0be8a: jle    0x07f0be98
	  0x07f0be90: push   $0x0
	  0x07f0be95: dec    %edx
	  0x07f0be96: jg     0x07f0be90
	  0x07f0be98: push   %eax
	  0x07f0be99: push   %ebp
	  0x07f0be9a: mov    %esp,%ebp
	  0x07f0be9c: push   %esi
	  0x07f0be9d: push   $0x0
	  0x07f0bea2: mov    0x8(%ebx),%esi
	  0x07f0bea5: lea    0x28(%esi),%esi
	  0x07f0bea8: push   %ebx
	  0x07f0bea9: push   $0x0
	  0x07f0beae: mov    0x8(%ebx),%edx
	  0x07f0beb1: mov    0x8(%edx),%edx
	  0x07f0beb4: mov    0xc(%edx),%edx
	  0x07f0beb7: push   %edx
	  0x07f0beb8: push   %edi
	  0x07f0beb9: push   %esi
	  0x07f0beba: push   $0x0
	  0x07f0bebf: mov    %esp,(%esp)
	  0x07f0bec2: mov    0x14(%ebx),%eax
	  0x07f0bec5: test   $0x100,%eax
	  0x07f0beca: je     0x07f0bee1
	  0x07f0bed0: push   $0x55318b94
	  0x07f0bed5: call   0x07f0beda
	  0x07f0beda: pusha  
	  0x07f0bedb: call   0x54dedbf0
	  0x07f0bee0: hlt    
	  0x07f0bee1: test   $0x400,%eax
	  0x07f0bee6: je     0x07f0befd
	  0x07f0beec: push   $0x55318bc4
	  0x07f0bef1: call   0x07f0bef6
	  0x07f0bef6: pusha  
	  0x07f0bef7: call   0x54dedbf0
	  0x07f0befc: hlt    
	  0x07f0befd: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f0bf05: mov    -0xc(%eax),%eax
	  0x07f0bf08: movb   $0x1,0x1a1(%eax)
	  0x07f0bf0f: mov    0x10(%ebx),%eax
	  0x07f0bf12: test   %eax,%eax
	  0x07f0bf14: jne    0x07f0bfc3
	  0x07f0bf1a: call   0x07f0bf24
	  0x07f0bf1f: jmp    0x07f0bfb8
	  0x07f0bf24: push   %ebx
	  0x07f0bf25: lea    0x8(%esp),%eax
	  0x07f0bf29: cmpl   $0x0,-0x8(%ebp)
	  0x07f0bf30: je     0x07f0bf47
	  0x07f0bf36: push   $0x55310188
	  0x07f0bf3b: call   0x07f0bf40
	  0x07f0bf40: pusha  
	  0x07f0bf41: call   0x54dedbf0
	  0x07f0bf46: hlt    
	  0x07f0bf47: mov    %esi,-0x1c(%ebp)
	  0x07f0bf4a: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f0bf52: mov    -0xc(%edi),%edi
	  0x07f0bf55: push   %edi
	  0x07f0bf56: mov    %ebp,0x144(%edi)
	  0x07f0bf5c: mov    %eax,0x13c(%edi)
	  0x07f0bf62: call   0x5505d720
	  0x07f0bf67: add    $0x8,%esp
	  0x07f0bf6a: push   %eax
	  0x07f0bf6b: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f0bf73: mov    -0xc(%eax),%eax
	  0x07f0bf76: cmp    %eax,%edi
	  0x07f0bf78: je     0x07f0bf8f
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f0bf7e: push   $0x55312af0
	  0x07f0bf83: call   0x07f0bf88
	  0x07f0bf88: pusha  
	  0x07f0bf89: call   0x54dedbf0
	  0x07f0bf8e: hlt    
	  0x07f0bf8f: pop    %eax
	  0x07f0bf90: movl   $0x0,0x13c(%edi)
	  0x07f0bf9a: movl   $0x0,0x144(%edi)
	  0x07f0bfa4: cmpl   $0x0,0x4(%edi)
	  0x07f0bfab: jne    0x07f00340
	  0x07f0bfb1: mov    -0x1c(%ebp),%esi
	  0x07f0bfb4: mov    -0x18(%ebp),%edi
	  0x07f0bfb7: ret    
	  0x07f0bfb8: mov    0x10(%ebx),%eax
	  0x07f0bfbb: test   %eax,%eax
	  0x07f0bfbd: je     0x07f0bfe0
	  0x07f0bfc3: mov    0x8(%eax),%ecx
	  0x07f0bfc6: add    $0x8,%ecx
	  0x07f0bfc9: mov    %ecx,0x8(%eax)
	  0x07f0bfcc: mov    0xc(%eax),%eax
	  0x07f0bfcf: and    $0xfffffff8,%eax
	  0x07f0bfd2: add    %eax,%ecx
	  0x07f0bfd4: cmp    0x55627784,%ecx
	  0x07f0bfda: jae    0x07f0c245
	  0x07f0bfe0: mov    %eax,-0x1000(%esp)
	  0x07f0bfe7: mov    %eax,-0x2000(%esp)
	  0x07f0bfee: mov    %eax,-0x3000(%esp)
	  0x07f0bff5: mov    %eax,-0x4000(%esp)
	  0x07f0bffc: mov    %eax,-0x5000(%esp)
	  0x07f0c003: mov    %eax,-0x6000(%esp)
	  0x07f0c00a: mov    %eax,-0x7000(%esp)
	  0x07f0c011: mov    %eax,-0x8000(%esp)
	  0x07f0c018: mov    %eax,-0x9000(%esp)
	  0x07f0c01f: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f0c027: mov    -0xc(%eax),%eax
	  0x07f0c02a: movb   $0x0,0x1a1(%eax)

  //这是zerolocals_synchronized多出来的
  //---begin lock_method
	  //判断方法是否带有synchronized
	  0x07f0c031: mov    0x14(%ebx),%eax //ebx里放的是method的指针, 这条指令的作用是把方法的access_flags放入%eax
	  /*
	    test的效果如下(参见Intel® 64 and IA-32 Architectures Software Developer’s Manual Volume 2)
	    TEMP ← SRC1 AND SRC2;
		SF ← MSB(TEMP);
		IF TEMP = 0
		  THEN ZF ← 1;
		  ELSE ZF ← 0;
		FI:
		PF ← BitwiseXNOR(TEMP[0:7]);
		CF ← 0;
		OF ← 0;

		所以如果%eax的值是包含$0x20，那么进行$0x20 and %eax后TEMP的值1, 此时ZF就是0
		而jne指令只有在ZF=0时才跳转
	  */
	  0x07f0c034: test   $0x20,%eax //JVM_ACC_SYNCHRONIZED的值是0x0020(在jvm.h中定义)
	  0x07f0c039: jne    0x07f0c050
	  0x07f0c03f: push   $0x55319284
	  0x07f0c044: call   0x07f0c049
	  0x07f0c049: pusha  
	  0x07f0c04a: call   0x54dedbf0
	  0x07f0c04f: hlt    

	  // get synchronization object
	  0x07f0c050: mov    0x14(%ebx),%eax
	  0x07f0c053: test   $0x8,%eax //测试是否是JVM_ACC_STATIC的
	  //edi指向第一个参数在堆栈中的位置，如果是实例方法，那么第一个参数就是this
	  //如果是静态方法，虽然也执行这条汇编，但是je不会跳转，会接着执行下面4条汇编，
	  //此时，eax变成_java_mirror(就是Class实例)
	  0x07f0c058: mov    (%edi),%eax
	  0x07f0c05a: je     0x07f0c06c //如果不是静态的，那么用_java_mirror作为同步对象
	  0x07f0c060: mov    0x8(%ebx),%eax //ConstMethod *
	  0x07f0c063: mov    0x8(%eax),%eax //ConstantPool *
	  0x07f0c066: mov    0x10(%eax),%eax //_pool_holder InstanceKlass*
	  0x07f0c069: mov    0x3c(%eax),%eax //_java_mirror oopDesc *

	  // add space for monitor & lock
	  0x07f0c06c: sub    $0x8,%esp
	  0x07f0c06f: mov    %esp,-0x20(%ebp)
	  0x07f0c072: mov    %eax,0x4(%esp)
	  0x07f0c076: mov    %esp,%edx

	  //---begin lock_object
		  0x07f0c078: mov    0x4(%edx),%ecx //monitor

		  //---begin MacroAssembler::biased_locking_enter
			  0x07f0c07b: mov    (%ecx),%eax //此时eax用来存放mark word
			  0x07f0c07d: push   %edx //为了使用edx，临时把原有值放入堆栈
			  0x07f0c07e: mov    %eax,%edx
			  0x07f0c080: and    $0x7,%edx
			  0x07f0c083: cmp    $0x5,%edx
			  0x07f0c086: pop    %edx
			  //mark word的后三位不是101(0x5)时说明未使用biased_locking，直接结束biased_locking_enter
			  //相当于%edx - 0x5时不为0就跳转
			  0x07f0c087: jne    0x07f0c11b
			  0x07f0c08d: mov    %eax,(%edx)
			  0x07f0c08f: push   %edx //接下来要用临时用edx，所以先push到堆栈中
			  //get_thread(tmp_reg)
			  0x07f0c090: mov    %fs:0x0(,%eiz,1),%edx
			  0x07f0c098: mov    -0xc(%edx),%edx

			  0x07f0c09b: xor    %edx,%eax //例如edx=00225000, eax=00000005时，进行xor后eax=00225005
			  0x07f0c09d: mov    0x4(%ecx),%edx //_metadata._klass
			  //Klass::prototype_header，也是一个markOop，如果也是00000005，进行xor后eax=00225000
			  0x07f0c0a0: xor    0x68(%edx),%eax
			  0x07f0c0a3: and    $0xffffff87,%eax //屏蔽掉markOop中的age字段，eax还是00225000
			  0x07f0c0a6: pop    %edx
			  0x07f0c0a7: je     0x07f0c1dc

			  0x07f0c0ad: test   $0x7,%eax
			  0x07f0c0b2: jne    0x07f0c10d //后3位不为0则跳转

			  0x07f0c0b8: test   $0x180,%eax //第7、8位只要有一位不为0则跳转，正好对应epoch
			  0x07f0c0bd: jne    0x07f0c0e9

			  0x07f0c0c3: mov    (%edx),%eax
			  //$0x1ff对应:
			  //markOopDesc::biased_lock_mask_in_place | markOopDesc::age_mask_in_place | markOopDesc::epoch_mask_in_place
			  0x07f0c0c5: and    $0x1ff,%eax
			  0x07f0c0cb: push   %edx

			  //get_thread(tmp_reg);
			  0x07f0c0cc: mov    %fs:0x0(,%eiz,1),%edx
			  0x07f0c0d4: mov    -0xc(%edx),%edx

			  0x07f0c0d7: or     %eax,%edx
			  //EAX = 00000005 ECX = 0F2CE620 EDX = 00225005 (%ecx) = 00000005
			  //如果(%ecx)=EAX 那么(%ecx)=EDX=00225005，否则EAX=(%ecx) = 00000005
			  0x07f0c0d9: lock cmpxchg %edx,(%ecx)
			  0x07f0c0dd: pop    %edx

			  0x07f0c0de: jne    0x07f0c13e
			  0x07f0c0e4: jmp    0x07f0c1dc

			  0x07f0c0e9: push   %edx
			  //get_thread(tmp_reg);
			  0x07f0c0ea: mov    %fs:0x0(,%eiz,1),%edx
			  0x07f0c0f2: mov    -0xc(%edx),%edx //EDX = 00225000

			  0x07f0c0f5: mov    0x4(%ecx),%eax //_metadata._klass
			  //Klass::prototype_header，也是一个markOop，如果也是00000005，进行or后edx=00225000
			  0x07f0c0f8: or     0x68(%eax),%edx
			  0x07f0c0fb: mov    (%edx),%eax
			  0x07f0c0fd: lock cmpxchg %edx,(%ecx)
			  0x07f0c101: pop    %edx

			  0x07f0c102: jne    0x07f0c13e
			  0x07f0c108: jmp    0x07f0c1dc

			  0x07f0c10d: mov    (%edx),%eax
			  0x07f0c10f: push   %edx
			  0x07f0c110: mov    0x4(%ecx),%edx //_metadata._klass
			  //Klass::prototype_header，也是一个markOop，如果也是00000005，则edx=00000005
			  0x07f0c113: mov    0x68(%edx),%edx
			  0x07f0c116: lock cmpxchg %edx,(%ecx)
			  0x07f0c11a: pop    %edx
		  //---end   MacroAssembler::biased_locking_enter

		  // Load immediate 1 into swap_reg %rax,
		  0x07f0c11b: mov    $0x1,%eax
		  // Load (object->mark() | 1) into swap_reg %rax,
		  0x07f0c120: or     (%ecx),%eax
		  // Save (object->mark() | 1) into BasicLock's displaced header
		  0x07f0c122: mov    %eax,(%edx) //(object->mark() | 1)存入栈顶
		  //如果%eax的值和(%ecx)相等，那么把%edx的值(是一个地址)存到(%ecx)，否则把(%ecx)放到%eax
		  0x07f0c124: lock cmpxchg %edx,(%ecx)
		  0x07f0c128: je     0x07f0c1dc //如果%eax和(%ecx)相等则跳转
		  0x07f0c12e: sub    %esp,%eax
		  0x07f0c130: and    $0xfffff003,%eax
		  // Save the test result, for recursive case, the result is zero
		  0x07f0c136: mov    %eax,(%edx)
		  0x07f0c138: je     0x07f0c1dc

		  // Call the runtime routine for slow case
		  //---begin MacroAssembler::call_VM InterpreterRuntime::monitorenter
			  0x07f0c13e: call   0x07f0c148
			  0x07f0c143: jmp    0x07f0c1dc
			  //pass_arg1(this, arg_1);
			  0x07f0c148: push   %edx

			  //---begin MacroAssembler::call_VM_helper
				  0x07f0c149: lea    0x8(%esp),%eax
				  //---begin InterpreterMacroAssembler::call_VM_base
					  0x07f0c14d: cmpl   $0x0,-0x8(%ebp)
					  0x07f0c154: je     0x07f0c16b

					  //stop("InterpreterMacroAssembler::call_VM_base: last_sp != NULL");
					  0x07f0c15a: push   $0x55310188
					  0x07f0c15f: call   0x07f0c164
					  0x07f0c164: pusha  
					  0x07f0c165: call   0x54dedbf0
					  0x07f0c16a: hlt    

					  //save_bcp();
					  0x07f0c16b: mov    %esi,-0x1c(%ebp)

					  //---begin MacroAssembler::call_VM_base
						  0x07f0c16e: mov    %fs:0x0(,%eiz,1),%edi
						  0x07f0c176: mov    -0xc(%edi),%edi

						  // push java thread (becomes first argument of C function)
						  0x07f0c179: push   %edi
						  0x07f0c17a: mov    %ebp,0x144(%edi)
						  0x07f0c180: mov    %eax,0x13c(%edi)

						  //MacroAssembler::call_VM_leaf_base
						  0x07f0c186: call   0x5505a930
						  0x07f0c18b: add    $0x8,%esp

						  0x07f0c18e: push   %eax
						  0x07f0c18f: mov    %fs:0x0(,%eiz,1),%eax
						  0x07f0c197: mov    -0xc(%eax),%eax
						  0x07f0c19a: cmp    %eax,%edi
						  0x07f0c19c: je     0x07f0c1b3

						  ;; MacroAssembler::call_VM_base: rdi not callee saved?
						  0x07f0c1a2: push   $0x55312af0
						  0x07f0c1a7: call   0x07f0c1ac
						  0x07f0c1ac: pusha  
						  0x07f0c1ad: call   0x54dedbf0
						  0x07f0c1b2: hlt    

						  0x07f0c1b3: pop    %eax
						  //reset_last_Java_frame
						  0x07f0c1b4: movl   $0x0,0x13c(%edi)
						  0x07f0c1be: movl   $0x0,0x144(%edi)

						  0x07f0c1c8: cmpl   $0x0,0x4(%edi)
						  0x07f0c1cf: jne    0x07f00340
					  //---end   MacroAssembler::call_VM_base

					  0x07f0c1d5: mov    -0x1c(%ebp),%esi //restore_bcp();
					  0x07f0c1d8: mov    -0x18(%ebp),%edi //restore_locals();
				  //---end   InterpreterMacroAssembler::call_VM_base
			  //---end   MacroAssembler::call_VM_helper

			  0x07f0c1db: ret    
		  //---end   MacroAssembler::call_VM InterpreterRuntime::monitorenter
	  //---end   lock_object
  //---end   lock_method


  //下面的代码跟zerolocals一样
	  0x07f0c1dc: mov    -0x20(%ebp),%eax
	  0x07f0c1df: cmp    %esp,%eax
	  0x07f0c1e1: je     0x07f0c1f8
	  0x07f0c1e7: push   $0x55318c14
	  0x07f0c1ec: call   0x07f0c1f1
	  0x07f0c1f1: pusha  
	  0x07f0c1f2: call   0x54dedbf0
	  0x07f0c1f7: hlt    
	  0x07f0c1f8: cmpb   $0x0,0x55633e5f
	  0x07f0c1ff: je     0x07f0c23b
	  0x07f0c205: mov    %fs:0x0(,%eiz,1),%ecx
	  0x07f0c20d: mov    -0xc(%ecx),%ecx
	  0x07f0c210: mov    -0xc(%ebp),%ebx
	  0x07f0c213: push   %ebx
	  0x07f0c214: push   %ecx
	  0x07f0c215: cmpl   $0x0,-0x8(%ebp)
	  0x07f0c21c: je     0x07f0c233
	  0x07f0c222: push   $0x55310148
	  0x07f0c227: call   0x07f0c22c
	  0x07f0c22c: pusha  
	  0x07f0c22d: call   0x54dedbf0
	  0x07f0c232: hlt    
	  0x07f0c233: call   0x552155e0
	  0x07f0c238: add    $0x8,%esp
	  0x07f0c23b: movzbl (%esi),%ebx
	  0x07f0c23e: jmp    *0x55629838(,%ebx,4)
	  0x07f0c245: mov    $0x0,%eax
	  0x07f0c24a: call   0x07f0c254
	  0x07f0c24f: jmp    0x07f0c2e8
	  0x07f0c254: push   %eax
	  0x07f0c255: lea    0x8(%esp),%eax
	  0x07f0c259: cmpl   $0x0,-0x8(%ebp)
	  0x07f0c260: je     0x07f0c277
	  0x07f0c266: push   $0x55310188
	  0x07f0c26b: call   0x07f0c270
	  0x07f0c270: pusha  
	  0x07f0c271: call   0x54dedbf0
	  0x07f0c276: hlt    
	  0x07f0c277: mov    %esi,-0x1c(%ebp)
	  0x07f0c27a: mov    %fs:0x0(,%eiz,1),%edi
	  0x07f0c282: mov    -0xc(%edi),%edi
	  0x07f0c285: push   %edi
	  0x07f0c286: mov    %ebp,0x144(%edi)
	  0x07f0c28c: mov    %eax,0x13c(%edi)
	  0x07f0c292: call   0x5505ce70
	  0x07f0c297: add    $0x8,%esp
	  0x07f0c29a: push   %eax
	  0x07f0c29b: mov    %fs:0x0(,%eiz,1),%eax
	  0x07f0c2a3: mov    -0xc(%eax),%eax
	  0x07f0c2a6: cmp    %eax,%edi
	  0x07f0c2a8: je     0x07f0c2bf
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x07f0c2ae: push   $0x55312af0
	  0x07f0c2b3: call   0x07f0c2b8
	  0x07f0c2b8: pusha  
	  0x07f0c2b9: call   0x54dedbf0
	  0x07f0c2be: hlt    
	  0x07f0c2bf: pop    %eax
	  0x07f0c2c0: movl   $0x0,0x13c(%edi)
	  0x07f0c2ca: movl   $0x0,0x144(%edi)
	  0x07f0c2d4: cmpl   $0x0,0x4(%edi)
	  0x07f0c2db: jne    0x07f00340
	  0x07f0c2e1: mov    -0x1c(%ebp),%esi
	  0x07f0c2e4: mov    -0x18(%ebp),%edi
	  0x07f0c2e7: ret    
	  0x07f0c2e8: mov    -0xc(%ebp),%ebx
	  0x07f0c2eb: jmp    0x07f0bfe0

