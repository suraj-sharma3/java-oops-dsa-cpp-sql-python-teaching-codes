/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Q : to find the character that occurs the most often in the entered string & return the number of times it occurs

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Word : ");
		String str = scan.next();
		
		// using frequency array : 
		
/*		int freq[] = new int[26];
		for(int i = 0; i < str.length(); i++){
		    char ch = str.charAt(i);
		    freq[ch - 'a']++;
		}
		
		int max = 0;
		char maxch = ' ';
		for(int i = 0; i < freq.length; i++){
		    if(max  < freq[i]){
		        max = freq[i];
		        maxch = (char)('a' + i);
		    }
		}
		System.out.println(maxch + " : " + max);
*/		
		// Using hashmap : 
		
		HashMap<Character, Integer> freqMap = new HashMap<>();
		for(int i = 0; i < str.length(); i++){
		    char ch = str.charAt(i);
		    if(freqMap.containsKey(ch)){
		        int value = freqMap.get(ch) + 1;
		        freqMap.put(ch, value);
		    }
		    else{
		        freqMap.put(ch, 1);
		    }
		}
		int max = 0;
		char maxch = ' ';
		
		for(Character ch : freqMap.keySet()){
		    if(max < freqMap.get(ch)){
		        max = freqMap.get(ch);
		        maxch = ch;
		    }
		}
		System.out.println(maxch + " : " + max);
	}
}
