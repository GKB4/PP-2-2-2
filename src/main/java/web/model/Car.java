package web.model;

import java.util.List;

public class Car {
    private String model;
    private String color;
    private int year;
    private static List<Car> cars = List.of(new Car("VAZ", "White", 1986),
            new Car("GAZ", "Black", 1987),
            new Car("UAZ", "Green", 1988),
            new Car("Moskvich", "Yellow", 1989),
            new Car("ZAZ", "Blue", 1990));

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

    public static void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color + ", year=" + year + '}';
    }
}
