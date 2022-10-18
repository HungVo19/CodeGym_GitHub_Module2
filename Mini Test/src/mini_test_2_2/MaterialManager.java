package mini_test_2_2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialManager implements Discount {

    private List <Material> material = new ArrayList<>();

    public MaterialManager() {
    }

    public MaterialManager(List<Material> material) {
        this.material = material;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
    }

    public void addMaterial(Scanner scanner){
        System.out.println("Enter material data");
        System.out.println("Enter id:");
        String id = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter manufacturing date:");
        LocalDate manufacturingDate = scanner.
        System.out.println("Crispy flour:");
        System.out.println("Enter type of material you want to add");
        System.out.println("Enter type of material you want to add");
    }

    @Override
    public void getRealMoney() {
        for (Material material : material) {
            Period period = Period.between(LocalDate.now(), material.getExpiryDate());
            if (material instanceof Meat) {
                if (period.getDays() <= 0){
                    System.out.println("Meat is expired!");
                }
                if (period.getDays() <= 5) {
                    double newAmount = material.getAmount() * 0.7;
                    System.out.println("The discount is 30% and the new price is " + newAmount);
                } else {
                    double newAmount = material.getAmount() * 0.9;
                    System.out.println("The discount is 10% and the new price is " + newAmount);
                }
            }
            else if (material instanceof CrispyFlour) {
                if(period.getMonths() <= 0){
                    System.out.println("Flour is expired!");
                }
                else if (period.getMonths() <= 2) {
                    double newAmount = material.getAmount() * 0.6;
                    System.out.println("The discount is 40% and the new price is " + newAmount);
                } else if (period.getMonths() <= 4) {
                    double newAmount = material.getAmount() * 0.8;
                    System.out.println("The discount is 20% and the new price is " + newAmount);
                } else {
                    double newAmount = material.getAmount() * 0.95;
                    System.out.println("The discount is 5% and the new price is " + newAmount);
                }
            }
        }
    }
}
