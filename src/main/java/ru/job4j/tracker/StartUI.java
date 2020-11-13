package ru.job4j.tracker;

import java.util.Scanner;
import java.util.Arrays;

public class StartUI {

    public void showMenu() {
        System.out.println("Menu.");
        System.out.println(" ");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println(" ");
    }

    public void init (Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select:");
            int select = Integer.valueOf(scanner.nextLine());

            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All Items ===");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getName());
                }
                System.out.println();
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter id:");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("=== Enter New name ===");
                    String newName = scanner.nextLine();
                    item.setName(newName);
                }
                if (tracker.replace(id, item)) {
                    System.out.println("Item №" + id + " has been sucessfully edited");
                } else {
                    System.out.println("Item is not found");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Enter id:");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    tracker.delete(id);
                    System.out.println("Item №" + id + " has been sucessfully deleted");
                } else {
                    System.out.println("Item is not found");
                }
            } else if (select == 4) {
                System.out.println("=== Find by id ===");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getName());
                } else {
                    System.out.println("Item is not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find by name ===");
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i].getName());
                    }
                } else {
                    System.out.println("Item is not found");
                }
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Enter number from 0 to 6");
            }
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Scanner scanner = new Scanner(System.in);
        new StartUI().init(scanner, tracker);
    }
}
