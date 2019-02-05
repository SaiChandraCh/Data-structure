package com.dataStructures.list;

class CLLNode {
    int data;
    CLLNode next;
    CLLNode(int data){
        this.data = data;
        next = null;
    }
}
public class CircularLinkedList {
    CLLNode head = null;
    CLLNode tail = null;
    int length = 0;
    public static void main(String[] args) throws Exception {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertAtBegin(40);
        circularLinkedList.insertAtBegin(-15);
        circularLinkedList.insertAtBegin(80);
        circularLinkedList.insertAtBegin(5);
        circularLinkedList.insertAtBegin(90);
        circularLinkedList.insertAtEnd(50);
        circularLinkedList.insertAtEnd(20);
        circularLinkedList.insertAtEnd(30);
        circularLinkedList.insert(100000000,6);
        circularLinkedList.print();
        circularLinkedList.deleteBegin();
        circularLinkedList.deleteEnd();
        circularLinkedList.delete(3);
        System.out.println("-------------");
        circularLinkedList.print();
    }

    private void deleteBegin() throws Exception {
        if(head == null){
            throw new Exception("list is Empty");
        }else {
            tail.next = head.next;
            head = head.next;
        }
    }

    private void deleteEnd() throws Exception {
        if(head == null){
            throw new Exception("list is Empty");
        }else {
            CLLNode temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    private void delete(int index) throws Exception {
        if(index<=0){
            deleteBegin();
        }else if(index >= length){
            deleteEnd();
        }
        if(head == null){
            throw new Exception("list is Empty");
        }else {
            CLLNode temp1 = head;
            CLLNode temp2 = head;
            for (int i = 0; i < index; i++) {
                temp2 = temp1;
                temp1 = temp1.next;
            }
            temp2.next = temp1.next;
        }
    }

    private void print() {
        CLLNode temp = head;
        while (temp.next != head){
            System.out.println(temp.data);
            temp =temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertAtEnd(int data) {
        CLLNode newNode = new CLLNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            newNode = null;
        }
        length++;
    }

    public void insert(int data, int index) {
        if(index<=0){
            insertAtBegin(data);
        }else if(index >= length){
            insertAtEnd(data);
        }else{
            CLLNode temp1 = head;
            CLLNode temp2 = temp1;
            CLLNode newNode = new CLLNode(data);
            for (int i = 0; i < index; i++) {
                temp1 = temp2;
                temp2 = temp2.next;
            }
            newNode.next = temp2;
            temp1.next = newNode;
            newNode = null;
        }
        length++;
    }

    public void insertAtBegin(int data) {
        CLLNode newNode = new CLLNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
            newNode = null;
        }
        length++;
    }
}
