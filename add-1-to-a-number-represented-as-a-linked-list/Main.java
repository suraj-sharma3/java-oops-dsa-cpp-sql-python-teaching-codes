/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}

class LinkedList{
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	}
}

    public static Node addOne(Node head) 
    { 
        Node head1=reverse(head);
        Node temp=head1;
        int carry=0;
        boolean flag=true;
        Node prev=null;
        while(temp!=null)
        {
            int sum=temp.data+carry;
            if(flag){
                sum+=1;
                flag=false;
            }
            
            if(sum>9){
                temp.data=0;
                carry=1;
            }
            else{
                temp.data=sum;
                carry=0;
            }
            prev=temp;
            temp=temp.next;
        }
        if(carry!=0)
        {
            Node a=new Node(carry);
            a.next=null;
            prev.next=a;
        }
        return reverse(head1);
    }
    static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        return prev;
    }
}