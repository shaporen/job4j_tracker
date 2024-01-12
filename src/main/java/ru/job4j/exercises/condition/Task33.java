package ru.job4j.exercises.condition;

public class Task33 {
    public static void evenAmount(int number) {
        int counter = 0;
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        if (num3 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenAmount(624);
    }
}
