public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 周长
    public double get_perimeter() {
        double perimeter = 0;
        perimeter = Math.PI * radius * 2;
        return perimeter;
    }

    // 面积
    public double get_area() {
        double area = 0;
        area = Math.PI * radius * radius;
        return area;
    }
}
