package ru.job4j.exercises.type;

public class Task34 {
    public int evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number / 1000;
        num2 = (number / 100) % 10;
        num3 = (number % 100) / 10;
        num4 = number % 10;
        int[] array = {num1, num2, num3, num4};
        for (int arr : array) {
            if (arr % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Task34 task34 = new Task34();
        int result = task34.evenAmount(4012);
        System.out.println(result);
    }
}
