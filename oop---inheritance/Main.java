/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*
Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. 
We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass)

Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

If you don't want other classes to inherit from a class, use the final keyword with that class

*/
class Vehicle {
  protected String brand = "Ford"; // 'brand' attribute of Vehicle class 
  // The 'brand' attribute is accessible in the same package and subclasses as we've used 'protected' with it
  public void honk() {  // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle { // Car - subclass or child class & Vehicle - super class or parent class
  String modelName = "Mustang";    // Car attribute
}
public class Main{
    public static void main(String[] args) {
    
        // Create a myCar object
        Car myCar = new Car();
    
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
    
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}