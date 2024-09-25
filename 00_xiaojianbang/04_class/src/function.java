/*
    Java是完全面向对象的
    方法就是定义在类中的具有特定功能的一段独立小程序
    提高代码的服用性
    将代码细节封装起来，调用的人只需要知道如何调用即可
    方法可以理解成是用来加工数据的 参数就是传入的原料 返回值就是加工后的结果
返回值：
    一个方法只能返回一个值 要返回多个可以使用数组
    返回值可以是任意类型 包括基本数据类型和引用类型
    返回值类型 必须和return的值类型一致或兼容
    当函数没有返回值 那么返回值类型用void表示 并且return语句在最后一行时 return语句可以忽略
参数：
    一个方法可以没有参数 也可以有多个参数 中间用逗号隔开
    参数类型可以为任意类型 包含书本类型或引用类型
    方法定义时的参数称为形势参数 简称形参 方法调用时的参数称为实际参数 简称实参
    实参和形参的类型要一致或兼容 个数、顺序必须一致
方法体：
    里面写完成功能的具体的语句 可以有输出语句、变量、运算符、分支语句、循环语句、方法调用等等
    但是不可以在方法内部定义方法
static:
    1、静态属性（类属性）与实例属性（对象属性）
    静态属性 只有一份 可以通过类名.属性名/对象.属性名 来赋值和访问
    实例属性：每个对象都有一份 只能通过对象.属性名来赋值和访问
    2、静态方法与实例方法（对象方法）
    静态方法中只能调用静态方法 不能访问实例方法
    实例方法中可以调用静态方法和实例方法 也可以访问静态属性和实例属性
*/
public class function {
    public static void main(String[] args) {
        dec_to_hex(100);
        dec_to_hex(1000);
        dec_to_hex(2000);

        test();
    }

    static void dec_to_hex(int a) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(a > 0) {
            int index = a % 16;
            char temp = chars[index];
            stringBuilder.append(temp);
            a /= 16;
        }
        System.out.println(stringBuilder.reverse().toString());
    }

    static void test() {
        System.out.println("test");
    }
}
