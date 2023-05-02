package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i]);
            for(int j = 1; j < arr.length - i; j++) {
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
