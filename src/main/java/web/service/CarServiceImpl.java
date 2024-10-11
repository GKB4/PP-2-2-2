package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getNumberOfCars(int number) {
        return number >= 5 ? Car.getCars() : Car.getCars().subList(0, number);
    }
}
