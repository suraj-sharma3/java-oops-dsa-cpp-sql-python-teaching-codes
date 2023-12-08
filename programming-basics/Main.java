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

important components of a computer : 

microprocessor (CPU - most imp), RAM (primary memory), HDD (secondary memory)

CPU is a semiconductor device & hence it is very fast
any semiconductor device is made up of transistors (e.g. PNP, NPN transistors)

A Transistor only understands 2 things : Low Voltage & High Voltage
In software engineering, low voltage is represented as 0 & high voltage is represented as 1

as our CPU is as semiconductor device, it is also made up of Transistors which means a CPU only understands 
low voltage (0) & high voltage (1)

a CPU just like any other machine is a dumb device, it only works for you when you give it the necessary instructions
now to give instructions to a processor, you can use can only use 2 things low voltage (0) & high voltage (1) as a processor 
only understands these 2 things

your smart phone is not actually smart

so you can only give instructions to a processor in the form of streams of 0s & 1s

a group or set of instructions is a program
& programming is writing programs so it's basically giving instructions to a machine about what it has to do for you or others

when you write a program in a language that only consists of 0s & 1s (a language that a machine understands), that language is called as a machine level language

when you give instructions to a processor in machine level language, the processor understands those instructions as they are in the form of 0s & 1s (Binary language), 
the processor executes those instructions & performs the work you want it to perform

Machine level language is good for the Machine but writing instructions only in the form of 0s & 1s is not reasonable for a human
writing millions of lines of code in the form of 0s & 1s would be very very difficult for a human
it would be really difficult for a human to resolve an error if he gets it if he uses MLL to code

because of this, a new approach of programming was developed, in which instructions were given in the form of Mnemonics e.g. using ADD for telling the machine to add 2 numbers 
this approach or language of programming is called as Assembly level language

using Assembly level language means using Mnemonics to write programs 

instructions written in Assembly level language can not be undrstood by the processor, it wuldn't be able to execute those
so there is another software that we use called as Assembler which converts the instructions written in Assembly level language to machine level language (Binary code)

A mnemonic device, or memory device, is any learning technique that aids information retention or retrieval (remembering) in the human memory for better understanding.
Mnemonics make use of elaborative encoding, retrieval cues, and imagery as specific tools to encode information in a way that allows for efficient storage and retrieval. 
Mnemonics aid original information in becoming associated with something more accessible or meaningful—which, in turn, provides better retention of the information.
e.g. Knuckle mnemonic for the number of days in each month of the Gregorian Calendar. Each knuckle represents a 31-day month.

now even Assembly level language can be used effectively by a human for only writing smaller programs
for larger programs, understanding or making sense out of the code written in Assembly level language is also difficult

now again, researchers realized that humans can write programs in english language & with using symbols more effectively 
e.g. print in Java means printing
scan means scanning 
if else means if else only
+ means add, etc

Now, when english language & symbols are used to write programs, it is called as High level language
The first significantly widespread high-level language was Fortran

a program written in a high level language cannot be understood & executed by the processor as it only understands 0s & 1s
so a software was developed that converts the code written in a high level language to code in machine level language which the CPU can definitely understand, this software is called as compiler
a compiler is a software that converts code written in HLL to code in MLL

Assembler converts code written in Assembly level language to code in machine level language
Compiler converts code written in High level language to code in machine level language

this is the reason why everytime we write a program, the program has to be compiled first before getting executed or running
nowadays, most of the programs are written in high level languages only

why would someone write programs in machine level or assembly level languages when there are high level languages

The official version of Java was released in 1995, it was developed by James gosling & his team (Known as green team) at Sun Microsystems
they made Java free for everybody & also made it open source which means anyone could contribute to the improvement of Java

Java has already been used in the industry for more than 2 decades & still it is in high demand

Java is a simple, robust, platform independent & object oriented programming language

Java is portable, platform independent 

The combinaton of the Operating system & the Microprocessor is called as Platform
A platform is reponsible for executing a program or application

usually programmers refer to the Operating system as Platform

What is platform dependency or non portability?

