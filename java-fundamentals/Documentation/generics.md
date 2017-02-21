# Generics
Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.

Generics allow you to customize a "generic" method or class to whatever type you're working with. For example, suppose you have a method that adds two numbers together. In order to work with the types themselves, you might have to create multiple versions of this method. For instance:

* public int Add(int a, int b)

* public double Add(double a, double b)

* public float Add(float a, float b)

Generics allow you to create a single method that is customized for the type that invokes it.

* public T Add<T>(T a, T b)

T is substituted for whatever type you use.

### You may call these Parameterized clases and methods

In a nutshell, generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods. Much like the more familiar formal parameters used in method declarations, type parameters provide a way for you to re-use the same code with different inputs. The difference is that the inputs to formal parameters are values, while the inputs to type parameters are types.
