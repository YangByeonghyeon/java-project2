package com.example.javaproject2.week4.parser;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\병현\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"), "EUC-KR"));
        System.out.println(br.readLine());
    }
}*/
public class ReadFileEx {
    Charset charset;
    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
    public Hospital parse(String str) {
        System.out.println(str);
        String[] splitted = str.split(",");
        //System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }
    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx readFileEx = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = readFileEx.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = readFileEx.getHospitals(strLines);
        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }
        //System.out.println(parsedHospital.get(0));
        //readFileEx.parse(strLines.get(1));
        /*for (int i = 0; i < 9; i++) {
            System.out.println(result.get(i));
        }*/
    }
}


