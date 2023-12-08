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
		String str = scan.next();
		System.out.println("Enter the index for which the element needs to be checked that if it's uppercase or not");
	    int index1 = scan.nextInt();
	    boolean ans_upper = Character.isUpperCase(str.charAt(index1));
	    System.out.println(ans_upper);
	    
	    System.out.println("Enter the index for which the element needs to be checked that if it's lowercase or not");
	    int index2 = scan.nextInt();
	    boolean ans_lower = Character.isLowerCase(str.charAt(index2));
	    System.out.println(ans_lower);
	    
	    
	   /* We can use the same counter variable for 2 loops that are nested, we just shouldn't declare the 
	   counter variable inside the inner loop again */
	   int n = scan.nextInt();
	   int m = scan.nextInt();
	   int arr[][] = new int[n][m]; 
	   for(int i = 0; i < n; i++){
	       for(i = 0; i < m; i++){
	           arr[i][i] = scan.nextInt();
	       }
	   }
	   System.out.println(Arrays.toString(arr));
	}
}
