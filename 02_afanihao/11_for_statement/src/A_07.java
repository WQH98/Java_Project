// 打印下面的图形。(倒三角)
// *****
// ****
// ***
// **
// *
public class A_07 {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--) {
            print_star(i);
        }
    }
    static void print_star(int num) {
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
