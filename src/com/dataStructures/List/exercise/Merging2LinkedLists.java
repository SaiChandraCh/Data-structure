package com.dataStructures.List.exercise;

class MergeNode{
    int data;
    MergeNode next;
    MergeNode(int data){
        this.data = data;
        this.next = null;
    }
}
class MergeList{
    MergeNode head=null;
    int length = 0;
    public void insert(int data) {
        MergeNode newNode = new MergeNode(data);
        if(head == null){
            head = newNode;
        }else{
            MergeNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    public MergeList merge(MergeList list2) {
        MergeNode temp1 = null;
        MergeNode temp2 = null;
        MergeNode temp3 = null;
        MergeNode temp4 = null;
        int len1 = this.length, len2 = list2.length;
        if(len1 > len2){
            temp1 = head;
            temp2 = list2.head;
        }else{
            temp2 = head;
            temp1 = list2.head;
        }
        while(temp2 != null){
            if(temp3 == null){
                if(temp1.data>temp2.data){
                    temp3 = new MergeNode(temp2.data);
                    temp2 = temp2.next;
                }else {
                    temp3 = new MergeNode(temp1.data);
                    temp1 = temp1.next;
                }
            }else {

            }
        }
        return null;
    }

    public void print() {
        MergeNode temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Merging2LinkedLists {
    public static void main(String[] args) {
        MergeList list1 = new MergeList();
        MergeList list2 = new MergeList();
        MergeList list3 = new MergeList();
        list1.insert(10);
        list1.insert(15);
        list1.insert(17);
        list1.insert(25);
        list1.insert(45);
        list1.insert(75);
        list1.print();
        System.out.println("--------------");
        list2.insert(7);
        list2.insert(8);
        list2.insert(16);
        list2.insert(20);
        list2.insert(27);
        list2.insert(40);
        list2.insert(99);
        list2.print();
        System.out.println("--------------");
        list3 = list1.merge(list2);
        list3.print();
    }
}
