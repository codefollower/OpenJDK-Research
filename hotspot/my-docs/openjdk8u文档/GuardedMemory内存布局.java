0x004181E8  ab ab ab ab ab ab ab ab  
0x004181F0  ab ab ab ab ab ab ab ab  
0x004181F8  18 00 00 00 00 00 00 00  
0x00418200  f1 f1 f1 f1 f1 f1 f1 f1  
0x00418208  f1 f1 f1 f1 f1 f1 f1 f1  
0x00418210  f1 f1 f1 f1 f1 f1 f1 f1  
0x00418218  ab ab ab ab ab ab ab ab  
0x00418220  ab ab ab ab ab ab ab ab 


24字节的GuardHeader = 16字节的Guard + 4字节的size + 4字节的tag

在上面的内存快照中0x004181E8-0x004181F0是前面的16字节的Guard
0x00418218-0x00418220是后面16字节的Guard
0x004181F8  18 00 00 00 00 00 00 00 前面4字节是size，后4字节是tag
0x00418200-0x00418210是MallocHeader+真实的用户数据，
其中0x00418200开始的8字节又是MallocHeader
0x00418208是真实返回的地址


0x004181E8  ab ab ab ab ab ab ab ab  
0x004181F0  ab ab ab ab ab ab ab ab  
0x004181F8  18 00 00 00 00 00 00 00  
0x00418200  10 00 00 c0 06 00 30 00  //MallocHeader
0x00418208  f1 f1 f1 f1 f1 f1 f1 f1  
0x00418210  f1 f1 f1 f1 f1 f1 f1 f1  
0x00418218  ab ab ab ab ab ab ab ab  
0x00418220  ab ab ab ab ab ab ab ab

