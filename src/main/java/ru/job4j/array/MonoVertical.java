package ru.job4j.array;

public class MonoVertical {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}


