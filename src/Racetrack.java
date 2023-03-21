public class Racetrack extends Obstacle {
    Participant participant;

    public Racetrack(Participant participant, int heigfWall, int lenghRacetrack, Participant participant1) {
        super(participant, heigfWall, lenghRacetrack);
        this.participant = participant1;
    }

    @Override
    public void overcome() {
        int getMaxRun = participant.getMaxRun();
        String getname = participant.getName();

        if (getMaxRun >= getLenghRacetrack()) {
            System.out.println(getname + " пробіг доріжку і завершує вікторину ");
        } else {
            System.out.println(getname + " не пробіг доріжку і вибуває з вікторини ");
        }

    }
}



