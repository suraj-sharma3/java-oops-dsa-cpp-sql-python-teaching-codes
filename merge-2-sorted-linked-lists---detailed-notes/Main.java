/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Merging 2 Sorted Linked Lists

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList list1 = new LinkedList(); // creating the first LL
		LinkedList list2 = new LinkedList(); // creating the second LL
		int n = scan.nextInt(); // size of the 1st LL
		for(int i = 0; i < n; i++){ // taking inputs for the first LL
		    list1.insertAtEnd(scan.nextInt());
		}
		
		int m = scan.nextInt(); // size of the 2nd LL
		for(int j = 0; j < m; j++){ // taking inputs for the second LL
		    list2.insertAtEnd(scan.nextInt());
		}
		
		// getting the head node of the resultant sorted LL formed after merging the 2 sorted LL
		// using the mergeLists function with the LinkedList class because mergeLists function is static
		// a static function can be used directly with the class, we don't have to create an object of that class
		Node headResultantLL = LinkedList.mergeLists(list1.head, list2.head);
		// using the printList function with the LinkedList class because printList function is static
		// a static function can be used directly with the class, we don't have to create an object of that class
		// passing the head node of the resultant list to the printList function
		LinkedList.printList(headResultantLL);
	}
}

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}

class LinkedList{
    Node head;
    
/* A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it. */

// function to insert at the end of the linked list
    void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    /* when we want to use a function with the class name directly, instead of calling that function using an 
    object of that class, we make that function static */
    /* we don't have to create an object of a class to call a static method or function, we can call this
    static function using the class name */
     
    // function to print a linked list
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    
    // function to merge 2 sorted linked lists
    // the return type of the mergeLists method / function should be Node as it'll return the head node of the resultant LL
    static Node mergeLists(Node head1, Node head2){ // we'll give the head nodes of both the linked lists to this function as parameters
        if(head1 == null){ // if head1 is null (first LL is empty)
            return head2; // return the head node of second LL
        }
        if(head2 == null){ // if head2 is null (second LL is empty)
            return head1; // return the head node of the first LL
        }
        
        Node ansHead = null; // declaring the head node for the resultant LL (the LL formed after merging the 2 sorted LL)
        if(head1.value < head2.value){ // if the head1 node is smaller than the head2 node,
            ansHead = head1;            // we'll make head1 the head node of the resultant linked list
            head1 = head1.next;         // & we'll move the head1 further after storing it in ansHead
        }
        
        else{ // if the head2 node is smaller than the head1 node,
            ansHead = head2;            // we'll make head2 the head node of the resultant linked list
            head2 = head2.next;          // & we'll move the head2 further after storing it in ansHead
        }
        
        Node temp = ansHead; // storing ansHead in temp
        
        while(head1 != null && head2 != null){ // while head nodes of both the LL don't become empty
            if(head1.value < head2.value){ // if the value of head1 node is smaller than head2 node
                temp.next = head1; // insert the head1 node into the resultant linked list formed by merging the 2 LL
                head1 = head1.next; // move head1 by 1 node
                temp = temp.next; // move temp node of the resultant linked list by 1 node also
            }
            else{ // if the value of head2 node is smaller than head1 node
                temp.next = head2; // insert the head2 node into the resultant linked list formed by merging the 2 LL
                head2 = head2.next; // move head2 by 1 node
                temp = temp.next; // move temp node of the resultant linked list by 1 node also
            }
        }
        
        // we come out of the while loop
        
        if(head1 != null){ // if the 1st linked list with the node head1 is not finished outside the while loop
            temp.next = head1; // insert the remaining part of the 1st LL in the resultant LL 
        }
        if(head2 != null){ // if the 2nd linked list with the node head2 is not finished outside the while loop
            temp.next = head2; // insert the remaining part of the 2nd LL in the resultant LL
        }
        return ansHead; // return the head node of the resultant LL (ansHead) 
        // the mergeLists function will return the head node of the LL formed after merging the 2 sorted LL
    }
}


