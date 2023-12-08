/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// to print the difference between the sum of principal diagonal elements & sum of off-principal diagonal elements

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int mat[][] = new int[n][n];
		int prin_diag = 0;
		int offprin_diag = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        mat[i][j] = scan.nextInt(); // matrix inputs
		        
		        if(i == j){      // for principal diagonal elements
		            prin_diag += mat[i][j]; 
		        }
		        
		      /* we would have to use 2 different if conditions & not if & else if because both principal & off 
		      principal diagonal elements have the centre element of the matrix in them, if we use else if as 
		      the 2nd condition,the centre element of the matrix will not be grabbed & added in our offprin_diag 
		      variable  */
		        
		        if(i + j == n - 1){    // for off - principal diagonal elements
		            offprin_diag += mat[i][j];
		        }
		    }
		}
		
// 	we can also use Math.abs(diff) to get the absolute value of the difference
		
		int diff = prin_diag - offprin_diag;
		if(diff < 0){
		    diff = diff * (-1);
		}
		System.out.println(diff);
	}
}

