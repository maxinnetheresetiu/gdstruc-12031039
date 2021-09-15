package com.gdstruc.module2part2;

public class Main {

    public static void main(String[] args) {

        Player jumbo = new Player(1, "jumbo", 100);
        Player hatdog = new Player(2, "hatdog", 41);
        Player kaya = new Player(3, "kaya", 22);
        Player mo = new Player(4, "mo", 82);
        Player ba = new Player(5, "ba", 107);
        Player toh = new Player(6, "toh", 5);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(jumbo);
        playerLinkedList.addToFront(hatdog);
        playerLinkedList.addToFront(kaya);
        playerLinkedList.addToFront(mo);
        playerLinkedList.addToFront(ba);
        playerLinkedList.addToFront(toh);

    }
}
