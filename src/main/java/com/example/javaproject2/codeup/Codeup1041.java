package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cVal = sc.next().charAt(0);
        int iVal = (int)cVal + 1;
        char nextVal = (char)iVal;
        System.out.println(nextVal);
    }
}
