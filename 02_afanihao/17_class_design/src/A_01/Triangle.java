package A_01;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double get_perimeter() {
        return a + b + c;
    }
}
