有些字节码对应的汇编都有如下类似的开头:
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
 
通常是对应TemplateInterpreterGenerator::set_vtos_entry_points



每条字节码对应的汇编都有如下类似的结尾:
  0x01cbe754: movzbl 0x1(%esi),%ebx
  0x01cbe758: inc    %esi
  0x01cbe759: jmp    *0x55629838(,%ebx,4)

对应InterpreterMacroAssembler::dispatch_next


