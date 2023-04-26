package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.printf("%d\n", val1 + val2);
        System.out.printf("%d\n", val1 - val2);
        System.out.printf("%d\n", val1 * val2);
        System.out.printf("%d\n", val1 / val2);
        System.out.printf("%d\n", val1 % val2);

        float val3 = (float)val1;
        System.out.printf("%.2f", val3 / val2);
    }
}
