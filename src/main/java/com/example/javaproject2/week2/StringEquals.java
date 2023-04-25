package com.example.javaproject2.week2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD"); // 메모리 주소가 같기 때문에 true

        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD --> " + str1.hashCode());
        System.out.println("G --> " + str2.hashCode());

        boolean isSame = str1.substring(0, 1) == str2;
        //boolean isSame = str1.substring(0, 1).equals(str2); --> true

        System.out.println(isSame);
    }
}
