package ru.job4j.condition;

public class ChessBoard {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        rsl = Math.abs(x2 - x1);
        return rsl;
    }
}
