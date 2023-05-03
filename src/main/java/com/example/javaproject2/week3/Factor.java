package com.example.javaproject2.week3;

public class Factor {
    public static void main(String[] args) {
        int num = 36;
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.printf("%d ", i);
                sum += i;
            }
        }
        System.out.printf("약수 합은: %d", sum);
    }
}
