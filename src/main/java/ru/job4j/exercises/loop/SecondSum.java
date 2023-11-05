package ru.job4j.exercises.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sm = 0;
        for (int i = a; i <= b; i = i + 2) {
            sm += i;
        }
        return sm;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 3));
    }
}