In C programming language, whenever you compile a C program, what the compiler gives after compiling is known as an Object file (.obj file)
This .obj file contains code in MLL
now some extra code is added to this .obj file & it is converted into an executable file by linker
processor executes this .exe file

A linker is an important utility program that takes the object files, produced by the assembler and compiler, and other code to join them into a single executable file.

networking even today is not secure, you can't give your source code to another computer over a network, you should always send or give anyone the compiled or executable file over a network 

machine level code is always platform dependent 
when you price a program in C language on a windows system & then you send the compiled code of the program (machine level code) to another computer that is running linux, the computer that's running linux would not be able to execute your .exe or compiled file as machine level code is always platform dependent

a program written in C on a windows OS system cannot be executed on a Linux OS system
therefore C programming language is platform dependent 

the machine level code of a C program procuced by a compiler on a windows OS can't be executed by a system running a different OS like linux or mac, this called as non portability or platform dependency
even java is also a high level language like C, then how did java became platform independent?

Why Java is platform independent & why do we call it WORA (write once run anywhere)?

as we can't share the actual HLL code that we wrote for a program as it may lead to someone using our intellectual property for their benefit
we can't even share the compiled code (MLL code) as it is platform dependent

what's the solution then?

The java compiler is a special compiler, it doesn't converts the java (HLL) code into MLL code, instead it converts the java code into byte code.
the byte code is neither human readable nor machine understandable

unlike Machine level code, Byte code is platform independent plus it is very secure too as it is not human readable
but byte code can't be understood by the machine as machine only understands the machine level code

so in Java, there is a software called as JVM (Java virtual machine) which converts the byte code into machine level code using an interpreter

JVM is a platform dependent system software, it is different for windows, linux & mac
this is why java development kit (JDK) is different for different Operating systems

byte code is platform independent
machine level code is platform dependent

the same byte code works on different systems with different Operating systems

for you to run your java program on systems with different Operating systems like windows, linux, mac, you should have their respective java development kit in your systems so that they can convert the byte code to the machine level code & then execute the program 

you write a program in Java once, but you can run that same program on any system with any Operating system, that's why Java is called WORA (erite once Run anywhere)
this is the reason why java is portable & platform independent

Byte code generated by Java compiler is an intermediate level of language as it can't be understood by either humans or machines

Java program (.java file i.e, source code) -> java compiler -> byte code (.class fle) -> JVM -> machine level code -> processor -> output of the java program

byte code -> JVM of linux OS -> machine level code -> processor -> output

byte code -> JVM of windows OS -> machine level code -> processor -> output

byte code -> JVM of mac OS -> machine level code -> processor -> output

any programming language that is object oriented uses the concepts of classes & objects
& with an object oriented programming language, you can easily emulate real world scenarios

If you use an object oriented programming language like java, then consider everything that exists in the world as an object even a person 

before writing a program in java, identify for which object you're writing the program

every object in the world has some properties & some behaviours (an object does something)

e.g. if we consider an object student, then the properties of this object would be age, name, interests, etc & it's behaviours would be sleeping, eating, playing, studying, etc
every object belongs to a class (blueprint or template)

the properties of an object are created using data types & variables
the behaviours of an object are created using methods

class -> template / blueprint
object -> instance of a class (created from a class)
attributes -> properties / characteristics
methods or functions -> behaviours

we can create objects of real world entities in java

a class has no life, it's just a blueprint
e.g. your house (object) is constructed according to a blueprint (class), you can live in a house but not it's blueprint

keyword to create a class -> class
keyword to create an object -> new
dot operator (.) is used to access the peoperties & methods of an object

the object has to be given a name (reference variable)

class Laptop{
    int price;
    int RAM;
    String brand;
    int HDD;
    String processor;
    
    void laptopStarts(){
        System.out.println("A laptop starts");
    }
    
    void laptopWorks(){
        System.out.println("A laptop doesn't gets tired");
    }
}

Laptop myDell = new Laptop(); // creating an object of Laptop class
myDell.laptopWorks(); // calling method of Laptop class
myDell.brand = "dell"; // accessing properties of the class Laptop

main method in java :

Methods : whenever you have an activity or a task that you want to perform in java, you write a method or function for it

A method is made up of 4 things : it's name, it's return type, it's parameters & it's body
Syntax :

