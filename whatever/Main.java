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
	System.out.println("Enter a number: ");
	int num = scan.nextInt();
// 	if(a%2 == 0){
// 	    System.out.println("Even Number");
// 	}
// 	else{
// 	    System.out.println("Odd Number");
// 	}

    if(num < 0){
        num = - num;
    }
    System.out.println(num);
	}
}
