/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// In english language, pangram is a sentence that has all the alpahabets of english atleast once in it
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.next();
		int occurs[] = new int[26];
		for(int i = 0; i < sentence.length(); i++){
		    occurs[sentence.charAt(i) - 'a'] = 1;
		}
		int sum = 0;
		for(int i = 0; i < 26; i++){
		    sum += occurs[i];
		}
		if(sum == 26){
		    System.out.println("Pangram");
		}
		else{
		    System.out.println("Not a Pangram");
		}
	}
}
