package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String ssn[] = sc.next().split("-");
        int first = Integer.parseInt(ssn[0]);
        int second = Integer.parseInt((ssn[1]));
        System.out.printf(String.format("%06d", first) + String.format("%07d", second));*/
        String ssn = sc.next();
        System.out.println(ssn.substring(0, 6) + ssn.substring(7, 14));
    }
}
