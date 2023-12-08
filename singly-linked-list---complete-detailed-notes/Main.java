/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

// Creating a Node For a Singly Linked List (SLL)

class Node{ // a node will have 2 things : a value & the reference to the next node
    
    int value; // value inside the node, every integer datatype value is zero initially if we havn't initialized it with a diff value
    Node next; // reference of the next Node ('next' stores the address of the next node) 
    // doubt - if next is an object of class Node, then it must store the value too
    
    // constructor for Node class, the constructor name is same as the class name
    
    Node(int value){ // everytime we create a node, we'll give it a value   
        this.value = value; // this.value - points to the 'value' variable above in the Node class
                            // value - points to the 'value' variable inside the Node constructor
                            /* the value that we pass along with the Node constructor while creating an object, gets assigned
                                to the value with this.value which is actually the value of the node object that we create */
    // doubt - variables that are inside the scope of a constructor are class variables or constructor variables
    }
}

// Creation of a SLL or we can just say Linked List

class LinkedList{ // follow PascalCasing for class names & camelCasing for variables & functions names
    // first we need to make a head node (the first node of the linked list)
    Node head; // doubt - what exactly happens here or anywhere we declare a variable using our Node class name
    
    // whenever we'll create a LinkedList object, a head node will be created first in it
    
    // creating a function to insert a node at the end of the existing linked list 
    /* this function is only inserting a node in the existing linked list, it is not returning anything, 
    therefore return type is void */
    
    void insertNodeAtEnd(int value){ // we need to provide a value that we want to insert at the end of the SLL
        // a node will be created & inserted in the SLL whenever insertNodeAtEnd function is called
        // creating a node
        Node newNode = new Node(value);
    // class name | reference variable name | new keyword | constructor Node of class Node which accepts a value
    /* before inserting a node, we need to check if the SLL is empty or not, because if it's empty then the new Node that
        we insert in that SLL will become the head node of that SLL */
    /* to find out, we can check if the head node of the SLL is having Null as it's value or not */
    // doubt - we need to check the value of head or the next of head
        if(this.head == null){ // this is used to refer the head that we have created inside the LinkedList class
            // if head node is null, then we need to insert the new node that we created in the head node itself
            // the new node that we insert becomes the head node for the SLL
            this.head = newNode;
            // once the new node gets inserted as the head, we come out of the function
            // doubt - why are we coming out of this function here
            return;
        }
        
        /* if head node is not null, that means there are other nodes in the SLL, we would have to traverse the 
        complete SLL & reach the last node & then we can insert the new node that we created at the end of the SLL
        in a SLL, we only have the address / reference of the head node but using the reference of the head node, 
        we can traverse the complete SLL, so while traversing we can't afford to lose the head node's reference
        as the head node has the reference of the 2nd node, the 2nd node has the reference of the 3rd node & so on */
        
        /* we will store the head node reference in a temporary 'temp' Node object, 
        so that while traversing we don't lose the reference of the head node */
        
        Node temp = this.head;
        // doubt - use of 'this' keyword & what is 'temp' exactly in the above line - a variable or an object
        
        /* now we can traverse the SLL until the 'next' of the temp becomes null because temp is basically head 
        & if it's 'next' becomes null, that means we have reached the last node of the SLL */
        
        /* to reach the last node of the SLL, we will keep storing the next of temp in temp which will make it move forward
        because we are basically making temp become the next node */
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        /* the moment we come outside the above while loop, that means the next of temp is null & 
        the temp has become the last node of the SLL */
        
        /* as we wanted to store the new node that we created at the end of the SLL, & here we know that temp has become the last 
        node of the SLL, what we'll do is make the 'next' of temp store the reference of the new node that we created,
        this will make our new node become the last node (Tail Node) & the 'temp' node the second last node
        & now we've successfully inserted our new node at the end of the SLL */
        
        temp.next = newNode; // making the next of our 'temp' node store the reference of the new node that we created
        
        // end of insertNodeAtEnd function
    }    
        
        // Making a printLinkedList function to print our SLL
        
    void printLinkedList(){
        /* as we never mess with the head node of a SLL, because it is the most imp node for us to be able to traverse
        the SLL, we'll store the head node's referencein temp which is a temporary node */
            
        Node temp = this.head; // stored reference of head in temp
        /* we'll keep moving & printing the the value of every node till our temp which is holding the head node becomes null,            as once temp becomes null that means we've reached the end of our SLL */
            
        while(temp != null){ // until 'temp' becomes null
            System.out.print(temp.value + "->"); // print value of the node that temp is holding
            temp = temp.next; // once the value of the node that temp is holding, move temp forward by 1 node
        }
        System.out.print("NULL"); // printing "NULL" after printing all the node values of the linked list that we create
    }
}


public class Main
{
	public static void main(String[] args) {
		/* only what we write in the main function gets printed or executed in the output, 
		what we create in other various classes that we create is used but doesn't get printed in our output */
		
		// creating a SLL (a new LinkedList object) using Linkedlist class
		LinkedList myFirstSLL = new LinkedList();
		// Class | reference | keyword | default constructor
		/* java creates a default constructor for every class that we create by itself & gives the default constructor 
		the class name only */
		
		// inserting values (creating nodes) in the LinkedList object that we created 'myFirstSLL'
		// to insert values or create nodes at the end of the linked list myFirstSLL, we can use use our insertNodeAtEnd function
		
		myFirstSLL.insertNodeAtEnd(13); // we use the dot '.' operator to use the properties (attributes) & methods (functions)
		myFirstSLL.insertNodeAtEnd(03); // of a class for an object that we create for that class
		myFirstSLL.insertNodeAtEnd(1995);
		myFirstSLL.insertNodeAtEnd(16);
		myFirstSLL.insertNodeAtEnd(10);
		myFirstSLL.insertNodeAtEnd(2009);
		myFirstSLL.insertNodeAtEnd(10);
		myFirstSLL.insertNodeAtEnd(04);
		myFirstSLL.insertNodeAtEnd(2010);
		myFirstSLL.insertNodeAtEnd(25);
		myFirstSLL.insertNodeAtEnd(06);
		myFirstSLL.insertNodeAtEnd(2019);
		myFirstSLL.insertNodeAtEnd(14);
		myFirstSLL.insertNodeAtEnd(10);
		myFirstSLL.insertNodeAtEnd(2022);
		
		/* printing the linked list object that we created & inserted the above values in, using the printLinkedList function 
		that we created */
		
		myFirstSLL.printLinkedList();
	}
}
