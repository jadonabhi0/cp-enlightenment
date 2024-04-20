/**
 * Implementation of a Binary Search Tree (BST).
 * This class provides methods to add nodes to the BST,
 * perform inorder traversal of the tree, and define the structure
 * of each node in the BST.
 */
package BinarySearchTree;

public class MyBst {

    /**
     * Utility class to define the structure of a node in the BST.
     */
    static class Node{
        Node left; // Reference to the left child node
        Node right; // Reference to the right child node
        int data; // Data stored in the node

        /**
         * Constructor to create a new node with the given data.
         * @param data The data to be stored in the node
         */
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        /**
         * Default constructor for Node class.
         */
        public Node() {
        }
    }

    // Global variable as root of the tree
    private Node root;

    /**
     * Constructor for MyBst class.
     * Initializes the root of the tree as null.
     */
    public MyBst() {
        this.root = null;
    }

    /**
     * Method to add a node with the given data to the BST.
     * @param data The data to be added to the BST
     */
    public void addNode(int data){

        // If the tree is empty, initialize root as the first node
        if (this.root == null){
            this.root = new Node(data);
            return;
        }

        // this will add node further
        insert(this.root, data);
    }

    /**
     * Recursive method to insert a node with the given data into the BST.
     * @param root The root of the subtree to insert the node into
     * @param data The data to be inserted into the BST
     * @return The root of the modified subtree
     */
    public Node insert(Node root, int data){
        // If the root is null, create a new node with the given data
        if (root == null){
            return new Node(data);
        }
        // If the data is less than the root data, insert into the left subtree
        else if(data < root.data){
            root.left = insert(root.left, data);
        }
        // If the data is greater than or equal to the root data, insert into the right subtree
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    /**
     * Helper method for inorder traversal of the BST.
     * @param node The current node being traversed
     */
    private void inorderTraversalInternal(Node node){
        // If the current node is null, return
        if (node == null) return;
        // Traverse the left subtree
        inorderTraversalInternal(node.left);
        // Print the data of the current node
        System.out.print(node.data + " ");
        // Traverse the right subtree
        inorderTraversalInternal(node.right);
    }

    /**
     * Method to perform inorder traversal of the BST.
     */
    public void inorderTraversal(){
        // Start inorder traversal from the root of the tree
        inorderTraversalInternal(root);
        // Print a new line after traversal
        System.out.println();
    }


}
