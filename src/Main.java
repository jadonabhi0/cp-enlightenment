import BinarySearchTree.MyBst;
import org.w3c.dom.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyBst bst = new MyBst();
        bst.addNode(1);
        bst.addNode(2);
        bst.addNode(3);
        bst.addNode(5);
        bst.addNode(7);
        bst.addNode(9);
        bst.addNode(1);

        bst.inorderTraversal();

     }
}