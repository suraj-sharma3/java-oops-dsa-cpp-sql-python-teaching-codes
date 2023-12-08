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
}




