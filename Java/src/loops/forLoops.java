package loops;

import java.util.*;

public class forLoops {
    public static void main(String[] args) {
        System.out.println("Looping over a range of numbers");
        for(int i=0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        System.out.println();

        System.out.println("For-each loop over an Array");
        String[] names = {"Ted", "James", "Sally"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println("For-each loop over an ArrayList");
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Ford");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println();

        System.out.println("For-each loop over a HashMap");
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        for (String key : capitalCities.keySet()) {
            System.out.println("key: " + key);
        }
        for (String value : capitalCities.values()) {
            System.out.println("value: " + value);
        }
        for (String key : capitalCities.keySet()) {
            System.out.println("key -> value: " + key + " -> " + capitalCities.get(key));
        }

        System.out.println();

        System.out.println("For-each loop over a LinkedList");
        LinkedList<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        for (String letter : letters) {
            System.out.println(letter);
        }

        System.out.println();

        System.out.println("For-each loop over a HashSet");
        HashSet<String> nbaTeams = new HashSet<>();
        nbaTeams.add("Celtics");
        nbaTeams.add("Lakers");
        nbaTeams.add("Bulls");
        nbaTeams.add("Knicks");
        for (String nbaTeam : nbaTeams) {
            System.out.println(nbaTeam);
        }

        System.out.println();

        System.out.println("For-each loop over a Queue");
        Queue<String> peopleInLine = new LinkedList<>();
        peopleInLine.add("Jim");
        peopleInLine.add("Jack");
        peopleInLine.add("Alice");
        peopleInLine.add("Amber");
        for (String people : peopleInLine) {
            System.out.println(people);
        }
        System.out.println("Queue after the loop: " + peopleInLine);

        System.out.println();

        System.out.println("For-each loop over a Stack");
        Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        for (String element : stack) {
            System.out.println(element);
        }
        System.out.println("Stack after the loop: " + stack);

        System.out.println();

        System.out.println("Nested For Loop");
        for(int row=0; row<10; row++) {
            System.out.println("Row: " + row);
            for(int column=0; column<10; column++) {
                System.out.println("Column: " + column);
            }
        }
    }
}
