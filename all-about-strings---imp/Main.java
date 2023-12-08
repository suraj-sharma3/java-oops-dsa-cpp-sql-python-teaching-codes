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
		String shy = "Suraj is shy"; // hard coding / literal way - string literal / string constant
		System.out.println(shy);
		System.out.println("Shavit is not an introvert");
		
// 	one more way of creating a string - creating a string object
        String what = new String("My name is Suraj Sharma");
        System.out.println(what);
        
        // String Object Methods / Functions
        // 1) .length()
        
        System.out.println(what.length()); // gives the no. of characters in the string
        
        int arr[] = {1,2,3,4,5};
        System.out.println(arr.length); // length is an attribute for an array but a method for a string
        
        String why = "       "; // space is also a character
        System.out.println("length of string in the variable why is : " + why.length());
        
        // 2) .charAt()
        
        System.out.println(what.charAt(4)); // gives the character at a particular index
        
        // 3) .indexOf()
        
        System.out.println(what.indexOf('j')); // gives the index of a particular character
        System.out.println(what.indexOf('z')); // returns -1 if the provided character is not present in the string
        System.out.println(what.indexOf('s', 15)); // 's' & 'S' are considered different (case sensitive)
        // starts searching for 's' from index no. 15
        
        System.out.println(what.indexOf('s', 6)); // starts searching for 's' from index no. 6
        System.out.println(what.indexOf("Suraj")); // gives the index at which the string "Suraj" starts
        System.out.println(what.indexOf("Shavit")); // returns -1 if the provided string is not present in the string
	
	    System.out.println(what.indexOf("Suraj", 12)); // starts searching for 'Suraj' from index no. 12
	    
	   // 4) .toUpperCase() & .toLowerCase()
	   
	   System.out.println(what.toUpperCase()); // converts the string to uppercase
	   System.out.println(what.toLowerCase()); // converts the string to lowercase
	   
	   //System.out.println(what.toUpperCase(12, 14)); (not applicable)
	   
	   // 5) .substring()
	   
	   System.out.println(what.substring(5)); // will give the part of the string i.e, substring from index 5 till the end of the string 
	   System.out.println(what.substring(6, 14)); // will give the part of the string i.e, substring from index 5 till index (14 - 1) i.e, 13 of the string in 'what'
	   
	   // 6) .replace()
	   
	   System.out.println(what.replace('S', 'z')); // will replace 'S' by 'z' everywhere in the string
	   System.out.println(what.replace("Suraj", "Deadsoul")); // will replace String
	   //System.out.println(what.replace("Suraj", 'G')); (not applicable)
	   
	   System.out.println(what.replace("Suraj", "G")); // (This Works) 'char' can only be replaced by 'char'
	   // "string" can only be replaced by a "string"
	   System.out.println(what.replace("a", "Great"));
	   
	   // 7) .split()
	   
	   String strarr[] = what.split(" ");
	   // String strarr[] creates a string 1D array, strarr points to that string array Object
	   // what.split(" ") - split(" ") splits or divides the string in 'what' at every space, we can provide anything in the place of space too 
	   // The strings obtained after splitting the string in 'what' are stored in the String array strarr (we can use any name)
	    
	   // we can use a loop to iterate over this string array that we created using .split()
	   // using for each loop to iterate over the string array
	   // for String whatever in strarr (string array), print string 'whatever' (we can use any name)
	   for(String whatever : strarr){
	       System.out.println(whatever);
	   }
	   
	   String sa[] = what.split("a"); // splits the string at every 'a'
	   
	   for(String th: sa){
	       System.out.println(th);
	   }
	}
}
