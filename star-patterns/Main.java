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
	    Scanner scan = new Scanner(System.in);
	    int m = scan.nextInt();
	   // int n = scan.nextInt();
// 		for(int i = 1; i <= m; i++){
// 		    for(int j = 1; j <= n; j++){
// 		        System.out.print('*');
// 		    }
// 		    System.out.println();
// 		}
        
        // for(int i = m; i>=0; i--){
        //     // int space = m;
        //     for(int j = n; j>=0; j--){
                
        //         // System.out.print(' '*m);
        //         // m--;
        //         System.out.print('*');
        //     }
        
        //     System.out.println();
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        
            
        
	}
}
