//生成带debug的dll
//cl /LDd Math.c

//dumpbin /EXPORTS Math.dll

//dumpbin /IMPORTS Math.dll

__declspec(dllexport) double Add(double a, double b) {
  return a + b;
}

__declspec(dllexport) double Sub(double a, double b) {
  return a - b;
}

__declspec(dllexport) double Mul(double a, double b) {
  return a * b;
}