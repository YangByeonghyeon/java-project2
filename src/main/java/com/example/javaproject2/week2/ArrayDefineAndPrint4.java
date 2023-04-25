package com.example.javaproject2.week2;

import java.util.Arrays;

public class ArrayDefineAndPrint4 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};
        System.out.printf("%d %d %d %d\n", iArr[0], iArr[1], iArr[2], iArr[3]);
        System.out.println(Arrays.toString(iArr));
    }
}
