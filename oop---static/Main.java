/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/* we created a static method, which means that it can be accessed without creating an object of the class, 
unlike public, which can only be accessed by objects */

// Static methods can be called without creating objects
// Public methods must be called by creating objects

/* the main() method is a built-in Java method that runs your program 
(any code inside main is executed) */

/* The dot (.) is used to access the object's attributes and methods.

To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

A class must have a matching filename (Main and Main.java) */

// the name of the java file should match the class name

/* A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. 
It can be used to set initial values for object attributes */

/* Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, 
Java creates one for you. However, then you are not able to set initial values for object attributes. */

/*
Constructors can also take parameters, which is used to initialize attributes.
You can have as many parameters as you want in a constructor.
The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). 
When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5
*/

/* An abstract method belongs to an abstract class, and it does not have a body. 
The body of the abstract method is provided by the subclass */

public class Main {
    int x;
    int a;
    
    // Constructor of Main class
    Main(int y, int a){ // constructor with parameters
        x = y;
        this.a = a;
    }
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

//    Main myObj = new Main(); // Create an object of Main
//    myObj.myPublicMethod(); // Call the public method on the object
    
    Main myObj1 = new Main(56, 63);
    System.out.println(myObj1.x);
    System.out.println(myObj1.a);
  }
}
