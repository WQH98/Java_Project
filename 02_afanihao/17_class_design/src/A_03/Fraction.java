package A_03;

public class Fraction {
    public int num;  // 分子
    public int den;  // 分母

    public String show_value() {
        return num + "/" + den;
    }

    public Fraction mul(Fraction f) {
        Fraction res = new Fraction();
        res.num = this.num * f.num;
        res.den = this.den * f.den;
        return res;
    }
}
