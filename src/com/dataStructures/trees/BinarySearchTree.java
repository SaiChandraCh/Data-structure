package com.dataStructures.trees;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;
    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
        }else {
            TreeNode next = root;
            TreeNode prev = root;
            while (next != null){
                prev = next;
                if(data < next.data){
                    next = next.left;
                }else{
                    next = next.right;
                }
            }
        if(data < prev.data){
            prev.left = newNode;
        }else{
            prev.right = newNode;
        }
        }
    }

//    public void insert(int data){
//        TreeNode newNode = new TreeNode(data);
//
//    }
//  Recursive method
//    public void inOrder(TreeNode root){
//        if(root == null)
//            return;
//        else{
//            inOrder(root.left);
//            System.out.println(root.data);
//            inOrder(root.right);
//        }
//    }

//  Iterative method
    public void inOrder(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp = stack.peek();
    }

//  Recursive method
//    public void preOrder(TreeNode root){
//        if(root == null)
//            return;
//        else{
//            System.out.println(root.data);
//            preOrder(root.left);
//            preOrder(root.right);
//        }
//    }

//  Iterative method
//    public void preOrder(TreeNode root) {
//        ArrayList<Integer> res = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode temp = stack.pop();
//            res.add(temp.data);
//            if(temp.right != null){
//                stack.push(temp.right);
//            }
//            if(temp.left != null){
//                stack.push(temp.left);
//            }
//        }
//        for (int a : res) {
//            System.out.println(a);
//        }
//    }
//    Recursive method
    public void postOrder(TreeNode root){
        if(root == null)
            return;
        else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

//  Iterative method
//    public void postOrder(TreeNode root) {
//        ArrayList<Integer> res = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        TreeNode prev = null;
//        while (!stack.isEmpty()){
//            TreeNode temp = stack.pop();
//
//        }
//    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(15);
        tree.insert(7);
        tree.insert(2);
        tree.insert(10);
        tree.insert(12);
        tree.insert(18);
        tree.insert(16);
        tree.insert(20);

        tree.inOrder(tree.root);
        System.out.println("--------------------------");
//        tree.preOrder(tree.root);
//        System.out.println("--------------------------");
//        tree.postOrder(tree.root);
    }

}
