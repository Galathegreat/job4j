package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String but = "But I am a newbie";
        idea += but;
        System.out.println(idea);
        int year = 2022;
        System.out.println(year);
        String sep = " ";
        idea += sep + year;
        System.out.println(idea);
    }
}
