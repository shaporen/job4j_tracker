package ru.job4j.exercises.array;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                return false;
            }
        }
        return true;
    }
}
