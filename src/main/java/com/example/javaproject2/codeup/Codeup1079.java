package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            char val = sc.next().charAt(0);
            if (val == 'q') {
                System.out.println(val);
                break;
            }
            System.out.println(val);
        }
    }
}
