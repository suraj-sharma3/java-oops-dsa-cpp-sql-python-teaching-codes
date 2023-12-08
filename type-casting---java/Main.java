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
Variables are used to store information
The assignment operator '=' assigns a value to a variable
The programming languages in which we mention the datatype of a variable before compiling ae called as statically typed programming languages.

Dynamically-typed languages perform type checking at runtime, while statically typed languages perform type checking at compile time. 
Statically-typed languages require you to declare the data types of your variables before you use them, while dynamically-typed languages do not. 

Statically typed languages : 

int num;
num = 5;

Dynamically typed languages : 
num = 5

In Statically typed programming languages, we have to provide the datatype of a variable before compiling our program.
In Dynamically typed programming languages, we don't have to provide the datatype of a variable before compiling our program.The datatype is decided at the run time itself.

Examples of Statically typed languages : C, C++, Java, etc
Examples of Dynamically typed languages : Python, JavaScript, etc

'=' is assignment operator in majority of the programming languages.
int a = 3;
whatever is on the right side gets assigned to whatever is on the left side using assignment operator

datatype variable_name = value

we have to declare the datatype of a variable only once when we declare the variable, if we declare an already declared variable again, we'll get an error
A variable can hold only 1 value at a time. whenever we assign a new value to a variable, the old value is removed from the variable's memory location & the new value is stored at that location.
we can't use the reserved words for naming variables. Reserved words are those words in a programming language that have special meanings. e.g. int, float, static, etc

String city = "Mumbai"; // a memory location is created with the name "city" in the memory & "Mumbai" is stored at that location

Give meaningful names to variables. it's a convention that you should follow, not compulsary.

A variable name cannot start with a number, however a variable name can end with a number.
There are only 2 special characters that can be used in a variable name in Java which are _(underscore) & $ (dollar sign).

The followed convention for naming variables is camelCase which means if a variable name (for e.g. my city name) consists of multiple words we can write it as myCityName (first letter of the first word should be small, first letter of all the other words should be capital)
A variable name cannot consist of spaces. 

Statically typed, strongly typed & strictly typed mean the same.

The value that we give to a variable is also called as literal, data or information.

Strings & arrays are non primitive data types or objects.

Primitive datatypes : 

1) For whole numbers - byte, short, int, long

RAM is a collection of bytes. 
1 Byte = 8 Bits
1 Nibble = 4 Bits
To make 1 Bit of memory, 2 transistors are used.

Datatypes : 
byte - takes 1 byte of memory in RAM 
a variable of byte datatype can only store numbers from -2^(n-1) to 2^(n-1) - 1 which evaluates to -128 to 127 for n = 8 bits (1 byte), where n is 8 bits as a byte variable can only store 1 byte of data
a variable of byte datatype can only store numbers from -128 to 127

while we are writing code in a compiler, the code is getting compiled at the same time

short - takes 2 bytes of memory in RAM 
a variable of short datatype can only store numbers from -2^(n-1) to 2^(n-1) - 1 (where n = 16 bits (2 bytes)) which evaluates to -32768 to 32767 for n = 16 bits (2 bytes), where n is 16 bits as a short variable can only store 2 bytes of data

int - takes 4 bytes of memory in RAM, 4 bytes - 32 bits, int is the most widely used datatype
a variable of int datatype can only store numbers from -2^(n-1) to 2^(n-1) - 1 where n = 32 bits (4 bytes)

byte & short datatypes were used with 8086 microprocessor, nowadays, int is mostly used

if memory utilisation is very critical & you know that the value provided will not cross the range of byte or short then you can use byte or short datatypes

Long - takes 8 bytes of memory in the RAM

-2^(n-1) to 2^(n-1) - 1 where n = number of bytes that the datatype takes in memory, this formula can be used to calculate the range for the value of the variable of any datatype 

whenever we use the long datatype with any variable, beside the value of the variable, we have to write 'l' or 'L' with no space between the value & 'l'
for e.g. long num = 236987l; or long num = 236987L;

long num = 5674; // this will only work if the value provided is within the range of int otherwise it will give an error

as Java considers all the variables that contain whole numbers as 'int' datatype unless they cross the int range, we have to mention 'l' for long variables

The result of any mathematical expression is always in the 'int' datatype, therefore the result of an expression cannot be stored in byte or short datatype

byte a = 10;
byte b = 5;
byte c = a + b; // this will give an error as the result of any expression is in the int datatype, this is how java compiler has been designed

for Real numbers (i.e, decimal numbers), float & double datatypes are used
whenever we provide a decimal number as a value to a variable, that variable is by default considered as double, this is how java compiler has been designed
float number = 24.35; // this will give an error

whenever we use the float datatype with any variable, beside the value of the variable, we have to write 'f' or 'F' with no space between the value & 'f'
for e.g. float num = 236987f; or float num = 236987F;

float - takes 4 bytes of memory in the RAM
double - takes 8 bytes of memory in the RAM

for double, we don't have to add any alphabet beside the value of the variable.
for e.g. double num = 48.36;

for float, the precision value is upto 7 digits
for double, the precision value is upto 14 digits 
precision value is the numbers after the decimal

a variable of boolean datatype can only be used to store 'true' or 'false'

as the memory can only understand 0s & 1s, even the value that we provide to a variable is converted into a stream of 0s & 1s using some specific formats.
int, byte, short, long use base-2 format 
double & float use IEEE single & double precision formats

