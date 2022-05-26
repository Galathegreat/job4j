package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        ivan = ivan * 3;
        nik = nik * 2;
        System.out.println(month);
        while (ivan >= nik) {
            month += 1;
        }
        return month;
    }
}