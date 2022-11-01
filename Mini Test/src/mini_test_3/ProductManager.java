package mini_test_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductManager {
    private final String REGEX = "[0-9]+";
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

    public void add(Scanner scanner) {

        Long id = inputId(scanner);

        String name = inputName(scanner);

        Double price = inputPrice(scanner);

        Integer quantity = inputQuantity(scanner);

        Integer choice = new Integer(-1);
        boolean checkChoiceInput = false;
        do {
            try {
                System.out.println("Enter category");
                System.out.println("1. Electronics");
                System.out.println("2. Computers");
                System.out.println("3. Smart Home");
                System.out.println("Enter your choice:");
                choice = Integer.parseInt(scanner.nextLine());
                checkChoiceInput = true;
            } catch (Exception e) {
                System.out.println("Wrong input type. Try again!");
            }

            if (choice < 0 || choice > 3) {
                System.out.println("Invalid choice. Try again!");
            } else {
                switch (choice) {
                    case 1:
                        Category electronics = new Category("electronics");
                        products.add(new Product(id, name, price, quantity, electronics));
                        break;
                    case 2:
                        Category computers = new Category("computers");
                        products.add(new Product(id, name, price, quantity, computers));

                        break;
                    case 3:
                        Category smartHome = new Category("smart home");
                        products.add(new Product(id, name, price, quantity, smartHome));
                        break;
                }
            }
        } while (!checkChoiceInput);
        System.out.println("New product is added successfully!");
        writeToFile();
    }

    public void updateById(Scanner scanner) {
        System.out.println("Enter Id:");
        String id = scanner.nextLine();
       if(!checkIdExist(Long.parseLong(id))) {
           System.out.println("Id " + id + " is not existed!");
       } else {
           String newId;
           do {
               System.out.println("Update Id:");
               newId = scanner.nextLine();
               Pattern pattern = Pattern.compile("\\s");
               Matcher matcher = pattern.matcher(newId);
               if (checkIdExist(Long.parseLong(newId))) {
                   System.out.println("Id is already existed!");
               } else if (matcher.matches()) {
                   System.out.println("Try input a valid id");
               }
           } while (checkIdExist(Long.parseLong(id)) );
       }

    }

    private static Integer inputQuantity(Scanner scanner) {
        boolean checkQuantityInput = false;
        Integer quantity = new Integer(0);
        do {
            try {
                System.out.println("Enter quantity: ");
                quantity =Integer.parseInt(scanner.nextLine());
                checkQuantityInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input type. Try again!");
            }
        } while (!checkQuantityInput);
        return quantity;
    }

    private static Double inputPrice(Scanner scanner) {
        boolean checkPriceInput = false;
        Double price = new Double(0);
        do {
            try {
                System.out.println("Enter price: ");
                price = Double.parseDouble(scanner.nextLine());
                checkPriceInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input type. Try again!");
            }
        } while (!checkPriceInput);
        return price;
    }

    private static String inputName(Scanner scanner) {
        String name;
        do {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty!");
            }
        }
        while (name.isEmpty());
        return name;
    }

    private Long inputId(Scanner scanner) {
        boolean checkIdInput = false;
        Long id = new Long(-1);
        do {
            try {
                System.out.println("Enter id");
                id = Long.parseLong(scanner.nextLine());
                if (checkIdExist(id)) {
                    System.out.println("Id " + id + " is already existed. Please Input new Id!");
                }
                checkIdInput = true;
            } catch (Exception e) {
                System.out.println("Wrong input type. Try again!");
            }
        } while (!checkIdInput || checkIdExist(id));
        return id;
    }

    public void display() {
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
            FileOutputStream outputFile = new FileOutputStream("Mini Test/src/mini_test_3/Products.txt");
            ObjectOutputStream oos = new ObjectOutputStream(outputFile);
            oos.writeObject(this.getProducts());
            oos.close();
            outputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Product> readFromFile() {
        ArrayList<Product> productsList = new ArrayList<>();
        try {
            FileInputStream inputFile = new FileInputStream("Mini Test/src/mini_test_3/Products.txt");
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
