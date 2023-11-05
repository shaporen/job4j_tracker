package ru.job4j.exercises.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int count = 0;
        int sum = n;
        while (n >= d) {
            n = n - d;
            count++;
        }
        return sum - d * count;
    }

    public static void main(String[] args) {
        System.out.println(mod(0,3));
    }
}
