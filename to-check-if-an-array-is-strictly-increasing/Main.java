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
		int test_case = scan.nextInt();
		// For running the main logic for the entered number of test cases stored in test_case variable
		for(int i = 0; i < test_case; i++){
		    int n = scan.nextInt();
		    int arr[] = new int[n];
		    for(int k = 0; k < n; k++){
		        arr[k] = scan.nextInt();
		    }
		    boolean flag = true;
		    for(int j = 1; j < n; j++){
		        if(arr[j] <= arr[j - 1]){
		            flag = false;
		        }
		    }
		    if(flag == true){
		        System.out.println("Array is strictly increasing");
		    }
		    else{
		        System.out.println("Array is not strictly increasing");
		    }
		}
	}
}
