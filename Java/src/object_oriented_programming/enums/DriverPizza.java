package object_oriented_programming.enums;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DriverPizza {
    public static void main(String[] args) {
        System.out.println("Creating a pizza");
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("Cheese");
        toppings.add("Pepperoni");
        Pizza pizza = new Pizza(toppings);
        pizza.setStatus(Pizza.pizzaStatus.ORDERED);
        System.out.println(pizza.toString());
    }
}
