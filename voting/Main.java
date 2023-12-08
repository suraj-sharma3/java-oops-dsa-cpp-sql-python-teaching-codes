/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter your age : ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age >= 18){
		    if(age >=200){
		        System.out.println("Enter a Valid age");
		    }else{
		    System.out.println("You can Vote");
		    }
		}
	    else{
	        System.out.println("You can't vote");
	    }
	}
}

