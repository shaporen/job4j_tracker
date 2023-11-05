package ru.job4j.exercises.array;

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        int first = 0;
        int second = 0;
        for (int aa : a) {
            first++;
        }
        for (int bb : b) {
            second++;
        }
        return first + second;
    }

    public static void main(String[] args) {
        int[] a = {5, -2, 6};
        int[] b = {5, -2, 6, 0};
        System.out.println(combineSize(a, b));
    }
}
