package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int max = 0;
        int val1 = 0;
        int val2 = 0;
        for(int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                arr[row][col] = sc.nextInt();
                if(max < arr[row][col]) {
                    max = arr[row][col];
                    val1 = row;
                    val2 = col;
                }
            }
        }
        System.out.println(max);
        System.out.println(val1 + " " + val2);
    }
}
