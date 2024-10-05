//在Eclipse里试一下，以下代码的输出是多少？
//  double a = 19 * 3.3 ;
//	System.out.println("a: " + a);
//为什么结果不是 62.7 ?
public class A_13 {
    public static void main(String[] args) {
        double a = 19 * 3.3;
        // 由于浮点数在计算机中存储时的精度问题造成结果为62.699999999999996
        System.out.println("a: " + a);
    }
}
