/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*
Encapsulation : 

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

Get and Set :

private variables can only be accessed within the same class (an outside class has no access to it). 
However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, 
followed by the name of the variable, with the first letter in upper case


*/

class Person {
  private String name = "Suraj"; // private = restricted access
// the name variable can't be accessed outside this class Person as it is private

  // Getter for accessing the value of the 'name' variable (which is private) outside the Person class
  public String getName() {
    return name;
  }

  // Setter for setting / changing the value of the 'name' variable (which is private) outside the Person class
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Main
{
	public static void main(String[] args) {
		Person newObj = new Person();
		
		// we can use the getName() i.e, getter and setName() i.e, setter methods to access and update the private variable 'name'
		String name = newObj.getName(); // accessing the value of the private variable name using getName (getter)
		System.out.println(name);
		
		newObj.setName("Shavit"); // changing the value of the private variable name using setName (setter)
		System.out.println(newObj.getName());
		
		Person myObj = new Person();
        myObj.name = "John";  // will give an error as we're trying to access a private variable 'name'
        System.out.println(myObj.name); // will give an error as we're trying to access a private variable 'name'
        // If the 'name' variable was declared as public, we wouldn't have got this error
        // as we are trying to access a private variable 'name', we are getting an error
	}
}
/*
Why Encapsulation?

Better control of class attributes and methods

Class attributes can be made read-only (if you only use the get method) 
or write-only (if you only use the set method)

Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
*/
