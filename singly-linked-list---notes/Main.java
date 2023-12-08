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
		Scanner scan = new Scanner(System.in);
		
		// creating a SinglyLinkedList object
		SinglyLinkedList myList = new SinglyLinkedList();
		
		// inserting at the end of the SLL object
		myList.insertAtEnd(12);
		myList.insertAtEnd(43);
		myList.insertAtEnd(100);
		myList.insertAtEnd(33);
		
		// printing the SLl
		myList.printSLL();
		
		// inserting at the start / head of the SLL object
		myList.insertAtHead(96);
		myList.insertAtHead(56);
		myList.printSLL();
		
		// taking the SLL from the user
        
        // taking the size for the linked list frm the user, (linked list is dynamic, so this size can be changed)
        System.out.println("Enter the size for your singly linked list");
        int size = scan.nextInt();
        
        SinglyLinkedList userList = new SinglyLinkedList();
        
        // taking the values for nodes for the SLL from the user
        System.out.println("enter " + size + " values to insert in your Singly Linked List");
        for(int i = 0; i < size; i++){
            int nodeValue = scan.nextInt(); // acccepting one value at a time (in each iteration)
            userList.insertAtEnd(nodeValue); // inserting the value in one node at a time (in each iteration)
        }        
        
        // take the position for which a node has to be deleted from the SLL from the user 
        System.out.println("Enter the position from where you want to delete a node from the SLL");
        int position = scan.nextInt();
        userList.deleteFromPosition(position);
        
        System.out.println("Your SinglyLinkedList after deleting the node you wnated to delete");
        userList.printSLL();
        
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        
        System.out.println("Enter size of list 1");
        int list1Size = scan.nextInt();
        System.out.println("Enter size of list 2");
        int list2Size = scan.nextInt();
        
        System.out.println("Enter " + list1Size + " values for list1");
        for(int i = 0; i < list1Size; i++){
            int a = scan.nextInt();
            list1.insertAtEnd(a);
            
            // or list1.insertAtEnd(sc.nextInt());

        }
        
        System.out.println("Enter " + list2Size + " values for list2");
        for(int j = 0; j < list2Size; j++){
            int b = scan.nextInt();
            list2.insertAtEnd(b);
            
            // or list1.insertAtEnd(sc.nextInt());
        }
        // comparing both the liked lists : list1 & list2 using the compareTwoSLL function
        list1.compareTwoSLL(list1.head, list2.head);
        
        list1.head = reverseSLL(list1.head);
        list1.printSLL();
	}
}

// Creating a Singly linked list (SLL)
class Node{
    int value;
    Node next;
    
    Node(int value){
        this.value = value;
    }
}

class SinglyLinkedList{
    Node head;
    
    void insertAtEnd(int value){ // to insert a node at the end of a SLL
        // creating a new node for the value that we want to insert at the end of the SLL
        Node newNode = new Node(value);
        
        // if our head node is null, then we can insert our newNode inside the head i.e, make the new node as head node & return
        
        if(this.head == null){
            this.head = newNode;
            return;
        }
        
        // if head node is not null, then
        
        Node temp = this.head; // storing the head node inside a temp node (temporary node)
        
        while(temp.next != null){ // to make sure that we keep pushing our temp further until it becomes the last node
            temp = temp.next;
        }
        
        // temp becomes the last node of the SLL outside the while loop
        // we insert our newNode after the temp node i.e, at the end of the SLL 
        temp.next = newNode;
    }
    
    void printSLL(){ // To print the SLL
        Node temp = this.head; // storing head node inside a temporary variable, to traverse the SLL
        while(temp != null){ // we will traverse until temp reaches the next of the last node which is null
            System.out.print(temp.value + " "); // we'll print the value of each node
            temp = temp.next; // we'll move temp to the next node
        }
        System.out.println();
    }
    
    void insertAtHead(int value){
        
        // creating a new node for the value that we want to insert at the end of the SLL
        Node newNode = new Node(value);
        
        // if our head node is null, then we can insert our newNode inside the head i.e, make the new node as head node & return
        if(this.head == null){
            this.head = newNode;
            return;
        }
        // if head node is not null then,
        newNode.next = head; // taking the reference of existing head in the next of our newNode
        this.head = newNode; // making our newNode the new Head node for our SLL, so newNode got inserted at end of the SLL
    }
    
    void deleteFromPosition(int position){ // to delete a node from the given position
        
        // if entered position is 0, we will delete the head node
        if(position == 0){
            head = head.next;
            return;
        }
        
        // if position is anything else (other than 0)
        
        Node prev = head;
        for(int i = 0; i < position - 1; i++){ // traversing till we reach the node that comes just before the node that we want to delete
            prev = prev.next; // traversing in the SLL by moving prev forward
        }
        // outside the above for loop, prev is the node that comes just before the node that we want to delete
        // the node that we want to delete is prev.next (i.e, the node that comes after our prev node)
        // we'll link the node that comes next to the node that we want to delete to our prev node
        // the link between prev node & it's next node (the node thatw we want to delete) breaks in the below given step
        prev.next = (prev.next).next; 
        // the node that we want to delete is no longer a part of the SLl
    }
    
    // Function to compare 2 SLL : 
    
    void compareTwoSLL(Node head1, Node head2){ // giving the head nodes of both the linked lists to our compareTwoSLL function
        while(head1 != null && head2 != null){ // until the head node becomes the last node, keep moving in both the SLL
            if(head1.value == head2.value){ // if values of the nth nodes of both the SLL is the same
                head1 = head1.next; // keep moving head of both the SLL further
                head2 = head2.next;
            }
            else{ // if the values of the nth nodes of both the SLL are not the same
                System.out.println("Both the given linked lists are not same, Both the linked lists are different");
                return; // after printing, get out of the compareTwoSLL function
            }
        }
        if(head1 != null || head2 != null){ // if either of the two Sll is not finished
                                            // this would mean that one SLL is smaller than the other SLL
            System.out.println("Both the given linked lists are not same, Both the linked lists are different");
        }
        else{ // if both the SLL have been finished in the above while loop, then both of them are same
            System.out.println("Both the given linked lists are same");
        }
        
        // Function to reverse the linked list 
        Node reverseSLL(Node head){ // return type of this function is a node 
                                // as it'll make the tail node of the SLl the head node of the SLL & return it
            // we'll make 3 nodes : prev, current & next
            Node prev = null;
            Node current = head; // current will point to the head of the SLL initially
            Node next = null;
            while (current != null) { // until current node becomes null, i.e, SLL is finished
                next = current.next; // next will store the node next to the current node
                current.next = prev; // the next of current node will be linked to the prev node (reversing the links)
                prev = current; // prev moves forward & stores the current node in it
                current = next; // current moves forward & stores the node that was stored in 'next' node previously
            }
            head = prev; // prev node reaches the tail node outside the above while loop  
                        // & this tail node becomes the new head node
            return head; // the tail node is returned as the head node of the SLL by reverseSLL function
        }
    }
}




