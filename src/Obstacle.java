public class Obstacle implements over {
    private Participant participant;
    private int HeigfWall;
    private int LenghRacetrack;

    public Obstacle(Participant participant, int heigfWall, int lenghRacetrack) {
        this.participant = participant;
        HeigfWall = heigfWall;
        LenghRacetrack = lenghRacetrack;
    }

    public int getHeigfWall() {
        return HeigfWall;
    }

    public void setHeigfWall(int heigfWall) {
        HeigfWall = heigfWall;
    }

    public int getLenghRacetrack() {
        return LenghRacetrack;
    }

    public void setLenghRacetrack(int lenghRacetrack) {
        LenghRacetrack = lenghRacetrack;
    }


    @Override
    public void overcome() {
        boolean ok = false;
        int getMaxJump = participant.getMaxJump();
        int getMaxRun = participant.getMaxRun();
        String getname = participant.getName();
        if (getMaxJump >= getHeigfWall()) {
            System.out.println(getname + " Перестрибув стіну і продовжує віктоину");
        } else {
            System.out.println(getname + " не престрибнув стіну і вибуває з вікторини");
            ok = true;
        }
        if (ok == true) {
            System.out.println();
        } else if (getMaxRun >= getLenghRacetrack()) {
            System.out.println(getname + " пробіг доріжку і завершує вікторину ");
        } else {
            System.out.println(getname + " не пробіг доріжку і вибуває з вікторини ");
        }
    }
}
