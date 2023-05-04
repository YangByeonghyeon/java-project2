package com.example.javaproject2.programmers;

import java.util.Arrays;

// 소인수분해
public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1];
        //int idx = 0;
        while(n > 1) {
            //System.out.println(n / divisor);
            if(n % divisor == 0) {
                arr[divisor] = divisor;
                n /= divisor;
            }
            else {
                divisor++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        // 0이 아닌 숫자의 개수 O(n)
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                size++;
            }
        }
        // 0이 아닌 숫자를 앞에부터 넣기 O(n)
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }
        // 출력 O(소인수개수)
        for (int i = 0; i < answer.length; i++) System.out.printf("%d ", answer[i]);
    }
}
