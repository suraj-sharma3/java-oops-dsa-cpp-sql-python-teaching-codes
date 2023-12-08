/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) throws java.lang.Exception
	{
// 	Program to count the number of alphabets in a string	
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        int str_len = str.length();
        int count = 0;
        if(str_len != n){
            System.out.println("Enter a string of size equal to the number you've entered");
        }
/*      else{
            
        // 1st Way : (Inside else)
        
            for(int i = 0; i < n; i++){
                char str_char = str.charAt(i);
                if(str_char >= 65 && str_char <= 90 || str_char >= 97 && str_char <= 122)
                {
                    count++;
                }
            }
            System.out.println(count); 
        } */
        
        
        // 2nd Way : (Inside else)
        
        else{
        
            for(int i = 0; i < n; i++){
                char str_char = str.charAt(i);
                if(str_char >= 'A' && str_char <= 'Z' || str_char >= 'a' && str_char <= 'z')
                {
                    count++;
                }
            }
            System.out.println(count); 
        } 
	}
}

// Time complexity - O(n)
// Space Complexity - O(1)

