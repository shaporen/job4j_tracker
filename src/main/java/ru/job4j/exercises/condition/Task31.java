package ru.job4j.exercises.condition;

public class Task31 {
    public static void numCompare(int num1, int num2) {
        String str1, str2;
        if (num1 < num2) {
            str1 = String.join(" ", Integer.toString(num1), Integer.toString(num2));
            str2 = String.join(" ", Integer.toString(num2), Integer.toString(num1));
        } else {
            str1 = String.join(" ", Integer.toString(num2), Integer.toString(num1));
            str2 = String.join(" ", Integer.toString(num1), Integer.toString(num2));
        }
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) {
        numCompare(2, -1);
    }
}
