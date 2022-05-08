package ru.job4j.calculator;

public class Calculator {
    public static int func1(int x) {
        int y = x;
        return y;
    }

    public static void main(String[] args) {
        int result3 = MathFunc.func1(100);
        System.out.println(result3);
    }
}