package A_04;

public class Line {
    private Point p1;
    private Point p2;

    // 默认构造方法
    public Line() {
        p1 = new Point();
        p2 = new Point();
    }

    // 传处两个点的坐标(x1, y1) 和 (x2, y2)
    public Line(double x1, double y1, double x2, double y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    // 传处两个点的坐标
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
