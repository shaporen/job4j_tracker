package ru.job4j.poly;

public interface Transport {

    double PRICE = 59.80;

    void drive();
    void passengers(int numberOfPass);

    default double refuel(double fuel) {
        return PRICE * fuel;
    }
}
