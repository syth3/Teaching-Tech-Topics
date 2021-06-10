package error_handling;

public class Driver_Car {
    public static void main(String[] args) {
        System.out.println("Simulate a checked exception");
        try {
            Car my_car = new Car("Honda", "Civic", "blue", 2022, 35);
        } catch (BadYearException e) {
            System.out.println("Class of exception e: " + e.getClass());
            e.printStackTrace();
        } finally {
            System.out.println("Checked exception: Finally block always runs");
        }
    }
}
