/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
/* Sample Input :

2 - number of test cases that should run in one compilation 
1st Test Case : 
4 3 : 4 - the total number of students  
and 3 : minimum number of students that should arrive on or before time so that 
the class is not cancelled (threshold)
-1 -3 4 2 : arrival timings of total number of students i.e, 4
2nd Test Case : (Similar type of inputs as the 1st test case)
4 2
0 -1 2 1

Sample Output :

(for 1st Test Case) YES
(for 2nd Test Case) NO */

      Scanner scan = new Scanner(System.in);
      // taking input for number of test cases that should run in 1 compilation
       int num_testcases = scan.nextInt(); 

       for(int i = 0; i < num_testcases; i++){

       // Main Logic (Everything inside the first 'for' loop)
         
        // takin input for total number of students
          int n = scan.nextInt();
  
      // taking input for minimum number of students that should arrive on or before time
          int k = scan.nextInt();
          int count = 0; // to count the min number of students (threshold)
          int arr[] = new int[n]; // array for total number of students
          for(int j = 0; j < n; j++){
            arr[j] = scan.nextInt();
          }

          for(int j = 0; j < n; j++){
            if(arr[j] <= 0){
              count++;
            }
          }
         // if count >= k (threshold), then the class would not be cancelled
          if(count >= k){
            System.out.println("NO");
          }
         // if count < k (threshold), then the class would be cancelled
         else{
           System.out.println("YES");
         }
         
       }
      
	}
}
