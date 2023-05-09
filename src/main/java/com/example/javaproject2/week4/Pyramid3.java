package com.example.javaproject2.week4;

public class Pyramid3 {
    public static int h = 4;
    public static String makeALine(int h, int i) {
        return String.format("%s%s", "0".repeat(i), "*".repeat(h - i));
    }
    public static void main(String[] args) {
        for (int i = 0; i < h; i++) {
            System.out.println(makeALine(h, i));
        }
    }
}
