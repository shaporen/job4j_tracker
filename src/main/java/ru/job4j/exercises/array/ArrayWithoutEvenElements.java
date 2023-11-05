package ru.job4j.exercises.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int size = 0;
        int[] array = new int[data.length];
        for (int a : data) {
            if (a % 2 != 0) {
                array[size++] = a;
            }
        }
        return Arrays.copyOf(array, size);
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rsl = ArrayWithoutEvenElements.changeData(data);
        for (int a : rsl) {
            System.out.println(a);
        }
    }
}
