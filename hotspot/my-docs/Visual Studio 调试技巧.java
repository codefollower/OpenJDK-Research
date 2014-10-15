可以在watch窗口中用&((((Thread*)(thread)))->_skip_gcalot)这样的风格取得变量名地址

右击Locals窗口中的变量名可以为变量增加watch


转自: http://blog.csdn.net/windtalkersm/article/details/5620551

编译选项:
CL.exe 的命令行编译断断续续接触了几次,每次都忘,每次都重新查。每次都搞不清楚语法，尤其是传给linker的参数。因为网上所有的文章都是一样的，都是详细的参数列表，都是没有实例。为了和大众保持一致，我在下面也copy一个详细的参数列表---只是在前面加几个实例

 

cl.exe test.cpp /EHsc /I"C:/OpenCV2.0/include/opencv/" cv200.lib highgui200.lib cxcore200.lib /link /LIBPATH:"C:/OpenCV2.0/vs2008/lib"

 

/LIBPATH小写也可以/libpath

 

网上找到的“经典用法”

cl *.cpp /G7 /MD /Ox /Ot /W3 /c /EHsc /I"G:/Visual C++/VC98/PlatformSDK/Include"

link *.obj rc.res /LIBPATH:"G:/Visual C++/lib" /SUBSYSTEM:WINDOWS /MACHINE:X86 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib OpenGL32.Lib

 

MFC 开发如下：
编译源代码:
cl *.cpp /Ox /Ot /G7 /D "WIN32" /D "_WINDOWS" /D "_AFXDLL" /EHsc /MD /arch:SSE2 /W3 /c
资源编译 :
rc /l 0x804 winmfc.rc
链接 :
link *.obj WinMFC.res /out:WinMFC.exe /OPT:NOWIN98 /SUBSYSTEM:WINDOWS /MACHINE:X86

 

===================================

 

CL   命令行使用下列语法：     

CL   [option...]   file...   [option   |   file]...   [lib...]   [@command-file]   [/link   link-opt...]   
下表说明CL   命令的输入项意义

    
option     一个或多个   CL   选项。请注意，所有选项都应用于所有指定的源文件。选项是由一个正斜杠   (/)   或一个短划线   (–)   指定的。如果某个选项带有参数，则该选项的说明指定在选项和参数之间是否允许有空格。选项名（/HELP   选项除外）区分大小写。有关更多信息，请参阅   CL   选项的顺序。  

    
file    一个或多个源文件、.obj   文件或库的名称。CL   编译源文件并将   .obj   文件和库的名称传递给链接器。有关更多信息，请参阅   CL   文件名语法。

lib     一个或多个库名。CL   将这些名称传递给链接器。     
    
command-file   包含多个选项和文件名的文件。有关更多信息，请参阅   CL   命令文件。     
    
link-opt   一个或多个链接器选项。CL   将这些选项传递给链接器。

您可以指定任意数目的选项、文件名和库名，条件是命令行上的字符数不超过   1024，该限制是操作系统指定的。 

 

 

编译器

注意，所有编译器选项都区分大小写。

若要编译但不链接，请使用   /c。

使用   NMAKE   生成输出文件。     
使用   BSCMAKE   支持类浏览。

以下是一个完整的编译器选项分类列表。

 

一、优化     
  选项             作用     
  /O1    创建小代码     
  /O2    创建快速代码     
  /Oa    假设没有别名     
  /Ob    控制内联展开     
  /Od    禁用优化     
  /Og    使用全局优化     
  /Oi    生成内部函数     
  /Op    改善浮点数一致性     
  /Os    代码大小优先     
  /Ot    代码速度优先     
  /Ow    假定在函数调用中使用别名     
  /Ox    使用最大优化   (/Ob1gity   /Gs)     
  /Oy    省略框架指针

 

