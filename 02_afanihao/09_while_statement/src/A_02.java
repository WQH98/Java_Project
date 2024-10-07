// 给定一个数N,  求 1 + 2 + 3 + ... + N 的和
public class A_02 {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int res = 0;
        while(i <= n) {
            res += i;
            i++;
        }
        System.out.println(res);
    }
}
