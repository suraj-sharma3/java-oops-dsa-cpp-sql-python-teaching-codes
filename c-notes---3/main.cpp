/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <iostream>
using namespace std;

// declare your (user defined) functions above the main function

void print(){
    cout << "Hello Suraj" << endl;
}

void name();

bool isEven(int num){
    if(num % 2 == 0){
        return true;
    }
    else{
        return false;
    }
}

void fullName(string name){
    cout << name << "Sharma" << endl;
}

void origin(string country = "India"){
    cout << country << endl;
}

void myFunc(int age, string name){
    cout << "age in years : " << age  << ", " << "Name of the person : " << name << endl;
}

int addThis(int num){
    return 5 + num;
}

int addThree(int num1, int num2, int num3){
    return num1 + num2 + num3;
}

void swapNum(int &a, int &b){
    int temp = a;
    a = b;
    b = temp;
    cout << a << " " << b;
}

void reverseArray(int arr[5]){
    for(int i = 4; i >= 0; i--){
        cout << arr[i] << " ";
    }
    cout << endl;
}

// Instead of defining two functions that should do the same thing, it is better to overload one.
// Multiple functions can have the same name as long as the number and/or type of parameters are different.
int sumNum(int num1, int num2){
    return num1 + num2;
}

float sumNum(float num1, float num2){
    return num1 + num2;
}

double sumNum(double num1, double num2){
    return num1 + num2;
}

/*
Recursion is the technique of making a function call itself. 
This technique provides a way to break complicated problems down into simple problems which are easier to solve.
Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.
The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power. 
However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.
*/

int sum(int k){
    if(k == 0){
        return 0;
    }
    return k + sum(k - 1);
}

