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
        int mat[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    for(j = 0; j < n; j++){ 
                /*  for(j = 0; j < n; j++) - this will also work
                   we should declare j again in the nested loop */
                        mat[i][j] = 1;
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }            
	}
}
