package A_01;

class Student {
    public int id;
    public String name;
    public String cellphone;
}

public class Hello  {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.id = 20180001;
        stu.name = "邵发";
        stu.cellphone = "13810012345";

        // 打印学生信息
        // 对象不能直接打印
        // System.out.println(stu);
        System.out.println("学号: " + stu.id + ", 姓名: " + stu.name + ", 手机号: " + stu.cellphone);
    }
}
