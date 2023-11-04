package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Q7");
        Transport transport = car;
        Object obj = car;
        Object ocar = new Car("Audi", "Q7");
        Car carFromObject = (Car) ocar;
        System.out.println(new Car("Audi", "Q7"));
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
