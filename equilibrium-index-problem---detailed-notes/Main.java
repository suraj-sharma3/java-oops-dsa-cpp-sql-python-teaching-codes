/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Equilibrium Index Problem - Using Prefix Sum Algorithm

// Given an array, find the number of equilibrium index in the array.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    // For taking array input from the user : 
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < n; i++){
		    arr[i] = input.nextInt();
		}
		
		// Brute Force Approach : Time Complexity : O(n^3) {Very bad Time Complexity}
		// Space Complexity = O(1) {Constant} as we're only making a few variables which are leftsum, rightsum & count
		
	/*	int count = 0; // will be used to count the number of equilibrium indices in the array
		for(int i = 0; i < n; i++){
		    int leftsum = 0;
		    int rightsum = 0;
		    for(int j = 0; j <= i - 1; j++){
		        leftsum = leftsum + arr[j];
		    }
		    for(int k = i + 1; k <= n - 1; k++){
		        rightsum = rightsum + arr[k];
		    }
		    if(leftsum == rightsum){
		        count++;
		    }
		}
		System.out.println("The number of equilibrium index in the given array is " + count); */
		
		
	    // Optimized Approach : Using Prefix Sum Algorithm : Time Complexity = O(n) 
	    // Space Complexity = O(n) as we are making a new prefix sum array
	    
	    int psum[] = new int[n]; // creating a prefix sum array
	    psum[0] = arr[0]; // element at 0th index in psum array is the element at the 0th index in the array given by the user
	    for(int i = 1; i < n; i++){ // constructing the psum array from index 1 till index 'n - 1'
	        psum[i] = psum[i - 1] + arr[i];
	    }
	    
	    int count = 0; // will be used to count the number of equilibrium indices in the array
	    for(int i = 0; i < n; i++){
	        int leftsum = 0;
	        if(i > 0){
	            leftsum = psum[i - 1]; // sum of all the elements from the 0th index till (i - 1)th index
	                                    // i.e, sum of all the elements before (or to the left of) the ith index
	        }
	        int rightsum = psum[n - 1] - psum[(i + 1) - 1]; // sum of all the elements from (i + 1)th index till (n -1)th index
	                                       // i.e, sum of all the elements after (or to the right of) the ith index
	    
	        if(leftsum == rightsum){
	            count = count + 1;
	        }
	    }
	    System.out.println("The number of equilibrium index in the given array is " + count);
	}
}
