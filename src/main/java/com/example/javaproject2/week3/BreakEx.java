package com.example.javaproject2.week3;

public class BreakEx {
    public static void main(String[] args) {
        // i^2 > 50인 i
        for(int i = 0; i < 100; i++) {
            if(i * i > 50) break;
            System.out.println(i);
        }
    }
}
