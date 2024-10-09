//给定一个整数N ，判断它是否为质数
//所谓“质数“，就是只能被1和它自己带除的数。
//例如
//2、3、5、7、11、13、17、19 ...
//2只能被1，2整除
//3只能被1，3整除
//5只能被1，5整除
//相反，6不是质数，因为6可以被1，2，3，6整除。
public class A_06 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        for(i = 2; i < n; i++) {
            if(n % i == 0) {
                System.out.println(n + "不是质数");
                return;
            }
        }
        System.out.println(n + "是质数");
    }
}
