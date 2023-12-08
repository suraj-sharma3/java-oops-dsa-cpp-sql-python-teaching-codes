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
	    Stack<Character> myStack = new Stack<>();
	    String str = scan.next();
	    int n = str.length();
	    for(int i = 0; i < n; i++){
	        myStack.push(str.charAt(i));
	    }
	    
	   // while(!myStack.empty()){
	   //     System.out.print(myStack.pop());
	   // }
	    
	    // or if we want to return the reversed string
	    
	    String reversedStr = "";
	    while(!myStack.empty()){
	        reversedStr += myStack.pop();
	    }
	    System.out.println(reversedStr);
	}
}
