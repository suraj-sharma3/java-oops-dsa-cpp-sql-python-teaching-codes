/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Valid Anagram (LeetCode) Using HashMap

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String s = scan.next();
		String t = scan.next();
		boolean ans = anagramCheck(s, t);
		System.out.println("The 2 Entered Strings are Anagrams of each other : " + ans);
	}
	
	// Using HashMap
	public static boolean anagramCheck(String s, String t){
	    int n = s.length();
	    int m = t.length();
	    if(n != m){
	        return false;
	    }
	    HashMap<Character, Integer> hm1 = new HashMap<>();
	    HashMap<Character, Integer> hm2 = new HashMap<>();
	    
	    for(int i = 0; i < n; i++){
	        char ch1 = s.charAt(i);
	        char ch2 = t.charAt(i);
	        
	        if(hm1.containsKey(ch1)){
	            hm1.put(ch1, hm1.get(ch1) + 1);
	        }
	        else{
	            hm1.put(ch1, 1);
	        }
	        
	        if(hm2.containsKey(ch2)){
	            hm2.put(ch2, hm2.get(ch2) + 1);
	        }
	        else{
	            hm2.put(ch2, 1);
	        }
	    }
	    return hm1.equals(hm2);
	}
	
	// Using Frequency Array
/*	public boolean anagramCheck(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        int sarr[] = new int[26]; // frequency array for 's' string characters
        int tarr[] = new int[26]; // frequency array for 't' string characters
        
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            sarr[ch1 - 'a']++;
            tarr[ch2 - 'a']++;
         }
        return Arrays.equals(sarr, tarr);
    }
*/

}

            // Using Inbuilt Methods : 
            
            /*  Scanner scan = new Scanner(System.in);
                String s1 = scan.next();
                String s2 = scan.next();

                char new1[] = s1.toCharArray();
                char new2[] = s1.toCharArray();

                Arrays.sort(new1);
                Arrays.sort(new2);

                String s1_sorted = new String(new1);
                String s2_sorted = new String(new2);

                if(s1_sorted.equals(s2_sorted)){
                        System.out.println("Yes");
                }
                else{
                        System.out.println("No");
                } */

