//zerolocals_synchronized比zerolocals多了lock_method，其他的汇编一样
method entry point (kind = zerolocals_synchronized)  [0x01cbbdf0, 0x01cbc2f0]  1280 bytes
  //下面的代码跟zerolocals一样
	  0x01cbbdf0: mov    0x8(%ebx),%edx
	  0x01cbbdf3: movzwl 0x22(%edx),%ecx
	  0x01cbbdf7: movzwl 0x20(%edx),%edx
	  0x01cbbdfb: sub    %ecx,%edx
	  0x01cbbdfd: cmp    $0x3f6,%edx
	  0x01cbbe03: jbe    0x01cbbe83
	  0x01cbbe09: push   %esi
	  0x01cbbe0a: mov    %fs:0x0(,%eiz,1),%esi
	  0x01cbbe12: mov    -0xc(%esi),%esi
	  0x01cbbe15: lea    0x28(,%edx,4),%eax
	  0x01cbbe1c: cmpl   $0x0,0xd4(%esi)
	  0x01cbbe26: jne    0x01cbbe3d
	  0x01cbbe2c: push   $0x553191c4
	  0x01cbbe31: call   0x01cbbe36
	  0x01cbbe36: pusha  
	  0x01cbbe37: call   0x54dedbf0
	  0x01cbbe3c: hlt    
	  0x01cbbe3d: cmpl   $0x0,0xd8(%esi)
	  0x01cbbe47: jne    0x01cbbe5e
	  0x01cbbe4d: push   $0x553191d8
	  0x01cbbe52: call   0x01cbbe57
	  0x01cbbe57: pusha  
	  0x01cbbe58: call   0x54dedbf0
	  0x01cbbe5d: hlt    
	  0x01cbbe5e: add    0xd4(%esi),%eax
	  0x01cbbe64: sub    0xd8(%esi),%eax
	  0x01cbbe6a: add    $0x9000,%eax
	  0x01cbbe70: cmp    %eax,%esp
	  0x01cbbe72: ja     0x01cbbe82
	  0x01cbbe78: pop    %esi
	  0x01cbbe79: pop    %eax
	  0x01cbbe7a: mov    %esi,%esp
	  0x01cbbe7c: push   %eax
	  0x01cbbe7d: jmp    0x01cb2890
	  0x01cbbe82: pop    %esi
	  0x01cbbe83: pop    %eax
	  0x01cbbe84: lea    -0x4(%esp,%ecx,4),%edi
	  0x01cbbe88: test   %edx,%edx
	  0x01cbbe8a: jle    0x01cbbe98
	  0x01cbbe90: push   $0x0
	  0x01cbbe95: dec    %edx
	  0x01cbbe96: jg     0x01cbbe90
	  0x01cbbe98: push   %eax
	  0x01cbbe99: push   %ebp
	  0x01cbbe9a: mov    %esp,%ebp
	  0x01cbbe9c: push   %esi
	  0x01cbbe9d: push   $0x0
	  0x01cbbea2: mov    0x8(%ebx),%esi
	  0x01cbbea5: lea    0x28(%esi),%esi
	  0x01cbbea8: push   %ebx
	  0x01cbbea9: push   $0x0
	  0x01cbbeae: mov    0x8(%ebx),%edx
	  0x01cbbeb1: mov    0x8(%edx),%edx
	  0x01cbbeb4: mov    0xc(%edx),%edx
	  0x01cbbeb7: push   %edx
	  0x01cbbeb8: push   %edi
	  0x01cbbeb9: push   %esi
	  0x01cbbeba: push   $0x0
	  0x01cbbebf: mov    %esp,(%esp)
	  0x01cbbec2: mov    0x14(%ebx),%eax
	  0x01cbbec5: test   $0x100,%eax
	  0x01cbbeca: je     0x01cbbee1
	  0x01cbbed0: push   $0x55318b94
	  0x01cbbed5: call   0x01cbbeda
	  0x01cbbeda: pusha  
	  0x01cbbedb: call   0x54dedbf0
	  0x01cbbee0: hlt    
	  0x01cbbee1: test   $0x400,%eax
	  0x01cbbee6: je     0x01cbbefd
	  0x01cbbeec: push   $0x55318bc4
	  0x01cbbef1: call   0x01cbbef6
	  0x01cbbef6: pusha  
	  0x01cbbef7: call   0x54dedbf0
	  0x01cbbefc: hlt    
	  0x01cbbefd: mov    %fs:0x0(,%eiz,1),%eax
	  0x01cbbf05: mov    -0xc(%eax),%eax
	  0x01cbbf08: movb   $0x1,0x1a1(%eax)
	  0x01cbbf0f: mov    0x10(%ebx),%eax
	  0x01cbbf12: test   %eax,%eax
	  0x01cbbf14: jne    0x01cbbfc3
	  0x01cbbf1a: call   0x01cbbf24
	  0x01cbbf1f: jmp    0x01cbbfb8
	  0x01cbbf24: push   %ebx
	  0x01cbbf25: lea    0x8(%esp),%eax
	  0x01cbbf29: cmpl   $0x0,-0x8(%ebp)
	  0x01cbbf30: je     0x01cbbf47
	  0x01cbbf36: push   $0x55310188
	  0x01cbbf3b: call   0x01cbbf40
	  0x01cbbf40: pusha  
	  0x01cbbf41: call   0x54dedbf0
	  0x01cbbf46: hlt    
	  0x01cbbf47: mov    %esi,-0x1c(%ebp)
	  0x01cbbf4a: mov    %fs:0x0(,%eiz,1),%edi
	  0x01cbbf52: mov    -0xc(%edi),%edi
	  0x01cbbf55: push   %edi
	  0x01cbbf56: mov    %ebp,0x144(%edi)
	  0x01cbbf5c: mov    %eax,0x13c(%edi)
	  0x01cbbf62: call   0x5505d720
	  0x01cbbf67: add    $0x8,%esp
	  0x01cbbf6a: push   %eax
	  0x01cbbf6b: mov    %fs:0x0(,%eiz,1),%eax
	  0x01cbbf73: mov    -0xc(%eax),%eax
	  0x01cbbf76: cmp    %eax,%edi
	  0x01cbbf78: je     0x01cbbf8f
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x01cbbf7e: push   $0x55312af0
	  0x01cbbf83: call   0x01cbbf88
	  0x01cbbf88: pusha  
	  0x01cbbf89: call   0x54dedbf0
	  0x01cbbf8e: hlt    
	  0x01cbbf8f: pop    %eax
	  0x01cbbf90: movl   $0x0,0x13c(%edi)
	  0x01cbbf9a: movl   $0x0,0x144(%edi)
	  0x01cbbfa4: cmpl   $0x0,0x4(%edi)
	  0x01cbbfab: jne    0x01cb0340
	  0x01cbbfb1: mov    -0x1c(%ebp),%esi
	  0x01cbbfb4: mov    -0x18(%ebp),%edi
	  0x01cbbfb7: ret    
	  0x01cbbfb8: mov    0x10(%ebx),%eax
	  0x01cbbfbb: test   %eax,%eax
	  0x01cbbfbd: je     0x01cbbfe0
	  0x01cbbfc3: mov    0x8(%eax),%ecx
	  0x01cbbfc6: add    $0x8,%ecx
	  0x01cbbfc9: mov    %ecx,0x8(%eax)
	  0x01cbbfcc: mov    0xc(%eax),%eax
	  0x01cbbfcf: and    $0xfffffff8,%eax
	  0x01cbbfd2: add    %eax,%ecx
	  0x01cbbfd4: cmp    0x55627784,%ecx
	  0x01cbbfda: jae    0x01cbc245
	  0x01cbbfe0: mov    %eax,-0x1000(%esp)
	  0x01cbbfe7: mov    %eax,-0x2000(%esp)
	  0x01cbbfee: mov    %eax,-0x3000(%esp)
	  0x01cbbff5: mov    %eax,-0x4000(%esp)
	  0x01cbbffc: mov    %eax,-0x5000(%esp)
	  0x01cbc003: mov    %eax,-0x6000(%esp)
	  0x01cbc00a: mov    %eax,-0x7000(%esp)
	  0x01cbc011: mov    %eax,-0x8000(%esp)
	  0x01cbc018: mov    %eax,-0x9000(%esp)
	  0x01cbc01f: mov    %fs:0x0(,%eiz,1),%eax
	  0x01cbc027: mov    -0xc(%eax),%eax
	  0x01cbc02a: movb   $0x0,0x1a1(%eax)

  //这是zerolocals_synchronized多出来的
  //---begin lock_method
	  //判断方法是否带有synchronized
	  0x01cbc031: mov    0x14(%ebx),%eax //ebx里放到的是method的指针, 这条指令的作用是把方法的access_flags放入%eax
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
	  0x01cbc034: test   $0x20,%eax //JVM_ACC_SYNCHRONIZED的值是0x0020(在jvm.h中定义)
	  0x01cbc039: jne    0x01cbc050
	  0x01cbc03f: push   $0x55319284
	  0x01cbc044: call   0x01cbc049
	  0x01cbc049: pusha  
	  0x01cbc04a: call   0x54dedbf0
	  0x01cbc04f: hlt    

	  // get synchronization object
	  0x01cbc050: mov    0x14(%ebx),%eax
	  0x01cbc053: test   $0x8,%eax //测试是否是JVM_ACC_STATIC的
	  //edi指向第一个参数在堆栈中的位置，如果是实例方法，那么第一个参数就是this
	  //如果是静态方法，虽然也执行这条汇编，但是je不会跳转，会接着执行下面4条汇编，
	  //此时，eax变成_java_mirror(就是Class实例)
	  0x01cbc058: mov    (%edi),%eax
	  0x01cbc05a: je     0x01cbc06c //如果不是静态的，那么用_java_mirror作为同步对象
	  0x01cbc060: mov    0x8(%ebx),%eax //ConstMethod *
	  0x01cbc063: mov    0x8(%eax),%eax //ConstantPool *
	  0x01cbc066: mov    0x10(%eax),%eax //_pool_holder InstanceKlass*
	  0x01cbc069: mov    0x3c(%eax),%eax //_java_mirror oopDesc *

	  // add space for monitor & lock
	  0x01cbc06c: sub    $0x8,%esp
	  0x01cbc06f: mov    %esp,-0x20(%ebp)
	  0x01cbc072: mov    %eax,0x4(%esp)
	  0x01cbc076: mov    %esp,%edx

	  //---begin lock_object
		  0x01cbc078: mov    0x4(%edx),%ecx //monitor

		  //---begin MacroAssembler::biased_locking_enter
			  0x01cbc07b: mov    (%ecx),%eax //此时eax用来存放mark word
			  0x01cbc07d: push   %edx //为了使用edx，临时把原有值放入堆栈
			  0x01cbc07e: mov    %eax,%edx
			  0x01cbc080: and    $0x7,%edx
			  0x01cbc083: cmp    $0x5,%edx
			  0x01cbc086: pop    %edx
			  //mark word的后三位不是101(0x5)时说明未使用biased_locking，直接结束biased_locking_enter
			  //相当于%edx - 0x5时不为0就跳转
			  0x01cbc087: jne    0x01cbc11b
			  0x01cbc08d: mov    %eax,(%edx)
			  0x01cbc08f: push   %edx //接下来要用临时用edx，所以先push到堆栈中
			  //get_thread(tmp_reg)
			  0x01cbc090: mov    %fs:0x0(,%eiz,1),%edx
			  0x01cbc098: mov    -0xc(%edx),%edx

			  0x01cbc09b: xor    %edx,%eax //例如edx=00225000, eax=00000005时，进行xor后eax=00225005
			  0x01cbc09d: mov    0x4(%ecx),%edx //_metadata._klass
			  //Klass::prototype_header，也是一个markOop，如果也是00000005，进行xor后eax=00225000
			  0x01cbc0a0: xor    0x68(%edx),%eax
			  0x01cbc0a3: and    $0xffffff87,%eax //屏蔽掉markOop中的age字段，eax还是00225000
			  0x01cbc0a6: pop    %edx
			  0x01cbc0a7: je     0x01cbc1dc

			  0x01cbc0ad: test   $0x7,%eax
			  0x01cbc0b2: jne    0x01cbc10d //后3位不为0则跳转

			  0x01cbc0b8: test   $0x180,%eax //第7、8位只要有一位不为0则跳转，正好对应epoch
			  0x01cbc0bd: jne    0x01cbc0e9

			  0x01cbc0c3: mov    (%edx),%eax
			  0x01cbc0c5: and    $0x1ff,%eax
			  0x01cbc0cb: push   %edx

			  //get_thread(tmp_reg);
			  0x01cbc0cc: mov    %fs:0x0(,%eiz,1),%edx
			  0x01cbc0d4: mov    -0xc(%edx),%edx

			  0x01cbc0d7: or     %eax,%edx
			  //EAX = 00000005 ECX = 0F2CE620 EDX = 00225005 (%ecx) = 00000005
			  //如果(%ecx)=EAX 那么(%ecx)=EDX=00225005，否则EAX=EDX=00225005
			  0x01cbc0d9: lock cmpxchg %edx,(%ecx)
			  0x01cbc0dd: pop    %edx

			  0x01cbc0de: jne    0x01cbc13e
			  0x01cbc0e4: jmp    0x01cbc1dc

			  0x01cbc0e9: push   %edx
			  //get_thread(tmp_reg);
			  0x01cbc0ea: mov    %fs:0x0(,%eiz,1),%edx
			  0x01cbc0f2: mov    -0xc(%edx),%edx //EDX = 00225000

			  0x01cbc0f5: mov    0x4(%ecx),%eax //_metadata._klass
			  //Klass::prototype_header，也是一个markOop，如果也是00000005，进行or后edx=00225000
			  0x01cbc0f8: or     0x68(%eax),%edx
			  0x01cbc0fb: mov    (%edx),%eax
			  0x01cbc0fd: lock cmpxchg %edx,(%ecx)
			  0x01cbc101: pop    %edx

			  0x01cbc102: jne    0x01cbc13e
			  0x01cbc108: jmp    0x01cbc1dc

			  0x01cbc10d: mov    (%edx),%eax
			  0x01cbc10f: push   %edx
			  0x01cbc110: mov    0x4(%ecx),%edx //_metadata._klass
			  //Klass::prototype_header，也是一个markOop，如果也是00000005，则edx=00000005
			  0x01cbc113: mov    0x68(%edx),%edx
			  0x01cbc116: lock cmpxchg %edx,(%ecx)
			  0x01cbc11a: pop    %edx
		  //---end   MacroAssembler::biased_locking_enter

		  // Load immediate 1 into swap_reg %rax,
		  0x01cbc11b: mov    $0x1,%eax
		  // Load (object->mark() | 1) into swap_reg %rax,
		  0x01cbc120: or     (%ecx),%eax
		  // Save (object->mark() | 1) into BasicLock's displaced header
		  0x01cbc122: mov    %eax,(%edx) //(object->mark() | 1)存入栈顶
		  //如果%eax的值和(%ecx)相等，那么把%edx的值(是一个地址)存到(%ecx)，否则把(%ecx)放到%eax
		  0x01cbc124: lock cmpxchg %edx,(%ecx)
		  0x01cbc128: je     0x01cbc1dc //如果%eax和(%ecx)相等则跳转
		  0x01cbc12e: sub    %esp,%eax
		  0x01cbc130: and    $0xfffff003,%eax
		  // Save the test result, for recursive case, the result is zero
		  0x01cbc136: mov    %eax,(%edx)
		  0x01cbc138: je     0x01cbc1dc

		  // Call the runtime routine for slow case
		  //---begin MacroAssembler::call_VM InterpreterRuntime::monitorenter
			  0x01cbc13e: call   0x01cbc148
			  0x01cbc143: jmp    0x01cbc1dc
			  //pass_arg1(this, arg_1);
			  0x01cbc148: push   %edx

			  //---begin MacroAssembler::call_VM_helper
				  0x01cbc149: lea    0x8(%esp),%eax
				  //---begin InterpreterMacroAssembler::call_VM_base
					  0x01cbc14d: cmpl   $0x0,-0x8(%ebp)
					  0x01cbc154: je     0x01cbc16b

					  //stop("InterpreterMacroAssembler::call_VM_base: last_sp != NULL");
					  0x01cbc15a: push   $0x55310188
					  0x01cbc15f: call   0x01cbc164
					  0x01cbc164: pusha  
					  0x01cbc165: call   0x54dedbf0
					  0x01cbc16a: hlt    

					  //save_bcp();
					  0x01cbc16b: mov    %esi,-0x1c(%ebp)

					  //---begin MacroAssembler::call_VM_base
						  0x01cbc16e: mov    %fs:0x0(,%eiz,1),%edi
						  0x01cbc176: mov    -0xc(%edi),%edi

						  // push java thread (becomes first argument of C function)
						  0x01cbc179: push   %edi
						  0x01cbc17a: mov    %ebp,0x144(%edi)
						  0x01cbc180: mov    %eax,0x13c(%edi)

						  //MacroAssembler::call_VM_leaf_base
						  0x01cbc186: call   0x5505a930
						  0x01cbc18b: add    $0x8,%esp

						  0x01cbc18e: push   %eax
						  0x01cbc18f: mov    %fs:0x0(,%eiz,1),%eax
						  0x01cbc197: mov    -0xc(%eax),%eax
						  0x01cbc19a: cmp    %eax,%edi
						  0x01cbc19c: je     0x01cbc1b3

						  ;; MacroAssembler::call_VM_base: rdi not callee saved?
						  0x01cbc1a2: push   $0x55312af0
						  0x01cbc1a7: call   0x01cbc1ac
						  0x01cbc1ac: pusha  
						  0x01cbc1ad: call   0x54dedbf0
						  0x01cbc1b2: hlt    

						  0x01cbc1b3: pop    %eax
						  //reset_last_Java_frame
						  0x01cbc1b4: movl   $0x0,0x13c(%edi)
						  0x01cbc1be: movl   $0x0,0x144(%edi)

						  0x01cbc1c8: cmpl   $0x0,0x4(%edi)
						  0x01cbc1cf: jne    0x01cb0340
					  //---end   MacroAssembler::call_VM_base

					  0x01cbc1d5: mov    -0x1c(%ebp),%esi //restore_bcp();
					  0x01cbc1d8: mov    -0x18(%ebp),%edi //restore_locals();
				  //---end   InterpreterMacroAssembler::call_VM_base
			  //---end   MacroAssembler::call_VM_helper

			  0x01cbc1db: ret    
		  //---end   MacroAssembler::call_VM InterpreterRuntime::monitorenter
	  //---end   lock_object
  //---end   lock_method


  //下面的代码跟zerolocals一样
	  0x01cbc1dc: mov    -0x20(%ebp),%eax
	  0x01cbc1df: cmp    %esp,%eax
	  0x01cbc1e1: je     0x01cbc1f8
	  0x01cbc1e7: push   $0x55318c14
	  0x01cbc1ec: call   0x01cbc1f1
	  0x01cbc1f1: pusha  
	  0x01cbc1f2: call   0x54dedbf0
	  0x01cbc1f7: hlt    
	  0x01cbc1f8: cmpb   $0x0,0x55633e5f
	  0x01cbc1ff: je     0x01cbc23b
	  0x01cbc205: mov    %fs:0x0(,%eiz,1),%ecx
	  0x01cbc20d: mov    -0xc(%ecx),%ecx
	  0x01cbc210: mov    -0xc(%ebp),%ebx
	  0x01cbc213: push   %ebx
	  0x01cbc214: push   %ecx
	  0x01cbc215: cmpl   $0x0,-0x8(%ebp)
	  0x01cbc21c: je     0x01cbc233
	  0x01cbc222: push   $0x55310148
	  0x01cbc227: call   0x01cbc22c
	  0x01cbc22c: pusha  
	  0x01cbc22d: call   0x54dedbf0
	  0x01cbc232: hlt    
	  0x01cbc233: call   0x552155e0
	  0x01cbc238: add    $0x8,%esp
	  0x01cbc23b: movzbl (%esi),%ebx
	  0x01cbc23e: jmp    *0x55629838(,%ebx,4)
	  0x01cbc245: mov    $0x0,%eax
	  0x01cbc24a: call   0x01cbc254
	  0x01cbc24f: jmp    0x01cbc2e8
	  0x01cbc254: push   %eax
	  0x01cbc255: lea    0x8(%esp),%eax
	  0x01cbc259: cmpl   $0x0,-0x8(%ebp)
	  0x01cbc260: je     0x01cbc277
	  0x01cbc266: push   $0x55310188
	  0x01cbc26b: call   0x01cbc270
	  0x01cbc270: pusha  
	  0x01cbc271: call   0x54dedbf0
	  0x01cbc276: hlt    
	  0x01cbc277: mov    %esi,-0x1c(%ebp)
	  0x01cbc27a: mov    %fs:0x0(,%eiz,1),%edi
	  0x01cbc282: mov    -0xc(%edi),%edi
	  0x01cbc285: push   %edi
	  0x01cbc286: mov    %ebp,0x144(%edi)
	  0x01cbc28c: mov    %eax,0x13c(%edi)
	  0x01cbc292: call   0x5505ce70
	  0x01cbc297: add    $0x8,%esp
	  0x01cbc29a: push   %eax
	  0x01cbc29b: mov    %fs:0x0(,%eiz,1),%eax
	  0x01cbc2a3: mov    -0xc(%eax),%eax
	  0x01cbc2a6: cmp    %eax,%edi
	  0x01cbc2a8: je     0x01cbc2bf
	  ;; MacroAssembler::call_VM_base: rdi not callee saved?
	  0x01cbc2ae: push   $0x55312af0
	  0x01cbc2b3: call   0x01cbc2b8
	  0x01cbc2b8: pusha  
	  0x01cbc2b9: call   0x54dedbf0
	  0x01cbc2be: hlt    
	  0x01cbc2bf: pop    %eax
	  0x01cbc2c0: movl   $0x0,0x13c(%edi)
	  0x01cbc2ca: movl   $0x0,0x144(%edi)
	  0x01cbc2d4: cmpl   $0x0,0x4(%edi)
	  0x01cbc2db: jne    0x01cb0340
	  0x01cbc2e1: mov    -0x1c(%ebp),%esi
	  0x01cbc2e4: mov    -0x18(%ebp),%edi
	  0x01cbc2e7: ret    
	  0x01cbc2e8: mov    -0xc(%ebp),%ebx
	  0x01cbc2eb: jmp    0x01cbbfe0