二、代码生成     
  选项     作用     
  /clr    启用C++ 的托管扩展并产生在公共语言运行库上运行的输出文件     
  /EH    指定异常处理模型     
  /G3    优化代码以优选386处理器。在Visual C++ 5.0中已经停用，编译器将忽略此选项     
  /G4    优化代码以优选486处理器。在Visual C++ 5.0中已经停用，编译器将忽略此选项     
  /G5    优化代码以优选Pentium     
  /GB    与/G6等效；将 _M_IX86的值设置为600     
  /Gd    使用__cdecl 调用约定     
  /Ge    激活堆栈探测     
  /GF   
  /GF    启用字符串池     
  /GH    调用挂钩函数_penter     
  /GH   调用挂钩函数_pexit     
  /GL    启用全程序优化     
  /Gm    启用最小重新生成     
  /Gr    启用运行时类型信息(RTTI)     
  /Gr    使用 __fastcall 调用约定     
  /GS    控制堆栈探测     
  /GT    支持使用静态线程本地存储区分配的数据的纤程安全     
  /GX    启用同步异常处理     
  /Gy    启用函数级链接     
  /GZ    使用   __stdcall   调用约定     
  /MD    使用   MSVCRT.lib   创建多线程   DLL     
  /MDd    使用   MSVCRTD.lib   创建调试多线程   DLL     
  /ML    使用   LIBC.lib   创建单线程可执行文件     
  /MLd    使用   LIBCD.lib   创建调试单线程可执行文件     
  /MT    使用   LIBCMT.lib   创建多线程可执行文件     
  /MTd    使用   LIBCMTD.lib   创建调试多线程可执行文件

 

三、输出文件     
  选项     作用     
  /FA    创建列表文件
  /FA    设置列表文件名          

  /Fd    重命名程序数据库文件     
  /Fe    重命名可执行文件     
  /Fm   创建映射文件     
  /Fo    创建对象文件     
  /Fp    指定预编译头文件名     
  /FR   
  /FR    生成浏览器文件     
  /Fx    将插入的代码与源文件合并

 

四、调试       
  选项     作用     
  /GS    缓冲区安全检查     
  /GZ    与   /RTC1   相同     
  /RTC    启用运行时错误检查     
  /Wp64   检测   64   位可移植性问题     
  /Yd    将完整的调试信息放在所有对象文件中     
  /Yl    创建调试库时插入   PCH   引用     
  /Z7    生成与   C   7.0   兼容的调试信息     
  /Zd    生成行号     
  /Zi    生成完整的调试信息

 

五、预处理器       
  选项     作用     
  /AI    指定在解析传递到#using   指令的文件引用时搜索的目录     
  /c     在预处理期间保留注释     
  /D    定义常数和宏     
  /E    将预处理器输出复制到标准输出     
  /EP    将预处理器输出复制到标准输出     
  /Fl    预处理指定的包含文件     
  /FU    强制使用文件名，就像它已被传递到#using   指令一样     
  /I     在目录中搜索包含文件     
  /P    将预处理器输出写入文件     
  /U    移除预定义宏     
  /U    移除所有的预定义宏     
  /X    忽略标准包含目录     
  /ZI    将调试信息包含在与“编辑并继续”兼容的程序数据库中

 

六、语言       
  选项      作用     
  /noBool    取消   C++   bool、true   和   false   关键字     
  /vd     取消或启用隐藏的   vtordisp   类成员     
  /vmb     对指向成员的指针使用最佳的基     
  /vmg     对指向成员的指针使用完全一般性     
  /vmm     声明多重继承     
  /vms     声明单一继承     
  /vmv     声明虚拟继承     
  /Za     禁用语言扩展     
  /Zc     在   /Ze   下指定标准行为     
  /Ze     启用语言扩展     
  /Zg     生成函数原型     
  /Zl     从   .obj   文件中移除默认库名     
  /Zpn     封装结构成员     
  /Zs     只检查语法

 

