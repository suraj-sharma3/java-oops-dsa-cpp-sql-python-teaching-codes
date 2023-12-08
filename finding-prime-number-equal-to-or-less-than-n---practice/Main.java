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
		int ans = nearPrime(n);
		System.out.println(ans);
		
	}
	
	public static int nearPrime(int n){
	    // if n is even, it can't be a prime unless it's 2, 
	    if(n % 2 == 0){
	        n--;
	    }
	    int i, j;
	    for(i = n; i >= 2; i -= 2){
	        for(j = 3; j * j <= i; j += 2){
	            if(i % j == 0){
	                break;
	            }
	        }
	        if(j * j > i){
	            return i;
	        }
	    }
	    return 2;
	}
}
