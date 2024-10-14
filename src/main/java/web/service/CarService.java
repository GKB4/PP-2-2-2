package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> makeListOfCars();

    List<Car> getNumberOfCars(int number);
}
