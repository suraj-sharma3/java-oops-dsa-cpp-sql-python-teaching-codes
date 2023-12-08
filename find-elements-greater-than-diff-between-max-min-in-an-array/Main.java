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
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++){
		    if(arr[i] < min){
		        min = arr[i];
		    }
		    if(arr[i] > max){
		        max = arr[i];
		    }
		}
		
		int diff = max - min;
		int count = 0;
		
		for(int i = 0; i < n; i++){
		    if(arr[i] > diff){
		        count++;
		    }
		}
		
		System.out.println(count);
	}
}
