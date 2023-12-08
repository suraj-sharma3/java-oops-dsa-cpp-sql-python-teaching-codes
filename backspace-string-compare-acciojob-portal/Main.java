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
		String s = scan.next();
		String t = scan.next();
		boolean ans = backspaceCompare(s, t);
		System.out.println(ans);
	}
	
	public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		int n = s.length();
		int m = t.length();

		for(int i = 0; i < n; i++){
			char ch = s.charAt(i);
			if(ch == '#' && st1.size() > 0){
				st1.pop();
			}
			else st1.push(ch);
		}
		for(int i = 0; i < m; i++){
			char ch = t.charAt(i);
			if(ch == '#' && st2.size() > 0){
				st2.pop();
			}
			else st2.push(ch);
		}
	    if(st1.size() != st2.size()) return false;
	    while(st1.size() > 0){
	        char ch1 = st1.pop();
	        char ch2 = st2.pop();
	        if(ch1 != ch2) return false;
	        
/*	        or
            if(st1.peek() != st2.peek()) return false;
            st1.pop();
            st2.pop();  */
	    }
	    return true;
    }
}
