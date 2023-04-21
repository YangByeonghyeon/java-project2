package com.example.javaproject2.week1;

public class SpaceInvader {
    private void moveLeft() {
        int location = 0; //지역변수
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    private  void moveRight() {
        int location = 0;
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }
    public static void main(String[] args) {
        SpaceInvader spaceInvader = new SpaceInvader();
        spaceInvader.moveLeft();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
    }
}
