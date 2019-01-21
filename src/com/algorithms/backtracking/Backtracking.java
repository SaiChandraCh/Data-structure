package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Backtracking {
//    public void backtrack(int length,
//                          ArrayList<Integer> nums,
//                          List<List<Integer>> output,
//                          int iterationCount) {
//        // if all integers are used up
//        if (iterationCount == length)
//            output.add(new ArrayList<Integer>(nums));
//        for (int i = iterationCount; i < length; i++) {
//            // place i-th integer first
//            // in the current permutation
//            Collections.swap(nums, iterationCount, i);
//            // use next integers to complete the permutations
//            backtrack(length, nums, output, iterationCount + 1);
//            // backtrack
//            Collections.swap(nums, iterationCount, i);
//        }
//    }
//
//    public List<List<Integer>> permute(int[] nums) {
//        // init output list
//        List<List<Integer>> output = new LinkedList();
//
//        // convert nums into list since the output is a list of lists
//        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
//        for (int num : nums)
//            nums_lst.add(num);
//
//        int n = nums.length;
//        backtrack(n, nums_lst, output, 0);
//        System.out.println(output);
//        return output;
//    }
//
//    public static void main(String[] args) {
//        Backtracking backtracking = new Backtracking();
//        backtracking.permute(new int[]{1,2,3});
//    }
}
