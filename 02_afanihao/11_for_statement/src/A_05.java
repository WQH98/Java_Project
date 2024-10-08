// 求1到100之间，所有能被3整除的数的立方和。
public class A_05 {
    public static void main(String[] args) {
        int res = 0;
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                res += i * i * i;
            }
        }
        System.out.println(res);
    }
}
