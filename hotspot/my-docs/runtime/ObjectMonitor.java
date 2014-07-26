inline void ObjectMonitor::AddWaiter(ObjectWaiter* node) {
  assert(node != NULL, "should not dequeue NULL node");
  assert(node->_prev == NULL, "node already in list");
  assert(node->_next == NULL, "node already in list");
  // put node at end of queue (circular doubly linked list)
  if (_WaitSet == NULL) {
    _WaitSet = node;
    node->_prev = node;
    node->_next = node;
  } else {
    ObjectWaiter* head = _WaitSet ;
    ObjectWaiter* tail = head->_prev;
    assert(tail->_next == head, "invariant check");
    tail->_next = node;
    head->_prev = node;
    node->_next = head;
    node->_prev = tail;
  }
}

生成一个双向循环链表，_WaitSet指向node1


增加node1

_WaitSe = node1

node->_prev = node1
node->_next = node1


增加node2
head = tail = node1

node1->_next = node2
node1->_prev = node2


node2->_next = node1
node2->_prev = node1


增加node3

head = node1
tail = node2

node2->_next = node3
node1->_prev = node3

node3->_next = node1
node3->_prev = node2