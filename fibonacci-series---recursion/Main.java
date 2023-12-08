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
		int fibo_n = fibo(n);
		System.out.println(fibo_n);
	}
	
	public static int fibo(int n){
	    if(n == 1){
	        return 0;
	    }
	    if(n == 2){
	        return 1;
	    }
	    return fibo(n - 1) + fibo(n - 2);
	}
}


// Time Complexity - 2^n
