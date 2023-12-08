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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		int sum_even = 0;
		int sum_odd = 0;
		for(int i = 0; i < n; i++){
		    if(arr[i] % 2 == 0){
		        sum_even += arr[i];
		    }
		    else{
		        sum_odd += arr[i];
		    }
		}
		System.out.println("sum of all the even numbers " + sum_even);
		System.out.println("sum of all the odd numbers " + sum_odd);
	}
}
