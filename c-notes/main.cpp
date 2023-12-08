/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// extension of c++ file : .cpp

#include <iostream> // used to import the iostream library

// iostream is a part of the standard (stl) library
// C++ input & output streams are defined by iostream
// cin, cout, cerr, clog are the most used from the iostream
// cin - for input
// cout - for output
 
 using namespace std; // we can either write using namespace std here or we can directly use std with cout
// namespace is used to identify & refer to objects of various kinds
/*
int main() // execution of anything in c++ takes place within the main() function
{
    std::cout<<"Hello World"; // cout is present in iostream, everything that is present within the " " is printed
    // << - left shift operator / stream insertion operator is used with cout (for printing outputs)
    
    // >> - right shift operator is used with cin (for taking inputs)
    
    // endl inserts a new line
    
    // whatever we define inside 2 curly braces is visible or accessible withing those 2 curly braces only, this is called a scope

    return 0; // any program ends with this statement, exit status of a program
}
*/
int main(){
    char name[50];
    cout << "Enter your name : ";
    cin >> name;
    cout << "Hello " << name << endl;
    const int a = 10;
    // a = a + 1;
    cout << a;
}

// C++ primitive datatypes
// primitive datatypes of C++ are similar to Java
// void datatype represents a valueless entity
// the scope of a variable is the area of a program where the variable is valid
// local variables have higher precedence than global variables
// global variables are assigned with 0 by default if we don't initialize them
// local variables are assigned with some garbage value if we don't initialize them

// int - 32 bits & long - 64 bits
// double - 15 decimal digits & float - 7 decimal digits
// using const keyword to make the value of a variable constant

// auto - the default storage class for a variable declared inside a function or a block