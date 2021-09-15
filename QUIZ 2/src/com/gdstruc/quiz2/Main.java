package com.gdstruc.quiz2;

public class Main {

    public static void main(String[] args) {

        Player heathcliff = new Player(1, "Heathcliff", 100);
        Player asuna = new Player(2, "Asuna", 41);
        Player lethalBacon = new Player(3, "LethalBacon", 22);
        Player hpDeskjet = new Player(4, "HpDeskjet", 82);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(hpDeskjet);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(heathcliff);

        playerLinkedList.printList();

    }
}
