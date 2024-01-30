package ru.job4j.exercises.condition;

public class Task58 {
    public static void isWinning(int number) {
        String str = Integer.toString(number);
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < (str.length()) / 2; j++) {
            sum1 += Character.getNumericValue(str.charAt(j));
        }
        for (int k = (str.length()) / 2; k < str.length(); k++) {
            sum2 += Character.getNumericValue(str.charAt(k));
        }
        System.out.println(str.length() / 2);
        System.out.println(sum1);
        System.out.println(sum2);
        if (sum1 == sum2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isWinning(105231);
    }
}
