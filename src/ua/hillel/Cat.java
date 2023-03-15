public class  Cat extends Animal {
    private static int maxRun = 200;
    private static int maxSwim = 0;
    private static int CatCount;

    public static int getCatCount() {
        return CatCount;
    }


    public Cat(String name) {
        super(name);
        CatCount++;
    }

    @Override
    public void run(int runer) {
        if (runer <= maxRun) {
            System.out.println(getName() + " пробіг " + runer + " М");
        } else {
            System.out.println(getName() + " не може пробігти більше ніж " + maxRun + " M");
        }
    }

    @Override
    public void swim(int runer) {
        if (runer > maxSwim)
            System.out.println(getName() + " не вміє плавати");
    }
}
