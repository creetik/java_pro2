public class Main {
    public static void main(String[] args) {
        Animal animals = new Dog("Bobik");
        Animal catt = new Cat("KISKIS");
        Dog dog = new Dog("Bobik2");
        Cat cat = new Cat("kiss");
        animals.run(300);
        animals.swim(9);
        dog.run(501);
        dog.swim(11);
        catt.swim(1);
        catt.run(300);
        cat.run(199);
        cat.swim(0);


    }
}