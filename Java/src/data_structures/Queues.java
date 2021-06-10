package data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        System.out.println("Create a Queue with a LinkedList");
        Queue<String> peopleInLine = new LinkedList<>();
        peopleInLine.add("Jim");
        peopleInLine.add("Jack");
        peopleInLine.add("Alice");
        peopleInLine.add("Amber");
        System.out.println("peopleInLine: " + peopleInLine);

        System.out.println();

        System.out.println("View the head of the queue without removing it");
        System.out.println("peopleInLine.peek(): " + peopleInLine.peek());

        System.out.println();

        System.out.println("Removing elements");
        System.out.println("peopleInLine.remove(): " + peopleInLine.remove());
        System.out.println("peopleInLine: " + peopleInLine);
    }
}
