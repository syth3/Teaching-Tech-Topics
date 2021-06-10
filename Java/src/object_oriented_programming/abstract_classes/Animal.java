package object_oriented_programming.abstract_classes;

public abstract class Animal {

    String name;
    String sound;

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
