package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book detective = new Book("Ten little negroes", 259);
        Book tales = new Book("Red heat", 90);
        Book novel = new Book("Еired of the sun", 600);
        Book special = new Book("Clean code", 155);
        Book[] books = new Book[4];
        books[0] = detective;
        books[1] = tales;
        books[2] = novel;
        books[3] = special;
        for (Book bks : books) {
            System.out.println("Title: \"" + bks.getName() + "\". Number of pages: " + bks.getNumberOfPages());
        }
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        System.out.println("\n");
        for (Book bks : books) {
            System.out.println("Title: \"" + bks.getName() + "\". Number of pages: " + bks.getNumberOfPages());
        }
        System.out.println("\n");
        for (Book bks : books) {
            if (bks.getName().equals("Clean code")){
                System.out.println("Title: \"" + bks.getName() + "\". Number of pages: " + bks.getNumberOfPages());
            }
        }
    }
}
