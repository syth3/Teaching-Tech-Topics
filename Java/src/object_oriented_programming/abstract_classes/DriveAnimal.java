package object_oriented_programming.abstract_classes;

public class DriveAnimal {
    public static void main(String[] args) {
        System.out.println("Making a Lion");
        Lion lion = new Lion("Larry");
        System.out.println("Lion's Name: " + lion.getName());
        lion.animalSound();
        lion.sleep();
        System.out.println(lion.toString());

        System.out.println();

        System.out.println("Making a Pig");
        Pig pig = new Pig("Pablo");
        System.out.println("Pig's Name: " + pig.getName());
        pig.animalSound();
        pig.sleep();
        System.out.println(pig.toString());
    }
}
