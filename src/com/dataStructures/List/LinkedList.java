package com.dataStructures.List;

class ListNode {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int data){
        this.data = data;
    }
    private int data;
    private ListNode next = null;
}

public class LinkedList {
    private ListNode head = null;
    private int length = 0;


    public int getLength() {
        return length;
    }

    public LinkedList() {
        this.length = 0;
    }

    public synchronized ListNode getHead() {
        return head;
    }

    public static void main(String [] args){
        LinkedList linkedList = new LinkedList();
        ListNode temp = new ListNode(10);
        linkedList.insertAtEnd(temp);
        temp = new ListNode(20);
        linkedList.insertAtEnd(temp);
        temp = new ListNode(30);
        linkedList.insertAtBegining(temp);
        temp = new ListNode(80);
        linkedList.insertAtBegining(temp);
        temp = new ListNode(90);
        linkedList.insertAtBegining(temp);
        temp = new ListNode(60);
        linkedList.insertAtEnd(temp);
        linkedList.insert(40,1);
//        linkedList.removeFromBegining();
//        linkedList.removeFromEnd();
//        linkedList.remove(40);
//        linkedList.getposition(30);
//        linkedList.clearList();
        linkedList.get(3);
        linkedList.printLinkedlist(linkedList.head);
        System.out.println("----------------");
        linkedList.reverse();
        linkedList.printLinkedlist(linkedList.head);
    }

    private int get(int index) {
        if(index<0){
            index = 0;
        }else if(index>=length){
            index = length-1;
        }
        ListNode temp = head;
        int val = 0,i=0;
        while(i != index){
            temp = temp.getNext();
            i++;
        }
        val = temp.getData();
        return val;
    }

    private void reverse() {
        ListNode temp = head;
        ListNode prev;
        boolean flag = true;
        while (head != null){
            prev = temp;
            if(flag){
                temp = temp.getNext();
                head = temp.getNext();
                temp.setNext(prev);
                prev.setNext(null);
                flag = false;
            }else {
                temp = head;
                head = temp.getNext();
                temp.setNext(prev);
            }
        }
        head = temp;
    }

    private void clearList() {
        head = null;
        length = 0;
    }

    public synchronized void getposition(int data) {
        if(head == null){
            return;
        }else{
            ListNode temp = head;
            int position = 0;
            while (temp.getData() != data){
                temp = temp.getNext();
                position++;
            }
        }
    }

    public synchronized void remove(int data) {
        if(head == null){
            return;
        }else{
            ListNode temp = head;
            ListNode prev = temp;
            while (temp != null && temp.getData() != data){
                prev = temp;
                temp = temp.getNext();
            }
            if(prev.getNext() != null){
                prev.setNext(temp.getNext());
            }
        }
    }

    public synchronized void removeFromEnd() {
        if(head == null){
            return;
        }else{
            ListNode temp = head;
            ListNode prev = temp;
            while (temp.getNext() != null){
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(null);
        }
    }

    public synchronized void removeFromBegining() {
        if(head == null){
            return;
        }else {
            ListNode temp = head;
            temp = temp.getNext();
            head = temp;
            temp = null;
        }
    }


    public synchronized void insert(int data, int position) {
        if(position<0){
            insertAtBegining(new ListNode(data));
            return;
        }else if(position > length){
            insertAtEnd(new ListNode(data));
        }else if(head == null){
            ListNode temp = new ListNode(data);
            head = temp;
            temp = null;
        }else {
            ListNode node = new ListNode(data);
            ListNode temp =head;
            ListNode prev = temp;
            for (int i = 0; i < position; i++) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(node);
            node.setNext(temp);
            node = null;

        }
        length++;
    }

    public synchronized void insertAtEnd(ListNode node) {
        if (head == null){
            head = node;
        }else {
            ListNode temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        length++;
    }

    public synchronized void insertAtBegining(ListNode node){
        if(head == null){
            head = node;
        }else{
            node.setNext(head);
            head = node;
            node = null;
        }
        length++;
    }

    public void printLinkedlist(ListNode head) {
        ListNode temp = head;
        while (temp !=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
