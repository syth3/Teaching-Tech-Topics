package object_oriented_programming.classes;

public class Driver_Car {
    public static void main(String[] args) {
        System.out.println("Instantiating an object for our created class");
        Car my_car = new Car("Honda", "Civic", "gray", 2018, 35);
        System.out.println("my_car.toString(): " + my_car.toString());

        System.out.println();

        System.out.println("Changing the color of the car");
        my_car.setColor("red");
        System.out.println("my_car.toString(): " + my_car.toString());

        System.out.println();

        System.out.println("Getting the make and model of the car");
        System.out.println("my_car.getMake(): " + my_car.getMake());
        System.out.println("my_car.getModel(): " + my_car.getModel());

        System.out.println();

        System.out.println("Testing Car objects for equality");
        Car friends_car = new Car("Honda", "Civic", "black", 2018, 33);
        System.out.println("my_car.equals(friends_car): " + my_car.equals(friends_car));
        Car moms_car = new Car("Honda", "CRV", "black", 2019, 28);
        System.out.println("my_car.equals(moms_car): " + my_car.equals(moms_car));

        System.out.println();

        System.out.println("Printing the hashes of each car");
        System.out.println("my_car.hashCode(): " + my_car.hashCode());
        System.out.println("friends_car.hashCode(): " + friends_car.hashCode());
        System.out.println("moms_car.hashCode(): " + moms_car.hashCode());
    }
}
