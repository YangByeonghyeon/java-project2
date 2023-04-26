package com.example.javaproject2.week2;

import com.example.javaproject2.PrintHello;

import java.util.Arrays;

public class RefrenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student student = new Student(); // new를 써서 Student객체를 인스턴스로

        Student[] students = new Student[30];
        students[0] = new Student(); // Student 클래스의 초기화
        students[0].name = "양병현"; // Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 29;
        students[1] = new Student();
        students[1].name = "병현양";
        students[1].phoneNumber = "010-5678-1234";
        students[1].age = 28;

        System.out.println(Arrays.toString(students));

        /*Object obj = new Student(); // 현대 자바에선 잘 안쓴다.
        Object obj2 = new PrintHello();*/

        // primitive타입은 class가 아니다.
    }

}
