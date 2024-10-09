//以下有四个学生的信息，请用数组表示：
//姓名                             分数
//----------------------------------
//邵                                 97
//王                                 89
//张                                 94
//李                                 93
//定义两个数组 String[]  和 int[] ，并按行打印出来
public class A_08 {
    public static void main(String[] args) {
        String[] name = {"邵", "王", "张", "李"};
        int[] score = {97, 89, 94, 93};
        System.out.println("姓名                             分数");
        System.out.println("------------------------------------");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "                               " + score[i]);
        }

    }
}
