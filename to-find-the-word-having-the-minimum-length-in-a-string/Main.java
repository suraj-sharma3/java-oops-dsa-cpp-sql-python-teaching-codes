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
	    String str = scan.nextLine();
	    str = str.trim();
	    
	   // start_index & end_index are being used to mark the start & end of every word of the string
	    int end_index = 0;
	    int start_index = 0;
	    int ans = 0;
	    int len = str.length();
	    int minlen = str.length();
	    while(end_index < len){
    	    while(end_index < len && str.charAt(end_index) != ' '){ // to move end_index until it encounters a space
    	        end_index++;
    	    }
    	    int currlen = end_index - start_index; // currlen is the curret word's length
    	    if(currlen < minlen){
    	        minlen =  currlen;
    	        ans = start_index;
    	    }
    	    
    	    while(end_index < len && str.charAt(end_index) == ' '){ // to move end_index until it encounters a letter
    	        end_index++;
    	    }
    	    start_index = end_index;
	    }
	    System.out.println(str.substring(ans, ans + minlen));
	}
}
