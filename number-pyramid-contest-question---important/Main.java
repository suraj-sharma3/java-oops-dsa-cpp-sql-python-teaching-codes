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
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
//  The first / outer for loop is to move from one row to the next
		for(int i = 1; i <= n; i++)
		{
		  //  This for loop is for printing starting spaces
		    for(int j = 1; j <= n-i; j++){
		        System.out.print(" "); // Don't use println here as you want to print the pattern that follows the starting spaces in the same row
		    }
		    
		  //  This for loop is for printing the pattern after starting spaces
		    for(int j = 1; j <= i; j++){
		        System.out.print(i + " "); // Don't use println here as you want to print (i + " ") 'i' number of times in the same row
		    }
		    System.out.println(); // After printing the starting spaces & the pattern in one row, we want to move to the next, that's why we have to use println here after both the inner for loops
		}
	}
}
