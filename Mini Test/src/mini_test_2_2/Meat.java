package mini_test_2_2;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat(){}

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getCost() * this.weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat {" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", manufacturingDate=" + super.getManufacturingDate() +
                ", cost=" + super.getCost() +
                ", weight = " + this.weight +
                '}';
    }
}
