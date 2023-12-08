/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// diff of colsum & rowsum for array with function
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int mat[][] = new int[n][n];
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        mat[i][j] = input.nextInt();
		    }
		}
		diffColRow(mat); // passing matrix to diffColRow function
	}
	
	public static void diffColRow(int mat[][]){  // return type "void" as this function just prints & not returns 
	    int n = mat.length;
	    for(int i = 0; i < n; i++){
	        int rowsum = 0;
	        int colsum = 0;
	        for(int j = 0; j < n; j++){
	   // for sum of row elements, keeping row as i & column as j as row remains the same & columns change
	            rowsum += mat[i][j];
	        }
	   // for sum of column elements, keeping column as i & row as j as column remains the same & rows change
	        for(int j = 0; j < n; j++){    
	            colsum += mat[j][i];
	        }
	    System.out.println(colsum - rowsum);
	    }
    }
}