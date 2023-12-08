/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Dutch Flag Algorithm : 3 Pointer Approach

/* Question : LeetCode - Sort Colors
Example 1: 0 : Red, 1 : Green, 2 : Blue

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2] : RGB

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2] : RGB
*/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	// Easy Approach :
	
	public static void sortColors(int[] nums) {
        int n = nums.length;
        int zeros = 0, ones = 0, twos = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zeros++;
            }
            else if(nums[i] == 1){
                ones++;
            }
            else{ // if nums[i] == 2
                twos++;
            }
        }
        
        int index = 0;
        for(int i = 0; i < zeros; i++){
            nums[index] = 0;
            index++;
        }
        for(int i = 0; i < ones; i++){
            nums[index] = 1;
            index++;
        }
        for(int i = 0; i < twos; i++){
            nums[index] = 2;
            index++;
        }
        
    }
    
    public static void sortColors(int nums[]){
        int n = nums.length;
        int start = 0;
        int mid = 0;
        int end  = n - 1;
        while(mid <= end){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                mid++;
                start++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{ // if nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}
