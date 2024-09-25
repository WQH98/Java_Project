
public class Main{
    public static void main(String[] args) {
        // 声明并且开辟空间
        // 在类外面赋值并且进行访问
        AA_class cat1 = new AA_class("小白", 1, "白色");
//        cat1.name = "小白";
//        cat1.age = 1;
//        cat1.color = "白色";

        AA_class cat2 = new AA_class("小黑", 2, "黑色");
//        cat2.name = "小黑";
//        cat2.age = 1;
//        cat2.color = "黑色";

        System.out.println(cat1.name);
        System.out.println(cat2.name);
    }
}
