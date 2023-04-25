package com.example.javaproject2.week2;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int[] iArr = new int[3];
        iArr[0] = 2; // 첫 번째 요소에 2 할당
        iArr[1] = 4; // 두 번째 요소에 4 할당
        iArr[2] = 7; // 세 번째 요소에 7 할당
        System.out.println(Arrays.toString(iArr));
    }
}
