@echo off

javac -encoding UTF-8 *.java
jar -cvf myagent.jar *.class

cl -I . -I ..\agent_util -I ..\java_crw_demo -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c ..\agent_util\*.c ..\java_crw_demo\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb 

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
copy /Y *.jar %destination%

echo ********************************
echo *        Running...            *
echo ********************************

rem java -Xbootclasspath/a:myagent.jar -agentlib:myagent=help -version
rem 不能用"."号，要用"/"
rem java -Xbootclasspath/a:myagent.jar -agentlib:myagent=include=java.lang.* -version
java -Xbootclasspath/a:myagent.jar -agentlib:myagent=max=3,include=java/lang/* -version

if "%1" == "" (
del *.obj *.lib *.dll *.exp *.ilk *.pdb *.class *.jar
)