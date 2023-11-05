package ru.job4j.exercises.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        boolean probability = (percent * prize) > pay;
        int a;
        if (probability && (pay - (percent * prize) <= 0)) {
            a = (int) ((percent * prize) - pay);
        } else {
            a = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.9, 1, 2));
    }
}
