package ru.job4j.exercises.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number / 1000;
        middle = (number / 10) % 100;
        last = number % 10;
        System.out.println(last * 1000 + middle * 10 + first);
    }
}
