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
		System.out.println("Enter a number (from 1 to 12) that represents the month of your choice");
		int month_no = scan.nextInt();
		if(month_no == 1 || month_no == 3 || month_no == 5 || month_no == 7 || month_no == 8 || month_no == 10 || month_no == 12){
		    System.out.println("The entered month has 31 days");
		}
		else if(month_no == 2){
		     System.out.println("The entered month has 28 days");
		}
		else{
		     System.out.println("The entered month has 30 days");
		}
	}
}
