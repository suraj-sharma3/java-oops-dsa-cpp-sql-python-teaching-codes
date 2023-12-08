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
	    
    // To count the number of words in an entered sentence - 1st Way
    
// 		Scanner scan = new Scanner(System.in);
// 		String sent = scan.nextLine();
// 		String str_arr[] = sent.split(" ");
// 		System.out.println(str_arr.length);
		
    // To count the number of words in an entered sentence - 2nd Way
    
        Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();
		int space_count = 0;
		for(int i = 0; i < sent.length(); i++){
		    if(sent.charAt(i) == ' '){
		        space_count++;
		    }
		}
		System.out.println("The number of words in your entered sentence are " + (space_count + 1));
	}
}
