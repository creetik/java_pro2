import java.util.Scanner;

public class Animal {
    private int AnimalCount;

    public int getAnimalCount() {
        return AnimalCount;
    }

    private String name;

    public Animal(String name) {
        this.name = name;
        AnimalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int runer) {
        System.out.println(getName() + " пробіг " + runer + " м");
    }

    public void swim(int runer) {
        System.out.println(getName() + " проплив " + runer + " м");
    }
}

