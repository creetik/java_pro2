package Figure;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Area[] areas = new Area[3];
        areas[0] = new Circle(5);
        areas[1] = new Triangle(3, 4, 5);
        areas[2] = new Square(3);
        for (Area area : areas) {
            sum += area.Area();
        }
        System.out.println("Сумарна площа всих фігур " + sum);
    }
}