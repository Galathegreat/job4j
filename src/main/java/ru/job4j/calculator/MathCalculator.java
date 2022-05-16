package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumAllMethods(double first, double second) {
        return multiply(first, second)
                + sum(first, second)
                + sub(first, second)
                + div(first, second);
    }

        public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumAllMethods(10, 20));
            System.out.println("Результат расчета равен: " + subAndDiv(10, 20));
        }
    }
