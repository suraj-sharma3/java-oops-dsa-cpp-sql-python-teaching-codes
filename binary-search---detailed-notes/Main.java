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
		System.out.println("Enter the size of your array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements in your array");
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		System.out.println("Sorting the array that you've created as Binary Search only works for a sorted array");
		Arrays.sort(arr);
		System.out.println("Enter the number that you want to find the index of in your array which is sorted now");
		int targetNum = scan.nextInt();
		String ans = binarySearch(arr, targetNum);
		System.out.println(ans);
	}
	
	public static String binarySearch(int array[], int target){
	    int n = array.length; // storing the size of the entered array
	    int startIndex = 0; // fixing the initial startIndex 
	    int lastIndex = n - 1; // fixing the initial LastIndex
	    while(startIndex <= lastIndex){ // we'll check for our target number until startIndex becomes greater than LastIndex
	        int midIndex = (startIndex + lastIndex) / 2; // step 1 : obtain the middle index of the array , midIndex - Middle Index
	        /* we need to calculate the middle index for every iteration of the while loop 
	        as the middle index will keep changing with change in our startIndex & lastIndex */
	        if(array[midIndex] == target){ // step 2 : if the element at the middle index is equal to our target number
	            String str = "Entered number is present in the array that you've created at index " + midIndex;
	            return str;
	        }
	        else if(target > array[midIndex]){ //step 3 : if our target number is greater than the element at the middle index
	            startIndex = midIndex + 1; // then look for our target number from index next to the middle index till the LastIndex
	        }                              /* as the array is sorted, if this condition is true, our target number will obviously 
	                                           come after the element at the middle index, as our target number is greater than 
	                                           the element at the middle index as per this condition */
	                                           
	        else{                          // if the target number is less than the element at the middle index
	            lastIndex = midIndex - 1;   
	        }                              /* then look for our target number from startIndex till the index that comes just before
	                                       the middle index because as the array is sorted, if this condition is true, our 
	                                       target number will obviously come before the element at the middle index, 
	                                       as our target number is less than the element at the middle index as per this condition */
	    }    
	    // if the target number is not present in the array, then we should print the below given statement
	    String str1 = "Entered number is not present in the array that you've created";
	    return str1;
	}
}


