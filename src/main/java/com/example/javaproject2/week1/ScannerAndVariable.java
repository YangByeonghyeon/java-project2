package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d과(와) %d의 합은 %d입니다.", val1, val2, val1 + val2 );
    }
}
