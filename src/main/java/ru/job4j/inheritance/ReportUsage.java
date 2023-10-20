package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport reportOne = new TextReport();
        HtmlReport reportTwo = new HtmlReport();
        JSONReport reportThree = new JSONReport();
        String textOne = reportOne.generate("Report's name", "Report's body");
        System.out.println(textOne);
        String textTwo = reportTwo.generate("Report's name", "Report's body");
        System.out.println(textTwo);
        String textThree = reportThree.generate("Report's name", "Report's body");
        System.out.println(textThree);
    }
}
