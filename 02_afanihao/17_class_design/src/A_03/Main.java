package A_03;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.num = 1;
        a.den = 3;
        Fraction b = new Fraction();
        b.num = 2;
        b.den = 5;
        Fraction c = a.mul(b);
        System.out.println(c.show_value());
    }
}
