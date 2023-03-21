public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        Obstacle[] obstacles = new Obstacle[3];
        participants[0] = new Cat("Myrk", 100, 5);
        participants[1] = new Human("Bob", 500, 15);
        participants[2] = new Robot("Bender", 1000, 25);
        obstacles[0] = new Obstacle(participants[0], 4, 99);
        obstacles[1] = new Obstacle(participants[1], 16, 200);
        obstacles[2] = new Obstacle(participants[2], 25, 1000);

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome();
            }
        }
    }

}