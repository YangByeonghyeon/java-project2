package com.example.javaproject2.week5;

import java.util.Arrays;

public class Stack4 {
    private int[] arr = new int[10000];
    private int pointer = 0;
    /*public Stack1(int size) {
        this.arr = new int[size];
    }*/
    public int peek() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }
    public boolean isEmpty() {
        return this.pointer == 0;
    }
    public int pop() {
        /*int temp = this.arr[pointer - 1];
        pointer--;
        return temp;*/
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer]; //리팩토링
    }
    public void push(int value) {
        this.arr[pointer++] = value;
        //System.out.println(Arrays.toString(arr));
        //System.out.println("pointer = " + pointer);
    }
    public static void main(String[] args) {
        Stack4 st4 = new Stack4();
        st4.push(10);
        System.out.println(st4.peek());
        st4.push(20);
        System.out.println(st4.peek());
        /*System.out.println(st4.pop());
        System.out.println(st4.isEmpty());
        System.out.println(st4.pop());
        System.out.println(st4.isEmpty());
        System.out.println(st4.pop());*/
        st4.pop();
        System.out.println(st4.peek());
        st4.pop();
        System.out.println(st4.peek());
    }
}
