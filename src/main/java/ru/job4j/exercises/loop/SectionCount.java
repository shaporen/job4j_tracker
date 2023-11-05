package ru.job4j.exercises.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int cnt = 0;
        while (length >= section) {
            length = length - section;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(count(2,1));
    }
}
