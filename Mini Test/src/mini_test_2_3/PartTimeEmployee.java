package mini_test_2_3;

public class PartTimeEmployee extends Employee {
    private double workHours;

    public PartTimeEmployee(String id, String name, int age, String tel, String email, double workHours) {
        super(id, name, age, tel, email);
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public double netWage() {
        return workHours * 10000;
    }

    @Override
    public String toString() {
        return " PartTimeEmployee { id = " + super.getId() +
                ", name = " + super.getName() +
                ", age = " + super.getName() +
                ", tel = " + super.getTel() +
                ", email = " + super.getEmail() +
                ", work hours = " + this.workHours +
                ", net wage = " + this.netWage() +
                " }";
    }
}
