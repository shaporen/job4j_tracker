package ru.job4j.exercises.array;

public class Task81 {
    public static int[] array(int[] nums) {
        int[] rsl = {0, 0, 0};
        for (int num : nums) {
            if (num < 0) {
                rsl[0] = rsl[0] + 1;
            }
            if (num == 0) {
                rsl[1] = rsl[1] + 1;
            }
            if (num > 0) {
                rsl[2] = rsl[2] + 1;
            }
        }
        return rsl;
    }
}
