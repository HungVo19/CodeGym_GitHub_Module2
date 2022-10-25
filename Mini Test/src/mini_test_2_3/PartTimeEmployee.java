package mini_test_2_3;

public class PartTimeEmployee extends Employee {
    private int workHours;

    public PartTimeEmployee(String id, String name, int age, int tel, String email, int workHours) {
        super(id, name, age, tel, email);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int netWage() {
        return workHours * 100000;
    }

    @Override
    public String toString() {
        return " PartTimeEmployee { id = " + super.getId() +
                ", name = " + super.getName() +
                ", age = " + super.getName() +
                ", tel = " + super.getTel() +
                ", email = " + super.getEmail() +
                ", work hours =" + this.workHours +
                ", net wage = ;" + netWage() +
                " }";
    }
}
