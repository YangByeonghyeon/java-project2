package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split(":");
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int sec = Integer.parseInt(arr[2]);
        System.out.printf("%d", min);
    }
}
