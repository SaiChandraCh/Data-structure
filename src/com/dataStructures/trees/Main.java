package com.dataStructures.trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(11);
        tree.insert(6);
        tree.insert(8);
        tree.insert(19);
        tree.insert(4);
        tree.insert(10);
        tree.insert(5);
        tree.insert(17);
        tree.insert(43);
        tree.insert(49);
        tree.insert(31);
        tree.insert(30);
        tree.insert(32);
        tree.insert(9);
        tree.insert(7);
        tree.delete(11);
        tree.delete(43);

        tree.preOrder(tree.root);//DLR
        System.out.println("--------------------------");
        tree.inOrder(tree.root);//LDR
        System.out.println("--------------------------");
        tree.postOrder(tree.root);//LRD
        System.out.println("--------------------------");
        tree.levelOrder(tree.root);
        System.out.println("--------------------------");

        System.out.println(tree.min(tree.root));
        System.out.println(tree.max(tree.root));
    }
}
