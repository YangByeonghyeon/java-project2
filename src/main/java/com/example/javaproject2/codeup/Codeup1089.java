package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1089 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int n = Integer.parseInt(arr[2]);

        int answer = a + (n-1) * d;

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}
