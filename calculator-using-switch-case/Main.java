/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter +, -, *, /: ");
		char operator = scan.next().charAt(0);
	    System.out.println("Enter a: ");
		double a = scan.nextDouble();
		System.out.println("Enter b: ");
		double b = scan.nextDouble();
		switch (operator){
		    case '+':
		        System.out.println(a + b);
		        break;
		    case '-':
		        System.out.println(a - b);
		        break;
		    case '*':
		        System.out.println(a * b);
		        break;
		    case '/':
		        if(b == 0){
		            System.out.println("Please enter some other number as b");
		        }
		        else{
		            System.out.println(a / b);
		        }
		    break;
		    default: 
		    System.out.println("Please Read Manual");
		}
		System.out.println("Thank you for using calculator");
	}
}
