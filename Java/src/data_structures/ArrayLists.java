package data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("Create an ArrayList of strings and add elements to it");
        ArrayList<String> cars = new ArrayList<>();
        // Can also initialize with this: ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Ford");
        System.out.println("cars: " + cars);

        System.out.println();

        System.out.println("Accessing an item");
        System.out.println("cars.get(0): " + cars.get(0));

        System.out.println();

        System.out.println("Change an item");
        System.out.println("Change BMW to Chevy");
        cars.set(0, "Chevy");
        System.out.println("cars.get(0): " + cars.get(0));

        System.out.println();

        System.out.println("Remove an item at an index");
        cars.remove(0);
        System.out.println("cars: " + cars);

        System.out.println();

        System.out.println("Remove all items from an ArrayList");
        cars.clear();
        System.out.println("cars:" + cars);

        System.out.println();

        System.out.println("Get the size of an ArrayList");
        System.out.println("cars.size(): " + cars.size());

        System.out.println();

        System.out.println("Sorting an ArrayList of integers");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(11);
        numbers.add(9);
        numbers.add(3498);
        numbers.add(1);
        System.out.println("numbers: " + numbers);
        // By default, Collections.sort sorts numbers in ascending order
        Collections.sort(numbers);
        System.out.println("numbers: " + numbers);

        System.out.println();

        System.out.println("Sorting an ArrayList of strings");
        ArrayList<String> names = new ArrayList<>();
        names.add("Sally");
        names.add("Bill");
        names.add("Charlie");
        System.out.println("names: " + names);
        // By default, Collections.sort sorts strings in ascending alphabetical order
        Collections.sort(names);
        System.out.println("names: " + names);
    }
}
