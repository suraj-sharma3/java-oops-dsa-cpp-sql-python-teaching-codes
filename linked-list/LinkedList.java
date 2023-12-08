class Node<T>{ // T is the generic that we are using, using generics we can use the Node class for any datatype like String, float, int, etc
    T data; // T here means that data could be of any datatype
    Node<T> next;
    
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
// using generics 'T' is considered a good practice 
// using the above Node class of generic type 'T', we can create Nodes of any datatype

public class LinkedList{
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(27);
        Node<Integer> n2 = new Node<>(36);
        Node<Integer> n3 = new Node<>(19);
        Node<Integer> n4 = new Node<>(12);
        Node<Integer> n5 = new Node<>(47);
        Node<Integer> head; // this would just create a reference & not an actual Node
        head = n1; // head is just a reference that is pointing to the Node n1
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = head;
        
        System.out.println("address of n1 " + n1 + "data in n1 " + n1.data + "address of node next to n1 " + n2);
        System.out.println("address of n2 " + n2 + "data in n2 " + n2.data + "address of node next to n2 " + n3);
        System.out.println("address of n3 " + n3 + "data in n3 " + n3.data + "address of node next to n3 " + n4);
        System.out.println("address of n4 " + n4 + "data in n4 " + n4.data + "address of node next to n4 " + n4);
        System.out.println("address of n5 " + n5 + "data in n5 " + n5.data + "address of node next to n5 " + head);
        
        return head;
    }
    public static void main(String [] args){
        Node<Integer> myNode = createLinkedList();
    }
}
