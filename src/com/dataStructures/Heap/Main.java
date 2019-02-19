package com.dataStructures.Heap;

public class Main {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.insert(35);
        heap.insert(33);
        heap.insert(42);
        heap.insert(10);
        heap.insert(14);
        heap.insert(19);
        heap.insert(27);
        heap.insert(44);
        heap.insert(26);
        heap.insert(31);

        heap.print();
        System.out.println("================================");
        heap.delete();
        heap.print();
        System.out.println("================================");
        System.out.println(heap.findMax());
    }
}