even the different formats that are used for audio, video or data like mp3, mp4, flac, etc also convert those audio, video or data into streams of 0s & 1s so that they can be stored in the memory

There are only 128 characters in the world 
scientists created binary representations for all these 128 characters, from these binary representations decimal representations for these 128 characters were created & these representations are known as ASCII values (American Standard Code for Information Interchange)

there are only 128 characters in the world if we only consider english language
for programming languages like C that follow the ASCII format, char datatype is of only 1 byte
in C programming language, only 128 characters are allowed

but if we consider characters from other prominent languages along with english, there are 65536 characters in total in the world
another format was developed to accomodate all these 65536 characters, this format is called as UTF - 16 (unique code transformation format)

Java follows the UTF - 16 format, that's why in Java, the char datatype is of 2 bytes
all the programming languages like Java that follow the UTF - 16 format, char datatype is of 2 bytes

The values of the decimal representation of first 128 characters in UTF - 16 format are the same as ASCII format

only 1 character can be stored in a variable of char datatype & that value should be provided in '' (single quotes)

names of all the primitive datatypes should be in lowercase.

Changing of datatype of a variable from one datatype to another datatype is called as typecasting.
When typecasting happens automatically (internally by compiler), it is called as implicit typecasting

e.g. int a = 65;
double b;
b = a; // even though a has an integer value, it's value is converted into double & then stored in b as b is a double variable
// b = 65.0, here numeric type promotion is happening as int variable is getting promoted to double type


how int can be converted into double?
just like water that is in a glass upto the brim can be accomodated in a bucket 
a value of int type can be accomodated in a double as int is 4 bytes & double is 8 bytes

can water that is in a bucket upto the brim be accomodated in a glass - obviously no
in the same way, value of double type can't be converted into int type automatically, we would have to do it by ourselves

e.g. double num1 = 56.53;
int num2;
num2 = num1; // here we'll get an error as we are trying to store a double value in a int variable
// here implicit typecasting will not happen 

// to resolve this problem, we use explicit typecasting, explicit typecasting means that we have to change the datatypes ourselves by mentioning the datatype that we want to change a variable's value to
e.g. double num1 = 56.53;
int num2;
num2 = (int)num1; // here, we are changing num1 variable from double to int explicitly, this is explicit typecasting

whenever you're performing an Arithmetic operation on 2 integers, the result will also be an integer 
int a = 12;
int b = 5;
float c = a / b; // the integer value of a / b will get converted to float & then it will be stored in c
// c will have 2.0 instead of 2.4, this is truncation

Truncation simply means decimal value of a number getting round off to 0

The English meaning of truncate is to trim or prune, or cut something and the process of trimming is called truncation. In the computer science field, the term is often used in reference to data-types or variables (like String, floating-point numbers, etc.). It is a way of approximation. 

In Java programming, truncation means to trim some digits of a float or double-type number or some characters of a string from the right. We can also truncate the decimal portion completely that makes it an integer. Remember that after truncation, the number will not be round to its nearest value. Hence, truncation is a way of approximation.

An identifier is a name given to a package, class, interface, method, or variable. All identifiers
must have different names.

All the names that we give to packages, classes, interfaces, methods, & variables are the total number of identifiers in that program.

Naming Conventions : 
name of a class should start with a capital letter.
there should be no space in between the words of the variable, function & class names
first letter of every word in a class name should be a capital letter & the rest of the letters of the words should be small - PascalCase  
every letter of the first word should be a small letter but first letter of every word except the first word in a variable name or function name should be a capital letter, rest of the letters can be small letters - camelCase
underscores are used to seperate words in variable or function names - snake_case (not widely used)

recommended : for Class names - follow PascalCase
for variable & function names - follow camelCase

even if we don't follow the above given conventions, our java programs will execute, but we should follow these conventions as these are recommended by the industry

java is a case sensitive programming language so firstName & firstname will be considered 2 different variables 

Arithmetic Operators : +, -, *, /, %

a++, ++a, a--, --a are the examples of increment & decrement operators being used

a++ : post incrementation
++a : pre incrementation
a-- : post decrementation
--a : pre decrementation

int a = 3;
int b = a++; // first value of a (3) will be given to b & then a will be incremented from 3 to 4

int a = 3;
int b = ++a; // first value of a (3) will be incremented from 3 to 4 & then the incremented value of a (4) be given to b 

int a = 3;
int b = a--; // first value of a (3) will be given to b & then a will be decremented from 3 to 2

int a = 3;
int b = --a; // first value of a (3) will be decremented from 3 to 2 & then the decremented value of a (2) be given to b 

incrementation & decrementation operators are generally used in updation part of loops

Java is statically-typed, so it expects its variables to be declared before they can be assigned values. 

Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable.

The local variables do not have any default values in Java. 

All objects are created in the JVM, while it is running. Some objects, like the String shown here, are created in the JVM while a class is being loaded, so it's effectively created before your program code runs; but it's still created at runtime.
 
Types of Variables
There are three types of variables in Java:

local variable
instance variable
static variable
 
1) Local Variable
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.

2) Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.

It is called an instance variable because its value is instance-specific and is not shared among instances.

3) Static variable
A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

Example to understand the types of variables in java
public class A  
{  
    static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable    
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable    
    }  
}//end of class   
