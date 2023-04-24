package com.example.javaproject2.week2;

public class FloatDigit {
    public static void main(String[] args) {
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10;

        System.out.printf("f8: %f\n", f8);
        System.out.printf("f9: %f\n", f9);
        System.out.printf("f10: %f\n", f10);

        System.out.println("f8: " + f8);
        System.out.println("f9: " + f9);
        System.out.println("f10: " + f10); // double을 사용하면 정상출력
        System.out.println("d10: " + d10);

        float f1 = 3.141592653589793f; // 뒤에 f를 붙이면 에러는 안나지만 출력해보면 잘린다. (7자리 초과하면 반올림)
        System.out.println(f1);
    }
}
