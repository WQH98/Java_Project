//已知一个数组，将里面的负数变成正值。
//double[] arr = {90.0, -98.34, -10, 199};
//写代码把 arr 里面所有的负数改成正的。
public class A_05 {
    public static void main(String[] args) {
        double[] arr = {90.0, -98.34, -10, 199};
        double[] res = new double[arr.length];
        for(int i = 0; i < arr.length; i++) {
            res[i] = Math.abs(arr[i]);
        }
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
