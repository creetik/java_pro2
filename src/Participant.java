public abstract class Participant {
    private String name;
    private int MaxRun;
    private int MaxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        MaxRun = maxRun;
        MaxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return MaxRun;
    }

    public void setMaxRun(int maxRun) {
        MaxRun = maxRun;
    }

    public int getMaxJump() {
        return MaxJump;
    }

    public void setMaxJump(int maxJump) {
        MaxJump = maxJump;
    }

    abstract public void Run();


    abstract public void Jump();

}
