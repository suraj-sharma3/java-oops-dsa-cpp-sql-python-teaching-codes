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
        int l = scan.nextInt();
        Arrays.sort(arr);
        int num_ways = 0; 
        for(int i = 0; i< n; i++){
            int j = n - 1;
            while(j > i){
                if(arr[j] - arr[i] <= l){
                    num_ways += j - i - 1;
                }
                j--;
            }
        }
        System.out.println(num_ways);
	}
}
