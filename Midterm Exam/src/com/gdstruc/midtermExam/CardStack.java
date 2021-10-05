package com.gdstruc.midtermExam;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack(String input)
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Printing " + input + ": ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int countStackSize()
    {
        ListIterator<Card> iterator = stack.listIterator();
        int i = 0;
        while(iterator.hasNext())
        {
            i++;
            iterator.next();
        }
        return i;
    }
}
