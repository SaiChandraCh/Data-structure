package com.dataStructures.list.exercise;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class NthNodefromEnd {
    Node head = null;
    int length = 0;

    public static void main(String[] args) {
        NthNodefromEnd nthNodefromEnd = new NthNodefromEnd();
        nthNodefromEnd.insert(10);
        nthNodefromEnd.insert(20);
        nthNodefromEnd.insert(80);
        nthNodefromEnd.insert(50);
        nthNodefromEnd.insertAtEnd(90);
        nthNodefromEnd.insertAtEnd(100);
        nthNodefromEnd.print();
        nthNodefromEnd.findNthNodeFromEnd(5);
    }

    private void print() {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private void findNthNodeFromEnd(int index) {
        if(index <= 0){
            index = 0;
        }else if(index >= length){
            index = length;
        }
        Node temp = head;
        for (int i = 0; i < length - index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

}
