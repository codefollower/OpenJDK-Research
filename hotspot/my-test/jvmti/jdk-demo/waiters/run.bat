@echo off

rem cl /O1 /MD /D _STATIC_CPPLIB /c -I. -I ..\agent_util -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.cpp ..\agent_util\*.c
link /dll /opt:REF /out:waiters.dll *.obj

rem java -agentlib:waiters=help -version

cl /O1 /MD /D _STATIC_CPPLIB /c -I. -I ..\agent_util -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.cpp *.c ..\agent_util\*.c
link /dll /opt:REF /out:myagent.dll *.obj

java -agentlib:myagent=help -version

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
