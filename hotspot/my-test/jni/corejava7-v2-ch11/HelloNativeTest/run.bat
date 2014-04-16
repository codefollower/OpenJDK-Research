@echo off

javac -encoding UTF-8 *.java
javah -encoding UTF-8 HelloNative
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -FeHelloNative.dll

java HelloNativeTest

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
