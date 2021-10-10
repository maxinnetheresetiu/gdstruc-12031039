package com.gdstruc.module4;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(7);

        queue.enqueue(new Player(1, "mochi", 44));
        queue.enqueue(new Player(2, "puting", 60));
        queue.enqueue(new Player(3, "christian", 22));
        queue.enqueue(new Player(4, "luna", 22));
        queue.enqueue(new Player(5, "mallows", 1));
        queue.enqueue(new Player(6, "adie", 53));

        queue.printQueue();
        queue.enqueue(new Player(7,"paraluman", 4));

        System.out.println("After adding player:\n");
        queue.printQueue();

        System.out.println("After removing player:" + queue.dequeue());
        queue.printQueue();
    }
}
