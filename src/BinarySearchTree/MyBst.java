/**
 * Implementation of a Binary Search Tree (BST).
 * This class provides methods to add nodes to the BST,
 * perform inorder traversal of the tree, and define the structure
 * of each node in the BST.
 */
package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public void inorderRecursive(){
        // Start inorder traversal from the root of the tree
        inorderTraversalInternal(root);
        // Print a new line after traversal
        System.out.println();
    }


    public void inorderIterative(){

        Stack<Node> st = new Stack<>();
        Node current = this.root;

        while(current != null || !st.isEmpty()){

            while(current != null){
                st.push(current);
                current = current.left;
            }

            current = st.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }

        System.out.println();

    }


    public void preOrderRecursive(){
        preOrderHelper(this.root);
        System.out.println();
    }

    private void preOrderHelper(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderHelper(root.left);
        preOrderHelper(root.right);
    }


    public void preOrderIterative(){

        Stack<Node> st = new Stack<>();
        Node curr = this.root;

        while (curr != null || !st.isEmpty()){

            while (curr != null){
                System.out.print(curr.data + " ");
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            curr = curr.right;
        }
        System.out.println();
    }

    public void postOrderRecursive(){
        postOrderHelper(this.root);
        System.out.println();
    }

    private void postOrderHelper(Node root) {
        if (root == null) return;
        postOrderHelper(root.left);
        postOrderHelper(root.right);
        System.out.print(root.data + " ");
    }


    public void postOrderIterative(){

        String ans = "";
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current != null) {
                // Add node value to the beginning of the list
                ans = current.data + " " + ans;
                // Push left child first so that right child is processed first
                if (current.left != null)
                    stack.push(current.left);
                if (current.right != null)
                    stack.push(current.right);
            }
        }
        System.out.println(ans);
    }


    public Node deleteNode(int data){
        return deleteHelper(this.root, data);
    }

    private Node deleteHelper(Node node, int data){

        if (node == null) return null;

        if (node.data == data){
            if (node.left == null && node.right == null) return null;
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }else{
               int min = getMinimumInRightSubtree(node.right);
               node.data = min;
               node.right = deleteHelper(node.right, min);
               return node;
            }

        }else if(node.data > data){
            node.left = deleteHelper(node.left, data);
        }else{
            node.right = deleteHelper(node.right, data);
        }
        return node;
    }

    private int getMinimumInRightSubtree(Node node) {
        if (node.left != null){
            return getMinimumInRightSubtree(node.left);
        }else {
            return node.data;
        }
    }


}
