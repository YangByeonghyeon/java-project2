package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }
        System.out.println(cnt == 0 ? "prime" : "not prime");
    }
}
