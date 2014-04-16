@echo off

javac -encoding UTF-8 *.java
javah -encoding UTF-8 Win32RegKey
javah -encoding UTF-8 Win32RegKeyNameEnumeration

cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c advapi32.lib -FeWin32RegKey.dll

java Win32RegKeyTest

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
