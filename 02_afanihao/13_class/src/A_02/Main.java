package A_02;

import A_02.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 1;
        triangle.b = 2;
        triangle.c = 3;
        System.out.println("三角形: " + triangle.a + ", " + triangle.b + ", " + triangle.c);
    }
}
