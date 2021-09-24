package com.gdstruc.module2part2;

public class PlayerLinkedList {
    private PlayerNode head;

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
}
