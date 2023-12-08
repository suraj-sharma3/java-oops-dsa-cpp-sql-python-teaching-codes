/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
/* The count of all the instances when the sum of the elements of a sub array is divisible by k will be 
stored in count variable */
        int count = 0;
// for every value of i(every index), j will go from i till n - 1
        for(int i = 0; i < n; i++){
            int sum = 0;
// sum of all the elements of a sub array will be stored in sum
            for(int j = i; j < n; j++){
// an array element at index j is grabbed & added in sum
                sum = sum + arr[j];
/* checking if the sum of the elements of a sub array 
   is divisible by k or not */
                if(sum % k == 0){
                    count++;
                }
            }
        }
/* printing the count of all the instances when the sum of 
the elements of a sub array is divisible by k */
        System.out.println(count);
	}
}