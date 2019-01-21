package com.dataStructures.stack;

class ListStackNode{
    int data;
    ListStackNode next;
    ListStackNode(int data){
        this.data = data;
        this.next = null;
    }
}



public class LinkedListStack {

    private ListStackNode top = null;
    private int length = 0;
    public static void main(String[] args) throws Exception {
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(20);
        linkedListStack.push(10);
        linkedListStack.push(30);
        linkedListStack.push(60);
        linkedListStack.push(90);
        linkedListStack.print();
        linkedListStack.pop();
        System.out.println("--------------------");
        linkedListStack.print();
    }

    public void print() {
        ListStackNode temp = top;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void pop() throws Exception {
        if(top == null){
            throw new Exception("Stack is Empty");
        }else{
            top = top.next;
        }
        length--;
    }

    public void push(int data) {
        ListStackNode newNode = new ListStackNode(data);
        if (top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        length++;
    }
    public int size(){
        return this.length;
    }
}
