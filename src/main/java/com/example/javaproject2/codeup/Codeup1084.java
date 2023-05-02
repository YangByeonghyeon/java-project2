package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer token = new StringTokenizer(input);
        int red = Integer.parseInt(token.nextToken());
        int gre = Integer.parseInt(token.nextToken());
        int blu = Integer.parseInt(token.nextToken());
        int cnt = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < red; i++) {
            for(int j = 0; j < gre; j++) {
                String line = "";
                for(int k = 0; k < blu; k++) {
                    line += i + " " + j + " " + k + "\n";
                    //bw.write(i + " " + j + " " + k + "\n");
                    cnt++;
                }
                bw.write(line);
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
