/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Reverse Integer problem (Without using 'long' for larger numbers)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		int reverseNum = reverseInteger(num);
		System.out.println(reverseNum);
	}
	
	public static int reverseInteger(int num){
	    int reverse = 0;
	    while(num > 0){ // or while(num != 0)
	        int lastDigit = num % 10; // grab the last digit from the given number
	        num = num / 10; // remove the last digit from the given number
	        // the overflow & underflow conditions have to be remembered
	        if(reverse > Integer.MAX_VALUE || reverse == Integer.MAX_VALUE && lastDigit > 7){ // we'll check the overflow condition
	            return 0;
	        }
	        if(reverse < Integer.MIN_VALUE || reverse == Integer.MIN_VALUE && lastDigit < -8){ // we'll check the underflow condition
	            return 0;
	        }
	        reverse = reverse * 10 + lastDigit; // calculate the reverse
	    }
	    return reverse;
	}
}
