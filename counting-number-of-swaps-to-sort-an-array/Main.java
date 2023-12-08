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
		int count = 0;
		boolean flag = false;
		for(int i = 0; i < n; i++){
		    flag = false;
		    for(int j = 0; j < n - 1; j++){
		        if(arr[j] > arr[j + 1]){
		            int temp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = temp;
		            count++;
		            flag = true;
		        }
		    }
		    if(flag == false){
		        break;
		    }
		}
		System.out.println("The number of swaps needed to sort the array is " + count);
		System.out.println("The first element of sorted array is " + arr[0]);
		System.out.println("The last element of sorted array is " + arr[n - 1]);
	}
}
