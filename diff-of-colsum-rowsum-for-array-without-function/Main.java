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
        int n = scan.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int  j = 0; j < n; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            int rowsum  = 0;
            int colsum = 0;
            /* to find rowsum, we'll keep row index same & 
            will change column index (i - row & j - column) */
            for(int j = 0; j < n; j++){
                rowsum += mat[i][j];
            }
            /* to find colsum, we'll keep column index same & 
            will change row index (i - column & j - row) */
            for(int j = 0; j < n; j++){   
                colsum += mat[j][i];
            }
            System.out.println();
            System.out.println(colsum - rowsum);
        }
	}
}
