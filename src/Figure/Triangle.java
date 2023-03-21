package Figure;

public class Triangle implements Area {
    private double a; // довжина першой сторони
    private double b; // довжина друйго сторони
    private double c; // довжина третьой сторони

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Area() {
        double p = (a + b + c) / 2; // полупериметр
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // площа трикутника
        System.out.println("Площа трикутника: " + area);
        return area;
    }
}
