package com.dataStructures.List;

class CLLNode{
    int data;
    CLLNode next;
    CLLNode(int data){
        this.data = data;
    }
}
public class CircularSinglyLinkedList {
    CLLNode head = null;
    CLLNode tail = null;
    int length = 0;

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList(list.head);
    }

    public void printList(CLLNode head) {
        for (int i=0;i<length;i++){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public void insert(int data) {
        CLLNode newNode = new CLLNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
        length++;
    }
}
