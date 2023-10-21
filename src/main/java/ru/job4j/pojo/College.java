package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Сергей Шапоренко");
        student.setGroup("Электроэнергетический факультет");
        Date date = new Date(2005, Calendar.SEPTEMBER, 1);
        student.setDateOfReceipt(date);
        System.out.println("Студент " + student.getFullName() + " поступил на " +
                student.getGroup() + " " + student.getDateOfReceipt());
    }
}
