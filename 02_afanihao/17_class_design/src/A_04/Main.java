package A_04;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("Tom", 1001, "男", 11);
        Employee a1 = new Employee("Tom", 1001, "女", 11);
        System.out.println(a.get_annual_leave());
        System.out.println(a1.get_annual_leave());
    }
}
