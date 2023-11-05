package ru.job4j.exercises.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String str = "Operation not support";
        boolean a = number % 3 == 0;
        boolean b = number % 5 == 0;
        if (a && b) {
            str = "Hello, World!!!";
        } else if (a && !b) {
            str = "Hello";
        } else if (!a && b) {
            str = "World";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(14));
    }
}
