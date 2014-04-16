@echo off

javac -encoding UTF-8 HelloWorld.java
javah -encoding UTF-8 HelloWorld
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD HelloWorld.c -FeHelloWorld.dll

java HelloWorld

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
