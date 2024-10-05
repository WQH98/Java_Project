// 给定a,b,c的值，求它们的平均值
public class A_09 {
    public static void main(String[] args) {
        int a = 123;
        int b = 23;
        int c = 2;
        int d = 453;
        System.out.println("result: " + get_average(a, b, c, d));
    }

    static double get_average(int a, int b, int c, int d) {
        double res = 0, sum = 0;
        sum = a + b + c + d;
        res = sum / 4;
        return res;
    }
}
