public class Cat extends Participant {


    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void Run() {
        System.out.println(getName() + " Run");
    }

    @Override
    public void Jump() {
        System.out.println(getName() + " Jump");
    }
}
