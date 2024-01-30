package ru.job4j.exercises.condition;

public class Task61 {
    public static void hasEqualDigits(int number) {
        int num1 = number / 100;
        int num2 = number % 100 / 10;
        int num3 = number % 10;
        if (num1 == num2 && num3 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        hasEqualDigits(333);
    }
}
