/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

using namespace std;

class Kids{
    public : 
    
    int age;
    string name;
    
    void helloKid(string name){
        cout << "hello " << name;
    }
};

class Vehicles{
    public :
    string brand;
    string model;
    public : 
        void info();
};

void Vehicles::info(){
    cout << Vehicles.brand << " " << Vehicles.model << endl;
}

int main()
{
    cout<<"Hello World \n";
    Kids child1;
    child1.age = 4;
    cout << child1.age << endl;
    child1.name = "Adyant";
    cout << child1.name << endl;
    child1.helloKid(child1.name);
    
    Kids child2;
    child2.age = 4;
    child2.name = "Aayansh";
    cout << endl << child2.age << endl << child2.name << endl;
    
    Vehicles car1;
    car1.brand = "Tata";
    car1.model = "Nano";
    car1.info();
    return 0;
}


/*
OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or functions that perform operations on the data, while object-oriented programming is about creating objects that contain both data and functions.

Object-oriented programming has several advantages over procedural programming:

OOP is faster and easier to execute
OOP provides a clear structure for the programs
OOP helps to keep the C++ code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
OOP makes it possible to create full reusable applications with less code and shorter development time
Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. 
You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

C++ What are Classes and Objects?
Classes and objects are the two main aspects of object-oriented programming.
So, a class is a template for objects, and an object is an instance of a class.

When the individual objects are created, they inherit all the variables and functions from the class.

C++ is an object-oriented programming language.

Everything in C++ is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. 
The car has attributes, such as weight and color, and methods, such as drive and brake.

Attributes and methods are basically variables and functions that belongs to the class. These are often referred to as "class members".

A class is a user-defined data type that we can use in our program, and it works as an object constructor, or a "blueprint" for creating objects.

The class keyword is used to create a class called MyClass.
The public keyword is an access specifier, which specifies that members (attributes and methods) of the class are accessible from outside the class. 
Inside the class, there is an integer variable myNum and a string variable myString. When variables are declared within a class, they are called attributes.
At last, end the class definition with a semicolon ;

class MyClass {        // The class
  public:              // Access specifier
    void myMethod() {  // Method/function defined inside the class
      cout << "Hello World!";
    }
};

int main() {
  MyClass myObj;     // Create an object of MyClass
  myObj.myMethod();  // Call the method
  return 0;
}

To define a function outside the class definition, you have to declare it inside the class and then define it outside of the class. 
This is done by specifiying the name of the class, followed the scope resolution :: operator, followed by the name of the function:

Outside Example
class MyClass {        // The class
  public:              // Access specifier
    void myMethod();   // Method/function declaration
};

// Method/function definition outside the class
void MyClass::myMethod() {
  cout << "Hello World!";
}

int main() {
  MyClass myObj;     // Create an object of MyClass
  myObj.myMethod();  // Call the method
  return 0;
}

*/