package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.printf(String.format("%04d", year) + "." + String.format("%02d", month) + "." + String.format("%02d", day));
    }
}
