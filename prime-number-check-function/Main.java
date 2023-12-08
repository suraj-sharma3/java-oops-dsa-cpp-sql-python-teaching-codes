/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// to check if a number is prime, a prime number has only 2 factors (1 & the number itself) 
// to find all the factors of a number, we just need to check for the factors till the square root of that number
// after the square root of the number, the same factors repeat
// 1 is not a prime number as it has only 1 factor

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean ans = primeCheck(n);
        if(ans == true){ // or we can even write if(ans) as thsis also means if(ans == true)
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
	}
	
// 	if the number is not prime primeCheck returns false else it returns true

    public static boolean primeCheck(int n){
    // i^2 <= n is similar to i <= n^1/2 (square root of n)
    // for any number 'n', unique factors can be found 
    // 1 is a factor of all the numbers, so starting to check from 2 for the other factors
    // if there is even 1 number other than 1 or the number 'n' itself that is a factor of the number 'n', then 'n' is not a prime number
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

