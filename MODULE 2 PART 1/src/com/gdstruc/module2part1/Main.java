package com.gdstruc.module2part1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "jumbo", 100));
        playerList.add(new Player(2, "hatdog", 41));
        playerList.add(new Player(3, "kaya", 22));
        playerList.add(new Player(5, "mo", 82));
        playerList.add(new Player(6, "ba", 107));
        playerList.add(new Player(7, "toh", 5));

        //access an element
//        System.out.println(playerList.get(1));

        //add element
        playerList.add(3, new Player(4, "o di kaya", 21));

        //delete an element
        playerList.remove(6);

        //checking if we have the element
//      System.out.println(playerList.contains(new Player(5, "mo", 82 )));
        System.out.println(playerList.indexOf(new Player(5, "mo", 82 )));
      //print the data
//       for(Player p : playerList)
//        {
//            System.out.println(p);
//        }

    }
}
