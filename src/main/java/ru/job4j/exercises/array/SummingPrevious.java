package ru.job4j.exercises.array;

import java.util.Arrays;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int size = 2;
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int i = 2; i < n; i++) {
            int j = i;
            int sum = 0;
            while (j != 0) {
                sum += array[j];
                j--;
            }
            array[size++] = sum;
        }
        return Arrays.copyOf(array, size);
    }

    public static void main(String[] args) {
        int [] array = calculate(1,2,5);
        for (int arr : array) {
            System.out.println(arr);
        }
    }
}
