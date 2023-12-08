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
		System.out.println("User, enter a word (String) : ");
		String s = scan.next(); // take a string from the user in 's'
		int n = s.length(); // string length
		int freq[] = new int[26]; // frequency array to store the count of alphabets (26 alphabets that's why size 26)
		                            // every index of this frequency array represents an alphabet
		                            // a to z - index 0 to 25
		                            // at the start, element at every index of this frequency array is zero
		for(int i = 0; i < n; i++)
		{
		    char ch = s.charAt(i); // grab 1 character from the string 's' in'ch
		    freq[ch - 'a']++; // 'ch' - 'a' would return an integer value e.g. b - 'a' = 1
		                       // freq[ch - a] = element at an index, we'll increment the value at an index by 1
		                       // incrementing by 1 at an index in the frequency array means that we've found the
		                       // alphabet represented by that index one time in the string 's'
		}
		
		for(int i = 0; i < 26; i++)
		{
		    // the below line to store an alphabet in the 'ch' variable
		    char ch = (char)('a' + i); // e.g. 'a' + i when i = 0 means 97 which when typecasted to 'char' datatype
		                                // means 'a', we'll store in the 'ch' variable
		    int value = freq[i]; // e.g. freq[0] will tell us the number of times 'a' appeared in the string
		                        // we'll store this value in the 'value' variable
		    System.out.println(ch + " : " + value); 
		    // we'll print 'alphabet : number of times alphabet is present in string 's'
		}
	}
}

