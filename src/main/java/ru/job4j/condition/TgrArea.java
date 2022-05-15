package ru.job4j.condition;

public class TgrArea {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double area(double a, double b, double c) {
        double rsl = Math.sqrt(3 * (3 - a) * (3 - b) * (3 - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TgrArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}