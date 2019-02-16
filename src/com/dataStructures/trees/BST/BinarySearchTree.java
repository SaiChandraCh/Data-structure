package com.dataStructures.trees.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    TreeNode root;
    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
            return;
        }else {
            TreeNode curr = root;
            TreeNode prev = null;
            while (curr != null){
                prev = curr;
                if(curr.data<=data){
                    curr=curr.right;
                }else if(curr.data > data){
                    curr=curr.left;
                }
            }
            if(prev.data <= data){
                prev.right = newNode;
            }else {
                prev.left = newNode;
            }
        }
    }
//  Recursive
//    public void preOrder(TreeNode root) {
//        if(root == null){
//            return;
//        }
//        System.out.println(root.data);
//        preOrder(root.left);
//        preOrder(root.right);
//    }

//  Iterative
    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        ArrayList<Integer> res = new ArrayList();
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.data);
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
        for (int num : res){
            System.out.println(num);
        }
    }

    public void inOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList();
        TreeNode curr = root;
        boolean done = false;
        while (!done){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }else{
                if(stack.isEmpty()){
                    done = true;
                }else{
                    curr = stack.pop();
                    res.add(curr.data);
                    curr = curr.right;
                }

            }
        }

        for (int num : res) {
            System.out.println(num);
        }
    }

    public void postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList();
        stack.push(root);
        TreeNode curr = null,prev = null;
        while(!stack.isEmpty()){
            curr = stack.peek();
            if(prev == null || prev.left == curr || prev.right == curr){
                if(curr.left != null){
                    stack.push(curr.left);
                }else if(curr.right != null){
                    stack.push(curr.right);
                }
            }else if(curr.left == prev){
                if(curr.right != null){
                    stack.push(curr.right);
                }
            }else {
                res.add(curr.data);
                stack.pop();
            }
            prev = curr;
        }

        for (int num : res) {
            System.out.println(num);
        }
    }

    public void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode curr = queue.remove();
            System.out.println(curr.data);
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }

    public void delete(int data) {
        TreeNode temp = root;
        boolean found = false;
        while (!found && temp != null){
            if(data > temp.data){
                temp = temp.right;
            }else if(data < temp.data){
                temp = temp.left;
            }else{
                found = true;
            }
        }
        temp.data = max(temp.left);
        TreeNode prev = temp;
        TreeNode curr = temp.left;
        if(curr.left == null){
            if(curr.right == null){
                prev.left = null;
            }
        }else {
            while (curr.right != null){
                prev = curr;
                curr = curr.right;
            }
            if(curr.left == null){
                prev.right = null;
            }else {
                prev.right = curr.left;
            }
        }
    }

    public int min(TreeNode root) {
        TreeNode temp = root;
        if(temp.left == null){
            if(temp.right != null){
                return temp.right.data;
            }else {
                return temp.data;
            }
        }
        while (temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }

    public int max(TreeNode root) {
        TreeNode temp = root;
        if(temp.right == null){
            if(temp.left != null){
                return temp.left.data;
            }else {
                return temp.data;
            }
        }
        while (temp.right != null){
            temp = temp.right;
        }
        return temp.data;
    }
}
