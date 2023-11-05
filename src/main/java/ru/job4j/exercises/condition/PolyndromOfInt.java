package ru.job4j.exercises.condition;

public class PolyndromOfInt {
    public static void isPalindrome(int number) {
        String isP = Integer.toString(number);
        int dl = isP.length();
        int count = 0;
        for (int i = 0; i < dl / 2; i++) {
            if (isP.charAt(i) != isP.charAt(dl - 1 - i)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }

    public static void main(String[] args) {
        isPalindrome(53235);
    }
}
