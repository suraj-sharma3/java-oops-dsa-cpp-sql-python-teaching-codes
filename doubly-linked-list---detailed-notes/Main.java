/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Doubly Linked List : Every Node is linked to it's next node as well as it's previous node

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList myDLL = new DoublyLinkedList();
		myDLL.insertAtEnd(24);
		myDLL.insertAtEnd(82);
		myDLL.insertAtEnd(56);
		myDLL.printDLL();
		
		int sizeDLL = scan.nextInt();
		for(int i = 0; i < sizeDLL; i++){
		    myDLL.insertAtEnd(scan.nextInt());
		}
		
		myDLL.printDLL();
// 		System.out.println(tail.prev);
// 		System.out.println(tail.value);
// 		System.out.println(head.next);
// 		System.out.println(tail.next);
	}
}

class Node{
    int value;
    Node prev; // stores the reference of the previous node
    Node next; // stores the reference of the next node
    
    Node(int value){
        this.value = value;
    }
}

class DoublyLinkedList{
    Node head; 
    Node tail; // creating the head & the tail node
    
    // function to insert a new node at the end of the DoublyLinkedList
    void insertAtEnd(int value){
        Node newNode = new Node(value); // creating a new node to insert at the end
        if(head == null){ // if the head node is null
            head = newNode; // inserting the newNode in the head as well as the tail
            tail = newNode;
            return;
        }
        
        // if the head node is not null, i.e, the DoublyLinkedList is not empty
        tail.next = newNode; // storing the reference OF newNode in the next of tail
        newNode.prev = tail; // storing the reference of tail in the prev of newNode
        tail = newNode; // making newNode the new tail node of the DoublyLinkedList
    }
    
    // function to insert a new node at the head of the DoublyLinkedList
    
    void insertAtHead(int value){
        Node newNode = new Node(value); // creating a new node that we want to insert at the head of the DoublyLinkedList
        
        // if the DoublyLinkedList is empty i.e, the head node is null
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        
        // if the head node is not null, i.e, the DoublyLinkedList is not empty
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    
    // function to print the DoublyLinkedList
    
    void printDLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
