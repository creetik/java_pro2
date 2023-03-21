package Figure;

public class Circle implements Area {
    private double radius; // радіус кола

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        double area = Math.PI * radius * radius; // площа кола
        System.out.println("Площа кола: " + area);
        return area;
    }
}
