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
		int start = arr[0];
		int end = arr[n - 1];
		boolean flag = true;
		while(start < end){
		    if(arr[start] != arr[end]){
		        flag = false;
		        break;
		    }
		    start++;
		    end--;
		}
		if(flag == false){
		    System.out.println("not a palindrome");
		}
		else{
		    System.out.println("palindrome");
		}
	}
}
