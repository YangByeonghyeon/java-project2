package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int temp = 23;
        for (int i = 0; i < n; i++) {
            if(temp > arr[i]) {
                temp = arr[i];
            }
        }
        System.out.print(temp);
    }
}
