/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*		Brute Force Approach : 

		long ans[] = new long[n];
//		ans[n - 1] = -1; // for last element in the array, next greater on right will always be -1
		for(int i = 0; i < n; i++){ // for the elements which do not have NGE on right, their NGE on right would be -1
			ans[i] = -1;
		}
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[j] > arr[i]){
					ans[i] = arr[j];
					break;
				}
			}
		}
		
		return ans;
*/

    // Optimized Approaches : 
    
	// Approach 1 : 
/*		1) we'll use a stack to store all the possible NGE on right for an element of the array
		2) our outer for loop will be from last index of array to the first index of the array i.e, we'll traverse the array from end to start
		3) for every element of the array, we'll check in the stack if it's NGE on right is present
*/
		long nger[] = new long[n]; // array to store the NGE on right for every element of the given array
		Stack<Long> st = new Stack<>(); // stack to store all the possible NGE on right for an element of the array
		for(int i = n - 1; i >= 0; i--){ // we'll traverse the array from end to start
			if(st.size() == 0){ // stack containing possible NGE on right for an element of the array is empty
				nger[i] = -1; // that means there is no NGE on right for the current element of array
			}
			else{ // stack containing possible NGE on right for an element of the array is not empty
				while(st.size() > 0 && st.peek() <= arr[i]){ // we'll keep removing elements from the stack until we find an element in the stack that is greater than the current element of the array
					st.pop();
				}
				if(st.size() == 0){ // after removing elements from the stack using the above while loop, if stack becomes empty
					nger[i] = -1; // that means there is no NGE on right for the current element of array
				}
				else{ // if stack doesn't becomes empty after removing elements from the stack using the above while loop 
					nger[i] = st.peek(); // that means that the element at the top of the stack now is greater than the current element of the array
					// this element of the stack is the NGE on right of the current element of the array
				}
			}
			st.push(arr[i]); // push the current element of the array into the stack as it could be the NGE on right for some other element of the array
		}
		return nger;


// Approach 2 : Optimised TC - O(n) & SC - O(n) - More Useful approach
/* 1) if current array element is greater than the array element which is at the index that is at the top of the stack, then current array element is the NGE on right of the array element present at the index which is at the top of the stack
2) whether the current array element is greater than or less than the array element which is at the index that is at the top of the stack, push the index of the current array element into the stack
3) for all the remaining indexes present in the stack for which we couldn't find the NGE on right, their NGE on right would be -1
*/
		long nger[] = new long[n];
		Stack<Integer> st = new Stack<>(); // to store the indexes of array elements
		for(int i = 0; i < n; i++){
			while(st.size() > 0 && arr[st.peek()] < arr[i]){ // until arr[st.peek()] < current arr element
				int index = st.pop(); // grab the index at the top of the stack
				nger[index] = arr[i]; // current array element is the NGE on right for the array element at the grabbed index
			}
			st.push(i); // push the index of the current array element into the stack
		}

		while(st.size() > 0){ // for all the elements for which we couldn't find the NGE on right, their NGE on right would be -1
			int index = st.pop();
			nger[index] = -1;
		}
		return nger;
