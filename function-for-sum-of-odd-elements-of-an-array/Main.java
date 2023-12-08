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
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		System.out.println(sumOdd(arr));
	}
	
// 	Creating a function sumOdd to calculate the sum of odd elements in an Array
    
    public static int sumOdd(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                sum += arr[i];
            }
        }
        return sum;
    }
}
