package A_02;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3, 4, 5);

        Point p = new Point(1, 2);
        Circle c3 = new Circle(p, 5);

        Circle c4 = new Circle(new Point(1, 2), 5);
    }
}
