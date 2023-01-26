/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author henry
 */
class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
class dl_list {
    Node head;
    Node tail;
    public dl_list(){
        this.head = null;
        this.tail = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (tail != null) {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
public class doublyLinkedList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dl_list dl_list = new dl_list();
        dl_list.add(1);
        dl_list.add(2);
        dl_list.add(3);
        dl_list.add(4);
        dl_list.add(5);
        dl_list.printList();
    }
}
