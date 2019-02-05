package com.dataStructures.stack;

public class DynamicArrayStack {
    int length,top = -1;
    public static final int LENGTH = 16;
    int stack[];
    DynamicArrayStack(){
        this(LENGTH);
    }
    DynamicArrayStack(int length){
        this.length = length;
        stack = new int[this.length];
    }

    public static void main(String[] args) {
        DynamicArrayStack stack = new DynamicArrayStack();
        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.push(2);
        stack.push(9);
        stack.pop();
        stack.print();
    }

    private void print() {
        for (int i=top;i>=0;i--) {
            System.out.println(stack[i]);
        }
    }

    private void pop() {
        if(top != -1){
            stack[top--] = Integer.MIN_VALUE;
        }
        if(top == length/2){
            shrink();
        }
    }

    private void push(int data) {
        if(top != LENGTH){
            stack[++top] = data;
            length++;
        }else{
            expand();
            stack[++top] = data;
            length++;
        }
    }

    private int size(){
        return length;
    }

    private void expand() {
        int capacity = length*2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,capacity);
        stack = newStack;
    }

    private void shrink() {
        int capacity = length/2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,capacity);
        stack = newStack;
    }
}
