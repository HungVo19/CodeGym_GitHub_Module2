package write_products_list_to_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void writeToFile(String path, ArrayList<Product> products) {
        try {
            FileOutputStream output = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(output);
            oos.writeObject(products);
            oos.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> readFromFile(String path) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(input);
            products = (ArrayList<Product>) ois.readObject();
            ois.close();
            input.close();
        } catch (Exception e) {
            System.out.print("");
        }
        return products;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        ArrayList<Product> products = readFromFile("IO Binary and Serialization/src/write_products_list_to_binary_file/products.txt");
        if (!(products.isEmpty())) {
            pm.setProducts(products);
        }
//        System.out.println(products);

        do {
            System.out.println("Menu");
            System.out.println("1.Display all products");
            System.out.println("2.Add new product");
            System.out.println("3.Remove product by Id");
            System.out.println("4.Write to File ");
            System.out.println("5.Read from File ");
            System.out.println("0.Exit");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong input type. Try again!");
            }
            switch (choice) {
                case 1:
                    if (pm.getProducts().isEmpty()) {
                        System.out.println("The list is EMPTY now");
                    }
                    pm.display();
                    break;
                case 2:
                    pm.add(scanner);
                    break;
                case 3:
                    if (pm.getProducts().isEmpty()) {
                        System.out.println("The list is EMPTY now");
                    }
                    pm.remove(scanner);
                    break;
                case 4:
                    writeToFile("IO Binary and Serialization/src/write_products_list_to_binary_file/products.txt", pm.getProducts());
                    break;
                case 5:
                    ArrayList<Product> productsList = new ArrayList<>();
                    try {
                        productsList = readFromFile("IO Binary and Serialization/src/write_products_list_to_binary_file/products.txt");
                        for (Product p : productsList) {
                            System.out.println(p);
                        }
                    } catch (Exception e) {
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
