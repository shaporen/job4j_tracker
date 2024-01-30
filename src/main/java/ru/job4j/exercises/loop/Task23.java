package ru.job4j.exercises.loop;
import java.util.*;
public class Task23 {
    public static void loop(int num) {
        int count = 5;
        int num1 = num + 1;
        StringJoiner joiner = new StringJoiner(" ");
        while (count > 0) {
            joiner.add(Integer.toString(num1));
            count--;
            num1++;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(25);
    }
}
