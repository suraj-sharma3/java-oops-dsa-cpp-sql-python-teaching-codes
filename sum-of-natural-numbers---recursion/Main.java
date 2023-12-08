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
		int n = scan.nextInt();
		int sum_till_n = sumNatural(n);
		System.out.println(sum_till_n);
	}
	
	public static int sumNatural(int n){
	    // Base case
	    if(n == 1){
	        return 1;
	    }
	    return n + sumNatural(n - 1);
	}
}

// Natural numbers start from 1 & not include 0