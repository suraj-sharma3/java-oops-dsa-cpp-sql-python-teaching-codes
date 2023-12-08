/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Merge Sort Algorithm : 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	}
	
	// we'll create a merge function which will accept 2 sorted arrays & it will merge them in sorted order
	/* this function will be used to merge the sorted subarrays which we get after partitioning our 
	original unsorted array */
	// this mergeArrays function is similar to how we merge 2 linked lists in sorted order
	
	static void mergeArrays(int arr[], int l, int mid, int r)
    { // this function will take the original array, it's left, right & mid index as parameters
         // 1 array is from l to mid, another is from mid + 1 to r
        int ans[] = new int[r - l + 1]; // this ans array is formed after merging the 2 sorted subarrays
        int i = l, j = mid + 1, k = 0; // 'i' will be used to iterate the subarray which ranges from 'l' to 'mid' index
         // i <= mid, j <= r  // 'j' will be used to iterate the subarray which ranges from 'mid + 1' to 'r' index
                            // 'k' will be used to iterate the array formed by merging the 2 sorted subarrays
         while(i <= mid && j <= r){ // while 'i' doesn't reaches the end of the first subarray (ranges from l to mid)
                                    // & 'j' doesn't reaches the end of the second subarray (ranges from mid + 1 to r)
            if(arr[i] < arr[j]){ // if the element of 1st subarray is smaller than the element of the 2nd subarray
                ans[k] = arr[i]; // then we'll store element of the 1st subarray in the ans array (array formed after merging the 2 subarrays)
                k++; i++; // we'll move 'k' forward in the ans array & we'll move 'i' forward in the 1st subarray
            }
            else { // arr[j] <= arr[i], if the element of the 2nd subarray is less than or equal to the element of the 1st subarray
                ans[k] = arr[j]; // then we'll store element of the 2nd subarray in the ans array (array formed after merging the 2 subarrays)
                k++; j++; // we'll move 'k' forward in the ans array & we'll move 'j' forward in the 2nd subarray
            }
         }
         
         // if we've finished iterating the 1st subarray or the 2nd subarray or both the subarrays
         // then we'll come out of the above while loop
         while(i <= mid){ // if the 1st subarray is still not finished & the 2nd subarray is finished
             ans[k] = arr[i]; // we'll store all the remaining elements of the 1st subarray into the ans array as it is
                                // as those elements are already sorted, the order of the ans array will not be disturbed
             k++; i++; // we'll move 'k' forward in the ans array & we'll move 'i' forward in the 1st subarray
         }
         while(j <= r){ // if the 2nd subarray is still not finished & the 1st subarray is finished
             ans[k] = arr[j]; //  we'll store all the remaining elements of the 2nd subarray into the ans array as it is
                            // as those elements are already sorted, the order of the ans array will not be disturbed
             k++; j++; // we'll move 'k' forward in the ans array & we'll move 'j' forward in the 2nd subarray
         }
         // now ans contains the merge sorted array
         // putting it back to arr
         // as we don't want to use extra space, & merge both the subarrays inplace
         // so we'll overwrite our original array by the elements of the ans array that we formed by merging the 2 subarrays
         k = 0; // initializing 'k' as 0 again to iterate the 'ans' array from start again
         for(i = l; i <= r; i++){ // iterating the original array 'arr' from 'l' to 'r'
             arr[i] = ans[k]; // storing elements of array 'ans' into the original array 'arr'
             k++; // we'll move 'k' forward in the 'ans' array
         }
    } // end of mergeArrays function
    
    // we'll create a mergeSort function which will use concept of recursion 
    /* the mergeSort function will keep dividing the original unsorted array into smaller subarrays until 
    dividing the original unsorted array further into subarrays is not possible */
    
    void mergeSort(int arr[], int l, int r) // mergeSort function will take the unsorted array 'arr', l & r as parameters
    {
        if(l < r){ // if left index is less than right index of the unsorted array
            int mid = (l + r) / 2; // calculate mid index
            mergeSort(arr, l, mid); // call mergeSort function & pass arr, l & mid as parameters
                                    // because our 1st subarray is from 'l' to 'mid'
            mergeSort(arr, mid + 1, r); // call mergeSort function & pass arr, mid + 1 & r as parameters
                                    // because our 2nd subarray is from 'mid + 1' to 'r'
            merge(arr, l, mid, r); // call merge function and pass arr, l, mid, r, the merge function will keep 
                                    // merging the subarrays until it forms a sorted array which has the same size 
                                    // as our originaL unsorted array
        }
    }

}
