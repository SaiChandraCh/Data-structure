package com.dataStructures.stack;

public class SimpleArrayStack {
    private final int LENGTH = 10;
    int top = -1;
    private int[] stack;
    public SimpleArrayStack() {
        stack = new int[LENGTH];
    }

    public static void main(String[] args) throws Exception {
        SimpleArrayStack simpleArrayStack = new SimpleArrayStack();
        simpleArrayStack.push(20);
        simpleArrayStack.push(40);
        simpleArrayStack.push(50);
        simpleArrayStack.push(10);
        simpleArrayStack.push(90);
        simpleArrayStack.print();
        simpleArrayStack.pop();
        System.out.println("----------");
        simpleArrayStack.print();
        System.out.println("----------");
        simpleArrayStack.top();
    }

    private void top() {
        if(top != 0){
            System.out.println(stack[top-1]);
        }
    }

    private void print() {
        for (int num:stack) {
            System.out.println(num);
        }
    }

    private void push(int data) throws Exception {
        if(top == LENGTH){
            throw new Exception("stack overflow exception");
        }else{
            stack[++top]= data;
        }
    }

    private void pop() throws Exception {
        if(top == -1){
            throw new Exception("stack is empty");
        }else{
            stack[top--]=0;
        }
    }
}
