package com.gdstruc.module3;

public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "Max", 123));
        stack.push(new Player(2, "Chimken", 23));
        stack.push(new Player(3, "Sarap", 53));
        stack.push(new Player(4, "To", 2));
        stack.push(new Player(5, "The", 12));
        stack.push(new Player(6, "Bones", 49));

        stack.printStack();

        System.out.println("Popping: " + stack.pop());

        stack.printStack();

    }
}
