public class Dog extends Animal {
    private int maxRun = 500;
    private int maxSwim = 10;
    private static int DogCount;

    public int getDogCount() {
        return DogCount;
    }

    public Dog(String name) {
        super(name);
        DogCount++;
    }

    @Override
    public void run(int runer) {
        if (runer <= maxRun) {
            System.out.println(getName() + "  пробіг " + runer + " М");
        } else {
            System.out.println(getName() + " не може пробігти більше ніж " + maxRun + " M");
        }
    }

    @Override
    public void swim(int runer) {
        if (runer <= maxSwim) {
            System.out.println(getName() + " Проплив " + runer + " М");
        } else
            System.out.println(getName() + " не може пропливти білше ніж " + maxSwim + " M");
    }
}


