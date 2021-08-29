package com.maxinnetherese;

public class Main {

    public static void main(String[] args) {

        float[] hatdog = new float[20];
        hatdog[5] = 5;
        System.out.println(hatdog[5]);
        int[] numbers = new int[5];
        numbers[0] = 90;
        numbers[1] = 5;
        numbers[2] = 33;
        numbers[3] = 45;
        numbers[4] = 22;

        /*for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }*/

        int index = -1;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==45)
            {
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
