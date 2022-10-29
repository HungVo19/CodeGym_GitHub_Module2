package write_products_list_to_binary_file;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Scanner scanner) {
        System.out.println("Enter data below");
        boolean checkIdInput = false;
        int id = -1;
        do {
            try {
                System.out.println("Id:");
                id = Integer.parseInt(scanner.nextLine());
                checkIdInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Wrong input type. Try again!");
            }
        } while (!checkIdInput);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Brand:");
        String brand = scanner.nextLine();
        boolean checkPriceInput = false;
        double price = -1;
        do {
            try {
                System.out.println("Price:");
                price = Double.parseDouble(scanner.nextLine());
                checkPriceInput = true;
            } catch (Exception e) {
                System.out.println("Wrong input type. Try again!");
            }
        } while (!checkPriceInput);

        System.out.println("Description:");
        String description = scanner.nextLine();
        products.add(new Product(id, name, brand, price, description));
    }

    public void remove(Scanner scanner) {
        boolean checkIdInput = false;
        int id = -1;
        do {
            try {
                System.out.println("Enter id of product to remove");
                id = Integer.parseInt(scanner.nextLine());
                checkIdInput = true;
            } catch (Exception e) {
                System.out.println("Wrong input type. Try again!");
            }
        } while (!checkIdInput);
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        System.out.println((products.get(index)) + " is removed successfully");
        products.remove(index);
    }

    public void display() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
