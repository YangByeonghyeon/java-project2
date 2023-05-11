package com.example.javaproject2.week4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User2> users = new ArrayList<>();

        User2 user1 = new User2("김미미", "010-1234-1234", 37);
        users.add(user1);
        User2 user2 = new User2("김나나", "010-1234-1235", 14);
        users.add(user2);

        for(User2 user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }
    }
}
