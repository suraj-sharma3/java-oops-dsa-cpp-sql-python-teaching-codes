/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/*
public class Main
{
    int x = 23; // x is an attribute or property of the class Main
    final int y = 24; // as we've used the 'final' keyword with the property 'y', the value of 'y' can't be changed for any object of class Main
    	 
    	 // a 'static' method of a class can be called without creating an object of that class
	    // a 'public' method of a class cannot be called without creating an object of that class
	   // a 'public' method of a class can only be accessed with an object of that class
	   
	   static void staticMethod(){
	       System.out.println("Hello Static Method");
	   }
	   
	   public void publicMethod(){
	       System.out.println("Hello Public Method");
	   }
	    
	public static void main(String[] args) {
		Main suraj = new Main(); // creating an object of class Main
		System.out.println(suraj.x);
		Main suraj1 = new Main(); // creating another object of class Main
		System.out.println(suraj1.x);
		
		suraj1.x = 45; // changing the value of x for object suraj1
		System.out.println(suraj1.x);
		
//	    suraj1.y = 63; // value of 'y' can't be changed as 'final' keyword is used with 'y' in the class
//	    System.out.println(suraj1.y);
	    
        staticMethod(); // static method of the class Main is being called without using an object of the class Main
//	    publicMethod(); // calling public method without using an object with it will give an error
		
		Main yooHoo = new Main(); // creating an object of the class Main
		yooHoo.publicMethod(); // calling public method using an object with it will not give an error
		
	}
}

*/
public class Main{
    public static void main(String args[]){
        Second myObj = new Second();
        myObj.fullThrottle();
        myObj.maxSpeed(45);
    }
}
class Second{ // calling the methods of the class Main in the class Second after creating an object of the class Main in the Second class
	   
// it is a good practice to create an object of a class and access it in another class.
    int x = 45;
    public void fullThrottle(){
        System.out.println("The car is in full speed");
    }
    public void maxSpeed(int x){
        System.out.println("Max Speed " + x);
    }
}
