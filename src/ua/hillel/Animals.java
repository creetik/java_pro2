import java.util.Scanner;

public class Animals {
    int add_animals;

private String name;

    public Animals(String name) {
        this.name = name;
    add_animals++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void run (int runer){
    System.out.println( getName()+" пробіг "+ runer+" м");

}

public void swim(int runer){
    System.out.println(getName()+" проплив "+runer+" м");
}
}

