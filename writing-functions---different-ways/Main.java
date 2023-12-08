/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
Finding first & last index of a chracter in a string
import java.util.*;
public class Main
{
    // Creating a function to find the last index of the target character in the entered string
    // We can create our functions above as well as below our main function
    
     public static int firstIndexOfChar(String str, char target){
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char target = scan.next().charAt(0);
		int first_index = firstIndexOfChar(str, target);
		int last_index = lastIndexOfChar(str, target);
		System.out.println("first index of the entered character in the entered string is " + first_index);
		System.out.println("last index of the entered character in the entered string is " + last_index);
	}
	
	// Creating a function to find the first index of the target character in the entered string
    // We can create our functions above as well as below our main function
    
    public static int lastIndexOfChar(String str, char target){
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1; // target character is not present in the string
    }
}
