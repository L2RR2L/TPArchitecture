package com.directi.training.srp.exercise_refactored.services;

import com.directi.training.srp.exercise_refactored.model.Car;
import com.directi.training.srp.exercise_refactored.repository.CarRepository;

import java.util.List;

public class CarComparatorService {

    private final CarRepository _carRepository;
    public CarComparatorService()
    {
        _carRepository = new CarRepository();
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        List<Car> cars = _carRepository.findAll();
        for (Car car : cars) {
            if (bestCar == null || compareCars(car, bestCar)) {
                bestCar = car;
            }
        }
        return bestCar;
    }

    private boolean compareCars(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel()) > 0;
    }
}
