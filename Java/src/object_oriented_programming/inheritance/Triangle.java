package object_oriented_programming.inheritance;

import java.util.Objects;

public class Triangle implements Shapes{
    private int length;
    private int height;
    private int sideLength;

    public Triangle(int length, int height, int sideLength) {
        this.length = length;
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public double get_perimeter() { return (this.sideLength*3);}

    @Override
    public double get_area() { return (this.length) * (this.height) * 0.5;}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return length == triangle.length && height == triangle.height && sideLength == triangle.sideLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height, sideLength);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", height=" + height +
                ", sideLength=" + sideLength +
                '}';
    }
}
