package ru.job4j.exercises.condition;

public class Task32 {
    public static void evenAmount(int number) {
        int counter;
        int num1 = (number % 10) % 2;
        int num2 = (number / 10) % 2;
        if (num1 == 0 && num2 == 0) {
            counter = 2;
        } else if (num1 == 0 || num2 == 0) {
            counter = 1;
        } else {
            counter = 0;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenAmount(16);
    }
}
