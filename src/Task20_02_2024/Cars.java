package Task20_02_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "Black", 2020));
        cars.add(new Car("BMW", "Red", 2015));
        cars.add(new Car("Mercedes", "White", 2010));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.toString());
        }
        Car car1 = new Car("Audi", "Black", 2020);
        Car car2 = new Car("BMW", "Red", 2015);
        System.out.println(car1.compareTo(car2));

        Comparator<Car> compModel = Comparator.comparing(obj -> obj.getModel());
        Comparator<Car> compColor = Comparator.comparing(obj -> obj.getColor());
        Comparator<Car> compAge = Comparator.comparing(obj -> obj.getAge());


    }
}

class Car implements Comparable<Car> {

    private String model;
    private String color;
    private int age;

    public Car(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return o.color.compareTo(this.color);
    }

}

class CompColor implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return 0;
    }
}
