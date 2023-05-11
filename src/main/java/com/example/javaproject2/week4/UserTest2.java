package com.example.javaproject2.week4;

public class UserTest2 {
    public static void main(String[] args) {
        User2 user1 = new User2();
        user1.setName("김미미");
        user1.setAge(14);

        User2 user2 = new User2();
        user2.setName("김나나");
        user2.setAge(37);

        System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());
    }
}
