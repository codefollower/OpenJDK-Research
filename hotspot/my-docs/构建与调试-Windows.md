这里以32位Windows 7为例

## 安装必须的软件

[JDK1.6或1.7](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)<br>
[Cygwin](http://www.cygwin.com/install.html)<br>
[Microsoft Visual Studio 2010](http://www.microsoft.com/visualstudio/zh-cn/products/2010-editions)<br>

这里就不介绍怎么安装这些软件了，假设安装后的目录名分别是: <br>
(请根据你的实际情况调整这些目录名）<br>

D:\JavaSE1.7 <br>
D:\Cygwin <br>
D:\VS2010 <br>

增加环境变量JAVA_HOME指向D:\JavaSE1.7，<br>
并把D:\JavaSE1.7\bin;D:\Cygwin\bin;D:\VS2010\VC\bin加到Path环境变量。

## 下载源代码

用Git clone源代码<br>
    ```
git clone https://github.com/codefollower/HotSpot-Research.git
    ```
<br>
假设顶层目录是 D:\hotspot (请根据你的实际情况调整这个目录名）<br>

## 生成Visual Studio项目

打开一个命令行窗口，切换到D:\hotspot\make\windows目录，运行下面的命令:<br>

D:\VS2010\Common7\Tools\vsvars32.bat <br>
set HOTSPOTMKSHOME=D:\Cygwin\bin <br>
create D:\JavaSE1.7 <br>

会在D:\hotspot\build\vs-i486目录中生成Visual Studio项目文件

## 导入项目

运行Microsoft Visual Studio 2010，
按Ctrl + Shift + O，打开D:\hotspot\build\vs-i486\jvm.vcxproj，
然后右击左边的jvm项目名，选择Build就可以构建jvm了。

## 调试JVM

在Visual Studio 2010中打开jvm\share\vm\runtime\thread.cpp文件，
在create_vm方法中(3269行)打个断点，然后按F5就可以了。

TODO: 目前无法在share\tools\launcher\java.c文件中打断点。
