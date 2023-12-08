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
		System.out.print("Enter 3 numbers in the variables a, b & c : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("The values of a, b & c before swapping are " + a + ", " + b + " & " + c + " respectively");
		System.out.println("Let's swap & store a in b, b in c & c in a");
		int ans[] = swapThree(a, b, c);
		System.out.println("After swapping, a is " + ans[0]);
		System.out.println("After swapping, b is " + ans[1]);
		System.out.println("After swapping, c is " + ans[2]);
	}
	
	// we'll put a in b, b in c & c in a by swapping
	public static int[] swapThree(int a, int b, int c){
	    int ans[] = new int[3]; // to store the swapped values of a, b & c
	    // we'll store the new value of a, b & c at index 0, 1 & 2 respectively in the array 'ans'
	    
	    // we'll add a, b & c & will keep the sum in a
	    a = a + b + c;
	    
	    // now, we'll do b = a - (b + c)
	    b = a - (b + c); // here as a = a + b + c, b = (a + b + c) - (b + c) which is actually b = a
	    // after the above step, we'll have b = a
	    
	    // now, we'll do c = a - (b + c)
	    c = a - (b + c); // here as a = a + b + c & b = a, c = (a + b + c) - (a + c) which is actually c = b
	    // after the above step, we'll have c = b
        
        // now, we'll do a = a - (b + c)
        a = a - (b + c); // here as a = a + b + c & b = a & c = b, a = (a + b + c) - (a + b) which is actually a = c
        // after the above step, we'll have a = c
        
        // now we have b = a, c = b & a = c 
        // lets insert the swapped values in the array 'ans'
        
        ans[0] = a;
        ans[1] = b;
        ans[2] = c;
        
        return ans;
	}
}
