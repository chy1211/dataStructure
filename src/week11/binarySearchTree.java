/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author henry
 */
public class binarySearchTree {
    /**
     * @param args the command line arguments
     */
    class Node{
        int key;
        Node left, right;
        public Node(int item){
            key = item;
            left = right = null;
        }
    }
    Node root;
    binarySearchTree(){
        root = null;
    }
    void deleteKey(int key){
        root = deleteRec(root, key);
    }
    Node deleteRec(Node root, int key){
        if(root == null) return root;
        if(key < root.key)
            root.left = deleteRec(root.left, key);
        else if(key > root.key)
            root.right = deleteRec(root.right, key);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root){
        int minv = root.key;
        while(root.left != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    void insert(int key){
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key)
            root.left = insertRec(root.left, key);
        else if(key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    boolean search(int key){
        root = searchRec(root, key);
        if(root != null)
            return true;
        else
            return false;
    }
    Node searchRec(Node root, int key){
        if(root == null || root.key == key)
            return root;
        if(root.key > key)
            return searchRec(root.left, key);
        return searchRec(root.right, key);
    }
    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();
        /* BST tree example
              50 
           /     \ 
           9      98 
         /  \    /   
        6   11  52   */
        tree.insert(50);
        tree.insert(9);
        tree.insert(6);
        tree.insert(11);
        tree.insert(98);
        tree.insert(52);
        System.out.println("使用輸入的值建立的二元搜尋樹(左->根->右):");
        tree.inorder();

        System.out.println("刪除 11 後的二元搜尋樹(葉節點):");
        tree.deleteKey(11);
        tree.inorder();

        System.out.println("刪除 98 後的二元搜尋樹(有子節點的節點):");
        tree.deleteKey(98);
        tree.inorder();

        System.out.println("刪除 50 後的二元搜尋樹(有兩個子節點的節點):");
        tree.deleteKey(50);
        tree.inorder();

        System.out.println("搜尋 52 是否存在於二元搜尋樹中:");
        if(tree.search(52) == true)
            System.out.println("存在");
        else
            System.out.println("不存在");
    }
    
}
