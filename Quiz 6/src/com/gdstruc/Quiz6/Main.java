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
        tree.insert(-100);

        System.out.println("In ascending order:");
        tree.traverseInOrder();
        System.out.println();
        System.out.println("In descending order:");
        tree.traverseInOrderDescending();
        System.out.println();

        //System.out.println(tree.get(23));
        System.out.println("The least value in the tree is " + tree.getMin());
        System.out.println("The greatest value in the tree is " + tree.getMax());


    }
}
