package com.example.javaproject2.week2;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        boolean isPaymentSuccess = true;
        boolean isBalanceSufficient = false;

        System.out.println("isBalanceSufficient = " + isBalanceSufficient);

        int age = 29;
        boolean isAdult = age >= 18;
        System.out.println("isAdult = " + isAdult);

        boolean isChild = age < 14;
        System.out.println("isChild = " + isChild);
    }
}
