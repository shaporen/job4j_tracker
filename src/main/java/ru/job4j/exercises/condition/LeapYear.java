package ru.job4j.exercises.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else return (year % 4 == 0) && (year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println(checkYear(2020));
    }
}
