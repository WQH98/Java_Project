// 口算以下代码中的表达式的值。并在Eclipse中验证。
public class A_08 {
    public static void main(String[] args) {
        boolean result = true && false;
        System.out.println("result: " + result);

        result = false || false;
        System.out.println("result: " + result);

        result = false || (3 > 2);
        System.out.println("result: " + result);

        result = !true;
        System.out.println("result: " + result);

        result = !(3 > 2);
        System.out.println("result: " + result);

        boolean a = false;
        result = (3 > 2) && (!a);
        System.out.println("result: " + result);

        int b = 3;
        result =  !(b > 3 || b < 8);
        System.out.println("result: " + result);
    }
}
