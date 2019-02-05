package com.dataStructures.queue;

public class FixedCircularArrayQueue {
    int[] queue;
    int front, rear, size;
    public static final int CAPACITY=16;

    public FixedCircularArrayQueue(){
        this(CAPACITY);
    }

    public FixedCircularArrayQueue(int capacity){
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int data) {
        if(isFull()){
            throw new IndexOutOfBoundsException("Queue is full");
        }else {
            if(rear == queue.length-1 && front > 0 && front != rear){
                rear = 0;
            }
            queue[rear++] = data;
            size++;
        }
    }

    public void dequeue() {
        if(front<rear){
            queue[front++] = Integer.MIN_VALUE;
            size--;
        }
    }

    public void peek() {

    }

    private boolean isFull() {
        if((front == 0 && rear == queue.length-1 )|| ( front > 0 && front == rear )){
            return true;
        }else {
            return false;
        }
    }

    public void print() {
        for (int num: queue) {
            if(num != 0 && num != Integer.MIN_VALUE){
                System.out.println(num);
            }
        }
    }

}
