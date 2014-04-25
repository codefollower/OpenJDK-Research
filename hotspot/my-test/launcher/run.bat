@echo off
javac ..\classes\TestLauncher.java

cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 *.c E:\openjdk\debug\build\vs-i486\compiler1\debug\jvm.lib /DDEBUG /Zi /Fdlauncher.pdb

set destination=..\build
if not exist %destination% (
mkdir %destination%
)
del /Q ..\build\*.*

copy /Y *.obj %destination%
copy /Y *.ilk %destination%
copy /Y *.pdb %destination%
copy /Y *.exe %destination%

echo ********************************
echo *        Running...            *
echo ********************************

set path=E:\openjdk\debug\build\vs-i486\compiler1\debug;%path%

launcher -Djava.class.path=E:\openjdk\git\hotspot\my-test\classes TestLauncher

if "%1" == "" (
del *.obj *.exe *.ilk *.pdb 
)