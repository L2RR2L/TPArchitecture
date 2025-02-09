package com.directi.training.isp.exercise_refactored;

public class Main {
    public static void main(String[] args) {
        Door sensingDoor = new SensingDoor(new Sensor());
        Door timedDoor = new TimedDoor(new Timer());
    }
}
