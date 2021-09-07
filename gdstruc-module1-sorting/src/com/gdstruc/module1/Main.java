package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 5;
        numbers[2] = 23;
        numbers[3] = 17;
        numbers[4] = 90;
        numbers[5] = 84;
        numbers[6] = 24;
        numbers[7] = 19;
        numbers[8] = 58;
        numbers[9] = 73;

        System.out.println("numbers: ");
        printArrayElements(numbers);

        bubbleSort(numbers);
        System.out.println("\n\nArranging using bubble sort in descending order: ");
        printArrayElements(numbers);

        selectionSortBig(numbers);
        System.out.println("\n\nArranging using selection sort in descending order: ");
        printArrayElements(numbers);

        selectionSortSmall(numbers);
        System.out.println("\n\nArranging using selection sort in descending order but looking for the smallest value first and putting it at the end");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int arr[])
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] < arr[i + 1])
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    private static void selectionSortBig(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex =  0;
            for(int i = 0; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void selectionSortSmall(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = lastSortedIndex;
            for(int i = 0; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
