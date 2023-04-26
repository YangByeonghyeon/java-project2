package com.example.javaproject2.week2;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount = likeCount + 1;
        System.out.println(likeCount);

        likeCount = likeCount + 1;
        System.out.println(likeCount);

        likeCount = likeCount - 1;
        System.out.println(likeCount);

        int myAccount = 1_000_000;

        myAccount = myAccount - 500_000;
        System.out.println(myAccount);

        myAccount = myAccount + 4_000_000;
        System.out.println(myAccount);
    }
}
