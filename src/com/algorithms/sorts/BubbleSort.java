package com.algorithms.sorts;

public class BubbleSort {
    public static void main(String[] args) {
       int[] array = {20,35,-15,7,55,1,-22};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int firstUnsortedIndex = 0; firstUnsortedIndex < lastUnsortedIndex; firstUnsortedIndex++) {
                if(array[firstUnsortedIndex]>array[firstUnsortedIndex + 1]){
                    swap(array,firstUnsortedIndex,firstUnsortedIndex+1);
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
    static void swap(int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
