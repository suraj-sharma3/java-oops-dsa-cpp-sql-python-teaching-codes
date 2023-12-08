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
	   // To check Prime Numbers
	   // A Prime number only has 2 factors which are 1 & the number itself
	   // 1 is not a prime number as it has only 1 factor which is 1 itself
	    boolean flag = false;
	    for(int i = 2; i < n; i++){
	       // To check if the entered number 'n' has any other factor other than 1 & itself
	        if(n % i == 0){
	            flag = true;
	            break; // once we find one more factor other than 1 & the number 'n' itself, then the number is not prime
	        }
	    }
	    if(flag == true){
	        System.out.println("Entered number is not a prime number");
	    }
	    else{
	        System.out.println("Entered number is a prime number");
	    }
	}
}
