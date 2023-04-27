package com.example.javaproject2.week2;

public class IncreaseOperator {
    public static void main(String[] args) {
        int i = 10;
        // ++가 앞에 오는 경우
        //System.out.println(i++); // i += 1; 동일, 출력값 10

        // ++가 뒤에 오는 경우
        //System.out.println(++i); // 출력값 11

        // --가 뒤에 오는 경우 --> 은행에서 빌린 돈, 출력값 10
        //System.out.println(i--);

        // --가 앞에 오는 경우 --> 사채에서 빌린 돈, 출력값 9
        System.out.println(--i);
        System.out.println(i);
    }
}
