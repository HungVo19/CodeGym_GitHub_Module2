package practice_using_ArrayList_LinkedList;

import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagerUsingArrayList productManager = new ProductManagerUsingArrayList();

        do {
            System.out.println("Menu");
            System.out.println("1.Display all products");
            System.out.println("2.Add new product");
            System.out.println("3.Update product by Id");
            System.out.println("4.Remove product by Id");
            System.out.println("5.Search product by Name");
            System.out.println("6.Sort by Price");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (productManager.getProducts().isEmpty()) {
                        System.out.println("The List is Empty now!");
                    } else {
                        productManager.display();
                    }
                    break;
                case 2:
                    productManager.add(scanner);
                    break;
                case 3:
                    productManager.editById(scanner);
                    break;
                case 4:
                    productManager.removeByID(scanner);
                    break;
                case 5:
                    productManager.searchByName(scanner);
                    break;
                case 6:
                    productManager.sortByCost();
                    break;
            }
        }while (true);
    }
}
