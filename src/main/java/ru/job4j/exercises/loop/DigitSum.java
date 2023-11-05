package ru.job4j.exercises.loop;

public class DigitSum {
    public static int sum(int num) {
        int sm = 0;
        while (num != 0) {
            sm += num % 10;
            num = num / 10;
        }
        return sm;
    }

    public static void main(String[] args) {
        System.out.println(sum(123456));
    }
}
