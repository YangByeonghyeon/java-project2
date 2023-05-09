package com.example.javaproject2.week4;

public class PyramidStar2 {
    private String spaceChar = "0";
    /*public void printPyramidWithSpaceChar(int height, String spaceChar) {
        // 기능이 3가지
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }*/
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }
    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        // 기능이 3가지
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public PyramidStar2(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("공백개수: %d 별개수: %d\n", height - i - 1, 2 * i + 1);
            System.out.printf("%s%s\n", /*"0"*/spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }
    public static void main(String[] args) {
        /*PyramidStar2 pyramidStar2 = new PyramidStar2();
        int height = 4;
        pyramidStar2.printPyramid(height);*/
        PyramidStar2 pyramidStar2 = new PyramidStar2(" ");
        PyramidStar2 pyramidSpaceZero = new PyramidStar2("0");
        pyramidStar2.printPyramid(4);
        pyramidStar2.printPyramidWithSpaceChar(4,"%");
        pyramidSpaceZero.printPyramid(5);
    }
}
