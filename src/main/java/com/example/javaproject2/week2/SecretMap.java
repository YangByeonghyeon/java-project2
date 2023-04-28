package com.example.javaproject2.week2;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]); // OR 연산을 수행한 결과를 이진수 문자열로 변환
            str = String.format("%" + n + "s", str); // 자릿수를 맞추기 위해 왼쪽에 0으로 채워진 공백 추가
            str = str.replaceAll("1", "#"); // 1을 #으로 대체
            str = str.replaceAll("0", " "); // 0을 공백으로 대체
            result[i] = str;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer = solution(n, arr1, arr2);

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
}


