package src.mini_test_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("Menu");
            System.out.println("1. Show your current Products:");
            System.out.println("2. Add new product:");
            System.out.println("3. Delete a product with it index:");
            System.out.println("4. Update an existed product:");
            System.out.println("5. Show the most expensive product:");
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    productManager.displayProducts();
                    break;
                case 2:
                    System.out.println("Enter name of product:");
                    String name = input.nextLine();
                    System.out.println("Enter price of product:");
                    double price = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter description of product:");
                    String description = input.nextLine();
                    productManager.addProduct(new Product(name, price, description));
                    break;
                case 3:
                    System.out.println("Enter the index of product that you want to delete :");
                    int index = input.nextInt();
                    productManager.deleteProduct(index);
                    break;
                case 4:
                    System.out.println("Enter index of product that you want to update: ");
                    int index1 = Integer.parseInt(input.nextLine());

                    System.out.println("Edit name");
                    String name1 = input.nextLine();

                    System.out.println("Edit price");
                    double price1 = Double.parseDouble(input.nextLine());

                    System.out.println("Edit description");
                    String description1 = input.nextLine();

                    productManager.updateNameOfProduct(index1, name1,price1,description1);
                    productManager.displayProductWithIndex(index1);
                    break;
                case 5:
                    productManager.maxPriceProduct();
                    break;
            }
        } while (true);
    }
}
