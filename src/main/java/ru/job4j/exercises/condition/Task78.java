package ru.job4j.exercises.condition;

import java.util.*;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        int num1 = num / 100;
        int num2 = (num % 100) / 10;
        int num3 = (num % 100) % 10;
        boolean one = num1 != 0 && (num % num1 == 0);
        boolean two = num2 != 0 && (num % num2 == 0);
        boolean three = num3 != 0 && (num % num3 == 0);
        StringJoiner joiner = new StringJoiner(" ");
        if (one) {
            joiner.add(Integer.toString(num1));
        }
        if (two) {
            joiner.add(Integer.toString(num2));
        }
        if (three) {
            joiner.add(Integer.toString(num3));
        }
        if (one || two || three) {
            System.out.println(joiner);
        }
        if ((num % num1 != 0) && (num % num2 != 0) && (num % num3 != 0)) {
            System.out.println("Таких чисел нет");
        }
    }

    public static void main(String[] args) {
        divWithoutRemainder(456);
    }
}
