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
		System.out.print("Enter the number till which you want to find all the prime numbers : ");
		int n = scan.nextInt();
		boolean isPrime[] = sieveOfEratosthenes(n);
		System.out.println("true beside a number means that number is prime & false beside a number means that number is not prime");
		for(int i = 0; i <= n; i++){
		    System.out.println(i + " " + isPrime[i]);
		}
		
	}
	
	public static boolean[] sieveOfEratosthenes(int n){
	    boolean isPrime[] = new boolean[n + 1];
	    Arrays.fill(isPrime, true);
	    isPrime[0] = false;
	    isPrime[1] = false;
	    
	    for(int i = 2; i * i <= n; i++){ // i*i <= n is equivalent to i <= n^1/2 (square root of n)
	        for(int j = 2 * i; j <= n; j += i){
	            isPrime[j] = false;
	        }
	    }
	    return isPrime;
	}
}
