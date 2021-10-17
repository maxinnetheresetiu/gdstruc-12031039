package com.gdstruc.module6;

public class Main {

    public static void main(String[] args) {

        int numbers[] = { 60, 33, 12, 64, 17, 105, -53};

        System.out.println(linearSearch(numbers, 17));
        System.out.println(linearSearch(numbers, 111));
        System.out.println(binarySearch(numbers, 105));
        System.out.println(binarySearch(numbers, 22));
    }

    public static int linearSearch(int[] input, int value)
    {
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] == value)
            {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while(start <= end)
        {
            int middle = (start + end) / 2;

            if(input[middle] ==  value)
            {
                return middle;
            }
            else if(value < input[middle]) // Value might be at left half
            {
                end = middle - 1;
            }
            else if(value > input[middle]) // Value might be at right half
            {
                start = middle + 1;
            }
        }

        return -1;
    }

}
