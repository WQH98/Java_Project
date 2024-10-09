// 给定一个数组，
// int[] abc = {20, 90, 48, 92};
// 输出其中6的倍数
public class A_03 {
    public static void main(String[] args) {
        int[] abc = {20, 90, 48, 92};
        for (int i = 0; i < abc.length; i++) {
            if(abc[i] % 6 == 0) {
                System.out.println(abc[i]);
            }
        }
    }
}
