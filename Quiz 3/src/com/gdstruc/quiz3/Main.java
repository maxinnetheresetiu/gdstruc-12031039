package com.gdstruc.quiz3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // Getting random number of players
    public static int generateRandomPlayerCount()
    {
        Random rand = new Random();
        int randomNumberOfPlayers = rand.nextInt(7);
        randomNumberOfPlayers += 1;
        return randomNumberOfPlayers;
    }

    public static void main(String[] args) {
        ArrayQueue playerQueue = new ArrayQueue(20);
        playerQueue.enqueue(new Player(1, "judith"));
        playerQueue.enqueue(new Player(2, "lucille"));
        playerQueue.enqueue(new Player(3, "lilibeth"));
        playerQueue.enqueue(new Player(4, "maryella"));
        playerQueue.enqueue(new Player(5, "maura"));
        playerQueue.enqueue(new Player(6, "millicent"));
        playerQueue.enqueue(new Player(7, "prudence"));
        playerQueue.enqueue(new Player(8, "quinnie"));
        playerQueue.enqueue(new Player(9, "ruth"));
        playerQueue.enqueue(new Player(10, "sophronia"));
        playerQueue.enqueue(new Player(11, "llewellyn"));
        playerQueue.enqueue(new Player(12,"milburn"));
        playerQueue.enqueue(new Player(13, "neville"));
        playerQueue.enqueue(new Player(14, "orson"));
        playerQueue.enqueue(new Player(15, "saul"));
        playerQueue.enqueue(new Player(16, "vaughn"));
        playerQueue.enqueue(new Player(17, "wilmur"));
        playerQueue.enqueue(new Player(18, "asa"));
        playerQueue.enqueue(new Player(19, "brogan"));
        playerQueue.enqueue(new Player(20, "clement"));

        ArrayQueue queue = new ArrayQueue(15);

        Scanner pause = new Scanner(System.in);

        int game = 0;
        while(game < 10)
        {
            int x = generateRandomPlayerCount();

            System.out.println("Getting players...");
            for (int i = 0; i < x; i++)
            {
                Player player = playerQueue.dequeue();
                queue.enqueue(player);
            }

            System.out.println("Current queue:");
            queue.printQueue();
            pause.nextLine();

            if (queue.size() >= 5)
            {
                System.out.println("Starting the game!!");
                int round = game + 1;
                System.out.println("ROUND " + round);
                pause.nextLine();
                System.out.println("Popping 5 players from queue...");
                for (int i = 0; i < 5; i++)
                {
                    Player player = queue.dequeue();
                    playerQueue.enqueue(player);
                }
                System.out.println("Current queue:");
                queue.printQueue();
                pause.nextLine();
                game++;
            }
        }

        System.out.println("Game ended!!");
    }

}
