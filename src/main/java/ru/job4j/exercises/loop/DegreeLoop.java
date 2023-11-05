package ru.job4j.exercises.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl = rsl * a;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 2));
    }
}