returnType methodNmae(parameters){
    methodBody (activities or tasks the method has to perform)
}

when you don't return anything from a method, it's return type will be void
when you return something from a method, it's return type will be the datatype of what you return from the method

if there is no return statement in the body of a method, it's return type will be void

an Application is also a computer program

An application program consists of a lot of methods, so where should JVM start executing the program from. This is why we require the main method 

main method is the starting point for execution of a program, this is where a JVM starts executing a program from

start point of a java program is the main method 
without the main method, no java program can be executed

JVM is designed in a way that if the main method is not present in a java program, it wouldn't execute the program

main method has no return statement in it's body, that's why it's return type is void

why main method is static?

as to call any method of any class, we have to create an object of that class & then we can call the method

static keyword solves the problem : if we use the static keyword with a method, then to call that method, we wouldn't need to create an object of the class in which that method exists

we make the main method static so that JVM wouldn't have to create an object of the class in which our main method exists to call the main method & execute the java program
as main method is the starting point of any java program, it has to be static so that it can easilt be called & the java program can be easily executed

main method is static so that JVM doesn't have to create an object of the class in which the main method exists before calling the main method

public means for everyone
main method has to be public so that it can be accessed outside the class it exists in 
making main method public makes it possible for JVM to access the main method
the class in which the main method exists should also be public

we can't change the name of the main method, as JVM has been designed to start executing a java program from a method whose name is main
we can keep the names of all other methods except the main method anything that we want

call & invoke mean the same, a method is invoked simply means that a method has been called

why String[] args is used as a parameter for the main method?

whenever JVM calls the main method, while calling, some data from the command line also comes as an input for the main method for it to be called by JVM, that data is grabbed as an input for the main method

if we want to print something on the console in java, we can use System.out.println()

as JVM needs the main method to execute a java program, we would have to name our java program file the same as the name of the class that contains the main method

name of your java program file should be the same as the name of the class that contains the main method to tell the JVM in which class the main method exists

How to execute your java program from command prompt?

1) write your java program in notepad, save the program with the name of the class that contains the main method & the extension .java (select the type as all files)
2) Open command prompt, go to the folder in the command prompt where you have saved your .java file (java program)
3) run the command : javac file_name.java -> telling the java compiler to compile your java program
4) a compiled file with the extension .class (file_name.class) which is the byte code file of your java program is generated & saved where your java program (file_name.java) is located
5) you can view the byte code by opening the .class file using any text editor
6) now to execute our java program, we'll just run the command : java file_name in the command prompt, this will tell the JVM to execute the .class byte code file & you'll see the output
Very Imp Note : write java file_name & press enter in the cmd, never write java file_name.class, writing .class after the file name would not let the program run
so after compiling just write java file_name & press enter
7) String [] args is present as paramaters in the main method, whenever we execute our .class file as mentioned in step.6, the control from the command line comes to the main method, 
at that time if there are some arguments that are passed they would be taken as parameters by the main method
8) String [] args is there as main method parameter to receive command line arguments, args here is a dynamic array that would take the command line arguments
9) if we don't write String [] args in the main method, our java program will not run, it is included in the default syntax of the main method
10) we can pass the arguments to the main method while running the .class file by java file_name command from the command prompt as follows :
java file_name all the arguments you want to pass : this is the syntax for passing the command line arguments
e.g. java file_name learning java (learning java here is the command line argument that would be passed to String [] args)
pass the arguments with the above step after you've compiled the program i.e, after you've run the javac file_name.java command
learning will be stored at 0th index in args & java will be stored at the 1st index in args
11) if you want to print what you've passed to the main method in args, you can also print it as follows :
public class Main{ // even if you write class ClassName without writing the public keyword, the program would still execute
    public static void main(String [] args){ // String args[] this would also work
        System.out.println(args[0]); // printing the argument which is at the 0th index of args array
        System.out.println(args[1]); // don't do "args[1]" with the quotes, else args[1] will get printed
    }
}

public static void main(String[] args) can also be written as static public void main(String args[]) or even static public void main(String ...args)
we can use any other name in the place of args & write (String ...suraj) with the main method

