package com.example.javaproject2.week1;

public class Point {
    //private int x;
    //private int y;
    int x;
    int y;
    boolean isSameXy() {
        return x == y;
    }
    double getDistance(Point p2) { // 두 점 사이 거리 구하기 메소드
        int xL = p2.x - this.x;
        int yL = p2.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
