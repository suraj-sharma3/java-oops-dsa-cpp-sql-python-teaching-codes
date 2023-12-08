/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int arr[][] = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        boolean flag = true;

        for(int i = 0; i < m; i++){
            if(flag == true){
/* when flag is true, elements of rows are printed from 
   left to right */
                for(int j = 0; j < n; j++){
                    System.out.print(arr[i][j] + " ");
                }
                flag = false;
                System.out.println();
            }
                        
/* after every left to right print, flag becomes false so that in 
   the next iteration, elements are printed from right to left */
            else{
/* when flag is false, elements of rows are printed from 
   right to left */
                for(int j = n - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
                flag = true;
                System.out.println();
            }
                        
/* after every right to left print, flag becomes true so that in 
   the next iteration, elements are printed from left to right */
        }
	}
}