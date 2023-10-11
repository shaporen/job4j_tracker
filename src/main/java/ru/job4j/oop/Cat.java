package ru.job4j.oop;

public class Cat {
    private String food;

    private String name;

    public String sound() {
        return "may-may";
    }

    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's name and food");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Barsik");
        gav.show();
        System.out.println("There is black's name and food");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Vasya");
        black.show();
    }
}
