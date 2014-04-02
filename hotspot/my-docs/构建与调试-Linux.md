## 构建HotSpot

这里以64位Ubuntu 12.04为例，<br>
先确认gcc、gdb、make这些命令是否可用，<br>
如果系统提示找不到这些命令，你需要先装好这些工具，这里就不介绍怎么安装这些工具了。<br>

用Git clone源代码<br>
    ```
git clone https://github.com/codefollower/HotSpot-Research.git
    ```
<br>
假设你把HotSpot源代码放到了/home/zhh/hotspot目录(请根据你的实际情况调整这个目录名）<br>

构建HotSpot需要事先安装一个JDK，JDK1.6/1.7都可以，<br>
然后配置环境变量JAVA_HOME指向JDK的安装目录，<br>
接着切换到/home/zhh/hotspot/make目录，运行下面的命令:<br>
    ```
make jvmg ALT_BOOTDIR=$JAVA_HOME ALT_JDK_IMPORT_PATH=$JAVA_HOME ARCH_DATA_MODEL=64 LANG=C SKIP_FASTDEBUG_BUILD=false
    ```
<br>
第一次构建通常要花20到30分钟，<br>
构建好的文件都在/home/zhh/hotspot/build/linux/linux_amd64_compiler2目录里，<br>
切换到/home/zhh/hotspot/build/linux/linux_amd64_compiler2/jvmg目录运行下面的命令:<br>
    ```
gamma -version
    ```
<br>
看到类似下面的信息就表示成功了：<br>
    ```
OpenJDK 64-Bit Server VM (build 24.0-b56-internal-jvmg, mixed mode)
    ```

<strong>
<br>
注意在调试前记得把/home/zhh/hotspot/build/linux/linux_amd64_compiler2/jvmg/libjvm.diz文件中的内容 <br>
解压出来放到与它平级的目录中，否则无法在一些文件中打断点。
</strong>


## 调试HotSpot


打开[Eclipse下载页面](https://www.eclipse.org/downloads/)<br>
选择Eclipse IDE for C/C++ Developers，使用Linux 64 Bit版本，<br>
解压后就可以双击里面的eclipse文件直接运行啦，<br>
如果提示下面的错误：<br>
    ```
must be available in order to run Eclipse. No Java virtual machine
    ```
<br>打开eclipse.ini文件，在文件开头输入下面两行再重新运行<br><br>
    ```
-vm
    ```
    <br>
    ```
$JAVA_HOME/bin/java （注：把$JAVA_HOME换成你的实际目录名）
    ```


<br>
打开eclipse后，选择File -> Import -> Existing Code as Makefile Project <br>
按next，Project Name设为hotspot，Existing Code Location是/home/zhh/hotspot <br>
Toolchain那里选Linux GCC，然后按Finish。<br><br>

接着在eclipse左边的Project Explorer中右击hotspot项目，<br>
选择Debug As -> Debug Configurations，<br>
双击左边的C/C++ Application, 会在下方生成hotspot子项，<br>
点一下hotspot子项，<br>
在右边的Main -> C/C++ Application中填入/home/zhh/hotspot/build/linux/linux_amd64_compiler2/jvmg/gamma <br>
在Arguments -> Program arguments中输入<br>
-cp /home/zhh/hotspot/build/linux/linux_amd64_compiler2/jvmg Queens <br>
上面的gamma就相当于java命令，Queens是hotspot项目中自带的一个Java测试例子，<br>
然后在Environment那里增加两个环境变量<br>
JAVA_HOME 指向之前安装的jdk的目录<br>
LD_LIBRARY_PATH 是/home/zhh/hotspot/build/linux/linux_amd64_compiler2/jvmg<br><br>

然后点Apply和Close按钮。<br>

接着在Eclipse中打开hotspot项目中的src/share/tools/launcher/java.c文件，<br>
在main函数（229行）双击左边栏打个断点，<br>
打开src/share/vm/runtime/thread.cpp文件，<br>
在create_vm函数（3272行）双击左边栏再打个断点，<br>

最后在eclipse上方的toolbar中点一下那个“臭虫”图标，选择hotspot就能调试了，<br>
按两次F8键就能转到thread.cpp文件的create_vm函数。

