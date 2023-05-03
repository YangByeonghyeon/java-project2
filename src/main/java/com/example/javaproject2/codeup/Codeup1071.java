package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int val = sc.nextInt();
            if (val != 0) {
                System.out.println(val);
            }
            else break;
        }
    }*/
    // do while문 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            if(num == 0) break;
            System.out.println(num);
        } while(num != 0);
    }
}
