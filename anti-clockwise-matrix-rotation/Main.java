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
	    
	    // creating & taking inputs for the matrix : 
	    
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int arr[][] = new int[row][col];
		for(int i = 0; i < row; i++){
		    for(int j = 0; j < col; j++){
		        arr[i][j] = scan.nextInt();
		    }
		}
		
		// transposing the matrix : 
		
		for(int i = 0; i < row; i++){
		    for(int j = i + 1; j < col; j++){
		        int temp = arr[i][j];
		        arr[i][j] = arr[j][i];
		        arr[j][i] = temp;
		    }
		}
		
		// swapping the upper rows with the bottom rows i.e, (for a 4*4 matrix - swapping row 1 with row 4 or swapping row 2 with row 3)
		
		for(int i = 0; i < row / 2; i++){   // as we are starting from 0, we have to got till less than n/2 
	        for(int j = 0; j < col; j++){
	            int temp = arr[i][j];
	            arr[i][j] = arr[row - 1 - i][j];
	            arr[row - 1 - i][j] = temp;
	        }
		}
		System.out.println();
		System.out.println();
		
        // Printing the swapped matrix
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