int main()
{
/*    struct{
        int age;
        string name;
    }dog, cat;
    
    printf("Hello World \n");
    dog.age = 12;
    cout << dog.age <<endl;
    cat.age = 9;
    cout << cat.age << endl;
    
    cat.name = "celeste";
    cout << cat.name << endl;
    
    struct Bus{
        int tyres;
        string color;
    };

    
    Bus peeliBus;
    peeliBus.color = "Yellow";
    peeliBus.tyres = 4;
    cout << peeliBus.color << endl;
*/    
/*   struct person{
        string name;
        int age;
    }person1, person2, person3;
    
    person1.name = "Suraj";
    person2.name = "Shavit";
    person3.name = "Deadsoul";
    cout << person1.name << endl;
    
    struct{
        string city;
        string town;
    }man1, man2, man3;
    
    man1.city = "Mumbai";
    man1.town = "Vasai";
    
    cout << man1.city << " " << man1.town;
    
    person suraj;
    suraj.name = "shavit";
    cout << "\n" << suraj.name << endl;
    
    struct employee{
        string address;
        string company;
    } emp1;
    
      emp1.company;
        emp1.company = "Altisource";
        cout << emp1.company;
*/        
 /*   int age = 27;
    int &umra = age;
    cout << umra << endl;
    
    cout << &age << endl;
    
    string name = "Suraj";
    string* vtr = &name;// pointer
    
    cout << *vtr << endl;
    
    *vtr = "Shavit";
    cout << *vtr << endl;
    cout << name << endl;
 */
/*    print(); // calling the function
    int num;
    cin >> num;
    
    cout << isEven(num) << endl;
    
    name();
    
    fullName("Suraj");
    
    origin("Norway");
    origin();
    
    myFunc(27, "Suraj");
    
    int ans = addThis(8);
    cout << ans << endl;
*/
/*    int num1, num2, num3;
    cin >> num1;
    cin >> num2;
    cin >> num3;
    int large = addThree(num1, num2, num3);
    cout << large << endl;
*/
/*    cout << "Enter 2 numbers : ";
    int a, b;
    cin >> a;
    cin >> b;
    swapNum(a, b);
*/
    int arr[] = {2, 4, 5, 1, 9};
    reverseArray(arr);
    
    int ans1 = sumNum(2, 4);
    float ans2 = sumNum(2.3, 2.4);
    double ans3 = sumNum(2.33, 2.44);
    cout << ans1 << ", " << ans2 << ", " << ans3 << endl;
    
    
    int rangeSum = sum(8);
    cout << rangeSum << "\n";
    return 0;
/*    
        struct {             // Structure declaration
          int myNum;         // Member (int variable)
          string myString;   // Member (string variable)
        } myStructure;       // Structure variable
        
        To access members of a structure, use the dot syntax (.)
        
        struct myDataType { // This structure is named "myDataType"
          int myNum;
          string myString;
        };
        To declare a variable that uses the structure, use the name of the structure as the data type of the variable:

        myDataType myVar;
        
        To access it, use the & operator, and the result will represent where the variable is stored:

        Example
        string food = "Pizza";
        
        cout << &food; // Outputs 0x6dfed4
        
        References and Pointers (which you will learn about in the next chapter) are important in C++, because they give you the ability to manipulate the data in the computer's memory - which can reduce the code and improve the performance.

        These two features are one of the things that make C++ stand out from other programming languages, like Python and Java.
        
        There are three ways to declare pointer variables, but the first way is preferred:

        string* mystring; // Preferred
        string *mystring;
        string * mystring;
        
        string food = "Pizza";  // A food variable of type string
        string* ptr = &food;    // A pointer variable, with the name ptr, that stores the address of food
        
        string food = "Pizza";  // Variable declaration
        string* ptr = &food;    // Pointer declaration
        
        // Reference: Output the memory address of food with the pointer (0x6dfed4)
        cout << ptr << "\n";
        
        // Dereference: Output the value of food with the pointer (Pizza)
        cout << *ptr << "\n";
        
        Note that the * sign can be confusing here, as it does two different things in our code:

        When used in declaration (string* ptr), it creates a pointer variable.
        When not used in declaration, it act as a dereference operator.
        
        Modify the Pointer Value
You can also change the pointer's value. But note that this will also change the value of the original variable:

Example
string food = "Pizza";
string* ptr = &food;

// Output the value of food (Pizza)
cout << food << "\n";

// Output the memory address of food (0x6dfed4)
cout << &food << "\n";

// Access the memory address of food and output its value (Pizza)
cout << *ptr << "\n";

// Change the value of the pointer
*ptr = "Hamburger";

// Output the new value of the pointer (Hamburger)
cout << *ptr << "\n";

// Output the new value of the food variable (Hamburger)
cout << food << "\n";


C++ provides some pre-defined functions, such as main(), which is used to execute code. But you can also create your own functions to perform certain actions.

To create (often referred to as declare) a function, specify the name of the function, followed by parentheses ():

Syntax
void myFunction() {
  // code to be executed
}

Function Declaration and Definition
A C++ function consist of two parts:

Declaration: the return type, the name of the function, and parameters (if any)
Definition: the body of the function (code to be executed)

void myFunction() { // declaration
  // the body of the function (definition)
}
Note: If a user-defined function, such as myFunction() is declared after the main() function, an error will occur


However, it is possible to separate the declaration and the definition of the function - for code optimization.

You will often see C++ programs that have function declaration above main(), and function definition below main(). This will make the code better organized and easier to read:

Example
// Function declaration
void myFunction();

// The main method
int main() {
  myFunction();  // call the function
  return 0;
}

// Function definition
void myFunction() {
  cout << "I just got executed!";
}

void myFunction(string fname) {
  cout << fname << " Refsnes\n";
}

int main() {
  myFunction("Liam");
  myFunction("Jenny");
  myFunction("Anja");
  return 0;
}

// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes
When a parameter is passed to the function, it is called an argument. 
So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

Default Parameter Value
You can also use a default parameter value, by using the equals sign (=).

If we call the function without an argument, it uses the default value ("Norway"):

Example
void myFunction(string country = "Norway") {
  cout << country << "\n";
}

int main() {
  myFunction("Sweden");
  myFunction("India");
  myFunction();
  myFunction("USA");
  return 0;
}

// Sweden
// India
// Norway
// USA
A parameter with a default value, is often known as an "optional parameter". 
From the example above, country is an optional parameter and "Norway" is the default value.

Note that when you are working with multiple parameters, 
the function call must have the same number of arguments as there are parameters, 
and the arguments must be passed in the same order.

The void keyword, used in the previous examples, indicates that the function should not return a value. If you want the function to return a value, you can use a data type (such as int, string, etc.) 
instead of void, and use the return keyword inside the function

int myFunction(int x) {
  return 5 + x;
}

int main() {
  cout << myFunction(3);
  return 0;
}

// Outputs 8 (5 + 3)

we used normal variables when we passed parameters to a function. 
You can also pass a reference to the function. 
This can be useful when you need to change the value of the arguments:

Example : 
void swapNums(int &x, int &y) {
  int z = x;
  x = y;
  y = z;
}

With function overloading, multiple functions can have the same name with different parameters:

Example : 
int myFunction(int x)
float myFunction(float x)
double myFunction(double x, double y)

*/

}

void name(){
    cout << "Hello everyone" << endl;
}





