package ru.job4j.exercises.condition;

public class Task76 {
    public static void sameNumAmount(int num) {
        int a = num % 10;
        int b = ((num - a) / 10) % 10;
        int c = (num - num % 100) / 100;
        if (a == b && b == c) {
            System.out.println(3);
        } else if (a == b || b == c) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        sameNumAmount(333);
    }
}
