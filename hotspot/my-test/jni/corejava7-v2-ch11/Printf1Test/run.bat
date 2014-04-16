@echo off

javac -encoding UTF-8 *.java
javah -encoding UTF-8 Printf1
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -FePrintf1.dll

java Printf1Test

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
