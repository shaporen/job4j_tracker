package ru.job4j.tracker;

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

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void allItems(Tracker tracker) {
        System.out.println("=== All Items ===");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName());
        }
        System.out.println();
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = Integer.valueOf(input.askStr("Enter id:"));
        String newName = input.askStr("=== Enter New name ===");
        Item item = new Item(newName);
        if (tracker.replace(id, item)) {
            System.out.println("Item №" + id + " has been sucessfully edited");
        } else {
            System.out.println("Item is not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = Integer.valueOf(input.askStr("Enter id:"));
        if (tracker.delete(id)) {
            System.out.println("Item №" + id + " has been sucessfully deleted");
        } else {
            System.out.println("Item is not found");
        }
    }

    public static void findID(Input input, Tracker tracker) {
        System.out.println("=== Find by id ===");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName());
        } else {
            System.out.println("Item is not found");
        }
    }

    public static void findName(Input input, Tracker tracker) {
        System.out.println("=== Find by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getName());
            }
        } else {
            System.out.println("Item is not found");
        }
    }

    public void init (Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findID(input, tracker);
            } else if (select == 5) {
                StartUI.findName(input, tracker);
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Enter number from 0 to 6");
            }
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        new StartUI().init(input, tracker);
    }
}
