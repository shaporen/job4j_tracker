package ru.job4j.exercises.condition;

public class Task79 {
    public static void getCentury(int number) {
        int num1 = number % 100;
        int num2 = number / 100;
        if (number > 1500 && number <= 2000) {
            if (num1 > 0) {
                System.out.println(num2 + 1);
            } else {
                System.out.println(num2);
            }
        } else {
            System.out.println("Не попадает в диапазон");
        }
    }

    public static void main(String[] args) {
        getCentury(1600);
    }
}
