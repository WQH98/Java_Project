// 打印显示出1~1000以内的所有完全平方数。
// 例如 1, 4, 16, 25 ...
public class A_08 {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            for(int j = 1; j < i ; j++) {
                if(j * j == i) {
                    System.out.println(i);
                }
            }
        }
    }
}
