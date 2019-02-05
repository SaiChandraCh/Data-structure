package com.dataStructures.queue;

public class DynamicCircularArrayQueue {
    int[] queue;
    int front, rear, size;
    public static final int CAPACITY = 10;
    DynamicCircularArrayQueue(){
        this(CAPACITY);
    }
    DynamicCircularArrayQueue(int capacity){
        this.queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int data) {
    }

    public void dequeue() {
    }

    public void expand(){

    }

    public void shrink(){

    }

    public void print() {
    }

    public void peek() {
    }
}
