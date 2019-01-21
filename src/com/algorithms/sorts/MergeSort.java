package com.algorithms.sorts;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
        divide(array,0,array.length);
    }
    public static void divide(int[] array, int start, int end){
        for (int i =start; i<end;i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------------");
        if(end-start<2){
            return;
        }
        int mid = (end + start)/ 2;
        divide(array,start,mid);
        divide(array,mid,end);
        conquer(array,start,mid,end);
    }

    private static void conquer(int[] array, int start, int mid, int end) {
        System.out.println("**************************");
        System.out.println("start : "+start+"\tmid : "+mid+"\tend : "+end);
//        for (int i =start; i<=end;i++) {
//            System.out.println(array[i]);
//        }
        System.out.println("**************************");
    }
}
