package com.dataStructures.trees.BinaryTree;

public class BinaryTree {
    TreeNode root;
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        boolean left = true;
        if(root == null){
            root = newNode;
            return;
        }else {
            TreeNode curr = root;
            TreeNode prev = curr;
            while(curr != null){
                if(curr.left == null){
                    curr.left = newNode;
                }else if(curr.right == null){
                    curr.right = newNode;
                }else if(curr.left != null && curr.right != null){
                    if(left){
                        curr = prev.left;
                        left = false;
                    }else {
                        curr = prev.right;
                        left = true;
                    }
                }
            }
        }
    }
}
