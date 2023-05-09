package com.example.javaproject2.week4;

public class MultiplicationTable {
    private String multipleSymbol;
    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }
    public void printDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable("x");
        multiplicationTable.printDan(2);
        multiplicationTable.printDan(5);
        MultiplicationTable multiplicationTable2 = new MultiplicationTable("*");
        multiplicationTable2.printDan(7);
        multiplicationTable2.printDan(8);
    }
}
