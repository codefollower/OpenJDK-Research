@echo off

rem cl /O1 /MD /D _STATIC_CPPLIB /c -I. -I ..\agent_util -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.cpp ..\agent_util\*.c
link /dll /opt:REF /out:waiters.dll *.obj

rem java -agentlib:waiters=help -version

rem cl /O1 /MD /D _STATIC_CPPLIB /c -I. -I ..\agent_util -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.cpp *.c ..\agent_util\*.c
link /dll /opt:REF /out:myagent.dll *.obj

cl -I . -I ..\agent_util -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.cpp ..\agent_util\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb 


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


del *.obj *.lib *.dll *.exp *.class *.ilk *.pdb


if "%1" == "del" goto del
goto end

:del
del *.obj *.lib *.dll *.exp *.class *.ilk *.pdb

:end
