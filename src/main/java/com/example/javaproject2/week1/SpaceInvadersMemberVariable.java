package com.example.javaproject2.week1;

public class SpaceInvadersMemberVariable {
    int location; // 멤버변수
    public void moveLeft() {
        location = location -1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() {
        location = location + 1;
        System.out.printf("moveReft: %d\n", location);
    }
    public static void main(String[] args) {
        SpaceInvadersMemberVariable spaceInvadersMemberVariable = new SpaceInvadersMemberVariable();
        spaceInvadersMemberVariable.moveLeft();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveRight();
    }
}
