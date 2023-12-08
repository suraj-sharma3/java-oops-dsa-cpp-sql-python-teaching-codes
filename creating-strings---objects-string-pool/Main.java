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
// 		String s1 = scan.nextLine();
// 		System.out.println(s1);
		
// 		String s2 = scan.next();
// 		System.out.println(s2);
		
// 		String ran = "Hello";
// 		char arr[] = ran.toCharArray();
// 		for(char x:arr){
// 		    System.out.println(x);
// 		}
		
// 		char a = scan.next().charAt(0);
// 		System.out.println(a);
		
// 		String s = scan.next();
// 		char b = s.charAt(1);
// 		System.out.println(b);
		
// 		String t = "Hello";
// 		t += "My name is Suraj";
// 		System.out.println(t);

    // 1) one way to create a string using 'new' keyword
		
		String st = new String("Hi, My Name is");
		String ts = new String("Hi, My Name is"); // even though 'ts' has the same content as 'st', still a new string object is created
		
		// both the above given string objects are created in the heap memory during run time
		System.out.println(st.equals(ts)); // equals() method compares the content of the strings 'st' & 'ts' which are same
		
		System.out.println(st == ts); // == compares the addresses of the strings 'st' & 'ts' which will obviously be different as both the strings are different string objects
	    
    // 2) another way to create a String
    
    // string literals are always created inside the string pool
    // this second method is used so that no new string objects are created for the same content containing strings
    // 2 string objects having the same content point to a single address (i.e, the object is created only once in the string pool for 2 or more strings having the same content)
    
	    String whatever = "Deadsoul"; // a string literal as we have hard coded the value of this string object
	    String however = "Deadsoul"; // no new string object is created as this string also has the same content as the above string 'whatever'
	    // however & whatever both the string have the same address here as 'however' just points to the already existing "Deadsoul" string in the string pool
	    // no new string object is created for however
	   // string pool can only contain distinct string objects
	    System.out.println(whatever == however);
	    System.out.println(whatever.equals(however));
	}
}
