package ru.job4j.exercises.condition;

public class Task54 {
    public static void transform(int number) {
        boolean isEven = number % 2 == 0;
        StringBuilder result = new StringBuilder();

        for (char digit : String.valueOf(Math.abs(number)).toCharArray()) {
            int digitValue = Character.getNumericValue(digit);

            if (isEven) {
                if (digitValue % 2 == 0) {
                    result.append(digitValue == 9 ? digitValue : digitValue + 1);
                } else {
                    result.append(digitValue == 0 ? digitValue : digitValue - 1);
                }
            } else {
                if (digitValue % 2 == 0) {
                    result.append(digitValue == 0 ? digitValue : digitValue - 1);
                } else {
                    result.append(digitValue == 9 ? digitValue : digitValue + 1);
                }
            }
        }
        if (number < 0) {
            System.out.println(Integer.parseInt(result.toString()) * -1);
        } else {
            System.out.println(Integer.parseInt(result.toString()));
        }
    }

    public static void main(String[] args) {
        transform(-900);
    }
}
