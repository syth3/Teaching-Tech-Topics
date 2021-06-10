package error_handling;

public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("Simulate an unchecked exception");
        int numerator = 1;
        int denominator = 0;
        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Class of exception e: " + e.getClass());
            e.printStackTrace();
        } finally {
            System.out.println("Unchecked exception: Finally block always runs");
        }
    }
}
