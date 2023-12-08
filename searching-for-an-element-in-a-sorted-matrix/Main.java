/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// searching a number in a row column sorted matrix
// Linear Search & Binary Search (2 Optimized Approaches)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers of rows & columns for your matrix");
		int row = scan.nextInt();
		int col = scan.nextInt();
		int matrix[][] = new int[row][col];
		System.out.println("Enter " + row*col + " elements in your matrix");
		for(int i = 0; i < row; i++){
		    for(int j = 0; j < col; j++){
		        matrix[i][j] = scan.nextInt();
		    }
		}
		System.out.println("Enter the number you want to search for in your matrix");
		int target = scan.nextInt();
		String ans = searchMatrix(matrix, row, col, target);
		System.out.println(ans);
		
		System.out.println("Target Number present in the matrix (searchOptimized Function answer): ");
		boolean ansBool = searchOptimized(matrix, row, col, target);
		System.out.println(ansBool);
		
		System.out.println("Target Number present in the matrix (linearSearch Function answer): ");
		boolean ansLinear = linearSearch(matrix, row, col, target);
		System.out.println(ansLinear);
	}
	
	// Linear Search - Time Complexity : O(row * col) approach
	public static boolean linearSearch(int matrix[][], int row, int col, int target){
	    for(int i = 0; i < row; i++){
	        for(int j = 0; j < col; j++){
	            if(matrix[i][j] == target){
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	// Time Complexity - O(row * log(col)) approach
	public static String searchMatrix(int matrix[][], int row, int col, int target){
	    String str = "";
	    for(int i = 0; i < row; i++){
	        if(binarySearch(matrix, i, target) == true){
	            str = str + "Target element is present in row number " + (i + 1);
	            return str;
	        }
	    }
	    str = str + "Your Target element is not present in your matrix";
	    return str;
	}
	
	public static boolean binarySearch(int matrix[][],int i, int target){ // i is the row number for the matrix
	    int row = matrix.length;
	    int col = matrix[0].length;
	    int l = 0;
	    int r = col - 1; // we'll searching for our target in every row of the matrix
	                       // we'll traverse from 1st column to the last column of each row of the matrix
	    int mid;
	    
	    while(l <= r){
	        mid = (l + r) / 2;
	        if(target > matrix[i][mid]){
	            l = mid + 1;
	        }
	        if(target < matrix[i][mid]){
	            r = mid - 1;
	        }
	        if(target == matrix[i][mid]){
	            return true;
	        }
	    }
	    return false;
	}
	
	// Time Complexity - O(row + col) approach
	public static boolean searchOptimized(int matrix[][], int row, int col, int target){
	    int i = 0, j = col - 1; 
	    while(i < row && j >= 0){
	        if(matrix[i][j] > target){
	            j--;
	        }
	        else if(matrix[i][j] < target){
	            i++;
	        }
	        else{ // matrix[i][j] == target
	            return true;
	        }
	    }
	    return false;
	}
}

