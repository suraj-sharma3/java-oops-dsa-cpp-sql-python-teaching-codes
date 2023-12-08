/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// to find the minimum length word from a string

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String arr[] = str.split(" ");
		String smallest = arr[0];
		for(int i = 0; i < arr.length; i++){
		    int to_check = arr[0].length();
		    if(arr[i].length() < to_check){
		        smallest = arr[i];
		    }
		}
		System.out.println(smallest);
	}
}
