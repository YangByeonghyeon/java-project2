package com.example.javaproject2.week4;

public class PrintStarUtils {
    public static String makePyramidLine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(height - i - 1), "*".repeat(2 * i + 1));
    }
}
