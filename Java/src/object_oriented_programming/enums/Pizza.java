package object_oriented_programming.enums;

import java.util.ArrayList;

public class Pizza {
    private ArrayList<String> toppings;
    private pizzaStatus status;
    public enum pizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public Pizza(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public pizzaStatus getStatus() {
        return status;
    }

    public void setStatus(pizzaStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", status=" + status +
                '}';
    }
}
