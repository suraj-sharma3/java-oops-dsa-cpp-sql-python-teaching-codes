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
		
		insertionSort(arr);
		System.out.println("The provided array sorted in ascending order : ");
		arrayPrint(arr);
		System.out.println("The provided array sorted in descending order : ");
		arrayReverse(arr);
	}
	
	public static void insertionSort(int arr[]){
	    int n = arr.length;
	    for(int i = 1; i < n; i++){
	        int j = i - 1;
	        while(j >= 0){
	            if(arr[j] > arr[j + 1]){
	                // swap
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	            j--;
	        }
	    }
	}
	
	public static void arrayPrint(int arr[]){
	    int n = arr.length;
	    for(int i = 0; i < n; i++){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
	
	
	public static void arrayReverse(int arr[]){
	    int n = arr.length;
	    for(int i = n - 1; i >= 0; i--){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
}
