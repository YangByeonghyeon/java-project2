package com.example.javaproject2.week2;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void fillARow(int[][] arr, int rowNum) {
        arr[rowNum][0] = 1;
        arr[rowNum][1] = 1;
        arr[rowNum][2] = 1;
        arr[rowNum][3] = 1;
        arr[rowNum][4] = 1;
        printTwoDimArr(arr);
    }
    public static void printTwoDimArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        /*arr[2][0] = 1; // 2행 0열에 값 할당
        arr[2][1] = 1; // 2행 1열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[2][3] = 1; // 2행 3열에 값 할당
        arr[2][4] = 1; // 2행 4열에 값 할당*/

        /*System.out.println(Arrays.toString(arr[0])); // 행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));*/

        fillARow(arr, 1);
        fillARow(arr, 2);
    }
}
