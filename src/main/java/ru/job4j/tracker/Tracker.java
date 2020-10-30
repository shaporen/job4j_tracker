package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id)
                rsl = index;
            break;
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean valid = index != -1;
        if (valid) {
            item.setId(id);
            items[index] = item;
        }
        return valid;
    }

    public boolean delete(int id) {
        boolean valid = indexOf(id) != -1;
        int index = indexOf(id);
        if (valid) {
            if (index != size - 1) {
                System.arraycopy(items, index + 1, items, index, size - index);
            }
            items[size - 1] = null;
            size--;
        }
        return valid;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                rsl[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}