/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main // There can be only 1 public class inside a java file, & the name of this public class 
                    // should be exactly the same as the name of the java file in which this public class is present
{
	public static void main(String[] args) {
		Car myCar = new Car(); // creating an object (building) of the 'Car' class
		          // Constructor      // we can make as many objects of a class as we want
		myCar.numOfWheels = 100; // Properties & methods of a class (object) can be accessed using the '.'(Dot) operator
		myCar.brand = "Deadsoul";
		System.out.println(myCar.brand);
		myCar.runs(); // accessing 'runs' method of the 'Car' class
		System.out.println(myCar.numOfWheels);
		myCar.runs(14);
		
		// here runs exhibits compile time polymorphism
		System.out.println(Car.count); // accessing 'count' (static property) property of the class Car
		// as count is the property of the Car class, we don't need to create an object to access count
		Car myCar2 = new Car(23, "shavit"); // using parameterized constructor
		// properties of object are initialized when the object is constructed
		System.out.println(myCar2.brand);
		
		Car myCar3 = new Car(12, 13, "Hyundai");
		System.out.println(myCar3.numOfWheels);
		
		Suzuki maruti = new Suzuki(44, "ikuzus");
		System.out.println(maruti.brand);
	}
}

class Car{ // creating a class (blueprint)
    // every class has 2 things - properties (variables / attributes) & behaviours (methods / functions)
// properties of the Car class
    int numOfWheels;
    String brand;
// methods of the Car class
    void runs(){
        System.out.println("Car of " + brand + " runs");
    }
    void runs(int km){
        System.out.println("Car ran for " + km + " kilometres");
    }
    // same function 'runs' is existing in 2 forms (1 form without any parameter & 1 form is having a parameter 'km'
    // This phenomenon of a single method / function of a class existing in multiple forms is called as 'polymorphism'
    
    // constructors - appear to be functions but are basically used for creating new objects
    // java gives a default constructor for every class that we create, so even if we don't make a constructor
    // every class has a default constructor provided by java
    // constructor constructs a new object
    // the default constructor doesn't takes any arguments or parameters
    
    static int count; // any property that is 'static' is a property of class & it is not an object's property
    // The static variable can be used to refer to the common property of all objects (which is not unique 
    // for each object), for example, the company name of employees, college name of students, etc.
    // properties created using the 'static' keyword are properties of the class & to access the properties 
    // of class, we don't have to create an object of that class
    // 'static' keyword is used to create properties & methods which will remain constant for a class & they
    // do not depend on the objects of a class
    
    // e.g. how many living organisms have been created by nature? is this a property of nature or any particular 
    // living organism, ofcourse, the number of living organisms created will be a property of nature
    // nature can be assumed as class, living organisms can be assumed as objects & number of living organisms can
    // be assumed as a 'static' property i.e, property of the class nature
    
    // one more example : assume lion as a class which has many lion objects, now number of lions that exist
    // will obviously be a property of the lion class & not of any lion object so number of lions property is static
    
    public Car(){ // constructor for Car
        count++; // everytime we create an object of class Car, the count will be increased,
                // count will give the number of objects created of the class Car
                // count is a static variable, it will tell us the number of objects that have been created of 
                // class Car, count is the property of the Car class, count cannot be a property of an object as it 
                // tells us how many objects have been created
        System.out.println("a Car is created");
    }
    
    // we can use constructors to initialize the properties of a class or object
    public Car(int numOfWheels, String brand){ // constructor overloading 
                                                // one more constructor with the same name but different parameters
        this(); // this will call the default constructor of the class from this constructor
                // here first the default constructor will be called & then the lines after this(); will be executed
                // can be used when we want to use the implementations of the default constructor with this constructor also
        // this(); - 'this' keyword can be used to call a constructor from another constructor
        this.numOfWheels = numOfWheels; // as the variable names are same so we have to use 'this' keyword 
        this.brand = brand;             // to denote the variables of the class / object
        // 'this' is being used to access the variables of the Car class
    }
    
    public Car(int newWheels, int oldWheels, String newBrand){ // constructor overloading 
                                                // one more constructor with the same name but different parameters
        this(); // this will call the default constructor of the class from this constructor
                // here first the default constructor will be called & then the lines after this(); will be executed
                // can be used when we want to use the implementations of the default constructor with this constructor also
        // this(); - 'this' keyword can be used to call a constructor from another constructor
        numOfWheels = newWheels + oldWheels;
        brand = newBrand;
    }
}
// the parent class of all the classes in java is the 'object' class
// 'extends' keyword is used for inheritance in java
class Suzuki extends Car{ // Suzuki is a child class that extends the Car class which is it's parent class
    // the child class inherits all the properties & behaviours of it's parent class
    public Suzuki(int numOfWheels, String brand){
        super(numOfWheels, brand); // 'super' keyword is used to access the properties of the parent class
    }
}

// super : 'super' keyword is used to call the constructor of the parent class from the child class
/* Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a 
parent object. It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
When you inherit from an existing class, you can reuse methods and fields of the parent class. 
Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance in java?

For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.

Terms used in Inheritance :

Class: A class is a group of objects which have common properties. It is a template or blueprint from 
which objects are created.

Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, 
extended class, or child class.

Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. 
It is also called a base class or a parent class.

Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

The syntax of Java Inheritance :

class Subclass-name extends Superclass-name  
{  
   //methods and fields  
} 

The extends keyword indicates that you are making a new class that derives from an existing class. 
The meaning of "extends" is to increase the functionality. */