@echo off

cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -Fejava_crw_demo.dll /DDEBUG /Zi /Fdjava_crw_demo.pdb 

if "%1" == "" (
del *.obj *.lib *.dll *.exp *.ilk *.pdb
)