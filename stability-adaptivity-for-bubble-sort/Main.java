/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
		
		bubbleSort(arr); // Calling Bubble Sort Function
		System.out.println(Arrays.toString(arr)); // Arrays.toString() - converts an array to a string
	}
	
	// using an integer swaps or a boolean flag, we can make our Bubble sort algorithm Adaptive (intelligent)
	// an Adaptive doesn't takes the same time to run if it is provided with an already sorted array
	// Bubble sort is a stable algorithm as it doesn't changes the relative ordering of 2 same elements in an array
	/* if in the "if" condition that is inside the inner for loop, if we use if(arr[j] >= arr[j + 1]), 
	then the bubble sort algorithm will become unstable */
    /* if a sorted array is given as an input to an adaptive bubble sort algorithm, only 1 pass will be performed,
    the pass for i = 0 */
	
	public static void bubbleSort(int arr[]){ // Creating Bubble Sort Function
	    int n = arr.length;
	    for(int i = 0; i < n - 1; i++){ // Number of Passes of Bubble Sort
	        int swaps = 0;  // or boolean flag = false;
	        for(int j = 0; j < n - 1 - i; j++){ // Number of Comparisions in each Pass
	            if(arr[j] > arr[j + 1]){ // for Ascending Order
	               // Swapping Adjacent Elements
	                swaps++;  // flag = true;
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	        if(swaps == 0){  // if(flag == false)
	            return;
	        }
	    }
	}
	
// 	Time Complexity - O(n^2)
//  Space Complexity - O(1) i.e, Constant
}




