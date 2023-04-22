## Linked List Application
- Operation system uses almost the important data structure. Let's talk about the real-world applications of linked list:

### 1.Low level memory management
- Linked lists are important in low level memory management when deadling with C programming **`malloc()`** and **`free()`** functions
- With these built-in functions we can mananipulate the heap memory

```c
char* chart_ptr = (char*) malloc(30); // allocates 30 bytes for memory in the heap
```

### 2.Application in Windows
- The **PhotoViewer** application is another example of linked lists
  - Next photo: next node in the linked list
  - Previous photo: previous node in the linked list

### 3.BLockchains (BitCoin)
- The blockchain is basically a simple linked list where blocks are cryptographically linked together
- so the blockchain itself is a linked list with hash-pointers
- every node in the blockchain has 2 hash values: own hash and the hash value of the previous block
