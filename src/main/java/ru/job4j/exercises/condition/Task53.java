package ru.job4j.exercises.condition;

import java.util.*;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 / num2);
        } else {
            if (num1 < num2) {
                System.out.println("Подсчет не производится");
            } else {
                int a = num1 / num2;
                int b = num1 % num2;
                StringJoiner result = new StringJoiner(" ");
                System.out.println(result.add(Integer.toString(a)).add(b + "/" + num2));
            }
        }
    }

    public static void main(String[] args) {
        transformFraction(12, 7);
    }
}
