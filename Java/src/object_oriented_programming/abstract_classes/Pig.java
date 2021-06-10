package object_oriented_programming.abstract_classes;

public class Pig extends Animal{

    public Pig(String name) {
        this.name = name;
        this.sound = "oink";
    }

    @Override
    public void animalSound() {
        System.out.println(this.sound);
    }
}
