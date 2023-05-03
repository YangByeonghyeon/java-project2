package com.example.javaproject2.week3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int cnt = 0;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(cnt == 0 ? num + "은 소수입니다." : num + "은 소수가 아닙니다.");
    }
}
