package com.example.javaproject2.codeup;

import java.io.*;

public class Codeup1278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(num > 0) {
            num = num / 10;
            cnt++;
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}
