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
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		squareRoot(n);
	}
	
	public static void squareRoot(int n){
	    double temp;
	    double sqrt = n / 2;
	    do{
	        temp = sqrt;
	        sqrt = (temp + (n / temp)) / 2;
	        System.out.println(sqrt);
	    }while((temp - sqrt) != 0);
	}
}
