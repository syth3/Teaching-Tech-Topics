package data_structures;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        System.out.println("Create a HashMap and place values in it");
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("capitalCities: " + capitalCities);

        System.out.println();

        System.out.println("Access an item in a HashMap");
        System.out.println("capitalCities.get(\"USA\"): " + capitalCities.get("USA"));

        System.out.println();

        System.out.println("Removing an item from a HashMap");
        capitalCities.remove("England");
        System.out.println("capitalCities: " + capitalCities);

        System.out.println();

        System.out.println("Clearing a HashMap");
        capitalCities.clear();
        System.out.println("capitalCities: " + capitalCities);

        System.out.println();

        System.out.println("Getting the size of a HashMap");
        System.out.println("capitalCities.size(): " + capitalCities.size());

        System.out.println();

        System.out.println("Making a HashMap with different types");
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        System.out.println(people);
    }
}
