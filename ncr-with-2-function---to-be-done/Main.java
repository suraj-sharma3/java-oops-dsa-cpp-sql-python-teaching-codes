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
	    Scanner scan = new Scanner(System.in){
	    int n = scan.nextInt();
	    int r = scan.nextInt();
	    
	    long ans = ncr(n, r);
	    System.out.println(ans);
	    }
	}
	
	public static long ncr(int n, int r){
	    long n_fact = fact(n);
	    long r_fact = fact(r);
	    long nrfact = fact(n - r);
	    long ncr_ans = n_fact / (r_fact * nrfact);
	    
	    return ncr_ans;
	}
	
	public static long fact(int n){
	    long num_fact = 1;
	    for(int i = 1; i <= n; i++){
	        num_fact *= i;
	    }
	    return num_fact;
	}
}
