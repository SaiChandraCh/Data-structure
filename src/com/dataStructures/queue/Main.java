package com.dataStructures.queue;

import com.dataStructures.stack.DynamicArrayStack;

public class Main {
    public static void main(String[] args) {
//        FixedCircularArrayQueue queue = new FixedCircularArrayQueue();
        DynamicCircularArrayQueue queue = new DynamicCircularArrayQueue();
        queue.enqueue(5);
        queue.enqueue(65);
        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(50);
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(51);
        queue.enqueue(605);
        queue.enqueue(19);
        queue.enqueue(31);
        queue.enqueue(11);
        queue.enqueue(105);
        queue.enqueue(181);
        queue.enqueue(12);
        queue.print();
        queue.dequeue();
        System.out.println("--------------------");
        queue.enqueue(79);
        queue.print();
        queue.peek();
    }
}
