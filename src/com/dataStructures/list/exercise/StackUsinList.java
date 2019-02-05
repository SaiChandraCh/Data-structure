package com.dataStructures.list.exercise;

class StackListNode{
    int data;
    StackListNode next;

    public StackListNode(int data) {
        this.data = data;
        next = null;
    }
}

class StackList{
    StackListNode top = null;
    public void insert(int data) {
        StackListNode newNode = new StackListNode(data);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }
    public void remove() {
        if(top !=null){
            top = top.next;
        }
    }
    public void print() {
        StackListNode temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class StackUsinList {
    public static void main(String[] args) {
        StackUsinList stack = new StackUsinList();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.print();
        stack.pop();
        stack.print();
    }
    StackList list = new StackList();
    private void push(int data) {
        list.insert(data);
    }
    private void pop() {
        list.remove();
    }
    private void print() {
        list.print();
    }
}
