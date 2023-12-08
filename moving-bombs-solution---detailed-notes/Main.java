/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Moving Bombs Question (Module 2 Test) | Asteroid Collision Question (LeetCode) - Consider Bombs as Asteroids in the code
// Solution from PepCoding (Youtube)

// Moving Bombs Question Solution (Module 2 Test) - With Comments

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // number of bombs
		int arr[] = new int[n]; // array containing bombs
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		int result[] = bombCollision(arr); // array in which the remaining bombs thatdidn't explode are stored
		for(int bomb : result){           // using for each loop to print the elements (bombs that didn't explode) of the result array
		    System.out.print(bomb + " ");
		}
		
	}
	
	public static int[] bombCollision(int[] bombs){ // passing the integer array bombs to our function 
	                                                // the return type of our function is int[] as the function will  
	                                                // return an integer array consisting of remaining bombs after collision
	    Stack<Integer> st = new Stack<>(); // to store the bombs & then remove them according to different cases
	    
	    for(int value : bombs){ // for every bomb / element in the bombs array (using for each loop to access elements of the bombs array)
	        if(value > 0){ // if the bomb that we picked from the array is moving in the right direction (value of bomb is positive)
	            st.push(value); // we'll push the bomb into the stack as even if the stack has a bomb at it's top 
	                            // which is moving in the left direction or right direction, they will never collide with this bomb
	        }
	        
	        else{ // if the bomb that we picked from the array is moving in the left direction (value of bomb is negative)
	            while(st.size() > 0 && st.peek() > 0 && st.peek() < -value){ // -value gives the absolute value of value(bomb)
	                st.pop();
	           // while the stack is not empty & the bomb at the top of the stack is moving in right direction (bomb value is positive)
	           // & the absolute value of the bomb at the top of the stack is less than the absolute value of the bomb that we
	           // have picked from the array (the one moving in the left direction - value), then keep popping bombs from the stack
	           // until any of the while loop conditions become false
	            }
	            
	            if(st.size() > 0 && st.peek() == -value){
	                // if the stack is not empty & the absolute value of the bomb at the top of the stack is equal to the absolute value 
	                // of the bomb that we have picked from the array bombs (the one which is moving in the left direction)
	                st.pop(); // pop the bomb at the top of the stack & don't store the bomb that we picked from the array
	            }
	            else if(st.size() > 0 && st.peek() > -value){
	                // if the stack is not empty & the absolute value of the bomb at the top of the stack is greater than 
	                // the absolute value of the bomb that we picked from the array (the one which is moving in the left direction)
	                // we'll not push the bomb that we picked from the array into the stack as it'll explode (will be eliminated)
	                // after collision with the bomb with the greater absolute value
	            }
	            else{
	                // the stack is empty or the bomb that is at the top of the stack is also moving in the left direction
	                // in this case the bomb that we picked from the array will never collide with the bomb at the top of the stack
	                // as no bomb is exploded, we'll insert the value (the bomb that we picked from the array into the stack)
	                st.push(value);
	            }
	        }
	        // all the cases are handled till here
	    }
	    
	    // outside the for each loop, we only have the remaining bombs in the stack that didn't explode 
	    // we'll store all these bombs that didn't explode & are still present in the stack in an array & will return this array
	    
	    int ans[] = new int[st.size()]; // an array to store the bombs that didn't explode 
	    // when we access the bombs from the top of the stack, we'll get them in reverse order as they were previously present 
	    // in the bombs array, so we'll store these bombs from the stack into the array from the end of the array & not the Start 
	    // to obtain the bombs in their original order
	    
	    for(int i = ans.length - 1; i >= 0; i--){
	        ans[i] = st.pop(); // removing the bombs from the stack & storing them into our ans array from the end of the ans array
	    }
	    return ans; // returning the ans array which only contains the bombs that didn't explode
	}
}

// leetCode solution without comments (just bombs is replaced by asteroids)
/* 
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>(); 
	    for(int value : asteroids){ 
	        if(value > 0){ 
	            st.push(value); 
	        }
	        
	        else{ 
	            while(st.size() > 0 && st.peek() > 0 && st.peek() < -value){ 
	                st.pop();
	            }
	            
	            if(st.size() > 0 && st.peek() == -value){       
	                st.pop(); 
	            }
	            else if(st.size() > 0 && st.peek() > -value){
	            }
	            else{
	                st.push(value);
	            }
	        }
	    }
	    int ans[] = new int[st.size()];
	    for(int i = ans.length - 1; i >= 0; i--){
	        ans[i] = st.pop(); 
	    }
	    return ans; 
    }
}
*/
