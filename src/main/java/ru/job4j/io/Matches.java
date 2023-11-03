package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            boolean move = matches >= 1 && matches <= 3;
            if (count >= matches) {
                if (move) {
                    count -= matches;
                    turn = !turn;
                } else {
                    System.out.println(player
                            + ", введенное число выходит из диапазона возможных (1-3)");
                }
            } else {
                System.out.println(player + ", введенное число больше остатка");
            }
            System.out.println("Осталось спичек: " + count);
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
