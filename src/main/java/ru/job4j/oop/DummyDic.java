package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String unknownWord = eng;
        return unknownWord;
    }

    public static void main(String[] args) {
        DummyDic stupid = new DummyDic();
        String word = stupid.engToRus("Unbelievable");
        System.out.println("Неизвестное слово. " + word);
    }
}
