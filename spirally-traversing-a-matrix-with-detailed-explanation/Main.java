/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Spirally Traversing a Matrix

/*
Explanation : 

Approach To Solve : Consider 4 Variables first_row, last_row, first_column, last_column

first_row - Top most Row
last_row - Bottom most Row
first_column - Left most Column
last_column - Right most Column

Example : 
Row Number(r)   Column Number(c)
   4                  4

2D Matrix : 

        first_column                        last_column
first_row - 1           2           3           4
            5           6           7           8
            9           10          11          12
last_row -  13          14          15          16

initialise : for above given 4*4 Matrix -

first_row = 0 (row index - 0)
last_row = r - 1 (row index - 3)

first_column = 0 (column index - 0)
last_column = c - 1 (column index - 3)

*/

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    //Taking inputs for number of rows (r) & number of columns (c)
        int r = scan.nextInt();
        int c = scan.nextInt();
        // Creating a r*c 2D integer matrix
        int mat[][] = new int[r][c];
        // Taking inputs for elements of the matrix
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                mat[i][j] = scan.nextInt();
            }
        }
        
        // Declaring & initialising the 4 Variables first_row, last_row, first_column, last_column

        int first_row = 0, last_row = r - 1, first_column = 0, last_column = c - 1;
        
        // All the 4 for loops should run till first_row <= last_row and first_column <= last_column
        
        while(first_row <= last_row && first_column <= last_column)
        {
        //  Printing first_row
            for(int i = first_column; i <= last_column; i++)
            {
                System.out.print(mat[first_row][i] + " "); // row remains the same & columns change
            }
            first_row++; // incrementing first row to 2nd row
 
        //  Printing last_column
            for(int i = first_row; i <= last_row; i++)
            {
                System.out.print(mat[i][last_column] + " "); // column remains the same & rows change
            }
            last_column--; // decrementing last column to 2nd last column
 
        //  Printing last_row
            if(first_row <= last_row) // to check if the first_row is still less than the last_row
            {
                // decrementing i to reach first column from the last column
                for(int i = last_column; i >= first_column; i--) 
                {
                    System.out.print(mat[last_row][i] + " "); // row remains the same & columns change
                }
                last_row--; // decrementing last row to 2nd last row
            }
 
        //  Printing first_column
            if(first_column <= last_column) // to check if the first_column is still less than the last_column
            {
                for(int i = last_row; i >= first_row; i--)
                {
                    System.out.print(mat[i][first_column] + " "); // column remains the same & rows change
                }
                first_column++; // incrementing first column to 2nd column
            }
        } // ending of while loop
        System.out.println();
	}
}
