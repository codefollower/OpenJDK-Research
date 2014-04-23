@echo off

rem cl /D "_X86_" -I . -I ..\agent_util -I ..\java_crw_demo -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -I E:\openjdk\jdk8\jdk\src\windows\javavm\export -I E:\openjdk\jdk8\jdk\src\share\npt -I E:\openjdk\jdk8\jdk\src\windows\npt -LD *.c ..\agent_util\*.c ..\java_crw_demo\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb wsock32.lib winmm.lib

cl /D "_X86_" -I . -I ..\agent_util -I ..\java_crw_demo -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -I include\javavm\export -I include\npt -I include\npt-windows -LD *.c ..\agent_util\*.c ..\java_crw_demo\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb wsock32.lib winmm.lib

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