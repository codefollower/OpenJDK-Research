@echo off

javac -encoding UTF-8 *.java
rem javah -encoding UTF-8 Mtrace

cl /O1 /MD /D _STATIC_CPPLIB /c -I. -I ..\agent_util -I ..\java_crw_demo -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.cpp *.c ..\agent_util\*.c ..\java_crw_demo\*.c

link /dll /opt:REF /out:myagent.dll *.obj

java -agentlib:myagent=help -version

rem del *.obj *.lib *.dll *.exp Mtrace.h *.class

del *.obj *.lib *.dll *.exp *.class