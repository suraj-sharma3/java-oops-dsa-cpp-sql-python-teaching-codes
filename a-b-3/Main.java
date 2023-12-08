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
		Scanner scan  = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = (a + b)*(a + b)*(a + b);
		int d = (a*a*a) + (b*b*b) + 3*a*b*(a + b);
		System.out.println("(a+b)^3 = " + c);
		System.out.println("a^3 + b^3 + 3*a*b*(a + b) = " + d);
	}
}
