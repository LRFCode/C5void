package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int count = 1;

        while (count <= 10)
        {
            sayHelloWorld();
            count = count + 1;
        }
    }

    private static void sayHelloWorld()
    {
        System.out.println("Hello, world!");
    }
}
