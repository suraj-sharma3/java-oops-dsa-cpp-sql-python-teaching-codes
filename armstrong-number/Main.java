/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    for(int i = 1; i <= 500; i++){
          int num_to_check = i;
          long cubed_sum = 0;
          while(num_to_check > 0){
            int last_digit = num_to_check % 10;
            cubed_sum = cubed_sum + (last_digit*last_digit*last_digit);
            num_to_check = num_to_check / 10;
          }
          if(cubed_sum == i){
            System.out.println(cubed_sum);
          }
        }
		
      }
}
