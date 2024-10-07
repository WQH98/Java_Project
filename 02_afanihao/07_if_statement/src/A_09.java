/*
* 给定三角形的三条边的长度。判断该三角形是否为直角三角形。

提示： 直角三角形的两条短边的平方和，等于斜边的平方。 （勾股定理)
int c = 4;
* */
public class A_09 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        // 求出各边的平方
        int aa = a * a;
        int bb = b * b;
        int cc = c * c;
        if(aa + bb == cc || aa + cc == bb || bb + cc == aa) {
            System.out.println("是直角三角形");
        } else {
            System.out.println("不是直角三角形");
        }
    }
}

