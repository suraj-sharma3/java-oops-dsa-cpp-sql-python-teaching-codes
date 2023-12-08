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
		int sum = scan.nextInt();
		int count_triplet = countTriplets(arr, n, sum);
		System.out.println(count_triplet);
	}
	
	public static int countTriplets(int arr[], int n, int sum){
	    int count = 0;
	    for(int i = 0; i < n - 2; i++){
	        for(int j = i + 1; j < n - 1; j++){
	            for(int k = i + 2; k < n; k++){
	                if(arr[i] + arr[j] + arr[k] < sum){
	                    count++;
	                }
	                
	            }
	        }
	    }
	   return count; 
	}
}
