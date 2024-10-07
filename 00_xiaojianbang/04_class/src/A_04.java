public class A_04 {
    // 类只加载一次 下面的匿名对象第一次加载 虽然匿名对象销毁了
    // 但是类已经加载过了 count是所有对象共用的 下次再用的时候
    // 初始值就不是100了 而是200
    static int count = 100;
    public void count1() {
        count = 200;
        System.out.println("count1 = " + count);
    }
    public void count2() {
        System.out.println("count1 = " + count++);
    }

    public static void main(String[] args) {
        new A_04().count1();  // 匿名函数 只可以使用1次
        A_04 t2 = new A_04();
        t2.count2();
        t2.count2();
    }
}

