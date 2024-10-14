package A_04;

public class Main {
    // 方式1：创建一个Line对象
    Line a1 = new Line();

    // 方式2：创建Line对象，同时指定 x1,y1,x2,y2
    // (0,0) 到 (12.0,30.0)
    Line a2 = new Line(0, 0, 12.0, 30.0);

    // 方式3:
    Point p1 = new Point(5,0);
    Point p2 = new Point(8,9);
    // 创建一个Line对象, 同时指定p1,p2
    Line a3 = new Line(p1, p2);
}
