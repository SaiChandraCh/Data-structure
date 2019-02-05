package com.dataStructures.queue;

class QueueNode {
    int data;
    QueueNode next;
    public QueueNode(int data){
        this.data = data;
        next = null;
    }
}
public class QueueLL {
    QueueNode front=null, rear=null;
    int length;

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(9);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.print();
        System.out.println("----------------------");
        queue.dequeue();
        queue.print();
    }

    private void print() {
        QueueNode temp = front;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    private void dequeue() {
        front = front.next;
    }

    private void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            length++;
            return;
        }else{
            rear.next = newNode;
            rear = newNode;
            length++;
        }
    }
}
