AllocatedObj
  CHeapObj
    CollectedHeap
	  SharedHeap            share\vm\memory\sharedHeap.hpp
	    G1CollectedHeap     share\vm\gc_implementation\g1\g1CollectedHeap.hpp
		GenCollectedHeap    share\vm\memory\genCollectedHeap.hpp
	  ParallelScavengeHeap  share\vm\gc_implementation\parallelScavenge\parallelScavengeHeap.hpp


  void oop_since_save_marks_iterate(int level,                          \
                                    OopsInGenClosure* cur,                \
                                    OopsInGenClosure* older);                                \
  void oop_since_save_marks_iterate(int level,                          \
                                    ScanClosure* cur,                \
                                    ScanClosure* older);                                     \
  void oop_since_save_marks_iterate(int level,                          \
                                    FastScanClosure* cur,                \
                                    FastScanClosure* older);      \
  void oop_since_save_marks_iterate(int level,                          \
                                    ParScanWithBarrierClosure* cur,                \
                                    ParScanWithBarrierClosure* older);                       \
  void oop_since_save_marks_iterate(int level,                          \
                                    ParScanWithoutBarrierClosure* cur,                \
                                    ParScanWithoutBarrierClosure* older);                    \
  


void GenCollectedHeap::                                                 \
oop_since_save_marks_iterate(int level,                                 \
                             OopsInGenClosure* cur,                       \
                             OopsInGenClosure* older) {                   \
  _gens[level]->oop_since_save_marks_iterate_v(cur);           \
  for (int i = level+1; i < n_gens(); i++) {                            \
    _gens[i]->oop_since_save_marks_iterate_v(older);           \
  }                                                                     \
}                                \
  void GenCollectedHeap::                                                 \
oop_since_save_marks_iterate(int level,                                 \
                             ScanClosure* cur,                       \
                             ScanClosure* older) {                   \
  _gens[level]->oop_since_save_marks_iterate_nv(cur);           \
  for (int i = level+1; i < n_gens(); i++) {                            \
    _gens[i]->oop_since_save_marks_iterate_nv(older);           \
  }                                                                     \
}                                     \
  void GenCollectedHeap::                                                 \
oop_since_save_marks_iterate(int level,                                 \
                             FastScanClosure* cur,                       \
                             FastScanClosure* older) {                   \
  _gens[level]->oop_since_save_marks_iterate_nv(cur);           \
  for (int i = level+1; i < n_gens(); i++) {                            \
    _gens[i]->oop_since_save_marks_iterate_nv(older);           \
  }                                                                     \
}      \
  void GenCollectedHeap::                                                 \
oop_since_save_marks_iterate(int level,                                 \
                             ParScanWithBarrierClosure* cur,                       \
                             ParScanWithBarrierClosure* older) {                   \
  _gens[level]->oop_since_save_marks_iterate_nv(cur);           \
  for (int i = level+1; i < n_gens(); i++) {                            \
    _gens[i]->oop_since_save_marks_iterate_nv(older);           \
  }                                                                     \
}                       \
  void GenCollectedHeap::                                                 \
oop_since_save_marks_iterate(int level,                                 \
                             ParScanWithoutBarrierClosure* cur,                       \
                             ParScanWithoutBarrierClosure* older) {                   \
  _gens[level]->oop_since_save_marks_iterate_nv(cur);           \
  for (int i = level+1; i < n_gens(); i++) {                            \
    _gens[i]->oop_since_save_marks_iterate_nv(older);           \
  }                                                                     \
}                    \
  
