// 打印从1到20所有能被4整除的数
public class A_01 {
    public static void main(String[] args) {
        int i = 1;
        for(i = 1; i <= 20; i++) {
            if(i % 4 == 0) {
                System.out.println(i + "可以被4整除");
            }
        }
    }
}
