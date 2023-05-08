package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1671 {
    public String play(int user, int computer) {
        if (user == 0 && computer == 1) {
            return "win";
        }
        else if (user == 1 && computer == 2) {
            return "win";
        }
        else if (user == 2 && computer == 0) {
            return "win";
        }
        else if (user == computer) {
            return "tie";
        }
        else return "lose";
    }
    public static void main(String[] args) {
        // 0 바위, 1 가위, 2 보
        Codeup1671 codeup1671 = new Codeup1671();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(codeup1671.play(num1, num2));
    }
}
