package ru.job4j.stream;

import java.util.function.*;

public class FunctionInFunction {
        public static Function<Integer, Integer> square(Function<Integer, Integer> function) {
            return num -> function.apply(num) * function.apply(num);
        }

        public static void main(String[] args) {
            // Функция, возводящая число в квадрат
            Function<Integer, Integer> squareFunction = num -> num * num;

            System.out.println("Result of squareFunction: " + squareFunction.apply(5));

            // Использование функции высшего порядка для возведения числа в квадрат с
            // помощью squareFunction
            Function<Integer, Integer> squared = square(squareFunction);
            System.out.println("Result of squared: " + squared.apply(5));
        }
    }
