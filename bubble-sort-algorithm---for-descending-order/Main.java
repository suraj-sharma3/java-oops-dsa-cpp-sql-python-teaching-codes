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
	
	public static void bubbleSort(int arr[]){ // Creating Bubble Sort Function
	    int n = arr.length;
	    for(int i = 0; i < n - 1; i++){ // Number of Passes of Bubble Sort
	        for(int j = 0; j < n - 1 - i; j++){ // Number of Comparisions in each Pass
	            if(arr[j] < arr[j + 1]){ // for Descending Order
	               // Swapping Adjacent Elements
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}
	
// 	Time Complexity - O(n^2)
//  Space Complexity - O(1) i.e, Constant
}
