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
		
		for(int i = 0; i < n - 1; i++){
		    int min_index = i;
		    for(int j = i + 1; j < n; j++){
		        if(arr[j] < arr[min_index]){
		            min_index = j;
		        }
		    }
		    int temp = arr[i];
		    arr[i] = arr[min_index];
		    arr[min_index] = temp;
		    System.out.println("After pass number " + i + " The array appears as " + Arrays.toString(arr));
		}
		
	}
}
