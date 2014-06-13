classFileParser.cpp代码的布局:

前1000行处理常量池、字段、实现的接口

1000－2000 注释相关

2000－3000 方法、ClassFile级属性相关

3000－4000 layout_fields 与 parseClassFile这两个方法的实现代码很大

4000－5000 check与verify相关

一些限制:
每个方法的参数个数必须<=255
每个方法的长度(用Code属性中的code_length表示)要<=65535 (小于64K)

  //<<jvms8>>的Table 4.7-C中预定义了各种属性，
  //ClassFile级别的属性有12个:
	//  SourceFile
	//  InnerClasses
	//  EnclosingMethod
	//  SourceDebugExtension
	//  BootstrapMethods
	//  Synthetic
	//  Deprecated
	//  Signature
	//
	//  RuntimeVisibleAnnotations,
	//  RuntimeInvisibleAnnotations
	//  RuntimeVisibleTypeAnnotations,
	//  RuntimeInvisibleTypeAnnotations

  //field_info级别的属性有8个:
    //ConstantValue
    //Synthetic
    //Deprecated
    //Signature
    //RuntimeVisibleAnnotations,
    //RuntimeInvisibleAnnotations
    //RuntimeVisibleTypeAnnotations,
    //RuntimeInvisibleTypeAnnotations

  //method_info级别的属性有13个:
	//  Code
	//  Exceptions
	//  AnnotationDefault
	//  MethodParameters
	//  Synthetic
	//  Deprecated
	//  Signature
	//
	//  RuntimeVisibleParameterAnnotations,
	//  RuntimeInvisibleParameterAnnotations
	//  RuntimeVisibleAnnotations,
	//  RuntimeInvisibleAnnotations
	//  RuntimeVisibleTypeAnnotations,
	//  RuntimeInvisibleTypeAnnotations

  //Code级别的属性有4个:
	//  LineNumberTable
	//  LocalVariableTable
	//  LocalVariableTypeTable
	//  StackMapTable
