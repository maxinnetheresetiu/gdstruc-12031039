package com.gdstruc.quiz5;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    int numbers[] = { -56, -29, -6, 13, 20, 21, 41, 80, 92, 98};

        System.out.println(theMaxChimkenMethod(numbers,-6));
        System.out.println(theMaxChimkenMethod(numbers,23));
    }

    public static int theMaxChimkenMethod(int[] input, int value)
    {
        int start = 0;
        int end = input.length -1;

        while(start <= end)
        {
            int randomIndexNumber = (int)((Math.random() * (end - start)) + start);

            if(input[randomIndexNumber] == value)
            {
                return randomIndexNumber;
            }
            else if(value < input[randomIndexNumber]) // Value might be at left half
            {
                end = randomIndexNumber - 1;
            }
            else if(value > input[randomIndexNumber]) // Value might be at right half
            {
                start = randomIndexNumber + 1;
            }
        }

        return -1;
    }
}
