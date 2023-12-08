/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Recursive Binary Search Algorithm

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
		int target = scan.nextInt();
		int ans = binarySearch(arr, target, 0, n - 1);
		System.out.println(ans);
	}
	
	public static int binarySearch(int arr[], int target, int left, int right){
	    // this binarySearch function will accept the array, the target, the left & the right index of the array
	    // this binarySearch function will work on the principle of recursion
	    if(left > right){ // base case for this function (when left > right, that means 
	                       // the target is not present in the array)
	        return -1;
	    }
	    int mid = (left + right) / 2; // calculating middle index
	    if(arr[mid] > target){ // if element at mid is greater than target, then we'll search for target
	                            // before the element at the mid index
	        return binarySearch(arr, target, left, mid - 1); // passing mid - 1 in the place of right
	    }
	    if(arr[mid] < target){ // if element at mid is lesser than target, then we'll search for target
	                            // after the element at the mid index
	        return binarySearch(arr, target, mid + 1, right); // passing mid + 1 in the place of left
	    }
	    return mid; // if element at the mid index is equal to the target element, return mid index
	}
}
