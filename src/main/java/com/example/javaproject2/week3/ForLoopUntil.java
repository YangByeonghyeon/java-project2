package com.example.javaproject2.week3;

public class ForLoopUntil {
    public static void main(String[] args) {
        /*for (int i = 0; true; i++) { // true -> 무한히 증가
            System.out.println(i);
        }*/
        // Math.sqrt() -> 루트 -> 코스트가 커서 잘 안씀
        for (int i = 2; i * i <= 50; i++) {
            System.out.println(i);
        }
    }
}
