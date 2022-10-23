package mini_test_2_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialManager implements Discount {

    private ArrayList<Material> material;

    public MaterialManager() {
        material = new ArrayList<>();
    }

    public MaterialManager(ArrayList<Material> material) {
        this.material = material;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<Material> material) {
        this.material = material;
    }

    public void addMaterial(int choice, Scanner scanner) {
        if (choice < 1 || choice > 2) {
            System.out.println("Invalid choice!");
        } else {
            System.out.println("Enter material data below");
            System.out.println("Enter id:");
            String id = scanner.nextLine();
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter manufacturing date (dd.MM.yyyy):");
            LocalDate manufacturingDate = convertStringToLocalDate(scanner);
            System.out.println("Enter cost:");
            int cost = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Enter weight of meat: ");
                double weight = Integer.parseInt(scanner.nextLine());
                material.add((Meat) new Meat(id, name, manufacturingDate, cost, weight));
            } else {
                System.out.println("Enter quantity of crispy flour:");
                int quantity = Integer.parseInt(scanner.nextLine());
                material.add((CrispyFlour) new CrispyFlour(id, name, manufacturingDate, cost, quantity));
            }
        }
    }


    public void removeAll() {
        material.removeAll(material);
    }

    public void removeById(Scanner scanner) {
        System.out.println("Enter id of material you want to delete");
        String id = scanner.nextLine();
        boolean flag = false;
        for (Material m : material) {
            if (m.getId().equals(id)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            material.removeIf(material -> material.getName().equals(id));
            System.out.println("Remove successfully!");
        } else {
            System.out.println(id + " Id is not found!");
        }
    }

    public void removeByName(Scanner scanner) {
        System.out.println("Enter name of material you want to delete");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Material m : material) {
            if (m.getName().equals(name)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            material.removeIf(material -> material.getName().equals(name));
            System.out.println("Remove successfully!");
        } else {
            System.out.println(name + " Name is not found!");
        }
    }

    public void removeByIndex(Scanner scanner) {
        System.out.println("Enter index of material you want to delete");

        System.out.println("Index from 0 to " + (material.size() - 1));
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index > material.size()) {
            System.out.println("Index out of bound!");
        } else {
            material.remove(index);
            System.out.println("Remove successfully!");
        }
    }


    public void remove(int choice, Scanner scanner) {
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice!");
        } else {
            if (choice == 1) {
                removeAll();
            } else if (choice == 2) {
                removeById(scanner);
            } else if (choice == 3) {
                removeByName(scanner);
            } else {
                removeByIndex(scanner);
            }
        }
    }


    public void update(int choice, Scanner scanner) {
        System.out.println("Enter index of material you want to update");
        System.out.println("Index from 0 to " + (material.size() - 1));
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println("Update id");
        String id = scanner.nextLine();
        material.get(index).setId(id);

        System.out.println("Update name");
        String name = scanner.nextLine();
        material.get(index).setName(name);

        System.out.println("Update manufacturing date");
        LocalDate manufacturingDate = convertStringToLocalDate(scanner);
        material.get(index).setManufacturingDate(manufacturingDate);

        System.out.println("Update cost");
        int cost = Integer.parseInt(scanner.nextLine());
        material.get(index).setCost(cost);

        if (material.get(index) instanceof Meat) {
            System.out.println("Update weight");
            int weight = Integer.parseInt(scanner.nextLine());
            ((Meat) material.get(index)).setWeight(weight);
        } else if (material.get(index) instanceof CrispyFlour) {
            System.out.println("Update quantity");
            int quantity = Integer.parseInt(scanner.nextLine());
            ((CrispyFlour) material.get(index)).setQuantity(quantity);
        }

    }

    public void display() {
        if (material.isEmpty()) {
            System.out.println("The list is EMPTY now!");
        } else {
            for (Material m : material) {
                if (m instanceof Meat) {
                    System.out.println((Meat) m);
                } else if (m instanceof CrispyFlour) {
                    System.out.println((CrispyFlour) m);
                }
            }
        }
    }

    @Override
    public void getRealMoney() {
        for (Material material : material) {
            Period period = Period.between(LocalDate.now(), material.getExpiryDate());
            if (material instanceof Meat) {
                discountMeat(material, period);
            } else if (material instanceof CrispyFlour) {
                discountCrispyFlour(material, period);
            }
        }
    }

    private static void discountCrispyFlour(Material material, Period period) {
        if (period.getMonths() <= 0) {
            System.out.println("Flour is expired!");
        } else {
            if (period.getMonths() <= 2) {
                double newAmount = material.getAmount() * 0.6;
                System.out.println(material.getName() + " Flour discounts 40% and the new price is " + newAmount);
            } else if (period.getMonths() <= 4) {
                double newAmount = material.getAmount() * 0.8;
                System.out.println(material.getName() + " Flour discounts 20% and the new price is " + newAmount);
            } else {
                double newAmount = material.getAmount() * 0.95;
                System.out.println(material.getName() + " Flour discounts 5% and the new price is " + newAmount);
            }
        }
    }

    private static void discountMeat(Material material, Period period) {
        if (period.getDays() <= 0) {
            System.out.println("Meat is expired!");
        } else {
            if (period.getDays() <= 5) {
                double newAmount = material.getAmount() * 0.7;
                System.out.println(material.getName() + " Meat discounts 30% and the new price is " + newAmount);
            } else {
                double newAmount = material.getAmount() * 0.9;
                System.out.println(material.getName() + " Meat discounts 10% and the new price is " + newAmount);
            }
        }
    }

    private static LocalDate convertStringToLocalDate(Scanner scanner) {
        String str = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(str, dtf);
    }
}
