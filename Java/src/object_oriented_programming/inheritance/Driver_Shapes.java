package object_oriented_programming.inheritance;

import java.util.ArrayList;

public class Driver_Shapes {
    public static void main(String[] args) {
        System.out.println("Creating all shapes that inherit Shapes");
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(5,6,2);
        System.out.println();

        System.out.println("Getting the perimeter of each shape");
        System.out.println("square.get_perimeter(): " + square.get_perimeter());
        System.out.println("rectangle.get_perimeter(): " + rectangle.get_perimeter());
        System.out.println("triangle.get_perimeter(): " + triangle.get_perimeter());


        System.out.println();

        System.out.println("Getting the area of each shape");
        System.out.println("square.get_area(): " + square.get_area());
        System.out.println("rectangle.get_area(): " + rectangle.get_area());
        System.out.println("triangle.get_area(): " + triangle.get_area());
        System.out.println();

        System.out.println("Playing with polymorphism");
        ArrayList<Shapes> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(rectangle);
        shapes.add(triangle);
        for (Shapes shape : shapes) {
            System.out.println("Current Shape: " + shape);
        }
    }
}
