/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// 2 Pointer Approach : Notes
/* 
// Question : 
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of your array : ");
		int n = scan.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter " + n + " elements of your array");
		for(int i = 0; i < n; i++){
		    nums[i] = scan.nextInt();
		}
		System.out.println("Enter the target number : ");
		int target = scan.nextInt();
		int ans[] = twoSum(nums, target);
		for(int i = 0; i < ans.length; i++){
		    System.out.print(ans[i] + " ");
		}
	}
    public static int[] twoSum(int nums[], int target) { // we will be using 2 pointers here : start & end
        int n = nums.length;
        int start = 0; // start pointer starts from index '0' i.e, start of the sorted array
        int end = n - 1; // end pointer starts from index 'n - 1' i.e, last index of the sorted array
        int ans[] = new int[2]; // an array to store the answer
        while(start < end){ // we'll do everything in the while loop until start == end
                            // we want both the elements that are in the ans array to be from different indices in nums 
            if(nums[start] + nums[end] == target){ // if the sum of the 2 elements that are at start & end is equal to target
                ans[0] = start + 1; // we'll store 'start + 1' in answer array as for this problem, we have to follow 1 based indexing
                ans[1] = end + 1; // we'll store 'end + 1' in answer array as for this problem, we have to follow 1 based indexing
                return ans; // we'll return answer
            }
            else if(nums[start] + nums[end] < target){
                // if the sum of elements at start & end is less than target
                start++; // then, we'll move start to the next element, this would increase our sum
                        // as the array given is sorted, the next element would be greater than the previous element
            }
            else{ // if nums[start] + nums[end] > target
            // if the sum of elements at start & end is greater than the target
                end--; // then, we'll move end to the previous element, this would decrease our sum
                        // as the array given is sorted, the previous element would be smaller than the next element
            }
        }
        // we come outside the while loop, that means there is no pair, sum of which is equal to the given target
        // so we'll return [-1, -1] as the indices of both the elements (pair) that we had to find
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}

