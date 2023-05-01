package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.next().charAt(0);
        int val2 = 'a';
        for(int i = val2; i <= val1; i++) {
            System.out.printf("%c ", (char)i);
        }
    }
}
