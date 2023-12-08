/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Sliding Window Algorithm : 

// find the maximum from the sum of the elements of all the subarrays of size 3 from the given array.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    // For taking inputs
		Scanner scan = new Scanner(System.in);
		// Taking an array from the user
		System.out.println("Enter the size of the array : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		
		// Brute Force Approach : 
		
		System.out.println("Enter the size of the sub-array : ");
		// Taking the sub-array size from the user
		int subSize = scan.nextInt();
/*		int ans = 0; // to store the answer for the problem i.e, maximum from all the sums obtained
		for(int i = 0; i <= n - subSize; i++){ // i will go from 0 till 'n - sub array size' to avoid errors
		    int sum = 0; // sum of the elements of a subarray of size "subSize" will be stored in the 'sum' variable
		    for(int j = i; j < i + subSize; j++){ // j will go from ith index to (i + subSize)th index 
		                                          //  as we want to calculate the sum of the elements of the subarray of size "subSize"
		        sum = sum + arr[j];
		    }
		    ans = Math.max(ans, sum); // from the previous sum & the current sum, whichever is maximum will be 
		                              // stored in the 'ans' variable as we want the maximum from all the sums obtained
		}
		System.out.println("The maximum from sum of the elements of all the subarrays of size " + subSize + " is " + ans);
*/	
	    
	    // Using Sliding Window Algorithm : (Optimized Approach)
	    
	    // size of the array 'n' is already taken as inputs 
	    // the subarray size that we take from the user "subSize" can be considered as the given window size
	    
	    int sum = 0; // to store the sum of all the elements of a subarray of size "subSize" i.e, our window size
	    int maxSum = Integer.MIN_VALUE; // to store the maximum from all the sums obtained for all the subarrays 
	                                    // of size "subSize" i.e, our window size
	    int i = 0; // 'i' represents the start of our window, we'll start it from the 0th index of the array
	    int j = 0; // 'j' represents the end of our window, we'll start it from the 0th index of the array
	    
	    while(j < n){ // n = arr.length, when 'j' reaches 'n - 1' (ending index of the array), that means we've calculated
	                                    // the sum of all the subarrays of size 'subSize' possible in the given array
	        sum = sum + arr[j]; // we've to add the element at the index 'j' to our 'sum' to calculate the sum
	                            // of all the elements of a subarray of size 'subSize'
	        if((j - i) + 1 < subSize){ // subSize is the subarray size i.e, our window size
	                                    // when [(j - i) + 1 < subSize (i.e, Window size)], we need to move 'j'
	                                    // bcoz, that means that we haven't reached the end index of our window
	            j++;
	        } 
	        else if((j - i) + 1 == subSize){ // when [(j - i) + 1 == subSize (i.e, Window size)], 
	                                       // that means that we have reached the end index of our window
	            maxSum = Math.max(maxSum, sum); // we need to compare the current maximum sum 'maxSum' with the 
	                                            // current 'sum' (sum of elements of a subarray) & store whatever's
	                                            // greater in the maxSum (maxSum is the maximum among all the subarray sums)
	            sum = sum - arr[i]; // whenever [(j - i) + 1 == subSize (i.e, Window size)], & we first need to 
	                                // remove the element that was pointed by 'i' for the previous subarray from sum
	                                // before calculating the sum of all the elements for the current subarray & storing 
	                                // that sum into our 'sum' variable
	            i++; // moving 'i' & 'j' further
	            j++;
	        }
	    }
	    // outside the 'while' loop, our maxSum variable contains the maximum among all the subarray sums
	    System.out.println("The maximum sum from the subarrays of size " + subSize + " is " + maxSum);
	}
}

