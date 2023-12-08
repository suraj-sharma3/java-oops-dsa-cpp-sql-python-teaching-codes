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
		System.out.println("Enter 2 Integers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Enter an Operation Code from 0,1,2,3 where 0 means +, 1 means -, 2 means *, 3 means /");
		int op_code = scan.nextInt();
		if(op_code == 0){
		    System.out.println(a+b);
		}
		else if(op_code == 1){
		    System.out.println(a-b);
		}
		else if(op_code == 2){
		    System.out.println(a*b);
		}
		else if(op_code == 3){
		    if(b > 0){
		        System.out.println(a / b);
		    }else{
		        System.out.println("the 2nd number that has been entered should be greater than zero");
		    }
		}
		else{
		    System.out.println("The operation code has to be 0 or 1 or 2 or 3");
		}
		
	}
}
