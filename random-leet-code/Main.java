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
		countOperations(arr);
	}
	
	public static void countOperations(int arr[]){
	    int n = arr.length;
	    int count = 0;
	    for(int i = 0; i < n; i++){
	        
	        for(int j = i + 1; j < n; j++){
	            while(arr[j] <= arr[i]){
	                arr[j]++;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
