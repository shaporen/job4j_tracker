package ru.job4j.stream;

import java.util.stream.*;

public class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream
                .flatMap(p -> Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(),
                                p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(),
                                p.getPrice() - (int) (p.getPrice() * 0.1))
                ))
                .forEach(System.out::println);
    }
}
