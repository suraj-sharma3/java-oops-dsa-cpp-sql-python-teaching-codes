/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
    int x;
    String schoolName;
    int schoolEstd;
    Main(String name, int estd){
        schoolName = name;
        schoolEstd = estd;
        x = 5;
    }
    
	public static void main(String[] args) {
		Second newOne = new Second();
		System.out.println(newOne.x);
	//	Main myObj = new Main();
	//	System.out.println(myObj.x);
      
        Main myObject = new Main("Sapience Academy", 2016);
        System.out.println(myObject.schoolName);
        System.out.println(myObject.schoolEstd);
        
    // create an object of the Student class (which inherits attributes and methods from Flame class)
        Student myObj = new Student();
    
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
        
	}
}


/*
Constructors can also take parameters, which is used to initialize attributes.
The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). 
When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5
*/


// abstract class
abstract class Flame { // Flame is an abstract class
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method 
// An abstract method belongs to an abstract class, and it does not have a body. 
// The body of the abstract method is provided by the subclass i.e, the class that inherits the abstract class in which the abstract method is present
}

// Subclass (inherit from Main)
class Student extends Flame { // Student class inherits the abstract class Flame here
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method of the class Flame is provided here inside the Student class
    System.out.println("Studying all day long");
  }
}