package com.example.javaproject2.week3;

public class SumOfOdds {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for(int i = 0; i < num; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
