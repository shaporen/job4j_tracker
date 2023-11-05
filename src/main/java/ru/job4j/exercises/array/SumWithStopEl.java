package ru.job4j.exercises.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int cnt = 0;
        for (int i = 0; data[i] < el; i++) {
            cnt += data[i];
        }
        return cnt % 2 != 0 ? 0 : cnt;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(count(data, 5));
    }
}
