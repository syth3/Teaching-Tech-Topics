package object_oriented_programming.abstract_classes;

public class Lion extends Animal{

    public Lion(String name) {
        this.name = name;
        this.sound = "RRROOOOAAARRRRRRR";
    }

    @Override
    public void animalSound() {
        System.out.println(this.sound);
    }


    @Override
    public String toString() {
        return "Lion{" +
                "name='" + this.name + '\'' +
                ", sound='" + this.sound + '\'' +
                '}';
    }
}
