/*
*   给定学生的分数。
    90-100:  记为A
    80-90: 记为B
    70-80: 记为C
    60-70: 记为D
    <60: 记为E

    已知 int score = 89;  // 给定学生的分数，求他的评级。
* */
public class A_10 {
    public static void main(String[] args) {
        int score = 91;
        String result = "E";
        if(score >= 90) {
            result = "A";
        } else if(score >= 80) {
            result = "B";
        } else if(score >= 70) {
            result = "C";
        } else if(score >= 60) {
            result = "D";
        }
        System.out.println("该学生得分: " + score + ", 评级为: " + result);
    }
}
