package com.directi.training.srp.exercise_refactored;

import com.directi.training.srp.exercise_refactored.manager.CarManager;

public class Main {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        System.out.println(carManager.getCarNames());
        System.out.println(carManager.getBestCar().getBrand() + " " + carManager.getBestCar().getModel());
    }
}
