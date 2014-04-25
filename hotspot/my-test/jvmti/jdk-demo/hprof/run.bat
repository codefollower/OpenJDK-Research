@echo off

rem javac -encoding UTF-8 *.java
rem jar -cvf myagent.jar *.class

rem javac -encoding UTF-8 my/*.java
rem jar -cvf myagent.jar my

javac -encoding UTF-8 com/sun/demo/jvmti/hprof/*.java
jar -cvf myagent.jar com

cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD ..\java_crw_demo\*.c -Fejava_crw_demo.dll /DDEBUG /Zi /Fdjava_crw_demo.pdb

cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -I include\npt -I include\npt-windows -LD include\npt\*.c include\npt-windows\*.c -Fenpt.dll /DDEBUG /Zi /Fdnpt.pdb

rem cl /D "_X86_" /D "SKIP_NPT" -I . -I ..\java_crw_demo -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -I include\javavm\export -I include\npt -I include\npt-windows -LD *.c ..\java_crw_demo\*.c include\npt\*.c include\npt-windows\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb wsock32.lib winmm.lib

cl /D "_X86_" -I . -I ..\java_crw_demo -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -I include\javavm\export -I include\npt -I include\npt-windows -LD *.c ..\java_crw_demo\*.c include\npt\*.c include\npt-windows\*.c -Femyagent.dll /DDEBUG /Zi /Fdmyagent.pdb wsock32.lib winmm.lib


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
copy /Y jvm.hprof.txt %destination%

echo ********************************
echo *        Running...            *
echo ********************************

rem java -agentlib:myagent=help -version

java -Dmy.library.path=. -Xbootclasspath/a:myagent.jar -agentlib:myagent=heap=sites -version

rem java -Xbootclasspath/a:myagent.jar -agentlib:myagent=heap=sites -version

if "%1" == "" (
del *.obj *.lib *.dll *.exp *.ilk *.pdb *.jar *.class java.hprof.txt
)