package com.gdstruc.Quiz6;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(29);
        tree.insert(36);
        tree.insert(-8);
        tree.insert(-21);
        tree.insert(35);
        tree.insert(-44);
        tree.insert(-13);
        tree.insert(23);

        //tree.traverseInOrder();

        System.out.println(tree.get(23));
        System.out.println(tree.getMin());
    }
}
