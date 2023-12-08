/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
  
class Main {
  
    // Function to return prime number equal to or smaller than n 
    public static int nearestPrime(int n)
    {
  
        // All prime numbers are odd except two
        // 0 & 1 are not prime numbers
        // 2 is the only prime number that is even
        // all the prime numbers are odd except 2
        
        if (n % 2 == 0) // if n is even, it's nearest prime number can possibly be the odd number that comes just before it
            n--; // shifting n to the odd number that comes just before it
        // when n is even, it obviously can't be a prime number (exception : 2)
        // when n is odd, it can be a prime number
  
        int i, j;
        for (i = n; i >= 2; i -= 2) { // we'll iterate backwards as we want to find the nearest prime number to n
            // we'll iterate backwards from our updated n till 2 as 1 & 0 are not prime numbers
/*
            if (i % 2 == 0) // if i is even, we'll skip & move to the next iteration
                continue;
*/
            // if i is odd, we'll check if i is prime or not
            // as we're iterating backwards from n, the first prime number that we get would be the nearest prime number to n
            // to check if i is prime or not, we'll check if it has any factor from 3 till it's square root (square root of i)
            // as except 2, all the prime numbers are odd, we'll increment j by 2 everytime to only check for odd numbers
            for (j = 3; j * j <= i; j += 2) { 
                if (i % j == 0) // if j is a factor of i, then i is not a prime number as a prime number only has 2 factors which are 1 & the number itself
                    break; // if j is a factor of i, we'll break the loop & not check further for factors
            }
            // if outside the inner for loop, j is less than or equal to the square root of i, then i is not a prime number
            if (j * j > i) // if j is greater than the square root of i
                return i; // then i is a prime number & as we are checking backwards, i is also the nearest prime number to n
        }
        return 2; // if n is 2, the prime number equal to or less than n is 2
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number for which you want to find the prime number equal to or smaller than the number : ");
        int n = scan.nextInt();
        int nearestPrimeNum = nearestPrime(n);
        System.out.print("The prime number equal to or smaller than " + n + " is " + nearestPrimeNum);
    }
}

