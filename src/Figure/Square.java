package Figure;

public class Square implements Area {
    double side = 4.0; // довжина сторони квадрата

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double Area() {
        double area = side * side; // площа квадрата
        System.out.println("Площа квадрата: " + area);
        return area;
    }
}
