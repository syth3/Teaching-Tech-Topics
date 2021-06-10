package object_oriented_programming.classes;

import java.util.Objects;

public class Car {
    //defining field of the class which act as characteristics of the class car
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;

    //Constructor for an object car
    public Car(String make, String model, String color, int year, double mpg) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mpg = mpg;
    }
    //defining getters & setters (Methods)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year
                && Objects.equals(make, car.make)
                && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mpg=" + mpg +
                '}';
    }
}
