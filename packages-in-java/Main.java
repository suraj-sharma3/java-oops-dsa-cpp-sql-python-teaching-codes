/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)

Built-in Packages : 
The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. 
The complete list can be found at Oracles website

The library is divided into packages and classes. Meaning you can either import a single class 
(along with its methods and attributes), or a whole package that contain all the classes that 
belong to the specified package.


To use a class or a package from the library, you need to use the 'import' keyword

import package.name.Class;   // Import a single class
e.g. import java.util.Scanner;
import package.name.*;   // Import the whole package i.e, all the classes of a particular package
To import a whole package, end the sentence with an asterisk sign (*). 
The following example will import ALL the classes in the java.util package
e.g. import java.util.*;

User-defined Packages : 

To create your own package, you need to understand that Java uses a file system directory to store them. 
Just like folders on your computer

To create a package, use the 'package' keyword

This forces the compiler to create the "mypack" package.

The -d keyword specifies the destination for where to save the class file. 
You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, 
you can use the dot sign "."

Note: The package name should be written in lower case to avoid conflict with class names.
*/

package mypack;
class MyPackageClass{
    public static void main(String[] args){
        System.out.println("This is my package");
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
