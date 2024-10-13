package A_04;

import A_04.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("shaofa", "201701", new int[]{97, 88, 90});
        System.out.println("name: " + student.get_name() + ", id: " + student.get_id() + ", chinese: " + student.get_scores()[0] + ", math: " + student.get_scores()[1] + ", english: " + student.get_scores()[2]);
    }
}
