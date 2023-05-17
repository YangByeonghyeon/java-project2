package com.example.javaproject2.week5;

import java.util.Arrays;

public class Stack3 {
    private int[] arr = new int[10000];
    private int pointer = 0;
    /*public Stack1(int size) {
        this.arr = new int[size];
    }*/
    public boolean isEmpty() {
        return this.pointer == 0;
    }
    public int pop() {
        /*int temp = this.arr[pointer - 1];
        pointer--;
        return temp;*/
        return this.arr[--pointer]; //리팩토링
    }
    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer = " + pointer);
    }
    public static void main(String[] args) {
        Stack3 st3 = new Stack3();
        st3.push(10);
        st3.push(20);
        System.out.println(st3.pop());
        System.out.println(st3.isEmpty());
        System.out.println(st3.pop());
        System.out.println(st3.isEmpty());
    }
}
