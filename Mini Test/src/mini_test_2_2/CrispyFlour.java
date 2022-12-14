package mini_test_2_2;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate,cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity * super.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "Crispy Flour {" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", manufacturingDate=" + super.getManufacturingDate() +
                ", cost=" + super.getCost() +
                ", quantity = " + this.quantity +
                '}';
    }
}
