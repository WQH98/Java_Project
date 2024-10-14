package A_02;

public class Circle {
    private double x;
    private double y;
    private double radius;

    // 默认构造方法 初始化(0, 0)的圆
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // 创建时指定圆心和半径
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // 创建时指定圆心和半径
    public Circle(Point p, double radius) {
        this.x = p.x;
        this.y = p.y;
        this.radius = radius;
    }
}
