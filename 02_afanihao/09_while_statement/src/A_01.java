// 打印所有1-20之间能被3带除的数。按从大到小的顺序。
// 如: 18 15 12
public class A_01 {
    public static void main(String[] args) {
        int i = 20;
        while(i > 0) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
