## Object class in Java
The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.

The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, know as upcasting.

Let's take an example, there is getObject() method that returns an object but it can be of any type like Employee,Student etc, we can use Object class reference to refer that object. For example:

|Method|Description|
|----|----|
|public final Class getClass()|The getClass method is a final method (cannot be overridden) that returns a runtime representation of the class of this object. This method returns a Class object. You can query the Class object for a variety of information about the class, such as its name, its superclass, and the names of the interfaces that it implements.|
|public int hashCode()|	returns the hashcode number for this object.|
|public boolean equals(Object obj)| This method returns true if the objects are equal, false otherwise. Note that equality does not mean that the objects are the same object.|
|protected Object clone() throws CloneNotSupportedException|creates and returns the exact copy (clone) of this object.|
|public String toString()|The String representation for an object is entirely dependent on the object. The String representation of an Integer object is the integer value displayed as text. The String representation of a Thread object contains various attributes about the thread, such as its name and priority.|
|public final void notify()|wakes up single thread, waiting on this object's monitor.|
|public final void notifyAll()|wakes up all the threads, waiting on this object's monitor.|
|public final void wait(long timeout)throws InterruptedException|causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).|
|public final void wait(long timeout,int nanos)throws InterruptedException|causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).|
|public final void wait()throws InterruptedException|causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).|
|protected void finalize()throws Throwable|is invoked by the garbage collector before object is being garbage collected.|
