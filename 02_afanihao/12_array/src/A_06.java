//已经两个数组 src 和 dst，
//	double[] src = {4, 5.5, 6, 7.7};
//	double[] dst = new double[4];
//要求写代码把src的内容拷贝到dst里
public class A_06 {
    public static void main(String[] args) {
        double[] src = {4, 5.5, 6, 7.7};
        double[] dst =  new double[src.length];
        for(int i = 0; i < src.length; i++){
            dst[i] = src[i];
        }
        for(int i = 0; i < dst.length; i++) {
            System.out.print(dst[i] + " ");
        }
    }
}
