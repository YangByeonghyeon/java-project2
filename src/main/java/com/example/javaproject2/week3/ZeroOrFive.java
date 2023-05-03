package com.example.javaproject2.week3;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0) {
                System.out.println("나머지가 0이 아닙니다.");
                return false;
            }
            //System.out.printf("remainder: %d\n", remainder % 5);
            num /= 10;
            //cnt++;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 2530;
        int cnt = 0;

        // 메인메소드로만 구현하는 법
        /*String flagText = "0 또는 5로만 이루어진 숫자입니다.";
        while (num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0) {
                System.out.println("나머지가 0이 아닙니다.");
                break;
            }
            //System.out.printf("remainder: %d\n", remainder % 5);
            num /= 10;
            //cnt++;
        }
        System.out.println(flagText);*/

        System.out.printf("%d는 5와 0으로만 구성되었나요? %b", num, isZeroOrFive(num));
    }
}
