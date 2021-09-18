package com.gdstruc.quiz2;

import java.util.Scanner;

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

        //removing the first element
        playerLinkedList.removeFirstElement();
        playerLinkedList.printList();

        playerLinkedList.countElement();

        Scanner userInput = new Scanner(System.in);

        /*String name;
        System.out.println("Check if player is in the linked list.");
        System.out.println("id: ");
        int id = userInput.nextInt();
        System.out.println("name: ");
        name = userInput.nextLine();
        System.out.println("level: ");
        int level = userInput.nextInt();*/

        int idT = 2;
        String nameT = "Asuna";
        int levelT = 41;

        playerLinkedList.contains(idT, nameT, levelT);


    }
}
