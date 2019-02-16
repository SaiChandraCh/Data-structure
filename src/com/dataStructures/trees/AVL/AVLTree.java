package com.dataStructures.trees.AVL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AVLTree {
    AVLTreeNode root;
    public void insert(int data) {
        AVLTreeNode newNode = new AVLTreeNode(data);
        Stack<AVLTreeNode> stack = new Stack<>();
        if(root == null){
            root = newNode;
        }else {
            AVLTreeNode curr = root;
            AVLTreeNode prev = root;
            while (curr != null){
                prev = curr;
                stack.push(prev);
                if(data > curr.data){
                    curr = curr.right;
                }else {
                    curr = curr.left;
                }
            }
            if(data > prev.data){
                prev.right = newNode;
            }else {
                prev.left = newNode;
            }
        }
        balance(stack);
    }


    private void balance(Stack<AVLTreeNode> stack) {
        int balanceFactor = 0;
        AVLTreeNode next = null;
        while (!stack.isEmpty()){
            AVLTreeNode top = null;
            AVLTreeNode curr = stack.pop();
            curr.height = Integer.max(curr.left != null ?curr.left.height:0,curr.right != null ?curr.right.height:0)+1;
            balanceFactor = (curr.left != null ?curr.left.height:0) - (curr.right != null ?curr.right.height:0);
//------------------------------------------ Balance ----------------------------------------------
            if(!stack.isEmpty()){
                top = stack.peek() != null ? stack.peek(): null;
            }
            if(balanceFactor == 2){
                next = curr.left;
//                RR rotation
                if(next.left != null && next.right == null){
                    if(top != null){
                        if(top.left == curr){
                            top.left = next;
                        }else if(top.right == curr){
                            top.right = next;
                        }
                        next.right = curr;
                        curr.left = null;
                    }
                    else{
                        next.right = curr;
                        curr.left = null;
                        root = next;
                    }
                }
//                LR rotation
                else if(next.right != null && next.left == null){
                    curr.left = next.right;
                    next.right.left = next;
                    next.height--;
                    next.right = null;
                    next = curr.left;
                    next.height++;

                    if(top != null){
                        if(top.left == curr){
                            top.left = next;
                        }else if(top.right == curr){
                            top.right = next;
                        }
                        next.right = curr;
                        curr.left = null;
                    }
                    else{
                        next.right = curr;
                        curr.left = null;
                        root = next;
                    }
                }
            }else if(balanceFactor == -2){
                next = curr.right;
//                LL rotation
                if(next.right != null){
                    if(top != null){
                        if(top.left == curr){
                            top.left = next;
                        }else if(top.right == curr){
                            top.right = next;
                        }
                        next.left = curr;
                        curr.right = null;
                    }
                    else{
                        System.out.println(next.data);
                        curr.right = next.left;
                        next.left = curr;
                        root = next;
                    }
                }
//                RL rotation
                else if(next.left != null){
                    curr.right = next.left;
                    next.left.right = next;
                    next.left = null;
                    next.height--;
                    next = curr.right;
                    next.height++;
                    if(top != null){
                        if(top.left == curr){
                            top.left = next;
                        }else if(top.right == curr){
                            top.right = next;
                        }
                        next.left = curr;
                        curr.right = null;
                    }
                    else{
                        curr.right = next.left;
                        next.left = curr;
                        root = next;
                    }
                }
            }
            curr.height = Integer.max(curr.left != null ?curr.left.height:0,curr.right != null ?curr.right.height:0)+1;
        }
    }


    public void delete(int data) {
        Stack<AVLTreeNode> stack = new Stack<>();
        boolean found = false;
        if(root == null){
            System.out.println("root is empty");
            return;
        }else {
            AVLTreeNode curr = root;
            AVLTreeNode prev = root;
            while (curr != null && !found){
                stack.push(curr);
                if(data > curr.data){
                    curr = curr.right;
                }else if(data < curr.data) {
                    curr = curr.left;
                }else if(data == curr.data){
                    if(prev.left == curr){
                        prev.left = curr.left;
                        if(curr.right != null){
                            curr.left.right = curr.right;
                        }
                        curr = prev.left;
                    }else if(prev.right == curr){
                        prev.right = curr.right;
                        if(curr.right != null){
                            curr.right.left = curr.left;
                        }
                        int tempHeight = curr.height;
                        curr = prev.right;
                        curr.height = tempHeight;
                    }
                    found = true;
                }
                prev = stack.peek();
            }
        }
        balance(stack);
    }

    public void levelOrder() {
        Queue<AVLTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            AVLTreeNode temp = queue.remove();
            System.out.println(temp.data+"\t height : "+ temp.height);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
}
