package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1091 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        long a = Integer.parseInt(arr[0]);
        long m = Integer.parseInt(arr[1]);
        long d = Integer.parseInt(arr[2]);
        long n = Integer.parseInt(arr[3]);

        for(int i = 1; i < n; i++) {
            a = a * m + d;
        }

        bw.write(String.valueOf(a));

        bw.flush();
        bw.close();
        br.close();
    }
}