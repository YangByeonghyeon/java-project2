package com.example.javaproject2.week2;

public class ParseDouble8Digits {
    public static void main(String[] args) {
        String val1 = "1.11111111"; // 소수점 여덟 자리
        String val2 = "2.11111111"; // 소수점 여덟 자리
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);

        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);
    }
}
