// 打印所有1-20之间能被3带除的数。按从大到小的顺序。
public class A_02 {
    public static void main(String[] args) {
        for(int i = 20; i > 0; i--) {
            if(i % 3 == 0) {
                System.out.println(i + "可以被3整除");
            }
        }
    }
}
