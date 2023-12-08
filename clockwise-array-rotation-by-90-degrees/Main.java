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
		
		for(int i = 0; i < row / 2; i++){
		    for(int j = i; j < row - i - 1; j++){
		        int temp = arr[i][j];
		        arr[i][j] = arr[row - 1 - j][i];
		        arr[row - 1 - j][i] = arr[row - 1 - i][col - 1 - j];
		        arr[row - 1 - i][col - 1 - j] = arr[j][row - 1 - i];
		        arr[j][row - 1 - i] = temp;
		    }
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < row; i++){
		    for(int j = 0; j < col; j++){
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
