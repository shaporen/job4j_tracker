package ru.job4j.exercises.condition;

public class Task15 {
    public static void multiplyByTwo(int number) {
        if (number > 0) {
            System.out.println(number * 2);
        } else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        multiplyByTwo(10);
    }
}
