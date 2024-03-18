package ru.job4j.exercises.condition;

public class Task65 {
    public static void season(int number) {
        if (number < 1 || number > 12) {
            System.out.println("Не является месяцем");
        } else {
            if (number <= 2 || number >= 12) {
                System.out.println("Зима");
            } else if (number <= 5) {
                System.out.println("Весна");
            } else if (number <= 8) {
                System.out.println("Лето");
            } else {
                System.out.println("Осень");
            }
        }
    }

    public static void main(String[] args) {
        season(2);
    }
}
