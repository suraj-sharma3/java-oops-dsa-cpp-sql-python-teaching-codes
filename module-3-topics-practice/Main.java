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
	    System.out.println("Enter " + n + " array elements : ");
	    for(int i = 0; i < n; i++){
	        arr[i] = scan.nextInt();
	    }
	    // creating prefix xum array for arr
	    int psum[] = new int[n];
	    psum[0] = arr[0];
	    for(int i = 1; i < n; i++){
	        psum[i] = psum[i - 1] + arr[i];
	    }
	    System.out.println("Your Prefix Sum Array : ");
	    for(int i = 0; i < n; i++){
	        System.out.print(psum[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Enter left & right indices : ");
	    int left = scan.nextInt();
	    int right = scan.nextInt();
	    System.out.println("Sum of your subarray from "  + arr[left] + " to " + arr[right]  + " is : ");
	    if(left == 0){
	        System.out.println(psum[right]);
	    }
	    else{ // left != 0
	        System.out.println(psum[right] - psum[left - 1]);
	    }
	    
	    
	}
}
