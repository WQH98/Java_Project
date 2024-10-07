// 公司招聘前台，职位要求：限女性，20-30岁。
// 给定：
// boolean female = true;  // true表示女生，false表示男生
// int age = 31;  // 年龄
// 写出判断逻辑。当不符合条件时，请给出提示原因。
public class A_07 {
    public static void main(String[] args) {
        boolean female = false;
        int age = 31;
        if(female == true) {
            if(age >= 20 && age <= 30) {
                System.out.println("符合条件");
            } else {
                System.out.println("年龄条件不符合");
            }
        } else{
            System.out.println("性别条件不符合");
            if(age < 20 || age > 30) {
                System.out.println("年龄条件也不符合");
            }
        }
    }
}
