package com.example.javaproject2.week4;

public class User2 {
    private String name;
    private String phoneNumber; // "01012345678" --> 0없어짐
    private String passWord;
    private int age;
    public User2(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public User2() {

    }

    public String getPassWord() {
        return passWord;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }
    boolean isAdult() {
        return age >= 18;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
