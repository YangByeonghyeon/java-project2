package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1092 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        long val1 = Integer.parseInt(arr[0]);
        long val2 = Integer.parseInt(arr[1]);
        long val3 = Integer.parseInt(arr[2]);

        for(int i = 1; true; i++) {
           if(i % val1 == 0 && i % val2 == 0 && i % val3 == 0) {
               bw.write(String.valueOf(i));
               break;
           }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
