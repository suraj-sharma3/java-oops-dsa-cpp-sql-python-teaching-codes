/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// switch case can only be used with strings, charaters & integers & no other datatypes

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		switch (s){
		    case "word":
		        System.out.println("match with word");
		        break;
		    case "letter":
		        System.out.println("match with letter");
		        break;
		    default:
		        System.out.println("no match");
		}
		
		System.out.println("Enter an integer: ");
		int n = scan.nextInt();
		
		switch (n){
		    case 1:
		        System.out.println(n + 1);
		        break;
		    case 2:
		        System.out.println(n + 2);
		        break;
		        
		    case 3:
		        System.out.println(n + 3);
		        break;
		    default: 
		        System.out.println("no match");
		}
		
		System.out.println("Enter an character: ");
		char x = scan.next().charAt(0);
		
		switch (x){
		    case 'a':
		        System.out.println(x - 32);
		        break;
		    case 'b':
		        System.out.println(x - 32);
		        break;
		        
		    case 'c':
		        System.out.println(x - 32);
		        break;
		    default: 
		        System.out.println("no match");
		}
	}
}
