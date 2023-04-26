package com.example.javaproject2.codeup;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char cVal = sc.next().charAt(0);
        cVal++;
        System.out.println(cVal);

        /*InputStreamReader isr = new InputStreamReader(System.in);
        char c2 = (char) (isr.read() + 1); // 읽은 아스키코드에 +1을 하고 char로 강제 변경
        System.out.println(c2);*/
    }
}
