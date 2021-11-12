package ru.job4j.tracker.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int p) {
        return x - p;
    }

    public int divide(int d) {
        return x / d;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int z) {
        return sum(z) + minus(z) + divide(z) + multiply(z);
    }


    public static void main(String[] args) {
        Calculator nonStaticSumAll = new Calculator();
        nonStaticSumAll.sumAllOperation(47);
        System.out.println("Result: " + nonStaticSumAll);
    }
}
