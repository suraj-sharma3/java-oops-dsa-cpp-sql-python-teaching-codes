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
		System.out.println("Enter your number: ");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
    		if(i % 2 == 0 || i % 5 == 0){
    		    if(i % 2 == 0 && i % 5 == 0){
    		        continue;
    		    }
    		    else{
    		        System.out.println("The numbers divisible by 2 or 5 but not both from 1 till the entered number are : " + i);
    		    }
    		}
		}		
	}
}
