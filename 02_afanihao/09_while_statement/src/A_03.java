// 求100以内的奇数的平方和
// 即 1*1 + 3*3 + 5*5 + ... + 99*99 的和
public class A_03 {
    public static void main(String[] args) {
        int i = 1;
        int res = 0;
        while (i < 100) {
            res += i * i;
            i += 2;
        }
        System.out.println(res);
    }
}
