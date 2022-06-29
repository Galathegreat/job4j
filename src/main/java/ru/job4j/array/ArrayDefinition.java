package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);

        String[] names = new String[4];
        names[0] = "Иван";
        names[1] = "Саша";
        names[2] = "Света";
        names[3] = "Маша";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
    }
}



