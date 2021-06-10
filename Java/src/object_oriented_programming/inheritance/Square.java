package object_oriented_programming.inheritance;

import java.util.Objects;

public class Square implements Shapes{
    private int side_length;

    public Square(int side_length) {
        this.side_length = side_length;
    }

    @Override
    public double get_perimeter() {
        return this.side_length * 4;
    }

    @Override
    public double get_area() {
        return Math.pow(this.side_length, 2);
    }

    public int getSide_length() {
        return side_length;
    }

    public void setSide_length(int side_length) {
        this.side_length = side_length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side_length == square.side_length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side_length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side_length=" + side_length +
                '}';
    }
}
