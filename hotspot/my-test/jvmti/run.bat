@echo off

cl /O1 /MD /D _STATIC_CPPLIB /c -I. -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.c
link /dll /opt:REF /out:myagent.dll *.obj

java -agentlib:myagent=help -version

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
