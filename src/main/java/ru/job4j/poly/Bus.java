package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int numberOfPass) {
        System.out.println("В автобусе " + numberOfPass + " пассажиров");
    }
}
