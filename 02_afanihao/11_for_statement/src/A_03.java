// 给定一个数N,  求 1 + 2 + 3 + ... + N 的和
public class A_03 {
    public static void main(String[] args) {
        int n = 3;
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }
}
