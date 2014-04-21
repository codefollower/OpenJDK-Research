@echo off

cl -I . -I ..\agent_util -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c ..\agent_util\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb 

set destination=..\..\..\build
if not exist %destination% (
mkdir %destination%
)
del /Q ..\..\..\build\*.*

copy /Y *.obj %destination%
copy /Y *.lib %destination%
copy /Y *.dll %destination%
copy /Y *.exp %destination%
copy /Y *.pdb %destination%

echo ********************************
echo *        Running...            *
echo ********************************

java -agentlib:myagent=help -version

if "%1" == "" (
del *.obj *.lib *.dll *.exp *.ilk *.pdb
)