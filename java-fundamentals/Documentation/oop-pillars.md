### Abstraction
Abstraction is the process of exposing the essential feature of an entity while hiding irrelevant detail. This reduces the complexity of the program and becomes easier to read.
The essence of abstraction is preserving relevant information within a given context and forgetting irrelevant information in that context. Abstraction in java is achieved by using interface and abstract class. Interface give 100% abstraction and abstract class give 0-100% abstraction.Abstraction in java is achieved by using interface and abstract class. Interface give 100% abstraction and abstract class give 0-100% abstraction.

    public class Main{
    	public static void main(String args[]){
            TwoWheeler test = new Honda();
            test.run();
        }
    }
    abstract  class TwoWheeler {
        public abstract void run();
    }
    class Honda extends TwoWheeler{
    	public void run(){
    		System.out.println("Running..");
    	}
    }

### Encapsulation
Is when you hide module's internal data and other internal components from other modules. This also works to restrict data access to certain properties or components.
_Encapsulation is not data hiding, but leads to data hiding_

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
### Inheritance
As the name implies it is the transferral of all components from the parent class to the child class. This acts as a way for the child class to acquire the components and behavior of the parent class.
### Polymorphism
As the name suggests, polymorphism results in different shapes for an object. What does this mean? This means that we can obtain different behaviors of a class based on the input it receives. Polymorphism can be achieved through two main processes, method overloading and method overriding.
