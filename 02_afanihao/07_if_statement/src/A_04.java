// 给定一个数，如果它在 [10, 20] 之间 ，或者在 [50, 60] 之间，则显示 OK。 否则显示错误。
public class A_04 {
    public static void main(String[] args) {
        int a = 61;
        if((a >= 10 && a <= 20) || (a >= 50 && a <= 60)) {
            System.out.println("OK");
        } else {
            System.out.println("ERR");
        }
    }
}
