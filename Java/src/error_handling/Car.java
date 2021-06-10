package error_handling;

import java.util.Calendar;
import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;

    public Car(String make, String model, String color, int year, double mpg) throws BadYearException {
        this.make = make;
        this.model = model;
        this.color = color;
        this.mpg = mpg;
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        if (year > current_year) {
            throw new BadYearException(year);
        } else {
            this.year = year;
        }
    }

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
