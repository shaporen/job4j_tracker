package ru.job4j.exercises.condition;

public class Task20 {
    public static void numCheck(int number) {
        boolean a = number % 2 == 0;
        int z = number - number % 10;
        boolean b = ((z / 10) % 2) == 0;
        int y = number - number % 100;
        boolean c = ((y / 100)) % 2 == 0;
        if (a && b && c) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        numCheck(808);
    }
}
