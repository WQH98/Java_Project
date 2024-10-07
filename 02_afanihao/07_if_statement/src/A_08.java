// 给定一个年份，判断是否为闰年
// 判断规则：
// 1、非整百年：能被4整除的为闰年。（如2004年就是闰年,2100年不是闰年）
// 2、整百年：能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)
// 写好代码之后，用以下数字进行验证:
// 1999 不是闰年
// 2000 是
// 2002 不是闰年
// 2004 是
// 2100 不是闰年
public class A_08 {
    public static void main(String[] args) {
        int year = 2100;
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                System.out.println(year + "是闰年");
            } else{
                System.out.println(year + "不是闰年");
            }
        } else {
            if(year % 4 == 0) {
                System.out.println(year + "是闰年");
            } else{
                System.out.println(year + "不是闰年");
            }
        }
    }
}
