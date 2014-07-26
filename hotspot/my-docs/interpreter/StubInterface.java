//DEF_STUB_INTERFACE宏在src\share\vm\code\stubs.hpp

//InterpreterCodeletInterface在src\share\vm\interpreter\interpreter.hpp
//DEF_STUB_INTERFACE(InterpreterCodelet);
class InterpreterCodeletInterface: public StubInterface {            
   private:                                                
    static InterpreterCodelet*    cast(Stub* self)         { return (InterpreterCodelet*)self; }                 
                                                           
   public:                                                 
    /* Initialization/finalization */                      
    virtual void    initialize(Stub* self, int size,       
                               CodeStrings& strings)       { cast(self)->initialize(size, strings); } 
    virtual void    finalize(Stub* self)                   { cast(self)->finalize(); }             
                                                           
    /* General info */                                     
    virtual int     size(Stub* self) const                 { return cast(self)->size(); }          
    virtual int     code_size_to_size(int code_size) const { return InterpreterCodelet::code_size_to_size(code_size); } 
                                                           
    /* Code info */                                        
    virtual address code_begin(Stub* self) const           { return cast(self)->code_begin(); }    
    virtual address code_end(Stub* self) const             { return cast(self)->code_end(); }      
                                                           
    /* Debugging */                                        
    virtual void    verify(Stub* self)                     { cast(self)->verify(); }               
    virtual void    print(Stub* self)                      { cast(self)->print(); }                
  };

//ICStubInterface在src\share\vm\code\icBuffer.cpp
//DEF_STUB_INTERFACE(ICStub);
class ICStubInterface: public StubInterface {            
   private:                                                
    static ICStub*    cast(Stub* self)                     { return (ICStub*)self; }                 
                                                           
   public:                                                 
    /* Initialization/finalization */                      
    virtual void    initialize(Stub* self, int size,       
                               CodeStrings& strings)       { cast(self)->initialize(size, strings); } 
    virtual void    finalize(Stub* self)                   { cast(self)->finalize(); }             
                                                           
    /* General info */                                     
    virtual int     size(Stub* self) const                 { return cast(self)->size(); }          
    virtual int     code_size_to_size(int code_size) const { return ICStub::code_size_to_size(code_size); } 
                                                           
    /* Code info */                                        
    virtual address code_begin(Stub* self) const           { return cast(self)->code_begin(); }    
    virtual address code_end(Stub* self) const             { return cast(self)->code_end(); }      
                                                           
    /* Debugging */                                        
    virtual void    verify(Stub* self)                     { cast(self)->verify(); }               
    virtual void    print(Stub* self)                      { cast(self)->print(); }                
  };