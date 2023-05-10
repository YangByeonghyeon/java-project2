package com.example.javaproject2.week4;

public class PyramidShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        //return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1)); // 피라미드
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(h)); // 평행사변형
    }
}
