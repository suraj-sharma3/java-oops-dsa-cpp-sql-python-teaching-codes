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
		int a = 0;
		int b = n-1;
		while(a < b){
		    int temp = arr[a];
		    arr[a] = arr[b];
		    arr[b] = temp;
		    a++; // a moves forward
		    b--; // b moves backward
		}
		for(int j = 0; j < n; j++){
		    System.out.print(arr[j] + " ");
		}
		
	}
}
