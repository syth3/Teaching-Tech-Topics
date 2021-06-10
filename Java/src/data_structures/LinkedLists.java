package data_structures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        System.out.println("Create a LinkedList of strings and add data to it");
        LinkedList<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        System.out.println("letters: " + letters);

        System.out.println();

        System.out.println("Adding an element at a specified index");
        letters.addLast("Z");
        letters.addFirst("Y");
        letters.add(3, "X");
        System.out.println("letters: " + letters);

        System.out.println();

        System.out.println("Remove elements at a specified index");
        letters.remove(3);
        letters.removeFirst();
        letters.removeLast();
        System.out.println("letters: " + letters);

        System.out.println();

        System.out.println("Change element at specific index");
        letters.set(2, "W");
        System.out.println("letters: " + letters);

        System.out.println();

        System.out.println("Get a specific element from the list");
        System.out.println("letters.getFirst(): " + letters.getFirst());
        System.out.println("letters.getLast(): " + letters.getLast());
        System.out.println("letters.get(3): " + letters.get(3));
    }
}
