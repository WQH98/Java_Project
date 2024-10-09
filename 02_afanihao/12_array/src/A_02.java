//给定一个数组，
//int[] abc = {20, 90, 48, 92};
//请倒序输出每一个数。 即，输出 92 48 90 20
public class A_02 {
    public static void main(String[] args) {
        int[] abc = {20, 90, 48, 92};
        for(int i = abc.length-1; i >= 0; i--) {
            System.out.println(abc[i]);
        }
    }
}
