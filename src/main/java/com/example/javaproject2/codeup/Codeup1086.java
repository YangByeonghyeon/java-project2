package com.example.javaproject2.codeup;

import java.io.*;

public class Codeup1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");

        int w = Integer.parseInt(numbers[0]);
        int h = Integer.parseInt(numbers[1]);
        int b = Integer.parseInt(numbers[2]);

        double mb = w * h * b;
        mb = mb / 8 / 1024 / 1024;

        bw.write(String.format("%.2f MB", mb));
        bw.flush();
        bw.close();
    }
}
