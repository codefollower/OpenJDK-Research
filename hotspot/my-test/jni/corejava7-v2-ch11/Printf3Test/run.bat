@echo off

javac -encoding UTF-8 *.java
javah -encoding UTF-8 Printf3

rem cl生成pdb文件的用法参见http://msdn.microsoft.com/zh-cn/library/9wst99a9.aspx
rem 只用一个/Fd时生成printf3.pdb，文件名是小写开头
rem cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -FePrintf3.dll /DDEBUG /Zi /FdPrintf3.pdb
rem 用两个/Fd时才是Printf3.pdb
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -FePrintf3.dll /DDEBUG /Zi /Fd/FdPrintf3.pdb 

java Printf3Test

del *.obj *.lib *.dll *.exp *.h *.class *.ilk *.pdb

rem del *.obj *.lib *.dll *.exp *.class
