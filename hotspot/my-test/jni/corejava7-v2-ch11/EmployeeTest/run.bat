@echo off

javac -encoding UTF-8 *.java
javah -encoding UTF-8 Employee
cl -I . -I %JAVA_HOME%\include -I %JAVA_HOME%\include\win32 -LD *.c -FeEmployee.dll

java EmployeeTest

del *.obj *.lib *.dll *.exp *.h *.class

rem del *.obj *.lib *.dll *.exp *.class
