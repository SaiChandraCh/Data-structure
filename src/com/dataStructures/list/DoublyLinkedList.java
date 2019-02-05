package com.dataStructures.list;

class DLLNode{
    int data;
    DLLNode next = null;
    DLLNode prev = null;

    public DLLNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {

    DLLNode head = null;
    DLLNode tail = null;
    int length = 0;


    public void remove(int data) {
        if(head == null){
            return;
        }else{
            DLLNode temp = head;
            while (temp != null){
                if(temp.data == data){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    temp = null;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeHead() {
        if(head == null){
            return;
        }else{
            head = head.next;
            head.next.prev = null;
            length--;
            return;
        }
    }

    public void removeTail() {
        if(head == null){
            return;
        }else{
            tail = tail.prev;
            tail.next = null;
            length--;
        }
    }

    private void insert(int data, int index) {
        DLLNode newNode = new DLLNode(data);
        if(index < 0){
            insertAtBegining(data);
            return;
        }else if(index >= length){
            insertEnding(data);
            return;
        }
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            DLLNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev.next = newNode;
            temp.prev = newNode;
        }
        length++;
    }

    public void insertEnding(int data) {
        DLLNode newNode = new DLLNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    void insertAtBegining(int data){
        DLLNode newnode = new DLLNode(data);
        if(this.head == null){
            this.head = newnode;
            this.tail = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            newnode.prev = null;
            head = newnode;
        }
        length++;
    }

    void printDLL(DLLNode head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertAtBegining(10);
        obj.insertAtBegining(20);
        obj.insertAtBegining(30);
        obj.insertAtBegining(40);
        obj.insertAtBegining(50);
        obj.insertEnding(60);
        obj.insertEnding(70);
        obj.insertEnding(80);
        obj.insert(90,3);
        obj.removeHead();
        obj.removeTail();
        obj.remove(60);
        obj.printDLL(obj.head);
    }
}
