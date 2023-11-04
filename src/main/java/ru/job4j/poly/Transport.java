package ru.job4j.poly;

public interface Transport {

    double price = 59.80;

    void drive();
    void passengers(int numberOfPass);

    default double refuel(double fuel) {
        return price * fuel;
    }
}
