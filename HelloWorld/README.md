### Collections
| <b>Interface</b> | <b>Implementation</b> |
|------------------|:---------------------:|
| Collection       |       ArrayList       |
| List             |       ArrayList       |160 Summary
| Queue            |      ArrayDeque       |
| Set              |        HashSet        |
| Map              |        HashMap        |

###

**Functional Interface**
- An interface with a single abstract method

**Built in Functional Interfaces**
- **Consumer** : `void consume(obj)`
- **Supplier** : `obj supply()`
- **Function** : `obj map(obj)`
- **Predicate** : `bool test(codition)`


---
- Key terms and concepts 
- Working with threads 
- Concurrency issues 
- Synchronization 
- Volatile fields 
- Atomic objects

---
### Strategies for Thread Safety
- **Confinement**: Mỗi thread có biến cục bộ, sau khi tính toán thay đổi sẽ gộm lại
- **Immutability**: Chỉ đọc không cho thay đổi, khi thay đổi thì tạo biến mới
- **Synchronization**: Ngăn chặn các thread truy cập 1 đối tượng cùng lúc
- **Atomic objects**
- **Partitioning**






