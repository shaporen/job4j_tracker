package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Job4j");
        for (int i = 0; i < 9999; i++) {
            str.append(i);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        str = new StringBuilder("abc");
        str.append("def").append("ghi");
        System.out.println(str);
    }
}
