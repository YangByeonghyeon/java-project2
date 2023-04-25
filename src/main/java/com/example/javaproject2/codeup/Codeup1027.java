package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("\\.");
        int year = Integer.parseInt(arr[0]);
        int mon = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        System.out.printf("%02d" + "-" + "%02d" + "-" + "%04d", day, mon, year);
    }
}
