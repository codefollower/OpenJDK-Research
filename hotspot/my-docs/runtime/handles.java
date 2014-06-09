class instanceHandle: public Handle {            \
   protected:                                    \
    instanceOop    obj() const                     { return (instanceOop)Handle::obj(); } \
    instanceOop    non_null_obj() const            { return (instanceOop)Handle::non_null_obj(); } \
                                                 \
   public:                                       \
    /* Constructors */                           \
    instanceHandle ()                              : Handle()                 {} \
    instanceHandle (instanceOop obj) : Handle((oop)obj) {                         \
      do {                                                                         \
		  if (!(is_null() || ((oop)obj)->is_instance())) {                                                                \
			report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.hpp", 126, "assert(" "is_null() || ((oop)obj)->is_instance()" ") failed", "illegal type");       \
			::breakpoint();                                                              \
		  }                                                                          \
      } while (0);                                                 \
    }                                                                         \
    instanceHandle (Thread* thread, instanceOop obj) : Handle(thread, (oop)obj) { \
      do {                                                                         \
		  if (!(is_null() || ((oop)obj)->is_instance())) {                                                                \
			report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.hpp", 126, "assert(" "is_null() || ((oop)obj)->is_instance()" ") failed", "illegal type");       \
			::breakpoint();                                                              \
		  }                                                                          \
	  } while (0);                \
    }                                                                         \
    \
    /* Operators for ease of use */              \
    instanceOop    operator () () const            { return obj(); } \
    instanceOop    operator -> () const            { return non_null_obj(); } \
  };


class methodHandle;                            \
  class methodHandle : public StackObj {         \
    Method*     _value;                            \
    Thread*   _thread;                           \
   protected:                                    \
    Method*        obj() const                     { return _value; } \
    Method*        non_null_obj() const            { 
	do {                                                                         \
	  if (!(_value != 0)) {                                                                \
		report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.hpp", 172, "assert(" "_value != NULL" ") failed", "resolving NULL _value");       \
		::breakpoint();                                                              \
	  }                                                                          \
	} while (0); return _value; } \
                                                 \
   public:                                       \
    /* Constructors */                           \
    methodHandle () : _value(0), _thread(0) {}   \
    methodHandle (Method* obj);                    \
    methodHandle (Thread* thread, Method* obj);    \
                                                 \
    methodHandle (const methodHandle &h);        \
    methodHandle& operator=(const methodHandle &s); \
                                                 \
    /* Destructor */                             \
    ~methodHandle ();                            \
    void remove();                               \
                                                 \
    /* Operators for ease of use */              \
    Method*        operator () () const            { return obj(); } \
    Method*        operator -> () const            { return non_null_obj(); } \
                                                 \
    bool    operator == (Method* o) const          { return obj() == o; } \
    bool    operator == (const methodHandle& h) const  { return obj() == h.obj(); } \
                                                 \
    /* Null checks */                            \
    bool    is_null() const                      { return _value == 0; } \
    bool    not_null() const                     { return _value != 0; } \
  };


inline methodHandle::methodHandle(Method* obj) : _value(obj), _thread(0) {       \
  if (obj != 0) {                                                   \
    do {                                                                         \
  if (!(((Metadata*)obj)->is_valid())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "((Metadata*)obj)->is_valid()" ") failed", "obj is valid");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);              \
    _thread = Thread::current();                                       \
    do {                                                                         \
  if (!(_thread->is_in_stack((address)this))) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_thread->is_in_stack((address)this)" ") failed", "not on stack?");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);     \
    _thread->metadata_handles()->push((Metadata*)obj);                 \
  }                                                                    \
}                                                                      \
inline methodHandle::methodHandle(Thread* thread, Method* obj) : _value(obj), _thread(thread) { \
  if (obj != 0) {                                                   \
    do {                                                                         \
  if (!(((Metadata*)obj)->is_valid())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "((Metadata*)obj)->is_valid()" ") failed", "obj is valid");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);              \
    do {                                                                         \
  if (!(_thread == Thread::current())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_thread == Thread::current()" ") failed", "thread must be current");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);    \
    do {                                                                         \
  if (!(_thread->is_in_stack((address)this))) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_thread->is_in_stack((address)this)" ") failed", "not on stack?");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);     \
    _thread->metadata_handles()->push((Metadata*)obj);                 \
  }                                                                    \
}                                                                      \
inline methodHandle::methodHandle(const methodHandle &h) {             \
  _value = h._value;                                                   \
  if (_value != 0) {                                                \
    do {                                                                         \
  if (!(_value->is_valid())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_value->is_valid()" ") failed", "obj is valid");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);                        \
    if (h._thread != 0) {                                           \
      do {                                                                         \
  if (!(h._thread == Thread::current())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "h._thread == Thread::current()" ") failed", "thread must be current");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);\
      _thread = h._thread;                                             \
    } else {                                                           \
      _thread = Thread::current();                                     \
    }                                                                  \
    do {                                                                         \
  if (!(_thread->is_in_stack((address)this))) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_thread->is_in_stack((address)this)" ") failed", "not on stack?");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);     \
    _thread->metadata_handles()->push((Metadata*)_value);              \
  } else {                                                             \
    _thread = 0;                                                    \
  }                                                                    \
}                                                                      \
inline methodHandle& methodHandle::operator=(const methodHandle &s) {  \
  remove();                                                            \
  _value = s._value;                                                   \
  if (_value != 0) {                                                \
    do {                                                                         \
  if (!(_value->is_valid())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_value->is_valid()" ") failed", "obj is valid");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);                        \
    if (s._thread != 0) {                                           \
      do {                                                                         \
  if (!(s._thread == Thread::current())) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "s._thread == Thread::current()" ") failed", "thread must be current");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);\
      _thread = s._thread;                                             \
    } else {                                                           \
      _thread = Thread::current();                                     \
    }                                                                  \
    do {                                                                         \
  if (!(_thread->is_in_stack((address)this))) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "_thread->is_in_stack((address)this)" ") failed", "not on stack?");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);     \
    _thread->metadata_handles()->push((Metadata*)_value);              \
  } else {                                                             \
    _thread = 0;                                                    \
  }                                                                    \
  return *this;                                                        \
}                                                                      \
inline void methodHandle::remove() {                                   \
  if (_value != 0) {                                                \
    int i = _thread->metadata_handles()->find_from_end((Metadata*)_value); \
    do {                                                                         \
  if (!(i!=-1)) {                                                                \
    report_vm_error("E:\\openjdk\\git\\hotspot\\src\\share\\vm\\runtime\\handles.inline.hpp", 115, "assert(" "i!=-1" ") failed", "not in metadata_handles list");       \
    ::breakpoint();                                                              \
  }                                                                          \
} while (0);                     \
    _thread->metadata_handles()->remove_at(i);                         \
  }                                                                    \
}                                                                      \
inline methodHandle::~methodHandle () { remove(); }

