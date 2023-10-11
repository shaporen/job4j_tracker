package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error active: " + active);
        System.out.println("Error status: " + status);
        System.out.println("Error status: " + message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        errorOne.printInfo();
        Error errorTwo = new Error(true, 1, "critical system error");
        errorTwo.printInfo();
    }
}
