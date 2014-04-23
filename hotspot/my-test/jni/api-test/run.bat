@echo off

javac -encoding UTF-8 *.java
javah -encoding UTF-8 ApiTest

set path=%JAVA_HOME%\jre\bin\client\;%path%

cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -FeApiTest.dll /DDEBUG /Zi /Fd/FdApiTest.pdb %JAVA_HOME%\lib\jvm.lib

echo ********************************
echo *        Running...            *
echo ********************************

java ApiTest

if "%1" == "" (
del *.obj *.lib *.dll *.exp *.ilk *.pdb *.class *.h
)
