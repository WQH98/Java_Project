//给定一个数组，
//int[] abc = {20, 90, 48, 92};
//请把第1个数和最后一个数对调
//即，对调之后数组的内容为： 92 90 48 20
public class A_04 {
    public static void main(String[] args) {
        int[] abc = {20, 90, 48, 92};
        int[] res = new int[abc.length];

        for(int i = 0; i < abc.length; i++) {
            res[i] = abc[abc.length - 1 - i];
        }
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
