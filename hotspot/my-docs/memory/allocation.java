AllocatedObj
  CHeapObj
    Chunk
	Arena
	  ResourceArea 在share\vm\memory\resourceArea.hpp
	DeoptResourceMark 在share\vm\memory\resourceArea.hpp
  StackObj
    AllocStats
	ReallocMark
	ResourceMark 在share\vm\memory\resourceArea.hpp
  ResourceObj

enum MemoryType
  
_ValueObj
  ArrayAllocator

MetaspaceObj

AllStatic
  它的子类的方法都是static，并且没有构造函数
