package com.example.javaproject2.week2;

public class Collatz_h {
    public static int solution(long num) {
        int answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            if (answer == 500) {  // 500번 이상 계산해도 1이 되지 않는 경우 -1을 리턴합니다.
                return -1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        long num = 626331; // 예시 입력값
        int answer = solution(num);
        System.out.println(answer); // 결과 출력
    }
}
