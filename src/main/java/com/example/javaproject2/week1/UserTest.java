package com.example.javaproject2.week1;

public class UserTest {
    public static void main(String[] args) {
        User ybh = new User();
        ybh.name = "양병현";
        ybh.phoneNumber = "010-1234-1234";
        ybh.age = 28;

        User bhy = new User();
        bhy.name = "병현양";
        bhy.phoneNumber = "010-5678-5678";
        bhy.age = 29;

        System.out.printf("%s님은 성인입니까? %s\n", ybh.name, ybh.isAdult());
        System.out.printf("%s님은 성인입니까? %s", bhy.name, bhy.isAdult());
    }
}
