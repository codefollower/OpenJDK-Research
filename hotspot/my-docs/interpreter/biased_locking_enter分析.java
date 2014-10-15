源文件:
hotspot\src\cpu\x86\vm\macroAssembler_x86.cpp
方法:
MacroAssembler::biased_locking_enter

lock_reg -> edx 对于一个BasicObjectLock实例，BasicObjectLock实例是在栈上分配的，占用8个字节
例如:
      //－－－－－－－－－－对应一个BasicObjectLock实例 begin－－－－－－－－－－－－
  //  // -10 -0x28  [ _displaced_header    ] --> 对应 BasicLock _lock字段，因为BasicLock就一个字段，所以直接存_displaced_header
      // -9  -0x24  [ monitor对象地址      ] --> 对应 oop _obj字段
  	  //－－－－－－－－－－对应一个BasicObjectLock实例 end－－－－－－－－－－－－

	  // -8  -0x20  [ -0x28的位置          ] //reserve word for pointer to expression stack bottom
	  // -7  -0x1C  [ 第一个字节码内存地址 ]
	  // -6  -0x18  [ argument word 1 所在堆栈位置 ] <--- rdi
	  // -5  -0x14  [ ConstantPoolCache    ]
	  // -4  -0x10  [ 0                    ]
	  // -3  -0xC   [ method               ]
	  // -2  -0x8   [ 0                    ]
	  // -1  -0x4   [ argument word n 所在堆栈位置 ]
	  //      0     [ saved rbp,           ] <--- rbp,
	  //－－－－－－－－－－－－－－－－－－－－－－
edx指向_displaced_header对应的堆栈地址，0x4(%edx)就是oop _obj

obj_reg -> ecx 对应 oop _obj字段
swap_reg -> eax 对应 oop _obj字段中的mark word
tmp_reg -> edx


流程:

1. 

1.1
先看mark word得的后三位是否是5(二进制101)，也就是看是否使用了biased lock
如果后三位不是5，转到0x07f18ea9

1.2
把mark word存到displaced_header对应的堆栈地址里

1.3
取出oop _obj对应的class的prototype_header，也是一个markOop
prototype_header和mark word进行xor，结果保持到edx
取出线程地址放到eax，然后与edx进行xor，结果保持到eax
屏蔽掉eax markOop中的age字段，如果此时eax markOop是0，跳到0x07f0c1dc

1.4
如果此时eax markOop后三位不是0，跳到0x07f0c10d

1.5
如果此时eax markOop第7、8位只要有一位不为0(也就是存在epoch)则跳到0x07f0c0e9

1.6
把1.2中的displaced_header也就是oop _obj字段中的mark word重新放到eax，
在eax中只保留markOopDesc::biased_lock_mask_in_place | markOopDesc::age_mask_in_place | markOopDesc::epoch_mask_in_place
对应的位，相当于去除mark word中的线程地址

1.7 
把线程地址传到edx，并与eax进行or，结果存到edx，相当于在mark word中保持当前线程的地址

1.8
如果oop _obj字段中的mark word与1.6中的eax相等，那么把oop _obj的mark word换成1.7中的edx并跳到0x07f0c1dc，
否则只是把eax的值改成edx并跳到0x07f0c13e

0x07f0c0e9
取出oop _obj对应的class的prototype_header放到edx，
取出当前线程的地址放到eax，
edx与eax进行or，结果存到edx

如果oop _obj字段中的mark word与eax相等，那么把oop _obj的mark word换成edx并跳到0x07f0c1dc，
否则只是把eax的值改成edx并跳到0x07f0c13e


0x07f0c10d
取出displaced_header放到eax，
取出oop _obj对应的class的prototype_header放到edx，

如果oop _obj字段中的mark word与eax相等，那么把oop _obj的mark word换成edx(prototype_header)，
否则只是把eax的值改成edx

0x07f0c13e
InterpreterRuntime::monitorenter


0x07f18ea9


0x07f0c1dc

结束lock_object，