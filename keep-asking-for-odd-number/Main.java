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
	while(n%2 == 0){
	    System.out.println("Enter an odd number");
	    n = scan.nextInt();
	}
	System.out.println("The odd number that you entered is " + n);
	}
}
