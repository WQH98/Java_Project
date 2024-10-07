// 给定3个数 a, b , c ，判断它们是否相等
public class A_06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        if(a == b && a == c && b == c) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }
}
