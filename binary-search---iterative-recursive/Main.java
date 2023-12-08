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
		System.out.print("Enter the size of the array : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter " + size + " elements in the array : ");
		for(int i = 0; i < size; i++){
		    arr[i] = scan.nextInt();
		}
		System.out.print("Enter the element that you want to search for in the array : ");
		int key = scan.nextInt();
		int sortedArr[] = new int[size]; 
		
		Arrays.sort(arr);
		sortedArr = arr;
		System.out.println("The array after becoming sorted will be " + Arrays.toString(sortedArr));
		
		int indexOfKey = binarySearchIerative(sortedArr, size, key);
		System.out.println("The index at which the key is present after sorting the array is " + indexOfKey);
		
		int indexOfKey1 = recursiveSearchCall(arr, key);
		System.out.println("The index at which the key is present after sorting the array is " + indexOfKey1);
	}
	
	public static int binarySearchIerative(int arr[], int size, int key){
	    int start = 0;
	    int end = size - 1;
	    int mid = 0;
	    while(start <= end){
	        mid = (start + end) / 2;
	        if(arr[mid] == key){
	            return mid;
	        }
	        else if(arr[mid] > key){
	            end = mid - 1;
	        }
	        else{ // arr[mid] < key
	            start = mid + 1;
	        }
	    }
	    return -1; // the key is not present in the array
	}
	
	public static int binarySearchRecursive(int arr[], int key, int start, int end){
	    // we can't declare start & end in a recursive function, because start & end would be declared again & again for every recursive call to the function
	    if(start > end){ // start has crossed the end without finding the key
	        return -1; // the key is not present in the array
	    }
	    int mid = (start + end) / 2;
	    
	    if(arr[mid] == key){
	        return mid;
	    }
	    else if(arr[mid] > key){
	        return binarySearchRecursive(arr, key, start, mid - 1);
	    }
	    else{ // arr[mid] < key
	        return binarySearchRecursive(arr, key, mid + 1, end);
	    }
	}
	
	public static int recursiveSearchCall(int arr[], int key){ // this function is for declaring the start & end for the binarySearchRecursive function
	    int n = arr.length;
	    int start = 0;
	    int end = n - 1;
	    return binarySearchRecursive(arr, key, start, end);
	}
}
