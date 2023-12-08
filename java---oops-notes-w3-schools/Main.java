/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
/*

If we create a method using the static keyword within a class, we can call that method without creating an object of that class

static means that the method belongs to the class and not to an object of the class

void means that a method does not have a return value.

Information can be passed to methods as parameter. 
Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses. 
You can add as many parameters as you want, just separate them with a comma.
When a parameter is passed to the method, it is called an argument.
Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.
The void keyword, used in the examples above, indicates that the method should not return a value. 
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method

In the loop, when the value is "4", jump directly to the next value : Use of "continue" keyword - 

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}


if we want a class to not be inherited by other classes, we use the "final" access modifier:

final class MyClass{
    
}
}