public class Cat extends Animals {
    int max_run = 200;
    int max_swim = 0;
    int add_cat;
    public Cat(String name) {
        super(name);
        add_cat++;

    }
@Override
    public void run (int runer){
        if (runer<=max_run){
            System.out.println(getName()+" пробіг "+runer+" М");
        }
else {
            System.out.println(getName()+" не може пробігти більше ніж "+ max_run+" M");
        }
    }
@Override
    public void swim(int runer){
        if (runer>max_swim)
            System.out.println(getName()+" не вміє плавати");
}
}
