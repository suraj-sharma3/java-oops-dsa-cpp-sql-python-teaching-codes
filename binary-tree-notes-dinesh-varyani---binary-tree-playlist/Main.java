/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    TreeNode root; // declare the root node of the binary tree
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        
        root = first; // first becomes the root node
        first.left = second; // second <--- first
        first.right = third; // second <--- first ---> third
        second.left = fourth; // fourth <--- second
        second.right = fifth; // fourth <--- second ---> fifth
    }
    // Recursive preOrder traversal
    public void preOrder(TreeNode root){ // preOrder traversal, recursive function
        // preOrder means 1) print root 2) move to root's left 3) move to root's right
        // base case
        if(root == null){ // if root is null that means that root is the leaf node or the binary tree is empty
            return;
        }
        System.out.print(root.data + " "); // print the root node data
        preOrder(root.left);
        preOrder(root.right);
    }
    
    
    // for Iterative preOrder traversal, we would have to use an additional data structure
    // In Recursive methods / functions, a stack is used internally that's why we don't have to use an additional data structure
    // as a stack is used internally in recursive preOrder traversal so we'll use a stack in the iterative way too
    // we use a stack for holding the additional information for us, so that when we backtrack to a particular node, we can fetch that node from that stack easily
    // as stack is a LIFO data structure, the node inserted last in the stack will be the first node to be removed
    
    public void iterativePreOrder(TreeNode root){
        if(root == null){ // if the root is null, i.e, we are at the leaf node or the binary tree is empty
            return;
        }
        Stack<TreeNode> st = new Stack<>(); // creating a stack for holding TreeNodes
        st.push(root); // push the root node of the binary tree into the stack first
        while(!st.isEmpty()){ // until stack becomes empty
            TreeNode temp = st.pop(); // pop the node at the top of the stack & store it in temp
// as we inserted the root node in the stack, this popped node will be the root in first iteration
// & in preOrder, we have to process the root first, then the left subtree & then the right subtree
            System.out.print(temp.data + " "); // printing the current root node
// pushing right & left of the current root node into the stack
/* as in stack what is pushed last will be popped first, & in preorder after root we need to process 
left of the root node first, therefore we'll push left of the current node last & the right of the
current node first */
// first push right node of the current root node into the stack
            if(temp.right != null){
                st.push(temp.right);
            }
// after the right node is pushed into the stack, push the left node of the current root node into the stack
// as left node is pushed last, it'll be popped first & we also have to process left node before the right node in preOrder traversal
            if(temp.left != null){
                st.push(temp.left);
            }
        }
        
    }
    
    // Recursive inOrder traversal : Inorder traversal - 1) left of root 2) root 3) right of root
    
    public void inOrder(TreeNode root){
        // base case
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    // Iterative InOrder traversal : Inorder traversal - 1) left of root 2) root 3) right of root
    public void iterativeInOrder(TreeNode root){
        if(root == null){ // if root is null then there are no nodes in the binary tree
            return;
        }
        TreeNode temp = root;
        Stack<TreeNode> st = new Stack<>();
        while(!st.isEmpty() || temp != null){ // if temp becomes null & the stack is empty then there are no nodes left to be traversed
            if(temp != null){ // if temp i.e, current node is not null, then push that node into the stack
                st.push(temp); // push that current node into the stack
                temp = temp.left; // traverse to the left of the current node as we have to process the left first, then root & then right
            }
            else{ // if temp i.e, current node is null but stack is not empty then we'll print the data of the node which is at the top of the stack
                temp = st.pop(); // store the node at the top of the stack in temp
                System.out.print(temp.data + " "); // print the data of the node stored in temp
                temp = temp.right; // store the right of the node stored in temp inside temp
            }
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(); // created an object of BinaryTree class
		bt.createBinaryTree(); // creating a binary tree using createBinaryTree method
		bt.preOrder(bt.root); // printing preOrder of the created binary tree using recursive preOrder method
		// pass the root of binary tree object to the preOrder method (root is a property (data member) of the binary tree class)
		System.out.println();
		bt.iterativePreOrder(bt.root); // printing preOrder of the created binary tree using iterative preOrder method
		System.out.println();
		bt.inOrder(bt.root); // printing inOrder of the created binary tree using recursive inOrder method
		System.out.println();
		bt.iterativeInOrder(bt.root); // printing inOrder of the created binary tree using iterative inOrder method
	}
}



