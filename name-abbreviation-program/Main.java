/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String abbr = "";
        for(int i = 0; i < str.length(); i++){
            // if(str.charAt(i) >= 65 && str.charAt(i) <= 90) or 
            if(Character.isUpperCase(str.charAt(i))){
                abbr += str.charAt(i);
            }
        }
        System.out.println(abbr);
	}
}