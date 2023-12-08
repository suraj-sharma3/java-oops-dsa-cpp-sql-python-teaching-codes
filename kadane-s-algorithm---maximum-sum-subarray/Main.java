/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Maximum Sum Subarray Sum Using Kadane's Algorithm : 

/* Given an integer array nums, find the subarray which has the largest sum and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
//		int ans = bruteForce(arr);
        int ans = kadaneAlgo(arr);
		System.out.println(ans);
	}
	
/*	public static int bruteForce(int arr[]){ // Using Brute Force Approach : Time Complexity - O(n^2)
	    int n = arr.length;
	    int maxSum = 0;
	    for(int i = 0; i < n; i++){
	        int currSum = 0;
	        for(int j = i; j < n; j++){
	            currSum = currSum + arr[j];
	            maxSum = Math.max(currSum, maxSum);
	        }
	    }
	    return maxSum;
	} */
	
	public static int kadaneAlgo(int arr[]){ // Optimized Approach : Using Kadane's Algorithm : TC - O(n)
	    int n = arr.length;
	    int currSum = 0;
	    int maxSum = 0;
	    for(int i = 0; i < n; i++){
	        currSum = currSum + arr[i];
	        if(currSum > maxSum){
	            maxSum = currSum;
	        }
	        if(currSum < 0){
	            currSum = 0;
	        }
	    }
	    return maxSum;
	}
	
/*	public static int alternateKadane(int arr[]){
	    int n = arr.length;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);
            if(sum < 0) sum = 0;
        }
        return maxsum;
	} */
}
