package com.maxinnetherese;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //prints out hello world
        System.out.println("Hello World :)))");

        // gets user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
