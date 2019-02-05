package com.algorithms.sorts;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {6,4,3,7,5,1,2};
        array = new MergeSort().divide(array,0,array.length-1);
//        System.out.println("-----------------------");
//        for (int num : array) {
//            System.out.println(num);
//        }
//        System.out.println("-----------------------");
    }
    public int[] divide(int[] array, int start, int end){
        if(end-start<2){
            return array;
        }
        int mid = (end + start)/ 2;
        divide(array,start,mid);
        divide(array,mid+1,end);
        array = conquer(array,start,mid,end);
        return array;
    }

    public int[] conquer(int[] array, int start, int mid, int end) {
        System.out.println("--------------------");
        System.out.println(start+"\t"+mid+"\t"+end);
        int i = start;
        int j = mid;
        System.out.println(i++ +"\t"+j++);
        return array;
    }
}
