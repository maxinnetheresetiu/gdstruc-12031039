package com.gdstruc.quiz4;

public class Main {

    public static void main(String[] args) {
        Player juli = new Player(56, "juli", 41);
        Player lilibeth = new Player(95, "lilibeth", 28);
        Player lia = new Player(66, "lia", 42);
        Player flower = new Player(13, "flower", 20);
        Player leo= new Player(22, "leo", 24);

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put(juli.getUserName(), juli);
        hashtable.put(lilibeth.getUserName(), lilibeth);
        hashtable.put(lia.getUserName(), lia);
        hashtable.put(flower.getUserName(), flower);
        hashtable.put(leo.getUserName(), leo);

        hashtable.printHashtable();
        hashtable.remove("leo");
        hashtable.printHashtable();
        hashtable.remove("rororor");
        hashtable.printHashtable();
    }
}
