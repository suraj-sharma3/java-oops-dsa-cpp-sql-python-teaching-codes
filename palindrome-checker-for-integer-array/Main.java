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
		boolean flag = true;
		for(int i = 0; i < n/2; i++){
		    if(arr[i] != arr[n-i-1]){
		        flag = false;
		        break;
		    }
		}
		if(flag == false){
		    System.out.println("Not a palindrome");
		}
		else{
		    System.out.println("Palindrome");
		}
	}
}
