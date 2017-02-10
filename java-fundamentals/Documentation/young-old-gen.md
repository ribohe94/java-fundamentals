# Young & Old Generation

 ![alt text](http://cdn.journaldev.com/wp-content/uploads/2014/05/Java-Memory-Model.png)

 As you can see in the above image, JVM memory is divided into separate parts. At broad level, JVM Heap memory is physically divided into two parts – Young Generation and Old Generation.

## Young Generation
Young generation is the place where all the new objects are created. When young generation is filled, garbage collection is performed. This garbage collection is called Minor GC. Young Generation is divided into three parts – Eden Memory and two Survivor Memory spaces.

Important Points about Young Generation Spaces:

* Most of the newly created objects are located in the Eden memory space.
* When Eden space is filled with objects, Minor GC is performed and all the survivor objects are moved to one of the survivor spaces.
* Minor GC also checks the survivor objects and move them to the other survivor space. So at a time, one of the survivor space is always empty.
* Objects that are survived after many cycles of GC, are moved to the Old generation memory space. Usually it’s done by setting a threshold for the age of the young generation objects before they become eligible to promote to Old generation. 

## Old Generation
Old Generation memory contains the objects that are long lived and survived after many rounds of Minor GC. Usually garbage collection is performed in Old Generation memory when it’s full. Old Generation Garbage Collection is called Major GC and usually takes longer time.
