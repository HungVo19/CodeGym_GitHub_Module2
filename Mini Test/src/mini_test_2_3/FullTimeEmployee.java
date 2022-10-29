package mini_test_2_3;

import java.util.Collections;

public class FullTimeEmployee extends Employee implements Comparable<FullTimeEmployee> {
    private int bonus;
    private int fine;
    private int hardSalary;

    public FullTimeEmployee(String id, String name, int age, int tel, String email, int bonus, int fine, int hardSalary) {
        super(id, name, age, tel, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public int netSalary () {
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
        return this.getHardSalary()-o.getHardSalary();
    }
}
