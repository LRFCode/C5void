package com.company;

public class Main
{
    public static void main(String[] args)
    {
        printSum(4, 6);
        printSum(7, 2);

        printStudentStatus(true);
        printStudentStatus(false);

        printTotal(1,2,3,4,5);
        printTotal(5,10,3,4,5);
    }

    private static void printSum(int a, int b)
    {
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
    }

    private static void printTotal(int a, int b, int c, int d, int e)
    {
        System.out.println(a + b + c + d + e);
    }

    private static void printStudentStatus(boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }
}
