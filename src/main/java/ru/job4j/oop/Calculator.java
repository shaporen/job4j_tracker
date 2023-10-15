package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multyply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumallOperation(int c) {
        return sum(c) + minus(c) + multyply(c) + divide(c);
    }

    public static void main(String[] args) {
        int resultOne = sum(5);
        System.out.println(resultOne);
        int resultTwo = minus(10);
        System.out.println(resultTwo);
        Calculator calculator = new Calculator();
        int resultThree = calculator.multyply(5);
        System.out.println(resultThree);
        int resultFour = calculator.divide(15);
        System.out.println(resultFour);
        int resultFive = calculator.sumallOperation(20);
        System.out.println(resultFive);
    }
}
