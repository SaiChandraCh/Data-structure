package com.dataStructures.Heap;

public class MaxHeap {

    int heap[];
    int size = 0;

    MaxHeap(){
        heap = new int[50];
    }

    public void insert(int data) {
        heap[size++] = data;
        heapify();
    }

    private void heapify() {
        int index = 0, temp = 0;
        while (index<size){
            if(heap[index] < heap[2*index + 1]){
                temp = heap[index];
                heap[index] = heap[2*index + 1];
                heap[2*index + 1] = temp;
                index = 2 * index + 1;
            }else if(heap[index] < heap[2*index + 2]){
                temp = heap[index];
                heap[index] = heap[2*index + 2];
                heap[2*index + 2] = temp;
                index = 2 * index + 2;
            }else {
                index++;
            }
        }
    }

    public void print() {
        for (int num : heap) {
            if(num != 0)
                System.out.println(num);
        }
    }

    public void delete() {
        heap[0] = heap[size-1];
        heap[size-1] = 0;
        size--;
        heapify();
    }

    public int findMax() {
        return heap[0];
    }
}
