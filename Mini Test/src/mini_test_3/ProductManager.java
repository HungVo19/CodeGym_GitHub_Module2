package mini_test_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductManager {
    private static final String REGEX_NUMBER = "^[0-9]+$";
    private ArrayList<Product> products;

    public ProductManager() {
        this.products = readFromFile();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Scanner scanner, Category category) {

    }

    public boolean validateInput(String str) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public void displayAll() {
        System.out.printf("%-5s%-20s%-10s%-10s%-15s%s",
                "ID", "Name", "Price", "Quantity", "Total Price", "Category\n");
        if (products.isEmpty()) {
            System.out.println("The list EMPTY now!");
        } else {
            for (Product p : products) {
                System.out.printf("%-5s%-20s%-10s%-10s%-15s%s",
                        p.getId(), p.getName(), p.getPrice() + "$", p.getQuantity(), p.getTotalPrice() + "$",
                        p.getCategory() + "\n");
            }
        }
    }

    private void writeToFile() {
        try {
            FileOutputStream outputFile = new FileOutputStream("Mini OutputTableTest/src/mini_test_3/Products.txt");
            ObjectOutputStream oos = new ObjectOutputStream(outputFile);
            oos.writeObject(this.getProducts());
            oos.close();
            outputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;
    }

    private ArrayList<Product> readFromFile() {
        ArrayList<Product> productsList = new ArrayList<>();
        try {
            FileInputStream inputFile = new FileInputStream("Mini OutputTableTest/src/mini_test_3/Products.txt");
            if (inputFile.available() > 0) {
                ObjectInputStream ois = new ObjectInputStream(inputFile);
                productsList = (ArrayList<Product>) ois.readObject();
                ois.close();
                inputFile.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.print("");
        }
        return productsList;
    }

    private boolean checkIdExist(Long id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
