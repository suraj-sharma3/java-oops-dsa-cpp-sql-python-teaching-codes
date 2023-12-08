/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Tree / Binary Tree

public class Main
{
	public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree myTree = new BinaryTree(); // creating an object of the BinaryTree class
		                                        // i.e, creating our Binary Tree
		TreeNode rootNode = myTree.buildTree(nodes); // storing the rootNode of our BinaryTree 'myTree'
	    System.out.println(rootNode.data);
	    System.out.println(rootNode.left.data);
	    myTree.preOrder(rootNode);
	    System.out.println();
	    int rootData = rootNode.getData();
	    System.out.println(rootData);
	    rootNode.setData(5);
	    int rootData1 = rootNode.getData();
	    System.out.println(rootData1);
	    
	    TreeNode leftNode = rootNode.getLeft();
	    int leftNodeData = leftNode.getData();
	    System.out.println(leftNodeData);
	}
}

class TreeNode{ // node class for node of tree
    int data; // In a binary tree, each node has some data in it, a left child node & a right child node
    TreeNode left;
    TreeNode right;
    
    TreeNode(int data){ // constructor for TreeNode class
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
    public TreeNode getLeft(){
        return left;
    }
    public void setLeft(TreeNode left){
        this.left = left;
    }
    public TreeNode getRight(){
        return right;
    }
    public void setRight(TreeNode right){
        this.right = right;
    }
}

class BinaryTree{ // creating a Binary Tree class
    static int index = -1; // index to traverse the nodes of the binary tree
    public static TreeNode buildTree(int nodes[]){ // a function that will accept an array of nodes
                                                    // & will insert them in a Binary Tree
                                                // this function will return the rootNode of the BinaryTree
        index++; // whenever we'll call the function, we'll increment the index by 1
        if(nodes[index] == -1){ // if the node (element) at index in the nodes array is -1  
            return null; // as '-1' means null node
        }
        
        TreeNode newNode = new TreeNode(nodes[index]); // storing an element of the nodes array 
                                                        // at index in a new node of a BinaryTree
        newNode.left = buildTree(nodes); // calling buildTree function (Recursion) to create a 
                                        // left child node for our newNode
        newNode.right = buildTree(nodes); // calling buildTree function (Recursion) to create a 
                                        // right child node for our newNode
        return newNode; // we'll return the newNode
        // all the nodes of the BinaryTree will be created recursively
    }
    
    // Pre Order Traversal : 1) Print root node data 2) left subtree 3) right subtree
    
    public static void preOrder(TreeNode rootNode){
        if(rootNode == null){
            return;
            // instead of returning the control, we can also print '-1' whenever node is null by
            // System.out.print("-1");
        }
        
        // 1) print root data
        System.out.print(rootNode.data + " ");
        // 2) Print left subtree recursively
        preOrder(rootNode.left);
        // 3) print right subtree recursively
        preOrder(rootNode.right);
    }
}

    
