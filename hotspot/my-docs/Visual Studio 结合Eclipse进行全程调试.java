
方法好简单:

先参考:
《在Windows中构建OpenJDK8u已经很简单了》[url]http://hllvm.group.iteye.com/group/topic/41271[/url]
构建出一个可调试的HotSpot VM

1. Visual Studio端的配置

在Visual Studio左边的Solution Explorer窗口中右击jvm项目，
在弹出菜单中选择Properties，紧接着出来"jvm Property Pages"窗口，
点Configuration Properties -> Debugging 
在Command Arguments那里输入java.exe的相关参数，
例如你的java程序名是my.Test，代码如下:
package my.test;

public class Test {
    public static void main(String[] args) throws Exception {
        Thread.sleep(2000);
    }
}
类路径是E:\mytest，并且启用远程debug，
则Command Arguments的内容如下:

-XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma -agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=y -cp E:\mytest my.Test 

其中的"-XXaltjvm=$(TargetDir) -Dsun.java.launcher=gamma"是在构建HotSpot VM自动加入的，
HotSpot VM内部需要这些参数，你不需要在意它。

按"确定"保存好配置后，点DEBUG -> Start Debugging菜单就开始以调试模式运行了，
同时会弹出一个Dos窗口，显示出下面的字符串:
Listening for transport dt_socket at address: 8000

此时在Visual Studio中打开jvm\share\vm\prims\jvm.cpp，
在JVM_Sleep方法中打个断点。


2. Eclipse端的配置

在Eclipse这一边打开my.Test类，在Thread.sleep(2000)那行打个断点，
右击代码编辑区，在弹出菜单中选择Debug As -> Debug Configurations
然后在Debug Configurations窗口左边双击最下面的Remote Java Application，
此时在Remote Java Application下面会多出一个叫Test的子目录，
点击右边的Debug按钮就可以调试了。

在Eclipse中会先在Thread.sleep(2000)那一行停下来，
然后按F6后，在Visual Studio那边会停在JVM_Sleep方法中。

为了防止Eclipse中总是出现超时，
可以点击Window>Preferences>Java>Debug，在Communication里把两个timeout值调大。


