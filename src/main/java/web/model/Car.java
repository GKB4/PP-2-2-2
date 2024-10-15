package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private int year;
    private static List<Car> cars = new ArrayList<>();

    public Car() {
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<Car> getCars() {
        return cars;
    }

    public static void addCar(String model, String color, int year) {
        cars.add(new Car(model, color, year));
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color + ", year=" + year + '}';
    }
}
