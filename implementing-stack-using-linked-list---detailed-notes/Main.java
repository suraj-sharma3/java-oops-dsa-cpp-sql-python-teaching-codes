/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(5);
		stack.pop();
		
	}
}

// implementation of stack using linked list

class Node{
    int value;
    Node next;
    
    Node(int value){
        this.value = value;
    }
}

class MyStack{
    Node head; /* we'll consider the head of the linked list as the top element of the stack while implementing a stack using 
                linked list */
    int size; // size of the stack 
    // constructor for MyStack
    public MyStack(){
        head = null; // head will be null initially
        size = 0; // size of the stack will be zero initially
    }
    
    void push(int data){ /* this function will push / add an element into the stack, the data that we are passing here will 
                            be pushed into the stack */
        Node temp = new Node(data); /* a new node is created to store the data that we have passed with the push function */
        temp.next = head; /* our new node having the passed data which is stored in temp will be linked to the head node
                            temp is inserted before the existing head node, the next of temp is linked to the existing head node */
        size++; // once our temp is stored in the stack, we'll increment the size of the stack 
        head = temp; // temp becomes the new head node 
        /* the temp which becomes the head node is actually at the top of the stack, 
        whenever we pop / remove an element from this stack, the head node gets removed from the stack 
        top element of our stack = head node of the linked list */
    }
    
    int peek(){ /* this function will return the element which is at the top of the stack without removing it from the stack */
        // checking stack underflow because the stack should have atleast 1 element in it for us to return an element from the stack
        if(head == null){ // if stack is empty | if head is null in the linked list that means the stack is empty
            throw new Exception("Stack is empty");
        }
        // we'll come out of the 'if' condition if the stack is not empty
        // head node is at the top of the stack, so peek function will return the data of the head node which is the top of the stack
        return head.value;
    }
    
    int pop(){ /* this function will return the element which is at the top of the stack & removing it from the stack */
        // checking stack underflow because the stack should have atleast 1 element in it for us to remove an element from the stack & return it
        if(head == null){ // if stack is empty | if head is null in the linked list that means the stack is empty
            throw new Exception("Stack is empty");
        }
        int poppedElement = head.value; // storing the data of head node which is the top of the stack so that we can return it
        head = head.next; // the node that comes next to the head becomes the new head node i.e, new top of the stack
                         // the previous head of the linked list / top of the stack is removed 
        size--; // we decrement the size of the stack, as we have removed an element from it
        return poppedElement; // returning the popped / removed element
    }
    
    boolean isEmpty(){ // this function will return true if the stack is empty & false if the stack is not empty
        return head == null; /* if head == null, that means that the linked list or the stack is empty, so return true
                                if head != null, that means that the linked list or the stack is not empty, so return false */
        
    }
    
    int size(){ // this function will return the number of elements that are present in the stack
        return size; // this will return the size of the stack at any particular time 
        
    }
}