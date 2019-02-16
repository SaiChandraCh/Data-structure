package com.dataStructures.trees.AVL;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
//      RR rotation
//        tree.insert(6);
//        tree.insert(5);
//        tree.insert(14);
//        tree.insert(3);
//        tree.insert(10);
//        tree.insert(16);
//        tree.insert(18);

//        LR rotation
//        tree.insert(6);
//        tree.insert(5);
//        tree.insert(9);
//        tree.insert(3);
//        tree.insert(7);
//        tree.insert(8);

//      LL rotation
//        tree.insert(6);
//        tree.insert(5);
//        tree.insert(9);
//        tree.insert(14);
//        tree.insert(18);

//        RL rotation
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
        tree.insert(14);
        tree.insert(12);
        tree.insert(15);
        tree.insert(13);


        tree.levelOrder();
        System.out.println("-----------------------");
        tree.delete(14);
        System.out.println("-----------------------");
        tree.levelOrder();
    }
}
