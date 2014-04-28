@echo off
rem if not exist ApiTest.class (
javac -encoding UTF-8 *.java
rem )
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -I ..\jdk-demo\agent_util -LD *.c ..\jdk-demo\agent_util\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb 

set destination=..\..\build
if not exist %destination% (
mkdir %destination%
)
rem del /Q ..\..\build\*.*

copy /Y *.obj %destination%
copy /Y *.lib %destination%
copy /Y *.dll %destination%
copy /Y *.exp %destination%
copy /Y *.pdb %destination%
copy /Y *.ilk %destination%

echo ********************************
echo *        Running...            *
echo ********************************

java -server -agentlib:myagent=help -Djava.class.path=E:\openjdk\git\hotspot\my-test\classes;E:\openjdk\git\hotspot\my-test\jvmti\api-test ApiTest

if "%1" == "" (
del *.obj *.lib *.dll *.exp *.ilk *.pdb
)