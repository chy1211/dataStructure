/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

/**
 *
 * @author henry
 */
public class redBlackTree {

    /**
     * @param args the command line arguments
     */
    class Node {
        int key;
        Node left, right;
        int color;
        Node(int d) {
            key = d;
            left = right = null;
            color = 1;
        }
    }
    Node root;
    void insert(int key) {
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        if (isRed(root.right) && !isRed(root.left)) {
            root = rotateLeft(root);
        }
        if (isRed(root.left) && isRed(root.left.left)) {
            root = rotateRight(root);
        }
        if (isRed(root.left) && isRed(root.right)) {
            flipColors(root);
        }
        return root;
    }
    boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return (node.color == 1);
    }
    Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = 1;
        return x;
    }
    Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = 1;
        return x;
    }
    void flipColors(Node h) {
        h.color = 1;
        h.left.color = 0;
        h.right.color = 0;
    }
    void inorder() {
        inorderRec(root);
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    public static void main(String[] args) {
        redBlackTree tree = new redBlackTree();
        tree.insert(50);
        tree.insert(9);
        tree.insert(6);
        tree.insert(11);
        tree.insert(98);
        tree.insert(52);
        tree.inorder();
    }
}