七、链接       
  选项     作用     
  /F    设置堆栈大小     
  /LD    创建动态链接库     
  /LDd    创建调试动态链接库     
  /link    将指定的选项传递给   LINK     
  /MD    使用   MSVCRT.lib   编译以创建多线程   DLL     
  /MDd    使用   MSVCRTD.lib   编译以创建调试多线程   DLL     
  /ML    使用   LIBC.lib   编译以创建单线程可执行文件     
  /MLd    使用   LIBCD.lib   编译以创建调试单线程可执行文件     
  /MT    使用   LIBCMT.lib   编译以创建多线程可执行文件     
  /MTd    使用   LIBCMTD.lib   编译以创建调试多线程可执行文件

 

八、预编译头       
  选项     作用     
  /Y-    忽略当前生成中的所有其他预编译头编译器选项     
  /Yc    创建预编译头文件     
  /Yd    将完整的调试信息放在所有对象文件中     
  /Yu    在生成期间使用预编译头文件     
  /YX    自动处理预编译头

 

九、杂项       
  选项     作用     
  @    指定响应文件     
  /?    列出编译器选项     
  /c     编译但不链接     
  /H    限制外部（公共）名称的长度     
  /HELP    列出编译器选项     
  /J     更改默认的   char   类型     
  /NOLOGO   取消显示登录版权标志     
  /QI0f    确保   Pentium   0F   指令没有问题     
  /QIfdiv   FDIV、FPREM、FPTAN   和   FPATAN   指令有缺陷的   Intel   Pentium   微处理器的变通方法     
  /QIfist   当需要从浮点类型转换为整型时取消   Helper   函数   _ftol   的调用    

  /showIncludes   在编译期间显示所有包含文件的列表     
  /Tc   
  /Tc    指定   C   源文件     
  /Tp   
  /Tp    指定   C++   源文件     
  /V    设置版本字符串     
  /w    设置警告等级     
  /w    禁用所有警告     
  /Wall    启用所有警告，包括默认情况下禁用的警告     
  /WL    在从命令行编译   C++   源代码时启用错误信息和警告消息的单行诊断     
  /Zm    设置编译器的内存分配限制    

 

===================================

 

LINK 用法如下：

 

/ALIGN 指定每一节的对齐方式 
/ALIGN 选项指定程序线性地址空间中每一节的对齐方式。number 参数以字节为单位，并且必须是2 的幂。默认值是 4K (4096)。如果对齐方式产生
无效的图像，则链接器发出警告。除非正
在编写诸如设备驱动程序的应用程序，否则应不需要修改对齐方式。
/DLL 生成 DLL 
/DRIVER 创建 Windows NT 核心模式驱动程序 
/EXETYPE 生成虚拟设备驱动程序 
/EXETYPE：DYNAMIC 创建动态加载的虚拟设备驱动程序。 
/EXETYPE：DEV386 创建静态加载的虚拟设备驱动程序。这是 /EXETYPE 的默认值
/INCREMENTAL 控制增量链接 
/LARGEADDRESSAWARE 通知编译器应用程序支持大于 2 GB 的地址 
/LIBPATH 允许用户重写环境库路径 
/LIBPATH："e:/VC/LIB" /LIBPATH："e:/DX/LIB"
/MACHINE 指定目标平台 
` /MACHINE:{AM33|ARM|EBC|IA64|M32R|MIPS|MIPS16|MIPSFPU|MIPSFPU16|
MIPSR41XX|SH3|SH3DSP|SH4|SH5|THUMB|X86| X64/*8.0版本*/}
/MACHINE:X86
/NOENTRY 创建纯资源 DLL 
创建纯资源 DLL 时要求 /NOENTRY 选项。
/OPT 控制 LINK 优化
如果生成仅运行于 Windows NT 或 Windows 2000 上的组件，则应使用 /OPT:NOWIN98。
/SUBSYSTEM: 指定子系统 
{CONSOLE|EFI_APPLICATION|EFI_BOOT_SERVICE_DRIVER|
EFI_ROM|EFI_RUNTIME_DRIVER|NATIVE|POSIX|WINDOWS|
WINDOWSCE}[,#[.##]]
/OUT 指定输出文件名 
/OUT:Hello.exe