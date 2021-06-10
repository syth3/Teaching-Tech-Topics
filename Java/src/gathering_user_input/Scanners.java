package gathering_user_input;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        System.out.println("Creating a scanner object and initializing it with an input");
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Gathering input of type string");
        System.out.print("Please enter a string: ");
        String string_input = scanner.nextLine();
        System.out.println("You entered in the following: " + string_input);

        System.out.println();

        System.out.println("Gathering input of type int");
        System.out.print("Please enter an int: ");
        int int_input = scanner.nextInt();
        System.out.println("You entered in the following: " + int_input);

        System.out.println();

        System.out.println("Gathering input of type double");
        System.out.print("Please enter a double: ");
        double double_input = scanner.nextDouble();
        System.out.println("You entered in the following: " + double_input);

        System.out.println();

        System.out.println("Gathering an array of ints");
        int[] int_array_input = new int[5];

        for(int i = 0; i < int_array_input.length; i++) {
            System.out.print("Enter an int: ");
            int_array_input[i] = scanner.nextInt();
        }
        System.out.println("You entered in the following numbers:");
        for (int element : int_array_input) {
            System.out.println(element);
        }

        System.out.println();

        System.out.println("Gathering an int then a string");
        System.out.print("Please enter an int: ");
        int int_before_string = scanner.nextInt();
        // The line below is needed to consume the newline character nextInt() leaves behind
        scanner.nextLine();
        System.out.print("Please enter a string: ");
        String string_after_int = scanner.nextLine();
        System.out.println("The int you entered in: " + int_before_string);
        System.out.println("The string you entered in: " + string_after_int);

        System.out.println();

        System.out.println("Gathering two ints");
        System.out.print("Enter an in: ");
        int firstInt = scanner.nextInt();
        // Notice: we don't need a line here gathering the next line to skip over a newline character
        // This is because nextInt skips ahead until it sees an int. That means it skips over the newline character
        System.out.print("Enter an in: ");
        int secondInt = scanner.nextInt();
        System.out.println("test: " + firstInt + " test2: " + secondInt);

        System.out.println();

        System.out.println("Close the scanner");
        scanner.close();
    }
}
