/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Circular Linked List Notes :
// In a Circular Linked List, the next of the tail node points back to the head node

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CircularLinkedList myCircularList = new CircularLinkedList();
		myCircularList.insertAtEnd(34);
		myCircularList.insertAtEnd(56);
		myCircularList.insertAtEnd(93);
		myCircularList.printCLL();
		System.out.println();
		
// 		CircularLinkedList myCLL = new CircularLinkedList(); // creating a CLL object
		
// 		System.out.println("Enter the size of your circular linked list"); 
// 		int sizeCLL = scan.nextInt(); // taking size for the CLL object
		
// 		System.out.println("Enter " + sizeCLL + " elements in your circular linked list");
// 		for(int i = 0; i < sizeCLL; i++){       // taking inputs for the nodes in the CLL object from the user
// 		    myCLL.insertAtEnd(scan.nextInt());
// 		}
// 		myCLL.printCLL(); // printing the CircularLinkedList object
		
		// check whether your liked list has a cycle or not
// 		myCLL.hasCycle()

        // printing the tail of the CLl
        System.out.println(myCircularList.tail.value);
        // printing the head of the CLL
        System.out.println(myCircularList.tail.next.value);
        // printing the address of the head node which is stored in tail.next
        System.out.println(myCircularList.tail.next);
	}
}

// Creating a Node class for a Circular Linked List (CLL) :

class Node{
    int value;
    Node next;
    
    Node(int value){
        this.value = value;
    }
}

// Creating a CLL class :

class CircularLinkedList{
    // create a tail node first in a CLL
    
    Node tail;
    
    // Creating a function to insert a node at the end of a CLL
    
    void insertAtEnd(int value){
        // create a node first to take the value that you want to insert at the end of a CLL
        Node newNode = new Node(value);
        
        // If the tail node is null, we can insert our new node in the tail node directly
        if(tail == null){
            tail = newNode;
            tail.next = newNode;
            return;
        }
        
        // if tail node is not null in the CLL then,
        /* as tail node has the reference to the head node, we'll store the tail.next reference in our newNode as
        we want to insert our newNode at the end of the CLL & make it the new tail node of the CLL */
        newNode.next = tail.next; // reference of head is stored inside the next of our newNode
        tail.next = newNode; // reference of newNode is inserted in the next of the previous tail node
        // newNode becomes the new tail node of the CLL
        tail = newNode; // newNode is the tail now
        
    }
    
    // creating a function to print a circular linked list
    
    void printCLL(){
        Node head = tail.next; // tail.next is the head node in a CLL, creating a head node & storing tail.next in it
        Node temp = head; // storing the head node in a temporary node 
        
        do{
            System.out.print(temp.value + " "); // printing the value of temp node
            temp = temp.next; // moving temp forward in the CLL
        }while(temp != head); // we'll stop printing when temp node becomes equal to head node again 
    }
    
    // hare tortoise algorithm to check if there's a cycle in the linked list or not
    
    boolean hasCycle(Node head){
        Node tortoise = head, hare = head; // make 2 nodes tortoise & hare & assign head to both of them
        while(hare != null && hare.next != null){ // until hare & the node next to hare becomes null
            tortoise = tortoise.next; // keep moving tortoise by 1 node
            hare = hare.next.next; // keep moving hare by 2 nodes
            
            if(tortoise == hare){ // if hare becomes equal to tortoise i.e, both these pointers are pointing 
                                // to the same node, that means that there is a cycle in the linked list
                return true;
            }
        }
        return false; // if we come out of the while loop traversing the whole linked list & both our 
                    // pointers (tortoise & hare) never pointed to the same node of the linked list
                    // that means that there is no cycle in the linked list
    }
}

