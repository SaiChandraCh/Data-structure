package com.dataStructures.list.exercise;

class AddNode{
    int data;
    AddNode next;
    AddNode(int data){
        this.data = data;
        this.next = null;
    }
}
class AddList{
    int length = 0;
    AddNode head = null;
    void insertAtBegining(int data){
        AddNode newNode = new AddNode(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            newNode = null;
        }
        length++;
    }

    public void print() {
        AddNode temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reverse() {
        AddNode temp = head;
        AddNode prev;
        boolean flag = true;
        while (head != null){
            prev = temp;
            if(flag){
                temp = temp.next;
                head = temp.next;
                temp.next = (prev);
                prev.next = (null);
                flag = false;
            }else {
                temp = head;
                head = temp.next;
                temp.next = (prev);
            }
        }
        head = temp;
    }

    public void insertAtEnding(int data) {
    }

    public int get(int index) {
        return 0;
    }

    public AddList add(AddList l2) {
        int len1 = length, len2 = l2.length,carry = 0;
        AddList result = new AddList();
        AddNode temp1 = null;
        AddNode temp2 = null;
        if(len1 > len2){
            temp1 = head;
            temp2 = l2.head;
        }else{
            temp1 = l2.head;
            temp2 = head;
        }
        while (temp1 != null){
            if(temp2 !=null){

                result.insertAtBegining((carry + temp1.data + temp2.data)%10);
                carry = (temp1.data + temp2.data)/10;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else {
                result.insertAtBegining((carry + temp1.data)%10);
                carry = 0;
                temp1 = temp1.next;
            }
        }
        return result;
    }
}
public class Adding2LinkedList {
    public static void main(String[] args) {
        AddList l1 = new AddList();
        l1.insertAtBegining(8);
        l1.insertAtBegining(7);
        l1.insertAtBegining(9);
        l1.insertAtBegining(5);
        l1.insertAtBegining(1);
        l1.insertAtBegining(4);
        l1.insertAtBegining(5);
        l1.print();
        System.out.println("-------------");
        l1.reverse();
        l1.print();
        System.out.println("-------------");
        AddList l2 = new AddList();
        l2.insertAtBegining(4);
        l2.insertAtBegining(6);
        l2.insertAtBegining(8);
        l2.insertAtBegining(5);
        l2.insertAtBegining(7);
        l2.reverse();
        l2.print();
        System.out.println("-------------");
        l2.print();
        System.out.println("-------------");
        AddList l3 = l1.add(l2);
        l3.print();
    }
}
