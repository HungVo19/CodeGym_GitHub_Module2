package mini_test_2_3;

public class FullTimeEmployee extends Employee implements Comparable<FullTimeEmployee> {
    private double bonus;
    private double fine;
    private double hardSalary;

    public FullTimeEmployee(String id, String name, int age, String tel, String email, double bonus, double fine, double hardSalary) {
        super(id, name, age, tel, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double netSalary () {
        return this.hardSalary + (this.bonus - this.fine);
    }

    @Override
    public String toString() {
        return " FullTimeEmployee { id = " + super.getId() +
                ", name = " + super.getName() +
                ", age = " + super.getName() +
                ", tel = " + super.getTel() +
                ", email = " + super.getEmail() +
                ", bonus = " + this.bonus +
                ", fine = " + this.fine +
                ", hard Salary =" + this.hardSalary +
                ", net Salary = " + netSalary() +
                " }";
    }

    @Override
    public int compareTo(FullTimeEmployee o) {
        if(this.getHardSalary() > o.getHardSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}
