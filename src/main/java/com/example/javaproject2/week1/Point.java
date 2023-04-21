package com.example.javaproject2.week1;

public class Point {
    //private int x;
    //private int y;
    int x;
    int y;
    boolean isSameXy() {
        return x == y;
    }
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
