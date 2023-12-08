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
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = input.nextInt();
		}
		
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int arr[]){
	    int n = arr.length;
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n - 1 - i; j++){
	            if(arr[j] > arr[j + 1]){
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	    
	    for(int i = n - 1; i >= 0; i--){
	        System.out.print(arr[i] + " ");
	    }
	}
}
