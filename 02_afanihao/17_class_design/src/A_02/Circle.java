package A_02;

public class Circle {
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double get_area()
    {
        return Math.PI * radius * radius;
    }

    public double get_circumference()
    {
        return 2 * Math.PI * radius;
    }
}
