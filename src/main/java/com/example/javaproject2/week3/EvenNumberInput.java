package com.example.javaproject2.week3;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("짝수를 입력하세요.");
            num = sc.nextInt();
        } while(num % 2 != 0);
        System.out.printf("올바른 짝수가 입렸됐습니다. num: %d", num);
    }
}
