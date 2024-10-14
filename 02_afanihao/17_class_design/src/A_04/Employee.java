package A_04;

public class Employee {
    private String name;
    private int id;
    private String gender;
    private int working_years;

    public Employee(String name, int id, String gender, int working_years)
    {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.working_years = working_years;
    }

    public int get_annual_leave() {
        int days = 0;

        if(this.working_years >= 20) {
            days = 15;
        }
        else if(this.working_years >= 10) {
            days = 10;
        }
        else {
            days = 5;
        }

        if(this.gender.equals("女")) {
            days++;
        }

        return days;
    }
}
