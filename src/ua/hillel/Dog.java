public class Dog extends Animals{
     int max_run =500;
     int max_swim =10;
     int add_dog;
    public Dog(String name) {
        super(name);
add_dog++;
    }
    @Override
public void run (int runer){
        if (runer<=max_run) {
            System.out.println(getName() + "  пробіг " + runer + " М");
        }
else  {
            System.out.println(getName()+" не може пробігти більше ніж "+ max_run+" M");
        }

        }
@Override
public void swim(int runer){
        if (runer<=max_swim){
            System.out.println(getName()+" Проплив "+runer+" М");
        }
else
            System.out.println(getName()+" не може пропливти білше ніж "+max_swim+" M");
    }
}


