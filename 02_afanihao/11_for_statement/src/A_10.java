// 输出九九乘法表
public class A_10 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j <= i; j++) {
                int res = i * j;
                System.out.print(j + "*" + i + "=" + res + "\t");
            }
            System.out.println();
        }
    }
}
