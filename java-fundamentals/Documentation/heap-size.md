## Java Heap Size
Java applications are only allowed to use a limited amount of memory. This limit is specified during application startup. To make things more complex, Java memory is separated into two different regions. These regions are called Heap space and Permgen (for Permanent Generation):
Inline-style:

![alt text](https://plumbr.eu/wp-content/uploads/2014/04/java-lang-outofmemoryerror-java-heap-space.png "Logo Title Text 1")

The size of those regions is set during the Java Virtual Machine (JVM) launch and can be customized by specifying JVM parameters -Xmx and -XX:MaxPermSize. If you do not explicitly set the sizes, platform-specific defaults will be used.
The java.lang.OutOfMemoryError: Java heap space error will be triggered when the application attempts to add more data into the heap space area, but there is not enough room for it.
Note that there might be plenty of physical memory available, but the java.lang.OutOfMemoryError: Java heap space error is thrown whenever the JVM reaches the heap size limit.
## What is causing it?
* **Spikes in usage/data volume.** The application was designed to handle a certain amount of users or a certain amount of data. When the number of users or the volume of data suddenly spikes and crosses that expected threshold, the operation which functioned normally before the spike ceases to operate and triggers the java.lang.OutOfMemoryError: Java heap space error.
* **Memory leaks.** A particular type of programming error will lead your application to constantly consume more memory. Every time the leaking functionality of the application is used it leaves some objects behind into the Java heap space. Over time the leaked objects consume all of the available Java heap space and trigger the already familiar java.lang.OutOfMemoryError: Java heap space error.
## Permanent Generation
 Our JVM also has an internal representation of the Java classes and those are stored in the permanent generation. That relationship is shown in the figure below.

 ![alt text](https://blogs.oracle.com/jonthecollector/resource/permGenObj.jpg "Logo Title Text 1")

 The internal representation of a Java object and an internal representation of a Java class are very similar. From this point on let me just call them Java objects and Java classes and you'll understand that I'm referring to their internal representation. The Java objects and Java classes are similar to the extent that during a garbage collection both are viewed just as objects and are collected in exactly the same way. So why store the Java objects in a separate permanent generation? Why not just store the Java classes in the heap along with the Java objects?

Well, there is a philosophical reason and a technical reason. The philosophical reason is that the classes are part of our JVM implementation and we should not fill up the Java heap with our data structures. The application writer has a hard enough time understanding the amount of live data the application needs and we shouldn't confuse the issue with the JVM's needs.

The technical reason comes in parts. Firstly the origins of the permanent generation predate my joining the team so I had to do some code archaeology to get the story straight (thanks Steffen for the history lesson).

Originally there was no permanent generation. Objects and classes were just stored together.

Back in those days classes were mostly static. Custom class loaders were not widely used and so it was observed that not much class unloading occurred. As a performance optimization the permanent generation was created and classes were put into it. The performance improvement was significant back then. With the amount of class unloading that occur with some applications, it's not clear that it's always a win today.
