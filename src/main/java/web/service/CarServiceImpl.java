package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> makeListOfCars() {
        Car.addCar("VAZ", "White", 1986);
        Car.addCar("GAZ", "Black", 1987);
        Car.addCar("UAZ", "Green", 1988);
        Car.addCar("Moskvich", "Yellow", 1989);
        Car.addCar("ZAZ", "Blue", 1990);
        return Car.getCars();
    }

    @Override
    public List<Car> getNumberOfCars(int number) {
        if (Car.getCars().isEmpty()) {
            makeListOfCars();
        }
        return number >= 5 ? Car.getCars() : Car.getCars().subList(0, number);

    }
}
