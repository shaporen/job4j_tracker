package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        return indexOf(id) != -1 ? items[indexOf(id)] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[counter] = items[i];
                counter++;
            }
        }
        return Arrays.copyOf(rsl, counter);
    }

    public boolean replace(int id, Item item) {
        boolean rsl = indexOf(id) != -1;
        if (rsl) {
            item.setId(id);
            items[indexOf(id)] = item;
        }
        return rsl;
    }

    public void delete(int id) {
        boolean rsl = indexOf(id) != -1;
        if (rsl) {
            System.arraycopy(items, indexOf(id) + 1, items, indexOf(id), size - 1 - indexOf(id));
            items[size - 1] = null;
            size--;
        }
    }
}