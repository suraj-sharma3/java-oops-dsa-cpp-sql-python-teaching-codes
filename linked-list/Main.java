/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Node<Integer> myNode = createLinkedlist();
	}
}

/*
public class Node{ // LinkedList Node
    int data; // data in the node
    Node next; // reference to the next node 
    
    Node(int data){ // The access modifier of the default constructor provided by the compiler is public if the class itself is public, otherwise default.
        this.data = data;
        this.next = null; // the reference to an object is by default null (here next is referring to the next node object)
    // we can write next = null or even don't write it because the by default the reference to an object is null only
    }
}
*/
/*
class Node<T>{ // T is the generic that we are using, using generics we can use the Node class for any datatype like String, float, int, etc
    T data; // T here means that data could be of any datatype
    Node<T> next;
    
    Node(T data){
        this.data = data;
        this.next = null;
    }
}

// using the above Node class of generic type 'T', we can create Nodes of any datatype

class LinkedList{
    public static Node<Integer> createLinkedlist(){
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
}
*/

/*

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes

Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

Constructors can also take parameters, which is used to initialize attributes. You can have as many parameters as you want

Constructors can have all kind of access modifiers. The usage of different access modifier on constructors are different.

You make a constructor public if you want the class to be instantiated from any where.

You make a constructor protected if you want the class to be inherited and its inherited classes be instantiated.

You make a constructor private if you want the class to be instantiated just from its own members usually a static block or static method. It means that you take control of instantiating the class and apply some rule on instantiation.

*/

