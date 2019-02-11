package com.dataStructures.queue;

public class DynamicCircularArrayQueue {
    int[] queue;
    int front, rear, size;
    public static final int CAPACITY = 16;
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
        if(isFull()){
            expand();
        }
        if(front > 0 && rear == queue.length-1){
            rear = 0;
        }
        queue[rear++] = data;
        size++;
    }

    public void dequeue() {
        if(!isEmpty()){
            queue[front++] = Integer.MIN_VALUE;
        }
        if(size == queue.length/2)
            shrink();
    }

    public void expand(){
        int[] newQueue = new int[queue.length * 2];
        System.arraycopy(queue,0,newQueue,0,queue.length);
        queue = newQueue;
    }

    public void shrink(){
        int[] newQueue = new int[queue.length / 2];
        System.arraycopy(queue,0,newQueue,0,queue.length / 2);
        queue = newQueue;
    }

    private boolean isFull() {
        if((front == rear && front > 0) || ( front == 0 && rear == queue.length-1)){
            return true;
        }else
            return false;
    }

    private boolean isEmpty() {
        if(rear == front){
            return true;
        }else
            return false;
    }

    public void print() {
        for (int num : queue) {
            if(num != 0 && num != Integer.MIN_VALUE){
                System.out.println(num);
            }
        }
    }

    public void peek() {
    }
}
