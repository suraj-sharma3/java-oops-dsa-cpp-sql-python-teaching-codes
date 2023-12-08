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
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int x = scan.nextInt();
	    System.out.println(addNumbers(a, b));
	    System.out.println(f(x));
	   // System.out.println(ans);
	   
	}
	    public static int addNumbers(int a, int b){
	        int sum = a + b;
	        return sum;
	    }
	    public static int f(int x){
	        int eq = x*x + 5*x - 33;
	        return eq;
	    }
}
