/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
// another way of inserting elements in a 2d matrix
        int matrix[][] = new int[][] {
            new int[] { 1, 2, 3 },  // 1st Row (having 3 elements i.e, 3 columns)
            new int[] { 1, 2, 3, 4},  // 2nd Row (having 4 elements i.e, 4 columns)
        };
    
        System.out.println(matrix.length); // Gives the number of rows that are present in the 2d matrix
        System.out.println(matrix[0].length); // Gives the number of columns or elements present in the 1st / 0th row
        System.out.println(matrix[1].length); // Gives the number of columns or elements present in the 2nd / 1st row
    
	    
	    int matrix1[][] = new int[10][4]; // [rows]*[columns]
        int rows = matrix1.length; // Gives the number of rows that are present in the 2d matrix
        int columns = matrix1[0].length; // Gives the number of columns or elements present in the 1st / 0th row
                                        // Here, every row has the same number of columns or elements
        System.out.println(rows);
        System.out.println(columns);
	}
}
