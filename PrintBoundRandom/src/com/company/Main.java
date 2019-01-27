package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int count = 1;

        while (count <= 100)
        {
            printRandomNumber(3,10);
            count = count + 1;
        }
    }

    private static void printRandomNumber(int min, int max)
    {
        java.util.Random random = new java.util.Random();

        int numberOfPossibleValues = (max - min) + 1;

        int number = random.nextInt(numberOfPossibleValues);
        number = number + min;

        System.out.println(number);
    }
}
