package com.gdstruc.quiz2;

public class PlayerLinkedList {
    private PlayerNode head;
    public int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("Head -> ");
        while(current != null)
        {
            System.out.println(current.getPlayer());
            System.out.println(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removeFirstElement()
    {
        PlayerNode current = head;
        head = head.getNextPlayer();
        current = null;
    }

    public void countElement()
    {
        PlayerNode current = head;
        size = 0;
        while(current != null)
        {
            size++;
            current = current.getNextPlayer();
        }
        System.out.println("size = " + size);
    }

    public boolean contains()
    {
        PlayerNode
    }
}
