// 求100以内的奇数的平方和
// 即 1*1 + 3*3 + 5*5 + ... + 99*99 的和
public class A_04 {
    public static void main(String[] args) {
        int res = 0;
        for(int i = 1; i < 100; i += 2) {
            res += i * i;
        }
        System.out.println(res);
    }
}
