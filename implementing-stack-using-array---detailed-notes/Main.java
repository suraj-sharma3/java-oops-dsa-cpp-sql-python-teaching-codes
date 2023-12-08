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
		MyStack stack = new MyStack(6);
		stack.push(43);
 		stack.peek();
 		stack.isEmpty();
	}
}

// Implementing Stack using Array, creating a Stack class

class MyStack{
    int arr[]; // implementing stack using array, this array 'arr' will behave as a stack | declaring the array
    int top; // top of the stack i.e, last inserted element of the array
    int capacity; // capacity of the stack i.e, size of the array
    
    // constructor for MyStack
    public MyStack(int capacity){ // constructor will accept the size or capacity of the stack
        this.capacity = capacity; // the value that we pass for capacity to the constructor becomes the capacity of the MyStack object
        top = -1; /* initially the stack is empty i.e, there is no element in the array, that's why index of last inserted element 
                    which is 'top' is -1 */
        arr = new int[capacity]; // initialising the array & giving it a size or capacity
        // when we implement a stack using array, that stack is not dynamic as the size of an array is fixed
        // to make a dynamic stack, we'll implement the stack with a linked list
    }
    
    // creating the 'push' method for our MyStack class, push method is used to insert an element into a stack
    
    void push(int data){ // the push function will just insert the element into the stack, it'll not return anything, hence 'void'
        /* checking Stack Overflow condition i.e, we are checking if the stack is full or not, coz if the stack is full
        we wouldn't be able to insert a new element into the stack */
        if(top == capacity - 1){
            /* if top (index of the last inserted element) becomes the last index of the array (stack), 
            i.e top == capacity - 1 (last index of an array is at index 'array size - 1'), our array (here stack) is full, 
            this condition is called as Stack Overflow condition (stack is full condition) */
            System.out.println("Stack Overflow"); // throwing error if stack is full
        }
        
        // if the stack is not full, we'll come out of the above 'if' condition & store our element
        top++; // moving top forward to the next index where we'll store our element
        arr[top] = data; // the data that we pass to our push function is inserted at the index where top is pointing in the array
        
        // pushed an element into the stack successfully
    }
    
    int pop(){ /* pop just removes the element which is at the top of the stack, that's why we don't have to pass anything to our                   
                pop function. the pop function removes the element which is at the top of the stack & also returns it, that's why 
                return type of 'pop' function is 'int' here */
        /* checking Stack Underflow condition (stack is empty condition) i.e, we need to check if there is an element in the 
        stack or not (stack is empty or not) before we proceed with removing (popping) an element from the top of the stack
        coz we cannot remove an element from an empty stack */
        /* if the index of the last inserted element of the array or stack which is 'top' is '-1', that means the stack is empty 
        (stack underflow) */
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        /* if the stack is not empty, i.e top != -1, we'll come out of the above 'if' condition & remove the element which is at 
        the top of the stack */
        
        int poppedElement = arr[top]; /* we'll first store the element which is at the top of the stack because we have to return it 
                                        after popping (removing) it */
        top--;  /* we're moving our top an index below (or before) the index of the element which is at the top
                    we're changing the top element of the stack by moving top one index below */
        return poppedElement; /* we are returning the element that we popped / removed i.e the previous top of the stack
                                as after top--, our top is changed now, it came an index below the previous top */
    }
    
    int peek(){ /* the peek function just returns the element which is at the top of the stack, it doesn't removes or pops 
                the element which is at the top of the stack */
                // as it returns the element the return type of peek is 'int'
                /* as peek just returns the top element everytime, we don't have to provide any index to the peek function
                when we call it */
        /* checking Stack Underflow i.e, if the stack is empty or not, coz if the stack is empty, we wouldn't be able to
        access any element from an empty stack, for an empty stack (array) the 'top' would be at -1 */
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        int poppedElement = arr[top];
        return poppedElement;
    }
    
    boolean isEmpty(){ /* the 'isEmpty' function will check if the stack is empty or not
                        this function will return a boolean value : true if stack is empty & false if stack is not empty
                        we can check if top == -1, because if top is at -1, that means there are no elements in the stack
                        top == -1 -> true, this means that the stack is empty
                        top == -1 -> false, this means that the stack is not empty */
        return top == -1;
    }
    
    int size(){
        return top + 1;
    }
    
}


