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
		System.out.println("Enter a year of your choice");
		int year = scan.nextInt();
		if(year%100 == 0){
		    if(year%400 == 0){
		        System.out.println("Leap Year");
		    }
		    else{
		        System.out.println("Not a Leap Year");
		    }
		}
	    else{
	        if(year%4 == 0){
	            System.out.println("Leap Year");
	        }
	        else{
	            System.out.println("Not a Leap Year");
	        }
	    }
	    
	}
}
