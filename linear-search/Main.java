/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Linear Search Example - Can be used for both sorted as well as unsorted array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Linear search for a sorted array : 
		
		/* int arr[] = {2, 5, 1, 8, 3, 6, 4, 9, 7};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a number from 1 to 9");
		int num = scan.nextInt();
		System.out.println("Your selected number is " + num);
		
		for(int i = 0; i < arr.length; i++){
		    if(arr[i] == num){
		        System.out.println("Your entered number is present in the array at index " + i);
		        return; // if arr[i] = num then the statement inside the if condition is printed & we come out of the main function
		    }
		}
		System.out.println("Your entered number is not present in the array");
		// if arr[i] != num then the above statement is printed */
		
		// Linear search for an unsorted array : 
		
		int arr1[] = {5, 8, 1, 7, 3, 9, 6, 10, 2, 4}; // unsorted array
		System.out.println("Enter a number of your choice from 1 to 10");
		int num1 = scan.nextInt();
		for(int i = 0; i < arr1.length; i++){
		    if(arr1[i] == num1){
		        System.out.println("The number you entered is present at index " + i);
		        return;
		    }
		}
		System.out.println("The number you entered is not present in the unsorted array arr1");
		
	}
}





