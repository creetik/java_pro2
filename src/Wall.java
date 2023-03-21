public class Wall extends Obstacle {
    Participant participant;

    public Wall(Participant participant, int heigfWall, int lenghRacetrack, Participant participant1) {
        super(participant, heigfWall, lenghRacetrack);
        this.participant = participant1;
    }

    @Override
    public void overcome() {
        int getMaxJump = participant.getMaxJump();
        String getname = participant.getName();

        if (getMaxJump >= getHeigfWall()) {
            System.out.println(getname + " Перестрибув стіну і продовжує віктоину");
        } else {
            System.out.println(getname + " не престрибнув стіну і вибуває з вікторини");
        }
    }
}

