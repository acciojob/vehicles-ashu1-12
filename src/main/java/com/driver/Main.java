package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 30);
        mercedes.accelerate(20);
        mercedes.changeSpeed(60,80);
        mercedes.accelerate(-60);
    }
}