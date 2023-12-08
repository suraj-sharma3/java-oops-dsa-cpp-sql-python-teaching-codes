/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// calculating square root of a number using binary search

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rootNum = squareRoot(num);
		System.out.println(rootNum);
	}
	
	public static int squareRoot(int num){ // squareRoot function will take the number as a parameter
	    long ans = 1; // keeping the ans (square root) as 1 initially
	    long l = 0; // keeping left position at 0
	    long r = num; // keeping right position at the number itself
	    
	    while(l <= r){ // while loop will run until l becomes greater than r
	        long mid = (l + r) / 2; // calculating mid position
	        if(mid * mid > num){ // if the square of the number at the mid position is greater than our number
	                            // then we need to search for the square root before the mid position
	            r = mid - 1;
	        }
	        else if(mid * mid < num){ // if the square of the number at the mid position is lesser than our number
	                            // then we need to search for the square root after the mid position
	            if((mid + 1)*(mid + 1) > num){ // if the square of the number at the mid position is lesser than our number
	                                       // & the square of the number just after mid position is greater than our number
	                ans = mid; // our answer will be the number at the mid position as we need to return the floor value
	                            // for the square root if our number is not a perfect square
	                break;
	            }
	            l = mid + 1; // if the square of the number at the mid position is lesser than our number
	                       // & the square of the number just after mid position is also lesser than our number
	                       // then we'll search for the square root after the number at mid position
	        }
	        else{ // mid * mid == num
	               // if the square of the number at the mid position is equal to our number
	               // then the number at the mid position is the square root of our number & hence our answer
	            ans = mid;
	            break;
	        }
	    }
	    return (int)ans; // we'll return the ans after typecasting it to integer from our squareRoot function
	}
}

