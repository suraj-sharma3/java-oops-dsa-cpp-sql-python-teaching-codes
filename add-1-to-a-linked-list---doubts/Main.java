/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;

// Creating Node Class
class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
    this.next=null;
  }
}

// Creating Linked List Class
class LinkedList{
  Node head;
        
// Creating 'add' method 
  void add(int val){ // the value passed to the add function is inserted in a node & 
                    // that node is made the head of the LL
    Node newNode=new Node(val);
    newNode.next=head;
    head=newNode;
  }

// Creating print function to print the LL
  void print(){
    Node curr=head;
    while(curr!=null){
      System.out.print(curr.val+" ");
      curr=curr.next;
    }
  }
}

// Main class
public class Main{

// Creating a function inside the main class to reverse the LL 
    public static Node reverse(Node head){
      Node curr=head; // making the head node the current node
    // making the previous & the next node of the current node as null initially
      Node prev=null; 
      Node next=null;

    // we'll traverse till curr node (head node) becomes null i.e, the end of the LL
      while(curr!=null){
        next=curr.next; // inserting the next node of the curr node (initially head node) inside the next node
        curr.next=prev; // Doubt
        prev=curr;
        curr=next;

      }
      return prev; // how previous is linked to the other nodes - doubt
    }


  public static void combine(Node head, LinkedList list){  // doubt
        int carry = 1; // for that 1 we want to add
        while(head != null || carry == 1){
                int ans = head.val + carry;
                 carry=ans/10;
                 ans=ans%10;
                list.add(ans);
                head = head.next;
        }
    }
    public static void main(String args[]) {

      Scanner sc=new Scanner(System.in);
      LinkedList list=new LinkedList();
      int x=sc.nextInt();
      int temp=0; // doubt

      // 456
      while(x!=0){
        temp=x%10;
        list.add(temp);
        x=x/10;
        
      }
      list.head=reverse(list.head);
      LinkedList ans=new LinkedList();
      combine(list.head,ans); // doubt
      ans.print(); 
    }
}

