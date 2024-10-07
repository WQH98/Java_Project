// 给定一个数，判断它是否既能被3整除，又能被7整除。
public class A_02 {
    public static void main(String[] args) {
        int a = 21;
        if(a % 3 == 0 && a % 7 == 0) {
            System.out.println(a + "既能被3整除也能被7整除");
        } else if (a % 3 == 0) {
            System.out.println(a + "只能被3整除");
        } else if (a % 21 == 0) {
            System.out.println(a + "只能被7整除");
        } else {
            System.out.println(a + "不能被3和7整除");
        }
    }
}
