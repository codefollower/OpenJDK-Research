//要顺序执行下面的步骤:

//1. 编译java源文件
//javac -encoding UTF-8 HelloWorld.java

//2. 生成头文件
//javah -encoding UTF-8 HelloWorld

//3. 生成动态库
//linux:
//gcc -fPIC -I$JAVA_HOME/include -I$JAVA_HOME/include/linux -shared -o libHelloWorld.so HelloWorld.c

//windows:
//cl -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD HelloWorld.c -FeHelloWorld.dll

//4. 最后运行:
//java HelloWorld

class HelloWorld {

    private native void print();

    public static void main(String[] args) {
        new HelloWorld().print();
    }

    static {
        System.loadLibrary("HelloWorld");
    }
}
