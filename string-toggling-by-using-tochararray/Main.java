/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// converting the string to be toggled into an array & then toggling it's characters

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.trim();
		char arr[] = str.toCharArray(); // converting entered string into an array
		for(int i = 0; i < arr.length; i++){
		    char curr_char = arr[i];
		    if(curr_char >= 65 && curr_char <= 90){ 
		      //  or if(curr_char >= 'A' && curr_char <= 'Z')
		      // (char) is used for explicit typecasting here as curr_char + 32 or - 32 would give an integer
		        char toggled_char = (char)(curr_char + 32); // we can also write ('a' - 'A') in the place of 32
		         arr[i] = toggled_char;
		    }
		    else if(curr_char >= 97 && curr_char <= 122){
		      //  or else if(curr_char >= 'a' && curr_char <= 'z')
		        char toggled_char = (char)(curr_char - 32);
		        arr[i] = toggled_char;
		    }
		    else{
		        arr[i] = curr_char;
		    }
		}
// 	converting the array containing toggled characters into a string
		String toggled_str = new String(arr);
		System.out.println(toggled_str);
	}
}
