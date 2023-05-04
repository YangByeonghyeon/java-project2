package com.example.javaproject2.week3;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        // 최대값 구하기
        int targetValue = 0;

        for(int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if(targetValue < arr[i]) {
                targetValue = arr[i];
            }
        }
        System.out.println(targetValue);
    }
}
