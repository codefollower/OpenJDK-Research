@echo off

javac -encoding UTF-8 *.java
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32  *.c %JAVA_HOME%\lib\jvm.lib

set path=%JAVA_HOME%\jre\bin\client\;%path%

InvocationTest

del *.obj *.lib *.dll *.exp *.h *.class *.exe

