/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Next Greater Element Problem : Brute Force Approach

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
		
		int ans[] = new int[n];
		for(int i = 0; i < n; i++){
		    int maxOnRight = -1;
		    for(int j = i + 1; j < n; j++){
		        if(arr[j] > arr[i]){
		            maxOnRight = arr[j];
		            break;
		        }
		    }
		    ans[i] = maxOnRight;
		}
		System.out.println(Arrays.toString(ans));
	}
}
