package com.directi.training.srp.exercise_refactored.manager;

import com.directi.training.srp.exercise_refactored.model.Car;
import com.directi.training.srp.exercise_refactored.services.CarComparatorService;
import com.directi.training.srp.exercise_refactored.services.CarFormatterService;

public class CarManager
{
    private final CarFormatterService _carFormatterService;
    private final CarComparatorService _carComparatorService;
    public CarManager(){
        _carFormatterService = new CarFormatterService();
        _carComparatorService = new CarComparatorService();
    }
    public String getCarNames()
    {
        return _carFormatterService.getCarNames();
    }

    public Car getBestCar()
    {
        return _carComparatorService.getBestCar();
    }
}
