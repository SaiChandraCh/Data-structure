package com.dataStructures.trees.AVL;

public class AVLTreeNode {
    int data, height;
    AVLTreeNode left, right;
    public AVLTreeNode(int data){
        this.data = data;
        this.height = 1;
    }
}
