public class Circle {

    double radius = 0;

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

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.get_perimeter());
        System.out.println(circle.get_area());
    }
}
