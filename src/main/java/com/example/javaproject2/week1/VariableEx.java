package com.example.javaproject2.week1;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal; //선언
        iVal = 0; //초기화

        PrintHello printHello;         //선언
        printHello = new PrintHello(); //초기화

        System.out.println(iVal);
        printHello.print();
    }
}
