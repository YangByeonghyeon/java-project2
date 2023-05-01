package com.example.javaproject2.week3;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "월";
        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30~18:30";
            case "토" -> "09:30~13:00";
            case "수" -> "휴진";
            default -> throw new IllegalArgumentException("진료날이 아닙니다." + day);
        };
        System.out.printf("%s요일은 %s입니다.", day, time);
        // -> 타입 추론
    }
}
