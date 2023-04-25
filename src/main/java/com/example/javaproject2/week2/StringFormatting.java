package com.example.javaproject2.week2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "양병현";
        int balance = 20000000;

        String result = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);
        System.out.println(result);
    }
}
