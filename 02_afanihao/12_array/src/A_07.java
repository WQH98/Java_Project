//任意给定一个数组,
//	double[] src = {4, 5.5, 6, 7.7};
//写代码把 src 中的内容倒序存储。倒序后，src的内容变成: 7.7  6  5.5  4
public class A_07 {
    public static void main(String[] args) {
        double[] src = {4, 5.5, 6, 7.7};
        for(int i = 0; i < src.length/2; i++) {
            double temp = src[i];
            src[i] = src[src.length-1-i];
            src[src.length-1-i] = temp;
        }
        for(int i = 0; i < src.length; i++) {
            System.out.print(src[i] + " ");
        }
    }
}
