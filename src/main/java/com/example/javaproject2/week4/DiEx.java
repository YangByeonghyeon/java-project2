package com.example.javaproject2.week4;

public class DiEx {
    private ShapeDrawer shapeDrawer;
    public DiEx() {
    }
    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }
    public void doSth() {
        shapeDrawer.printShape(5);
    }
}
