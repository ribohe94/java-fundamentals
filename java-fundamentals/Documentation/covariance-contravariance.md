# Covariance and Contravariance In Java
### Arrays Are Covariant
Arrays are said to be covariant which basically means that, given the subtyping rules of Java, an array of type T[] may contain elements of type T or any subtype of T. For instance:

    Number[] numbers = new Number[3];
    numbers[0] = new Integer(10);
    numbers[1] = new Double(3.14);
    numbers[2] = new Byte(0);

But not only that, the subtyping rules of Java also state that an array S[] is a subtype of the array T[] if S is a subtype of T, therefore, something like this is also valid:

    Integer[] myInts = {1,2,3,4};
    Number[] myNumber = myInts;

Because according to the subtyping rules in Java, an array Integer[] is a subtype of an array Number[] because Integer is a subtype of Number.

# Covariance
For this case, instead of using a type T as the type argument of a given generic type, we use a wildcard declared as ? extends T, where T is a known base type.

With covariance we can read items from a structure, but we cannot write anything into it. All these are valid covariant declarations.

    List<? extendsNumber> myNums = newArrayList<Integer>();
    List<? extendsNumber> myNums = newArrayList<Float>();
    List<? extendsNumber> myNums = newArrayList<Double>();

And we can read from our generic structure myNums by doing:

    Number n = myNums.get(0);

Because we can be sure that whatever the actual list contains, it can be upcasted to a Number (after all anything that extends Number is a Number, right?)

#Contravariance

For contravariance we use a different wildcard called ? super T, where T is our base type. With contravariance we can do the opposite. We can put things into a generic structure, but we cannot read anything out of it.

In this case, the actual nature of the object is  List of Object, and through contravariance, we can put a Number in it, basically because a Number has Object as its common ancestor. As such, all numbers are also objects, and therefore this is valid.

However, we cannot safely read anything from this contravariant structure assuming that we will get a number.

    Number myNum = myNums.get(0); //compiler-error
