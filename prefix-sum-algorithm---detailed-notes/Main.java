/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Prefix Sum Algorithm : 

// Given an array, find sum of all the elements in a given range of that array :

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    // Taking the array from the user : 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of your array : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements for your array : ");
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		// Taking the number of queries
		System.out.println("Enter number of queries : ");
		int queries = scan.nextInt();
		
		// Brute Force Approach : 
		
	/* for(int i = 0; i < queries; i++){ // no. of iterations for this 'for' loop = number of queries / queries
		    System.out.println("Enter the left index : ");
		    int left = scan.nextInt();
		    System.out.println("Enter the right index : ");
		    int right = scan.nextInt();
		    int sum = 0;
		    for(int j = left; j <= right; j++){ // no. of iterations for this 'for' loop = right - left + 1
		        sum += arr[j];
		    }
		    System.out.println("The sum of all the elements in the query no. " + (i + 1) + " is " + sum);
		} */
		
	/* Time complexity of Brute force Approach : 
	
	no. of iterations for outer 'for' loop = number of queries / queries
	no. of iterations for inner 'for' loop = right - left + 1
	
	Time complexity = queries * (right - left + 1)
	(the worst case values of left & right would be '0' & 'n - 1' respectively)
	therefore Worst case Time complexity = queries * ((n - 1) - 0 + 1)
	                                     = queries * (n - 1 + 1)
	                                     = queries * n (where n = no. of elements in the array)
Worst case Time complexity = O(queries * n) (this is a very poor time complexity, this will make the program inefficient) */       
		
		
		// Optimized Approach : Using Prefix Sum Algorithm 
		// 1) Constructing the prefix sum array (creating cumulative info)
		int psum[] = new int [n]; // the prefix sum array is of the same size as the array given by the user
		psum[0] = arr[0]; // the first element of the psum array is the first element of the given array
		for(int i = 1; i < n; i++){ // iterating from the second element of the psum array (index no : 1 i.e, i = 1)
		    psum[i] = psum[i - 1] + arr[i]; // using the construction formula of prefix sum array
		}
		
		// 2) Using the general formula for calculating sum of all the elements in a range
		// we've already taken the number of queries for which we want to calculate 
		// the sum of all the elements in a range in a variable 'queries' above
		
		for(int i = 0; i < queries; i++){ // running the loop for the number of queries given by the user
		    System.out.println("Enter the left index : ");
		    int left = scan.nextInt(); // taking the left index of the range of elements 
		    System.out.println("Enter the right index : ");
		    int right = scan.nextInt(); // taking the right index of the range of elements 
		    if(left == 0){ // if left index is 0, then we just need to add elements from 0th index till the right index
		        System.out.println(psum[right]);
		    }
		    else{ // if left index is not 0, then we'll use our general formula of prefix sum algorithm (Refer NB)
		        System.out.println("The sum of all the elements in the query no. " + (i + 1) + " is " + (psum[right] - psum[left - 1]));
    // psum[right] is the sum of all the elements from 0th index till the right index
    // psum[left - 1] is the sum of all the elements from 0th index till (left - 1)th index
		    }
		}
	}
}



