package data_structures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        System.out.println("Create a stack and add elements to it");
        Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        System.out.println("stack: " + stack);

        System.out.println();

        System.out.println("Look at the top element of the stack without removing it");
        System.out.println("stack.peek(): " + stack.peek());

        System.out.println();

        System.out.println("Search for the position of an element in a stack (starting from 1)");
        System.out.println("stack.search(\"Element 2\"): " + stack.search("Element 2"));

        System.out.println();

        System.out.println("Removing elements from a stack");
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println("stack: " + stack);

        System.out.println();

        System.out.println("Check if the stack is empty");
        System.out.println("stack.empty(): " + stack.empty());
    }
}
