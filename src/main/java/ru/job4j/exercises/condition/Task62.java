package ru.job4j.exercises.condition;

public class Task62 {
    /**
     * Метод проверят, расположены ли цифры трехзначного числа в порядке возрастания
     * @param number проверямое число
     */
    public static void isRising(int number) {
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        if ((a < b) && (b < c)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isRising(176);
    }
}
