package object_oriented_programming.classes;

public class Driver_My_Math {
    public static void main(String[] args) {
        System.out.println("Using a static method");
        int num_one = 1;
        int num_two = 2;
        int sum = My_Math.add(num_one, num_two);
        System.out.println("The sum of num_one and num_two: " + sum);
    }
}
