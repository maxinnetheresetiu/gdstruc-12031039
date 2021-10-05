package com.gdstruc.midtermExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creating 30 cards
        CardStack playerDeck = new CardStack();
        Random rand = new Random();

        for(int i=0; i<30; i++)
        {
            int num = rand.nextInt(4);
            String name = "garbage";
            if(num == 0) { name = "clover"; };
            if(num == 1) { name = "spade"; };
            if(num == 2) { name = "heart"; };
            if(num == 3) { name = "diamond"; };
            playerDeck.push(new Card(i + 1, name));
        }

        playerDeck.printStack("player deck");
        Scanner pause = new Scanner(System.in);
        pause.nextLine();
        
        // Create player cards
        List<Card> playerCard = new ArrayList<>();

        // Create discard pile
        CardStack discardPile = new CardStack();

        // For the first move
        int x = rand.nextInt(5);
        int y = x + 1;
        System.out.println("Drawing " + y + " cards.");
        for(int i = 0; i < y; i++)
        {
            Card currentCard = playerDeck.pop();
            playerCard.add(currentCard);
        }
        pause.nextLine();

        // Loop starts here
        while (!playerDeck.isEmpty())
        {
            // Printing player cards
            System.out.println("Printing player cards: ");
            for(Card card : playerCard)
            {
                System.out.println(card);
            }
            pause.nextLine();
            // Printing player deck
            playerDeck.printStack("player deck");
            pause.nextLine();
            // Printing discarded pile
            discardPile.printStack("discard pile");
            pause.nextLine();
            int randomCommand = rand.nextInt(3);
            // Drawing cards from deck
            if(randomCommand + 1 == 1)
            {
                x = rand.nextInt(5);
                y = x + 1;
                if(x < playerDeck.countStackSize())
                {
                    System.out.println("Drawing " + y + " cards from deck.");
                    for (int i = 0; i < y; i++)
                    {
                        Card currentCard = playerDeck.pop();
                        playerCard.add(currentCard);
                    }
                }
                else
                {
                    System.out.println("Drawing " + y + " cards but player deck only have " + playerDeck.countStackSize() + ". Drawing " + playerDeck.countStackSize() + " instead.");
                    for (int i = 0; i < playerDeck.countStackSize(); i++)
                    {
                        Card currentCard = playerDeck.pop();
                        playerCard.add(currentCard);
                    }
                }
            }
            // Discarding cards from player to discard pile
            else if(randomCommand + 1 == 2)
            {
                x = rand.nextInt(5);
                y = x + 1;
                if(x < playerCard.size())
                {
                    System.out.println("Discarding " + y + " cards.");
                    for(int i = 0; i < y; i++ )
                    {
                        int randomIndex = rand.nextInt(playerCard.size());
                        Card currentCard = playerCard.remove(randomIndex);
                        discardPile.push(currentCard);
                    }
                }
                else
                {
                    System.out.println("Discarding " + y + " cards but you only have " + playerCard.size() + ". Discarding " + playerCard.size() + " instead.");
                    for(int i = 0; i < playerCard.size(); i++ )
                    {
                        Card currentCard = playerCard.remove(i);
                        discardPile.push(currentCard);
                    }
                }
            }
            // Drawing cards from discard pile
            else if(randomCommand + 1 == 3)
            {
                x = rand.nextInt(5);
                y = x + 1;
                if(x < discardPile.countStackSize())
                {
                    System.out.println("Drawing " + y + " cards from discard pile.");
                    for(int i = 0; i < y; i++)
                    {
                        Card currentCard = discardPile.pop();
                        playerCard.add(currentCard);
                    }
                }
                else
                {
                    System.out.println("Drawing " + y + " cards but discard pile only have " + discardPile.countStackSize() + ". Drawing " + discardPile.countStackSize() + " instead.");
                    for (int i = 0; i < discardPile.countStackSize(); i++)
                    {
                        Card currentCard = discardPile.pop();
                        playerCard.add(currentCard);
                    }
                }
            }
        }
    }
}
