package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[20][20];

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 1; j <= 19; j++) {
                if (board[x][j] == 0)
                    board[x][j] = 1;
                else
                    board[x][j] = 0;
            }
            for (int j = 1; j <= 19; j++) {
                if (board[j][y] == 0)
                    board[j][y] = 1;
                else
                    board[j][y] = 0;
            }
        }
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
