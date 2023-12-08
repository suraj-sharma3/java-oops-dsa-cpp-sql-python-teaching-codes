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
		int n = scan.nextInt();
		String str = scan.next();
//  stroring what countAlph function returns in a variable 'ans'
		int ans = countAlph(str);
		System.out.println("The number of alphabets in the entered string is " + ans);
	}
	
// 	Creating function countAlph to count the alphabets in a String

    public static int countAlph(String passed_string){
        int n = passed_string.length();
        int count_alph = 0;
        for(int i = 0; i < n; i++){
            char str_char = passed_string.charAt(i);
            if(str_char >= 65 && str_char <= 90 || str_char >= 97 && str_char <= 122){
                count_alph++;
            }
        }
        return count_alph;
    }
    
}
